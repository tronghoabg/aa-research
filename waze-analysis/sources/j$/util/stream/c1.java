package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class c1 implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public b1 f50348a;

    /* renamed from: b, reason: collision with root package name */
    public m2 f50349b;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void u(Object obj) {
        b1 b1Var = this.f50348a;
        if (b1Var == null) {
            b1Var = new b1();
            this.f50348a = b1Var;
        }
        b1Var.u(obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final m2 build() {
        m2 m2VarC = this.f50348a;
        if (m2VarC == null && this.f50349b == null) {
            return d4.E(k7.REFERENCE);
        }
        if (m2VarC != null) {
            this.f50348a = null;
            m2 m2Var = this.f50349b;
            if (m2Var != null) {
                m2VarC = d4.C(k7.REFERENCE, m2Var, m2VarC);
            }
            this.f50349b = m2VarC;
        }
        return this.f50349b;
    }
}
