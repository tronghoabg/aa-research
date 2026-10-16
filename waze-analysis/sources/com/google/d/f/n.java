package com.google.d.f;

import com.google.d.d.fo;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n extends com.google.d.f.b.k {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f7857a = new Object[8];

    /* renamed from: b, reason: collision with root package name */
    private int f7858b = 0;

    n() {
    }

    private final int h(aa aaVar) {
        for (int i2 = 0; i2 < this.f7858b; i2++) {
            if (this.f7857a[i2 + i2].equals(aaVar)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.d.f.b.k
    public final int a() {
        return this.f7858b;
    }

    @Override // com.google.d.f.b.k
    public final aa b(int i2) {
        if (i2 < this.f7858b) {
            return (aa) this.f7857a[i2 + i2];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // com.google.d.f.b.k
    public final Object c(aa aaVar) {
        int iH = h(aaVar);
        if (iH != -1) {
            return aaVar.e(this.f7857a[iH + iH + 1]);
        }
        return null;
    }

    @Override // com.google.d.f.b.k
    public final Object d(int i2) {
        if (i2 < this.f7858b) {
            return this.f7857a[i2 + i2 + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    final void e(aa aaVar, Object obj) {
        int iH;
        if (!aaVar.i() && (iH = h(aaVar)) != -1) {
            fo.o(obj, "metadata value");
            this.f7857a[iH + iH + 1] = obj;
            return;
        }
        int i2 = this.f7858b + 1;
        Object[] objArrCopyOf = this.f7857a;
        int length = objArrCopyOf.length;
        if (i2 + i2 > length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length + length);
            this.f7857a = objArrCopyOf;
        }
        int i3 = this.f7858b;
        fo.o(aaVar, "metadata key");
        objArrCopyOf[i3 + i3] = aaVar;
        Object[] objArr = this.f7857a;
        int i4 = this.f7858b;
        fo.o(obj, "metadata value");
        objArr[i4 + i4 + 1] = obj;
        this.f7858b++;
    }

    final void f(aa aaVar) {
        int i2;
        int iH = h(aaVar);
        if (iH >= 0) {
            int i3 = iH + iH;
            int i4 = i3 + 2;
            while (true) {
                i2 = this.f7858b;
                if (i4 >= i2 + i2) {
                    break;
                }
                Object obj = this.f7857a[i4];
                if (!obj.equals(aaVar)) {
                    Object[] objArr = this.f7857a;
                    objArr[i3] = obj;
                    objArr[i3 + 1] = objArr[i4 + 1];
                    i3 += 2;
                }
                i4 += 2;
            }
            this.f7858b = i2 - ((i4 - i3) >> 1);
            while (i3 < i4) {
                this.f7857a[i3] = null;
                i3++;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i2 = 0; i2 < this.f7858b; i2++) {
            sb.append(" '");
            sb.append(b(i2));
            sb.append("': ");
            sb.append(d(i2));
        }
        sb.append(" }");
        return sb.toString();
    }
}
