package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
public final class vlq extends lv {
    private final Drawable a;

    public vlq(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.primes_divider);
        drawable.getClass();
        this.a = drawable;
    }

    @Override // defpackage.lv
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((ma) childAt.getLayoutParams()).bottomMargin;
            Drawable drawable = this.a;
            drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
            drawable.draw(canvas);
        }
    }
}
