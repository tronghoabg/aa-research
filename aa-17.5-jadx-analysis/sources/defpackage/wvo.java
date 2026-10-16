package defpackage;

import android.view.View;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class wvo implements eaj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public wvo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eaj
    public final ecy a(View view, ecy ecyVar) {
        if (this.b != 0) {
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.a;
            ecy ecyVar2 = true != collapsingToolbarLayout.getFitsSystemWindows() ? null : ecyVar;
            if (!Objects.equals(collapsingToolbarLayout.f, ecyVar2)) {
                collapsingToolbarLayout.f = ecyVar2;
                collapsingToolbarLayout.requestLayout();
            }
            return ecyVar.n();
        }
        int iA = ecyVar.a();
        BaseTransientBottomBar baseTransientBottomBar = (BaseTransientBottomBar) this.a;
        baseTransientBottomBar.l = iA;
        baseTransientBottomBar.m = ecyVar.b();
        baseTransientBottomBar.n = ecyVar.c();
        baseTransientBottomBar.h();
        return ecyVar;
    }
}
