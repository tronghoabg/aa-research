package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import com.google.android.apps.auto.components.apphost.view.widgets.common.InputSignInView;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final /* synthetic */ class kbx implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ kbx(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r6v22, types: [gku, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [asf, java.lang.Object] */
    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (this.c != 0) {
            if (z) {
                ?? r7 = this.b;
                this.a.b();
                r7.c(gbp.b);
                return;
            }
            return;
        }
        kby kbyVar = (kby) this.a;
        InputSignInView inputSignInView = kbyVar.d;
        if (inputSignInView.getVisibility() == 0) {
            if (z) {
                if (kbyVar.g || kbyVar.f == null) {
                    return;
                }
                kbyVar.f();
                return;
            }
            if (kbyVar.f == null) {
                Object obj = this.b;
                int i = kbyVar.h;
                if (!((geu) obj).x().b()) {
                    i -= kbyVar.p;
                }
                inputSignInView.findViewById(R.id.input_sign_in_box).getLocationOnScreen(new int[2]);
                float height = i - (kbyVar.b.getHeight() - (r3[1] + r6.getHeight()));
                if (height > BitmapDescriptorFactory.HUE_RED) {
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(inputSignInView, "translationY", -height);
                    kbyVar.f = new AnimatorSet();
                    kbyVar.f.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(kbyVar.c, "alpha", BitmapDescriptorFactory.HUE_RED));
                }
            }
            gku gkuVar = kbyVar.a;
            if (gkuVar == null || !gkuVar.c() || !kbyVar.g || kbyVar.f == null) {
                return;
            }
            kbyVar.f();
        }
    }
}
