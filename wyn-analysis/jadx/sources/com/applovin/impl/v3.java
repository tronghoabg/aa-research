package com.applovin.impl;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class v3 {

    /* renamed from: a, reason: collision with root package name */
    private final List f23396a = DesugarCollections.synchronizedList(new ArrayList());

    public interface a {
        void a(y2 y2Var);
    }

    public void a(a aVar) {
        this.f23396a.add(aVar);
    }

    public void b(a aVar) {
        this.f23396a.remove(aVar);
    }

    public void a(y2 y2Var) {
        Iterator it = new ArrayList(this.f23396a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(y2Var);
        }
    }
}
