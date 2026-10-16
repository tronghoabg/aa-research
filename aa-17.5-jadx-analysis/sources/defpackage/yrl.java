package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class yrl extends yrh {
    public static final yrl a = new yrl();

    @Override // defpackage.yrh
    public final long a() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public final String toString() {
        return "Default millisecond precision clock";
    }
}
