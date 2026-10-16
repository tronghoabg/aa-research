package defpackage;

/* loaded from: classes.dex */
public final class yqq {
    public final ysb a;
    public final String b;

    public yqq(ysb ysbVar, String str) {
        ysbVar.getClass();
        this.a = ysbVar;
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yqq) {
            yqq yqqVar = (yqq) obj;
            if (this.a.equals(yqqVar.a) && this.b.equals(yqqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
