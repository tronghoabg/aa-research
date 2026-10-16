package com.google.l.b.a;

import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.l.v f12306a = c(2);

    /* renamed from: b, reason: collision with root package name */
    private final int f12307b;

    private r(int i2) {
        this.f12307b = i2;
    }

    public static com.google.l.v a(int i2) {
        return i2 == 2 ? f12306a : c(i2);
    }

    private static com.google.l.v c(int i2) {
        return new q(new r(i2));
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) throws IOException {
        int iR = bVar.r();
        int i2 = iR - 1;
        if (i2 == 5 || i2 == 6) {
            return com.google.h.a.a.a.a.b.b(this.f12307b, bVar);
        }
        if (i2 == 8) {
            bVar.m();
            return null;
        }
        throw new com.google.l.q("Expecting number, got: " + com.waze.c.c.e.c(iR) + "; at path " + bVar.e());
    }

    @Override // com.google.l.u
    public final /* synthetic */ void d(com.google.l.d.c cVar, Object obj) throws IOException {
        cVar.k((Number) obj);
    }
}
