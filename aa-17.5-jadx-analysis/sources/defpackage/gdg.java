package defpackage;

import android.graphics.Rect;
import android.os.RemoteException;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Place;
import androidx.car.app.serialization.Bundleable;
import com.android.car.libraries.apphost.external.model.TelephoneKeypadTemplate;

/* loaded from: classes2.dex */
public final /* synthetic */ class gdg implements afec {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gdg(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, vi] */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.Object, vu] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.Object, uc] */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, sr] */
    /* JADX WARN: Type inference failed for: r14v23, types: [androidx.car.app.ISurfaceCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v25, types: [java.lang.Object, vi] */
    /* JADX WARN: Type inference failed for: r14v27, types: [androidx.car.app.ISurfaceCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v29, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v31, types: [java.lang.Object, uc] */
    /* JADX WARN: Type inference failed for: r14v33, types: [androidx.car.app.ISurfaceCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v48, types: [java.lang.Object, xc] */
    /* JADX WARN: Type inference failed for: r14v50, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v29, types: [dlg, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) throws RemoteException {
        fvv fvvVar;
        switch (this.c) {
            case 0:
                ((geu) this.a).t().b(gnk.K, new aia(this.b, ((Integer) obj).intValue(), 12));
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                glp glpVarT = ((geu) this.b).t();
                uc dialedNumberChangedDelegate = ((TelephoneKeypadTemplate) this.a).getDialedNumberChangedDelegate();
                dialedNumberChangedDelegate.getClass();
                glpVarT.k(dialedNumberChangedDelegate, str);
                break;
            case 2:
                ((geu) this.a).t().b(gnk.L, new aia(this.b, ((Integer) obj).intValue(), 10));
                break;
            case 3:
                ((geu) this.a).t().b(gnk.M, new aia(this.b, ((Integer) obj).intValue(), 11));
                break;
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                uc phoneNumberChangedDelegate = ((androidx.car.app.dialer.TelephoneKeypadTemplate) this.b).getPhoneNumberChangedDelegate();
                if (phoneNumberChangedDelegate != null) {
                    ((geu) this.a).t().k(phoneNumberChangedDelegate, str2);
                }
                break;
            case 5:
                gej gejVar = (gej) obj;
                gejVar.getClass();
                this.b.sendSearchTextChanged((String) this.a, gejVar);
                break;
            case 6:
                gej gejVar2 = (gej) obj;
                gejVar2.getClass();
                this.b.sendTabSelected((String) this.a, gejVar2);
                break;
            case 7:
                gej gejVar3 = (gej) obj;
                gejVar3.getClass();
                this.b.sendInputTextChanged((String) this.a, gejVar3);
                break;
            case 8:
                gej gejVar4 = (gej) obj;
                gejVar4.getClass();
                this.b.sendTextReply((String) this.a, gejVar4);
                break;
            case 9:
                gej gejVar5 = (gej) obj;
                gejVar5.getClass();
                this.b.onSurfaceAvailable(new Bundleable(this.a), gejVar5);
                break;
            case 10:
                gej gejVar6 = (gej) obj;
                gejVar6.getClass();
                this.b.sendSearchSubmitted((String) this.a, gejVar6);
                break;
            case 11:
                gej gejVar7 = (gej) obj;
                gejVar7.getClass();
                this.a.onVisibleAreaChanged((Rect) this.b, gejVar7);
                break;
            case 12:
                glf glfVar = (glf) obj;
                glfVar.getClass();
                glp glpVar = (glp) this.b;
                this.a.invoke(new gej(glpVar.b, glpVar.a, glfVar, glpVar.c, glpVar.d));
                break;
            case 13:
                gej gejVar8 = (gej) obj;
                gejVar8.getClass();
                this.b.sendInputSubmitted((String) this.a, gejVar8);
                break;
            case 14:
                gej gejVar9 = (gej) obj;
                gejVar9.getClass();
                this.a.onStableAreaChanged((Rect) this.b, gejVar9);
                break;
            case 15:
                gnw gnwVar = (gnw) obj;
                gnwVar.getClass();
                gpc gpcVar = gnwVar.a;
                gpcVar.k(roc.ag(this.a));
                gpcVar.i((Place) this.b);
                break;
            case 16:
                Action action = (Action) obj;
                action.getClass();
                boolean zJ = fvr.j(action);
                Object obj2 = this.a;
                if (zJ) {
                    fwc fwcVar = new fwc(obj2, this.b, 0);
                    CarColor backgroundColor = true != fvr.d(action) ? null : action.getBackgroundColor();
                    int flags = action.getFlags();
                    boolean zIsEnabled = action.isEnabled();
                    int type = action.getType();
                    CarIcon icon = action.getIcon();
                    if (icon == null) {
                        icon = CarIcon.PAN;
                    }
                    CarIcon carIcon = icon;
                    CarText title = action.getTitle();
                    fvvVar = new fvv(flags, zIsEnabled, type, backgroundColor, carIcon, fwcVar, title != null ? fzo.f(title) : null, false, null);
                } else {
                    fvvVar = null;
                }
                if (fvvVar == null) {
                    fvvVar = fvr.b(action, (geu) obj2, null);
                }
                break;
            case 17:
                ((geu) this.a).t().n(this.b, ((Boolean) obj).booleanValue());
                break;
            case 18:
                cst cstVar = (cst) obj;
                cstVar.getClass();
                this.b.b(new dlj(this.a.ey((int) (cstVar.h() >> 32))));
                break;
            case 19:
                float fFloatValue = ((Float) obj).floatValue();
                ?? r0 = this.b;
                if (!((Boolean) r0.a()).booleanValue()) {
                    r0.b(Boolean.valueOf(true));
                }
                ((byb) this.a).h(fFloatValue);
                break;
            default:
                ((cho) obj).getClass();
                Object obj3 = this.a;
                Object obj4 = this.b;
                if (obj4 != null) {
                    obj3 = obj4;
                }
                ((cil) obj3).a(7);
                break;
        }
        return afak.a;
    }

    public /* synthetic */ gdg(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
