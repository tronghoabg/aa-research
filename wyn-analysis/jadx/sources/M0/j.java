package M0;

import N.C0736m;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import o0.C3635c;
import t0.C4048M;

/* loaded from: classes.dex */
public final class j extends AbstractC3343n implements tf.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f7268i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0736m f7269j;
    public final /* synthetic */ C3635c k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ tf.l f7270l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ W.c f7271m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f7272n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C4048M f7273o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, C0736m c0736m, C3635c c3635c, tf.l lVar, W.c cVar, String str, C4048M c4048m) {
        super(0);
        this.f7268i = context;
        this.f7269j = c0736m;
        this.k = c3635c;
        this.f7270l = lVar;
        this.f7271m = cVar;
        this.f7272n = str;
        this.f7273o = c4048m;
    }

    @Override // tf.a
    public final Object invoke() {
        View typedView$ui_release;
        Context context = this.f7268i;
        AbstractC3340k.e(context, "context");
        C3635c dispatcher = this.k;
        AbstractC3340k.e(dispatcher, "dispatcher");
        o oVar = new o(context, this.f7269j, dispatcher);
        oVar.f7284v = m.k;
        oVar.setFactory(this.f7270l);
        W.c cVar = this.f7271m;
        Object objC = cVar != null ? cVar.c(this.f7272n) : null;
        SparseArray<Parcelable> sparseArray = objC instanceof SparseArray ? (SparseArray) objC : null;
        if (sparseArray != null && (typedView$ui_release = oVar.getTypedView$ui_release()) != null) {
            typedView$ui_release.restoreHierarchyState(sparseArray);
        }
        this.f7273o.f45446a = oVar;
        return oVar.getLayoutNode();
    }
}
