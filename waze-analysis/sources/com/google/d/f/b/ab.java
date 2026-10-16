package com.google.d.f.b;

import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class ab {

    /* renamed from: a, reason: collision with root package name */
    private static final ab f7731a = new v();

    /* synthetic */ ab() {
    }

    public static ab h(k kVar, k kVar2) {
        int iA = kVar2.a();
        return iA == 0 ? f7731a : iA <= 28 ? new z(kVar, kVar2) : new aa(kVar, kVar2);
    }

    public abstract int a();

    public abstract Set b();

    public abstract void c(r rVar, Object obj);
}
