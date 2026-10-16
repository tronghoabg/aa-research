package defpackage;

/* loaded from: classes3.dex */
public final class tne implements sid {
    @Override // defpackage.sid
    public final long a(long j) {
        if (j < 0) {
            return 0L;
        }
        if (j < 128) {
            return j;
        }
        if (j >= 1048576) {
            return 1048576L;
        }
        int i = (int) j;
        return i & ((-1) << (25 - Integer.numberOfLeadingZeros(i)));
    }
}
