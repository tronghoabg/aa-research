package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.apps.auto.components.telecom.PhoneCall;
import j$.util.Collection;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class ndw implements afdr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ndw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v24, types: [aezr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v27, types: [aezr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [bym, java.lang.Object] */
    @Override // defpackage.afdr
    public final /* synthetic */ Object invoke() throws JSONException {
        ComponentName componentNameA = null;
        componentNameA = null;
        switch (this.b) {
            case 0:
                return (GhIcon) this.a.a();
            case 1:
                sx sxVar = (sx) this.a;
                return new aezu(Float.valueOf(sxVar.f()), sxVar.i());
            case 2:
                return (String) this.a.a();
            case 3:
                return mlq.i(this.a);
            case 4:
                mwc.c(yzy.aa, null);
                nea neaVar = (nea) this.a;
                PhoneCall phoneCall = (PhoneCall) neaVar.d.e();
                if (phoneCall != null && !phoneCall.b()) {
                    componentNameA = mcd.A().a(neaVar.c, phoneCall.f.getPackageName());
                }
                Intent intent = new Intent();
                if (componentNameA == null) {
                    componentNameA = mkn.b;
                    componentNameA.getClass();
                }
                intent.setComponent(componentNameA);
                mlq.g(intent);
                return afak.a;
            case 5:
                sx sxVar2 = (sx) this.a;
                return new aezu(Float.valueOf(sxVar2.f()), sxVar2.i());
            case 6:
                return this.a;
            case 7:
                return ((ndw) this.a).a;
            case 8:
                return ebi.h(this.a).getViewModelStore();
            case 9:
                eru eruVarH = ebi.h(this.a);
                epo epoVar = eruVarH instanceof epo ? (epo) eruVarH : null;
                return epoVar != null ? epoVar.getDefaultViewModelCreationExtras() : esa.a;
            case 10:
                return ((agg) this.a).d();
            case 11:
                return ((agg) this.a).d();
            case 12:
                return ((agg) this.a).d();
            case 13:
                return ((ob) this.a).getDefaultViewModelProviderFactory();
            case 14:
                return ((ob) this.a).getViewModelStore();
            case 15:
                return ((ob) this.a).getDefaultViewModelCreationExtras();
            case 16:
                opr oprVarA = opr.a.a();
                oqa oqaVar = oprVarA.g;
                int i = ((oqb) this.a).a;
                Collection.EL.removeIf(oqaVar.a, new mqu(new cia(i, 9), 20));
                oprVarA.f.deleteAppWidgetId(i);
                oprVarA.i();
                return afak.a;
            case 17:
                return ((ob) this.a).getViewModelStore();
            default:
                return ((ob) this.a).getDefaultViewModelCreationExtras();
        }
    }
}
