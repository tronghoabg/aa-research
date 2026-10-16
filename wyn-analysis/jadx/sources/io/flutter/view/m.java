package io.flutter.view;

import android.os.Build;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Method f37303a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f37304b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f37305c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f37306d;

    /* renamed from: e, reason: collision with root package name */
    public final Field f37307e;

    /* renamed from: f, reason: collision with root package name */
    public final Method f37308f;

    /* JADX WARN: Multi-variable type inference failed */
    public m() throws NoSuchFieldException, NoSuchMethodException, SecurityException {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Field field;
        Method method5;
        Method method6 = null;
        try {
            method = AccessibilityNodeInfo.class.getMethod("getSourceNodeId", new Class[0]);
        } catch (NoSuchMethodException unused) {
            Log.w("AccessibilityBridge", "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection");
            method = null;
        }
        try {
            method2 = AccessibilityRecord.class.getMethod("getSourceNodeId", new Class[0]);
        } catch (NoSuchMethodException unused2) {
            Log.w("AccessibilityBridge", "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection");
            method2 = null;
        }
        int i5 = Build.VERSION.SDK_INT;
        Class<?> cls = Integer.TYPE;
        if (i5 <= 26) {
            try {
                method5 = AccessibilityNodeInfo.class.getMethod("getParentNodeId", new Class[0]);
            } catch (NoSuchMethodException unused3) {
                Log.w("AccessibilityBridge", "can't invoke getParentNodeId with reflection");
                method5 = null;
            }
            try {
                method3 = AccessibilityNodeInfo.class.getMethod("getChildId", cls);
                method4 = null;
            } catch (NoSuchMethodException unused4) {
                Log.w("AccessibilityBridge", "can't invoke getChildId with reflection");
                method3 = null;
                method4 = null;
            }
            field = method4;
            method6 = method5;
        } else {
            try {
                Field declaredField = AccessibilityNodeInfo.class.getDeclaredField("mChildNodeIds");
                declaredField.setAccessible(true);
                method4 = Class.forName("android.util.LongArray").getMethod("get", cls);
                method3 = null;
                field = declaredField;
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException unused5) {
                Log.w("AccessibilityBridge", "can't access childNodeIdsField with reflection");
                method3 = null;
                method4 = null;
                field = 0;
            }
        }
        this.f37303a = method;
        this.f37304b = method6;
        this.f37305c = method2;
        this.f37306d = method3;
        this.f37307e = field;
        this.f37308f = method4;
    }

    public static Long a(m mVar, AccessibilityRecord accessibilityRecord) {
        Method method = mVar.f37305c;
        if (method == null) {
            return null;
        }
        try {
            return (Long) method.invoke(accessibilityRecord, new Object[0]);
        } catch (IllegalAccessException e7) {
            Log.w("AccessibilityBridge", "Failed to access the getRecordSourceNodeId method.", e7);
            return null;
        } catch (InvocationTargetException e10) {
            Log.w("AccessibilityBridge", "The getRecordSourceNodeId method threw an exception when invoked.", e10);
            return null;
        }
    }

    public static boolean b(int i5, long j8) {
        return (j8 & (1 << i5)) != 0;
    }
}
