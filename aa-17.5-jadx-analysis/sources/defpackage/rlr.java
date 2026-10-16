package defpackage;

/* loaded from: classes.dex */
public final class rlr {
    private boolean a;
    private boolean b;
    private boolean c;
    private byte d;

    public final rls a() {
        if (this.d == 7) {
            return new rls(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" videoAckLoggable");
        }
        if ((this.d & 2) == 0) {
            sb.append(" audioMediaAckLoggable");
        }
        if ((this.d & 4) == 0) {
            sb.append(" audioGuidanceAckLoggable");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
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
