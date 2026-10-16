package com.google.e.a.e;

import com.google.e.a.h.bh;
import com.google.e.a.h.bj;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class m implements b {
    @Override // com.google.e.a.e.b
    public final com.google.d.m.a.a.b a(com.google.d.m.a.a.b bVar, Integer num) throws GeneralSecurityException {
        int i2 = n.f8448a;
        com.google.android.libraries.e.a.f fVarF = ((j) bVar).f();
        g gVarD = c.a().d(fVarF.g());
        if (!c.a().b(fVarF.g())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        com.waze.car_lib.r.ai aiVarE = v.a().e(n.a().c(v.a().j(com.google.android.libraries.e.a.f.h(gVarD.f8440a, com.google.e.a.s.f8785d, fVarF.f())), null), com.google.e.a.e.a());
        bh bhVarNewBuilder = bj.newBuilder();
        bhVarNewBuilder.b(aiVarE.h());
        bhVarNewBuilder.c(aiVarE.f());
        bhVarNewBuilder.a(com.google.e.a.b.a.a.d(aiVarE.d()));
        bj bjVarBuild = bhVarNewBuilder.build();
        return new i(com.waze.car_lib.r.ai.i(bjVarBuild.getTypeUrl(), bjVarBuild.getValue(), com.google.e.a.b.a.a.b(bjVarBuild.getKeyMaterialType()), fVarF.e(), num));
    }
}
