package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.IBinder;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.libraries.maps.R;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.maps.model.CameraPosition;

/* loaded from: classes3.dex */
public final class zul extends ImageView implements Animation.AnimationListener, vez {
    Matrix a;
    public final Animation b;
    public final Animation c;
    public boolean d;
    private Matrix e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private final gjt j;

    public zul(gjt gjtVar) {
        super((Context) gjtVar.a);
        this.h = false;
        this.i = false;
        this.j = gjtVar;
        setScaleType(ImageView.ScaleType.MATRIX);
        if (!addm.e()) {
            c();
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(BitmapDescriptorFactory.HUE_RED, 1.0f);
        this.b = alphaAnimation;
        alphaAnimation.setDuration(100L);
        alphaAnimation.setAnimationListener(this);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED);
        this.c = alphaAnimation2;
        alphaAnimation2.setDuration(500L);
        alphaAnimation2.setStartOffset(1600L);
        alphaAnimation2.setAnimationListener(this);
    }

    private final synchronized void c() {
        if (this.i) {
            return;
        }
        this.i = true;
        gjt gjtVar = this.j;
        setImageDrawable(gjtVar.D(R.drawable.maps_ic_compass_needle));
        setBackground(gjtVar.D(com.google.android.projection.gearhead.R.drawable.maps_button_compass_selector));
    }

    @Override // defpackage.vez
    public final void a(CameraPosition cameraPosition) {
        if (this.d) {
            this.f = cameraPosition.bearing;
            this.g = cameraPosition.tilt;
            b();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return null;
    }

    protected final void b() {
        Matrix matrix;
        Matrix matrix2 = this.e;
        if (matrix2 != null && (matrix = this.a) != null) {
            matrix.set(matrix2);
            this.a.postRotate(-this.f, getWidth() / 2.0f, getHeight() / 2.0f);
            float f = (this.g / 90.0f) * 0.7f;
            this.a.postScale(1.0f, 1.0f - f);
            this.a.postTranslate(BitmapDescriptorFactory.HUE_RED, (f / 2.0f) * getHeight());
            setImageMatrix(this.a);
        }
        float f2 = this.g;
        float f3 = this.f;
        if (f2 <= 0.5f && (f3 < 0.5f || f3 > 359.5f)) {
            if (getVisibility() == 0) {
                Animation animation = getAnimation();
                Animation animation2 = this.c;
                if (animation != animation2) {
                    this.h = false;
                    startAnimation(animation2);
                    return;
                }
                return;
            }
            return;
        }
        if (addm.e()) {
            c();
        }
        if (getVisibility() == 0 && getAnimation() == this.c) {
            this.h = true;
            clearAnimation();
        } else if (getVisibility() == 4) {
            Animation animation3 = getAnimation();
            Animation animation4 = this.b;
            if (animation3 != animation4) {
                startAnimation(animation4);
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        if (animation == this.c && this.d && !this.h) {
            setVisibility(4);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (animation == this.b && this.d) {
            setVisibility(0);
        }
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (addm.e()) {
            c();
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.e = new Matrix();
        this.a = new Matrix();
        this.e.setRectToRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getDrawable().getIntrinsicWidth(), getDrawable().getIntrinsicHeight()), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, i2), Matrix.ScaleToFit.CENTER);
        b();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
