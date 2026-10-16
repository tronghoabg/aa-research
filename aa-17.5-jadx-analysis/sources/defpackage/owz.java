package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.apps.auto.sdk.ui.CarLayoutManager;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class owz extends mk {
    public final int a;
    final /* synthetic */ CarLayoutManager n;
    private final oxa o;
    private final boolean p;
    private final Interpolator q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owz(CarLayoutManager carLayoutManager, Context context, int i, oxa oxaVar) {
        super(context);
        this.n = carLayoutManager;
        this.a = i;
        this.o = oxaVar;
        this.p = carLayoutManager.b.getResources().getBoolean(R.bool.gearhead_sdk_true_for_touch);
        this.q = new DecelerateInterpolator(oxaVar.e);
    }

    @Override // defpackage.mk
    protected final float a(DisplayMetrics displayMetrics) {
        return this.o.c / displayMetrics.densityDpi;
    }

    @Override // defpackage.mk
    protected final void c(View view, mi miVar) {
        CarLayoutManager carLayoutManager = this.n;
        if (carLayoutManager.a && carLayoutManager.V()) {
            if (d() == 0) {
                Log.w("CarLayoutManager", "Smooth scroller used when no children are laid out");
            } else {
                View viewJ = carLayoutManager.J(((RecyclerView) carLayoutManager.aD(0).getParent()).indexOfChild(view));
                if (viewJ != null) {
                    if (Log.isLoggable("CarLayoutManager", 3)) {
                        Log.d("CarLayoutManager", String.format("Explicitly requesting focus on %s, targetView = %s", viewJ, view));
                    }
                    viewJ.requestFocus();
                } else if (Log.isLoggable("CarLayoutManager", 3)) {
                    Log.d("CarLayoutManager", String.format("No focusable children exist near %s, not requesting focus", view));
                }
            }
            carLayoutManager.a = false;
        }
        int iJ = j(view, -1);
        if (iJ == 0) {
            if (Log.isLoggable("CarLayoutManager", 3)) {
                Log.d("CarLayoutManager", "Scroll distance is 0");
            }
        } else {
            int iK = k(iJ);
            if (iK > 0) {
                miVar.b(0, -iJ, iK, this.q);
            }
        }
    }

    @Override // defpackage.mk
    public final int f() {
        return this.a;
    }

    @Override // defpackage.mk
    public final PointF g(int i) {
        if (d() == 0) {
            return null;
        }
        CarLayoutManager carLayoutManager = this.n;
        return new PointF(BitmapDescriptorFactory.HUE_RED, this.a < CarLayoutManager.bl(carLayoutManager.aD(carLayoutManager.l())) ? -1 : 1);
    }

    @Override // defpackage.mk
    protected final int k(int i) {
        int iCeil = (int) Math.ceil(b(i) / this.o.d);
        return this.p ? iCeil : Math.min(iCeil, 1000);
    }

    @Override // defpackage.mk
    protected final int l() {
        return -1;
    }
}
