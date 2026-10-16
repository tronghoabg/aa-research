package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class qjj {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.DefaultAppStorage");
    public final android.content.SharedPreferences b;
    public final defpackage.ylx c = new defpackage.yoh(new defpackage.ydg(12, 3));
    final android.content.SharedPreferences.OnSharedPreferenceChangeListener d;

    public qjj(android.content.Context context) {
        defpackage.ilq ilqVar = new defpackage.ilq(this, 4);
        this.d = ilqVar;
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("default_app", 0);
        this.b = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(ilqVar);
    }

    static java.lang.String a(defpackage.mqg mqgVar) {
        return mqgVar.h + "PROJECTED";
    }

    public static final android.content.ComponentName c(defpackage.mqg mqgVar, android.content.SharedPreferences sharedPreferences) {
        java.lang.String string = sharedPreferences.getString("component_".concat(a(mqgVar)), null);
        if (string != null) {
            return android.content.ComponentName.unflattenFromString(string);
        }
        return null;
    }

    public final void b(defpackage.mqg mqgVar) {
        ((defpackage.yqj) a.l().ai((char) 7395)).y("clearDefaultApp for appCategory:%s", mqgVar);
        android.content.SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.remove("component_".concat(a(mqgVar)));
        editorEdit.apply();
    }
}
