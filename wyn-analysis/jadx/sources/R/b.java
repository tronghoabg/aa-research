package R;

import android.view.View;
import ff.o;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import k1.J;
import k1.S;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.jvm.internal.AbstractC3343n;
import tf.l;

/* loaded from: classes.dex */
public final class b extends AbstractC3343n implements l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10009i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Collection f10010j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i5, Collection collection) {
        super(1);
        this.f10009i = i5;
        this.f10010j = collection;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        Collection<?> collection = this.f10010j;
        switch (this.f10009i) {
            case 0:
                return Boolean.valueOf(collection.contains(obj));
            case 1:
                return Boolean.valueOf(collection.contains(obj));
            case 2:
                return Boolean.valueOf(((List) obj).retainAll(collection));
            default:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC3340k.e(entry, "entry");
                View view = (View) entry.getValue();
                WeakHashMap weakHashMap = S.f38779a;
                return Boolean.valueOf(o.k0(collection, J.f(view)));
        }
    }
}
