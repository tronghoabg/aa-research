package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mbd {
    public final int a;
    public final int b;
    public final java.lang.String c;
    public final java.lang.Object d;

    public mbd(android.content.Context context, int i, int i2) {
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

    public final java.lang.String c(java.lang.String str) {
        return java.lang.String.format("%s.%s", this.c, str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    public final void d(int i) {
        this.d.edit().putInt(c("SESSIONS_SINCE_LAST_PROMPT"), i).apply();
    }

    public mbd(java.lang.String str, int i, int i2, androidx.car.app.model.CarColor carColor) {
        this.c = defpackage.ysr.bv(str);
        this.a = i;
        this.b = i2;
        this.d = carColor;
    }
}
