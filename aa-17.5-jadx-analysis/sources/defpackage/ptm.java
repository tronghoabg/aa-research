package defpackage;

import j$.util.Optional;

/* loaded from: classes2.dex */
public final class ptm implements ackr {
    private final acku a;
    private final acku b;

    public ptm(acku ackuVar, acku ackuVar2) {
        this.a = ackuVar;
        this.b = ackuVar2;
    }

    @Override // defpackage.aezk, defpackage.aezj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Optional a() {
        return !((uzl) this.a.a()).a.optBoolean("migrate_sessions_early_v2", false) ? Optional.empty() : Optional.of(((ptp) this.b).a());
    }
}
