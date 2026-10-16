package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class aau implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public aau(byte[] bArr) {
        int iC = aaz.c(40) / 4;
        this.b = new int[iC];
        this.c = new Object[iC];
    }

    public final int a(int i) {
        if (this.a) {
            aav.b(this);
        }
        return aaz.a(this.b, this.d, i);
    }

    public final int b(int i) {
        if (this.a) {
            aav.b(this);
        }
        if (i >= this.d || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.b[i];
    }

    public final int c() {
        if (this.a) {
            aav.b(this);
        }
        return this.d;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final aau clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        aau aauVar = (aau) objClone;
        aauVar.b = (int[]) this.b.clone();
        aauVar.c = (Object[]) this.c.clone();
        return aauVar;
    }

    public final Object e(int i) {
        if (this.a) {
            aav.b(this);
        }
        if (i >= this.d || i < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.c[i];
    }

    public final void f(int i, Object obj) {
        int iA = aaz.a(this.b, this.d, i);
        if (iA >= 0) {
            this.c[iA] = obj;
            return;
        }
        int i2 = ~iA;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == aav.a) {
                this.b[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a && i3 >= this.b.length) {
            aav.b(this);
            i2 = ~aaz.a(this.b, this.d, i);
        }
        int i4 = this.d;
        int[] iArr = this.b;
        if (i4 >= iArr.length) {
            int iC = aaz.c((i4 + 1) * 4) / 4;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iC);
            iArrCopyOf.getClass();
            this.b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.c, iC);
            objArrCopyOf.getClass();
            this.c = objArrCopyOf;
        }
        int i5 = this.d - i2;
        if (i5 != 0) {
            int[] iArr2 = this.b;
            int i6 = i2 + 1;
            iArr2.getClass();
            iArr2.getClass();
            System.arraycopy(iArr2, i2, iArr2, i6, i5);
            Object[] objArr2 = this.c;
            int i7 = this.d;
            objArr2.getClass();
            objArr2.getClass();
            System.arraycopy(objArr2, i2, objArr2, i6, i7 - i2);
        }
        this.b[i2] = i;
        this.c[i2] = obj;
        this.d++;
    }

    public final boolean g(int i) {
        return a(i) >= 0;
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(b(i2));
            sb.append('=');
            Object objE = e(i2);
            if (objE != this) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public aau() {
        throw null;
    }
}
