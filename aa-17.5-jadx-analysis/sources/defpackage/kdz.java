package defpackage;

import android.view.View;
import com.google.android.apps.auto.components.apphost.view.widgets.common.MaterialRowContainerViewRowImpl;
import com.google.android.apps.auto.components.apphost.view.widgets.common.RowContainerViewRowImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class kdz implements View.OnFocusChangeListener {
    public final /* synthetic */ hie a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ kdz(hie hieVar, int i, int i2) {
        this.c = i2;
        this.a = hieVar;
        this.b = i;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (this.c != 0) {
            int i = MaterialRowContainerViewRowImpl.b;
            this.a.b(this.b, z);
        } else {
            int i2 = RowContainerViewRowImpl.b;
            this.a.b(this.b, z);
        }
    }
}
