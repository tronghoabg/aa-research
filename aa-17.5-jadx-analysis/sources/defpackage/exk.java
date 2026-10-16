package defpackage;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class exk extends exp {
    final Set g = new HashSet();
    boolean h;
    CharSequence[] i;
    CharSequence[] j;

    private final MultiSelectListPreference n() {
        return (MultiSelectListPreference) m();
    }

    @Override // defpackage.exp
    protected final void eU(em emVar) {
        int length = this.j.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.g.contains(this.j[i].toString());
        }
        CharSequence[] charSequenceArr = this.i;
        exj exjVar = new exj(this);
        ej ejVar = emVar.a;
        ejVar.o = charSequenceArr;
        ejVar.w = exjVar;
        ejVar.s = zArr;
        ejVar.t = true;
    }

    @Override // defpackage.exp
    public final void i(boolean z) {
        if (z && this.h) {
            MultiSelectListPreference multiSelectListPreferenceN = n();
            Set set = this.g;
            if (multiSelectListPreferenceN.N(set)) {
                multiSelectListPreferenceN.k(set);
            }
        }
        this.h = false;
    }

    @Override // defpackage.exp, defpackage.ao, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            Set set = this.g;
            set.clear();
            set.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.h = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.i = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.j = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceN = n();
        CharSequence[] charSequenceArr2 = multiSelectListPreferenceN.g;
        if (charSequenceArr2 == null || (charSequenceArr = multiSelectListPreferenceN.h) == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        Set set2 = this.g;
        set2.clear();
        set2.addAll(multiSelectListPreferenceN.i);
        this.h = false;
        this.i = charSequenceArr2;
        this.j = charSequenceArr;
    }

    @Override // defpackage.exp, defpackage.ao, android.support.v4.app.Fragment
    /* renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(Bundle bundle) {
        super.m117x22bc4f96(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.g));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.h);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.i);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.j);
    }
}
