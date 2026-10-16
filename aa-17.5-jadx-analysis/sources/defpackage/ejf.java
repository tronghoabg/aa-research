package defpackage;

import defpackage.ejf;
import defpackage.eji;

/* loaded from: classes.dex */
public final class ejf<MessageType extends eji<MessageType, BuilderType>, BuilderType extends ejf<MessageType, BuilderType>> extends eid<MessageType, BuilderType> implements ekf {
    public final eji a;
    public eji b;

    public ejf(eji ejiVar) {
        this.a = ejiVar;
        if (ejiVar.s()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = h();
    }

    private final eji h() {
        return this.a.l();
    }

    @Override // defpackage.eid
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ejf clone() {
        ejf ejfVarJ = this.a.m();
        ejfVarJ.b = e();
        return ejfVarJ;
    }

    public final eji d() {
        eji ejiVarE = e();
        if (eji.t(ejiVarE)) {
            return ejiVarE;
        }
        throw new ekx();
    }

    public final eji e() {
        boolean zS = this.b.s();
        eji ejiVar = this.b;
        if (!zS) {
            return ejiVar;
        }
        ejiVar.n();
        return this.b;
    }

    @Override // defpackage.ekf
    public final /* synthetic */ eke f() {
        throw null;
    }

    public final void g() {
        if (this.b.s()) {
            return;
        }
        eji ejiVarH = h();
        ekm.a.b(ejiVarH).e(ejiVarH, this.b);
        this.b = ejiVarH;
    }

    public ejf() {
        this(ehv.DEFAULT_INSTANCE);
    }
}
