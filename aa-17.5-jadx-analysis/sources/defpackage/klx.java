package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import com.google.android.projection.gearhead.R;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class klx extends Fragment {
    public static final yph a = yph.c("GH.HomeFragment");
    private static final long g;
    public ImageView b;
    float c;
    View d;
    ImageView e;
    View f;
    private final AlphaAnimation h = new AlphaAnimation(1.0f, 0.5f);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        g = 5000L;
    }

    public final void a() {
        this.h.cancel();
    }

    public final void b() {
        this.h.start();
    }

    public final void c() {
        this.b.setAlpha(1.0f);
        ImageView imageView = this.e;
        if (imageView != null) {
            imageView.setAlpha(1.0f);
            this.f.setAlpha(1.0f);
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        ((ype) a.l().ai((char) 3202)).u("onCreate");
        ebf.j().o(yzz.LOCK_SCREEN, yzy.jp);
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.car_home_with_escape_hatch_fragment, viewGroup, false);
        this.e = (ImageView) viewInflate.findViewById(R.id.exit_button);
        this.f = viewInflate.findViewById(R.id.exit_text);
        ImageView imageView = this.e;
        AlphaAnimation alphaAnimation = this.h;
        imageView.setAnimation(alphaAnimation);
        this.f.setAnimation(alphaAnimation);
        viewInflate.getViewTreeObserver().addOnGlobalLayoutListener(new klu(this, viewInflate, 0));
        View viewFindViewById = viewInflate.findViewById(R.id.layout);
        this.d = viewFindViewById;
        viewFindViewById.setOnTouchListener(new klw(this));
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.android_auto_logo);
        this.b = imageView2;
        imageView2.setAnimation(alphaAnimation);
        alphaAnimation.setStartOffset(g);
        return viewInflate;
    }

    @Override // android.support.v4.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((ype) a.l().ai((char) 3203)).u("onDestroyView");
        c();
    }

    @Override // android.support.v4.app.Fragment
    public final void onPause() {
        super.onPause();
        ((ype) a.l().ai((char) 3204)).u("onPause");
        a();
    }

    @Override // android.support.v4.app.Fragment
    public final void onResume() {
        super.onResume();
        ((ype) a.l().ai((char) 3205)).u("onResume");
        a();
        this.h.reset();
        b();
        getActivity().getWindow().getDecorView().setSystemUiVisibility(5894);
    }
}
