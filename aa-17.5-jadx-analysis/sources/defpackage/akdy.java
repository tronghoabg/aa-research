package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class akdy extends akcm implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    public final akco d;

    protected akdy(akco akcoVar) {
        this.d = akcoVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        long jC = ((akcm) obj).c();
        long jC2 = c();
        if (jC2 == jC) {
            return 0;
        }
        return jC2 < jC ? -1 : 1;
    }

    @Override // defpackage.akcm
    public final akco d() {
        return this.d;
    }

    @Override // defpackage.akcm
    public final boolean f() {
        return true;
    }

    public final String toString() {
        return "DurationField[" + this.d.m + "]";
    }
}
