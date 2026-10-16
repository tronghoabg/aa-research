package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class sja implements defpackage.six {
    protected final int a;

    public sja(int i) {
        defpackage.acmj.h(i > 0, "bad alias: %s", new java.lang.Object[]{java.lang.Integer.valueOf(i)});
        this.a = i;
    }

    @Override // defpackage.six
    public long a(long j) {
        long j2 = this.a;
        return j2 * (j / j2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.sja) && this.a == ((defpackage.sja) obj).a;
    }
}
