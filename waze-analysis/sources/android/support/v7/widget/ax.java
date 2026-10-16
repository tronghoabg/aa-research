package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ax implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ba f1095a;

    ax(ba baVar) {
        this.f1095a = baVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        ba baVar = this.f1095a;
        bd bdVar = baVar.f1108b;
        bdVar.setSelection(i2);
        if (bdVar.getOnItemClickListener() != null) {
            bdVar.performItemClick(view, i2, baVar.f1107a.getItemId(i2));
        }
        baVar.k();
    }
}
