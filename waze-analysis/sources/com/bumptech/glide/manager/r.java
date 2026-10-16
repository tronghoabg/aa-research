package com.bumptech.glide.manager;

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class r implements b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ v f3541a;

    r(v vVar) {
        Objects.requireNonNull(vVar);
        this.f3541a = vVar;
    }

    @Override // com.bumptech.glide.manager.b
    public final void a(boolean z) {
        ArrayList arrayList;
        com.bumptech.glide.g.r.h();
        v vVar = this.f3541a;
        synchronized (vVar) {
            arrayList = new ArrayList(vVar.f3550a);
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((b) arrayList.get(i2)).a(z);
        }
    }
}
