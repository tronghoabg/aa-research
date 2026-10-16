package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.gms.car.control.CarAction;

/* loaded from: classes2.dex */
public final /* synthetic */ class nla implements afdr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public /* synthetic */ nla(aitx aitxVar, CarAction carAction, afec afecVar, npe npeVar, int i, bym bymVar, int i2) {
        this.g = i2;
        this.b = aitxVar;
        this.c = carAction;
        this.d = afecVar;
        this.e = npeVar;
        this.a = i;
        this.f = bymVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [cdp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [aitx, java.lang.Object] */
    @Override // defpackage.afdr
    public final Object invoke() {
        if (this.g == 0) {
            ?? r5 = this.f;
            int i = this.a;
            Object obj = this.e;
            ahnc.d(this.b, null, 0, new nlb((CarAction) this.c, this.d, (npe) obj, i, r5, null), 3);
            return afak.a;
        }
        Object obj2 = this.e;
        obj2.getClass();
        ?? r2 = this.b;
        Object obj3 = this.f;
        cym cymVar = (cym) obj2;
        View view = (View) r2.invoke(obj3);
        tp tpVar = new tp();
        int i2 = this.a;
        return new dms((Context) obj3, (bvb) this.c, view, tpVar, this.d, i2, cymVar).v;
    }

    public /* synthetic */ nla(Context context, afec afecVar, bvb bvbVar, cdp cdpVar, int i, View view, int i2) {
        this.g = i2;
        this.f = context;
        this.b = afecVar;
        this.c = bvbVar;
        this.d = cdpVar;
        this.a = i;
        this.e = view;
    }
}
