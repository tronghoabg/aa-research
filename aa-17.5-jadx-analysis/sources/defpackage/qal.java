package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
public final class qal {
    private final int a;
    private final long b;

    public qal(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qal) {
            qal qalVar = (qal) obj;
            if (this.a == qalVar.a && this.b == qalVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        return ((this.a ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "http://go/veat/" + this.a + " @ " + SimpleDateFormat.getDateTimeInstance().format(new Date(this.b));
    }

    public qal() {
        throw null;
    }
}
