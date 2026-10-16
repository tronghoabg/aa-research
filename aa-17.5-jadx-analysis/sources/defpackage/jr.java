package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatSpinner;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class jr extends lk implements js {
    public CharSequence a;
    public ListAdapter b;
    public final Rect c;
    public final /* synthetic */ AppCompatSpinner d;
    private int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(AppCompatSpinner appCompatSpinner, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.d = appCompatSpinner;
        this.c = new Rect();
        this.k = appCompatSpinner;
        y();
        this.l = new lcl(this, 1);
    }

    @Override // defpackage.js
    public final CharSequence d() {
        return this.a;
    }

    @Override // defpackage.lk, defpackage.js
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.b = listAdapter;
    }

    @Override // defpackage.js
    public final void h(int i) {
        this.r = i;
    }

    @Override // defpackage.js
    public final void i(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.js
    public final void l(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean zU = u();
        n();
        x();
        super.s();
        ks ksVar = this.e;
        ksVar.setChoiceMode(1);
        ksVar.setTextDirection(i);
        ksVar.setTextAlignment(i2);
        AppCompatSpinner appCompatSpinner = this.d;
        int selectedItemPosition = appCompatSpinner.getSelectedItemPosition();
        ks ksVar2 = this.e;
        if (u() && ksVar2 != null) {
            ksVar2.a = false;
            ksVar2.setSelection(selectedItemPosition);
            if (ksVar2.getChoiceMode() != 0) {
                ksVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zU || (viewTreeObserver = appCompatSpinner.getViewTreeObserver()) == null) {
            return;
        }
        hx hxVar = new hx(this, 3);
        viewTreeObserver.addOnGlobalLayoutListener(hxVar);
        v(new jq(this, hxVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.widget.ListAdapter, android.widget.SpinnerAdapter] */
    public final void n() {
        int i;
        Drawable drawableC = c();
        AppCompatSpinner appCompatSpinner = this.d;
        if (drawableC != null) {
            Rect rect = appCompatSpinner.d;
            drawableC.getPadding(rect);
            i = ca.l(appCompatSpinner) ? rect.right : -rect.left;
        } else {
            Rect rect2 = appCompatSpinner.d;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        AppCompatSpinner appCompatSpinner2 = this.d;
        int paddingLeft = appCompatSpinner2.getPaddingLeft();
        int paddingRight = appCompatSpinner2.getPaddingRight();
        int width = appCompatSpinner2.getWidth();
        int i2 = appCompatSpinner2.c;
        if (i2 == -2) {
            int i3 = (width - paddingLeft) - paddingRight;
            int iA = appCompatSpinner2.a(this.b, c());
            int i4 = appCompatSpinner2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = appCompatSpinner2.d;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (iA > i5) {
                iA = i5;
            }
            r(Math.max(iA, i3));
        } else if (i2 == -1) {
            r((width - paddingLeft) - paddingRight);
        } else {
            r(i2);
        }
        this.g = ca.l(appCompatSpinner2) ? i + (((width - paddingRight) - this.f) - this.r) : i + paddingLeft + this.r;
    }
}
