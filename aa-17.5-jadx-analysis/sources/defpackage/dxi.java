package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.car.app.model.Alert;
import com.google.android.apps.auto.components.apphost.basewidgets.action.ui.ContentActionsViewShim;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class dxi extends afde implements afeg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(aitf aitfVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = aitfVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [aitf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v33, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v36, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v37, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [aitf, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        switch (this.b) {
            case 0:
                return new dxi((aitf) this.a, afckVar, 0);
            case 1:
                return new dxi((dwu) this.a, afckVar, 1);
            case 2:
                return new dxi((aitf) this.a, afckVar, 2, (byte[]) null);
            case 3:
                return new dxi((egt) this.a, afckVar, 3);
            case 4:
                return new dxi((egt) this.a, afckVar, 4, (byte[]) null);
            case 5:
                return new dxi((eph) this.a, afckVar, 5);
            case 6:
                return new dxi((eph) this.a, afckVar, 6, (byte[]) null);
            case 7:
                return new dxi((eys) this.a, afckVar, 7);
            case 8:
                return new dxi((fod) this.a, afckVar, 8);
            case 9:
                return new dxi((frf) this.a, afckVar, 9);
            case 10:
                return new dxi((cil) this.a, afckVar, 10);
            case 11:
                return new dxi((gvl) this.a, afckVar, 11);
            case 12:
                return new dxi((gsv) this.a, afckVar, 12);
            case 13:
                return new dxi((hmw) this.a, afckVar, 13);
            case 14:
                return new dxi((cil) this.a, afckVar, 14, (byte[]) null);
            case 15:
                return new dxi((ContentActionsViewShim) this.a, afckVar, 15);
            case 16:
                return new dxi((jxq) this.a, afckVar, 16);
            case 17:
                return new dxi((bwq) this.a, afckVar, 17);
            case 18:
                return new dxi((Bitmap) this.a, afckVar, 18);
            case 19:
                return new dxi((bym) this.a, afckVar, 19);
            default:
                return new dxi((bym) this.a, afckVar, 20, (byte[]) null);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [afck, aitf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v62, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v67, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v72, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [afck, aitf, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        switch (this.b) {
            case 0:
                woy.dF(obj);
                ?? r4 = this.a;
                if (r4.h()) {
                    r4.w(afak.a);
                }
                return afak.a;
            case 1:
                woy.dF(obj);
                dwu dwuVar = (dwu) this.a;
                if (dwuVar.b.await(1000L, TimeUnit.MILLISECONDS)) {
                    return new Integer(Log.i(dwu.a, "waitForResponse: VoIP app returned a result"));
                }
                Log.i(dwu.a, "waitForResponse: latch timeout reached");
                dwuVar.c = new dwo(6);
                return afak.a;
            case 2:
                woy.dF(obj);
                ?? r42 = this.a;
                if (r42.h()) {
                    r42.w(afak.a);
                }
                return afak.a;
            case 3:
                woy.dF(obj);
                return new Integer(((egt) this.a).f().a());
            case 4:
                woy.dF(obj);
                return new Integer(((egt) this.a).f().b());
            case 5:
                woy.dF(obj);
                ((eph) this.a).b();
                return afak.a;
            case 6:
                woy.dF(obj);
                ((eph) this.a).b();
                return afak.a;
            case 7:
                woy.dF(obj);
                ((eys) this.a).e.incrementAndGet();
                return afak.a;
            case 8:
                woy.dF(obj);
                String str = fpl.a;
                fjo fjoVarA = fjo.a();
                Object obj2 = this.a;
                Objects.toString(obj2);
                fjoVarA.c(str, "Constraints changed for ".concat(String.valueOf(obj2)));
                return afak.a;
            case 9:
                woy.dF(obj);
                Object obj3 = this.a;
                synchronized (obj3) {
                    if (!((frf) obj3).d || ((frf) obj3).e) {
                        return afak.a;
                    }
                    try {
                        ((frf) obj3).c();
                    } catch (IOException unused) {
                        ((frf) obj3).f = true;
                    }
                    try {
                        if (((frf) obj3).e()) {
                            ((frf) obj3).d();
                        }
                    } catch (IOException unused2) {
                        ((frf) obj3).g = true;
                        ((frf) obj3).b = ahfm.a(new ajmw());
                    }
                    return afak.a;
                }
            case 10:
                woy.dF(obj);
                ((cil) this.a).a(7);
                return afak.a;
            case 11:
                woy.dF(obj);
                ((ynz) gro.a.e().o(ypi.a, "CarApp.H.Overlay").ai(81)).y("overlayStyle: %s", this.a);
                return afak.a;
            case 12:
                woy.dF(obj);
                ((ynz) ((yns) ((gsv) this.a).b).f().o(ypi.a, "CarApp.H.Nav.Alert").ai(84)).u("Received new Alert");
                return afak.a;
            case 13:
                woy.dF(obj);
                ((hmw) this.a).d.d(null);
                return afak.a;
            case 14:
                woy.dF(obj);
                ((cil) this.a).a(7);
                return afak.a;
            case 15:
                woy.dF(obj);
                ((ContentActionsViewShim) this.a).c.a(7);
                return afak.a;
            case 16:
                woy.dF(obj);
                ((jxq) this.a).b++;
                return afak.a;
            case 17:
                woy.dF(obj);
                this.a.b(true);
                return afak.a;
            case 18:
                woy.dF(obj);
                return new abzy(((gjn) mki.a.i(gjn.class)).a((Bitmap) this.a));
            case 19:
                woy.dF(obj);
                ?? r43 = this.a;
                if (mjv.f(r43) == nap.b) {
                    mwc.a(yzy.Hn, null);
                } else if (mjv.f(r43) == nap.c) {
                    mwc.a(yzy.Ho, null);
                }
                return afak.a;
            default:
                woy.dF(obj);
                Boolean boolS = mva.s(this.a);
                if (affa.f(boolS, true)) {
                    mwc.a(yzy.Ht, null);
                } else if (affa.f(boolS, false)) {
                    mwc.a(yzy.Hv, null);
                } else if (boolS != null) {
                    throw new aezs();
                }
                return afak.a;
        }
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 1:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 2:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 3:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 4:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 5:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 6:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 7:
                return ((dxi) b((aiyl) obj, (afck) obj2)).hT(afak.a);
            case 8:
                return ((dxi) b((flq) obj, (afck) obj2)).hT(afak.a);
            case 9:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 10:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 11:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 12:
                return ((dxi) b((Alert) obj, (afck) obj2)).hT(afak.a);
            case 13:
                return ((dxi) b((hju) obj, (afck) obj2)).hT(afak.a);
            case 14:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 15:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 16:
                return ((dxi) b((gru) obj, (afck) obj2)).hT(afak.a);
            case 17:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 18:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 19:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
            default:
                return ((dxi) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(aitf aitfVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.b = i;
        this.a = aitfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(Bitmap bitmap, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(bwq bwqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = bwqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(bym bymVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = bymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(bym bymVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.b = i;
        this.a = bymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(cil cilVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = cilVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(cil cilVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.b = i;
        this.a = cilVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(ContentActionsViewShim contentActionsViewShim, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = contentActionsViewShim;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(dwu dwuVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = dwuVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(egt egtVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = egtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(egt egtVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.b = i;
        this.a = egtVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(eph ephVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = ephVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(eph ephVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.b = i;
        this.a = ephVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(eys eysVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = eysVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(fod fodVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = fodVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(frf frfVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = frfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(gsv gsvVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = gsvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(gvl gvlVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = gvlVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(hmw hmwVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = hmwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxi(jxq jxqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.b = i;
        this.a = jxqVar;
    }
}
