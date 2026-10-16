package com.google.d.f.b;

import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final q f7782a = new s();

    /* renamed from: b, reason: collision with root package name */
    private static final p f7783b = new t();

    public static r a(Set set) {
        n nVar = new n(f7782a);
        nVar.f(f7783b);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            nVar.e((com.google.d.f.aa) it.next());
        }
        return new o(nVar);
    }
}
