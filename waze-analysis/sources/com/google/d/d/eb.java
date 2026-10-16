package com.google.d.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class eb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ea f7554a;

    eb(ea eaVar) {
        Objects.requireNonNull(eaVar);
        this.f7554a = eaVar;
    }

    public static ea a() {
        fo.ah(8, "expectedKeys");
        return new dx();
    }

    public static ea b() {
        return new dy(eo.f7570a);
    }

    public final dc c() {
        return new ed(this.f7554a.a(), new dz());
    }
}
