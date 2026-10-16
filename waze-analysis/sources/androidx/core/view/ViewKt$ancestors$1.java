package androidx.core.view;

import android.view.ViewParent;
import h.g.a.l;
import h.g.b.u;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final /* synthetic */ class ViewKt$ancestors$1 extends u implements l<ViewParent, ViewParent> {
    public static final ViewKt$ancestors$1 INSTANCE = new ViewKt$ancestors$1();

    ViewKt$ancestors$1() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // h.g.a.l
    public final ViewParent invoke(ViewParent viewParent) {
        x.f(viewParent, "p0");
        return viewParent.getParent();
    }
}
