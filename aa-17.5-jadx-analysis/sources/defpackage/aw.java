package defpackage;

import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class aw implements pr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.pr
    public final /* synthetic */ Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            Object obj2 = this.a;
            if (i != 2) {
                return ((RecyclerView) obj).h(((rbx) obj2).a);
            }
            return ((RecyclerView) obj).i(((rbx) obj2).b);
        }
        Fragment fragment = (Fragment) this.a;
        Object obj3 = fragment.mHost;
        return obj3 instanceof pd ? ((pd) obj3).gA() : fragment.requireActivity().j;
    }
}
