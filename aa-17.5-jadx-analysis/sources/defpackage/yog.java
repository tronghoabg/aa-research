package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
final class yog extends ypt {
    public Object[] a = new Object[8];
    public int b = 0;

    public final int a(yos yosVar) {
        for (int i = 0; i < this.b; i++) {
            if (this.a[i + i].equals(yosVar)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.ypt
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ypt
    public final yos c(int i) {
        if (i < this.b) {
            return (yos) this.a[i + i];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // defpackage.ypt
    public final Object d(yos yosVar) {
        int iA = a(yosVar);
        if (iA != -1) {
            return yosVar.c(this.a[iA + iA + 1]);
        }
        return null;
    }

    @Override // defpackage.ypt
    public final Object e(int i) {
        if (i < this.b) {
            return this.a[i + i + 1];
        }
        throw new IndexOutOfBoundsException();
    }

    final void f(yos yosVar, Object obj) {
        int iA;
        if (!yosVar.b && (iA = a(yosVar)) != -1) {
            obj.getClass();
            this.a[iA + iA + 1] = obj;
            return;
        }
        int i = this.b + 1;
        Object[] objArrCopyOf = this.a;
        int length = objArrCopyOf.length;
        if (i + i > length) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, length + length);
            this.a = objArrCopyOf;
        }
        int i2 = this.b;
        int i3 = i2 + i2;
        yosVar.getClass();
        objArrCopyOf[i3] = yosVar;
        obj.getClass();
        objArrCopyOf[i3 + 1] = obj;
        this.b = i2 + 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Metadata{");
        for (int i = 0; i < this.b; i++) {
            sb.append(" '");
            sb.append(c(i));
            sb.append("': ");
            sb.append(e(i));
        }
        sb.append(" }");
        return sb.toString();
    }
}
