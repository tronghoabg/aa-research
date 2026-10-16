package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.auto.components.system.dashboard.media.MediaPlayerFragment;
import com.google.android.apps.auto.components.ui.media.SeekableLinearProgressIndicator;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class obt implements View.OnLayoutChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public obt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [afec, java.lang.Object] */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.b;
        if (i9 == 0) {
            obv obvVar = (obv) this.a;
            if (obvVar.a == null) {
                return;
            }
            int dimension = (int) view.getContext().getResources().getDimension(R.dimen.gearhead_toast_shadow_size);
            int i10 = dimension + dimension;
            int height = view.getHeight() + i10;
            int width = view.getWidth() + i10;
            View view2 = obvVar.a;
            view2.getClass();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(width, height);
            } else {
                layoutParams.width = width;
                layoutParams.height = height;
            }
            View view3 = obvVar.a;
            view3.getClass();
            view3.setLayoutParams(layoutParams);
            view.removeOnLayoutChangeListener(this);
            return;
        }
        if (i9 == 1) {
            view.getClass();
            view.removeOnLayoutChangeListener(this);
            ((MediaPlayerFragment) this.a).c().v(view.getWidth(), view.getHeight());
            return;
        }
        if (i9 == 2) {
            SeekableLinearProgressIndicator seekableLinearProgressIndicator = (SeekableLinearProgressIndicator) this.a;
            if (seekableLinearProgressIndicator.getWidth() == 0) {
                ((ype) ((ype) SeekableLinearProgressIndicator.a.g()).ai((char) 6030)).u("onLayoutChange to width 0");
                return;
            } else {
                seekableLinearProgressIndicator.e();
                seekableLinearProgressIndicator.removeOnLayoutChangeListener(this);
                return;
            }
        }
        if (i9 != 3) {
            if (i9 != 4) {
                ((View) this.a).getVisibility();
                return;
            }
            view.getClass();
            view.removeOnLayoutChangeListener(this);
            this.a.invoke(view);
            return;
        }
        tef tefVar = (tef) this.a;
        int i11 = i3 - i;
        int i12 = i4 - i2;
        if (tefVar.d.getWidth() == i11 && tefVar.d.getHeight() == i12) {
            return;
        }
        tefVar.f(i11, i12);
    }

    public /* synthetic */ obt(tef tefVar, int i) {
        this.b = i;
        this.a = tefVar;
    }
}
