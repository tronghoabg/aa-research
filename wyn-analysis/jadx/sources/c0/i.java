package C0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class i extends CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1774a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1775b;

    public i(boolean z2, boolean z10) {
        this.f1774a = z2;
        this.f1775b = z10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        AbstractC3340k.e(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f1774a);
        textPaint.setStrikeThruText(this.f1775b);
    }
}
