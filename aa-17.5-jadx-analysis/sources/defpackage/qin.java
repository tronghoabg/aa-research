package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class qin {
    public static final yph a = yph.c("GH.DefaultAppStorage");
    public final SharedPreferences b;
    public final yks c = new ync(new yca(12, 3));
    final SharedPreferences.OnSharedPreferenceChangeListener d;

    public qin(Context context) {
        ilg ilgVar = new ilg(this, 4);
        this.d = ilgVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("default_app", 0);
        this.b = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(ilgVar);
    }

    static String a(mpz mpzVar) {
        return mpzVar.h + "PROJECTED";
    }

    public static final ComponentName c(mpz mpzVar, SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("component_".concat(a(mpzVar)), null);
        if (string != null) {
            return ComponentName.unflattenFromString(string);
        }
        return null;
    }

    public final void b(mpz mpzVar) {
        ((ype) a.l().ai((char) 7370)).y("clearDefaultApp for appCategory:%s", mpzVar);
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.remove("component_".concat(a(mpzVar)));
        editorEdit.apply();
    }
}
