package q;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.wynauto.wyn.R;

/* loaded from: classes.dex */
public final class J extends F0 implements L {

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f43660D;

    /* renamed from: E, reason: collision with root package name */
    public H f43661E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f43662F;

    /* renamed from: G, reason: collision with root package name */
    public int f43663G;

    /* renamed from: H, reason: collision with root package name */
    public final /* synthetic */ M f43664H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(M m10, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f43664H = m10;
        this.f43662F = new Rect();
        this.f43640o = m10;
        this.f43650y = true;
        this.f43651z.setFocusable(true);
        this.f43641p = new f8.r(this, 1);
    }

    @Override // q.L
    public final CharSequence d() {
        return this.f43660D;
    }

    @Override // q.L
    public final void f(CharSequence charSequence) {
        this.f43660D = charSequence;
    }

    @Override // q.L
    public final void h(int i5) {
        this.f43663G = i5;
    }

    @Override // q.L
    public final void i(int i5, int i10) {
        ViewTreeObserver viewTreeObserver;
        C3843w c3843w = this.f43651z;
        boolean zIsShowing = c3843w.isShowing();
        q();
        this.f43651z.setInputMethodMode(2);
        show();
        C3838t0 c3838t0 = this.f43629c;
        c3838t0.setChoiceMode(1);
        AbstractC3799E.d(c3838t0, i5);
        AbstractC3799E.c(c3838t0, i10);
        M m10 = this.f43664H;
        int selectedItemPosition = m10.getSelectedItemPosition();
        C3838t0 c3838t02 = this.f43629c;
        if (c3843w.isShowing() && c3838t02 != null) {
            c3838t02.setListSelectionHidden(false);
            c3838t02.setSelection(selectedItemPosition);
            if (c3838t02.getChoiceMode() != 0) {
                c3838t02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = m10.getViewTreeObserver()) == null) {
            return;
        }
        E9.d dVar = new E9.d(this, 6);
        viewTreeObserver.addOnGlobalLayoutListener(dVar);
        this.f43651z.setOnDismissListener(new I(this, dVar));
    }

    @Override // q.F0, q.L
    public final void k(ListAdapter listAdapter) {
        super.k(listAdapter);
        this.f43661E = (H) listAdapter;
    }

    public final void q() {
        int i5;
        C3843w c3843w = this.f43651z;
        Drawable background = c3843w.getBackground();
        M m10 = this.f43664H;
        if (background != null) {
            background.getPadding(m10.f43680h);
            boolean zA = v1.a(m10);
            Rect rect = m10.f43680h;
            i5 = zA ? rect.right : -rect.left;
        } else {
            Rect rect2 = m10.f43680h;
            rect2.right = 0;
            rect2.left = 0;
            i5 = 0;
        }
        int paddingLeft = m10.getPaddingLeft();
        int paddingRight = m10.getPaddingRight();
        int width = m10.getWidth();
        int i10 = m10.f43679g;
        if (i10 == -2) {
            int iA = m10.a(this.f43661E, c3843w.getBackground());
            int i11 = m10.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = m10.f43680h;
            int i12 = (i11 - rect3.left) - rect3.right;
            if (iA > i12) {
                iA = i12;
            }
            p(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i10 == -1) {
            p((width - paddingLeft) - paddingRight);
        } else {
            p(i10);
        }
        this.f43632f = v1.a(m10) ? (((width - paddingRight) - this.f43631e) - this.f43663G) + i5 : paddingLeft + this.f43663G + i5;
    }
}
