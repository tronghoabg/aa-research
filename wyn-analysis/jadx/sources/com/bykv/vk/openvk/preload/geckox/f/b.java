package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f24422a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static ReentrantLock f24423b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    private String f24424c;

    /* renamed from: d, reason: collision with root package name */
    private FileLock f24425d;

    private b(String str, FileLock fileLock) {
        this.f24424c = str;
        this.f24425d = fileLock;
    }

    public static b a(String str) throws Exception {
        f24423b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = f24422a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e7) {
            f24423b.unlock();
            throw e7;
        }
    }

    public final void a() {
        try {
            this.f24425d.a();
            this.f24425d.b();
            Lock lock = f24422a.get(this.f24424c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f24423b.unlock();
        }
    }
}
