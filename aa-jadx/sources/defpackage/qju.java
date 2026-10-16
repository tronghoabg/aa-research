package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class qju extends android.preference.PreferenceActivity {
    android.content.SharedPreferences a;
    android.content.SharedPreferences b;
    private final java.lang.String c;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener d;
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener e;

    public qju(java.lang.String str) {
        this.c = str;
    }

    public static void a(android.content.SharedPreferences.Editor editor, java.lang.String str, java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            editor.putString(str, (java.lang.String) obj);
            return;
        }
        if (obj instanceof java.util.Set) {
            editor.putStringSet(str, (java.util.Set) obj);
            return;
        }
        if (obj instanceof java.lang.Integer) {
            editor.putInt(str, ((java.lang.Integer) obj).intValue());
            return;
        }
        if (obj instanceof java.lang.Long) {
            editor.putLong(str, ((java.lang.Long) obj).longValue());
        } else if (obj instanceof java.lang.Float) {
            editor.putFloat(str, ((java.lang.Float) obj).floatValue());
        } else if (obj instanceof java.lang.Boolean) {
            editor.putBoolean(str, ((java.lang.Boolean) obj).booleanValue());
        }
    }

    public static void b(java.util.Map map, android.content.SharedPreferences sharedPreferences) {
        android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (java.util.Map.Entry entry : map.entrySet()) {
            a(editorEdit, (java.lang.String) entry.getKey(), entry.getValue());
        }
        editorEdit.apply();
    }

    @Override // android.preference.PreferenceActivity
    protected final boolean isValidFragment(java.lang.String str) {
        return false;
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.content.Context applicationContext = getApplicationContext();
        java.lang.String str = this.c;
        this.a = applicationContext.getSharedPreferences(str, 0);
        getPreferenceManager().setSharedPreferencesName(java.lang.String.valueOf(str).concat("_temp"));
        getPreferenceManager().setSharedPreferencesMode(0);
        this.b = getPreferenceManager().getSharedPreferences();
        b(this.a.getAll(), this.b);
        android.content.SharedPreferences sharedPreferences = this.b;
        defpackage.qjt qjtVar = new defpackage.qjt(sharedPreferences, this.a);
        this.d = qjtVar;
        sharedPreferences.registerOnSharedPreferenceChangeListener(qjtVar);
        android.content.SharedPreferences sharedPreferences2 = this.a;
        defpackage.qjt qjtVar2 = new defpackage.qjt(sharedPreferences2, this.b);
        this.e = qjtVar2;
        sharedPreferences2.registerOnSharedPreferenceChangeListener(qjtVar2);
    }
}
