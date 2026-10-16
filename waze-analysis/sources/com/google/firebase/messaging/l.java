package com.google.firebase.messaging;

import com.waze.map.MapViewChooser;
import com.waze.map.bq;
import com.waze.ni;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f10212a;

    l(f fVar) {
        Objects.requireNonNull(fVar);
        this.f10212a = fVar;
    }

    public final void a(boolean z) {
        com.google.firebase.e.j((com.google.firebase.e) this.f10212a, z);
    }

    public final boolean b(String str, String str2) {
        return com.google.android.libraries.phenotype.client.stable.p.b((com.google.android.libraries.phenotype.client.stable.p) this.f10212a, str, str2);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void c() {
        ni niVar = MapViewChooser.f27898a;
        this.f10212a.run();
    }

    public final void d(com.waze.view.popups.a.h hVar) {
        bq.d((bq) this.f10212a, hVar);
    }

    public /* synthetic */ l(Object obj) {
        this.f10212a = obj;
    }
}
