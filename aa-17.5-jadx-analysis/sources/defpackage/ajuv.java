package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class ajuv implements ajpb {
    public ajoy a;
    public ajoy b;
    public boolean c;

    protected ajuv() {
    }

    @Override // defpackage.ajpb
    public final ajoy c() {
        return this.b;
    }

    @Override // defpackage.ajpb
    public final ajoy d() {
        return this.a;
    }

    @Override // defpackage.ajpb
    public final boolean g() {
        return this.c;
    }

    public final void j(String str) {
        this.a = new ajzx("Content-Type", str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        if (this.a != null) {
            sb.append("Content-Type: ");
            sb.append(this.a.c());
            sb.append(',');
        }
        if (this.b != null) {
            sb.append("Content-Encoding: ");
            sb.append(this.b.c());
            sb.append(',');
        }
        long jA = a();
        if (jA >= 0) {
            sb.append("Content-Length: ");
            sb.append(jA);
            sb.append(',');
        }
        sb.append("Chunked: ");
        sb.append(this.c);
        sb.append(']');
        return sb.toString();
    }

    @Override // defpackage.ajpb
    @Deprecated
    public final void e() throws IOException {
    }
}
