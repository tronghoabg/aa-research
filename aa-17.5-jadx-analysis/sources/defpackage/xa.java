package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class xa {
    public boolean a;
    public final Object b;
    public final Object c;

    public xa(ImageView imageView, gjt gjtVar) {
        this.a = false;
        this.b = imageView;
        this.c = gjtVar;
    }

    public final MotionEvent a() {
        return (MotionEvent) ((tj) this.c).c;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final boolean b(long j) {
        Object obj;
        ?? r6 = ((tj) this.c).b;
        int size = r6.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = r6.get(i);
            if (((cqw) obj).a == j) {
                break;
            }
            i++;
        }
        cqw cqwVar = (cqw) obj;
        return cqwVar != null && cqwVar.h;
    }

    public final int c() {
        int i = ((tj) this.c).a;
        if (i != 1) {
            return i;
        }
        MotionEvent motionEventA = a();
        if (motionEventA == null || Build.VERSION.SDK_INT < 29) {
            return 1;
        }
        int classification = motionEventA.getClassification();
        if (classification == 1) {
            return 2;
        }
        if (classification != 2) {
            return (classification == 5 && Build.VERSION.SDK_INT >= 34) ? 4 : 1;
        }
        return 3;
    }

    public final void d() {
        if (this.a) {
            return;
        }
        this.a = true;
        int i = true != zkt.c ? R.drawable.maps_btn_myl : R.drawable.maps_btn_myl_wear;
        Object obj = this.b;
        gjt gjtVar = (gjt) this.c;
        ImageView imageView = (ImageView) obj;
        imageView.setImageDrawable(gjtVar.D(i));
        imageView.setVisibility(8);
        imageView.setContentDescription(gjtVar.F(R.string.maps_MY_LOCATION_ALT_TEXT));
        imageView.setTag("GoogleMapMyLocationButton");
        imageView.getViewTreeObserver().addOnGlobalLayoutListener(new hx(this, 10));
    }

    public final void e(View.OnClickListener onClickListener) {
        ((ImageView) this.b).setOnClickListener(onClickListener);
    }

    public final void f(boolean z) {
        if (addm.e() && z) {
            d();
        }
        ((ImageView) this.b).setVisibility(true != z ? 8 : 0);
    }

    public xa(unr unrVar, uiv uivVar, boolean z) {
        this.c = unrVar;
        this.b = uivVar;
        this.a = z;
    }

    public xa(zs zsVar, tj tjVar) {
        this.b = zsVar;
        this.c = tjVar;
    }
}
