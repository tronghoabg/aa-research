package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class duw {
    public int a;
    public final Object b;
    public final Object c;

    public duw() {
        this.c = new SparseArray();
        this.a = 0;
        this.b = Collections.newSetFromMap(new IdentityHashMap());
    }

    public static final long g(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    public final boolean a() {
        return this.b != null;
    }

    public final boolean b() {
        Object obj;
        return this.b == null && (obj = this.c) != null && ((ColorStateList) obj).isStateful();
    }

    public final boolean c(int[] iArr) {
        if (!b()) {
            return false;
        }
        ColorStateList colorStateList = (ColorStateList) this.c;
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

    public final md e(int i) {
        SparseArray sparseArray = (SparseArray) this.c;
        md mdVar = (md) sparseArray.get(i);
        if (mdVar != null) {
            return mdVar;
        }
        md mdVar2 = new md();
        sparseArray.put(i, mdVar2);
        return mdVar2;
    }

    public final void f() {
        int i = 0;
        while (true) {
            SparseArray sparseArray = (SparseArray) this.c;
            if (i >= sparseArray.size()) {
                return;
            }
            ArrayList arrayList = ((md) sparseArray.valueAt(i)).a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ebf.fJ(((mo) arrayList.get(i2)).a);
            }
            arrayList.clear();
            i++;
        }
    }

    public final void h() {
        md mdVarE = e(0);
        mdVarE.b = 12;
        ArrayList arrayList = mdVarE.a;
        while (arrayList.size() > 12) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    public duw(Shader shader, ColorStateList colorStateList, int i) {
        this.b = shader;
        this.c = colorStateList;
        this.a = i;
    }
}
