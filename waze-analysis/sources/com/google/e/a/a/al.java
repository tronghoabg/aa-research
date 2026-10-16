package com.google.e.a.a;

import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class al extends b {

    /* renamed from: a, reason: collision with root package name */
    private final ap f8196a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.e.a.k.a f8197b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f8198c;

    private al(ap apVar, com.google.e.a.k.a aVar, Integer num) {
        this.f8196a = apVar;
        this.f8197b = aVar;
        this.f8198c = num;
    }

    public static al g(ap apVar, Integer num) throws GeneralSecurityException {
        com.google.e.a.k.a aVarB;
        if (apVar.f() == ao.f8211b) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            aVarB = com.google.e.a.e.w.f8463a;
        } else {
            if (apVar.f() != ao.f8210a) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(String.valueOf(apVar.f()))));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            aVarB = com.google.e.a.e.w.b(num.intValue());
        }
        return new al(apVar, aVarB, num);
    }

    @Override // com.google.d.m.a.a.b
    public final Integer b() {
        return this.f8198c;
    }

    @Override // com.google.d.m.a.a.b
    public final /* synthetic */ com.google.d.m.a.a.b e() {
        return this.f8196a;
    }

    @Override // com.google.e.a.a.b
    public final com.google.e.a.k.a f() {
        return this.f8197b;
    }

    public final ap h() {
        return this.f8196a;
    }
}
