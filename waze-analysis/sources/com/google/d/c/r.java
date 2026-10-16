package com.google.d.c;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r extends com.google.d.d.aa {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f7389a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(s sVar, be beVar) {
        super(beVar);
        Objects.requireNonNull(sVar);
        this.f7389a = sVar;
    }

    @Override // com.google.d.d.aa
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        be beVarF = ((be) obj).f();
        if (beVarF == this.f7389a.f7390a) {
            return null;
        }
        return beVarF;
    }
}
