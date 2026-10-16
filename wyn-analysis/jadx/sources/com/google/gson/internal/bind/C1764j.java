package com.google.gson.internal.bind;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import ka.AbstractC3256n;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1764j extends C3963b {

    /* renamed from: r, reason: collision with root package name */
    public static final C1763i f27462r = new C1763i();

    /* renamed from: s, reason: collision with root package name */
    public static final la.s f27463s = new la.s("closed");

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f27464o;

    /* renamed from: p, reason: collision with root package name */
    public String f27465p;

    /* renamed from: q, reason: collision with root package name */
    public la.o f27466q;

    public C1764j() {
        super(f27462r);
        this.f27464o = new ArrayList();
        this.f27466q = la.q.f40207a;
    }

    @Override // ra.C3963b
    public final void Q(double d3) {
        if (this.f44708h == 1 || (!Double.isNaN(d3) && !Double.isInfinite(d3))) {
            c0(new la.s(Double.valueOf(d3)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d3);
        }
    }

    @Override // ra.C3963b
    public final void V(long j8) {
        c0(new la.s(Long.valueOf(j8)));
    }

    @Override // ra.C3963b
    public final void W(Boolean bool) {
        if (bool == null) {
            c0(la.q.f40207a);
        } else {
            c0(new la.s(bool));
        }
    }

    @Override // ra.C3963b
    public final void X(Number number) {
        if (number == null) {
            c0(la.q.f40207a);
            return;
        }
        if (this.f44708h != 1) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        c0(new la.s(number));
    }

    @Override // ra.C3963b
    public final void Y(String str) {
        if (str == null) {
            c0(la.q.f40207a);
        } else {
            c0(new la.s(str));
        }
    }

    @Override // ra.C3963b
    public final void Z(boolean z2) {
        c0(new la.s(Boolean.valueOf(z2)));
    }

    @Override // ra.C3963b
    public final void b() {
        la.m mVar = new la.m();
        c0(mVar);
        this.f27464o.add(mVar);
    }

    public final la.o b0() {
        return (la.o) AbstractC3256n.e(this.f27464o, 1);
    }

    public final void c0(la.o oVar) {
        if (this.f27465p != null) {
            if (!(oVar instanceof la.q) || this.k) {
                la.r rVar = (la.r) b0();
                String str = this.f27465p;
                rVar.getClass();
                rVar.f40208a.put(str, oVar);
            }
            this.f27465p = null;
            return;
        }
        if (this.f27464o.isEmpty()) {
            this.f27466q = oVar;
            return;
        }
        la.o oVarB0 = b0();
        if (!(oVarB0 instanceof la.m)) {
            throw new IllegalStateException();
        }
        ((la.m) oVarB0).f40206a.add(oVar);
    }

    @Override // ra.C3963b, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f27464o;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f27463s);
    }

    @Override // ra.C3963b
    public final void d() {
        la.r rVar = new la.r();
        c0(rVar);
        this.f27464o.add(rVar);
    }

    @Override // ra.C3963b, java.io.Flushable
    public final void flush() {
    }

    @Override // ra.C3963b
    public final void i() {
        ArrayList arrayList = this.f27464o;
        if (arrayList.isEmpty() || this.f27465p != null) {
            throw new IllegalStateException();
        }
        if (!(b0() instanceof la.m)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // ra.C3963b
    public final void o() {
        ArrayList arrayList = this.f27464o;
        if (arrayList.isEmpty() || this.f27465p != null) {
            throw new IllegalStateException();
        }
        if (!(b0() instanceof la.r)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // ra.C3963b
    public final void w(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f27464o.isEmpty() || this.f27465p != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(b0() instanceof la.r)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f27465p = str;
    }

    @Override // ra.C3963b
    public final C3963b z() {
        c0(la.q.f40207a);
        return this;
    }
}
