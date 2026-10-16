package defpackage;

import android.content.Context;
import androidx.car.app.model.Action;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mmr extends qw {
    public static final yph f = yph.c("GH.DriverPosScreen");
    public jey g;

    public mmr(qn qnVar) {
        super(qnVar);
    }

    @Override // defpackage.qw
    public final /* bridge */ /* synthetic */ wb h() {
        int i;
        mmc.c();
        this.g = mmc.g(kio.b().e());
        ((ype) f.l().ai(5069)).y("onGetTemplate(): currentlyDisplayedSetting=%s", this.g);
        Context baseContext = this.a.getBaseContext();
        ug ugVar = new ug();
        jey[] jeyVarArrValues = jey.values();
        int length = jeyVarArrValues.length;
        int i2 = 0;
        while (true) {
            int i3 = 2;
            if (i2 >= length) {
                ugVar.d(new mmp(this, i3));
                ugVar.e(this.g.ordinal());
                uj ujVar = new uj();
                ujVar.g(baseContext.getString(R.string.settings_edit_driver_position_title));
                ujVar.e(Action.BACK);
                ujVar.f(ugVar.a());
                return ujVar.a();
            }
            jey jeyVar = jeyVarArrValues[i2];
            vf vfVar = new vf();
            int iOrdinal = jeyVar.ordinal();
            if (iOrdinal == 0) {
                i = R.string.settings_edit_driver_position_default;
            } else if (iOrdinal == 1) {
                i = R.string.settings_edit_driver_position_left;
            } else {
                if (iOrdinal != 2) {
                    throw new RuntimeException(null, null);
                }
                i = R.string.settings_edit_driver_position_right;
            }
            vfVar.i(baseContext.getString(i));
            ugVar.b(vfVar.a());
            i2++;
        }
    }
}
