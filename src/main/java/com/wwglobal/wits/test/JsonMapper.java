package com.wwglobal.wits.test;
import java.lang.reflect.Field;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.wwglobal.wits.corews.vesseldischarge.VesselDischargeVinWSBean;

public class JsonMapper {
	private static final ObjectMapper mapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	
	
	public static void main(String[] args) throws JsonProcessingException {
		
		//checkNullObject(new ArrayList<RailReceiveResultWSBean>());
//		List arl = new ArrayList<RailReceiveResultWSBean>();
//		RailReceiveResultWSBean ob1 = new RailReceiveResultWSBean();
//		ob1.setCargoId("123");
//		arl.add(ob1);
//		RailReceiveResultWSBean ob2 = new RailReceiveResultWSBean();
//		ob1.setCargoId("145");
//		arl.add(ob2);
//		RailReceiveResultWSBean ob3 = new RailReceiveResultWSBean();
//		ob1.setCargoId("489");
//		arl.add(ob3);
		
		//
		//test(arl);
//		RailReceiveWSBean railReceiveWSBean=new RailReceiveWSBean();
//		railReceiveWSBean.setEditabledInfo(new VesselDischargeEditabledInfoWSBean());
//		//vesselDischargeWSBean.setHoldList(new ArrayList<VesselDischargeHoldWSBean>());
//		railReceiveWSBean.setSearchCriteria(new RailReceiveSearchCriteriaWSBean());
//		railReceiveWSBean.setRailReceiveList(new ArrayList<RailReceiveResultWSBean>());
		
//		VesselDischargeInputWSBean vesselDischargeInputWSBean = new VesselDischargeInputWSBean();
//		vesselDischargeInputWSBean.setResultList(new ArrayList<VesselDischargeResultWSBean>());
//		vesselDischargeInputWSBean.setVesselDischargeSearchFilter(new VesselDischargeSearchFilterWSBean());
//		
//		
		String jsonRequest = mapper.writeValueAsString(new VesselDischargeVinWSBean());
		System.out.println(jsonRequest);
		
		
		/*List<RailReceiveResultWSBean> list = new ArrayList<RailReceiveResultWSBean>();
		TypeResolver resolver = new TypeResolver();
		 // start with ResolvedType; need MemberResolver
		  ResolvedType classType = resolver.resolve(list.getClass());
		  MemberResolver mr = new MemberResolver(resolver);
		  ResolvedTypeWithMembers beanDesc = mr.resolve(classType, null, null);
		  ResolvedMethod[] members = beanDesc.getMemberMethods();
		  ResolvedType returnType = null;
		  for (ResolvedMethod m : members) {
		   // if ("getStuff".equals(m.getName())) {
		      returnType = m.getReturnType();
		   // }
		  }*/
		  
		  
		  // so, we should get
//		  assertSame(List.class, returnType.getErasedType());
//		  ResolvedType elemType = returnType.getTypeParameters().get(0);
//		  assertSame(String.class, elemType.getErasedType());
	}
	
	public static void test(Object object) throws JsonProcessingException {
		Class<?> clazz = object.getClass();
		Field[]  fields = 	clazz.getDeclaredFields();
		for(Field field : fields){
			
			
			if(field.getType().isPrimitive()){
				
			}else{
				
			}
		}
		String jsonRequest = mapper.writeValueAsString(object);
		System.out.println(jsonRequest);
		
	}
	/*
	
	public static void javaObjectToJsonString() throws JsonProcessingException{
		List<Object> result =  new ArrayList<Object>();
		Map<String,Object> map = new HashMap<String,Object>();
		result.add(map);
		String jsonRequest = mapper.writeValueAsString(new CommonWSBean());
		System.out.println(jsonRequest);

	}
	
	public static   <T extends Serializable> T checkNullObject(Object object){
		
		if(object==null){
			new Exception("Fucking null");
		}
		
		Class<?> clazz = object.getClass();
		
		System.out.println("Class name : "+clazz.getName());
		
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields){
			if(field.getModifiers()==PRIVATE){
				field.setAccessible(true);
			}
			
			Class<?> fieldType = field.getType();
			
			if(fieldType.isPrimitive()){
				continue;
			}
			
			if(fieldType.isArray()){
				System.out.println("TypeParameter : "+clazz.getTypeName());
			}
			System.out.println("TypeName : "+clazz.getTypeName());
			System.out.println("TypeParameter : "+clazz.getTypeParameters().getClass());
			System.out.println("GenericSuperclass : "+ fieldType.getGenericSuperclass());
			 if (field.getGenericType() instanceof ParameterizedType) {
				 System.out.println("GenericSuperclass : "+ field.getGenericType().getTypeName());
			 }
				System.out.println("Component Type : "+ fieldType.getComponentType());
			 
		}
		return null;
	}*/

}

