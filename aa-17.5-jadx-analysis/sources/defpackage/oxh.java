package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public class oxh extends lv {
    protected final Paint a = new Paint();
    protected final int b;
    protected final Context c;
    private final boolean d;

    public oxh(Context context, boolean z) {
        this.c = context;
        this.d = z;
        c();
        this.b = context.getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_divider_height);
    }

    private final TextView d(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof TextView) {
            return (TextView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            TextView textViewD = d(viewGroup.getChildAt(i));
            if (textViewD != null) {
                return textViewD;
            }
        }
        return null;
    }

    public final void c() {
        this.a.setColor(this.c.getResources().getColor(R.color.gearhead_sdk_list_divider));
    }

    @Override // defpackage.lv
    public void i(Canvas canvas, RecyclerView recyclerView) {
        int left;
        View childAt = recyclerView.getChildAt(0);
        if (childAt == null) {
            left = 0;
        } else {
            View viewD = d(childAt);
            if (viewD == null) {
                viewD = childAt;
            }
            left = 0;
            while (viewD != null && viewD != childAt) {
                left += viewD.getLeft();
                viewD = (View) viewD.getParent();
            }
        }
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        if (this.d) {
            canvas.drawRect(left, BitmapDescriptorFactory.HUE_RED, width, this.b, this.a);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt2 = recyclerView.getChildAt(i);
            int bottom = childAt2.getBottom() - ((ma) childAt2.getLayoutParams()).bottomMargin;
            int i2 = bottom - this.b;
            if (i2 > 0) {
                canvas.drawRect(left, i2, width, bottom, this.a);
            }
        }
    }
}
