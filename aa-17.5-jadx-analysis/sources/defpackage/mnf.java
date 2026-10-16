package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class mnf {
    public yfl a;
    public yfq b;
    public yfl c;
    public yfq d;
    public int e;
    public boolean f;
    public String g;
    public boolean h;
    public byte i;

    public final mnk a() {
        yfl yflVar = this.a;
        if (yflVar != null) {
            this.b = yflVar.g();
        } else if (this.b == null) {
            int i = yfq.d;
            this.b = yls.a;
        }
        yfl yflVar2 = this.c;
        if (yflVar2 != null) {
            this.d = yflVar2.g();
        } else if (this.d == null) {
            int i2 = yfq.d;
            this.d = yls.a;
        }
        if (this.i == 127) {
            return new mmz(this.b, this.d, this.e, this.f, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.i & 1) == 0) {
            sb.append(" minWidth");
        }
        if ((this.i & 2) == 0) {
            sb.append(" maxWidth");
        }
        if ((this.i & 4) == 0) {
            sb.append(" showColumnNames");
        }
        if ((this.i & 8) == 0) {
            sb.append(" useEllipsis");
        }
        if ((this.i & 16) == 0) {
            sb.append(" isMultiline");
        }
        if ((this.i & 32) == 0) {
            sb.append(" headerBorder");
        }
        if ((this.i & 64) == 0) {
            sb.append(" hideEmptyColumns");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(mnh mnhVar) {
        yfl yflVar = this.a;
        if (yflVar == null) {
            int i = yfq.d;
            yflVar = new yfl(4);
            this.a = yflVar;
        }
        yflVar.i(mnhVar);
    }

    public final void c(Object... objArr) {
        yfl yflVar = this.c;
        if (yflVar == null) {
            int i = yfq.d;
            yflVar = new yfl(4);
            this.c = yflVar;
        }
        yflVar.i(DesugarCollections.unmodifiableList(Arrays.asList(objArr)));
    }

    public final void d(hhj hhjVar) {
        yfl yflVar = this.a;
        if (yflVar == null) {
            int i = yfq.d;
            yflVar = new yfl(4);
            this.a = yflVar;
        }
        yflVar.i(hhjVar);
    }
}
