package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
final class mvp extends afde implements afeg {
    final /* synthetic */ List a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvp(List list, float f, float f2, afck afckVar) {
        super(2, afckVar);
        this.a = list;
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        return new mvp(this.a, this.b, this.c, afckVar);
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        ComponentName componentName;
        opq opqVar;
        woy.dF(obj);
        ArrayList arrayList = new ArrayList();
        for (oqb oqbVar : this.a) {
            AppWidgetProviderInfo appWidgetProviderInfo = oqbVar.b;
            if ((appWidgetProviderInfo == null || (componentName = appWidgetProviderInfo.provider) == null) && (componentName = oqbVar.e) == null) {
                opqVar = null;
            } else {
                opqVar = new opq(componentName, appWidgetProviderInfo != null ? mva.x(appWidgetProviderInfo) : -1, appWidgetProviderInfo != null ? mva.w(appWidgetProviderInfo) : -1, (int) this.b, (int) this.c);
            }
            if (opqVar != null) {
                arrayList.add(opqVar);
            }
        }
        Set setCl = woy.cl(arrayList);
        opr oprVarA = opr.a.a();
        ((ype) opr.c.f()).D("setIncompatibleWidgets called with %d records: %s", setCl.size(), setCl);
        oprVarA.i = setCl;
        eqm eqmVar = oprVarA.j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = setCl.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((opq) it.next()).a);
        }
        eqmVar.m(linkedHashSet);
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((mvp) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }
}
