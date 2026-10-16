package defpackage;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes2.dex */
final class ei implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController.RecycleListView a;
    final /* synthetic */ AlertController b;
    final /* synthetic */ ej c;

    public ei(ej ejVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.c = ejVar;
        this.a = recycleListView;
        this.b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ej ejVar = this.c;
        boolean[] zArr = ejVar.s;
        if (zArr != null) {
            zArr[i] = this.a.isItemChecked(i);
        }
        ejVar.w.onClick(this.b.b, i, this.a.isItemChecked(i));
    }
}
