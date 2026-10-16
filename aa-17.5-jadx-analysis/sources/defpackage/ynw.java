package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class ynw {
    public final int a;
    public final TimeUnit b;

    public ynw(int i, TimeUnit timeUnit) {
        this.a = i;
        timeUnit.getClass();
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ynw) {
            ynw ynwVar = (ynw) obj;
            if (this.a == ynwVar.a && this.b == ynwVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return this.b.hashCode() ^ (i * 37);
    }

    public final String toString() {
        return this.a + " " + this.b.toString();
    }
}
