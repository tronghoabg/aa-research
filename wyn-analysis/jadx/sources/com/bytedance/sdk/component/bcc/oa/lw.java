package com.bytedance.sdk.component.bcc.oa;

import com.qonversion.android.sdk.internal.Constants;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class lw implements ThreadFactory {
    public static volatile boolean yo;
    private final AtomicInteger moa = new AtomicInteger(1);

    /* renamed from: oa, reason: collision with root package name */
    protected final String f24954oa;
    protected final ThreadGroup uef;

    public lw(String str) {
        this.uef = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.f24954oa = uef(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (yo) {
            return null;
        }
        Thread threadUef = uef(this.uef, runnable, this.f24954oa + Constants.USER_ID_SEPARATOR + this.moa.getAndIncrement());
        if (threadUef.isDaemon()) {
            threadUef.setDaemon(false);
        }
        return threadUef;
    }

    public Thread uef(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    public static String uef(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
