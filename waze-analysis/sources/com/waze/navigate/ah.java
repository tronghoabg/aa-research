package com.waze.navigate;

import android.view.View;
import android.widget.AdapterView;
import com.waze.install.SelectCountryActivity;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class ah implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f30988a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f30989b;

    public /* synthetic */ ah(Object obj, int i2) {
        this.f30989b = i2;
        this.f30988a = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        int i3 = this.f30989b;
        if (i3 == 0) {
            AutocompleteSearchActivity.r((AutocompleteSearchActivity) this.f30988a, i2);
            return;
        }
        Object obj = this.f30988a;
        if (i3 == 1) {
            SelectCountryActivity.l((SelectCountryActivity) obj, i2);
            return;
        }
        com.waze.uid.c.w wVar = (com.waze.uid.c.w) obj;
        if (wVar.a().getItemViewType(i2) == com.waze.uid.c.t.f44415a.a()) {
            com.waze.uid.f.c cVarB = wVar.a().getItem(i2).b();
            h.g.b.x.c(cVarB);
            long jE = cVarB.e();
            wVar.a().b(jE);
            wVar.b().e(jE);
        }
    }
}
