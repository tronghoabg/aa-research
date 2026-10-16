package defpackage;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes3.dex */
final class xui {
    public final int[] a;
    public final xug b;
    public xug c;
    public int d;
    public int e;
    public int f;

    public xui(int[] iArr) {
        this.a = iArr;
        xug xugVar = new xug(-1, -1);
        this.b = xugVar;
        this.c = xugVar;
    }

    private final void d(xug xugVar, StringBuilder sb) {
        for (xug xugVar2 : xugVar.d.values()) {
            sb.append("  ");
            sb.append(xugVar);
            sb.append(" -> ");
            sb.append(xugVar2);
            sb.append(" [label=\"");
            int[] iArr = this.a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, xugVar2.a, Math.min(iArr.length, xugVar2.b + 1))));
            sb.append("\"]\n");
            d(xugVar2, sb);
        }
    }

    final void a() {
        xug xugVar = this.c.c;
        if (xugVar != null) {
            this.c = xugVar;
        } else {
            this.c = this.b;
            int i = this.e;
            if (i > 0) {
                this.e = i - 1;
            }
            if (this.f > 0) {
                this.d++;
            }
        }
        b();
    }

    final void b() {
        if (this.e == 0) {
            return;
        }
        Map map = this.c.d;
        int[] iArr = this.a;
        xug xugVar = (xug) map.get(Integer.valueOf(iArr[this.d]));
        while (true) {
            int i = (xugVar.b - xugVar.a) + 1;
            int i2 = this.e;
            if (i > i2) {
                return;
            }
            int i3 = this.d + i;
            this.d = i3;
            this.c = xugVar;
            int i4 = i2 - i;
            this.e = i4;
            if (i4 > 0) {
                xugVar = (xug) xugVar.d.get(Integer.valueOf(iArr[i3]));
            }
        }
    }

    public final boolean c(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int[] iArr = this.a;
            int length = iArr.length;
            int iMin = Math.min(length, i2);
            if (iMin - i == Math.min(length, i4) - i3) {
                for (int i5 = i; i5 <= iMin; i5++) {
                    if (iArr[i5] != iArr[(i3 + i5) - i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        d(this.b, sb);
        sb.append("}");
        return sb.toString();
    }
}
