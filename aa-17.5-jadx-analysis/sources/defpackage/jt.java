package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class jt extends duz {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ jw d;

    public jt(jw jwVar, int i, int i2, WeakReference weakReference) {
        this.d = jwVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.duz
    public final void b(Typeface typeface) {
        int i = this.a;
        if (i != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        jw jwVar = this.d;
        WeakReference weakReference = this.c;
        if (jwVar.c) {
            jwVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new oa(textView, typeface, jwVar.a, 1));
                } else {
                    jw.b(textView, typeface, jwVar.a);
                }
            }
        }
    }

    @Override // defpackage.duz
    public final void a(int i) {
    }
}
