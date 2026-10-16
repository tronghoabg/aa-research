package defpackage;

/* loaded from: classes2.dex */
public class sig implements sid {
    protected final int a;

    public sig(int i) {
        aclh.o(i > 0, "bad alias: %s", new Object[]{Integer.valueOf(i)});
        this.a = i;
    }

    @Override // defpackage.sid
    public long a(long j) {
        long j2 = this.a;
        return j2 * (j / j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sig) && this.a == ((sig) obj).a;
    }
}
