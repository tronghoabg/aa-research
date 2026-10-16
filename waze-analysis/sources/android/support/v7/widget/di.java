package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class di implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ dm f1347a;

    di(dm dmVar) {
        this.f1347a = dmVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        cl clVar;
        if (i2 == -1 || (clVar = this.f1347a.f1353c) == null) {
            return;
        }
        clVar.a(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
