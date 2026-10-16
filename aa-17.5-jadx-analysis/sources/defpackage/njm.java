package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import com.google.android.apps.auto.components.telecom.call.CarCall;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class njm implements afec {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ njm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [bwq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v72, types: [bwq, java.lang.Object] */
    @Override // defpackage.afec
    public final Object invoke(Object obj) {
        GhIcon ghIconJ;
        boolean z = false;
        ComponentName componentName = null;
        switch (this.b) {
            case 0:
                njn njnVar = (njn) this.a;
                njnVar.i = (nmj) obj;
                njnVar.a();
                break;
            case 1:
                njn njnVar2 = (njn) this.a;
                njnVar2.a = (nmj) obj;
                njnVar2.a();
                break;
            case 2:
                njn njnVar3 = (njn) this.a;
                njnVar3.h = (nmj) obj;
                njnVar3.a();
                break;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                boolean zBooleanValue = bool.booleanValue();
                njn njnVar4 = (njn) this.a;
                njnVar4.k = zBooleanValue;
                njnVar4.a();
                break;
            case 4:
                ((Boolean) obj).booleanValue();
                this.a.invoke();
                break;
            case 5:
                CarCall carCall = (CarCall) obj;
                carCall.getClass();
                Object obj2 = this.a;
                if (obj2 != null && carCall.a == ((PhoneCall) obj2).a) {
                    z = true;
                }
                break;
            case 6:
                ?? r0 = this.a;
                int i = nni.a;
                break;
            case 7:
                nur nurVar = (nur) obj;
                nurVar.getClass();
                nnk nnkVarJ = ((nnu) this.a).j(nurVar);
                break;
            case 8:
                nur nurVar2 = (nur) obj;
                nurVar2.getClass();
                nnu nnuVar = (nnu) this.a;
                nnk nnkVarJ2 = nnuVar.j(nurVar2);
                GhIcon ghIcon = nnkVarJ2.a;
                nuo nuoVar = nurVar2.x;
                ComponentName componentNameM = nnu.m(nurVar2);
                int iA = nuoVar.a();
                if (ghIcon == null || ghIcon.b != 6) {
                    ghIconJ = ogb.a.c() ? nurVar2.b : GhIcon.j(componentNameM);
                } else {
                    ghIconJ = null;
                }
                int i2 = nurVar2.h;
                nul nulVar = nurVar2.p;
                nnk nnkVarL = nulVar != null ? nnuVar.l(nnu.p(nulVar), yzy.kY, componentNameM, iA) : null;
                nul nulVar2 = nurVar2.q;
                nnk nnkVarL2 = nulVar2 != null ? nnuVar.l(nnu.p(nulVar2), yzy.kZ, componentNameM, iA) : null;
                nul nulVar3 = nurVar2.r;
                break;
            case 9:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Object obj3 = this.a;
                if (zBooleanValue2) {
                    ((eqj) obj3).m(true);
                } else {
                    eqj eqjVar = (eqj) obj3;
                    if (affa.f(eqjVar.e(), true)) {
                        nnu.a.l().u("HUN mode timed out, exiting.");
                        eqjVar.m(false);
                        yzy yzyVar = yzy.lc;
                        nnt nntVar = (nnt) obj3;
                        ComponentName componentName2 = nntVar.a;
                        if (componentName2 == null) {
                            affa.d("component");
                        } else {
                            componentName = componentName2;
                        }
                        nnu.n(yzyVar, componentName, 3);
                        nntVar.a();
                    }
                }
                break;
            case 10:
                cie cieVar = (cie) obj;
                int i3 = nny.a;
                cieVar.getClass();
                cieVar.a(true);
                cieVar.h((cil) this.a);
                break;
            case 11:
                ?? r02 = this.a;
                int i4 = nny.a;
                break;
            case 12:
                cie cieVar2 = (cie) obj;
                int i5 = nny.a;
                cieVar2.getClass();
                cieVar2.a(true);
                cieVar2.h((cil) this.a);
                break;
            case 13:
                ?? r03 = this.a;
                int i6 = nny.a;
                break;
            case 14:
                xrx xrxVar = (xrx) obj;
                xrxVar.getClass();
                xrxVar.a = wpq.U(xrxVar.a, new njm(this.a, 15));
                break;
            case 15:
                xry xryVar = (xry) obj;
                xryVar.getClass();
                nol nolVar = (nol) this.a;
                xryVar.b = Float.valueOf(nolVar.a);
                xryVar.a = Float.valueOf(nolVar.b);
                xryVar.c = nolVar.c;
                xryVar.d = xta.g(BitmapDescriptorFactory.HUE_RED);
                xryVar.e = 12.0f;
                break;
            case 16:
                xrx xrxVar2 = (xrx) obj;
                xrxVar2.getClass();
                xrxVar2.a = wpq.U(xrxVar2.a, new njm(this.a, 17));
                xrxVar2.b = wpq.X(xrxVar2.e(), new nle(11));
                xrxVar2.f = wpq.P(xrxVar2.a(), new nle(12));
                xqn xqnVar = xrxVar2.i;
                xrxVar2.i = xqnVar != null ? xqnVar : null;
                break;
            case 17:
                xry xryVar2 = (xry) obj;
                xryVar2.getClass();
                nom nomVar = (nom) this.a;
                xryVar2.b = Float.valueOf(nomVar.a);
                xryVar2.a = Float.valueOf(nomVar.b);
                xryVar2.c = nomVar.c;
                break;
            case 18:
                xrx xrxVar3 = (xrx) obj;
                xrxVar3.getClass();
                xrxVar3.a = wpq.U(xrxVar3.a, new njm(this.a, 19));
                break;
            case 19:
                xry xryVar3 = (xry) obj;
                xryVar3.getClass();
                non nonVar = (non) this.a;
                xryVar3.b = Float.valueOf(nonVar.a);
                float f = nonVar.b;
                xryVar3.a = Float.valueOf(f);
                xryVar3.c = xsz.e(f / 2.0f);
                xryVar3.d = xta.g(BitmapDescriptorFactory.HUE_RED);
                break;
            default:
                this.a.b(new dlq(((dlq) obj).a));
                break;
        }
        return afak.a;
    }
}
