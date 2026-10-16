package defpackage;

import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.util.TypedValue;
import com.google.android.projection.gearhead.R;

/* loaded from: classes3.dex */
final class xcd extends CharacterStyle {
    final /* synthetic */ xce a;

    public xcd(xce xceVar) {
        this.a = xceVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) throws Resources.NotFoundException {
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(R.dimen.car_frx_permission_alpha_value, typedValue, true);
        textPaint.setAlpha((int) (typedValue.getFloat() * 255.0f));
    }
}
