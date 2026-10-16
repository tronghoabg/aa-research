package n3;

import android.view.View;
import com.wynauto.wyn.R;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import tf.l;

/* loaded from: classes.dex */
public final class g extends AbstractC3343n implements l {

    /* renamed from: j, reason: collision with root package name */
    public static final g f40913j = new g(1, 0);
    public static final g k = new g(1, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f40914i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i5, int i10) {
        super(i5);
        this.f40914i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f40914i) {
            case 0:
                View view = (View) obj;
                AbstractC3340k.e(view, "view");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View view2 = (View) obj;
                AbstractC3340k.e(view2, "view");
                Object tag = view2.getTag(R.id.view_tree_saved_state_registry_owner);
                if (tag instanceof f) {
                    return (f) tag;
                }
                return null;
        }
    }
}
