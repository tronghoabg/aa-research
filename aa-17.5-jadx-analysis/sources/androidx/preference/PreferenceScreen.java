package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.projection.gearhead.R;
import defpackage.dlz;
import defpackage.eyb;

/* loaded from: classes2.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean d;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, dlz.l(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.d = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.PreferenceGroup
    public final boolean W() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        eyb eybVar;
        if (this.u != null || this.v != null || k() == 0 || (eybVar = this.k.e) == null) {
            return;
        }
        eybVar.j();
    }
}
