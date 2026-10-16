package defpackage;

import android.content.Context;
import androidx.car.app.model.CarColor;

/* loaded from: classes.dex */
public final class maw {
    public final int a;
    public final int b;
    public final String c;
    public final Object d;

    public maw(Context context, int i, int i2) {
        this.d = context.getSharedPreferences("WorkProfilePromptScheduler", 0);
        this.a = i;
        this.b = i2;
        this.c = "CROSS_PROFILE_PERMISSION";
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final int a() {
        return this.d.getInt(c("PERMISSION_PROMPT_COUNT"), 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final int b() {
        return this.d.getInt(c("SESSIONS_SINCE_LAST_PROMPT"), 0);
    }

    public final String c(String str) {
        return String.format("%s.%s", this.c, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void d(int i) {
        this.d.edit().putInt(c("SESSIONS_SINCE_LAST_PROMPT"), i).apply();
    }

    public maw(String str, int i, int i2, CarColor carColor) {
        this.c = woy.al(str);
        this.a = i;
        this.b = i2;
        this.d = carColor;
    }
}
