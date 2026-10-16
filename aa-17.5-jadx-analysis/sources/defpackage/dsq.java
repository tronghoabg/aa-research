package defpackage;

import android.app.AppOpsManager;
import android.app.Notification;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class dsq {
    static boolean a(Notification.Action action) {
        return action.isAuthenticationRequired();
    }

    public static int b(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    public static Object c(ExecutorService executorService, Callable callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    public static fbs d(vw vwVar, SQLiteDatabase sQLiteDatabase) {
        vwVar.getClass();
        Object obj = vwVar.a;
        if (obj != null) {
            fbs fbsVar = (fbs) obj;
            if (affa.f(fbsVar.e, sQLiteDatabase)) {
                return fbsVar;
            }
        }
        fbs fbsVar2 = new fbs(sQLiteDatabase);
        vwVar.a = fbsVar2;
        return fbsVar2;
    }

    public static Method e() {
        return (Method) fbs.d.a();
    }

    public static Method f() {
        return (Method) fbs.c.a();
    }

    public static fbn g(Context context, String str, fbm fbmVar, boolean z, boolean z2) {
        if (z && (str == null || str.length() == 0)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new fbn(context, str, fbmVar, z, z2);
    }
}
