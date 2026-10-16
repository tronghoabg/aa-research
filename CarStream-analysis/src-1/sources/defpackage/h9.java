package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class h9 extends n5 {
    public static final Object[] i;
    public static final h9 j;
    public final transient Object[] d;
    public final transient int e;
    public final transient Object[] f;
    public final transient int g;
    public final transient int h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        j = new h9(objArr, 0, objArr, 0, 0);
    }

    public h9(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.d = objArr;
        this.e = i2;
        this.f = objArr2;
        this.g = i3;
        this.h = i4;
    }

    @Override // defpackage.j5
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.d;
        int i2 = this.h;
        System.arraycopy(objArr2, 0, objArr, 0, i2);
        return i2;
    }

    @Override // defpackage.j5
    public final Object[] b() {
        return this.d;
    }

    @Override // defpackage.j5
    public final int c() {
        return this.h;
    }

    @Override // defpackage.j5, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f;
            if (objArr.length != 0) {
                int iM = ec.m(obj.hashCode());
                while (true) {
                    int i2 = iM & this.g;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iM = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.j5
    public final int d() {
        return 0;
    }

    @Override // defpackage.n5, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        m5 b9Var = this.b;
        if (b9Var == null) {
            k5 k5Var = m5.b;
            int i2 = this.h;
            b9Var = i2 == 0 ? b9.e : new b9(this.d, i2);
            this.b = b9Var;
        }
        return b9Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.h;
    }
}
