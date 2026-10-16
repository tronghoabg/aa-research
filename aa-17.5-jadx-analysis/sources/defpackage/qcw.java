package defpackage;

import android.os.Bundle;
import j$.util.Objects;

/* loaded from: classes2.dex */
public final class qcw {
    public final int a;
    public final Bundle b;
    public final qcz c;

    public qcw(int i, Bundle bundle, qcz qczVar) {
        this.a = i;
        this.b = bundle;
        this.c = qczVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            qcw qcwVar = (qcw) obj;
            if (this.a == qcwVar.a && this.b.equals(qcwVar.b) && this.c.equals(qcwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(-4319067186032159575L, Integer.valueOf(this.a), this.b, this.c);
    }
}
