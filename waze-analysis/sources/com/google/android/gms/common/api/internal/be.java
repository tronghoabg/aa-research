package com.google.android.gms.common.api.internal;

import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class be {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4790a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4791b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4792c;

    public be(com.bumptech.glide.load.o oVar, com.bumptech.glide.load.data.e eVar) {
        List list = Collections.EMPTY_LIST;
        com.bumptech.glide.g.p.f(oVar);
        this.f4792c = oVar;
        com.bumptech.glide.g.p.f(list);
        this.f4790a = list;
        com.bumptech.glide.g.p.f(eVar);
        this.f4791b = eVar;
    }

    public static bd a() {
        return new bd();
    }

    public final boolean b(Class cls) {
        return ((Class) this.f4790a).isAssignableFrom(cls);
    }

    public be(Object obj, Object obj2, Object obj3) {
        this.f4790a = obj;
        this.f4791b = obj2;
        this.f4792c = obj3;
    }

    /* synthetic */ be(bb bbVar, bq bqVar, Runnable runnable) {
        this.f4790a = bbVar;
        this.f4791b = bqVar;
        this.f4792c = runnable;
    }
}
