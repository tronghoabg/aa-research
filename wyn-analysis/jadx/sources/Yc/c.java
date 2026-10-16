package Yc;

import java.util.concurrent.CountDownLatch;
import uc.InterfaceC4280q;

/* loaded from: classes5.dex */
public final class c implements InterfaceC4280q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CountDownLatch f16751a;

    public c(CountDownLatch countDownLatch) {
        this.f16751a = countDownLatch;
    }

    @Override // uc.InterfaceC4280q
    public final void a(Object obj) {
        this.f16751a.countDown();
    }

    @Override // uc.InterfaceC4280q
    public final void b(String str, String str2, Object obj) {
        this.f16751a.countDown();
    }

    @Override // uc.InterfaceC4280q
    public final void c() {
        this.f16751a.countDown();
    }
}
