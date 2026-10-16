package kotlinx.b.d.a;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f51172a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    private int[] f51173b;

    /* renamed from: c, reason: collision with root package name */
    private int f51174c;

    public s() {
        int[] iArr = new int[8];
        for (int i2 = 0; i2 < 8; i2++) {
            iArr[i2] = -1;
        }
        this.f51173b = iArr;
        this.f51174c = -1;
    }

    private final void g() {
        int i2 = this.f51174c;
        int i3 = i2 + i2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f51172a, i3);
        h.g.b.x.e(objArrCopyOf, "copyOf(...)");
        this.f51172a = objArrCopyOf;
        int[] iArrCopyOf = Arrays.copyOf(this.f51173b, i3);
        h.g.b.x.e(iArrCopyOf, "copyOf(...)");
        this.f51173b = iArrCopyOf;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("$");
        int i2 = this.f51174c + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = this.f51172a[i3];
            if (obj instanceof kotlinx.b.a.q) {
                kotlinx.b.a.q qVar = (kotlinx.b.a.q) obj;
                boolean zN = h.g.b.x.n(qVar.h(), kotlinx.b.a.z.f50941a);
                int[] iArr = this.f51173b;
                if (!zN) {
                    int i4 = iArr[i3];
                    if (i4 >= 0) {
                        sb.append(".");
                        sb.append(qVar.c(i4));
                    }
                } else if (iArr[i3] != -1) {
                    sb.append("[");
                    sb.append(this.f51173b[i3]);
                    sb.append("]");
                }
            } else if (obj != r.f51171a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public final void b() {
        int i2 = this.f51174c;
        int[] iArr = this.f51173b;
        if (iArr[i2] == -2) {
            iArr[i2] = -1;
            i2--;
            this.f51174c = i2;
        }
        if (i2 != -1) {
            this.f51174c = i2 - 1;
        }
    }

    public final void c(kotlinx.b.a.q qVar) {
        h.g.b.x.f(qVar, "sd");
        int i2 = this.f51174c + 1;
        this.f51174c = i2;
        if (i2 == this.f51172a.length) {
            g();
        }
        this.f51172a[i2] = qVar;
    }

    public final void d() {
        int[] iArr = this.f51173b;
        int i2 = this.f51174c;
        if (iArr[i2] == -2) {
            this.f51172a[i2] = r.f51171a;
        }
    }

    public final void e(Object obj) {
        int[] iArr = this.f51173b;
        int i2 = this.f51174c;
        if (iArr[i2] != -2) {
            int i3 = i2 + 1;
            this.f51174c = i3;
            if (i3 == this.f51172a.length) {
                g();
            }
        }
        Object[] objArr = this.f51172a;
        int i4 = this.f51174c;
        objArr[i4] = obj;
        this.f51173b[i4] = -2;
    }

    public final void f(int i2) {
        this.f51173b[this.f51174c] = i2;
    }

    public final String toString() {
        return a();
    }
}
