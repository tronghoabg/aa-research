package defpackage;

import androidx.preference.ListPreference;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public class xat {
    public final ListPreference a;
    protected final ykd b;

    public xat(ListPreference listPreference, ykd ykdVar) {
        this.a = listPreference;
        this.b = ykdVar;
    }

    public final void a() {
        ListPreference listPreference = this.a;
        listPreference.G(R.string.settings_car_service_setting_unavailable_summary);
        listPreference.E(false);
    }
}
