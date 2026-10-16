package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes3.dex */
final class wtd extends wtf {
    final /* synthetic */ Context a;
    final /* synthetic */ TextPaint b;
    final /* synthetic */ wtf c;
    final /* synthetic */ wte d;

    public wtd(wte wteVar, Context context, TextPaint textPaint, wtf wtfVar) {
        this.a = context;
        this.b = textPaint;
        this.c = wtfVar;
        this.d = wteVar;
    }

    @Override // defpackage.wtf
    public final void a(int i) {
        this.c.a(i);
    }

    @Override // defpackage.wtf
    public final void b(Typeface typeface, boolean z) {
        this.d.e(this.a, this.b, typeface);
        this.c.b(typeface, z);
    }
}
