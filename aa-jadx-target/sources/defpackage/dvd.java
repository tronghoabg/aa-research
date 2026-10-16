package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dvd {
    public int a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public dvd() {
        this.c = new android.util.SparseArray();
        this.a = 0;
        this.b = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap());
    }

    public static final long g(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean b() {
        java.lang.Object obj;
        return this.b == null && (obj = this.c) != null && ((android.content.res.ColorStateList) obj).isStateful();
    }

    public final boolean c(int[] iArr) {
        if (!b()) {
            return false;
        }
        android.content.res.ColorStateList colorStateList = (android.content.res.ColorStateList) this.c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.a) {
            return false;
        }
        this.a = colorForState;
        return true;
    }

    public final boolean d() {
        return a() || this.a != 0;
    }

    public final defpackage.mg e(int i) {
        android.util.SparseArray sparseArray = (android.util.SparseArray) this.c;
        defpackage.mg mgVar = (defpackage.mg) sparseArray.get(i);
        if (mgVar != null) {
            return mgVar;
        }
        defpackage.mg mgVar2 = new defpackage.mg();
        sparseArray.put(i, mgVar2);
        return mgVar2;
    }

    public final void f() {
        int i = 0;
        while (true) {
            android.util.SparseArray sparseArray = (android.util.SparseArray) this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            java.util.ArrayList arrayList = ((defpackage.mg) sparseArray.valueAt(i)).a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                defpackage.ebl.i(((defpackage.mr) arrayList.get(i2)).a);
            }
            arrayList.clear();
            i++;
        }
    }

    public final void h() {
        defpackage.mg mgVarE = e(0);
        mgVarE.b = 12;
        java.util.ArrayList arrayList = mgVarE.a;
        while (arrayList.size() > 12) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public dvd(android.graphics.Shader shader, android.content.res.ColorStateList colorStateList, int i) {
        this.b = shader;
        this.c = colorStateList;
        this.a = i;
    }
}
