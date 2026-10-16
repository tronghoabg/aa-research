package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class cp {

    /* renamed from: oa, reason: collision with root package name */
    private static Map<String, Method> f25096oa = new HashMap();
    public static final Class<?>[] uef;
    private static final HashMap<Class<?>, Class<?>> yo;

    static {
        HashMap<Class<?>, Class<?>> map = new HashMap<>();
        yo = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Void.TYPE, Void.class);
        uef = new Class[0];
    }

    public static int uef(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int uef(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
