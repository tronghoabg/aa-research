package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.util.Log;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class dxa extends afde implements afeg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(aabf aabfVar, PhoneAccountHandle phoneAccountHandle, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = aabfVar;
        this.b = phoneAccountHandle;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [eqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v11, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v19, types: [dlg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v22, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v25, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v30, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [eqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [aitf, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        switch (this.c) {
            case 0:
                return new dxa((aabf) this.a, (PhoneAccountHandle) this.b, afckVar, 0);
            case 1:
                return new dxa((sx) this.b, (afec) this.a, afckVar, 1);
            case 2:
                return new dxa((aitf) this.a, (dyy) this.b, afckVar, 2);
            case 3:
                return new dxa((eql) this.a, (eqj) this.b, afckVar, 3);
            case 4:
                return new dxa((eqj) this.b, (eqn) this.a, afckVar, 4);
            case 5:
                return new dxa((eqj) this.b, this.a, afckVar, 5, null);
            case 6:
                return new dxa((fuq) this.a, (cil) this.b, afckVar, 6);
            case 7:
                return new dxa((afdr) this.a, (bwq) this.b, afckVar, 7);
            case 8:
                return new dxa((gjn) this.a, (Bitmap) this.b, afckVar, 8);
            case 9:
                return new dxa((gvw) this.a, (cil) this.b, afckVar, 9);
            case 10:
                return new dxa((afeg) this.a, (axr) this.b, afckVar, 10);
            case 11:
                return new dxa((afeg) this.a, (bym) this.b, afckVar, 11);
            case 12:
                return new dxa((hjo) this.a, (dlg) this.b, afckVar, 12);
            case 13:
                return new dxa((gmz) this.a, (cil) this.b, afckVar, 13);
            case 14:
                return new dxa((mtz) this.a, (bwq) this.b, afckVar, 14);
            case 15:
                return new dxa((mzy) this.a, (Bitmap) this.b, afckVar, 15);
            case 16:
                return new dxa((bym) this.a, (bwq) this.b, afckVar, 16);
            case 17:
                return new dxa((naq) this.a, (byd) this.b, afckVar, 17);
            case 18:
                return new dxa((Integer) this.b, (afha) this.a, afckVar, 18);
            case 19:
                return new dxa((kjk) this.a, (bym) this.b, afckVar, 19);
            default:
                return new dxa((CarCall) this.b, (ofq) this.a, afckVar, 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [dlg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v30, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v21, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v33, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v51, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v14, types: [afck, aitf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v17, types: [eqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v18, types: [eqn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v23, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v32, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v33, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v46, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v57, types: [bym, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        Object next = null;
        switch (this.c) {
            case 0:
                woy.dF(obj);
                try {
                    Object obj2 = ((aabf) this.a).a;
                    Object obj3 = this.b;
                    Object systemService = ((Context) ((rz) obj2).b).getSystemService("telecom");
                    systemService.getClass();
                    return ((TelecomManager) systemService).getPhoneAccount((PhoneAccountHandle) obj3);
                } catch (SecurityException unused) {
                    Log.i("CallExtensions", "getPhoneAccountIfAllowed: Unable to resolve call extension type due to lack of permission.");
                    return null;
                }
            case 1:
                woy.dF(obj);
                sx sxVar = (sx) this.b;
                bqr bqrVarH = sxVar.h();
                bqr bqrVar = bqr.c;
                if (bqrVarH != bqrVar) {
                    ?? r12 = this.a;
                    if (sxVar.e() != BitmapDescriptorFactory.HUE_RED && !Float.isNaN(sxVar.e())) {
                        bqrVar = sxVar.e() > BitmapDescriptorFactory.HUE_RED ? bqr.a : bqr.b;
                    }
                    r12.invoke(bqrVar);
                }
                return afak.a;
            case 2:
                woy.dF(obj);
                ?? r13 = this.a;
                if (r13.h()) {
                    r13.w(this.b);
                }
                return afak.a;
            case 3:
                woy.dF(obj);
                Object obj4 = this.a;
                ewg ewgVar = new ewg(new ddz(obj4, 18), 1);
                eqj eqjVar = (eqj) this.b;
                eql eqlVar = (eql) obj4;
                eqlVar.r(eqjVar, ewgVar);
                return new eph(eqjVar, eqlVar);
            case 4:
                woy.dF(obj);
                ((eqj) this.b).i(this.a);
                return afak.a;
            case 5:
                woy.dF(obj);
                ((eqj) this.b).k(this.a);
                return afak.a;
            case 6:
                woy.dF(obj);
                if (!((fuq) this.a).f.isEmpty()) {
                    ((cil) this.b).a(7);
                }
                return afak.a;
            case 7:
                woy.dF(obj);
                if (((Boolean) this.b.a()).booleanValue()) {
                    this.a.invoke();
                }
                return afak.a;
            case 8:
                woy.dF(obj);
                return new Integer(((gjn) this.a).a((Bitmap) this.b));
            case 9:
                woy.dF(obj);
                if (!((gvw) this.a).f.isEmpty()) {
                    ((cil) this.b).a(7);
                }
                return afak.a;
            case 10:
                woy.dF(obj);
                ?? r132 = this.a;
                if (r132 != 0) {
                    axr axrVar = (axr) this.b;
                    r132.invoke(new Integer(axrVar.b()), new Integer(axrVar.c()));
                }
                return afak.a;
            case 11:
                woy.dF(obj);
                ?? r133 = this.b;
                if (!roc.ag(r133).isEmpty()) {
                    this.a.invoke(new Integer(((axk) woy.bF(roc.ag(r133))).a), new Integer(((axk) woy.bK(roc.ag(r133))).a + 1));
                }
                return afak.a;
            case 12:
                woy.dF(obj);
                ((ype) jva.a.f()).J("AapComposableView breakpoint: %s, density: %s", this.a, this.b.a());
                return afak.a;
            case 13:
                woy.dF(obj);
                if (!((gmz) this.a).b.isEmpty()) {
                    ((cil) this.b).a(7);
                }
                return afak.a;
            case 14:
                woy.dF(obj);
                this.b.b(Boolean.valueOf(false));
                ((mtz) this.a).c.m(new Float(BitmapDescriptorFactory.HUE_RED));
                return afak.a;
            case 15:
                woy.dF(obj);
                Object objCreateScaledBitmap = this.b;
                Bitmap bitmap = (Bitmap) objCreateScaledBitmap;
                int iIntValue = -16777216;
                if (!bitmap.isRecycled()) {
                    if (bitmap.getWidth() > 128 && bitmap.getHeight() > 128) {
                        objCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 128, 128, false);
                        objCreateScaledBitmap.getClass();
                    }
                    Bitmap bitmap2 = (Bitmap) objCreateScaledBitmap;
                    int width = bitmap2.getWidth();
                    int height = bitmap2.getHeight();
                    int[] iArr = new int[width * height];
                    bitmap2.getPixels(iArr, 0, width, 0, 0, width, height);
                    Iterator it = abzi.i(iArr).keySet().iterator();
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            Integer num = (Integer) next;
                            num.getClass();
                            double dA = acaf.a(num.intValue());
                            do {
                                Object next2 = it.next();
                                Integer num2 = (Integer) next2;
                                num2.getClass();
                                double dA2 = acaf.a(num2.intValue());
                                int iCompare = Double.compare(dA, dA2);
                                if (iCompare > 0) {
                                    dA = dA2;
                                }
                                if (iCompare > 0) {
                                    next = next2;
                                }
                            } while (it.hasNext());
                        }
                    }
                    Integer num3 = (Integer) next;
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    }
                }
                return new Integer(iIntValue);
            case 16:
                woy.dF(obj);
                this.b.b(Boolean.valueOf(((Boolean) this.a.a()).booleanValue()));
                return afak.a;
            case 17:
                woy.dF(obj);
                if (((byd) this.b).e() != -1) {
                    ((naq) this.a).b(afbe.a);
                }
                return afak.a;
            case 18:
                woy.dF(obj);
                nkx.a.l().M("Creating control with value %d and range %s", this.b, this.a);
                return afak.a;
            case 19:
                woy.dF(obj);
                nkx.a.l().M("Control: %s, Bottom Label: %s", this.a, nkx.b(this.b));
                return afak.a;
            default:
                woy.dF(obj);
                CarCall carCall = (CarCall) this.b;
                return jxn.c().b(odn.a().u(carCall), odn.a().p(((ofq) this.a).b, carCall));
        }
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 1:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 2:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 3:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 4:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 5:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 6:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 7:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 8:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 9:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 10:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 11:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 12:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 13:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 14:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 15:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 16:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 17:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 18:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            case 19:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
            default:
                return ((dxa) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(afdr afdrVar, bwq bwqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = afdrVar;
        this.b = bwqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(afeg afegVar, axr axrVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = afegVar;
        this.b = axrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(afeg afegVar, bym bymVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = afegVar;
        this.b = bymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(aitf aitfVar, dyy dyyVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = aitfVar;
        this.b = dyyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(bym bymVar, bwq bwqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = bymVar;
        this.b = bwqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(CarCall carCall, ofq ofqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = carCall;
        this.a = ofqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(eqj eqjVar, eqn eqnVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = eqjVar;
        this.a = eqnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(eqj eqjVar, eqn eqnVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.c = i;
        this.b = eqjVar;
        this.a = eqnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(eql eqlVar, eqj eqjVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = eqlVar;
        this.b = eqjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(fuq fuqVar, cil cilVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = fuqVar;
        this.b = cilVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(gjn gjnVar, Bitmap bitmap, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = gjnVar;
        this.b = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(gmz gmzVar, cil cilVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = gmzVar;
        this.b = cilVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(gvw gvwVar, cil cilVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = gvwVar;
        this.b = cilVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(hjo hjoVar, dlg dlgVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = hjoVar;
        this.b = dlgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(Integer num, afha afhaVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = num;
        this.a = afhaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(kjk kjkVar, bym bymVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = kjkVar;
        this.b = bymVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(mtz mtzVar, bwq bwqVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = mtzVar;
        this.b = bwqVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(mzy mzyVar, Bitmap bitmap, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = mzyVar;
        this.b = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(naq naqVar, byd bydVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = naqVar;
        this.b = bydVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxa(sx sxVar, afec afecVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.b = sxVar;
        this.a = afecVar;
    }
}
