package defpackage;

import android.content.Context;
import androidx.car.app.model.Action;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mmo extends qw {
    public static final yph f = yph.c("GH.DashAlignScreen");
    public mma g;

    public mmo(qn qnVar) {
        super(qnVar);
    }

    @Override // defpackage.qw
    public final /* bridge */ /* synthetic */ wb h() {
        int i;
        mmc.c();
        this.g = mmc.f();
        ((ype) f.l().ai(5060)).y("onGetTemplate(): currentSetting=%s", this.g);
        Context baseContext = this.a.getBaseContext();
        ug ugVar = new ug();
        mma[] mmaVarArrValues = mma.values();
        int length = mmaVarArrValues.length;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i2 >= length) {
                ugVar.d(new mmp(this, i3));
                ugVar.e(this.g.ordinal());
                uj ujVar = new uj();
                ujVar.g(baseContext.getString(R.string.settings_driver_aligned_dashboard));
                ujVar.e(Action.BACK);
                ujVar.f(ugVar.a());
                return ujVar.a();
            }
            mma mmaVar = mmaVarArrValues[i2];
            vf vfVar = new vf();
            int iOrdinal = mmaVar.ordinal();
            if (iOrdinal == 0) {
                i = R.string.settings_driver_aligned_title;
            } else {
                if (iOrdinal != 1) {
                    throw new RuntimeException(null, null);
                }
                i = R.string.settings_passenger_aligned_title;
            }
            vfVar.i(baseContext.getString(i));
            ugVar.b(vfVar.a());
            i2++;
        }
    }
}
