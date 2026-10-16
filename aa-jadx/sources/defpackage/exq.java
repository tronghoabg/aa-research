package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class exq extends defpackage.exv {
    final java.util.Set g = new java.util.HashSet();
    boolean h;
    java.lang.CharSequence[] i;
    java.lang.CharSequence[] j;

    private final androidx.preference.MultiSelectListPreference n() {
        return (androidx.preference.MultiSelectListPreference) m();
    }

    @Override // defpackage.exv
    protected final void ec(defpackage.em emVar) {
        int length = this.j.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.g.contains(this.j[i].toString());
        }
        java.lang.CharSequence[] charSequenceArr = this.i;
        defpackage.exp expVar = new defpackage.exp(this);
        defpackage.ej ejVar = emVar.a;
        ejVar.o = charSequenceArr;
        ejVar.w = expVar;
        ejVar.s = zArr;
        ejVar.t = true;
    }

    @Override // defpackage.exv
    public final void i(boolean z) {
        if (z && this.h) {
            androidx.preference.MultiSelectListPreference multiSelectListPreferenceN = n();
            java.util.Set set = this.g;
            if (multiSelectListPreferenceN.N(set)) {
                multiSelectListPreferenceN.k(set);
            }
        }
        this.h = false;
    }

    @Override // defpackage.exv, defpackage.ao, android.support.v4.app.Fragment
    /* JADX INFO: renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(android.os.Bundle bundle) {
        java.lang.CharSequence[] charSequenceArr;
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle != null) {
            java.util.Set set = this.g;
            set.clear();
            set.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.h = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.i = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.j = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        androidx.preference.MultiSelectListPreference multiSelectListPreferenceN = n();
        java.lang.CharSequence[] charSequenceArr2 = multiSelectListPreferenceN.g;
        if (charSequenceArr2 == null || (charSequenceArr = multiSelectListPreferenceN.h) == null) {
            throw new java.lang.IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        java.util.Set set2 = this.g;
        set2.clear();
        set2.addAll(multiSelectListPreferenceN.i);
        this.h = false;
        this.i = charSequenceArr2;
        this.j = charSequenceArr;
    }

    @Override // defpackage.exv, defpackage.ao, android.support.v4.app.Fragment
    /* JADX INFO: renamed from: onSaveInstanceState */
    public final void m117x22bc4f96(android.os.Bundle bundle) {
        super.m117x22bc4f96(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new java.util.ArrayList<>(this.g));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.h);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.i);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.j);
    }
}
