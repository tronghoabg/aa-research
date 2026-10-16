package defpackage;

import android.os.Bundle;
import android.widget.TextView;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class xfr extends jrh {
    @Override // defpackage.jrh, defpackage.ouv, defpackage.qru, defpackage.qrq, defpackage.qqh
    public final void a(Bundle bundle) {
        super.a(bundle);
        v(R.layout.prototype_auxiliary_display_layout);
    }

    @Override // defpackage.ouv, defpackage.qru, defpackage.qrq, defpackage.qqh
    public final void h() {
        super.h();
        rjj rjjVarC = mpr.a().c(new CarDisplayId(y()));
        TextView textView = (TextView) B(R.id.aux_content_type);
        int iOrdinal = rjjVarC.ordinal();
        if (iOrdinal == 1) {
            textView.setText("NAVIGATION AUXILIARY DISPLAY");
        } else {
            if (iOrdinal != 2) {
                throw new IllegalStateException("ContentType not supported in auxiliary car display: ".concat(rjjVarC.toString()));
            }
            textView.setText("TURN CARD AUXILIARY DISPLAY");
        }
    }
}
