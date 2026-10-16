package defpackage;

/* loaded from: classes.dex */
public final class izy {
    public boolean a;
    public byte b;
    private int c;
    private int d;
    private jbu e;
    private int f;

    public final izz a() {
        jbu jbuVar;
        if (this.b == 15 && (jbuVar = this.e) != null) {
            izz izzVar = new izz(this.c, this.d, this.a, jbuVar, this.f);
            int i = izzVar.a;
            if (i < 263 || i > 65539) {
                throw new IllegalArgumentException("Maximum frame size cannot be smaller than 263 or larger than 655354");
            }
            return izzVar;
        }
        StringBuilder sb = new StringBuilder();
        if ((this.b & 1) == 0) {
            sb.append(" fragmentSize");
        }
        if ((this.b & 2) == 0) {
            sb.append(" bufferedStreamSize");
        }
        if ((this.b & 4) == 0) {
            sb.append(" allowAudioPacketDrops");
        }
        if (this.e == null) {
            sb.append(" senderLibConfig");
        }
        if ((this.b & 8) == 0) {
            sb.append(" connectionType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(int i) {
        this.d = i;
        this.b = (byte) (this.b | 2);
    }

    public final void c(int i) {
        this.f = i;
        this.b = (byte) (this.b | 8);
    }

    public final void d(int i) {
        this.c = i;
        this.b = (byte) (this.b | 1);
    }

    public final void e(jbu jbuVar) {
        if (jbuVar == null) {
            throw new NullPointerException("Null senderLibConfig");
        }
        this.e = jbuVar;
    }
}
