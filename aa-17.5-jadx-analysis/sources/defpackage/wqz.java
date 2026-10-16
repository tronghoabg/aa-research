package defpackage;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.animation.PathInterpolator;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public class wqz {
    public final View a;
    public final int b;
    public final int c;
    protected final int d;
    public nw e;
    private final TimeInterpolator f = new PathInterpolator(0.1f, 0.1f, BitmapDescriptorFactory.HUE_RED, 1.0f);

    public wqz(View view) {
        this.a = view;
        Context context = view.getContext();
        this.b = woy.v(context.getTheme(), R.attr.motionDurationMedium2, 300);
        this.c = woy.v(context.getTheme(), R.attr.motionDurationShort3, 150);
        this.d = woy.v(context.getTheme(), R.attr.motionDurationShort2, 100);
    }

    public final float a(float f) {
        return this.f.getInterpolation(f);
    }

    protected final nw b() {
        if (this.e == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        nw nwVar = this.e;
        this.e = null;
        return nwVar;
    }

    public final nw c() {
        nw nwVar = this.e;
        this.e = null;
        return nwVar;
    }

    protected final nw d(nw nwVar) {
        if (this.e == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        nw nwVar2 = this.e;
        this.e = nwVar;
        return nwVar2;
    }
}
