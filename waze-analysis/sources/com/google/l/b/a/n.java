package com.google.l.b.a;

import j$.util.Objects;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class n extends com.google.l.d.c {

    /* renamed from: a, reason: collision with root package name */
    private static final Writer f12295a = new m();

    /* renamed from: b, reason: collision with root package name */
    private static final com.google.l.n f12296b = new com.google.l.n("closed");

    /* renamed from: c, reason: collision with root package name */
    private final List f12297c;

    /* renamed from: d, reason: collision with root package name */
    private String f12298d;

    /* renamed from: e, reason: collision with root package name */
    private com.google.l.i f12299e;

    public n() {
        super(f12295a);
        this.f12297c = new ArrayList();
        this.f12299e = com.google.l.k.f12459a;
    }

    private final com.google.l.i v() {
        return (com.google.l.i) this.f12297c.get(r1.size() - 1);
    }

    private final void w(com.google.l.i iVar) {
        if (this.f12298d != null) {
            if (!(iVar instanceof com.google.l.k) || s()) {
                ((com.google.l.l) v()).d(this.f12298d, iVar);
            }
            this.f12298d = null;
            return;
        }
        if (this.f12297c.isEmpty()) {
            this.f12299e = iVar;
            return;
        }
        com.google.l.i iVarV = v();
        if (!(iVarV instanceof com.google.l.g)) {
            throw new IllegalStateException();
        }
        ((com.google.l.g) iVarV).d(iVar);
    }

    public final com.google.l.i a() {
        List list = this.f12297c;
        if (list.isEmpty()) {
            return this.f12299e;
        }
        throw new IllegalStateException("Expected one JSON element but was ".concat(list.toString()));
    }

    @Override // com.google.l.d.c
    public final void b() {
        com.google.l.g gVar = new com.google.l.g();
        w(gVar);
        this.f12297c.add(gVar);
    }

    @Override // com.google.l.d.c
    public final void c() {
        com.google.l.l lVar = new com.google.l.l();
        w(lVar);
        this.f12297c.add(lVar);
    }

    @Override // com.google.l.d.c, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        List list = this.f12297c;
        if (!list.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        list.add(f12296b);
    }

    @Override // com.google.l.d.c
    public final void d() {
        List list = this.f12297c;
        if (list.isEmpty() || this.f12298d != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof com.google.l.g)) {
            throw new IllegalStateException();
        }
        list.remove(list.size() - 1);
    }

    @Override // com.google.l.d.c
    public final void e() {
        List list = this.f12297c;
        if (list.isEmpty() || this.f12298d != null) {
            throw new IllegalStateException();
        }
        if (!(v() instanceof com.google.l.l)) {
            throw new IllegalStateException();
        }
        list.remove(list.size() - 1);
    }

    @Override // com.google.l.d.c
    public final void f(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f12297c.isEmpty() || this.f12298d != null) {
            throw new IllegalStateException("Did not expect a name");
        }
        if (!(v() instanceof com.google.l.l)) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f12298d = str;
    }

    @Override // com.google.l.d.c, java.io.Flushable
    public final void flush() {
    }

    @Override // com.google.l.d.c
    public final void g() {
        w(com.google.l.k.f12459a);
    }

    @Override // com.google.l.d.c
    public final void h(double d2) {
        if (u() || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            w(new com.google.l.n(Double.valueOf(d2)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d2);
        }
    }

    @Override // com.google.l.d.c
    public final void i(long j2) {
        w(new com.google.l.n(Long.valueOf(j2)));
    }

    @Override // com.google.l.d.c
    public final void j(Boolean bool) throws IOException {
        if (bool == null) {
            g();
        } else {
            w(new com.google.l.n(bool));
        }
    }

    @Override // com.google.l.d.c
    public final void k(Number number) throws IOException {
        if (number == null) {
            g();
            return;
        }
        if (!u()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(number.toString()));
            }
        }
        w(new com.google.l.n(number));
    }

    @Override // com.google.l.d.c
    public final void l(String str) throws IOException {
        if (str == null) {
            g();
        } else {
            w(new com.google.l.n(str));
        }
    }

    @Override // com.google.l.d.c
    public final void m(boolean z) {
        w(new com.google.l.n(Boolean.valueOf(z)));
    }
}
