package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class idd implements ViewTreeObserver.OnDrawListener {
    final /* synthetic */ View a;
    public final /* synthetic */ ide b;

    public idd(ide ideVar, View view) {
        this.a = view;
        this.b = ideVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        ify.g(new ae(this, this.a, (ViewTreeObserver.OnDrawListener) this, 15));
    }
}
