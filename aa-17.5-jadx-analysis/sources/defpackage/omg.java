package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.auto.components.ui.listview.GhListView;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class omg extends osq {
    final /* synthetic */ GhListView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public omg(GhListView ghListView) {
        super(null);
        this.a = ghListView;
    }

    @Override // defpackage.osq
    public final void a(RecyclerView recyclerView, int i) {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((osq) it.next()).a(recyclerView, i);
        }
    }

    @Override // defpackage.osq
    public final void b(RecyclerView recyclerView, int i, int i2) {
        GhListView ghListView = this.a;
        Iterator it = ghListView.a.iterator();
        while (it.hasNext()) {
            ((osq) it.next()).b(recyclerView, i, i2);
        }
        ghListView.i().hasFocus();
    }

    @Override // defpackage.osq
    public final void c() {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((osq) it.next()).c();
        }
    }

    @Override // defpackage.osq
    public final void d() {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((osq) it.next()).d();
        }
    }

    @Override // defpackage.osq
    public final void e(int i) {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((osq) it.next()).e(i);
        }
    }

    @Override // defpackage.osq
    public final void f(int i) {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            ((osq) it.next()).f(i);
        }
    }
}
