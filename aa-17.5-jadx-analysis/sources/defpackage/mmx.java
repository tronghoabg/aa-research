package defpackage;

import androidx.car.app.model.Action;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mmx extends qw {
    public static final yph f = yph.c("GH.ThemeSettingsScreen");
    public nfp g;

    public mmx(qn qnVar) {
        super(qnVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qw
    public final /* bridge */ /* synthetic */ wb h() {
        int i;
        yop yopVarL = f.l();
        nfp nfpVar = this.g;
        nfp nfpVar2 = null;
        if (nfpVar == null) {
            affa.d("currentlyDisplayedSetting");
            nfpVar = null;
        }
        yopVarL.y("onGetTemplate(): currentSetting=%s", nfpVar);
        ug ugVar = new ug();
        yfq yfqVar = nfp.e;
        ynp ynpVarListIterator = yfqVar.listIterator(0);
        ynpVarListIterator.getClass();
        while (ynpVarListIterator.hasNext()) {
            E next = ynpVarListIterator.next();
            next.getClass();
            vf vfVar = new vf();
            qn qnVar = this.a;
            int iOrdinal = ((nfp) next).ordinal();
            if (iOrdinal == 0) {
                i = R.string.settings_theme_light_title;
            } else if (iOrdinal == 1) {
                i = R.string.settings_theme_dark_title;
            } else {
                if (iOrdinal != 2) {
                    throw new aezs();
                }
                i = R.string.settings_theme_automatic_title;
            }
            vfVar.i(qnVar.getString(i));
            ugVar.b(vfVar.a());
        }
        ugVar.d(new mmp(this, 5));
        nfp nfpVar3 = this.g;
        if (nfpVar3 == null) {
            affa.d("currentlyDisplayedSetting");
        } else {
            nfpVar2 = nfpVar3;
        }
        ugVar.e(yfqVar.indexOf(nfpVar2));
        uj ujVar = new uj();
        ujVar.g(this.a.getString(R.string.settings_theme_title));
        ujVar.e(Action.BACK);
        ujVar.f(ugVar.a());
        return ujVar.a();
    }
}
