package B9;

import A7.V;
import D9.l;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import y3.C4552j;

/* loaded from: classes4.dex */
public final class d extends V4.a {

    /* renamed from: d, reason: collision with root package name */
    public ImageView f1621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ E9.c f1622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Activity f1623f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1624g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f1625h;

    public d(f fVar, E9.c cVar, Activity activity, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f1625h = fVar;
        this.f1622e = cVar;
        this.f1623f = activity;
        this.f1624g = onGlobalLayoutListener;
    }

    @Override // V4.a
    public final void c(Drawable drawable) {
        D9.e.a("Downloading Image Cleared");
        ImageView imageView = this.f1621d;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        f();
    }

    @Override // V4.a
    public final void d(Drawable drawable) {
        D9.e.a("Downloading Image Failed");
        ImageView imageView = this.f1621d;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        new Exception("Image loading failed!");
        D9.e.d("Image download failure ");
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f1624g;
        if (onGlobalLayoutListener != null) {
            this.f1622e.i().getViewTreeObserver().removeGlobalOnLayoutListener(onGlobalLayoutListener);
        }
        f fVar = this.f1625h;
        Y9.c cVar = fVar.f1630d;
        CountDownTimer countDownTimer = (CountDownTimer) cVar.f16739b;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            cVar.f16739b = null;
        }
        Y9.c cVar2 = fVar.f1631e;
        CountDownTimer countDownTimer2 = (CountDownTimer) cVar2.f16739b;
        if (countDownTimer2 != null) {
            countDownTimer2.cancel();
            cVar2.f16739b = null;
        }
        fVar.f1636j = null;
        fVar.k = null;
    }

    @Override // V4.a
    public final void e(Object obj) {
        Drawable drawable = (Drawable) obj;
        D9.e.a("Downloading Image Success!!!");
        ImageView imageView = this.f1621d;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
        f();
    }

    public final void f() {
        E9.c cVar = this.f1622e;
        if (!cVar.f().f2588i.booleanValue()) {
            cVar.j().setOnTouchListener(new c(this, 0));
        }
        f fVar = this.f1625h;
        Y9.c cVar2 = fVar.f1630d;
        xa.d dVar = new xa.d(this, 5);
        cVar2.getClass();
        cVar2.f16739b = new l(5000L, dVar).start();
        if (cVar.f().k.booleanValue()) {
            C4552j c4552j = new C4552j(this, 5);
            Y9.c cVar3 = fVar.f1631e;
            cVar3.getClass();
            cVar3.f16739b = new l(20000L, c4552j).start();
        }
        this.f1623f.runOnUiThread(new V(this, 4));
    }
}
