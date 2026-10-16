package defpackage;

import android.content.SharedPreferences;
import java.util.function.Supplier;

/* loaded from: classes.dex */
public final class lqh implements Supplier {
    public boolean a;
    private Object b;
    private final SharedPreferences c;

    public lqh(SharedPreferences sharedPreferences) {
        this.c = sharedPreferences;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (!this.a) {
            yph yphVar = lqu.a;
            ((ype) ((ype) yphVar.f()).ai((char) 4183)).u("Computing autoplay trigger decision");
            SharedPreferences sharedPreferences = this.c;
            boolean z = sharedPreferences.getBoolean("autoplay_on_start", false);
            ((ype) ((ype) yphVar.f()).ai((char) 4184)).y("wasPreviousSessionPlayingAtEnd = %b", Boolean.valueOf(z));
            boolean z2 = sharedPreferences.getBoolean("was_any_playback_interval_over_threshold", false);
            ((ype) ((ype) yphVar.f()).ai((char) 4185)).y("wasAnyPlaybackIntervalOverThreshold = %b", Boolean.valueOf(z2));
            boolean z3 = sharedPreferences.getBoolean("was_last_drive_short_and_eligible", false);
            ((ype) ((ype) yphVar.f()).ai((char) 4186)).y("wasLastDriveShortAndEligible = %b", Boolean.valueOf(z3));
            boolean zC = mpl.f().a().c();
            ((ype) ((ype) yphVar.f()).ai((char) 4187)).y("isAutoplaySettingOn = %b", Boolean.valueOf(zC));
            lqd lqdVar = !zC ? lqd.e : z2 ? lqd.b : z ? lqd.a : z3 ? lqd.c : lqd.d;
            ((ype) ((ype) yphVar.f()).ai((char) 4188)).y("Autoplay trigger decision calculated: %s", lqdVar);
            this.b = new lqe(lqdVar, lgv.a().a(mpz.d));
            this.a = true;
        }
        return this.b;
    }
}
