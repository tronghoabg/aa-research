package com.waze.search.v2;

import android.content.ComponentCallbacks;
import android.content.Context;
import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class bv implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f36203a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f36204b;

    public bv(ComponentCallbacks componentCallbacks, int i2) {
        this.f36204b = i2;
        this.f36203a = componentCallbacks;
    }

    /* JADX WARN: Type inference failed for: r4v19, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v37, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v39, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.content.ComponentCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v41, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v43, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v52, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v54, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v60, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f36204b) {
            case 0:
                return ck.h((ck) this.f36203a);
            case 1:
                org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(this.f36203a);
                int i2 = h.g.b.ar.f48106a;
                return bVarD.a(new h.g.b.m(com.waze.map.b.ed.class), null, null);
            case 2:
                return ck.d((ck) this.f36203a);
            case 3:
                return ck.e((ck) this.f36203a);
            case 4:
                return ck.f((ck) this.f36203a);
            case 5:
                return ck.c((ck) this.f36203a);
            case 6:
                org.a.d.k.b bVarD2 = org.chromium.support_lib_boundary.a.b.d(this.f36203a);
                int i3 = h.g.b.ar.f48106a;
                return bVarD2.a(new h.g.b.m(com.waze.map.b.ed.class), null, null);
            case 7:
                return fi.s((fi) this.f36203a);
            case 8:
                return fi.X((fi) this.f36203a);
            case 9:
                Object obj = this.f36203a;
                h.g.b.x.f(obj, "context");
                com.waze.bs.a.e((Context) obj, "settings_main.voice.navigation_guidance.waze_voice", null);
                return h.ab.f48028a;
            case 10:
                int i4 = com.waze.bv.m.f17537a;
                int i5 = h.g.b.ar.f48106a;
                return Boolean.valueOf(((NativeManager) ((org.a.d.k.b) this.f36203a).a(new h.g.b.m(NativeManager.class), null, null)).inWalkingModeNTV());
            case 11:
                ?? r4 = this.f36203a;
                int i6 = com.waze.bw.c.d.e.f18097a;
                r4.setValue(Boolean.valueOf(!((Boolean) r4.getValue()).booleanValue()));
                return h.ab.f48028a;
            case 12:
                this.f36203a.invoke(com.waze.bw.c.d.aq.f17967a);
                return h.ab.f48028a;
            case 13:
                this.f36203a.invoke(com.waze.bw.c.d.at.f17970a);
                return h.ab.f48028a;
            case 14:
                this.f36203a.invoke(com.waze.bw.c.d.a.t.f17944a);
                return h.ab.f48028a;
            case 15:
                return Boolean.valueOf(((com.waze.z.a.b.ab) this.f36203a).i() == com.waze.z.a.b.ad.f45734b);
            case 16:
                return ((com.waze.z.a.b.ab) this.f36203a).h();
            case 17:
                int i7 = com.waze.bw.c.d.ct.f18062a;
                this.f36203a.invoke(com.waze.bw.c.d.ai.f17959a);
                return h.ab.f48028a;
            case 18:
                int i8 = com.waze.bw.c.d.ct.f18062a;
                this.f36203a.invoke(com.waze.bw.c.d.ah.f17958a);
                return h.ab.f48028a;
            case 19:
                com.waze.z.a.b.ab abVar = (com.waze.z.a.b.ab) this.f36203a;
                return Boolean.valueOf(abVar.g() != abVar.i());
            default:
                this.f36203a.invoke(com.waze.bw.c.d.a.b.f17901a);
                return h.ab.f48028a;
        }
    }

    public /* synthetic */ bv(Object obj, int i2) {
        this.f36204b = i2;
        this.f36203a = obj;
    }
}
