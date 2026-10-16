package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final long f10045a;

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f10046b;

    /* renamed from: c, reason: collision with root package name */
    private static m f10047c;

    static {
        TimeUnit timeUnit = TimeUnit.HOURS;
        f10045a = 3600L;
        f10046b = Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    public static m b() {
        com.google.firebase.crashlytics.ktx.a.a();
        m mVar = f10047c;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m();
        f10047c = mVar2;
        return mVar2;
    }

    static boolean d(String str) {
        return f10046b.matcher(str).matches();
    }

    public final long a() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return System.currentTimeMillis() / 1000;
    }

    public final boolean c(com.google.firebase.installations.b.d dVar) {
        return TextUtils.isEmpty(dVar.i()) || dVar.g() + dVar.f() < a() + f10045a;
    }
}
