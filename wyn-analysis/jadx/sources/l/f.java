package l;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.moloco.sdk.internal.publisher.H;
import kotlin.jvm.internal.AbstractC3340k;
import o5.AbstractC3649c;
import o5.C3647a;
import u3.C4242d;

/* loaded from: classes.dex */
public final class f implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39840a;

    /* renamed from: b, reason: collision with root package name */
    public Object f39841b;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable d3) {
        switch (this.f39840a) {
            case 0:
                break;
            case 1:
                AbstractC3340k.e(d3, "d");
                C3647a c3647a = (C3647a) this.f39841b;
                c3647a.f41361g.setValue(Integer.valueOf(((Number) c3647a.f41361g.getValue()).intValue() + 1));
                Object obj = AbstractC3649c.f41365a;
                Drawable drawable = c3647a.f41360f;
                c3647a.f41362h.setValue(new d0.f((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? d0.f.f33950c : H.I(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
                break;
            default:
                ((C4242d) this.f39841b).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ef.i, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable d3, Runnable what, long j8) {
        switch (this.f39840a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f39841b;
                if (callback != null) {
                    callback.scheduleDrawable(d3, what, j8);
                    break;
                }
                break;
            case 1:
                AbstractC3340k.e(d3, "d");
                AbstractC3340k.e(what, "what");
                ((Handler) AbstractC3649c.f41365a.getValue()).postAtTime(what, j8);
                break;
            default:
                ((C4242d) this.f39841b).scheduleSelf(what, j8);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [ef.i, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable d3, Runnable what) {
        switch (this.f39840a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f39841b;
                if (callback != null) {
                    callback.unscheduleDrawable(d3, what);
                    break;
                }
                break;
            case 1:
                AbstractC3340k.e(d3, "d");
                AbstractC3340k.e(what, "what");
                ((Handler) AbstractC3649c.f41365a.getValue()).removeCallbacks(what);
                break;
            default:
                ((C4242d) this.f39841b).unscheduleSelf(what);
                break;
        }
    }

    public /* synthetic */ f(Object obj, int i5) {
        this.f39840a = i5;
        this.f39841b = obj;
    }

    private final void a(Drawable drawable) {
    }
}
