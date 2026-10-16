package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class nan extends emn {
    final /* synthetic */ View a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ View d;
    final /* synthetic */ View e;

    public nan(View view, float f, float f2, View view2, View view3) {
        this.a = view;
        this.b = f;
        this.c = f2;
        this.d = view2;
        this.e = view3;
    }

    @Override // defpackage.emn
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        ((ViewGroup) obj).getClass();
        return this.a.getAlpha();
    }

    @Override // defpackage.emn
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        ((ViewGroup) obj).getClass();
        this.a.setAlpha(f);
        View view = this.d;
        float f2 = (this.b + this.c) * (-(1.0f - f));
        view.setTranslationX(f2);
        this.e.setTranslationX(f2);
    }
}
