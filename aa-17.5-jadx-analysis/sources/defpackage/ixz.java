package defpackage;

import android.content.Intent;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class ixz {
    public final Intent a;
    public final qpi b;
    final int c;

    public ixz(Intent intent, qpi qpiVar, int i) {
        this.a = intent;
        this.b = qpiVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ixz)) {
            return false;
        }
        ixz ixzVar = (ixz) obj;
        return this.a.filterEquals(ixzVar.a) && this.b == ixzVar.b && this.c == ixzVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a.filterHashCode()), this.b, Integer.valueOf(this.c));
    }

    public final String toString() {
        qpi qpiVar = this.b;
        return "Q[i=" + String.valueOf(this.a) + ", t=" + String.valueOf(qpiVar) + ", f=" + this.c + "]";
    }
}
