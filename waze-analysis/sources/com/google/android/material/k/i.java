package com.google.android.material.k;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public class i extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    o f6653a;

    /* renamed from: b, reason: collision with root package name */
    com.google.android.material.e.a f6654b;

    /* renamed from: c, reason: collision with root package name */
    ColorFilter f6655c;

    /* renamed from: d, reason: collision with root package name */
    ColorStateList f6656d;

    /* renamed from: e, reason: collision with root package name */
    ColorStateList f6657e;

    /* renamed from: f, reason: collision with root package name */
    ColorStateList f6658f;

    /* renamed from: g, reason: collision with root package name */
    ColorStateList f6659g;

    /* renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f6660h;

    /* renamed from: i, reason: collision with root package name */
    Rect f6661i;

    /* renamed from: j, reason: collision with root package name */
    float f6662j;

    /* renamed from: k, reason: collision with root package name */
    float f6663k;

    /* renamed from: l, reason: collision with root package name */
    float f6664l;
    int m;
    float n;
    float o;
    float p;
    int q;
    int r;
    int s;
    int t;
    boolean u;
    Paint.Style v;

    public i(i iVar) {
        this.f6656d = null;
        this.f6657e = null;
        this.f6658f = null;
        this.f6659g = null;
        this.f6660h = PorterDuff.Mode.SRC_IN;
        this.f6661i = null;
        this.f6662j = 1.0f;
        this.f6663k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.f6653a = iVar.f6653a;
        this.f6654b = iVar.f6654b;
        this.f6664l = iVar.f6664l;
        this.f6655c = iVar.f6655c;
        this.f6656d = iVar.f6656d;
        this.f6657e = iVar.f6657e;
        this.f6660h = iVar.f6660h;
        this.f6659g = iVar.f6659g;
        this.m = iVar.m;
        this.f6662j = iVar.f6662j;
        this.s = iVar.s;
        int i2 = iVar.q;
        this.q = 0;
        boolean z = iVar.u;
        this.u = false;
        this.f6663k = iVar.f6663k;
        this.n = iVar.n;
        this.o = iVar.o;
        float f2 = iVar.p;
        this.p = 0.0f;
        this.r = iVar.r;
        int i3 = iVar.t;
        this.t = 0;
        ColorStateList colorStateList = iVar.f6658f;
        this.f6658f = null;
        this.v = iVar.v;
        Rect rect = iVar.f6661i;
        if (rect != null) {
            this.f6661i = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        k kVar = new k(this);
        kVar.f6675j = true;
        kVar.f6676k = true;
        return kVar;
    }

    public i(o oVar) {
        this.f6656d = null;
        this.f6657e = null;
        this.f6658f = null;
        this.f6659g = null;
        this.f6660h = PorterDuff.Mode.SRC_IN;
        this.f6661i = null;
        this.f6662j = 1.0f;
        this.f6663k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.f6653a = oVar;
        this.f6654b = null;
    }
}
