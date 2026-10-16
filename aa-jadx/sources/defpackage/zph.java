package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zph {
    public defpackage.zoz a;
    public boolean b;
    public byte c;
    private boolean d;

    public final defpackage.zpi a() {
        if (this.c == 3) {
            return new defpackage.zpi(this.a, this.d, this.b);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" keepRawInput");
        }
        if ((this.c & 2) == 0) {
            sb.append(" stripNationalPrefixAfterCountryCode");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.d = z;
        this.c = (byte) (this.c | 1);
    }
}
