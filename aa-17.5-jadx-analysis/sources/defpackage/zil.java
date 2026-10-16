package defpackage;

import j$.util.Optional;

/* loaded from: classes3.dex */
public final class zil implements ackr {
    private final acku a;

    public zil(acku ackuVar) {
        this.a = ackuVar;
    }

    @Override // defpackage.aezk, defpackage.aezj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zik a() {
        Optional optional = (Optional) ((acks) this.a).b;
        optional.getClass();
        Object obj = zik.a;
        if (optional.isPresent()) {
            obj = optional.get();
        }
        return (zik) obj;
    }
}
