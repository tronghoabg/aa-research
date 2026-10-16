package com.google.firebase.appcheck.a;

import androidx.compose.material3.internal.CalendarModelKt;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private long f8864a = 0;

    /* renamed from: b, reason: collision with root package name */
    private long f8865b = -1;

    public final void a() {
        this.f8864a = 0L;
        this.f8865b = -1L;
    }

    public final void b(int i2) {
        this.f8864a++;
        if (i2 == 400 || i2 == 404) {
            this.f8865b = System.currentTimeMillis() + CalendarModelKt.MillisecondsIn24Hours;
            return;
        }
        this.f8865b = System.currentTimeMillis() + Math.min((long) (Math.pow(2.0d, this.f8864a * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000L);
    }

    public final boolean c() {
        return this.f8865b <= System.currentTimeMillis();
    }
}
