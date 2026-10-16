package com.waze.search.e;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h extends z {

    /* renamed from: a, reason: collision with root package name */
    private final List f35626a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List list) {
        super(null);
        h.g.b.x.f(list, "cats");
        this.f35626a = list;
    }

    @Override // com.waze.search.e.z
    public final String a() {
        return "Categories";
    }

    public final List b() {
        return this.f35626a;
    }

    public final String toString() {
        return "Categories: " + this.f35626a.size();
    }
}
