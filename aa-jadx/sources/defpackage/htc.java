package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class htc implements java.lang.Cloneable {
    public defpackage.ifn a = defpackage.ifk.b;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.htc clone() {
        try {
            return (defpackage.htc) super.clone();
        } catch (java.lang.CloneNotSupportedException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.htc)) {
            return false;
        }
        defpackage.ifn ifnVar = this.a;
        defpackage.ifn ifnVar2 = ((defpackage.htc) obj).a;
        char[] cArr = defpackage.igg.a;
        return defpackage.a.an(ifnVar, ifnVar2);
    }

    public final int hashCode() {
        defpackage.ifn ifnVar = this.a;
        if (ifnVar != null) {
            return ifnVar.hashCode();
        }
        return 0;
    }
}
