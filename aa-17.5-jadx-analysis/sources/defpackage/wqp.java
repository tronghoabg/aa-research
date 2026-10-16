package defpackage;

import android.text.TextPaint;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class wqp {
    public final TextPaint a = new TextPaint(1);
    public final wtf b = new wqn(this);
    public boolean c = true;
    public WeakReference d;
    public wte e;
    private float f;

    public wqp(wqo wqoVar) {
        this.d = new WeakReference(null);
        this.d = new WeakReference(wqoVar);
    }

    public final float a(String str) {
        if (!this.c) {
            return this.f;
        }
        this.f = str == null ? BitmapDescriptorFactory.HUE_RED : this.a.measureText((CharSequence) str, 0, str.length());
        if (str != null) {
            Math.abs(this.a.getFontMetrics().ascent);
        }
        this.c = false;
        return this.f;
    }
}
