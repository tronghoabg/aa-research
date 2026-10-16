package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gearhead.appdecor.TopDownInsetDispatchFrameLayout;

/* loaded from: classes2.dex */
public abstract class qfi extends TopDownInsetDispatchFrameLayout {
    public qfi(Context context) {
        super(context);
    }

    public abstract void a(Bundle bundle);

    public abstract void b(Bundle bundle);

    public abstract void c(boolean z);

    public abstract void d(qfu qfuVar);

    public abstract boolean e();

    public abstract void f(ykd ykdVar);

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }
}
