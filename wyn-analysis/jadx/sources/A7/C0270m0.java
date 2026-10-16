package A7;

import java.lang.Thread;

/* renamed from: A7.m0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0270m0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final String f951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0264k0 f952b;

    public C0270m0(C0264k0 c0264k0, String str) {
        this.f952b = c0264k0;
        this.f951a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        this.f952b.zzj().f605f.d(this.f951a, th);
    }
}
