package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.auto.components.apphost.view.widgets.common.ScrollableContentView;
import com.google.android.apps.auto.sdk.ui.PagedListView;

/* loaded from: classes2.dex */
public final /* synthetic */ class oxf implements oxk {
    public final /* synthetic */ ViewGroup a;
    private final /* synthetic */ int b;

    public /* synthetic */ oxf(ViewGroup viewGroup, int i) {
        this.b = i;
        this.a = viewGroup;
    }

    @Override // defpackage.oxk
    public final void a(int i) {
        int i2 = this.b;
        ViewGroup viewGroup = this.a;
        if (i2 != 0) {
            if (i == 0) {
                ((ScrollableContentView) viewGroup).a.pageScroll(33);
                return;
            } else {
                ((ScrollableContentView) viewGroup).a.pageScroll(130);
                return;
            }
        }
        if (i == 0) {
            PagedListView pagedListView = (PagedListView) viewGroup;
            if (pagedListView.l) {
                pagedListView.p.aB();
            } else {
                pagedListView.o.aA();
            }
            osq osqVar = pagedListView.u;
            if (osqVar != null) {
                osqVar.f(2);
                return;
            }
            return;
        }
        PagedListView pagedListView2 = (PagedListView) viewGroup;
        if (pagedListView2.l) {
            pagedListView2.p.aA();
        } else {
            pagedListView2.o.a();
        }
        osq osqVar2 = pagedListView2.u;
        if (osqVar2 != null) {
            osqVar2.e(2);
        }
    }
}
