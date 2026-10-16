package com.google.firebase.crashlytics.a.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bx {

    /* renamed from: a, reason: collision with root package name */
    private String f9499a;

    /* renamed from: b, reason: collision with root package name */
    private int f9500b;

    /* renamed from: c, reason: collision with root package name */
    private List f9501c;

    /* renamed from: d, reason: collision with root package name */
    private byte f9502d;

    public final ca a() {
        String str;
        List list;
        if (this.f9502d == 1 && (str = this.f9499a) != null && (list = this.f9501c) != null) {
            return new ar(str, this.f9500b, list);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f9499a == null) {
            sb.append(" name");
        }
        if (this.f9502d == 0) {
            sb.append(" importance");
        }
        if (this.f9501c == null) {
            sb.append(" frames");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(List list) {
        if (list == null) {
            throw new NullPointerException("Null frames");
        }
        this.f9501c = list;
    }

    public final void c(int i2) {
        this.f9500b = i2;
        this.f9502d = (byte) 1;
    }

    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f9499a = str;
    }
}
