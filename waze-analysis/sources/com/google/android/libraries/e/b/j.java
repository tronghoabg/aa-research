package com.google.android.libraries.e.b;

import com.google.d.m.a.ag;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements ag {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f5875a;

    public /* synthetic */ j(int i2) {
        this.f5875a = i2;
    }

    @Override // com.google.d.m.a.ag
    public final bm apply(Object obj) {
        if (this.f5875a == 0) {
            return bd.h("");
        }
        com.google.android.gms.common.api.i iVar = (com.google.android.gms.common.api.i) obj;
        throw new com.google.android.libraries.phenotype.client.a.m(iVar.a(), iVar.getMessage(), iVar);
    }
}
