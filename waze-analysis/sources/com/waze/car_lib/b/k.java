package com.waze.car_lib.b;

import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.Navigator;
import com.waze.jn;
import java.io.UnsupportedEncodingException;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class k implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f19105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19106b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f19107c;

    public /* synthetic */ k(Object obj, Object obj2, int i2) {
        this.f19107c = i2;
        this.f19105a = obj;
        this.f19106b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.waze.map.b.ai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [com.waze.main_screen.b.a.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [com.waze.location.o, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v32, types: [com.waze.main_screen.w.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v34, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v36, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v38, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v42, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v44, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v46, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v48, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v51, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v54, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() throws UnsupportedEncodingException {
        ch chVarN;
        com.waze.sharedrive.d.r rVar = null;
        switch (this.f19107c) {
            case 0:
                return ap.m((jn) this.f19105a, (ap) this.f19106b);
            case 1:
                ((com.waze.an.c.y) this.f19105a).e().invoke();
                this.f19106b.invoke();
                return h.ab.f48028a;
            case 2:
                ((com.waze.an.c.z) this.f19105a).b().invoke();
                this.f19106b.invoke();
                return h.ab.f48028a;
            case 3:
                return com.waze.an.c.a.d.m((com.waze.an.c.a.d) this.f19106b, (com.waze.j) this.f19105a);
            case 4:
                this.f19105a.unregisterLocListener(this.f19106b);
                return h.ab.f48028a;
            case 5:
                return com.waze.ch.a.a.f.g(new com.waze.parking.s((com.waze.shared_infra.h.c) this.f19106b, (com.waze.map.b.ai) this.f19105a));
            case 6:
                ((com.waze.main_screen.be) this.f19106b).l(null);
                ((NavController) this.f19105a).popBackStack();
                return h.ab.f48028a;
            case 7:
                ((com.waze.c.e.bk) this.f19106b).p();
                ((NavController) this.f19105a).popBackStack();
                return h.ab.f48028a;
            case 8:
                com.waze.main_screen.be beVar = (com.waze.main_screen.be) this.f19106b;
                com.waze.sharedrive.d.aq aqVarN = beVar.n();
                if (aqVarN != null && (chVarN = aqVarN.n()) != null) {
                    rVar = (com.waze.sharedrive.d.r) chVarN.d();
                }
                if (rVar instanceof com.waze.sharedrive.d.q) {
                    NavController.navigate$default((NavController) this.f19105a, com.waze.main_screen.u.b.f.f(com.waze.main_screen.y.d.f27873a), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
                } else {
                    beVar.j().g("onOpenLiveShareDrive: State is not LiveDrive, cannot navigate.");
                }
                return h.ab.f48028a;
            case 9:
                this.f19106b.invoke();
                String strF = com.waze.main_screen.u.b.f.f(new com.waze.main_screen.y.e((byte[]) null));
                Object obj = this.f19105a;
                ((NavController) obj).navigate(strF, (h.g.a.l<? super NavOptionsBuilder, h.ab>) new com.waze.asks.ax(obj, 18));
                return h.ab.f48028a;
            case 10:
                Object obj2 = this.f19106b;
                if (obj2 != null) {
                    ((com.waze.sound.e.j) obj2).e();
                } else {
                    this.f19105a.c("quick_sound_settings");
                }
                return h.ab.f48028a;
            case 11:
                Object obj3 = this.f19105a;
                ((com.waze.main_screen.c.k) obj3).b().a().invoke();
                this.f19106b.invoke(obj3);
                return h.ab.f48028a;
            case 12:
                this.f19106b.invoke(this.f19105a);
                return h.ab.f48028a;
            case 13:
                this.f19106b.invoke(this.f19105a);
                return h.ab.f48028a;
            case 14:
                this.f19106b.invoke(this.f19105a);
                return h.ab.f48028a;
            case 15:
                this.f19106b.invoke(this.f19105a);
                return h.ab.f48028a;
            case 16:
                this.f19106b.invoke(this.f19105a);
                return h.ab.f48028a;
            case 17:
                this.f19106b.invoke(this.f19105a);
                return h.ab.f48028a;
            case 18:
                Boolean bool = (Boolean) this.f19106b.invoke(this.f19105a);
                bool.booleanValue();
                return bool;
            case 19:
                Boolean bool2 = (Boolean) this.f19106b.invoke(this.f19105a);
                bool2.booleanValue();
                return bool2;
            default:
                ?? r0 = this.f19105a;
                r0.d();
                r0.c();
                ?? r6 = this.f19106b;
                if (r6 != 0) {
                    r6.invoke();
                }
                return h.ab.f48028a;
        }
    }

    public /* synthetic */ k(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f19107c = i2;
        this.f19106b = obj;
        this.f19105a = obj2;
    }
}
