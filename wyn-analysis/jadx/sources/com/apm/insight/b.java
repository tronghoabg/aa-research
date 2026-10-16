package com.apm.insight;

import android.text.TextUtils;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class b implements ICrashCallback, IOOMCallback {

    /* renamed from: a, reason: collision with root package name */
    private IOOMCallback f20172a;

    /* renamed from: b, reason: collision with root package name */
    private ICrashCallback f20173b;

    /* renamed from: c, reason: collision with root package name */
    private String f20174c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.f20174c = str;
        this.f20173b = iCrashCallback;
    }

    public final void a(CrashType crashType, Throwable th, Thread thread, long j8, JSONArray jSONArray) {
        CrashType crashType2;
        Throwable th2;
        Thread thread2;
        long j10;
        if (this.f20172a == null || jSONArray == null) {
            return;
        }
        int i5 = 0;
        while (i5 < jSONArray.length()) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i5), "header", "aid"), this.f20174c)) {
                crashType2 = crashType;
                th2 = th;
                thread2 = thread;
                j10 = j8;
                this.f20172a.onCrash(crashType2, th2, thread2, j10);
            } else {
                crashType2 = crashType;
                th2 = th;
                thread2 = thread;
                j10 = j8;
            }
            i5++;
            crashType = crashType2;
            th = th2;
            thread = thread2;
            j8 = j10;
        }
    }

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(CrashType crashType, String str, Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(CrashType crashType, Throwable th, Thread thread, long j8) {
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.f20174c = str;
        this.f20172a = iOOMCallback;
    }

    public final void a(CrashType crashType, String str, Thread thread, JSONArray jSONArray) {
        if (this.f20173b == null || jSONArray == null) {
            return;
        }
        for (int i5 = 0; i5 < jSONArray.length(); i5++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i5), "header", "aid"), this.f20174c)) {
                this.f20173b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(CrashType crashType, String str, String str2, String str3) {
        d dVarA;
        if (this.f20173b == null || (dVarA = d.a(this.f20174c)) == null || !dVarA.a(str3, str2)) {
            return;
        }
        this.f20173b.onCrash(crashType, str, null);
    }
}
