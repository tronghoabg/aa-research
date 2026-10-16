package com.bumptech.glide.e;

import com.bumptech.glide.load.a.y;
import com.bumptech.glide.load.c.a.t;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i extends a {

    /* renamed from: a, reason: collision with root package name */
    private static i f2857a;

    /* renamed from: b, reason: collision with root package name */
    private static i f2858b;

    public static i a() {
        i iVar = f2858b;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = (i) new i().J(t.f3359d, new com.bumptech.glide.load.c.a.g());
        iVar2.ae();
        f2858b = iVar2;
        return iVar2;
    }

    public static i b(Class cls) {
        return (i) new i().v(cls);
    }

    public static i c(y yVar) {
        return (i) new i().w(yVar);
    }

    public static i d() {
        i iVar = f2857a;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = (i) new i().ad();
        iVar2.ae();
        f2857a = iVar2;
        return iVar2;
    }

    @Override // com.bumptech.glide.e.a
    public final boolean equals(Object obj) {
        return (obj instanceof i) && super.equals(obj);
    }
}
