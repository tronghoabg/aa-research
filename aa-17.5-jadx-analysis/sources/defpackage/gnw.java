package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class gnw extends FrameLayout {
    private static final yob b = yob.c("com/android/car/libraries/apphost/map/compose/MapSwitchView");
    private static final List c = new ArrayList();
    public final gpc a;
    private final int d;

    public gnw(Context context, gpc gpcVar) {
        super(context);
        this.a = gpcVar;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.d = System.identityHashCode(this);
    }

    private final void a(gnw gnwVar) {
        ((ynz) b.e().ai(60)).w("Activate map switch view %s", gnwVar.d);
        if (gnwVar.getChildCount() != 0) {
            throw new IllegalStateException("Check failed.");
        }
        gpc gpcVar = this.a;
        gnwVar.addView(gpcVar);
        gpcVar.h(eps.e);
    }

    private final void b(gnw gnwVar) {
        ((ynz) b.e().ai(61)).w("Deactivate map switch view %s", gnwVar.d);
        if (gnwVar.getChildCount() == 0) {
            throw new IllegalStateException("Check failed.");
        }
        gnwVar.removeAllViews();
        this.a.h(eps.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((ynz) b.e().ai(62)).w("Attaching %s", this.d);
        List list = c;
        gnw gnwVar = (gnw) woy.bL(list);
        if (gnwVar != null) {
            b(gnwVar);
        }
        list.add(this);
        if (list.size() <= 10) {
            a(this);
            return;
        }
        throw new IllegalStateException("There were " + list.size() + " attached MapSwitchViews");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((ynz) b.e().ai(63)).w("Detaching %s", this.d);
        List list = c;
        if (!list.remove(this)) {
            throw new IllegalStateException("Check failed.");
        }
        if (getChildCount() != 0) {
            b(this);
            gnw gnwVar = (gnw) woy.bL(list);
            if (gnwVar != null) {
                a(gnwVar);
            }
        }
    }
}
