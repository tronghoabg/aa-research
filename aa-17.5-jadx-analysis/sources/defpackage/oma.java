package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.auto.components.ui.appbar.AppBarImpl;
import j$.util.Collection;
import j$.util.stream.Stream;

/* loaded from: classes2.dex */
public final class oma extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ ygr b;
    final /* synthetic */ olt c;
    final /* synthetic */ AppBarImpl d;

    public oma(AppBarImpl appBarImpl, boolean z, ygr ygrVar, olt oltVar) {
        this.a = z;
        this.b = ygrVar;
        this.c = oltVar;
        this.d = appBarImpl;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.d.p.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.a) {
            AppBarImpl appBarImpl = this.d;
            Stream streamFilter = Collection.EL.stream(appBarImpl.c()).filter(new mqu(this.b, 19));
            int i = yfq.d;
            yfq yfqVar = (yfq) streamFilter.collect(ycm.a);
            int size = yfqVar.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((View) yfqVar.get(i2)).setVisibility(4);
            }
            ImageView imageView = appBarImpl.p;
            imageView.setVisibility(0);
            yph yphVar = olp.a;
            ViewGroup viewGroup = appBarImpl.e;
            if (viewGroup.getWidth() == 0 || viewGroup.getHeight() == 0) {
                ((ype) ((ype) olp.a.h()).ai((char) 6005)).u("captured view must have height and width greater than 0");
                imageView.setImageDrawable(null);
            } else {
                boolean zIsDrawingCacheEnabled = viewGroup.isDrawingCacheEnabled();
                viewGroup.setDrawingCacheEnabled(true);
                viewGroup.buildDrawingCache();
                Bitmap drawingCache = viewGroup.getDrawingCache(false);
                if (drawingCache != null) {
                    imageView.setImageBitmap(drawingCache.copy(Bitmap.Config.ARGB_8888, false));
                } else {
                    ((ype) ((ype) olp.a.h()).ai((char) 6006)).u("Drawing cache returned null unexpectedly");
                    imageView.setImageDrawable(null);
                }
                viewGroup.destroyDrawingCache();
                viewGroup.setDrawingCacheEnabled(zIsDrawingCacheEnabled);
            }
            int size2 = yfqVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((View) yfqVar.get(i3)).setVisibility(0);
            }
        }
        this.d.e(this.c);
    }
}
