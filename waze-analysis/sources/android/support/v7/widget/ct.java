package android.support.v7.widget;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ct implements el {

    /* renamed from: a, reason: collision with root package name */
    int f1279a;

    /* renamed from: b, reason: collision with root package name */
    int f1280b;

    /* renamed from: c, reason: collision with root package name */
    int[] f1281c;

    /* renamed from: d, reason: collision with root package name */
    int f1282d;

    @Override // android.support.v7.widget.el
    public final void a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i4 = this.f1282d;
        int i5 = i4 + i4;
        int[] iArr = this.f1281c;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f1281c = iArr2;
            Arrays.fill(iArr2, -1);
        } else {
            int length = iArr.length;
            if (i5 >= length) {
                int[] iArr3 = new int[i5 + i5];
                this.f1281c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, length);
            }
        }
        int[] iArr4 = this.f1281c;
        iArr4[i5] = i2;
        iArr4[i5 + 1] = i3;
        this.f1282d++;
    }

    final void b() {
        int[] iArr = this.f1281c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f1282d = 0;
    }

    final void c(RecyclerView recyclerView, boolean z) {
        this.f1282d = 0;
        int[] iArr = this.f1281c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        en enVar = recyclerView.n;
        if (recyclerView.m == null || enVar == null || !enVar.bi()) {
            return;
        }
        if (z) {
            if (!recyclerView.f939f.l()) {
                enVar.W(recyclerView.m.getItemCount(), this);
            }
        } else if (!recyclerView.au()) {
            enVar.V(this.f1279a, this.f1280b, recyclerView.E, this);
        }
        int i2 = this.f1282d;
        if (i2 > enVar.y) {
            enVar.y = i2;
            enVar.z = z;
            recyclerView.f937d.p();
        }
    }

    final boolean d(int i2) {
        if (this.f1281c != null) {
            int i3 = this.f1282d;
            int i4 = i3 + i3;
            for (int i5 = 0; i5 < i4; i5 += 2) {
                if (this.f1281c[i5] == i2) {
                    return true;
                }
            }
        }
        return false;
    }
}
