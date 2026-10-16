package io.ktor.utils.io;

import ef.C2515C;

/* loaded from: classes5.dex */
public final /* synthetic */ class K implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37356a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2880m f37357b;

    public /* synthetic */ K(C2880m c2880m, int i5) {
        this.f37356a = i5;
        this.f37357b = c2880m;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        switch (this.f37356a) {
            case 0:
                if (th != null) {
                    C2880m c2880m = this.f37357b;
                    if (c2880m._closedCause == null) {
                        c2880m.a(th);
                    }
                }
                break;
            default:
                if (th != null) {
                    C2880m c2880m2 = this.f37357b;
                    if (!c2880m2.h()) {
                        c2880m2.a(th);
                    }
                }
                break;
        }
        return C2515C.f34653a;
    }
}
