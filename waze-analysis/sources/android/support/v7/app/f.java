package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class f implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AlertController$RecycleListView f581a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f582b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f583c;

    f(g gVar, AlertController$RecycleListView alertController$RecycleListView, j jVar) {
        this.f583c = gVar;
        this.f581a = alertController$RecycleListView;
        this.f582b = jVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        g gVar = this.f583c;
        boolean[] zArr = gVar.s;
        if (zArr != null) {
            zArr[i2] = this.f581a.isItemChecked(i2);
        }
        gVar.w.onClick(this.f582b.f597a, i2, this.f581a.isItemChecked(i2));
    }
}
