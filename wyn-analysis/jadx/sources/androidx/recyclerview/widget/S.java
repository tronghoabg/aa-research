package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class S implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18785a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f18786b;

    public /* synthetic */ S(Object obj, int i5) {
        this.f18785a = i5;
        this.f18786b = obj;
    }

    @Override // androidx.recyclerview.widget.w0
    public int a(View view) {
        switch (this.f18785a) {
            case 0:
                return ((V) this.f18786b).getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) ((W) view.getLayoutParams())).leftMargin;
            default:
                return ((V) this.f18786b).getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) ((W) view.getLayoutParams())).topMargin;
        }
    }

    @Override // androidx.recyclerview.widget.w0
    public int b() {
        switch (this.f18785a) {
            case 0:
                return ((V) this.f18786b).getPaddingLeft();
            default:
                return ((V) this.f18786b).getPaddingTop();
        }
    }

    @Override // androidx.recyclerview.widget.w0
    public int c() {
        switch (this.f18785a) {
            case 0:
                V v2 = (V) this.f18786b;
                return v2.getWidth() - v2.getPaddingRight();
            default:
                V v10 = (V) this.f18786b;
                return v10.getHeight() - v10.getPaddingBottom();
        }
    }

    @Override // androidx.recyclerview.widget.w0
    public View d(int i5) {
        switch (this.f18785a) {
        }
        return ((V) this.f18786b).getChildAt(i5);
    }

    @Override // androidx.recyclerview.widget.w0
    public int e(View view) {
        switch (this.f18785a) {
            case 0:
                return ((V) this.f18786b).getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) ((W) view.getLayoutParams())).rightMargin;
            default:
                return ((V) this.f18786b).getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) ((W) view.getLayoutParams())).bottomMargin;
        }
    }
}
