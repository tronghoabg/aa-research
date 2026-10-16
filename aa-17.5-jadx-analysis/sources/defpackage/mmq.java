package defpackage;

import android.content.Context;
import androidx.car.app.model.Action;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes2.dex */
public final class mmq extends qw {
    public static final yph f = yph.c("GH.DayNightModeScreen");
    public nfp g;

    public mmq(qn qnVar) {
        super(qnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qw
    @ResultIgnorabilityUnspecified
    public final /* bridge */ /* synthetic */ wb h() {
        int i;
        nfo.b();
        this.g = nfo.d(kio.b().e());
        ((ype) f.l().ai(5065)).y("onGetTemplate(): currentSetting=%s", this.g);
        Context baseContext = this.a.getBaseContext();
        ug ugVar = new ug();
        yfq yfqVar = nfp.d;
        int i2 = ((yls) yfqVar).c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            nfp nfpVar = (nfp) yfqVar.get(i4);
            vf vfVar = new vf();
            int iOrdinal = nfpVar.ordinal();
            if (iOrdinal == 0) {
                i = R.string.settings_day_night_mode_day_title;
            } else if (iOrdinal == 1) {
                i = R.string.settings_day_night_mode_night_title;
            } else {
                if (iOrdinal != 2) {
                    throw new RuntimeException(null, null);
                }
                i = R.string.settings_day_night_mode_car_controlled_title;
            }
            vfVar.i(baseContext.getString(i));
            ugVar.b(vfVar.a());
        }
        ugVar.d(new mmp(this, i3));
        ugVar.e(this.g.ordinal());
        uj ujVar = new uj();
        ujVar.g(baseContext.getString(R.string.settings_day_night_mode_title));
        ujVar.e(Action.BACK);
        ujVar.f(ugVar.a());
        return ujVar.a();
    }
}
