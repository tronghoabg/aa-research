package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.apps.auto.sdk.MenuItem;

/* loaded from: classes2.dex */
public final class krk implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ krm a;
    final /* synthetic */ MenuItem b;
    final /* synthetic */ krl c;

    public krk(krl krlVar, krm krmVar, MenuItem menuItem) {
        this.a = krmVar;
        this.b = menuItem;
        this.c = krlVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        krl krlVar = this.c;
        krlVar.R.getViewTreeObserver().removeOnPreDrawListener(this);
        int width = (int) (r1.getWidth() / (krlVar.ak.getResources().getDisplayMetrics().xdpi / 160.0f));
        if (width > 146) {
            krm krmVar = this.a;
            krmVar.b = 1;
            krlVar.O(krlVar.U, this.b);
            ((ype) krl.s.l().ai((char) 3420)).w("Secondary action pill with width %s falling back to circles, text too long", width);
            krlVar.P(krmVar);
        }
        return true;
    }
}
