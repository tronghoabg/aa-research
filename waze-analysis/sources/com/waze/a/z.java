package com.waze.a;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResultLauncher;
import androidx.car.app.Screen;
import com.waze.c.e.al;
import com.waze.c.e.bi;
import com.waze.c.e.bo;
import com.waze.car_lib.ar;
import com.waze.car_lib.f.gg;
import com.waze.car_lib.f.hm;
import com.waze.car_lib.r.dr;
import com.waze.car_lib.screens.bu;
import com.waze.car_lib.screens.bw;
import com.waze.car_lib.screens.bx;
import com.waze.car_lib.screens.de;
import com.waze.gw.Gateway;
import com.waze.reports_v2.b.ag;
import com.waze.reports_v2.b.at;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class z implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13657a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13658b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13659c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f13660d;

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i2) {
        this.f13660d = i2;
        this.f13657a = obj;
        this.f13658b = obj2;
        this.f13659c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v43, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v47, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.compose.runtime.State, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f13660d) {
            case 0:
                this.f13657a.invoke(new j((com.waze.shared_infra.q.i) this.f13658b));
                this.f13659c.invoke();
                break;
            case 1:
                Object obj = this.f13658b;
                break;
            case 2:
                ((com.waze.ads.c.m) this.f13657a).o(new bo((Context) this.f13658b, (ManagedActivityResultLauncher) this.f13659c, 1));
                break;
            case 3:
                if (((bi) this.f13657a).d() != null) {
                    ((al) this.f13659c).f();
                } else {
                    ((h.g.a.a) this.f13658b.getValue()).invoke();
                }
                break;
            case 4:
                com.waze.l.v vVar = (com.waze.l.v) this.f13659c;
                vVar.q();
                if (((Boolean) this.f13658b.getValue()).booleanValue()) {
                    vVar.m();
                }
                this.f13657a.invoke();
                break;
            case 5:
                com.waze.l.v vVar2 = (com.waze.l.v) this.f13659c;
                vVar2.i();
                if (((Boolean) this.f13658b.getValue()).booleanValue()) {
                    vVar2.m();
                }
                this.f13657a.invoke();
                break;
            case 6:
                ?? r0 = this.f13658b;
                com.waze.l.v vVar3 = (com.waze.l.v) this.f13659c;
                vVar3.j(com.waze.design_components.c.b.f23379c, ((Boolean) r0.getValue()).booleanValue());
                if (((Boolean) r0.getValue()).booleanValue()) {
                    vVar3.m();
                }
                this.f13657a.invoke();
                break;
            case 7:
                ((hm) this.f13658b).b((com.waze.av.b.aa) this.f13657a);
                ((Screen) this.f13659c).finish();
                break;
            case 8:
                bx.b(((bu) this.f13659c).f21902b, (gg) this.f13658b, ((com.waze.car_lib.p.t) this.f13657a).b());
                break;
            case 9:
                bx.b(((bw) this.f13659c).f21905b, (gg) this.f13658b, ((com.waze.car_lib.p.t) this.f13657a).b());
                break;
            case 10:
                com.waze.reports_v2.b.q qVarG = ((ag) this.f13657a).g();
                String strB = ((com.waze.car_lib.p.t) this.f13659c).b();
                if (!Gateway.handleAaModReportLeaf(this.f13658b, strB)) {
                    ((gg) this.f13658b).d(qVarG, at.a(strB));
                    break;
                } else {
                    break;
                }
            case 11:
                com.waze.reports_v2.b.q qVarG2 = ((ag) this.f13657a).g();
                String strB2 = ((com.waze.car_lib.p.t) this.f13659c).b();
                if (!Gateway.handleAaModReportLeaf(this.f13658b, strB2)) {
                    ((gg) this.f13658b).d(qVarG2, at.a(strB2));
                    break;
                } else {
                    break;
                }
            case 12:
                ((dr) this.f13658b).b((String) this.f13659c, this.f13657a);
                break;
            case 13:
                Object obj2 = this.f13657a;
                break;
            case 14:
                Object obj3 = this.f13657a;
                break;
            case 15:
                ((de) this.f13659c).n().a(new com.waze.app_nav.hub.n(this.f13657a, this.f13658b, 11, null));
                break;
            case 16:
                ((de) this.f13658b).n().a(new com.waze.app_nav.hub.n(this.f13659c, this.f13657a, 10));
                break;
            case 17:
                ((com.waze.car_lib.screens.core.l) this.f13659c).a(new ar(this.f13658b, this.f13657a, 5));
                break;
            case 18:
                ?? r02 = this.f13659c;
                break;
            case 19:
                this.f13657a.invoke();
                com.waze.t.c.k kVar = (com.waze.t.c.k) this.f13659c;
                if (kVar.f()) {
                    ((com.waze.o.d.b.a.d) this.f13658b).b();
                } else if (!kVar.f()) {
                    kVar.d(true);
                }
                break;
            default:
                this.f13659c.setValue(Boolean.valueOf(false));
                ((com.waze.t.c.k) this.f13657a).a().e();
                ((ActivityResultLauncher) this.f13658b).launch("android.permission.RECORD_AUDIO");
                break;
        }
        return h.ab.f48028a;
    }

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i2, byte[] bArr) {
        this.f13660d = i2;
        this.f13659c = obj;
        this.f13657a = obj2;
        this.f13658b = obj3;
    }

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i2, char[] cArr) {
        this.f13660d = i2;
        this.f13657a = obj;
        this.f13659c = obj2;
        this.f13658b = obj3;
    }

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i2, int[] iArr) {
        this.f13660d = i2;
        this.f13659c = obj;
        this.f13658b = obj2;
        this.f13657a = obj3;
    }

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i2, short[] sArr) {
        this.f13660d = i2;
        this.f13658b = obj;
        this.f13657a = obj2;
        this.f13659c = obj3;
    }

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, int i2, boolean[] zArr) {
        this.f13660d = i2;
        this.f13658b = obj;
        this.f13659c = obj2;
        this.f13657a = obj3;
    }
}
