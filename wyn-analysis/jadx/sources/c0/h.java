package C0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class h extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final int f1770a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1771b;

    /* renamed from: c, reason: collision with root package name */
    public final float f1772c;

    /* renamed from: d, reason: collision with root package name */
    public final float f1773d;

    public h(int i5, float f10, float f11, float f12) {
        this.f1770a = i5;
        this.f1771b = f10;
        this.f1772c = f11;
        this.f1773d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint tp) {
        AbstractC3340k.e(tp, "tp");
        tp.setShadowLayer(this.f1773d, this.f1771b, this.f1772c, this.f1770a);
    }
}
