package P7;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j0;
import b1.AbstractC1492a;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class b extends Q {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f9263a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9264b;

    public b() {
        Paint paint = new Paint();
        this.f9263a = paint;
        this.f9264b = DesugarCollections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, j0 j0Var) {
        super.onDrawOver(canvas, recyclerView, j0Var);
        Paint paint = this.f9263a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f9264b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC1492a.f19119a;
            float f10 = 1.0f - UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.alpha(-65281) * f10)), (int) ((Color.red(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.red(-65281) * f10)), (int) ((Color.green(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.green(-65281) * f10)), (int) ((Color.blue(-16776961) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) + (Color.blue(-65281) * f10))));
            float paddingTop = ((CarouselLayoutManager) recyclerView.getLayoutManager()).getPaddingTop();
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
            canvas.drawLine(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paddingTop, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom(), paint);
        }
    }
}
