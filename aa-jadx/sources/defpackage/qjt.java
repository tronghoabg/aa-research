package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qjt implements android.content.SharedPreferences.OnSharedPreferenceChangeListener {
    private final android.content.SharedPreferences a;
    private final android.content.SharedPreferences b;

    public qjt(android.content.SharedPreferences sharedPreferences, android.content.SharedPreferences sharedPreferences2) {
        this.a = sharedPreferences;
        this.b = sharedPreferences2;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        java.lang.Object obj = this.a.getAll().get(str);
        android.content.SharedPreferences sharedPreferences2 = this.b;
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences2.edit();
        if (obj != null) {
            defpackage.qju.a(editorEdit, str, obj);
        } else if (sharedPreferences2.contains(str)) {
            editorEdit.remove(str);
        }
        editorEdit.apply();
    }
}
