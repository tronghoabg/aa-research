package com.google.d.f.b;

import com.google.d.d.fo;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private static final q f7772a = new l();

    /* renamed from: b, reason: collision with root package name */
    private static final p f7773b = new m();

    /* renamed from: e, reason: collision with root package name */
    private final q f7776e;

    /* renamed from: c, reason: collision with root package name */
    private final Map f7774c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f7775d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private p f7777f = null;

    final void e(com.google.d.f.aa aaVar) {
        fo.o(aaVar, "key");
        if (!aaVar.i()) {
            q qVar = f7772a;
            fo.o(aaVar, "key");
            this.f7775d.remove(aaVar);
            this.f7774c.put(aaVar, qVar);
            return;
        }
        p pVar = f7773b;
        fo.o(aaVar, "key");
        fo.l(aaVar.i(), "key must be repeating");
        this.f7774c.remove(aaVar);
        this.f7775d.put(aaVar, pVar);
    }

    public final void f(p pVar) {
        this.f7777f = pVar;
    }
}
