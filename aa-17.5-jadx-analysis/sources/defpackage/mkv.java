package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import androidx.preference.Preference;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class mkv implements mkt {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mkv(mku mkuVar, Object obj, int i) {
        this.c = i;
        this.a = mkuVar;
        this.b = obj;
    }

    @Override // defpackage.mkt
    public final void a(Activity activity) {
        int i = this.c;
        boolean z = false;
        if (i != 0) {
            if (i != 1) {
                ((mku) this.a).k("key_settings_connection_phone_info").n(String.format(activity.getString(R.string.settings_connection_pair_phone_name_format), this.b));
                return;
            }
            bt childFragmentManager = ((Fragment) this.b).getChildFragmentManager();
            mlk mlkVar = new mlk();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_car_info_core", ((kqg) this.a).b());
            mlkVar.setArguments(bundle);
            mlkVar.e(childFragmentManager, null);
            return;
        }
        mlh mlhVar = (mlh) this.b;
        kqg kqgVar = mlhVar.c;
        Object obj = this.a;
        mku mkuVar = (mku) obj;
        Preference preferenceK = mkuVar.k("key_car_info_header");
        Preference preferenceK2 = mkuVar.k("key_car_info_display");
        Preference preferenceK3 = mkuVar.k("key_car_info_enabled");
        Preference preferenceK4 = mkuVar.k("key_car_info_forget");
        Preference preferenceK5 = mkuVar.k("key_car_connection_support");
        preferenceK.J(mlhVar.d);
        preferenceK.n(mlhVar.e);
        preferenceK2.I(true != mlhVar.c.m() ? R.string.settings_car_details_title_not_projecting : R.string.settings_car_details_title_projecting);
        preferenceK2.G(true != mlhVar.c.k() ? R.string.settings_car_details_summary_bluetooth_not_connected : R.string.settings_car_details_summary_bluetooth_connected);
        preferenceK5.K(kqgVar.o());
        preferenceK3.K(!kqgVar.j());
        if (kqgVar.i() && !kqgVar.m()) {
            z = true;
        }
        preferenceK4.E(z);
        ((mkz) obj).s();
    }

    public /* synthetic */ mkv(mkz mkzVar, kqg kqgVar, int i) {
        this.c = i;
        this.b = mkzVar;
        this.a = kqgVar;
    }
}
