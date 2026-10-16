package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nvr {
    public final nuv a;
    public final java.util.List b;

    public nvr(nuv nuvVar, java.util.List list) {
        this.a = nuvVar;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nvr)) {
            return false;
        }
        defpackage.nvr nvrVar = (defpackage.nvr) obj;
        return defpackage.afga.f(this.a, nvrVar.a) && defpackage.afga.f(this.b, nvrVar.b);
    }

    public final int hashCode() {
        nuv nuvVar = this.a;
        return ((nuvVar == null ? 0 : nuvVar.hashCode()) * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "OngoingNotificationInfo(highestPriorityOngoing=" + this.a + ", suppressedEntries=" + this.b + ")";
    }
}
