package com.airbnb.lottie.a.b;

import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final List f1892a;

    /* renamed from: b, reason: collision with root package name */
    private final List f1893b;

    /* renamed from: c, reason: collision with root package name */
    private final List f1894c;

    public n(List list) {
        this.f1894c = list;
        this.f1892a = new ArrayList(list.size());
        this.f1893b = new ArrayList(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f1892a.add(((com.airbnb.lottie.d.b.g) list.get(i2)).b().a());
            this.f1893b.add(((com.airbnb.lottie.d.b.g) list.get(i2)).a().a());
        }
    }

    public final List a() {
        return this.f1892a;
    }

    public final List b() {
        return this.f1894c;
    }

    public final List c() {
        return this.f1893b;
    }
}
