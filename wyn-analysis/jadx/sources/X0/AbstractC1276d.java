package X0;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: X0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1276d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f15831a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f15832b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f15833c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f15834d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f15835e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f15836f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f15837g;

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Class<?> cls2 = Boolean.TYPE;
        f15837g = new Handler(Looper.getMainLooper());
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f15831a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f15832b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f15833c = declaredField2;
        Class cls3 = f15831a;
        if (cls3 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls3.getDeclaredMethod("performStopActivity", IBinder.class, cls2, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
        }
        f15834d = declaredMethod;
        Class cls4 = f15831a;
        if (cls4 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls2);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
            }
        }
        f15835e = declaredMethod2;
        Class cls5 = f15831a;
        int i5 = Build.VERSION.SDK_INT;
        if ((i5 == 26 || i5 == 27) && cls5 != null) {
            try {
                Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f15836f = method;
    }
}
