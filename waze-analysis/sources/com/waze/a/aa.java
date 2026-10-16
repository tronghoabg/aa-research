package com.waze.a;

import android.content.Intent;
import android.net.Uri;
import androidx.car.app.CarContext;
import androidx.compose.ui.unit.Dp;
import com.waze.c.e.al;
import com.waze.car_lib.f.cw;
import com.waze.car_lib.p.dd;
import com.waze.car_lib.screens.bf;
import com.waze.car_lib.screens.bq;
import com.waze.car_lib.screens.cd;
import com.waze.el;
import h.g.b.am;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class aa implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13594b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f13595c;

    public /* synthetic */ aa(Object obj, Object obj2, int i2) {
        this.f13595c = i2;
        this.f13593a = obj;
        this.f13594b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v23, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [com.waze.alerters.a.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [androidx.compose.ui.unit.Density, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v20, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v29, types: [com.waze.an.a.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32, types: [com.waze.an.a.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [h.g.a.a, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f13595c) {
            case 0:
                return af.d(this.f13593a, (com.waze.shared_infra.q.i) this.f13594b);
            case 1:
                return el.ad((el) this.f13594b, (com.waze.install.o) this.f13593a);
            case 2:
                this.f13594b.invoke();
                this.f13593a.invoke();
                return h.ab.f48028a;
            case 3:
                ((com.waze.ads.c.m) this.f13594b).r(this.f13593a);
                return h.ab.f48028a;
            case 4:
                this.f13593a.b(((com.waze.j) this.f13594b).f());
                return h.ab.f48028a;
            case 5:
                al alVar = (al) this.f13593a;
                return Boolean.valueOf(Dp.m11163compareTo0680j_4(this.f13594b.mo2123toDpu2uoSUM(alVar.c().a()), ((Dp) alVar.a().getValue()).m11178unboximpl() + 66.0f) > 0);
            case 6:
                com.waze.l.v vVar = (com.waze.l.v) this.f13593a;
                vVar.q();
                if (((Boolean) this.f13594b.getValue()).booleanValue()) {
                    vVar.m();
                }
                return h.ab.f48028a;
            case 7:
                com.waze.l.v vVar2 = (com.waze.l.v) this.f13593a;
                vVar2.i();
                if (((Boolean) this.f13594b.getValue()).booleanValue()) {
                    vVar2.m();
                }
                return h.ab.f48028a;
            case 8:
                ?? r0 = this.f13594b;
                com.waze.l.v vVar3 = (com.waze.l.v) this.f13593a;
                vVar3.j(com.waze.design_components.c.b.f23377a, ((Boolean) r0.getValue()).booleanValue());
                if (((Boolean) r0.getValue()).booleanValue()) {
                    vVar3.m();
                }
                vVar3.e();
                return h.ab.f48028a;
            case 9:
                ?? r02 = this.f13594b;
                com.waze.l.v vVar4 = (com.waze.l.v) this.f13593a;
                vVar4.j(com.waze.design_components.c.b.f23378b, ((Boolean) r02.getValue()).booleanValue());
                if (((Boolean) r02.getValue()).booleanValue()) {
                    vVar4.m();
                }
                vVar4.f();
                return h.ab.f48028a;
            case 10:
                ((am) this.f13593a).f48101a = true;
                this.f13594b.l();
                return h.ab.f48028a;
            case 11:
                am amVar = (am) this.f13593a;
                if (amVar.f48101a) {
                    ?? r4 = this.f13594b;
                    amVar.f48101a = false;
                    r4.k();
                }
                return h.ab.f48028a;
            case 12:
                Intent intent = new Intent("android.intent.action.DIAL");
                Uri uri = Uri.parse("tel:".concat((String) this.f13593a));
                h.g.b.x.e(uri, "parse(...)");
                intent.setData(uri);
                ((CarContext) this.f13594b).startCarApp(intent);
                return h.ab.f48028a;
            case 13:
                ((com.waze.car_lib.r.e) this.f13593a).e((com.waze.car_lib.p.t) this.f13594b);
                return h.ab.f48028a;
            case 14:
                dd ddVar = (dd) this.f13593a;
                ddVar.b().invoke();
                ((com.waze.car_lib.screens.r) this.f13594b).d(ddVar.c());
                return h.ab.f48028a;
            case 15:
                dd ddVar2 = (dd) this.f13593a;
                ddVar2.d().invoke();
                ((com.waze.car_lib.screens.r) this.f13594b).d(ddVar2.c());
                return h.ab.f48028a;
            case 16:
                return com.waze.car_lib.screens.v.b((com.waze.car_lib.screens.v) this.f13594b, (String) this.f13593a);
            case 17:
                ((com.waze.car_lib.r.ae) this.f13594b).b((String) this.f13593a);
                return h.ab.f48028a;
            case 18:
                return bf.b((cw) this.f13594b, (bf) this.f13593a);
            case 19:
                return bq.b((bq) this.f13593a, (CarContext) this.f13594b);
            default:
                return cd.b((cd) this.f13593a, (CarContext) this.f13594b);
        }
    }

    public /* synthetic */ aa(Object obj, Object obj2, int i2, byte[] bArr) {
        this.f13595c = i2;
        this.f13594b = obj;
        this.f13593a = obj2;
    }
}
