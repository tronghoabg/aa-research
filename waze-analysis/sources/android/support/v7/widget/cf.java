package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class cf extends ej {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1227a = {R.attr.listDivider};

    /* renamed from: b, reason: collision with root package name */
    private Drawable f1228b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1229c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f1230d = new Rect();

    public cf(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f1227a);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f1228b = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f1229c = i2 != 0 ? 1 : i2;
    }

    public final void a(Drawable drawable) {
        this.f1228b = drawable;
    }

    @Override // android.support.v7.widget.ej
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, fb fbVar) {
        Drawable drawable = this.f1228b;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f1229c == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // android.support.v7.widget.ej
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, fb fbVar) {
        int height;
        int paddingTop;
        int width;
        int paddingLeft;
        if (recyclerView.n == null || this.f1228b == null) {
            return;
        }
        int i2 = 0;
        if (this.f1229c == 1) {
            canvas.save();
            if (recyclerView.f942i) {
                paddingLeft = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                paddingLeft = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i2 < childCount) {
                View childAt = recyclerView.getChildAt(i2);
                Rect rect = this.f1230d;
                RecyclerView.S(childAt, rect);
                int iRound = rect.bottom + Math.round(childAt.getTranslationY());
                this.f1228b.setBounds(paddingLeft, iRound - this.f1228b.getIntrinsicHeight(), width, iRound);
                this.f1228b.draw(canvas);
                i2++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.f942i) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i2 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i2);
            en enVar = recyclerView.n;
            Rect rect2 = this.f1230d;
            RecyclerView.S(childAt2, rect2);
            int iRound2 = rect2.right + Math.round(childAt2.getTranslationX());
            this.f1228b.setBounds(iRound2 - this.f1228b.getIntrinsicWidth(), paddingTop, iRound2, height);
            this.f1228b.draw(canvas);
            i2++;
        }
        canvas.restore();
    }
}
