package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class cpl {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final boolean f;
    public boolean g;
    private final float h;
    private final long i;
    private List j;

    public cpl(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.h = f;
        this.i = j4;
        this.e = j5;
        this.f = z2;
    }

    public final void a() {
        this.g = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndirectPointerInputChange(id=");
        sb.append(new cqt(this.a));
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(new cja(this.c));
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.h);
        sb.append(", previousUptimeMillis=");
        sb.append(this.i);
        sb.append(", previousPosition=");
        sb.append(new cja(this.e));
        sb.append(", previousPressed=");
        sb.append(this.f);
        sb.append(", historical=");
        Object obj = this.j;
        if (obj == null) {
            obj = afbe.a;
        }
        sb.append(obj);
        sb.append(", isConsumed=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public cpl(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, List list) {
        this(j, j2, j3, z, f, j4, j5, z2);
        this.j = list;
    }
}
