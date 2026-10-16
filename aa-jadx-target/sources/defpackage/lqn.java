package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lqn implements java.util.function.Supplier {
    public boolean a;
    private java.lang.Object b;
    private final android.content.SharedPreferences c;

    public lqn(android.content.SharedPreferences sharedPreferences) {
        this.c = sharedPreferences;
    }

    @Override // java.util.function.Supplier
    public final java.lang.Object get() {
        defpackage.lqj lqjVar;
        if (!this.a) {
            defpackage.yqm yqmVar = defpackage.lqz.a;
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4186)).u("Computing autoplay trigger decision");
            android.content.SharedPreferences sharedPreferences = this.c;
            boolean z = sharedPreferences.getBoolean("autoplay_on_start", false);
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4187)).y("wasPreviousSessionPlayingAtEnd = %b", java.lang.Boolean.valueOf(z));
            boolean z2 = sharedPreferences.getBoolean("was_any_playback_interval_over_threshold", false);
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4188)).y("wasAnyPlaybackIntervalOverThreshold = %b", java.lang.Boolean.valueOf(z2));
            boolean z3 = sharedPreferences.getBoolean("was_last_drive_short_and_eligible", false);
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4189)).y("wasLastDriveShortAndEligible = %b", java.lang.Boolean.valueOf(z3));
            boolean zC = defpackage.mpr.f().a().c();
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4190)).y("isAutoplaySettingOn = %b", java.lang.Boolean.valueOf(zC));
            if (!zC) {
                lqjVar = defpackage.lqj.e;
            } else if (z2) {
                lqjVar = defpackage.lqj.b;
            } else if (z) {
                lqjVar = defpackage.lqj.a;
            } else {
                lqjVar = z3 ? defpackage.lqj.c : defpackage.lqj.d;
            }
            ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 4191)).y("Autoplay trigger decision calculated: %s", lqjVar);
            this.b = new defpackage.lqk(lqjVar, defpackage.lhc.a().a(defpackage.mqg.MEDIA));
            this.a = true;
        }
        return this.b;
    }
}
