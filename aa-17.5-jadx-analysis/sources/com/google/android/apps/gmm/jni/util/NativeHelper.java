package com.google.android.apps.gmm.jni.util;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.apps.gmm.jni.util.NativeHelper;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.a;
import defpackage.oyx;
import defpackage.pfp;
import defpackage.pim;
import defpackage.vaq;
import defpackage.vky;
import defpackage.vps;
import defpackage.woy;
import defpackage.xuv;
import defpackage.xuw;
import defpackage.xwx;
import defpackage.ynz;
import defpackage.yob;
import defpackage.ypd;
import defpackage.zfb;
import defpackage.zfq;
import defpackage.zgp;
import defpackage.zgq;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;

/* loaded from: classes2.dex */
public final class NativeHelper {
    private static final String TAG = "NativeHelper";
    private static volatile boolean logNativeLibraryLoading;
    private static volatile boolean safeNativeLibraryLoading;
    private static final yob logger = yob.c("com/google/android/apps/gmm/jni/util/NativeHelper");
    private static final AtomicReference<zgp<Void>> holder = new AtomicReference<>();
    private static boolean allowPriorityInheritance = false;

    private NativeHelper() {
    }

    public static void allowPriorityInheritance(boolean z) {
        AtomicReference<zgp<Void>> atomicReference = holder;
        synchronized (atomicReference) {
            woy.Z(atomicReference.get() == null);
            allowPriorityInheritance = z;
        }
    }

    public static void awaitLibraryReady(zgp<Void> zgpVar) {
        if (logNativeLibraryLoading && !zgpVar.isDone() && a.Z()) {
            runWithNativeLibraryLogging(new pfp(zgpVar, 11));
        } else {
            waitForLibraryToLoad(zgpVar);
        }
    }

    @Deprecated
    public static void ensureLibraryLoaded() {
        awaitLibraryReady(getLibraryLoadedFuture(null));
    }

    public static zgp<Void> getLibraryLoadedFuture(final BooleanSupplier booleanSupplier) {
        zgq zgqVar;
        AtomicReference<zgp<Void>> atomicReference = holder;
        zgp<Void> zgpVar = atomicReference.get();
        if (zgpVar == null) {
            synchronized (atomicReference) {
                zgpVar = atomicReference.get();
                if (zgpVar == null) {
                    zgqVar = new zgq(new oyx(2));
                    atomicReference.set(zgqVar);
                    zgpVar = zgqVar;
                } else {
                    zgqVar = null;
                }
            }
            if (zgqVar != null) {
                if (logNativeLibraryLoading && a.Z()) {
                    runWithNativeLibraryLogging(zgqVar);
                } else {
                    zgqVar.run();
                }
            }
        }
        return booleanSupplier != null ? zfb.f(zgpVar, new xwx() { // from class: pil
            @Override // defpackage.xwx
            public final Object a(Object obj) {
                NativeHelper.lambda$getLibraryLoadedFuture$0(booleanSupplier, (Void) obj);
                return null;
            }
        }, zfq.a) : zgpVar;
    }

    public static /* synthetic */ Void lambda$getLibraryLoadedFuture$0(BooleanSupplier booleanSupplier, Void r1) {
        if (booleanSupplier.getAsBoolean()) {
            return null;
        }
        throw new IllegalStateException("Failed to initialize native code");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void loadLibrary() {
        vaq.d();
        vaq.d();
        yob yobVar = logger;
        ((ynz) ((ynz) yobVar.h()).ai(6731)).y("Loading native library 'gmm-jni' on thread %s", Thread.currentThread().getName());
        System.loadLibrary("gmm-jni");
        vaq.d();
        nativeInitClass();
        nativeRegisterExceptionClass(pim.class);
        ((ynz) ((ynz) yobVar.f()).ai(6730)).u("JNI initialized.");
    }

    @ResultIgnorabilityUnspecified
    private static native boolean nativeInitClass();

    static native void nativeRegisterExceptionClass(Class<? extends Throwable> cls);

    private static void onNotInitialized(Object obj) {
        throw new NullPointerException("Tried to call native code on object of type " + String.valueOf(obj.getClass()) + ", whose native object has not been initialized or was already finalized.");
    }

    private static void onRegistrationError(Class<?> cls) {
        throw new NoSuchMethodError(a.bV(cls, "Error registering native methods for class ", ". Check the logcat output for errors from dalvikvm."));
    }

    private static void runWithNativeLibraryLogging(Runnable runnable) {
        vky vkyVar = new vky("NativeHelper.blockedOnMainThread");
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        xuv xuvVarA = xuw.a(vkyVar);
        try {
            runnable.run();
            xuvVarA.close();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            if (Log.isLoggable(TAG, 4)) {
                Log.i(TAG, String.format("%s for %s ms.", vkyVar, Long.valueOf(jElapsedRealtime2)), new Throwable());
            }
            ((ynz) ((ynz) ((ynz) ((ynz) logger.g()).aa()).q(ypd.FULL)).ai((char) 6732)).y("NativeHelperBlocked on main thread for %s ms.", new vps(jElapsedRealtime2));
        } catch (Throwable th) {
            try {
                xuvVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void setNativeLibraryLoadingLogging(boolean z) {
        logNativeLibraryLoading = z;
    }

    public static void setSafeNativeLibraryLoading(boolean z) {
        safeNativeLibraryLoading = z;
    }

    public static void waitForLibraryToLoad(zgp<Void> zgpVar) {
        try {
            a.L(zgpVar);
        } catch (ExecutionException e) {
            throw new RuntimeException("Exception loading native code!", e);
        }
    }

    public <T> zgp<T> transformLibraryLoadedFuture(xwx<Void, ? extends T> xwxVar) {
        return zfb.f(getLibraryLoadedFuture(null), xwxVar, zfq.a);
    }
}
