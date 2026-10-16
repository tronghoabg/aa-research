package defpackage;

import androidx.car.app.model.Action;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mmu extends qw {
    public static final yph f = yph.c("GH.InitialFocusScreen");
    public jez g;

    public mmu(qn qnVar) {
        super(qnVar);
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.SETTINGS_CAR_SCREEN_UI, yzy.dC).l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qw
    public final /* bridge */ /* synthetic */ wb h() {
        int i;
        ((ype) f.l().ai(5084)).y("onGetTemplate(): currentSetting=%s", this.g);
        ug ugVar = new ug();
        yfq yfqVar = jez.d;
        int i2 = ((yls) yfqVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            jez jezVar = (jez) yfqVar.get(i3);
            vf vfVar = new vf();
            qn qnVar = this.a;
            int iOrdinal = jezVar.ordinal();
            if (iOrdinal == 0) {
                i = R.string.settings_initial_focus_let_hu_decide;
            } else if (iOrdinal == 1) {
                i = R.string.settings_initial_focus_use_last_drive;
            } else {
                if (iOrdinal != 2) {
                    throw new RuntimeException(null, null);
                }
                i = R.string.settings_initial_focus_always_request;
            }
            vfVar.i(qnVar.getString(i));
            ugVar.b(vfVar.a());
        }
        ugVar.d(new mmp(this, 3));
        ugVar.e(yfqVar.indexOf(this.g));
        uj ujVar = new uj();
        ujVar.g(this.a.getString(R.string.settings_initial_focus_title));
        ujVar.e(Action.BACK);
        ujVar.f(ugVar.a());
        return ujVar.a();
    }
}
