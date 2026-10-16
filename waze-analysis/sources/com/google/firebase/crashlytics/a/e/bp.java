package com.google.firebase.crashlytics.a.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bp {

    /* renamed from: a, reason: collision with root package name */
    private cb f9471a;

    /* renamed from: b, reason: collision with root package name */
    private List f9472b;

    /* renamed from: c, reason: collision with root package name */
    private List f9473c;

    /* renamed from: d, reason: collision with root package name */
    private Boolean f9474d;

    /* renamed from: e, reason: collision with root package name */
    private cd f9475e;

    /* renamed from: f, reason: collision with root package name */
    private List f9476f;

    /* renamed from: g, reason: collision with root package name */
    private int f9477g;

    /* renamed from: h, reason: collision with root package name */
    private byte f9478h = 1;

    bp(ce ceVar) {
        this.f9471a = ceVar.c();
        this.f9472b = ceVar.g();
        this.f9473c = ceVar.h();
        this.f9474d = ceVar.e();
        this.f9475e = ceVar.d();
        this.f9476f = ceVar.f();
        this.f9477g = ceVar.a();
    }

    public final ce a() {
        cb cbVar;
        if (this.f9478h == 1 && (cbVar = this.f9471a) != null) {
            return new am(cbVar, this.f9472b, this.f9473c, this.f9474d, this.f9475e, this.f9476f, this.f9477g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9471a == null) {
            sb.append(" execution");
        }
        if (this.f9478h == 0) {
            sb.append(" uiOrientation");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(List list) {
        this.f9476f = list;
    }

    public final void c(Boolean bool) {
        this.f9474d = bool;
    }

    public final void d(cd cdVar) {
        this.f9475e = cdVar;
    }

    public final void e(List list) {
        this.f9472b = list;
    }

    public final void f(cb cbVar) {
        this.f9471a = cbVar;
    }

    public final void g(List list) {
        this.f9473c = list;
    }

    public final void h(int i2) {
        this.f9477g = i2;
        this.f9478h = (byte) 1;
    }
}
