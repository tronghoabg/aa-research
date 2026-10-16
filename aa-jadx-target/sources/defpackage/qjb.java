package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class qjb implements oip {
    final /* synthetic */ defpackage.qjc a;

    public qjb(defpackage.qjc qjcVar) {
        this.a = qjcVar;
    }

    public final void a(com.google.android.apps.auto.components.telemetry.TelemetryEvent telemetryEvent) {
        zap zapVar;
        defpackage.yyg yygVar = telemetryEvent.b;
        int i = yygVar.b;
        if ((i & 8192) == 0) {
            if ((i & 4096) != 0) {
                defpackage.zbg zbgVar = yygVar.o;
                if (zbgVar == null) {
                    zbgVar = defpackage.zbg.a;
                }
                if (zbgVar.d == 801) {
                    int i2 = zbgVar.n;
                    if (i2 == 1) {
                        zapVar = zap.a;
                    } else if (i2 == 2) {
                        zapVar = zap.b;
                    } else if (i2 == 4) {
                        zapVar = zap.c;
                    } else if (i2 == 8) {
                        zapVar = zap.d;
                    } else if (i2 == 16) {
                        zapVar = zap.e;
                    } else if (i2 == 32) {
                        zapVar = zap.f;
                    } else if (i2 != 64) {
                        zapVar = i2 != 128 ? null : zap.h;
                    } else {
                        zapVar = zap.g;
                    }
                    if (zapVar == null) {
                        ((defpackage.yqj) ((defpackage.yqj) defpackage.qjc.a.f()).ai(7349)).y("Invalid or missing customFeedbackAction (%d)", (zbgVar.b & 1024) != 0 ? java.lang.Integer.valueOf(zbgVar.n) : null);
                        return;
                    }
                    defpackage.qjc qjcVar = this.a;
                    int iOrdinal = zapVar.ordinal();
                    if (iOrdinal == 3) {
                        if (java.lang.Boolean.TRUE.equals(qjcVar.i)) {
                            ((defpackage.yqj) defpackage.qjc.a.l().ai((char) 7351)).u("User didn't rate app. Will show prompt after enough time elapses.");
                        } else if (java.lang.Boolean.FALSE.equals(qjcVar.i)) {
                            ((defpackage.yqj) defpackage.qjc.a.l().ai((char) 7350)).u("User didn't give feedback. Re-prompting after enough time elapses.");
                        }
                        qjcVar.h.edit().putLong("total_session_time", 0L).putBoolean("ignored_last_prompt", false).apply();
                        qjcVar.i = null;
                        return;
                    }
                    if (iOrdinal == 4) {
                        qjcVar.i = java.lang.Boolean.TRUE;
                        return;
                    }
                    if (iOrdinal == 5) {
                        qjcVar.i = java.lang.Boolean.FALSE;
                        return;
                    }
                    if (iOrdinal == 6) {
                        ((defpackage.yqj) defpackage.qjc.a.l().ai((char) 7352)).u("User went to Play Store. Will never show prompt again.");
                        qjcVar.h.edit().putBoolean("never_prompt_again", true).putBoolean("ignored_last_prompt", false).apply();
                        qjcVar.i = null;
                        return;
                    } else {
                        if (iOrdinal != 7) {
                            return;
                        }
                        ((defpackage.yqj) defpackage.qjc.a.l().ai((char) 7353)).u("User went to Help/Feedback. Won't re-prompt until app update.");
                        qjcVar.h.edit().putBoolean("re_prompt_on_new_version", true).putBoolean("ignored_last_prompt", false).apply();
                        qjcVar.i = null;
                        return;
                    }
                }
                return;
            }
            return;
        }
        defpackage.zae zaeVar = yygVar.p;
        if (zaeVar == null) {
            zaeVar = defpackage.zae.a;
        }
        int i3 = zaeVar.d;
        if (i3 == 251) {
            defpackage.qjc qjcVar2 = this.a;
            ((defpackage.yqj) defpackage.qjc.a.l().ai((char) 7354)).u("Starting RatingPromptManager session.");
            defpackage.ojm.a();
            qjcVar2.j = j$.time.Instant.now().toEpochMilli();
            java.lang.String string = qjcVar2.h.getString("app_version", null);
            try {
                java.util.regex.Matcher matcher = defpackage.qjc.e.matcher(qjcVar2.g.getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 0).versionName);
                defpackage.ysr.aX(matcher.find());
                java.lang.String strGroup = matcher.group(1);
                if (strGroup.equals(string)) {
                    return;
                }
                ((defpackage.yqj) defpackage.qjc.a.l().ai((char) 7358)).M("Stored version (%s) is not equal to current version (%s). Clearing data.", string, strGroup);
                android.content.SharedPreferences sharedPreferences = qjcVar2.h;
                android.content.SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString("app_version", strGroup);
                editorEdit.putBoolean("re_prompt_on_new_version", false);
                if (sharedPreferences.getBoolean("rating_prompt_shown", false)) {
                    editorEdit.putLong("total_session_time", 0L);
                }
                editorEdit.putBoolean("rating_prompt_shown", false);
                editorEdit.apply();
                return;
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.qjc.a.g()).p(e)).ai((char) 7359)).u("Gearhead package not found.");
                return;
            }
        }
        if (i3 != 252) {
            return;
        }
        defpackage.qjc qjcVar3 = this.a;
        if (qjcVar3.j == -1) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.qjc.a.f()).ai((char) 7357)).u("Trying to end a session that was never started. Will not do anything.");
            return;
        }
        defpackage.ojm.a();
        long epochMilli = j$.time.Instant.now().toEpochMilli() - qjcVar3.j;
        android.content.SharedPreferences sharedPreferences2 = qjcVar3.h;
        long j = sharedPreferences2.getLong("total_session_time", 0L) + epochMilli;
        if (!sharedPreferences2.getBoolean("re_prompt_on_new_version", false)) {
            sharedPreferences2.edit().putLong("total_session_time", j).apply();
        }
        qjcVar3.j = -1L;
        long j2 = defpackage.qjc.c;
        if (sharedPreferences2.getInt("prompt_shown_count", 0) == 0 || !sharedPreferences2.getBoolean("ignored_last_prompt", false)) {
            j2 = defpackage.qjc.b;
        }
        defpackage.ojm.a();
        if (j$.time.Instant.now().toEpochMilli() - sharedPreferences2.getLong("last_rating_prompt_time", 0L) >= defpackage.qjc.d) {
            sharedPreferences2.edit().putInt("prompt_shown_count", 0).apply();
        }
        if (j < j2 || sharedPreferences2.getInt("prompt_shown_count", 0) > 0 || sharedPreferences2.getBoolean("never_prompt_again", false) || sharedPreferences2.getBoolean("re_prompt_on_new_version", false)) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.qjc.a.f()).ai((char) 7355)).u("User is not eligible to see the rating prompt.");
            defpackage.jzb.r().f(false, null);
        } else {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.qjc.a.f()).ai((char) 7356)).u("User is eligible to see the rating prompt.");
            defpackage.jzb.r().f(true, new defpackage.qie(qjcVar3, 6, null));
        }
    }
}
