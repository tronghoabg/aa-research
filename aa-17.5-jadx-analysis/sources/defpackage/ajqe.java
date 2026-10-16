package defpackage;

import java.util.Queue;

/* loaded from: classes2.dex */
public final class ajqe {
    public ajpx a = ajpx.a;
    public ajpy b;
    public ajqj c;
    public Queue d;

    public final void a() {
        this.a = ajpx.a;
        this.d = null;
        this.b = null;
        this.c = null;
    }

    public final void b(ajpy ajpyVar, ajqj ajqjVar) {
        this.b = ajpyVar;
        this.c = ajqjVar;
        this.d = null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("state:");
        sb.append(this.a);
        sb.append(";");
        if (this.b != null) {
            sb.append("auth scheme:");
            sb.append(this.b.b());
            sb.append(";");
        }
        if (this.c != null) {
            sb.append("credentials present");
        }
        return sb.toString();
    }
}
