package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public final class iw {
    public nd a;
    private final View b;
    private nd e;
    private nd f;
    private int d = -1;
    private final jc c = jc.d();

    public iw(View view) {
        this.b = view;
    }

    public final void a() {
        View view = this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.e != null) {
                nd ndVar = this.f;
                if (ndVar == null) {
                    ndVar = new nd();
                    this.f = ndVar;
                }
                ndVar.a = null;
                ndVar.d = false;
                ndVar.b = null;
                ndVar.c = false;
                int[] iArr = ebm.a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    ndVar.d = true;
                    ndVar.a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    ndVar.c = true;
                    ndVar.b = backgroundTintMode;
                }
                if (ndVar.d || ndVar.c) {
                    mr.g(background, ndVar, view.getDrawableState());
                    return;
                }
            }
            nd ndVar2 = this.a;
            if (ndVar2 != null) {
                mr.g(background, ndVar2, view.getDrawableState());
                return;
            }
            nd ndVar3 = this.e;
            if (ndVar3 != null) {
                mr.g(background, ndVar3, view.getDrawableState());
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        View view = this.b;
        Context context = view.getContext();
        int[] iArr = fs.A;
        lah lahVar = new lah(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
        ebm.n(view, view.getContext(), iArr, attributeSet, (TypedArray) lahVar.a, i, 0);
        try {
            if (lahVar.y(0)) {
                this.d = lahVar.q(0, -1);
                ColorStateList colorStateListA = this.c.a(view.getContext(), this.d);
                if (colorStateListA != null) {
                    d(colorStateListA);
                }
            }
            if (lahVar.y(1)) {
                view.setBackgroundTintList(lahVar.r(1));
            }
            if (lahVar.y(2)) {
                int iN = lahVar.n(2, -1);
                Rect rect = ko.a;
                view.setBackgroundTintMode(a.R(iN, null));
            }
        } finally {
            lahVar.w();
        }
    }

    public final void c(int i) {
        this.d = i;
        jc jcVar = this.c;
        d(jcVar != null ? jcVar.a(this.b.getContext(), i) : null);
        a();
    }

    final void d(ColorStateList colorStateList) {
        if (colorStateList != null) {
            nd ndVar = this.e;
            if (ndVar == null) {
                ndVar = new nd();
                this.e = ndVar;
            }
            ndVar.a = colorStateList;
            ndVar.d = true;
        } else {
            this.e = null;
        }
        a();
    }

    public final void e() {
        this.d = -1;
        d(null);
        a();
    }
}
