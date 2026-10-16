package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class akey extends defpackage.akdm implements java.io.Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    public final defpackage.akdo d;

    protected akey(defpackage.akdo akdoVar) {
        this.d = akdoVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        long jC = ((defpackage.akdm) obj).c();
        long jC2 = c();
        if (jC2 == jC) {
            return 0;
        }
        return jC2 < jC ? -1 : 1;
    }

    @Override // defpackage.akdm
    public final defpackage.akdo d() {
        return this.d;
    }

    @Override // defpackage.akdm
    public final boolean f() {
        return true;
    }

    public final java.lang.String toString() {
        return "DurationField[" + this.d.m + "]";
    }
}
