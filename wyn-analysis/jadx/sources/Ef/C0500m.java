package Ef;

import ef.C2515C;

/* renamed from: Ef.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C0500m implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3749a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3750b;

    public /* synthetic */ C0500m(Object obj, int i5) {
        this.f3749a = i5;
        this.f3750b = obj;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj;
        switch (this.f3749a) {
            case 0:
                ((tf.l) this.f3750b).invoke(th);
                break;
            default:
                ((Nf.i) this.f3750b).d();
                break;
        }
        return C2515C.f34653a;
    }
}
