package defpackage;

/* loaded from: classes3.dex */
public class uhx {
    protected final uju b;
    protected final int c;

    public uhx(uju ujuVar, int i) {
        this.b = ujuVar;
        this.c = i;
    }

    public boolean equals(Object obj) {
        uhx uhxVar;
        return (obj instanceof uhx) && (uhxVar = (uhx) obj) != null && this.b.equals(uhxVar.b) && this.c == uhxVar.c;
    }

    public int hashCode() {
        return ((this.b.hashCode() + 31) * 31) + this.c;
    }
}
