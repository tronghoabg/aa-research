package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class rmn {
    private boolean a;
    private boolean b;
    private boolean c;
    private byte d;

    public final defpackage.rmo a() {
        if (this.d == 7) {
            return new defpackage.rmo(this.a, this.b, this.c);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" videoAckLoggable");
        }
        if ((this.d & 2) == 0) {
            sb.append(" audioMediaAckLoggable");
        }
        if ((this.d & 4) == 0) {
            sb.append(" audioGuidanceAckLoggable");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 4);
    }

    public final void c(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 2);
    }

    public final void d(boolean z) {
        this.a = z;
        this.d = (byte) (this.d | 1);
    }
}
