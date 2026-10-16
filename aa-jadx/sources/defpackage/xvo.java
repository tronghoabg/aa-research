package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class xvo {
    public final int[] a;
    public final defpackage.xvm b;
    public defpackage.xvm c;
    public int d;
    public int e;
    public int f;

    public xvo(int[] iArr) {
        this.a = iArr;
        defpackage.xvm xvmVar = new defpackage.xvm(-1, -1);
        this.b = xvmVar;
        this.c = xvmVar;
    }

    private final void d(defpackage.xvm xvmVar, java.lang.StringBuilder sb) {
        for (defpackage.xvm xvmVar2 : xvmVar.d.values()) {
            sb.append("  ");
            sb.append(xvmVar);
            sb.append(" -> ");
            sb.append(xvmVar2);
            sb.append(" [label=\"");
            int[] iArr = this.a;
            sb.append(java.util.Arrays.toString(java.util.Arrays.copyOfRange(iArr, xvmVar2.a, java.lang.Math.min(iArr.length, xvmVar2.b + 1))));
            sb.append("\"]\n");
            d(xvmVar2, sb);
        }
    }

    final void a() {
        defpackage.xvm xvmVar = this.c.c;
        if (xvmVar != null) {
            this.c = xvmVar;
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
        java.util.Map map = this.c.d;
        int[] iArr = this.a;
        defpackage.xvm xvmVar = (defpackage.xvm) map.get(java.lang.Integer.valueOf(iArr[this.d]));
        while (true) {
            int i = (xvmVar.b - xvmVar.a) + 1;
            int i2 = this.e;
            if (i > i2) {
                return;
            }
            int i3 = this.d + i;
            this.d = i3;
            this.c = xvmVar;
            int i4 = i2 - i;
            this.e = i4;
            if (i4 > 0) {
                xvmVar = (defpackage.xvm) xvmVar.d.get(java.lang.Integer.valueOf(iArr[i3]));
            }
        }
    }

    public final boolean c(int i, int i2, int i3, int i4) {
        if (i >= 0 && i3 >= 0) {
            int[] iArr = this.a;
            int length = iArr.length;
            int iMin = java.lang.Math.min(length, i2);
            if (iMin - i == java.lang.Math.min(length, i4) - i3) {
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

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("digraph {\n");
        d(this.b, sb);
        sb.append("}");
        return sb.toString();
    }
}
