package android.support.v7.widget;

import android.view.ViewGroup;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class dr {

    /* renamed from: a, reason: collision with root package name */
    public final eb f1369a;

    /* renamed from: b, reason: collision with root package name */
    int f1370b;

    /* renamed from: c, reason: collision with root package name */
    final bu f1371c;

    /* renamed from: d, reason: collision with root package name */
    private final gu f1372d;

    /* renamed from: e, reason: collision with root package name */
    private final fq f1373e;

    /* renamed from: f, reason: collision with root package name */
    private final ed f1374f;

    dr(eb ebVar, bu buVar, gt gtVar, fq fqVar) {
        dq dqVar = new dq(this);
        this.f1374f = dqVar;
        this.f1369a = ebVar;
        this.f1371c = buVar;
        this.f1372d = new gs(gtVar, this);
        this.f1373e = fqVar;
        this.f1370b = ebVar.getItemCount();
        ebVar.registerAdapterDataObserver(dqVar);
    }

    final int a(int i2) {
        return this.f1372d.b(this.f1369a.getItemViewType(i2));
    }

    final fe b(ViewGroup viewGroup, int i2) {
        return this.f1369a.onCreateViewHolder(viewGroup, this.f1372d.a(i2));
    }

    public final void c(int i2) {
        this.f1369a.getItemId(i2);
    }
}
