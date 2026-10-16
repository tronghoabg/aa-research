package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class x {

    /* renamed from: a, reason: collision with root package name */
    private final View f1630a;

    /* renamed from: d, reason: collision with root package name */
    private gb f1633d;

    /* renamed from: e, reason: collision with root package name */
    private gb f1634e;

    /* renamed from: f, reason: collision with root package name */
    private gb f1635f;

    /* renamed from: c, reason: collision with root package name */
    private int f1632c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final ae f1631b = ae.e();

    x(View view) {
        this.f1630a = view;
    }

    final ColorStateList a() {
        gb gbVar = this.f1634e;
        if (gbVar != null) {
            return gbVar.f1540a;
        }
        return null;
    }

    final PorterDuff.Mode b() {
        gb gbVar = this.f1634e;
        if (gbVar != null) {
            return gbVar.f1541b;
        }
        return null;
    }

    final void c() {
        View view = this.f1630a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f1633d != null) {
                gb gbVar = this.f1635f;
                if (gbVar == null) {
                    gbVar = new gb();
                    this.f1635f = gbVar;
                }
                gbVar.f1540a = null;
                gbVar.f1543d = false;
                gbVar.f1541b = null;
                gbVar.f1542c = false;
                ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(view);
                if (backgroundTintList != null) {
                    gbVar.f1543d = true;
                    gbVar.f1540a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = ViewCompat.getBackgroundTintMode(view);
                if (backgroundTintMode != null) {
                    gbVar.f1542c = true;
                    gbVar.f1541b = backgroundTintMode;
                }
                if (gbVar.f1543d || gbVar.f1542c) {
                    fj.h(background, gbVar, view.getDrawableState());
                    return;
                }
            }
            gb gbVar2 = this.f1634e;
            if (gbVar2 != null) {
                fj.h(background, gbVar2, view.getDrawableState());
                return;
            }
            gb gbVar3 = this.f1633d;
            if (gbVar3 != null) {
                fj.h(background, gbVar3, view.getDrawableState());
            }
        }
    }

    final void d(AttributeSet attributeSet, int i2) {
        View view = this.f1630a;
        Context context = view.getContext();
        int[] iArr = android.support.v7.a.a.z;
        gc gcVarN = gc.n(context, attributeSet, iArr, i2, 0);
        ViewCompat.saveAttributeDataForStyleable(view, view.getContext(), iArr, attributeSet, gcVarN.h(), i2, 0);
        try {
            if (gcVarN.s(0)) {
                this.f1632c = gcVarN.f(0, -1);
                ColorStateList colorStateListA = this.f1631b.a(view.getContext(), this.f1632c);
                if (colorStateListA != null) {
                    f(colorStateListA);
                }
            }
            if (gcVarN.s(1)) {
                ViewCompat.setBackgroundTintList(view, gcVarN.g(1));
            }
            if (gcVarN.s(2)) {
                int iC = gcVarN.c(2, -1);
                Rect rect = cg.f1231a;
                ViewCompat.setBackgroundTintMode(view, com.waze.c.c.e.h(iC, null));
            }
        } finally {
            gcVarN.q();
        }
    }

    final void e(int i2) {
        this.f1632c = i2;
        ae aeVar = this.f1631b;
        f(aeVar != null ? aeVar.a(this.f1630a.getContext(), i2) : null);
        c();
    }

    final void f(ColorStateList colorStateList) {
        if (colorStateList != null) {
            gb gbVar = this.f1633d;
            if (gbVar == null) {
                gbVar = new gb();
                this.f1633d = gbVar;
            }
            gbVar.f1540a = colorStateList;
            gbVar.f1543d = true;
        } else {
            this.f1633d = null;
        }
        c();
    }

    final void g(ColorStateList colorStateList) {
        gb gbVar = this.f1634e;
        if (gbVar == null) {
            gbVar = new gb();
            this.f1634e = gbVar;
        }
        gbVar.f1540a = colorStateList;
        gbVar.f1543d = true;
        c();
    }

    final void h(PorterDuff.Mode mode) {
        gb gbVar = this.f1634e;
        if (gbVar == null) {
            gbVar = new gb();
            this.f1634e = gbVar;
        }
        gbVar.f1541b = mode;
        gbVar.f1542c = true;
        c();
    }

    final void i() {
        this.f1632c = -1;
        f(null);
        c();
    }
}
