package B7;

import A7.RunnableC0278p;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d7.f;
import d7.g;
import d7.h;
import d7.i;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;
import r7.C3931a;
import r7.C3934d;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final f f1594a = f.f34129b;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1595b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static C3934d f1596c = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f1597d = "0";

    public static Task a(Context context) {
        C3934d c3934d;
        AbstractC1732v.j(context, "Context must not be null");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (f1595b) {
            c3934d = f1596c;
        }
        if (c3934d != null) {
            taskCompletionSource.setResult(null);
            return taskCompletionSource.getTask();
        }
        new Thread(new RunnableC0278p(context, false, taskCompletionSource, 13)).start();
        return taskCompletionSource.getTask();
    }

    public static boolean b() {
        C3934d c3934d;
        synchronized (f1595b) {
            c3934d = f1596c;
        }
        return c3934d != null;
    }

    public static void c(Context context) {
        synchronized (f1595b) {
            try {
                if (b()) {
                    return;
                }
                AbstractC1732v.j(context, "Context must not be null");
                ClassLoader classLoader = a.class.getClassLoader();
                AbstractC1732v.i(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    int apiLevel = ApiVersion.getApiLevel();
                    f fVar = f1594a;
                    fVar.getClass();
                    i.a(context, 11925000);
                    try {
                        C3934d c3934dC = C3934d.c(context, C3934d.f44523b, "com.google.android.gms.cronet_dynamite");
                        try {
                            Class<?> clsLoadClass = c3934dC.f44536a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                            if (clsLoadClass.getClassLoader() == a.class.getClassLoader()) {
                                Log.e("a", "ImplVersion class is missing from Cronet module.");
                                throw new g();
                            }
                            Method method = clsLoadClass.getMethod("getApiLevel", new Class[0]);
                            Method method2 = clsLoadClass.getMethod("getCronetVersion", new Class[0]);
                            Integer num = (Integer) method.invoke(null, new Object[0]);
                            AbstractC1732v.i(num);
                            int iIntValue = num.intValue();
                            String str = (String) method2.invoke(null, new Object[0]);
                            AbstractC1732v.i(str);
                            f1597d = str;
                            if (apiLevel <= iIntValue) {
                                f1596c = c3934dC;
                                return;
                            }
                            Intent intentB = fVar.b(context, 2, "cr");
                            if (intentB == null) {
                                Log.e("a", "Unable to fetch error resolution intent");
                                throw new g();
                            }
                            String str2 = f1597d;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 174);
                            sb2.append("Google Play Services update is required. The API Level of the client is ");
                            sb2.append(apiLevel);
                            sb2.append(". The API Level of the implementation is ");
                            sb2.append(iIntValue);
                            sb2.append(". The Cronet implementation version is ");
                            sb2.append(str2);
                            throw new h(2, intentB, sb2.toString());
                        } catch (Exception e7) {
                            Log.e("a", "Unable to read Cronet version from the Cronet module ", e7);
                            throw ((g) new g().initCause(e7));
                        }
                    } catch (C3931a e10) {
                        Log.e("a", "Unable to load Cronet module", e10);
                        throw ((g) new g().initCause(e10));
                    }
                } catch (ClassNotFoundException e11) {
                    Log.e("a", "Cronet API is not available. Have you included all required dependencies?");
                    throw ((g) new g().initCause(e11));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
