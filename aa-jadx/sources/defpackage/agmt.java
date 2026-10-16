package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agmt implements java.io.Serializable {
    public static final defpackage.agms Companion = new defpackage.agms(null);
    private static final defpackage.agmt NO_POSITION = new defpackage.agmt(-1, -1);
    private final int column;
    private final int line;

    public agmt(int i, int i2) {
        this.line = i;
        this.column = i2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.agmt)) {
            return false;
        }
        defpackage.agmt agmtVar = (defpackage.agmt) obj;
        return this.line == agmtVar.line && this.column == agmtVar.column;
    }

    public int hashCode() {
        return (this.line * 31) + this.column;
    }

    public java.lang.String toString() {
        return "Position(line=" + this.line + ", column=" + this.column + ')';
    }
}
