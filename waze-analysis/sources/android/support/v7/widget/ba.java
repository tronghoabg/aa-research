package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ba extends dm implements bc {

    /* renamed from: a, reason: collision with root package name */
    ListAdapter f1107a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bd f1108b;

    /* renamed from: h, reason: collision with root package name */
    private CharSequence f1109h;

    /* renamed from: i, reason: collision with root package name */
    private final Rect f1110i;

    /* renamed from: j, reason: collision with root package name */
    private int f1111j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(bd bdVar, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f1108b = bdVar;
        this.f1110i = new Rect();
        y(bdVar);
        J();
        D(new ax(this));
    }

    @Override // android.support.v7.widget.bc
    public final CharSequence d() {
        return this.f1109h;
    }

    @Override // android.support.v7.widget.dm, android.support.v7.widget.bc
    public final void e(ListAdapter listAdapter) {
        super.e(listAdapter);
        this.f1107a = listAdapter;
    }

    @Override // android.support.v7.widget.bc
    public final void h(int i2) {
        this.f1111j = i2;
    }

    @Override // android.support.v7.widget.bc
    public final void i(CharSequence charSequence) {
        this.f1109h = charSequence;
    }

    @Override // android.support.v7.widget.bc
    public final void l(int i2, int i3) {
        ViewTreeObserver viewTreeObserver;
        boolean zU = u();
        n();
        I();
        super.s();
        cl clVar = this.f1353c;
        clVar.setChoiceMode(1);
        clVar.setTextDirection(i2);
        clVar.setTextAlignment(i3);
        bd bdVar = this.f1108b;
        int selectedItemPosition = bdVar.getSelectedItemPosition();
        cl clVar2 = this.f1353c;
        if (u() && clVar2 != null) {
            clVar2.a(false);
            clVar2.setSelection(selectedItemPosition);
            if (clVar2.getChoiceMode() != 0) {
                clVar2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zU || (viewTreeObserver = bdVar.getViewTreeObserver()) == null) {
            return;
        }
        ay ayVar = new ay(this);
        viewTreeObserver.addOnGlobalLayoutListener(ayVar);
        C(new az(this, ayVar));
    }

    final void n() {
        int i2;
        Drawable drawableC = c();
        bd bdVar = this.f1108b;
        if (drawableC != null) {
            Rect rect = bdVar.f1115b;
            drawableC.getPadding(rect);
            i2 = android.support.v4.app.dc.c(bdVar) ? rect.right : -rect.left;
        } else {
            Rect rect2 = bdVar.f1115b;
            rect2.right = 0;
            rect2.left = 0;
            i2 = 0;
        }
        bd bdVar2 = this.f1108b;
        int paddingLeft = bdVar2.getPaddingLeft();
        int paddingRight = bdVar2.getPaddingRight();
        int width = bdVar2.getWidth();
        int i3 = bdVar2.f1114a;
        if (i3 == -2) {
            int i4 = (width - paddingLeft) - paddingRight;
            int iA = bdVar2.a((SpinnerAdapter) this.f1107a, c());
            int i5 = bdVar2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = bdVar2.f1115b;
            int i6 = (i5 - rect3.left) - rect3.right;
            if (iA > i6) {
                iA = i6;
            }
            z(Math.max(iA, i4));
        } else if (i3 == -1) {
            z((width - paddingLeft) - paddingRight);
        } else {
            z(i3);
        }
        g(android.support.v4.app.dc.c(bdVar2) ? i2 + (((width - paddingRight) - q()) - this.f1111j) : i2 + paddingLeft + this.f1111j);
    }

    final boolean o(View view) {
        return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.f1110i);
    }
}
