package com.google.e.a.a;

import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ax extends b {

    /* renamed from: a, reason: collision with root package name */
    private final ba f8236a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.e.a.k.a f8237b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f8238c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.libraries.phenotype.client.stable.p f8239d;

    private ax(ba baVar, com.google.android.libraries.phenotype.client.stable.p pVar, com.google.e.a.k.a aVar, Integer num) {
        this.f8236a = baVar;
        this.f8239d = pVar;
        this.f8237b = aVar;
        this.f8238c = num;
    }

    public static ax h(ba baVar, com.google.android.libraries.phenotype.client.stable.p pVar, Integer num) throws GeneralSecurityException {
        com.google.e.a.k.a aVarB;
        az azVarG = baVar.g();
        az azVar = az.f8243b;
        if (azVarG != azVar && num == null) {
            throw new GeneralSecurityException("For given Variant " + baVar.g().toString() + " the value of idRequirement must be non-null");
        }
        if (baVar.g() == azVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (pVar.d() != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + pVar.d());
        }
        if (baVar.g() == azVar) {
            aVarB = com.google.e.a.e.w.f8463a;
        } else {
            if (baVar.g() != az.f8242a) {
                throw new IllegalStateException("Unknown Variant: ".concat(baVar.g().toString()));
            }
            aVarB = com.google.e.a.e.w.b(num.intValue());
        }
        return new ax(baVar, pVar, aVarB, num);
    }

    @Override // com.google.d.m.a.a.b
    public final Integer b() {
        return this.f8238c;
    }

    @Override // com.google.d.m.a.a.b
    public final /* synthetic */ com.google.d.m.a.a.b e() {
        return this.f8236a;
    }

    @Override // com.google.e.a.a.b
    public final com.google.e.a.k.a f() {
        return this.f8237b;
    }

    public final ba g() {
        return this.f8236a;
    }

    public final com.google.android.libraries.phenotype.client.stable.p i() {
        return this.f8239d;
    }
}
