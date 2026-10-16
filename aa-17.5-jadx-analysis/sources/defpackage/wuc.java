package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class wuc extends Drawable.ConstantState {
    public wui a;
    woz b;
    ColorFilter c;
    ColorStateList d;
    ColorStateList e;
    ColorStateList f;
    ColorStateList g;
    PorterDuff.Mode h;
    Rect i;
    float j;
    public float k;
    float l;
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

    public wuc(wuc wucVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = BitmapDescriptorFactory.HUE_RED;
        this.o = BitmapDescriptorFactory.HUE_RED;
        this.p = BitmapDescriptorFactory.HUE_RED;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = wucVar.a;
        this.b = wucVar.b;
        this.l = wucVar.l;
        this.c = wucVar.c;
        this.d = wucVar.d;
        this.e = wucVar.e;
        this.h = wucVar.h;
        this.g = wucVar.g;
        this.m = wucVar.m;
        this.j = wucVar.j;
        this.s = wucVar.s;
        int i = wucVar.q;
        this.q = 0;
        boolean z = wucVar.u;
        this.u = false;
        this.k = wucVar.k;
        this.n = wucVar.n;
        this.o = wucVar.o;
        float f = wucVar.p;
        this.p = BitmapDescriptorFactory.HUE_RED;
        this.r = wucVar.r;
        int i2 = wucVar.t;
        this.t = 0;
        ColorStateList colorStateList = wucVar.f;
        this.f = null;
        this.v = wucVar.v;
        Rect rect = wucVar.i;
        if (rect != null) {
            this.i = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        wue wueVar = new wue(this);
        wueVar.t = true;
        wueVar.u = true;
        return wueVar;
    }

    public wuc(wui wuiVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = BitmapDescriptorFactory.HUE_RED;
        this.o = BitmapDescriptorFactory.HUE_RED;
        this.p = BitmapDescriptorFactory.HUE_RED;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.a = wuiVar;
        this.b = null;
    }
}
