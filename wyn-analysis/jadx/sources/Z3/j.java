package Z3;

import cg.AbstractC1613b;
import cg.C1610B;
import cg.InterfaceC1620i;
import cg.y;

/* loaded from: classes.dex */
public final class j extends k {

    /* renamed from: a, reason: collision with root package name */
    public final y f16975a;

    /* renamed from: b, reason: collision with root package name */
    public final cg.m f16976b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16977c;

    /* renamed from: d, reason: collision with root package name */
    public final a4.h f16978d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16979e;

    /* renamed from: f, reason: collision with root package name */
    public C1610B f16980f;

    public j(y yVar, cg.m mVar, String str, a4.h hVar) {
        this.f16975a = yVar;
        this.f16976b = mVar;
        this.f16977c = str;
        this.f16978d = hVar;
    }

    @Override // Z3.k
    public final A6.c a() {
        return null;
    }

    @Override // Z3.k
    public final synchronized InterfaceC1620i b() {
        if (this.f16979e) {
            throw new IllegalStateException("closed");
        }
        C1610B c1610b = this.f16980f;
        if (c1610b != null) {
            return c1610b;
        }
        C1610B c1610bD = AbstractC1613b.d(this.f16976b.i(this.f16975a));
        this.f16980f = c1610bD;
        return c1610bD;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f16979e = true;
            C1610B c1610b = this.f16980f;
            if (c1610b != null) {
                k4.e.a(c1610b);
            }
            a4.h hVar = this.f16978d;
            if (hVar != null) {
                k4.e.a(hVar);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
