package defpackage;

import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

/* loaded from: classes3.dex */
final class xbl implements lwh {
    final /* synthetic */ xbo a;

    public xbl(xbo xboVar) {
        this.a = xboVar;
    }

    @Override // defpackage.lwh
    public final void a(boolean z) {
        Preference preference;
        xbo xboVar = this.a;
        PreferenceScreen preferenceScreenB = xboVar.b();
        if (!z || preferenceScreenB == null || (preference = xboVar.i) == null) {
            return;
        }
        preferenceScreenB.X(preference);
    }
}
