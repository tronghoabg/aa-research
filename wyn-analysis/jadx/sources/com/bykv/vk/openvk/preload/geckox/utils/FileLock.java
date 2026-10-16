package com.bykv.vk.openvk.preload.geckox.utils;

import android.os.Process;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class FileLock {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f24484a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f24485b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24486c;

    static {
        System.loadLibrary("file_lock_pgl");
    }

    private FileLock(String str, int i5) {
        this.f24486c = str;
        this.f24485b = i5;
    }

    public static FileLock a(String str) {
        try {
            int iD = d(str);
            nLockFile(iD);
            return new FileLock(str, iD);
        } catch (Exception e7) {
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("lock failed, file:", str, ", pid:");
            sbW.append(Process.myPid());
            sbW.append(" caused by:");
            sbW.append(e7.getMessage());
            throw new RuntimeException(sbW.toString());
        }
    }

    public static FileLock b(String str) {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            return null;
        } catch (Exception e7) {
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("try lock failed, file:", str, " caused by:");
            sbW.append(e7.getMessage());
            throw new RuntimeException(sbW.toString());
        }
    }

    public static FileLock c(String str) throws Exception {
        try {
            int iD = d(str);
            if (nTryLock(iD)) {
                return new FileLock(str, iD);
            }
            new FileLock(str, iD).b();
            return null;
        } catch (Exception e7) {
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("try lock failed, file:", str, " caused by:");
            sbW.append(e7.getMessage());
            throw new RuntimeException(sbW.toString());
        }
    }

    private static int d(String str) throws Exception {
        Integer numValueOf;
        Map<String, Integer> map = f24484a;
        synchronized (map) {
            try {
                numValueOf = map.get(str);
                if (numValueOf == null) {
                    new File(str).getParentFile().mkdirs();
                    numValueOf = Integer.valueOf(nGetFD(str));
                    map.put(str, numValueOf);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return numValueOf.intValue();
    }

    private static native int nGetFD(String str) throws Exception;

    private static native void nLockFile(int i5) throws Exception;

    private static native void nLockFileSegment(int i5, int i10) throws Exception;

    private static native void nRelease(int i5) throws Exception;

    private static native boolean nTryLock(int i5) throws Exception;

    private static native void nUnlockFile(int i5) throws Exception;

    public static FileLock a(String str, int i5) {
        try {
            int iD = d(str);
            nLockFileSegment(iD, i5);
            return new FileLock(str, iD);
        } catch (Exception e7) {
            StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("lock segment failed, file:", str, " caused by:");
            sbW.append(e7.getMessage());
            throw new RuntimeException(sbW.toString());
        }
    }

    public final void b() {
        Integer numRemove;
        Map<String, Integer> map = f24484a;
        synchronized (map) {
            numRemove = map.remove(this.f24486c);
        }
        try {
            nRelease(numRemove.intValue());
        } catch (Exception e7) {
            throw new RuntimeException("release lock failed, file:" + this.f24486c + " caused by:" + e7.getMessage());
        }
    }

    public final void a() {
        try {
            nUnlockFile(this.f24485b);
        } catch (Exception unused) {
            throw new RuntimeException("release lock failed，path:" + this.f24486c);
        }
    }
}
