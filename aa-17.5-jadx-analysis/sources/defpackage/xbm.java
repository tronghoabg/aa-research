package defpackage;

import android.content.Intent;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes3.dex */
final class xbm extends ClickableSpan {
    final /* synthetic */ Intent a;
    final /* synthetic */ xbo b;

    public xbm(xbo xboVar, Intent intent) {
        this.a = intent;
        this.b = xboVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        xbo xboVar = this.b;
        xboVar.p(yzy.ez);
        xboVar.startActivity(this.a);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
