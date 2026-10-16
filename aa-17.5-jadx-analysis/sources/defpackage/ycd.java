package defpackage;

import j$.util.Objects;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class ycd<F, T> extends yln<F> implements Serializable {
    private static final long serialVersionUID = 0;
    final xwx a;
    final yln b;

    public ycd(xwx xwxVar, yln ylnVar) {
        this.a = xwxVar;
        this.b = ylnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yln, java.util.Comparator
    public final int compare(F f, F f2) {
        xwx xwxVar = this.a;
        return this.b.compare(xwxVar.a(f), xwxVar.a(f2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ycd) {
            ycd ycdVar = (ycd) obj;
            if (this.a.equals(ycdVar.a) && this.b.equals(ycdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return "Ordering.natural().reverse().onResultOf(" + this.a.toString() + ")";
    }
}
