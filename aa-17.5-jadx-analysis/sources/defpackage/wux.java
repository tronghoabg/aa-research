package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.StateSet;
import j$.util.Objects;

/* loaded from: classes.dex */
public final class wux implements wui {
    final int a;
    final wuk b;
    final int[][] c;
    final wuk[] d;

    public wux(wuw wuwVar) {
        this.a = wuwVar.a;
        this.b = (wuk) wuwVar.b;
        this.c = (int[][]) wuwVar.c;
        this.d = (wuk[]) wuwVar.d;
    }

    public static wux g(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new wuw(context, resourceId).a();
        }
        return null;
    }

    private final int h(int[] iArr) {
        for (int i = 0; i < this.a; i++) {
            if (StateSet.stateSetMatches(this.c[i], iArr)) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.wui
    public final wuk a() {
        return this.b;
    }

    @Override // defpackage.wui
    public final wuk b(int[] iArr) {
        int iH = h(iArr);
        if (iH < 0) {
            iH = h(StateSet.WILD_CARD);
        }
        return this.d[iH];
    }

    @Override // defpackage.wui
    public final wuk c(float f) {
        return this.b.c(f);
    }

    @Override // defpackage.wui
    public final wuk d(wtz wtzVar) {
        return this.b.d(wtzVar);
    }

    @Override // defpackage.wui
    public final boolean e() {
        return this.a > 1;
    }

    @Override // defpackage.wui
    public final wuk[] f() {
        return this.d;
    }
}
