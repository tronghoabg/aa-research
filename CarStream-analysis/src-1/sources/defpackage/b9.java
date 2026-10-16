package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class b9 extends m5 {
    public static final b9 e = new b9(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public b9(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.m5, defpackage.j5
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.j5
    public final Object[] b() {
        return this.c;
    }

    @Override // defpackage.j5
    public final int c() {
        return this.d;
    }

    @Override // defpackage.j5
    public final int d() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ec.d(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
