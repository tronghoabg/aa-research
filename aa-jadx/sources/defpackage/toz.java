package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class toz extends defpackage.tpa {
    public static defpackage.toz a(java.lang.String str) {
        defpackage.tpa tpaVarE = defpackage.tpa.e(str);
        if (tpaVarE != null) {
            return new defpackage.toz(tpaVarE.b, tpaVarE.c);
        }
        return null;
    }

    @Override // defpackage.tpa
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.toz) && this.c == ((defpackage.toz) obj).c;
    }

    @Override // defpackage.tpa
    public final int hashCode() {
        long j = this.c;
        return (int) (j ^ (j >>> 32));
    }
}
