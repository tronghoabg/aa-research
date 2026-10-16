package defpackage;

/* loaded from: classes.dex */
public final class nww {
    public boolean a;
    public byte b;
    private boolean c;
    private int d;
    private int e;

    public final nxs a() {
        int i = ~this.b;
        if ((i & 7) == 0) {
            return new nxs(this.c, this.d, this.e, this.a & ((i & 8) == 0));
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" isOpen");
        }
        if ((this.b & 2) == 0) {
            sb.append(" badgeCount");
        }
        if ((this.b & 4) == 0) {
            sb.append(" notificationCount");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.b = (byte) (this.b | 2);
    }

    public final void c(boolean z) {
        this.c = z;
        this.b = (byte) (this.b | 1);
    }

    public final void d(int i) {
        this.e = i;
        this.b = (byte) (this.b | 4);
    }
}
