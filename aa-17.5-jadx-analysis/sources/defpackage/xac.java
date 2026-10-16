package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.LauncherAppSettingsActivity;

/* loaded from: classes3.dex */
public final class xac extends nr {
    public int a = -1;
    public int b = -1;
    public final /* synthetic */ LauncherAppSettingsActivity c;

    public xac(LauncherAppSettingsActivity launcherAppSettingsActivity) {
        this.c = launcherAppSettingsActivity;
    }

    @Override // defpackage.nr
    public final void c(RecyclerView recyclerView, mo moVar) {
        View view = moVar.a;
        Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
        if (tag instanceof Float) {
            float fFloatValue = ((Float) tag).floatValue();
            int[] iArr = ebm.a;
            view.setElevation(fFloatValue);
        }
        view.setTag(R.id.item_touch_helper_previous_elevation, null);
        view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        if (this.a != this.b) {
            LauncherAppSettingsActivity launcherAppSettingsActivity = this.c;
            launcherAppSettingsActivity.q.s();
            if (!nrz.e().i()) {
                nrz.e().f(true);
                launcherAppSettingsActivity.q.g();
                ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_APP_CUSTOMIZATION, yzy.pQ).l());
            }
            xai.t(recyclerView);
        }
        this.a = -1;
        this.b = -1;
    }

    @Override // defpackage.nr
    public final int e(mo moVar) {
        return this.c.q.w(moVar.b()) ? 196611 : 0;
    }
}
