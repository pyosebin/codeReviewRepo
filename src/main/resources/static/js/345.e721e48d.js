"use strict";(self["webpackChunkvuetest"]=self["webpackChunkvuetest"]||[]).push([[345],{8345:function(e,s,n){n.r(s),n.d(s,{default:function(){return k}});var a=n(3396),t=n(9242),r=n(7139);const l={class:"signup"},u=(0,a._)("h2",null,"Please Sign Up",-1),p=(0,a._)("label",{for:"name"},"name: ",-1),o=(0,a._)("label",{for:"userId"},"id: ",-1),i=(0,a._)("label",{for:"password"},"password: ",-1),d=(0,a._)("label",{for:"passwordCheck"},"password check: ",-1),w=(0,a._)("button",{class:"w3-button w3-green w3-round",type:"submit"},"SignUp",-1),h={style:{"font-family":"나눔고딕"}};function c(e,s,n,c,_,m){return(0,a.wg)(),(0,a.iD)("div",l,[u,(0,a._)("form",{onSubmit:s[4]||(s[4]=(0,t.iM)(((...e)=>m.fnSignup&&m.fnSignup(...e)),["prevent"]))},[(0,a._)("p",null,[(0,a.Uk)("                  "),p,(0,a.wy)((0,a._)("input",{class:"w3-input",name:"name",placeholder:"Enter name","onUpdate:modelValue":s[0]||(s[0]=e=>_.name=e)},null,512),[[t.nr,_.name]])]),(0,a._)("p",null,[(0,a.Uk)("                        "),o,(0,a.wy)((0,a._)("input",{class:"w3-input",name:"uid",placeholder:"Enter ID","onUpdate:modelValue":s[1]||(s[1]=e=>_.user_id=e)},null,512),[[t.nr,_.user_id]])]),(0,a._)("p",null,[(0,a.Uk)("            "),i,(0,a.wy)((0,a._)("input",{name:"password",class:"w3-input",placeholder:"Enter password","onUpdate:modelValue":s[2]||(s[2]=e=>_.user_pw=e),type:"text"},null,512),[[t.nr,_.user_pw]])]),(0,a._)("p",null,[d,(0,a.wy)((0,a._)("input",{name:"passwordCheck",class:"w3-input",placeholder:"Re-enter password","onUpdate:modelValue":s[3]||(s[3]=e=>_.passwordCheck=e),type:"text"},null,512),[[t.nr,_.passwordCheck]])]),w,(0,a._)("p",h,(0,r.zw)(_.logMessage),1)],32)])}var _=n(4161),m={data(){return{name:"",user_id:"",user_pw:"",passwordCheck:"",logMessage:""}},methods:{fnSignup(){""!==this.user_id?""!==this.user_pw?this.user_pw===this.passwordCheck?_.Z.get("/signup",{params:{username:this.name,userId:this.user_id,password:this.user_pw}}).then((e=>{console.log(e.data),alert("회원가입이 완료되었습니다."),this.logMessage=`${this.name} 님이 가입되었습니다.`,this.initForm()})).catch((e=>{console.log(e.response)})):alert("비밀번호가 일치하지 않습니다."):alert("비밀번호를 입력하세요."):alert("ID를 입력하세요.")}},initForm(){this.name="",this.user_id="",this.user_pw="",this.passwordCheck=""}},g=n(89);const f=(0,g.Z)(m,[["render",c]]);var k=f}}]);
//# sourceMappingURL=345.e721e48d.js.map