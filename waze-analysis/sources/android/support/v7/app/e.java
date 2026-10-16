package android.support.v7.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class e implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f579a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f580b;

    e(g gVar, j jVar) {
        this.f580b = gVar;
        this.f579a = jVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        j jVar = this.f579a;
        g gVar = this.f580b;
        DialogInterface.OnClickListener onClickListener = gVar.q;
        ap apVar = jVar.f597a;
        onClickListener.onClick(apVar, i2);
        if (gVar.u) {
            return;
        }
        apVar.dismiss();
    }
}
