package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jaf {
    public boolean a;
    public byte b;
    private int c;
    private int d;
    private defpackage.jcb e;
    private int f;

    public final defpackage.jag a() {
        defpackage.jcb jcbVar;
        if (this.b == 15 && (jcbVar = this.e) != null) {
            defpackage.jag jagVar = new defpackage.jag(this.c, this.d, this.a, jcbVar, this.f);
            int i = jagVar.a;
            if (i < 263 || i > 65539) {
                throw new java.lang.IllegalArgumentException("Maximum frame size cannot be smaller than 263 or larger than 655354");
            }
            return jagVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
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
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
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

    public final void e(defpackage.jcb jcbVar) {
        if (jcbVar == null) {
            throw new java.lang.NullPointerException("Null senderLibConfig");
        }
        this.e = jcbVar;
    }
}
