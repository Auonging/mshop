//package com.skymall.utils;
//
//
//import com.skymall.domain.Admin;
//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.session.Session;
//import org.apache.shiro.subject.Subject;
//
///**
// * Shiro工具类
// */
//public class ShiroUtils {
//
//    public static Session getSession() {
//        return (Session) SecurityUtils.getSubject().getSession();
//    }
//
//    public static Subject getSubject() {
//        return SecurityUtils.getSubject();
//    }
//
//    public static Admin getUserEntity() {
//        return (Admin) SecurityUtils.getSubject().getPrincipal();
//    }
//
//    public static Long getUserId() {
//        return getUserEntity().getId();
//    }
//
//    public static void setSessionAttribute(Object key, Object value) {
//        getSession().setAttribute(key, value);
//    }
//
//    public static Object getSessionAttribute(Object key) {
//        return getSession().getAttribute(key);
//    }
//
//    public static boolean isLogin() {
//        return SecurityUtils.getSubject().getPrincipal() != null;
//    }
//
//    public static void logout() {
//        SecurityUtils.getSubject().logout();
//    }
//
//    public static String getKaptcha(String key) {
//        String kaptcha;
//        try {
//            kaptcha = getSessionAttribute(key).toString();
//            getSession().removeAttribute(key);
//        } catch (Exception e) {
//            return null;
//        }
//        return kaptcha;
//    }
//
//}
