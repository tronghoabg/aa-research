package defpackage;

import androidx.car.app.model.Row;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowListView;

/* loaded from: classes2.dex */
public final class kee implements hie {
    final /* synthetic */ geu a;
    final /* synthetic */ RowListView b;

    public kee(RowListView rowListView, geu geuVar) {
        this.a = geuVar;
        this.b = rowListView;
    }

    @Override // defpackage.hie
    public final void a(int i) {
        kdx kdxVarB;
        ohu.a().b((rrc) rrc.h(yxy.GEARHEAD, yzz.CAR_APP_LIBRARY, yzy.sP).l());
        RowListView rowListView = this.b;
        rowListView.f(this.a, i, true);
        him himVarA = rowListView.a(i);
        if (himVarA == null || ((Row) himVarA.a).getToggle() == null || (kdxVarB = rowListView.b(i)) == null) {
            return;
        }
        kdxVarB.e();
        himVarA.m = !himVarA.m;
    }

    @Override // defpackage.hie
    public final void b(int i, boolean z) {
        RowListView rowListView = this.b;
        if (rowListView.b(i) == null || (rowListView.i.k & 8) == 0 || !z) {
            return;
        }
        rowListView.f(this.a, i, false);
    }
}
