package com.google.android.libraries.phenotype.client.b;

import com.google.v.el;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class o implements el {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f5987a;

    o(int i2) {
        this.f5987a = i2;
    }

    @Override // com.google.v.el
    public final /* synthetic */ Object convert(int i2) {
        if (this.f5987a != 0) {
            com.google.g.a.a.b bVarA = com.google.g.a.a.b.a(i2);
            return bVarA == null ? com.google.g.a.a.b.UNKNOWN : bVarA;
        }
        com.google.g.a.a.b bVarA2 = com.google.g.a.a.b.a(i2);
        return bVarA2 == null ? com.google.g.a.a.b.UNKNOWN : bVarA2;
    }
}
