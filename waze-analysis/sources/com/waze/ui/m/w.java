package com.waze.ui.m;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends y {

    /* renamed from: a, reason: collision with root package name */
    private final List f43040a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f43041b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f43042c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(List list, boolean z, Integer num) {
        super(null);
        h.g.b.x.f(list, "images");
        this.f43040a = list;
        this.f43041b = z;
        this.f43042c = num;
    }

    public static /* synthetic */ w e(w wVar, Integer num) {
        List list = wVar.f43040a;
        h.g.b.x.f(list, "images");
        return new w(list, wVar.f43041b, num);
    }

    public final y a(x xVar) {
        h.g.b.x.f(xVar, "deletedImage");
        return new w(h.a.i.ae(this.f43040a, xVar), this.f43041b, null);
    }

    public final Integer b() {
        return this.f43042c;
    }

    public final List c() {
        return this.f43040a;
    }

    public final boolean d() {
        return this.f43041b;
    }
}
