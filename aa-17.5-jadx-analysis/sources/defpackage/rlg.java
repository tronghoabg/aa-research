package defpackage;

/* loaded from: classes.dex */
public final class rlg {
    public rls a;
    private boolean b;
    private int c;
    private byte d;

    public final rlh a() {
        rls rlsVar;
        if (this.d == 3 && (rlsVar = this.a) != null) {
            return new rlh(this.b, this.c, rlsVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" isEnabled");
        }
        if ((this.d & 2) == 0) {
            sb.append(" bufferSize");
        }
        if (this.a == null) {
            sb.append(" galMessageFilter");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.c = i;
        this.d = (byte) (this.d | 2);
    }

    public final void c(boolean z) {
        this.b = z;
        this.d = (byte) (this.d | 1);
    }
}
