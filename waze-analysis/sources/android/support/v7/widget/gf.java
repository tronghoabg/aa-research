package android.support.v7.widget;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class gf implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f1550a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f1551b;

    gf(Object obj, int i2) {
        this.f1551b = i2;
        this.f1550a = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = this.f1551b;
        Object obj = this.f1550a;
        if (i2 != 0) {
            ((android.support.v7.view.b) obj).f();
        } else {
            ((Toolbar) obj).k();
        }
    }
}
