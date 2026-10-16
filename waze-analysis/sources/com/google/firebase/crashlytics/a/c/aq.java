package com.google.firebase.crashlytics.a.c;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import j$.util.Objects;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class aq implements as {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f9139a = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: b, reason: collision with root package name */
    private static final String f9140b = Pattern.quote(DomExceptionUtils.SEPARATOR);

    /* renamed from: c, reason: collision with root package name */
    private final at f9141c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f9142d;

    /* renamed from: e, reason: collision with root package name */
    private final String f9143e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.firebase.installations.d f9144f;

    /* renamed from: g, reason: collision with root package name */
    private final aj f9145g;

    /* renamed from: h, reason: collision with root package name */
    private ar f9146h;

    public aq(Context context, String str, com.google.firebase.installations.d dVar, aj ajVar) {
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f9142d = context;
        this.f9143e = str;
        this.f9144f = dVar;
        this.f9145g = ajVar;
        this.f9141c = new at();
    }

    static String c() {
        return "SYN_".concat(String.valueOf(UUID.randomUUID().toString()));
    }

    public static final String f() {
        return String.format(Locale.US, "%s/%s", k(Build.MANUFACTURER), k(Build.MODEL));
    }

    public static final String g() {
        return k(Build.VERSION.INCREMENTAL);
    }

    public static final String h() {
        return k(Build.VERSION.RELEASE);
    }

    private final synchronized String i(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        lowerCase = f9139a.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        com.google.firebase.crashlytics.a.i.a().g("Created new Crashlytics installation ID: " + lowerCase + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    private static final String j(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    private static final String k(String str) {
        return str.replaceAll(f9140b, "");
    }

    public final ap a(boolean z) {
        String strA;
        String str = null;
        if (z) {
            try {
                strA = ((com.google.firebase.installations.j) ay.a(this.f9144f.h())).a();
            } catch (Exception e2) {
                com.google.firebase.crashlytics.a.i.a().i("Error getting Firebase authentication token.", e2);
            }
        } else {
            strA = null;
        }
        try {
            str = (String) ay.a(this.f9144f.a());
        } catch (Exception e3) {
            com.google.firebase.crashlytics.a.i.a().i("Error getting Firebase installation id.", e3);
        }
        return new ap(str, strA);
    }

    @Override // com.google.firebase.crashlytics.a.c.as
    public final synchronized ar b() {
        ar arVar = this.f9146h;
        if (arVar != null && (arVar.d() != null || !this.f9145g.e())) {
            return this.f9146h;
        }
        com.google.firebase.crashlytics.a.i.a().g("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesD = g.d(this.f9142d);
        String string = sharedPreferencesD.getString("firebase.installation.id", null);
        com.google.firebase.crashlytics.a.i.a().g("Cached Firebase Installation ID: ".concat(String.valueOf(string)));
        if (this.f9145g.e()) {
            ap apVarA = a(false);
            com.google.firebase.crashlytics.a.i.a().g("Fetched Firebase Installation ID: ".concat(String.valueOf(apVarA.b())));
            if (apVarA.b() == null) {
                apVarA = new ap(string == null ? c() : string, null);
            }
            if (Objects.equals(apVarA.b(), string)) {
                this.f9146h = ar.a(j(sharedPreferencesD), apVarA);
            } else {
                this.f9146h = ar.a(i(apVarA.b(), sharedPreferencesD), apVarA);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f9146h = new ar(i(c(), sharedPreferencesD), null, null);
        } else {
            this.f9146h = new ar(j(sharedPreferencesD), null, null);
        }
        com.google.firebase.crashlytics.a.i.a().g("Install IDs: ".concat(String.valueOf(String.valueOf(this.f9146h))));
        return this.f9146h;
    }

    public final String d() {
        return this.f9143e;
    }

    public final String e() {
        return this.f9141c.a(this.f9142d);
    }
}
