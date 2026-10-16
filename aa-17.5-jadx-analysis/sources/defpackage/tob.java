package defpackage;

/* loaded from: classes3.dex */
public final class tob extends toc {
    public static tob a(String str) {
        toc tocVarE = toc.e(str);
        if (tocVarE != null) {
            return new tob(tocVarE.b, tocVarE.c);
        }
        return null;
    }

    @Override // defpackage.toc
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tob) && this.c == ((tob) obj).c;
    }

    @Override // defpackage.toc
    public final int hashCode() {
        long j = this.c;
        return (int) (j ^ (j >>> 32));
    }
}
