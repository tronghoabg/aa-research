package com.b.b.c.a;

import com.google.l.b.a.l;
import com.google.l.i;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b implements com.b.b.c.c {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.l.d f2623a;

    /* renamed from: b, reason: collision with root package name */
    private final i f2624b;

    b(com.google.l.d dVar, i iVar) {
        this.f2623a = dVar;
        this.f2624b = iVar;
    }

    @Override // com.b.b.c.c
    public final Object a(Class cls) throws com.b.b.c.b {
        try {
            com.google.l.d dVar = this.f2623a;
            i iVar = this.f2624b;
            com.google.l.c.a aVarA = com.google.l.c.a.a(cls);
            if (iVar == null) {
                return null;
            }
            return dVar.e(new l(iVar), aVarA);
        } catch (RuntimeException e2) {
            throw new com.b.b.c.b(e2);
        }
    }

    @Override // com.b.b.c.c
    public final String b() {
        return this.f2623a.g(this.f2624b);
    }
}
