package androidx.lifecycle;

import android.view.View;
import com.wynauto.wyn.R;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class g0 extends AbstractC3343n implements tf.l {

    /* renamed from: j, reason: collision with root package name */
    public static final g0 f18671j = new g0(1, 0);
    public static final g0 k = new g0(1, 1);

    /* renamed from: l, reason: collision with root package name */
    public static final g0 f18672l = new g0(1, 2);

    /* renamed from: m, reason: collision with root package name */
    public static final g0 f18673m = new g0(1, 3);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18674i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(int i5, int i10) {
        super(i5);
        this.f18674i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f18674i) {
            case 0:
                View currentView = (View) obj;
                AbstractC3340k.e(currentView, "currentView");
                Object parent = currentView.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 1:
                View viewParent = (View) obj;
                AbstractC3340k.e(viewParent, "viewParent");
                Object tag = viewParent.getTag(R.id.view_tree_lifecycle_owner);
                if (tag instanceof InterfaceC1457v) {
                    return (InterfaceC1457v) tag;
                }
                return null;
            case 2:
                View view = (View) obj;
                AbstractC3340k.e(view, "view");
                Object parent2 = view.getParent();
                if (parent2 instanceof View) {
                    return (View) parent2;
                }
                return null;
            default:
                View view2 = (View) obj;
                AbstractC3340k.e(view2, "view");
                Object tag2 = view2.getTag(R.id.view_tree_view_model_store_owner);
                if (tag2 instanceof f0) {
                    return (f0) tag2;
                }
                return null;
        }
    }
}
