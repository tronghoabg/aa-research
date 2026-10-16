package com.google.d.m.a;

import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bx {

    /* renamed from: a, reason: collision with root package name */
    private String f8048a = null;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f8049b = null;

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public final ThreadFactory b() {
        String str = this.f8048a;
        return new bw(Executors.defaultThreadFactory(), str, str != null ? new AtomicLong(0L) : null, this.f8049b);
    }

    public final void c() {
        this.f8049b = true;
    }

    public final void d(String str) {
        e(str, 0);
        this.f8048a = str;
    }
}
