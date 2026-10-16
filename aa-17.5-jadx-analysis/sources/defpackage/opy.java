package defpackage;

import android.appwidget.AppWidgetProviderInfo;
import java.util.List;

/* loaded from: classes2.dex */
public final class opy extends afde implements afeg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opy(afdr afdrVar, bym bymVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = afdrVar;
        this.b = bymVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [bva, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.c;
        if (i == 0) {
            return new opy((afdr) this.a, (bym) this.b, afckVar, 0);
        }
        if (i == 1) {
            return new opy((List) this.a, (opr) this.b, afckVar, 1);
        }
        return new opy((aivj) this.a, (bva) this.b, afckVar, 2);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [afdr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [bva, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [aivh, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        int i = this.c;
        if (i == 0) {
            woy.dF(obj);
            if (mva.O(this.b) != null) {
                this.a.invoke();
            }
            return afak.a;
        }
        if (i != 1) {
            woy.dF(obj);
            this.a.s(null);
            this.b.d();
            return afak.a;
        }
        woy.dF(obj);
        for (AppWidgetProviderInfo appWidgetProviderInfo : this.a) {
            Object obj2 = this.b;
            opr oprVar = (opr) obj2;
            opn opnVar = oprVar.f;
            int iAllocateAppWidgetId = opnVar.allocateAppWidgetId();
            try {
                if (((opr) obj2).e.bindAppWidgetIdIfAllowed(iAllocateAppWidgetId, appWidgetProviderInfo.provider)) {
                    ((opr) obj2).g(iAllocateAppWidgetId, appWidgetProviderInfo);
                } else {
                    ((ype) opr.c.h()).y("Failed to bind default widget: %s", appWidgetProviderInfo.provider);
                    opnVar.deleteAppWidgetId(iAllocateAppWidgetId);
                }
            } catch (Exception e) {
                ((ype) ((ype) opr.c.h()).p(e)).y("Exception binding default widget: %s", appWidgetProviderInfo.provider);
                oprVar.f.deleteAppWidgetId(iAllocateAppWidgetId);
            }
        }
        ((opr) this.b).i();
        return afak.a;
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            return ((opy) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 1) {
            return ((opy) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((opy) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opy(aivj aivjVar, bva bvaVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = aivjVar;
        this.b = bvaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opy(List list, opr oprVar, afck afckVar, int i) {
        super(2, afckVar);
        this.c = i;
        this.a = list;
        this.b = oprVar;
    }
}
