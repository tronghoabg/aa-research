package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
final class ygn implements Serializable {
    private final yfq a;

    public ygn(yfq yfqVar) {
        this.a = yfqVar;
    }

    Object readResolve() {
        yfq yfqVar = this.a;
        return yfqVar.isEmpty() ? ygo.a : yrm.W(yfqVar, yfq.q(ylp.a)) ? ygo.b : new ygo(yfqVar);
    }
}
