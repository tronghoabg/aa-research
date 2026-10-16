package com.waze.shared_infra.i;

import android.util.Log;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    private final String f37892a;

    /* renamed from: b, reason: collision with root package name */
    private Throwable f37893b;

    /* renamed from: c, reason: collision with root package name */
    private String f37894c;

    public f(String str) {
        this.f37892a = str;
    }

    public final void a(Throwable th) {
        this.f37893b = th;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return toString().charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return toString().length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return toString().subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        String str = this.f37894c;
        if (str != null) {
            return str;
        }
        Throwable th = this.f37893b;
        String str2 = this.f37892a;
        if (th != null) {
            str2 = String.format("%s: %s\n%s", str2, th.getMessage(), Log.getStackTraceString(this.f37893b));
        }
        this.f37894c = str2;
        return str2;
    }
}
