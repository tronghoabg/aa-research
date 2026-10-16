package defpackage;

import androidx.car.app.model.Alert;
import androidx.preference.PreferenceGroup;

/* loaded from: classes2.dex */
final class exw implements exm {
    final /* synthetic */ PreferenceGroup a;
    final /* synthetic */ exy b;

    public exw(exy exyVar, PreferenceGroup preferenceGroup) {
        this.b = exyVar;
        this.a = preferenceGroup;
    }

    @Override // defpackage.exm
    public final boolean b() {
        this.a.V(Alert.DURATION_SHOW_INDEFINITELY);
        this.b.s();
        return true;
    }
}
