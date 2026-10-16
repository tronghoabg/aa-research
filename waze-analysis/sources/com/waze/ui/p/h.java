package com.waze.ui.p;

import com.waze.map.cd;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h implements cd {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.k f43198a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f43199b;

    public h(kotlinx.coroutines.b.k kVar, int i2) {
        this.f43199b = i2;
        x.f(kVar, "screenGeometry");
        this.f43198a = new com.waze.car_lib.i.b.j(kVar, 1);
    }

    @Override // com.waze.map.cd
    public final kotlinx.coroutines.b.k a() {
        return this.f43198a;
    }

    h(i iVar, int i2) {
        this.f43199b = i2;
        this.f43198a = iVar.f43201b;
    }
}
