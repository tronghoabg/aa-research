package androidx.recyclerview.widget;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.bytedance.sdk.openadsdk.activity.single.TTHistoryActivity;

/* renamed from: androidx.recyclerview.widget.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1473k extends Q {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f18907d = {R.attr.listDivider};

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f18908a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18909b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f18910c = new Rect();

    public C1473k(TTHistoryActivity tTHistoryActivity) {
        TypedArray typedArrayObtainStyledAttributes = tTHistoryActivity.obtainStyledAttributes(f18907d);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f18908a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f18909b = 1;
    }

    @Override // androidx.recyclerview.widget.Q
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, j0 j0Var) {
        Drawable drawable = this.f18908a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f18909b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, j0 j0Var) {
        Drawable drawable;
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.getLayoutManager() == null || (drawable = this.f18908a) == null) {
            return;
        }
        int i5 = this.f18909b;
        Rect rect = this.f18910c;
        int i10 = 0;
        if (i5 == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i10 < childCount) {
                View childAt = recyclerView.getChildAt(i10);
                recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                int iRound = Math.round(childAt.getTranslationY()) + rect.bottom;
                drawable.setBounds(paddingLeft, iRound - drawable.getIntrinsicHeight(), width, iRound);
                drawable.draw(canvas);
                i10++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i10 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i10);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt2, rect);
            int iRound2 = Math.round(childAt2.getTranslationX()) + rect.right;
            drawable.setBounds(iRound2 - drawable.getIntrinsicWidth(), paddingTop, iRound2, height);
            drawable.draw(canvas);
            i10++;
        }
        canvas.restore();
    }
}
