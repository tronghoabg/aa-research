package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchView;
import j$.util.Objects;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class wkt implements eaj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public wkt(AppBarLayout appBarLayout, int i) {
        this.b = i;
        this.a = appBarLayout;
    }

    @Override // defpackage.eaj
    public final ecy a(View view, ecy ecyVar) {
        int i = this.b;
        if (i == 0) {
            AppBarLayout appBarLayout = (AppBarLayout) this.a;
            ecy ecyVar2 = true != appBarLayout.getFitsSystemWindows() ? null : ecyVar;
            if (!Objects.equals(appBarLayout.c, ecyVar2)) {
                appBarLayout.c = ecyVar2;
                appBarLayout.k();
                appBarLayout.requestLayout();
            }
        } else {
            if (i != 1) {
                int i2 = ecyVar.f(647).c;
                SearchView searchView = (SearchView) this.a;
                searchView.g(i2);
                searchView.d.setVisibility(i2 <= 0 ? 8 : 0);
                return ecyVar;
            }
            dve dveVarA = eeb.a(ecyVar);
            dve dveVarC = dve.c(ecyVar.g(519), ecyVar.g(64));
            eeb eebVar = (eeb) this.a;
            if (!dveVarA.equals(eebVar.c) || !dveVarC.equals(eebVar.d)) {
                eebVar.c = dveVarA;
                eebVar.d = dveVarC;
                ArrayList arrayList = eebVar.b;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((edx) arrayList.get(size)).b();
                }
            }
        }
        return ecyVar;
    }

    public /* synthetic */ wkt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
