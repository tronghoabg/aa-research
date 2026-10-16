package defpackage;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class qix implements SharedPreferences.OnSharedPreferenceChangeListener {
    private final SharedPreferences a;
    private final SharedPreferences b;

    public qix(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        this.a = sharedPreferences;
        this.b = sharedPreferences2;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Object obj = this.a.getAll().get(str);
        SharedPreferences sharedPreferences2 = this.b;
        SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
        if (obj != null) {
            qiy.a(editorEdit, str, obj);
        } else if (sharedPreferences2.contains(str)) {
            editorEdit.remove(str);
        }
        editorEdit.apply();
    }
}
