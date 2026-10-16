package defpackage;

/* loaded from: classes.dex */
public final class adji {
    public final adjh a;
    public final adnq b;

    public adji(adjh adjhVar, adnq adnqVar) {
        this.a = adjhVar;
        adnqVar.getClass();
        this.b = adnqVar;
    }

    public static adji a(adjh adjhVar) {
        woy.O(adjhVar != adjh.c, "state is TRANSIENT_ERROR. Use forError() instead");
        return new adji(adjhVar, adnq.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof adji)) {
            return false;
        }
        adji adjiVar = (adji) obj;
        return this.a.equals(adjiVar.a) && this.b.equals(adjiVar.b);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        adnq adnqVar = this.b;
        boolean zG = adnqVar.g();
        adjh adjhVar = this.a;
        if (zG) {
            return adjhVar.toString();
        }
        return adjhVar.toString() + "(" + adnqVar.toString() + ")";
    }
}
