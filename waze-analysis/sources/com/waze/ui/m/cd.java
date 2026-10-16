package com.waze.ui.m;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cd implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.a.l f42848a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f42849b;

    public cd(h.g.a.l lVar, List list) {
        this.f42848a = lVar;
        this.f42849b = list;
    }

    @Override // h.g.a.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return this.f42848a.invoke(this.f42849b.get(((Number) obj).intValue()));
    }
}
