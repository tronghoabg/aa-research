package com.bumptech.glide.load.b;

import java.util.HashMap;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ag {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3208a;

    public ag(byte[] bArr) {
        this.f3208a = new ab(this);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final List a(Class cls) {
        af afVar = (af) this.f3208a.get(cls);
        if (afVar == null) {
            return null;
        }
        return afVar.f3207a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final void b() {
        this.f3208a.clear();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Map] */
    public final void c(Class cls, List list) {
        if (((af) this.f3208a.put(cls, new af(list))) != null) {
            throw new IllegalStateException("Already cached loaders for model: ".concat(String.valueOf(String.valueOf(cls))));
        }
    }

    public final Object d(Object obj) {
        Object obj2 = this.f3208a;
        ac acVarB = ac.b(obj);
        Object objI = ((com.bumptech.glide.g.m) obj2).i(acVarB);
        acVarB.a();
        return objI;
    }

    public final void e(Object obj, Object obj2) {
        ((com.bumptech.glide.g.m) this.f3208a).j(ac.b(obj), obj2);
    }

    ag() {
        this.f3208a = new HashMap();
    }
}
