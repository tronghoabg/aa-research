package com.google.firebase.crashlytics.a.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bs {

    /* renamed from: a, reason: collision with root package name */
    private List f9484a;

    /* renamed from: b, reason: collision with root package name */
    private bu f9485b;

    /* renamed from: c, reason: collision with root package name */
    private be f9486c;

    /* renamed from: d, reason: collision with root package name */
    private bw f9487d;

    /* renamed from: e, reason: collision with root package name */
    private List f9488e;

    public final cb a() {
        List list;
        bw bwVar = this.f9487d;
        if (bwVar != null && (list = this.f9488e) != null) {
            return new an(this.f9484a, this.f9485b, this.f9486c, bwVar, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9487d == null) {
            sb.append(" signal");
        }
        if (this.f9488e == null) {
            sb.append(" binaries");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(be beVar) {
        this.f9486c = beVar;
    }

    public final void c(List list) {
        if (list == null) {
            throw new NullPointerException("Null binaries");
        }
        this.f9488e = list;
    }

    public final void d(bu buVar) {
        this.f9485b = buVar;
    }

    public final void e(bw bwVar) {
        this.f9487d = bwVar;
    }

    public final void f(List list) {
        this.f9484a = list;
    }
}
