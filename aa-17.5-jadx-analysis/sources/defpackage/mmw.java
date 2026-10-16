package defpackage;

import android.content.Context;
import androidx.car.app.model.Action;
import androidx.car.app.model.SectionedItemList;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mmw extends qw {
    public static final yph f = yph.c("GH.SecDispSettingScreen");
    public jfd g;
    public int h;

    public mmw(qn qnVar) {
        super(qnVar);
        this.h = -1;
    }

    static int a(jfd jfdVar) {
        int iOrdinal = jfdVar.ordinal();
        if (iOrdinal == 0) {
            return R.string.settings_power_saving_advanced_secondary_displays_full_experience;
        }
        if (iOrdinal == 1) {
            return R.string.settings_power_saving_advanced_secondary_displays_battery_optimized;
        }
        if (iOrdinal == 2) {
            return R.string.settings_power_saving_advanced_secondary_displays_off;
        }
        throw new RuntimeException(null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qw
    public final /* bridge */ /* synthetic */ wb h() {
        int i;
        this.g = mme.b().a(kio.b().e());
        Context baseContext = this.a.getBaseContext();
        uj ujVar = new uj();
        ujVar.e(Action.BACK);
        ujVar.g(baseContext.getString(R.string.secondary_display_power_saving));
        ug ugVar = new ug();
        int i2 = 0;
        while (true) {
            yfq yfqVar = jfd.d;
            if (i2 >= ((yls) yfqVar).c) {
                ((ype) f.l().ai(5095)).y("onGetTemplate(): currentMultiDisplayPowerSavingSetting=%s", this.g);
                ugVar.d(new mmp(this, 4));
                int i3 = this.h;
                if (i3 >= 0) {
                    ugVar.e(i3);
                }
                ujVar.c(SectionedItemList.create(ugVar.a(), baseContext.getString(R.string.secondary_display_power_saving_section_title)));
                return ujVar.a();
            }
            jfd jfdVar = (jfd) yfqVar.get(i2);
            if (jfdVar == this.g) {
                this.h = i2;
            }
            vf vfVar = new vf();
            vfVar.i(baseContext.getString(a(jfdVar)));
            int iOrdinal = jfdVar.ordinal();
            if (iOrdinal == 0) {
                i = R.string.settings_power_saving_advanced_secondary_displays_full_experience_summary;
            } else if (iOrdinal == 1) {
                i = R.string.settings_power_saving_advanced_secondary_displays_battery_optimized_summary;
            } else {
                if (iOrdinal != 2) {
                    throw new RuntimeException(null, null);
                }
                i = R.string.settings_power_saving_advanced_secondary_displays_off_summary;
            }
            String string = baseContext.getString(i);
            if (!string.isEmpty()) {
                vfVar.d(string);
            }
            ugVar.b(vfVar.a());
            i2++;
        }
    }
}
