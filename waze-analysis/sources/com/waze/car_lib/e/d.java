package com.waze.car_lib.e;

import android.app.Activity;
import androidx.compose.ui.unit.Dp;
import com.waze.main_screen.p.bf;
import com.waze.main_screen.p.bm;
import com.waze.map.b.fd;
import com.waze.nav_connect.b.af;
import com.waze.nav_connect.b.y;
import com.waze.navigate.ev;
import com.waze.z.a.b.ad;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class d implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f19270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19271b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f19272c;

    public /* synthetic */ d(Object obj, Object obj2, int i2) {
        this.f19272c = i2;
        this.f19270a = obj;
        this.f19271b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [com.waze.map.b.dj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.waze.nav_connect.b.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [com.waze.shared_infra.s.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.waze.main_screen.c.e.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [androidx.compose.runtime.State, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.waze.main_screen.ae.a.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.waze.car_lib.i.b.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22, types: [androidx.compose.ui.unit.Density, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [com.waze.main_screen.ab.a.m, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v43, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v45, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        boolean z = false;
        switch (this.f19272c) {
            case 0:
                return i.c(this.f19270a, (i) this.f19271b);
            case 1:
                this.f19271b.c();
                ?? r3 = this.f19270a;
                if (r3 != 0) {
                    r3.invoke();
                }
                return ab.f48028a;
            case 2:
                this.f19271b.a();
                ?? r32 = this.f19270a;
                if (r32 != 0) {
                    r32.invoke();
                }
                return ab.f48028a;
            case 3:
                ((com.waze.main_screen.c.f.i) this.f19271b).b();
                this.f19270a.invoke();
                return ab.f48028a;
            case 4:
                ((com.waze.main_screen.c.f.i) this.f19271b).b();
                this.f19270a.invoke();
                return ab.f48028a;
            case 5:
                this.f19271b.b();
                ?? r33 = this.f19270a;
                if (r33 != 0) {
                    r33.invoke();
                }
                return ab.f48028a;
            case 6:
                Object obj = this.f19271b;
                if (obj instanceof Activity) {
                    com.waze.design_components.d.a((Activity) obj, (String) this.f19270a, null);
                }
                return ab.f48028a;
            case 7:
                if (((bf) this.f19271b).h().e().i() != ad.f45734b && ((bm) this.f19270a).e() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                ((bf) this.f19271b).y().invoke();
                this.f19270a.invoke();
                return ab.f48028a;
            case 9:
                return Integer.valueOf(this.f19271b.mo2121roundToPx0680j_4(((Dp) ((bf) this.f19270a).d().getValue()).m11178unboximpl()));
            case 10:
                if (((Boolean) this.f19271b.getValue()).booleanValue()) {
                    this.f19270a.i();
                }
                return ab.f48028a;
            case 11:
                return fd.F((fd) this.f19270a, this.f19271b);
            case 12:
                fd.N((fd) this.f19271b, (String) this.f19270a);
                return ab.f48028a;
            case 13:
                fd.O((fd) this.f19271b, (String) this.f19270a);
                return ab.f48028a;
            case 14:
                com.waze.places.f fVarA = ((ev) this.f19270a).a();
                ((com.waze.map.main.bm) this.f19271b).K(fVarA.b(), new com.waze.view.popups.a.q(fVarA));
                return ab.f48028a;
            case 15:
                this.f19270a.a();
                ((com.waze.map.e.a) this.f19271b).d().g(com.waze.map.b.d.f28179e);
                return ab.f48028a;
            case 16:
                this.f19271b.setValue(false);
                this.f19270a.invoke();
                return ab.f48028a;
            case 17:
                this.f19271b.setValue(null);
                this.f19270a.invoke();
                return ab.f48028a;
            case 18:
                a.a.q(this.f19271b).invoke(this.f19270a);
                return ab.f48028a;
            case 19:
                return af.g((af) this.f19270a, (y) this.f19271b);
            default:
                return af.d((af) this.f19270a, (y) this.f19271b);
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f19272c = i2;
        this.f19271b = obj;
        this.f19270a = obj2;
    }
}
