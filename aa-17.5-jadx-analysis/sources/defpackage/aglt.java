package defpackage;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class aglt implements Serializable {
    public static final agls Companion = new agls(null);
    private static final aglt NO_POSITION = new aglt(-1, -1);
    private final int column;
    private final int line;

    public aglt(int i, int i2) {
        this.line = i;
        this.column = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aglt)) {
            return false;
        }
        aglt agltVar = (aglt) obj;
        return this.line == agltVar.line && this.column == agltVar.column;
    }

    public int hashCode() {
        return (this.line * 31) + this.column;
    }

    public String toString() {
        return "Position(line=" + this.line + ", column=" + this.column + ')';
    }
}
