package defpackage;

import android.support.v4.app.Fragment;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class mkw implements kpx {
    public final /* synthetic */ Fragment a;
    private final /* synthetic */ int b;

    public /* synthetic */ mkw(Fragment fragment, int i) {
        this.b = i;
        this.a = fragment;
    }

    @Override // defpackage.kpx
    public final void a(boolean z) {
        int i = this.b;
        if (i == 0) {
            ((mkz) this.a).p(true != z ? R.string.settings_car_details_enable_failed : R.string.settings_car_details_enable_succeeded);
            return;
        }
        if (i == 1) {
            ((mkz) this.a).p(true != z ? R.string.settings_car_details_disable_failed : R.string.settings_car_details_disable_succeeded);
        } else if (i != 2) {
            ((mlk) this.a).h(z);
        } else {
            ((mkz) this.a).p(true != z ? R.string.settings_car_details_forget_failed : R.string.settings_car_details_forget_succeeded);
        }
    }
}
