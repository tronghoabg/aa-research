package defpackage;

import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.car.app.model.Toggle;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowContainerViewRowImpl;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowView;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowContainerViewRowImpl;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowView;

/* loaded from: classes2.dex */
public final /* synthetic */ class kef implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ Toggle a;
    public final /* synthetic */ geu b;
    public final /* synthetic */ LinearLayout c;
    private final /* synthetic */ int d;

    public /* synthetic */ kef(LinearLayout linearLayout, Toggle toggle, geu geuVar, int i) {
        this.d = i;
        this.c = linearLayout;
        this.a = toggle;
        this.b = geuVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i = this.d;
        LinearLayout linearLayout = this.c;
        if (i != 0) {
            ajmd ajmdVar = ((MaterialRowView) linearLayout).O;
            if (ajmdVar != null) {
                ((MaterialRowContainerViewRowImpl) ajmdVar.a).b(z);
            }
            geu geuVar = this.b;
            geuVar.t().g(this.a.getOnCheckedChangeDelegate(), z);
            return;
        }
        ajmd ajmdVar2 = ((RowView) linearLayout).H;
        if (ajmdVar2 != null) {
            ((RowContainerViewRowImpl) ajmdVar2.a).b(z);
        }
        geu geuVar2 = this.b;
        geuVar2.t().g(this.a.getOnCheckedChangeDelegate(), z);
    }
}
