package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.auto.sdk.SearchItem;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class qgj extends lt implements oxi {
    public boolean a;
    public final /* synthetic */ qgm e;
    private List f = new ArrayList();

    public qgj(qgm qgmVar) {
        this.e = qgmVar;
    }

    @Override // defpackage.lt
    public final int a() {
        if (this.a) {
            return 0;
        }
        return this.f.size();
    }

    public final void c(List list) {
        this.f = list;
        g();
    }

    @Override // defpackage.lt
    public final int d(int i) {
        return ((SearchItem) this.f.get(i)).a;
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ mo f(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(this.e.c).inflate(R.layout.demand_space_search_suggestion, viewGroup, false);
        if (i == 0) {
            return new qgi(viewInflate);
        }
        if (i != 1) {
            return null;
        }
        return new qgl(viewInflate);
    }

    @Override // defpackage.lt
    public final /* bridge */ /* synthetic */ void n(mo moVar, int i) {
        qgk qgkVar = (qgk) moVar;
        SearchItem searchItem = (SearchItem) this.f.get(i);
        qgm qgmVar = this.e;
        qgkVar.E(searchItem, qgmVar.b, qgmVar.c);
        qgkVar.a.setOnClickListener(new jmq(this, searchItem, 19, null));
    }

    @Override // defpackage.oxi
    public final void b(int i) {
    }
}
