package com.google.android.material.focus;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.k.ad;
import com.google.android.material.k.ae;
import com.google.android.material.k.o;
import com.google.android.material.k.p;
import com.google.android.material.k.r;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    Drawable.ConstantState f6528a;

    /* renamed from: b, reason: collision with root package name */
    int f6529b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6530c;

    /* renamed from: d, reason: collision with root package name */
    private int f6531d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f6532e;

    /* renamed from: f, reason: collision with root package name */
    private int f6533f;

    /* renamed from: g, reason: collision with root package name */
    private int f6534g;

    /* renamed from: h, reason: collision with root package name */
    private int f6535h;

    /* renamed from: i, reason: collision with root package name */
    private int f6536i;

    /* renamed from: j, reason: collision with root package name */
    private float f6537j;

    /* renamed from: k, reason: collision with root package name */
    private int f6538k;

    /* renamed from: l, reason: collision with root package name */
    private float f6539l;
    private int m;
    private float n;
    private int o;
    private float p;
    private int q;
    private float r;
    private int s;
    private o t;
    private int u;
    private int v;
    private Rect w;
    private int[] x;
    private int y;

    c(c cVar) {
        this.f6529b = 0;
        this.f6530c = false;
        this.f6531d = Integer.MIN_VALUE;
        this.f6532e = false;
        this.f6533f = Integer.MIN_VALUE;
        this.f6534g = Integer.MIN_VALUE;
        this.f6535h = Integer.MIN_VALUE;
        this.f6536i = Integer.MIN_VALUE;
        this.f6537j = Float.NaN;
        this.f6538k = Integer.MIN_VALUE;
        this.f6539l = Float.NaN;
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
        this.x = FocusRingDrawable.f6516b;
        this.y = Integer.MIN_VALUE;
        if (cVar != null) {
            this.f6528a = cVar.f6528a;
            this.f6529b = cVar.f6529b;
            this.f6530c = cVar.f6530c;
            this.f6531d = cVar.f6531d;
            this.f6532e = cVar.f6532e;
            this.f6533f = cVar.f6533f;
            this.f6534g = cVar.f6534g;
            this.f6535h = cVar.f6535h;
            this.f6536i = cVar.f6536i;
            this.f6537j = cVar.f6537j;
            this.f6538k = cVar.f6538k;
            this.f6539l = cVar.f6539l;
            this.m = cVar.m;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.q = cVar.q;
            this.r = cVar.r;
            this.s = cVar.s;
            this.u = cVar.u;
            this.v = cVar.v;
            o oVar = cVar.t;
            if (oVar instanceof r) {
                this.t = new p((r) oVar).i();
            } else {
                this.t = oVar instanceof ae ? new ad((ae) oVar).c() : oVar;
            }
            Rect rect = cVar.w;
            if (rect != null) {
                this.w = new Rect(rect);
            }
            int[] iArr = cVar.x;
            this.x = Arrays.copyOf(iArr, iArr.length);
            this.y = cVar.y;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.f6528a;
        return this.f6529b | (constantState != null ? constantState.getChangingConfigurations() : 0);
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
