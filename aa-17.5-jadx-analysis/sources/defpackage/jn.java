package defpackage;

import android.support.v7.widget.AppCompatSpinner;
import android.view.View;

/* loaded from: classes2.dex */
public final class jn extends kw {
    final /* synthetic */ jr a;
    final /* synthetic */ AppCompatSpinner b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jn(AppCompatSpinner appCompatSpinner, View view, jr jrVar) {
        super(view);
        this.b = appCompatSpinner;
        this.a = jrVar;
    }

    @Override // defpackage.kw
    public final hw a() {
        return this.a;
    }

    @Override // defpackage.kw
    public final boolean b() {
        AppCompatSpinner appCompatSpinner = this.b;
        if (appCompatSpinner.b.u()) {
            return true;
        }
        appCompatSpinner.b();
        return true;
    }
}
