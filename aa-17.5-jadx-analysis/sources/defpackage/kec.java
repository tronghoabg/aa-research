package defpackage;

import android.support.v7.widget.RecyclerView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowListView;

/* loaded from: classes2.dex */
public final class kec extends ca {
    int c;
    final /* synthetic */ RowListView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kec(RowListView rowListView) {
        super(null);
        this.d = rowListView;
        this.c = 0;
    }

    @Override // defpackage.ca
    public final void p(RecyclerView recyclerView, int i) {
        ghe gheVarD;
        if (i != 2) {
            if (i == 0) {
                this.d.e();
                return;
            }
            return;
        }
        RowListView rowListView = this.d;
        int i2 = this.c;
        geu geuVar = rowListView.h;
        if (geuVar != null && (gheVarD = jtq.d(geuVar)) != null) {
            if (i2 < 0) {
                gheVarD.g(gsn.e);
            } else if (i2 > 0) {
                gheVarD.g(gsn.f);
            }
        }
        this.c = 0;
    }

    @Override // defpackage.ca
    public final void q(RecyclerView recyclerView, int i, int i2) {
        this.c += i2;
    }
}
