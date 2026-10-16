package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class qiy extends PreferenceActivity {
    SharedPreferences a;
    SharedPreferences b;
    private final String c;
    private SharedPreferences.OnSharedPreferenceChangeListener d;
    private SharedPreferences.OnSharedPreferenceChangeListener e;

    public qiy(String str) {
        this.c = str;
    }

    public static void a(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof String) {
            editor.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Set) {
            editor.putStringSet(str, (Set) obj);
            return;
        }
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    public static void b(Map map, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (Map.Entry entry : map.entrySet()) {
            a(editorEdit, (String) entry.getKey(), entry.getValue());
        }
        editorEdit.apply();
    }

    @Override // android.preference.PreferenceActivity
    protected final boolean isValidFragment(String str) {
        return false;
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        String str = this.c;
        this.a = applicationContext.getSharedPreferences(str, 0);
        getPreferenceManager().setSharedPreferencesName(String.valueOf(str).concat("_temp"));
        getPreferenceManager().setSharedPreferencesMode(0);
        this.b = getPreferenceManager().getSharedPreferences();
        b(this.a.getAll(), this.b);
        SharedPreferences sharedPreferences = this.b;
        qix qixVar = new qix(sharedPreferences, this.a);
        this.d = qixVar;
        sharedPreferences.registerOnSharedPreferenceChangeListener(qixVar);
        SharedPreferences sharedPreferences2 = this.a;
        qix qixVar2 = new qix(sharedPreferences2, this.b);
        this.e = qixVar2;
        sharedPreferences2.registerOnSharedPreferenceChangeListener(qixVar2);
    }
}
