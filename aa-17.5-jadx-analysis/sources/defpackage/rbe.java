package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.RemoteException;
import android.util.SparseArray;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class rbe {
    private final boolean a;
    private SparseArray b;

    public rbe(boolean z) {
        this.a = z;
        if (z) {
            SparseArray sparseArray = new SparseArray(8);
            this.b = sparseArray;
            sparseArray.put(Process.myUid(), true);
        }
    }

    public static Object a(Looper looper, Callable callable) throws InterruptedException {
        if (Looper.myLooper() == looper) {
            try {
                return callable.call();
            } catch (IllegalStateException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
        sss sssVar = new sss(looper);
        rbc rbcVar = new rbc(callable);
        sssVar.post(rbcVar);
        try {
            rbcVar.a.await();
            IllegalStateException illegalStateException = rbcVar.c;
            if (illegalStateException == null) {
                return rbcVar.b;
            }
            throw illegalStateException;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public static Object b(Callable callable) {
        return a(Looper.getMainLooper(), callable);
    }

    public static String c(Context context, int i) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return "unknown";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == i) {
                return runningAppProcessInfo.processName;
            }
        }
        return "unknown";
    }

    public static void d(byte[] bArr) throws RemoteException {
        if (bArr == null) {
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (options.outHeight >= 0 && options.outHeight <= 256 && options.outWidth >= 0 && options.outWidth <= 256) {
            if (!"image/png".equals(options.outMimeType)) {
                throw new IllegalArgumentException("Given image not a png");
            }
            return;
        }
        throw new IllegalArgumentException("Image size invalid: " + options.outHeight + "x" + options.outWidth);
    }

    public static void e(Handler handler, Runnable runnable) {
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        rbd rbdVar = new rbd(runnable);
        handler.post(rbdVar);
        rbdVar.a();
    }

    public static void f(Looper looper, Runnable runnable) {
        new sss(looper).post(runnable);
    }

    public static void g(Looper looper, Runnable runnable) {
        if (Looper.myLooper() == looper) {
            runnable.run();
        } else {
            new sss(looper).post(runnable);
        }
    }

    public static void h(Runnable runnable) {
        new sss(Looper.getMainLooper()).post(runnable);
    }

    public static void i(Runnable runnable, long j) {
        new sss(Looper.getMainLooper()).postDelayed(runnable, j);
    }

    public static void j(Runnable runnable) {
        g(Looper.getMainLooper(), runnable);
    }

    public static void k(Runnable runnable) {
        Looper mainLooper = Looper.getMainLooper();
        if (Looper.myLooper() == mainLooper) {
            runnable.run();
            return;
        }
        sss sssVar = new sss(mainLooper);
        rbd rbdVar = new rbd(runnable);
        sssVar.post(rbdVar);
        rbdVar.a();
    }

    public static Object m(Callable callable, Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        FutureTask futureTask = new FutureTask(callable);
        h(futureTask);
        try {
            return futureTask.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | TimeoutException unused) {
            return obj;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean l(Context context, int i) {
        Boolean bool;
        boolean z = this.a;
        if (z && (bool = (Boolean) this.b.get(i)) != null) {
            return bool.booleanValue();
        }
        String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        boolean z2 = false;
        if (packagesForUid != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= packagesForUid.length) {
                    break;
                }
                if (skn.a(context).b(packagesForUid[i2])) {
                    z2 = true;
                    break;
                }
                i2++;
            }
        }
        if (z) {
            if (this.b.size() == 8) {
                this.b.removeAt(new Random().nextInt(8));
            }
            this.b.put(i, Boolean.valueOf(z2));
        }
        return z2;
    }
}
