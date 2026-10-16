package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import androidx.compose.material3.internal.CalendarModelKt;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private long f4310a;

    /* renamed from: b, reason: collision with root package name */
    private long f4311b;

    /* renamed from: c, reason: collision with root package name */
    private Set f4312c;

    /* renamed from: d, reason: collision with root package name */
    private byte f4313d;

    public final d a() {
        Set set;
        if (this.f4313d == 3 && (set = this.f4312c) != null) {
            return new d(this.f4310a, this.f4311b, set);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f4313d & 1) == 0) {
            sb.append(" delta");
        }
        if ((this.f4313d & 2) == 0) {
            sb.append(" maxAllowedDelay");
        }
        if (this.f4312c == null) {
            sb.append(" flags");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j2) {
        this.f4310a = j2;
        this.f4313d = (byte) (this.f4313d | 1);
    }

    public final void c(Set set) {
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        this.f4312c = set;
    }

    public final void d() {
        this.f4311b = CalendarModelKt.MillisecondsIn24Hours;
        this.f4313d = (byte) (this.f4313d | 2);
    }
}
