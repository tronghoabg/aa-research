package com.google.firebase.crashlytics.a.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bt {

    /* renamed from: a, reason: collision with root package name */
    private String f9489a;

    /* renamed from: b, reason: collision with root package name */
    private String f9490b;

    /* renamed from: c, reason: collision with root package name */
    private List f9491c;

    /* renamed from: d, reason: collision with root package name */
    private bu f9492d;

    /* renamed from: e, reason: collision with root package name */
    private int f9493e;

    /* renamed from: f, reason: collision with root package name */
    private byte f9494f;

    public final bu a() {
        String str;
        List list;
        if (this.f9494f == 1 && (str = this.f9489a) != null && (list = this.f9491c) != null) {
            return new ap(str, this.f9490b, list, this.f9492d, this.f9493e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9489a == null) {
            sb.append(" type");
        }
        if (this.f9491c == null) {
            sb.append(" frames");
        }
        if (this.f9494f == 0) {
            sb.append(" overflowCount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(bu buVar) {
        this.f9492d = buVar;
    }

    public final void c(List list) {
        if (list == null) {
            throw new NullPointerException("Null frames");
        }
        this.f9491c = list;
    }

    public final void d(int i2) {
        this.f9493e = i2;
        this.f9494f = (byte) 1;
    }

    public final void e(String str) {
        this.f9490b = str;
    }

    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.f9489a = str;
    }
}
