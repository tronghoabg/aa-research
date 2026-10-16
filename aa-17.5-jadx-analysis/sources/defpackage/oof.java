package defpackage;

import android.R;
import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class oof extends AppWidgetHostView {
    public final Rect a;
    public final float b;
    private final ooe c;
    private final ood d;

    public oof(Context context) {
        super(context);
        ooe ooeVar = new ooe();
        this.c = ooeVar;
        setExecutor(mki.a.d);
        setClipToOutline(true);
        setOutlineProvider(ooeVar);
        this.a = new Rect();
        this.b = getContext().getResources().getDimension(R.dimen.system_app_widget_background_radius);
        this.d = new ood(this);
    }

    private final void a() {
        setOutlineProvider(this.c);
    }

    @Override // android.appwidget.AppWidgetHostView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (RuntimeException unused) {
            post(new oez(this, 10));
        }
        if (this.b <= BitmapDescriptorFactory.HUE_RED) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList();
        mva.B(this, arrayList);
        View viewA = arrayList.size() == 1 ? (View) arrayList.get(0) : getChildCount() > 0 ? mva.A(getChildAt(0)) : this;
        if (viewA == null || (viewA.getId() == 16908288 && viewA.getClipToOutline())) {
            a();
            return;
        }
        Rect rect = this.a;
        rect.left = 0;
        rect.right = viewA.getWidth();
        rect.top = 0;
        rect.bottom = viewA.getHeight();
        while (viewA != this) {
            rect.offset(viewA.getLeft(), viewA.getTop());
            viewA = (View) viewA.getParent();
        }
        setOutlineProvider(this.d);
        invalidateOutline();
    }
}
