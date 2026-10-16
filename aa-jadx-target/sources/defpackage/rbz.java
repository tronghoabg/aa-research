package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rbz {
    private final boolean a;
    private android.util.SparseArray b;

    public rbz(boolean z) {
        this.a = z;
        if (z) {
            android.util.SparseArray sparseArray = new android.util.SparseArray(8);
            this.b = sparseArray;
            sparseArray.put(android.os.Process.myUid(), java.lang.Boolean.TRUE);
        }
    }

    public static java.lang.Object a(android.os.Looper looper, java.util.concurrent.Callable callable) {
        if (android.os.Looper.myLooper() == looper) {
            try {
                return callable.call();
            } catch (java.lang.IllegalStateException e) {
                throw e;
            } catch (java.lang.Exception e2) {
                throw new java.lang.RuntimeException(e2);
            }
        }
        defpackage.stq stqVar = new defpackage.stq(looper);
        defpackage.rbx rbxVar = new defpackage.rbx(callable);
        stqVar.post(rbxVar);
        try {
            rbxVar.a.await();
            java.lang.IllegalStateException illegalStateException = rbxVar.c;
            if (illegalStateException == null) {
                return rbxVar.b;
            }
            throw illegalStateException;
        } catch (java.lang.InterruptedException unused) {
            return null;
        }
    }

    public static java.lang.Object b(java.util.concurrent.Callable callable) {
        return a(android.os.Looper.getMainLooper(), callable);
    }

    public static java.lang.String c(android.content.Context context, int i) {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return "unknown";
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == i) {
                return runningAppProcessInfo.processName;
            }
        }
        return "unknown";
    }

    public static void d(byte[] bArr) throws android.os.RemoteException {
        if (bArr == null) {
            return;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (options.outHeight >= 0 && options.outHeight <= 256 && options.outWidth >= 0 && options.outWidth <= 256) {
            if (!"image/png".equals(options.outMimeType)) {
                throw new java.lang.IllegalArgumentException("Given image not a png");
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Image size invalid: " + options.outHeight + "x" + options.outWidth);
    }

    public static void e(android.os.Handler handler, java.lang.Runnable runnable) {
        if (handler.getLooper() == android.os.Looper.myLooper()) {
            runnable.run();
            return;
        }
        defpackage.rby rbyVar = new defpackage.rby(runnable);
        handler.post(rbyVar);
        rbyVar.a();
    }

    public static void f(android.os.Looper looper, java.lang.Runnable runnable) {
        new defpackage.stq(looper).post(runnable);
    }

    public static void g(android.os.Looper looper, java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() == looper) {
            runnable.run();
        } else {
            new defpackage.stq(looper).post(runnable);
        }
    }

    public static void h(java.lang.Runnable runnable) {
        new defpackage.stq(android.os.Looper.getMainLooper()).post(runnable);
    }

    public static void i(java.lang.Runnable runnable, long j) {
        new defpackage.stq(android.os.Looper.getMainLooper()).postDelayed(runnable, j);
    }

    public static void j(java.lang.Runnable runnable) {
        g(android.os.Looper.getMainLooper(), runnable);
    }

    public static void k(java.lang.Runnable runnable) {
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        if (android.os.Looper.myLooper() == mainLooper) {
            runnable.run();
            return;
        }
        defpackage.stq stqVar = new defpackage.stq(mainLooper);
        defpackage.rby rbyVar = new defpackage.rby(runnable);
        stqVar.post(rbyVar);
        rbyVar.a();
    }

    public static java.lang.Object m(java.util.concurrent.Callable callable, java.lang.Object obj) {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            try {
                return callable.call();
            } catch (java.lang.Exception e) {
                throw new java.lang.RuntimeException(e);
            }
        }
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(callable);
        h(futureTask);
        try {
            return futureTask.get(1000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException | java.util.concurrent.TimeoutException unused) {
            return obj;
        } catch (java.util.concurrent.ExecutionException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public final boolean l(android.content.Context context, int i) {
        java.lang.Boolean bool;
        boolean z = this.a;
        if (z && (bool = (java.lang.Boolean) this.b.get(i)) != null) {
            return bool.booleanValue();
        }
        java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        boolean z2 = false;
        if (packagesForUid != null) {
            for (java.lang.String str : packagesForUid) {
                if (defpackage.slj.a(context).b(str)) {
                    z2 = true;
                    break;
                }
            }
        }
        if (z) {
            if (this.b.size() == 8) {
                this.b.removeAt(new java.util.Random().nextInt(8));
            }
            this.b.put(i, java.lang.Boolean.valueOf(z2));
        }
        return z2;
    }
}
