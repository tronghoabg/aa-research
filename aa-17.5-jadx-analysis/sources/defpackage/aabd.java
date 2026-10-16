package defpackage;

import j$.util.Optional;

/* loaded from: classes3.dex */
public final class aabd implements acku {
    private final acku a;
    private final /* synthetic */ int b;

    public aabd(acku ackuVar, int i) {
        this.b = i;
        this.a = ackuVar;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        return this.b != 0 ? b() : b();
    }

    public final Optional b() {
        int i = this.b;
        acku ackuVar = this.a;
        return i != 0 ? Optional.of(ackuVar.a()) : Optional.of(ackq.b(ackuVar));
    }
}
