package defpackage;

import android.app.Activity;
import androidx.preference.Preference;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.Material3CarPreferenceButton;
import j$.util.Collection;
import j$.util.Optional;

/* loaded from: classes3.dex */
public final /* synthetic */ class xbg implements xbn {
    public final /* synthetic */ xbo a;
    public final /* synthetic */ yfq b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xbg(xbo xboVar, yfq yfqVar, boolean z) {
        this.a = xboVar;
        this.b = yfqVar;
        this.c = z;
    }

    @Override // defpackage.xbn
    public final void a(Activity activity) {
        final mlh mlhVar = new mlh();
        final boolean z = this.c;
        mlhVar.a(z);
        if (!z) {
            mlhVar.f = R.string.settings_connection_car_title_no_connection;
            mlhVar.e = activity.getString(R.string.settings_connection_car_summary_usb_no_connection);
        }
        final yfq yfqVar = this.b;
        final xbo xboVar = this.a;
        xboVar.u(new xbn() { // from class: xbj
            @Override // defpackage.xbn
            public final void a(Activity activity2) {
                int i = 2;
                Optional optionalFindFirst = Collection.EL.stream(yfqVar).filter(new vxj(2)).findFirst();
                xbe xbeVar = new xbe(activity2, z);
                if (true == optionalFindFirst.isPresent()) {
                    Object obj = optionalFindFirst.get();
                    Activity activity3 = xbeVar.a;
                    boolean z2 = xbeVar.b;
                    mlh mlhVar2 = new mlh();
                    mjv.c((kqg) obj, mlhVar2, activity3, z2);
                    optionalFindFirst = Optional.ofNullable(mlhVar2);
                }
                mlh mlhVar3 = mlhVar;
                xbo xboVar2 = xboVar;
                mlh mlhVar4 = (mlh) optionalFindFirst.orElse(mlhVar3);
                if (!mlhVar4.b && mlhVar4.a.isPresent() && ((Boolean) mlhVar4.a.get()).booleanValue()) {
                    Material3CarPreferenceButton material3CarPreferenceButton = (Material3CarPreferenceButton) xboVar2.r("key_settings_connection_connect_a_car");
                    material3CarPreferenceButton.a = new xao(xboVar2, i, null);
                    material3CarPreferenceButton.d();
                    xboVar2.w("key_settings_connection_category", "key_settings_connection_car");
                    return;
                }
                if (mlhVar4.d.isEmpty()) {
                    int i2 = mlhVar4.f;
                    Preference preferenceA = xboVar2.a("key_settings_connection_car");
                    if (preferenceA != null) {
                        preferenceA.I(i2);
                    }
                } else {
                    String str = mlhVar4.d;
                    Preference preferenceA2 = xboVar2.a("key_settings_connection_car");
                    if (preferenceA2 != null) {
                        preferenceA2.J(str);
                    }
                }
                String str2 = mlhVar4.e;
                Preference preferenceA3 = xboVar2.a("key_settings_connection_car");
                if (preferenceA3 != null) {
                    preferenceA3.n(str2);
                }
                xboVar2.w("key_settings_connection_category", "key_settings_connection_connect_a_car");
                Preference preferenceA4 = xboVar2.a("key_settings_connection_car");
                if (preferenceA4 != null) {
                    preferenceA4.K(true);
                }
            }
        });
    }
}
