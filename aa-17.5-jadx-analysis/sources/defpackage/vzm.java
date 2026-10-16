package defpackage;

/* loaded from: classes.dex */
public final class vzm {
    public boolean a;
    public byte b;
    private boolean c;

    public final vzn a() {
        if (this.b == 3) {
            return new vzn(this.c, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" useEventNamePostfix");
        }
        if ((this.b & 2) == 0) {
            sb.append(" includeEventNameTag");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.c = z;
        this.b = (byte) (this.b | 1);
    }
}
