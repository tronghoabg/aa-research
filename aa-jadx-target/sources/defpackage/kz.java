package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kz {
    int a;
    int b;
    int[] c;
    int d;

    public final void a(int i, int i2) {
        if (i < 0) {
            throw new java.lang.IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.d;
        int i4 = i3 + i3;
        int[] iArr = this.c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.c = iArr2;
            java.util.Arrays.fill(iArr2, -1);
        } else {
            int length = iArr.length;
            if (i4 >= length) {
                int[] iArr3 = new int[i4 + i4];
                this.c = iArr3;
                java.lang.System.arraycopy(iArr, 0, iArr3, 0, length);
            }
        }
        int[] iArr4 = this.c;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    final void b() {
        int[] iArr = this.c;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
        }
        this.d = 0;
    }

    final void c(android.support.v7.widget.RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = this.c;
        if (iArr != null) {
            java.util.Arrays.fill(iArr, -1);
        }
        defpackage.mc mcVar = recyclerView.n;
        if (recyclerView.m == null || mcVar == null || !mcVar.x) {
            return;
        }
        if (z) {
            if (!recyclerView.g.k()) {
                mcVar.ao(recyclerView.m.a(), this);
            }
        } else if (!recyclerView.am()) {
            mcVar.an(this.a, this.b, recyclerView.N, this);
        }
        int i = this.d;
        if (i > mcVar.y) {
            mcVar.y = i;
            mcVar.z = z;
            recyclerView.e.m();
        }
    }

    final boolean d(int i) {
        if (this.c != null) {
            int i2 = this.d;
            int i3 = i2 + i2;
            for (int i4 = 0; i4 < i3; i4 += 2) {
                if (this.c[i4] == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
