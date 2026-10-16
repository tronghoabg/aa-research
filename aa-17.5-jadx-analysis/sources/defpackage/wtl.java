package defpackage;

import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;

/* loaded from: classes3.dex */
public final class wtl implements wkl {
    final /* synthetic */ wkm a;
    final /* synthetic */ wtu b;
    private final /* synthetic */ int c;

    public wtl(wtu wtuVar, wkm wkmVar, int i) {
        this.c = i;
        this.a = wkmVar;
        this.b = wtuVar;
    }

    @Override // defpackage.wkl
    public final void a() {
        int i = this.c;
        wtu wtuVar = this.b;
        if (i != 0) {
            wtuVar.s.c(true);
            SearchView searchView = wtuVar.a;
            if (!searchView.j()) {
                searchView.d();
            }
            searchView.l(4, true);
            if (wtuVar.m == this.a) {
                wtuVar.m = null;
                return;
            }
            return;
        }
        wtuVar.s.c(false);
        wtuVar.c.setVisibility(8);
        SearchView searchView2 = wtuVar.a;
        if (!searchView2.j()) {
            wtuVar.j.clearFocus();
        }
        searchView2.l(2, true);
        if (wtuVar.m == this.a) {
            wtuVar.m = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wkl
    public final void b() {
        int i = this.c;
        wtu wtuVar = this.b;
        if (i == 0) {
            wtuVar.s.d(false);
            wtuVar.a.l(1, true);
            return;
        }
        wtuVar.s.d(true);
        wtuVar.c.setVisibility(0);
        SearchBar searchBar = wtuVar.q;
        wox woxVar = searchBar.M;
        View view = searchBar.H;
        if (view instanceof wkj) {
            ((wkj) view).a();
        }
        if (view != 0) {
            view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }
}
