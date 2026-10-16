package com.google.e.a.a;

import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bb extends b {

    /* renamed from: a, reason: collision with root package name */
    private final be f8249a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.e.a.k.a f8250b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f8251c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.libraries.phenotype.client.stable.p f8252d;

    private bb(be beVar, com.google.android.libraries.phenotype.client.stable.p pVar, com.google.e.a.k.a aVar, Integer num) {
        this.f8249a = beVar;
        this.f8252d = pVar;
        this.f8250b = aVar;
        this.f8251c = num;
    }

    public static bb h(bd bdVar, com.google.android.libraries.phenotype.client.stable.p pVar, Integer num) throws GeneralSecurityException {
        com.google.e.a.k.a aVarB;
        bd bdVar2 = bd.f8260c;
        if (bdVar != bdVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + bdVar.toString() + " the value of idRequirement must be non-null");
        }
        if (bdVar == bdVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (pVar.d() != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + pVar.d());
        }
        be beVarG = be.g(bdVar);
        if (beVarG.f() == bdVar2) {
            aVarB = com.google.e.a.e.w.f8463a;
        } else if (beVarG.f() == bd.f8259b) {
            aVarB = com.google.e.a.e.w.a(num.intValue());
        } else {
            if (beVarG.f() != bd.f8258a) {
                throw new IllegalStateException("Unknown Variant: ".concat(beVarG.f().toString()));
            }
            aVarB = com.google.e.a.e.w.b(num.intValue());
        }
        return new bb(beVarG, pVar, aVarB, num);
    }

    @Override // com.google.d.m.a.a.b
    public final Integer b() {
        return this.f8251c;
    }

    @Override // com.google.d.m.a.a.b
    public final /* synthetic */ com.google.d.m.a.a.b e() {
        return this.f8249a;
    }

    @Override // com.google.e.a.a.b
    public final com.google.e.a.k.a f() {
        return this.f8250b;
    }

    public final be g() {
        return this.f8249a;
    }

    public final com.google.android.libraries.phenotype.client.stable.p i() {
        return this.f8252d;
    }
}
