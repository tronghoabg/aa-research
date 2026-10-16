package defpackage;

/* loaded from: classes3.dex */
public final class zof {
    public znx a;
    public boolean b;
    public byte c;
    private boolean d;

    public final zog a() {
        if (this.c == 3) {
            return new zog(this.a, this.d, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" keepRawInput");
        }
        if ((this.c & 2) == 0) {
            sb.append(" stripNationalPrefixAfterCountryCode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.d = z;
        this.c = (byte) (this.c | 1);
    }
}
