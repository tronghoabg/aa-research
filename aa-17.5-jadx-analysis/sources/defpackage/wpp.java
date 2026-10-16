package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class wpp extends Drawable.ConstantState {
    public Drawable.ConstantState a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public float l;
    public int m;
    public float n;
    public int o;
    public float p;
    public int q;
    public float r;
    public int s;
    public wui t;
    public int u;
    public int v;
    public Rect w;
    public int[] x;
    public int y;

    public wpp(wpp wppVar) {
        this.b = 0;
        this.c = false;
        this.d = Integer.MIN_VALUE;
        this.e = false;
        this.f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Integer.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = Float.NaN;
        this.k = Integer.MIN_VALUE;
        this.l = Float.NaN;
        this.m = Integer.MIN_VALUE;
        this.n = Float.NaN;
        this.o = Integer.MIN_VALUE;
        this.p = Float.NaN;
        this.q = Integer.MIN_VALUE;
        this.r = Float.NaN;
        this.s = Integer.MIN_VALUE;
        this.t = null;
        this.u = Integer.MIN_VALUE;
        this.v = Integer.MIN_VALUE;
        this.w = null;
        this.x = FocusRingDrawable.a;
        this.y = Integer.MIN_VALUE;
        if (wppVar != null) {
            this.a = wppVar.a;
            this.b = wppVar.b;
            this.c = wppVar.c;
            this.d = wppVar.d;
            this.e = wppVar.e;
            this.f = wppVar.f;
            this.g = wppVar.g;
            this.h = wppVar.h;
            this.i = wppVar.i;
            this.j = wppVar.j;
            this.k = wppVar.k;
            this.l = wppVar.l;
            this.m = wppVar.m;
            this.n = wppVar.n;
            this.o = wppVar.o;
            this.p = wppVar.p;
            this.q = wppVar.q;
            this.r = wppVar.r;
            this.s = wppVar.s;
            this.u = wppVar.u;
            this.v = wppVar.v;
            wui wuiVar = wppVar.t;
            if (wuiVar instanceof wuk) {
                this.t = new wuk(new wuj((wuk) wuiVar));
            } else {
                this.t = wuiVar instanceof wux ? new wuw((wux) wuiVar).a() : wuiVar;
            }
            Rect rect = wppVar.w;
            if (rect != null) {
                this.w = new Rect(rect);
            }
            int[] iArr = wppVar.x;
            this.x = Arrays.copyOf(iArr, iArr.length);
            this.y = wppVar.y;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.a;
        return this.b | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null, 0 == true ? 1 : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources, null);
    }
}
