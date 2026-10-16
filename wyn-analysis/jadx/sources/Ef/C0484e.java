package Ef;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import lf.AbstractC3464c;

/* renamed from: Ef.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0484e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3725b = AtomicIntegerFieldUpdater.newUpdater(C0484e.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final K[] f3726a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C0484e(K[] kArr) {
        this.f3726a = kArr;
        this.notCompletedCount$volatile = kArr.length;
    }

    public final Object a(AbstractC3464c abstractC3464c) {
        C0502n c0502n = new C0502n(1, A6.h.A(abstractC3464c));
        c0502n.t();
        K[] kArr = this.f3726a;
        int length = kArr.length;
        C0480c[] c0480cArr = new C0480c[length];
        for (int i5 = 0; i5 < length; i5++) {
            K k = kArr[i5];
            k.start();
            C0480c c0480c = new C0480c(this, c0502n);
            c0480c.f3718f = H.x(k, true, c0480c);
            c0480cArr[i5] = c0480c;
        }
        C0482d c0482d = new C0482d(c0480cArr);
        for (int i10 = 0; i10 < length; i10++) {
            C0480c c0480c2 = c0480cArr[i10];
            c0480c2.getClass();
            C0480c.f3716h.set(c0480c2, c0482d);
        }
        if (C0502n.f3752g.get(c0502n) instanceof F0) {
            c0502n.w(c0482d);
        } else {
            c0482d.b();
        }
        Object objS = c0502n.s();
        kf.a aVar = kf.a.f39711a;
        return objS;
    }
}
