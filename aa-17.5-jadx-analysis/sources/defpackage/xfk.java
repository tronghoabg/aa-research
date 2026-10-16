package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class xfk {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;

    public final String toString() {
        return String.format(Locale.US, "imp(%d), reason(%d), reason_pid(%d), lru(%d), uid(%d)", Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e));
    }
}
