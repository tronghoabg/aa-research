package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f24419a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private FileLock f24420b;

    /* renamed from: c, reason: collision with root package name */
    private String f24421c;

    private a(String str, FileLock fileLock) {
        this.f24421c = str;
        this.f24420b = fileLock;
    }

    public static a a(String str) throws Exception {
        Map<String, Lock> map = f24419a;
        synchronized (map) {
            try {
                Lock reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                if (!reentrantLock.tryLock()) {
                    return null;
                }
                try {
                    FileLock fileLockC = FileLock.c(str);
                    if (fileLockC == null) {
                        reentrantLock.unlock();
                        return null;
                    }
                    return new a(str, fileLockC);
                } catch (Exception e7) {
                    reentrantLock.lock();
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException(e7));
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        Map<String, Lock> map = f24419a;
        synchronized (map) {
            try {
                try {
                    this.f24420b.a();
                    this.f24420b.b();
                    map.get(this.f24421c).unlock();
                } catch (Throwable th) {
                    f24419a.get(this.f24421c).unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
