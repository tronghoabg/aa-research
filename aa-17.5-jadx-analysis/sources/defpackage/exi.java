package defpackage;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* loaded from: classes2.dex */
public final class exi extends exp {
    public int g;
    private CharSequence[] h;
    private CharSequence[] i;

    private final ListPreference n() {
        return (ListPreference) m();
    }

    @Override // defpackage.exp
    protected final void eU(em emVar) {
        emVar.m(this.h, this.g, new mhb(this, 1));
        emVar.l(null, null);
    }

    @Override // defpackage.exp
    public final void i(boolean z) {
        int i;
        if (!z || (i = this.g) < 0) {
            return;
        }
        String string = this.i[i].toString();
        ListPreference listPreferenceN = n();
        if (listPreferenceN.N(string)) {
            listPreferenceN.o(string);
        }
    }

    @Override // defpackage.exp, defpackage.ao, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            this.g = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.h = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.i = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreferenceN = n();
        if (listPreferenceN.g == null || listPreferenceN.h == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.g = listPreferenceN.k(listPreferenceN.i);
        this.h = listPreferenceN.g;
        this.i = listPreferenceN.h;
    }

    @Override // defpackage.exp, defpackage.ao, android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        super.m117x22bc4f96(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.g);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.h);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.i);
    }
}
