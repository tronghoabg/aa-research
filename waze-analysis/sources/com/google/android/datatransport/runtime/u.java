package com.google.android.datatransport.runtime;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private x f4354a;

    /* renamed from: b, reason: collision with root package name */
    private String f4355b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.android.datatransport.b f4356c;

    /* renamed from: d, reason: collision with root package name */
    private com.google.android.datatransport.f f4357d;

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.datatransport.a f4358e;

    public final v a() {
        String str;
        com.google.android.datatransport.b bVar;
        com.google.android.datatransport.f fVar;
        com.google.android.datatransport.a aVar;
        x xVar = this.f4354a;
        if (xVar != null && (str = this.f4355b) != null && (bVar = this.f4356c) != null && (fVar = this.f4357d) != null && (aVar = this.f4358e) != null) {
            return new v(xVar, str, bVar, fVar, aVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f4354a == null) {
            sb.append(" transportContext");
        }
        if (this.f4355b == null) {
            sb.append(" transportName");
        }
        if (this.f4356c == null) {
            sb.append(" event");
        }
        if (this.f4357d == null) {
            sb.append(" transformer");
        }
        if (this.f4358e == null) {
            sb.append(" encoding");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    final void b(com.google.android.datatransport.a aVar) {
        this.f4358e = aVar;
    }

    final void c(com.google.android.datatransport.b bVar) {
        this.f4356c = bVar;
    }

    final void d(com.google.android.datatransport.f fVar) {
        if (fVar == null) {
            throw new NullPointerException("Null transformer");
        }
        this.f4357d = fVar;
    }

    public final void e(x xVar) {
        this.f4354a = xVar;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        this.f4355b = str;
    }
}
