package com.waze;

import android.content.Context;
import com.waze.gw.Gateway;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class du implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f23594a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f23595b;

    public /* synthetic */ du(el elVar, int i2) {
        this.f23595b = i2;
        this.f23594a = elVar;
    }

    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, org.a.d.a.b] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, org.a.d.a.b] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, org.a.d.a.b] */
    /* JADX WARN: Type inference failed for: r3v32, types: [java.lang.Object, org.a.d.a.b] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, org.a.d.a.b] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, org.a.d.a.b] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object, org.a.d.a.b] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, org.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r3v52, types: [java.lang.Object, org.a.d.a.b] */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.lang.Object, org.a.d.a.b] */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.Object, org.a.d.a.b] */
    /* JADX WARN: Type inference failed for: r3v67, types: [java.lang.Object, org.a.d.a.b] */
    /* JADX WARN: Type inference failed for: r3v72, types: [java.lang.Object, org.a.d.a.b] */
    /* JADX WARN: Type inference failed for: r3v77, types: [java.lang.Object, org.a.d.a.b] */
    /* JADX WARN: Type inference failed for: r3v82, types: [java.lang.Object, org.a.d.a.b] */
    /* JADX WARN: Type inference failed for: r3v87, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v90, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v93, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v96, types: [android.content.ComponentCallbacks, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f23595b) {
            case 0:
                ((el) this.f23594a).N().n();
                return h.ab.f48028a;
            case 1:
                ?? r3 = this.f23594a;
                if (r3 instanceof org.a.d.a.b) {
                    org.a.d.k.b bVarL = ((org.a.d.a.b) r3).l();
                    int i2 = h.g.b.ar.f48106a;
                    return bVarL.a(new h.g.b.m(Context.class), null, null);
                }
                org.a.d.k.b bVarC = r3.getKoin().a().c();
                int i3 = h.g.b.ar.f48106a;
                return bVarC.a(new h.g.b.m(Context.class), null, null);
            case 2:
                NativeManager nativeManagerM = ((el) this.f23594a).M();
                Gateway.requestExplicitShutdown();
                nativeManagerM.shutDown();
                return h.ab.f48028a;
            case 3:
                org.a.d.k.b bVarC2 = this.f23594a.getKoin().a().c();
                int i4 = h.g.b.ar.f48106a;
                return bVarC2.a(new h.g.b.m(com.waze.as.d.class), null, null);
            case 4:
                org.a.d.k.b bVarC3 = this.f23594a.getKoin().a().c();
                int i5 = h.g.b.ar.f48106a;
                return bVarC3.a(new h.g.b.m(com.waze.as.a.class), null, null);
            case 5:
                org.a.d.k.b bVarC4 = this.f23594a.getKoin().a().c();
                int i6 = h.g.b.ar.f48106a;
                return bVarC4.a(new h.g.b.m(com.waze.navigate.dg.class), null, null);
            case 6:
                org.a.d.k.b bVarC5 = this.f23594a.getKoin().a().c();
                int i7 = h.g.b.ar.f48106a;
                return bVarC5.a(new h.g.b.m(com.waze.map.b.ai.class), null, null);
            case 7:
                org.a.d.k.b bVarC6 = this.f23594a.getKoin().a().c();
                int i8 = h.g.b.ar.f48106a;
                return bVarC6.a(new h.g.b.m(com.waze.modules.navigation.bp.class), null, null);
            case 8:
                org.a.d.k.b bVarC7 = this.f23594a.getKoin().a().c();
                int i9 = h.g.b.ar.f48106a;
                return bVarC7.a(new h.g.b.m(com.waze.sdk.bd.class), null, null);
            case 9:
                org.a.d.k.b bVarC8 = this.f23594a.getKoin().a().c();
                int i10 = h.g.b.ar.f48106a;
                return bVarC8.a(new h.g.b.m(NativeManager.class), null, null);
            case 10:
                org.a.d.k.b bVarC9 = this.f23594a.getKoin().a().c();
                int i11 = h.g.b.ar.f48106a;
                return bVarC9.a(new h.g.b.m(lm.class), null, null);
            case 11:
                org.a.d.k.b bVarC10 = this.f23594a.getKoin().a().c();
                int i12 = h.g.b.ar.f48106a;
                return bVarC10.a(new h.g.b.m(com.waze.favorites.k.class), null, null);
            case 12:
                org.a.d.k.b bVarC11 = this.f23594a.getKoin().a().c();
                int i13 = h.g.b.ar.f48106a;
                return bVarC11.a(new h.g.b.m(com.waze.google_assistant.ah.class), null, null);
            case 13:
                org.a.d.k.b bVarC12 = this.f23594a.getKoin().a().c();
                int i14 = h.g.b.ar.f48106a;
                return bVarC12.a(new h.g.b.m(cq.class), null, null);
            case 14:
                org.a.d.k.b bVarC13 = this.f23594a.getKoin().a().c();
                int i15 = h.g.b.ar.f48106a;
                return bVarC13.a(new h.g.b.m(com.waze.navigate.eo.class), null, null);
            case 15:
                org.a.d.k.b bVarC14 = this.f23594a.getKoin().a().c();
                int i16 = h.g.b.ar.f48106a;
                return bVarC14.a(new h.g.b.m(com.waze.google_assistant.aa.class), null, null);
            case 16:
                org.a.d.k.b bVarC15 = this.f23594a.getKoin().a().c();
                int i17 = h.g.b.ar.f48106a;
                return bVarC15.a(new h.g.b.m(com.waze.bw.c.a.c.class), null, null);
            case 17:
                org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(this.f23594a);
                int i18 = h.g.b.ar.f48106a;
                return bVarD.a(new h.g.b.m(ao.class), null, null);
            case 18:
                org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d(this.f23594a);
                int i19 = h.g.b.ar.f48106a;
                return bVarD2.a(new h.g.b.m(com.waze.view.popups.b.m.class), null, null);
            case 19:
                org.a.d.k.b bVarD3 = org.chromium.support_lib_boundary.a.b.d(this.f23594a);
                int i20 = h.g.b.ar.f48106a;
                return bVarD3.a(new h.g.b.m(com.waze.tide.o.class), null, null);
            default:
                org.a.d.k.b bVarD4 = org.chromium.support_lib_boundary.a.b.d(this.f23594a);
                int i21 = h.g.b.ar.f48106a;
                return bVarD4.a(new h.g.b.m(com.waze.install.a.a.class), null, null);
        }
    }

    public du(Object obj, int i2) {
        this.f23595b = i2;
        this.f23594a = obj;
    }
}
