package defpackage;

import android.content.DialogInterface;
import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes2.dex */
final class eh implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController a;
    final /* synthetic */ ej b;

    public eh(ej ejVar, AlertController alertController) {
        this.b = ejVar;
        this.a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AlertController alertController = this.a;
        ej ejVar = this.b;
        DialogInterface.OnClickListener onClickListener = ejVar.q;
        fg fgVar = alertController.b;
        onClickListener.onClick(fgVar, i);
        if (ejVar.u) {
            return;
        }
        fgVar.dismiss();
    }
}
