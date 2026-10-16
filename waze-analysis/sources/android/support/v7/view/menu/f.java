package android.support.v7.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f789a;

    f(k kVar) {
        this.f789a = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        k kVar = this.f789a;
        if (kVar.u()) {
            List list = kVar.f800b;
            if (list.size() <= 0 || ((j) list.get(0)).f796a.G()) {
                return;
            }
            View view = kVar.f802d;
            if (view == null || !view.isShown()) {
                kVar.k();
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((j) it.next()).f796a.s();
            }
        }
    }
}
