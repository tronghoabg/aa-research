package androidx.activity;

import android.view.View;
import com.wynauto.wyn.R;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;

/* loaded from: classes.dex */
public final class z extends AbstractC3343n implements tf.l {

    /* renamed from: j, reason: collision with root package name */
    public static final z f17752j = new z(1, 0);
    public static final z k = new z(1, 1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17753i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(int i5, int i10) {
        super(i5);
        this.f17753i = i10;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f17753i) {
            case 0:
                View it = (View) obj;
                AbstractC3340k.e(it, "it");
                Object parent = it.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            default:
                View it2 = (View) obj;
                AbstractC3340k.e(it2, "it");
                Object tag = it2.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (tag instanceof y) {
                    return (y) tag;
                }
                return null;
        }
    }
}
