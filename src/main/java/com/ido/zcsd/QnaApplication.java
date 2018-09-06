package com.ido.zcsd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RestController
@RequestMapping("index")
@Slf4j
public class QnaApplication {
	public static boolean toUpdateUserInfo;
	private static final String APPID = "wx3ec303ea6e333354";
	private static final String APP_SCRECT = "6683e6361e4fdb45d04c87569af6aa5e";

//	@Autowired  UserInfoService userService;
//
//	@PostMapping("onLogin")
//	public ResponseDTO login(@RequestBody LoginRequest req, HttpServletRequest httpRequest){
//		String url = "https://api.weixin.qq.com/sns/jscode2session?appid="+APPID+"&secret="+APP_SCRECT+"&js_code="+req.code+"&grant_type=authorization_code";
//		WechatLoginResult loginResult = null;
//		UserInfo userInfo = null;
//		Integer userId;
//		try {
//			//using the code to get the session_key from the wechat sever;
//			String resultFromWechat = HttpUtils.httpsGet(url);
//			Gson gson = new Gson();
//			loginResult = gson.fromJson(resultFromWechat, WechatLoginResult.class);
//			//error happen while get session key from wechat
//			if(loginResult.getErrcode()!=null){
//				return ResponseDTO.falied(loginResult.getErrmsg(), -1);
//			}
//			//get the openid and check if already exist
//			//if no , promote the user to sign up first
//			userId  = userService.getIdByOpenId(loginResult.getOpenid());
//			if(userId == null){
//				log.info("user {} first time login , sign up first");
//				req.getUserInfo().setOpenID(loginResult.getOpenid());
//				userInfo = userService.signUp(req);
//				userId = userInfo.getId();
//			}
//
//			//if yes, login and store the user information to the session for later connection
////			HttpSession session = httpRequest.getSession();
////			session.setAttribute("openId", userInfo.getOpenID());
//
//		} catch (IOException e) {
//			throw new RuntimeException(e.getMessage(),e);
//		}
//		return ResponseDTO.succss(ResultMap.resultMap()
//				.put("id",userId)
//				.build()
//		);
//	}

	public static void main(String[] args) {
		SpringApplication.run(QnaApplication.class, args);
	}

//	@Data
//	@NoArgsConstructor
//	@AllArgsConstructor
//	public static class LoginRequest{
//		private String code;
//		private UserInfo userInfo;
//	}



}
