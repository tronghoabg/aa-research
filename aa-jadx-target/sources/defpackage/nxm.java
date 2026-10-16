package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nxm {
    public boolean a;
    public byte b;
    private boolean c;
    private int d;
    private int e;

    public final defpackage.nyi a() {
        int i = ~this.b;
        if ((i & 7) == 0) {
            return new defpackage.nyi(this.c, this.d, this.e, this.a & ((i & 8) == 0));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" isOpen");
        }
        if ((this.b & 2) == 0) {
            sb.append(" badgeCount");
        }
        if ((this.b & 4) == 0) {
            sb.append(" notificationCount");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
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
