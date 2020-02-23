package healthcaresystem.dao;

import java.util.HashMap;
import java.util.Map;

import healthcaresystem.bean.UserBean;

public class DaolayerImpl {
       static Map<String,UserBean> hm=new HashMap<String,UserBean>();
       public String doRegister(UserBean bean) {
    	   String r=null;
    	  hm=new HashMap<String,UserBean>();
    	  hm.put(bean.getUserid(),bean);
    	  r=bean.getUserid();
    	  if(hm.containsKey(r))
    	  {
    		  return r;
    	  }
    	return r;
       }
}
