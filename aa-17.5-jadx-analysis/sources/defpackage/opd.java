package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import java.util.List;

/* loaded from: classes2.dex */
public final class opd implements afei {
    final /* synthetic */ List a;
    final /* synthetic */ afec b;

    public opd(List list, afec afecVar) {
        this.a = list;
        this.b = afecVar;
    }

    @Override // defpackage.afei
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        bii biiVar = (bii) obj;
        int iIntValue = ((Number) obj2).intValue();
        bux buxVar = (bux) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (true != buxVar.C(biiVar) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != buxVar.A(iIntValue) ? 16 : 32;
        }
        if (buxVar.I((i & 147) != 146, i & 1)) {
            opt optVar = (opt) this.a.get(iIntValue);
            buxVar.v(170912359);
            AppWidgetProviderInfo appWidgetProviderInfo = optVar.c;
            opr oprVarA = opr.a.a();
            ComponentName componentName = appWidgetProviderInfo.provider;
            componentName.getClass();
            mva.H(optVar, oprVarA.j(componentName), this.b, buxVar, 8);
            buxVar.o();
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
