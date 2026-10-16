package com.waze.car_lib.b;

import com.waze.map.bz;
import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class m implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f19109a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f19110b;

    public /* synthetic */ m(Object obj, int i2) {
        this.f19110b = i2;
        this.f19109a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, org.a.d.a.a] */
    /* JADX WARN: Type inference failed for: r3v52, types: [com.waze.main_screen.u.b.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v54, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v59, types: [com.waze.main_screen.ab.a.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v94, types: [com.waze.shared_infra.s.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v96, types: [com.waze.shared_infra.s.d, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        long jI;
        org.a.d.k.b bVarC;
        h.g.b.m mVar;
        org.a.d.k.b bVarC2;
        h.g.b.m mVar2;
        boolean z = false;
        z = false;
        switch (this.f19110b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                ?? r3 = this.f19109a;
                if (!(r3 instanceof org.a.d.a.b)) {
                    org.a.d.k.b bVarC3 = r3.getKoin().a().c();
                    int i2 = h.g.b.ar.f48106a;
                    break;
                } else {
                    org.a.d.k.b bVarL = ((org.a.d.a.b) r3).l();
                    int i3 = h.g.b.ar.f48106a;
                    break;
                }
            case 7:
                int i4 = com.waze.main_screen.t.al.f27484a;
                if (((com.waze.main_screen.t.am) this.f19109a).r().j().f()) {
                    h.o.c cVar = h.o.a.f48264a;
                    jI = h.o.c.i(0, h.o.d.f48272c);
                } else {
                    h.o.c cVar2 = h.o.a.f48264a;
                    jI = h.o.c.i(DisplayStrings.DS_NIGHT, h.o.d.f48272c);
                }
                break;
            case 8:
                com.waze.main_screen.t.am amVar = (com.waze.main_screen.t.am) this.f19109a;
                if (amVar.f().e() && amVar.a().e() == com.waze.z.a.b.ad.f45736d) {
                    z = true;
                }
                break;
            case 9:
                break;
            case 10:
                com.waze.main_screen.ab abVar = (com.waze.main_screen.ab) this.f19109a;
                Float fH = abVar.h(abVar.d());
                break;
            case 11:
                this.f19109a.b(com.waze.ui.u.l.f43461a);
                break;
            case 12:
                break;
            case 13:
                this.f19109a.h();
                break;
            case 14:
                com.waze.map.canvas.a.e eVar = (com.waze.map.canvas.a.e) ((h.g.b.aq) this.f19109a).f48105a;
                if (eVar != null) {
                    eVar.cleanupAndClose();
                }
                break;
            case 15:
                bz bzVar = (bz) ((h.g.b.aq) this.f19109a).f48105a;
                if (bzVar != null) {
                    bzVar.f();
                }
                break;
            case 16:
                org.a.d.a.a aVar = (org.a.d.a.a) this.f19109a;
                if (aVar instanceof org.a.d.a.b) {
                    bVarC = ((org.a.d.a.b) aVar).l();
                    int i5 = h.g.b.ar.f48106a;
                    mVar = new h.g.b.m(com.waze.map.opengl.d.class);
                } else {
                    bVarC = aVar.getKoin().a().c();
                    int i6 = h.g.b.ar.f48106a;
                    mVar = new h.g.b.m(com.waze.map.opengl.d.class);
                }
                break;
            case 17:
                org.a.d.a.a aVar2 = (org.a.d.a.a) this.f19109a;
                if (aVar2 instanceof org.a.d.a.b) {
                    bVarC2 = ((org.a.d.a.b) aVar2).l();
                    int i7 = h.g.b.ar.f48106a;
                    mVar2 = new h.g.b.m(com.waze.map.opengl.d.class);
                } else {
                    bVarC2 = aVar2.getKoin().a().c();
                    int i8 = h.g.b.ar.f48106a;
                    mVar2 = new h.g.b.m(com.waze.map.opengl.d.class);
                }
                break;
            case 18:
                ((kotlinx.coroutines.br) this.f19109a).s(null);
                break;
            case 19:
                int i9 = com.waze.map.b.bd.f28054a;
                this.f19109a.a();
                break;
            default:
                this.f19109a.a();
                break;
        }
        return h.ab.f48028a;
    }

    public m(org.a.d.a.a aVar, int i2) {
        this.f19110b = i2;
        this.f19109a = aVar;
    }
}
