package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class A extends B {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(V v2, int i5) {
        super(v2);
        this.f18753d = i5;
    }

    @Override // androidx.recyclerview.widget.B
    public final int b(View view) {
        switch (this.f18753d) {
            case 0:
                return this.f18756a.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((W) view.getLayoutParams())).rightMargin;
            default:
                return this.f18756a.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((W) view.getLayoutParams())).bottomMargin;
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final int c(View view) {
        switch (this.f18753d) {
            case 0:
                W w2 = (W) view.getLayoutParams();
                return this.f18756a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) w2).leftMargin + ((ViewGroup.MarginLayoutParams) w2).rightMargin;
            default:
                W w3 = (W) view.getLayoutParams();
                return this.f18756a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) w3).topMargin + ((ViewGroup.MarginLayoutParams) w3).bottomMargin;
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final int d(View view) {
        switch (this.f18753d) {
            case 0:
                W w2 = (W) view.getLayoutParams();
                return this.f18756a.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) w2).topMargin + ((ViewGroup.MarginLayoutParams) w2).bottomMargin;
            default:
                W w3 = (W) view.getLayoutParams();
                return this.f18756a.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) w3).leftMargin + ((ViewGroup.MarginLayoutParams) w3).rightMargin;
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final int e(View view) {
        switch (this.f18753d) {
            case 0:
                return this.f18756a.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((W) view.getLayoutParams())).leftMargin;
            default:
                return this.f18756a.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((W) view.getLayoutParams())).topMargin;
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final int f() {
        switch (this.f18753d) {
            case 0:
                return this.f18756a.getWidth();
            default:
                return this.f18756a.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final int g() {
        switch (this.f18753d) {
            case 0:
                V v2 = this.f18756a;
                return v2.getWidth() - v2.getPaddingRight();
            default:
                V v10 = this.f18756a;
                return v10.getHeight() - v10.getPaddingBottom();
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final int h() {
        switch (this.f18753d) {
            case 0:
                return this.f18756a.getPaddingRight();
            default:
                return this.f18756a.getPaddingBottom();
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final int i() {
        switch (this.f18753d) {
            case 0:
                return this.f18756a.getWidthMode();
            default:
                return this.f18756a.getHeightMode();
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final int j() {
        switch (this.f18753d) {
            case 0:
                return this.f18756a.getHeightMode();
            default:
                return this.f18756a.getWidthMode();
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final int k() {
        switch (this.f18753d) {
            case 0:
                return this.f18756a.getPaddingLeft();
            default:
                return this.f18756a.getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final int l() {
        switch (this.f18753d) {
            case 0:
                V v2 = this.f18756a;
                return (v2.getWidth() - v2.getPaddingLeft()) - v2.getPaddingRight();
            default:
                V v10 = this.f18756a;
                return (v10.getHeight() - v10.getPaddingTop()) - v10.getPaddingBottom();
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final int m(View view) {
        switch (this.f18753d) {
            case 0:
                V v2 = this.f18756a;
                Rect rect = this.f18758c;
                v2.getTransformedBoundingBox(view, true, rect);
                return rect.right;
            default:
                V v10 = this.f18756a;
                Rect rect2 = this.f18758c;
                v10.getTransformedBoundingBox(view, true, rect2);
                return rect2.bottom;
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final int n(View view) {
        switch (this.f18753d) {
            case 0:
                V v2 = this.f18756a;
                Rect rect = this.f18758c;
                v2.getTransformedBoundingBox(view, true, rect);
                return rect.left;
            default:
                V v10 = this.f18756a;
                Rect rect2 = this.f18758c;
                v10.getTransformedBoundingBox(view, true, rect2);
                return rect2.top;
        }
    }

    @Override // androidx.recyclerview.widget.B
    public final void o(int i5) {
        switch (this.f18753d) {
            case 0:
                this.f18756a.offsetChildrenHorizontal(i5);
                break;
            default:
                this.f18756a.offsetChildrenVertical(i5);
                break;
        }
    }
}
