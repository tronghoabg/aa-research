package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class jrx extends View {
    private boolean a;

    public jrx(Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.a = olm.b(context);
        a();
    }

    private final void a() {
        krr krrVar = krr.q;
        Context context = getContext();
        context.getClass();
        setBackgroundColor(krrVar.b(context, ksa.a.a().c()));
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        context.getClass();
        boolean zB = olm.b(context);
        if (zB != this.a) {
            this.a = zB;
            a();
        }
    }
}
