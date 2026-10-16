package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class toc implements defpackage.six {
    @Override // defpackage.six
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
        return i & ((-1) << (25 - java.lang.Integer.numberOfLeadingZeros(i)));
    }
}
