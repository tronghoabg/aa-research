package com.google.e.a.a;

import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aa extends b {

    /* renamed from: a, reason: collision with root package name */
    private final ad f8157a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.e.a.k.a f8158b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f8159c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.libraries.phenotype.client.stable.p f8160d;

    private aa(ad adVar, com.google.android.libraries.phenotype.client.stable.p pVar, com.google.e.a.k.a aVar, Integer num) {
        this.f8157a = adVar;
        this.f8160d = pVar;
        this.f8158b = aVar;
        this.f8159c = num;
    }

    public static aa h(ac acVar, com.google.android.libraries.phenotype.client.stable.p pVar, Integer num) throws GeneralSecurityException {
        com.google.e.a.k.a aVarB;
        ac acVar2 = ac.f8167c;
        if (acVar != acVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + acVar.toString() + " the value of idRequirement must be non-null");
        }
        if (acVar == acVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (pVar.d() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + pVar.d());
        }
        ad adVarG = ad.g(acVar);
        if (adVarG.f() == acVar2) {
            aVarB = com.google.e.a.e.w.f8463a;
        } else if (adVarG.f() == ac.f8166b) {
            aVarB = com.google.e.a.e.w.a(num.intValue());
        } else {
            if (adVarG.f() != ac.f8165a) {
                throw new IllegalStateException("Unknown Variant: ".concat(adVarG.f().toString()));
            }
            aVarB = com.google.e.a.e.w.b(num.intValue());
        }
        return new aa(adVarG, pVar, aVarB, num);
    }

    @Override // com.google.d.m.a.a.b
    public final Integer b() {
        return this.f8159c;
    }

    @Override // com.google.d.m.a.a.b
    public final /* synthetic */ com.google.d.m.a.a.b e() {
        return this.f8157a;
    }

    @Override // com.google.e.a.a.b
    public final com.google.e.a.k.a f() {
        return this.f8158b;
    }

    public final ad g() {
        return this.f8157a;
    }

    public final com.google.android.libraries.phenotype.client.stable.p i() {
        return this.f8160d;
    }
}
