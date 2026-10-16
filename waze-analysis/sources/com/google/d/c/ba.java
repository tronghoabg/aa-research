package com.google.d.c;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ba extends com.google.d.d.aa {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bb f7339a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ba(bb bbVar, be beVar) {
        super(beVar);
        Objects.requireNonNull(bbVar);
        this.f7339a = bbVar;
    }

    @Override // com.google.d.d.aa
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        be beVarG = ((be) obj).g();
        if (beVarG == this.f7339a.f7340a) {
            return null;
        }
        return beVarG;
    }
}
