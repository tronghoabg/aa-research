package com.waze.mywaze.moods;

import android.view.View;
import android.widget.AdapterView;
import com.waze.settings.bl;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class b implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ a[] f30614a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bl f30615b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MoodsActivity f30616c;

    b(MoodsActivity moodsActivity, a[] aVarArr, bl blVar) {
        this.f30614a = aVarArr;
        this.f30615b = blVar;
        Objects.requireNonNull(moodsActivity);
        this.f30616c = moodsActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        a aVar = this.f30614a[i2];
        if (aVar.f30612e) {
            MoodsActivity moodsActivity = this.f30616c;
            moodsActivity.f30607h.setWazerMood(aVar.f30608a, false, true);
            this.f30615b.b(view);
            moodsActivity.setResult(4);
            moodsActivity.finish();
        }
    }
}
