package defpackage;

import android.animation.ValueAnimator;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment;
import com.google.android.apps.auto.sdk.ui.PagedScrollBarView;
import com.google.android.material.internal.ClippableRoundedCornerLayout;

/* loaded from: classes2.dex */
public final class nt implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public nt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v18, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v19, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [afec, java.lang.Object] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ((nu) this.a).p = valueAnimator.getAnimatedFraction();
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f;
                kv kvVar = (kv) this.a;
                int i = (int) fFloatValue;
                kvVar.b.setAlpha(i);
                kvVar.c.setAlpha(i);
                kvVar.d();
                break;
            case 2:
                ((View) ((fr) ((ajmd) this.a).a).c.getParent()).invalidate();
                break;
            case 3:
                ((jhb) this.a).D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 4:
                valueAnimator.getClass();
                mzi mziVar = (mzi) tec.a((Fragment) this.a, mzi.class);
                if (mziVar != null) {
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    animatedValue.getClass();
                    mziVar.c(((Integer) animatedValue).intValue());
                    break;
                }
                break;
            case 5:
                yph yphVar = RailStatusBarFragment.b;
                valueAnimator.getClass();
                this.a.invoke(valueAnimator);
                break;
            case 6:
                yph yphVar2 = RailStatusBarFragment.b;
                valueAnimator.getClass();
                this.a.invoke(valueAnimator);
                break;
            case 7:
                yph yphVar3 = RailStatusBarFragment.b;
                valueAnimator.getClass();
                this.a.invoke(valueAnimator);
                break;
            case 8:
                yph yphVar4 = RailStatusBarFragment.b;
                valueAnimator.getClass();
                this.a.invoke(valueAnimator);
                break;
            case 9:
                ((oxc) this.a).a();
                break;
            case 10:
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                PagedScrollBarView pagedScrollBarView = (PagedScrollBarView) this.a;
                pagedScrollBarView.f.setAlpha(1.0f - fFloatValue2);
                pagedScrollBarView.g.setAlpha(fFloatValue2);
                break;
            case 11:
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wmo wmoVar = (wmo) this.a;
                wmoVar.l.setAlpha((int) (255.0f * fFloatValue3));
                wmoVar.v = fFloatValue3;
                break;
            case 12:
                ((ClippableRoundedCornerLayout) this.a).b((float[]) valueAnimator.getAnimatedValue());
                break;
            case 13:
                wsd wsdVar = (wsd) this.a;
                wsdVar.b.e = wsdVar.e.getInterpolation(wsdVar.d.getAnimatedFraction());
                break;
            case 14:
                int i2 = wtu.x;
                ((fu) this.a).setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 15:
                int i3 = wtu.x;
                ((wqa) this.a).a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 16:
                int i4 = wtu.x;
                ((ImageButton) this.a).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 17:
                ((wtr) this.a).a.f.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 18:
                ((wtr) this.a).a.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 19:
                wtr.g(((wtr) this.a).a.i, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wtu wtuVar = ((wtt) this.a).a;
                wtuVar.j.setAlpha(fFloatValue4);
                wtuVar.q.D.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    public /* synthetic */ nt(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
