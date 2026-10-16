package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.google.android.gms.car.CarWindowLayoutParams;

/* loaded from: classes2.dex */
public final /* synthetic */ class ocg implements rby {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ ocg(Rect rect, Rect rect2, nsu nsuVar, yfq yfqVar, mtr mtrVar, int i) {
        this.f = i;
        this.e = rect;
        this.a = rect2;
        this.b = nsuVar;
        this.d = yfqVar;
        this.c = mtrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View$OnClickListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, ocx] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.rby
    public final View a(Context context) {
        if (this.f == 0) {
            View viewB = this.b.b(context, (ocs) this.c, ((CarWindowLayoutParams) this.d).h);
            ?? r0 = this.e;
            viewB.setOnClickListener(r0);
            ols.b(viewB, new jxf(this.a, r0, 12, null));
            return viewB;
        }
        context.getClass();
        mtq mtqVar = new mtq(context, (Rect) this.e, (Rect) this.a, ((nsu) this.b).d, this.d);
        mtr mtrVar = (mtr) this.c;
        mtrVar.d().b = mtqVar;
        Object obj = mtrVar.d().c;
        if (obj != null) {
            mtqVar.a(((Number) obj).intValue());
        }
        return mtqVar;
    }

    public /* synthetic */ ocg(oco ocoVar, ocx ocxVar, ocs ocsVar, CarWindowLayoutParams carWindowLayoutParams, ocm ocmVar, int i) {
        this.f = i;
        this.a = ocoVar;
        this.b = ocxVar;
        this.c = ocsVar;
        this.d = carWindowLayoutParams;
        this.e = ocmVar;
    }
}
