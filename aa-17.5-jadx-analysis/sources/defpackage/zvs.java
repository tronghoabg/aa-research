package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.animation.AlphaAnimation;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.libraries.maps.R;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class zvs extends ListView {
    int a;
    public sm b;
    public sm c;
    private zvq d;
    private final zrt e;
    private boolean f;
    private final gjt g;

    public zvs(gjt gjtVar) {
        super((Context) gjtVar.a, null);
        this.a = -1;
        this.f = false;
        this.g = gjtVar;
        this.e = zrt.a;
    }

    public static boolean f(sm smVar, sm smVar2) {
        if (smVar == smVar2) {
            return true;
        }
        if (smVar == null || smVar2 == null) {
            return false;
        }
        return smVar.F().equals(smVar2.F());
    }

    public final void a() {
        post(new zte(this, 8));
    }

    public final void b() {
        int i = this.a;
        if (i != -1) {
            smoothScrollToPosition(i);
        }
    }

    public final void c(int i) {
        if (i == this.a) {
            return;
        }
        this.a = i;
        this.d.notifyDataSetChanged();
        if (i == -1 || this.b == null || i >= this.d.getCount()) {
            return;
        }
        zvr zvrVar = (zvr) getItemAtPosition(i);
        if (zvrVar == null) {
            if (zrn.e("INDOOR", 3)) {
                Log.d("INDOOR", a.bn(i, "getItemAtPosition(", ") returned null"));
                return;
            }
            return;
        }
        erb erbVar = zvrVar.a;
        if (erbVar != null) {
            this.b.C(erbVar.ad());
            return;
        }
        sm smVar = this.c;
        if (smVar != null) {
            sm smVar2 = this.b;
            Object objF = smVar.F();
            objF.getClass().getName();
            Object obj = smVar2.a;
            tzt tztVar = (tzt) obj;
            if (tztVar.g()) {
                final long jC = tztVar.f.c();
                synchronized (obj) {
                    qrx qrxVar = ((tzt) obj).g;
                    if (qrxVar == null) {
                        return;
                    }
                    final tzt tztVar2 = (tzt) obj;
                    qrxVar.c((tob) objF, new tzf() { // from class: tzp
                        @Override // defpackage.tzn
                        public final void a(Object obj2) {
                            tztVar2.c(null, (tzv) obj2, jC);
                        }
                    });
                }
            }
        }
    }

    public final void d(sm smVar) {
        if (smVar != null) {
            a();
        }
        this.b = smVar;
    }

    public final void e(sm smVar, int i) {
        this.e.a();
        if (!f(smVar, this.c)) {
            clearAnimation();
            this.c = null;
            this.a = -1;
            if (smVar != null) {
                if (smVar.E().size() >= (true != smVar.G() ? 2 : 1)) {
                    if (!this.f) {
                        this.f = true;
                        setBackgroundDrawable(this.g.D(R.drawable.maps_floorpicker_bar));
                    }
                    this.c = smVar;
                    setVisibility(0);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(BitmapDescriptorFactory.HUE_RED, 1.0f);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setDuration(500L);
                    alphaAnimation.setAnimationListener(new fcs(this, 3));
                    startAnimation(alphaAnimation);
                    zvq zvqVar = new zvq(this, this.g, this.c);
                    this.d = zvqVar;
                    setAdapter((ListAdapter) zvqVar);
                }
            }
            if (this.c == null && getVisibility() == 0) {
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED);
                alphaAnimation2.setDuration(500L);
                alphaAnimation2.setAnimationListener(new fcs(this, 4));
                startAnimation(alphaAnimation2);
            }
        }
        if (this.c != null) {
            if (i == -1 || i < 0) {
                i = -1;
            }
            c(i);
            b();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new zte(this, 9));
    }
}
