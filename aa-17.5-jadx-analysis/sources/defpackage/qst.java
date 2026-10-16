package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;

/* loaded from: classes.dex */
public final class qst implements rfs {
    private static final ypf c = ols.R("CAR.SETTING");
    private static qst d;
    public final rhw a;
    public final SharedPreferences b;

    public qst(Context context, rhw rhwVar) {
        this.a = rhwVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences("carservice", 0);
        this.b = sharedPreferences;
        ypf ypfVar = c;
        if (ypfVar.l().Z()) {
            for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
                ypfVar.l().ai(7886).M("%s: %s", entry.getKey(), entry.getValue());
            }
        }
    }

    public static synchronized qst a(Context context) {
        qst qstVar;
        qstVar = d;
        if (qstVar == null) {
            qstVar = new qst(context.getApplicationContext(), rhx.c);
            d = qstVar;
        }
        return qstVar;
    }

    public final String b(String str, String str2) {
        return this.b.getString(str, str2);
    }

    public final void c(String str, boolean z) {
        if ("car_telemetry_enabled".equals(str)) {
            return;
        }
        this.b.edit().putBoolean(str, z).apply();
    }

    public final boolean d(String str, boolean z) {
        return this.b.getBoolean(str, z);
    }

    @Override // defpackage.rfs
    public final boolean e() {
        return this.b.getBoolean("car_save_audio", false);
    }

    public final int f() {
        return this.b.getInt("DONT_SHOW_AGAIN_DISMISS_COUNT", 0);
    }

    public final boolean g() {
        return this.b.getBoolean("android_go_device_screen_shown", false);
    }

    public final void h() {
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putBoolean("android_go_device_screen_shown", true);
        editorEdit.apply();
    }

    public final void i() {
        SharedPreferences.Editor editorEdit = this.b.edit();
        editorEdit.putInt("car_connection_count", 0);
        editorEdit.apply();
    }
}
