package com.unity3d.scar.adapter.common;

import R8.v;

/* loaded from: classes4.dex */
public final class a extends h {
    public static a a(nb.c cVar) {
        String strF = v.f("Cannot show ad that is not loaded for placement ", cVar.f41000a);
        return new a(b.f32704s, strF, cVar.f41000a, cVar.f41001b, strF);
    }

    @Override // com.unity3d.scar.adapter.common.h
    public final String getDomain() {
        return "GMA";
    }
}
