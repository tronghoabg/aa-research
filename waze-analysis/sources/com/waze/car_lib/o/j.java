package com.waze.car_lib.o;

import com.waze.reports.ba;
import com.waze.sdk.SdkConfiguration;
import com.waze.sdk.au;
import com.waze.settings.bp;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class j implements bp {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f20473a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f20474b;

    public /* synthetic */ j(Object obj, int i2) {
        this.f20474b = i2;
        this.f20473a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [h.g.a.a, java.lang.Object] */
    @Override // com.waze.settings.bp
    public final void a(ba baVar) {
        int i2 = this.f20474b;
        if (i2 == 0) {
            this.f20473a.invoke();
            return;
        }
        if (i2 == 1) {
            this.f20473a.invoke();
            return;
        }
        if (i2 == 2) {
            this.f20473a.invoke();
            return;
        }
        if (i2 == 3) {
            this.f20473a.invoke();
            return;
        }
        if (i2 == 4) {
            ((au) this.f20473a).e();
            return;
        }
        if (baVar == null || !com.waze.settings.tree.a.n.E(baVar.c())) {
            return;
        }
        au auVar = (au) this.f20473a;
        if (auVar.g(baVar.c())) {
            return;
        }
        SdkConfiguration.openAppInstallPage(baVar.c(), auVar.f35258a);
    }
}
