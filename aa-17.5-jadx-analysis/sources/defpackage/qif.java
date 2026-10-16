package defpackage;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.apps.auto.components.telemetry.TelemetryEvent;
import com.google.android.libraries.handwriting.networkrecognizer.CloudRecognizerProtocolStrings;
import j$.time.Instant;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
final class qif implements ohv {
    final /* synthetic */ qig a;

    public qif(qig qigVar) {
        this.a = qigVar;
    }

    @Override // defpackage.ohv
    public final void a(TelemetryEvent telemetryEvent) {
        yxb yxbVar = telemetryEvent.b;
        int i = yxbVar.b;
        if ((i & 8192) == 0) {
            if ((i & 4096) != 0) {
                zab zabVar = yxbVar.o;
                if (zabVar == null) {
                    zabVar = zab.a;
                }
                if (zabVar.d == 801) {
                    int i2 = zabVar.n;
                    yzk yzkVar = i2 != 1 ? i2 != 2 ? i2 != 4 ? i2 != 8 ? i2 != 16 ? i2 != 32 ? i2 != 64 ? i2 != 128 ? null : yzk.OPEN_HELP_FEEDBACK : yzk.OPEN_PLAY_STORE : yzk.RESPONSE_NOT_ENJOYING : yzk.RESPONSE_ENJOYING : yzk.PROMPT_DISMISSED : yzk.PROMPT_SHOWN : yzk.NOTIFICATION_DISMISSED : yzk.NOTIFICATION_SHOWN;
                    if (yzkVar == null) {
                        ((ype) ((ype) qig.a.f()).ai(7324)).y("Invalid or missing customFeedbackAction (%d)", (zabVar.b & 1024) != 0 ? Integer.valueOf(zabVar.n) : null);
                        return;
                    }
                    qig qigVar = this.a;
                    int iOrdinal = yzkVar.ordinal();
                    if (iOrdinal == 3) {
                        if (Boolean.TRUE.equals(qigVar.i)) {
                            ((ype) qig.a.l().ai((char) 7326)).u("User didn't rate app. Will show prompt after enough time elapses.");
                        } else if (Boolean.FALSE.equals(qigVar.i)) {
                            ((ype) qig.a.l().ai((char) 7325)).u("User didn't give feedback. Re-prompting after enough time elapses.");
                        }
                        qigVar.h.edit().putLong("total_session_time", 0L).putBoolean("ignored_last_prompt", false).apply();
                        qigVar.i = null;
                        return;
                    }
                    if (iOrdinal == 4) {
                        qigVar.i = true;
                        return;
                    }
                    if (iOrdinal == 5) {
                        qigVar.i = false;
                        return;
                    }
                    if (iOrdinal == 6) {
                        ((ype) qig.a.l().ai((char) 7327)).u("User went to Play Store. Will never show prompt again.");
                        qigVar.h.edit().putBoolean("never_prompt_again", true).putBoolean("ignored_last_prompt", false).apply();
                        qigVar.i = null;
                        return;
                    } else {
                        if (iOrdinal != 7) {
                            return;
                        }
                        ((ype) qig.a.l().ai((char) 7328)).u("User went to Help/Feedback. Won't re-prompt until app update.");
                        qigVar.h.edit().putBoolean("re_prompt_on_new_version", true).putBoolean("ignored_last_prompt", false).apply();
                        qigVar.i = null;
                        return;
                    }
                }
                return;
            }
            return;
        }
        yyz yyzVar = yxbVar.p;
        if (yyzVar == null) {
            yyzVar = yyz.a;
        }
        int i3 = yyzVar.d;
        if (i3 == 251) {
            qig qigVar2 = this.a;
            ((ype) qig.a.l().ai((char) 7329)).u("Starting RatingPromptManager session.");
            oit.a();
            qigVar2.j = Instant.now().toEpochMilli();
            String string = qigVar2.h.getString(CloudRecognizerProtocolStrings.APP_VERSION, null);
            try {
                Matcher matcher = qig.e.matcher(qigVar2.g.getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 0).versionName);
                woy.N(matcher.find());
                String strGroup = matcher.group(1);
                if (strGroup.equals(string)) {
                    return;
                }
                ((ype) qig.a.l().ai((char) 7333)).M("Stored version (%s) is not equal to current version (%s). Clearing data.", string, strGroup);
                SharedPreferences sharedPreferences = qigVar2.h;
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(CloudRecognizerProtocolStrings.APP_VERSION, strGroup);
                editorEdit.putBoolean("re_prompt_on_new_version", false);
                if (sharedPreferences.getBoolean("rating_prompt_shown", false)) {
                    editorEdit.putLong("total_session_time", 0L);
                }
                editorEdit.putBoolean("rating_prompt_shown", false);
                editorEdit.apply();
                return;
            } catch (PackageManager.NameNotFoundException e) {
                ((ype) ((ype) ((ype) qig.a.g()).p(e)).ai((char) 7334)).u("Gearhead package not found.");
                return;
            }
        }
        if (i3 != 252) {
            return;
        }
        qig qigVar3 = this.a;
        if (qigVar3.j == -1) {
            ((ype) ((ype) qig.a.f()).ai((char) 7332)).u("Trying to end a session that was never started. Will not do anything.");
            return;
        }
        oit.a();
        long epochMilli = Instant.now().toEpochMilli() - qigVar3.j;
        SharedPreferences sharedPreferences2 = qigVar3.h;
        long j = epochMilli + sharedPreferences2.getLong("total_session_time", 0L);
        if (!sharedPreferences2.getBoolean("re_prompt_on_new_version", false)) {
            sharedPreferences2.edit().putLong("total_session_time", j).apply();
        }
        qigVar3.j = -1L;
        long j2 = qig.c;
        if (sharedPreferences2.getInt("prompt_shown_count", 0) == 0 || !sharedPreferences2.getBoolean("ignored_last_prompt", false)) {
            j2 = qig.b;
        }
        oit.a();
        if (Instant.now().toEpochMilli() - sharedPreferences2.getLong("last_rating_prompt_time", 0L) >= qig.d) {
            sharedPreferences2.edit().putInt("prompt_shown_count", 0).apply();
        }
        if (j < j2 || sharedPreferences2.getInt("prompt_shown_count", 0) > 0 || sharedPreferences2.getBoolean("never_prompt_again", false) || sharedPreferences2.getBoolean("re_prompt_on_new_version", false)) {
            ((ype) ((ype) qig.a.f()).ai((char) 7330)).u("User is not eligible to see the rating prompt.");
            kzd.j().f(false, null);
        } else {
            ((ype) ((ype) qig.a.f()).ai((char) 7331)).u("User is eligible to see the rating prompt.");
            kzd.j().f(true, new qct(qigVar3, 18, null));
        }
    }
}
