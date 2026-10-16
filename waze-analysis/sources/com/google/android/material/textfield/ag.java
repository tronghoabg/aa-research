package com.google.android.material.textfield;

import android.view.View;
import android.widget.AdapterView;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ag implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f6846a;

    ag(ai aiVar) {
        Objects.requireNonNull(aiVar);
        this.f6846a = aiVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        ai aiVar = this.f6846a;
        Object objW = i2 < 0 ? aiVar.f6850a.w() : aiVar.getAdapter().getItem(i2);
        ai aiVar2 = this.f6846a;
        aiVar2.setText(aiVar2.convertSelectionToString(objW), false);
        AdapterView.OnItemClickListener onItemClickListener = aiVar2.getOnItemClickListener();
        if (onItemClickListener != null) {
            if (view == null || i2 < 0) {
                view = aiVar2.f6850a.v();
                i2 = aiVar2.f6850a.p();
                j2 = aiVar2.f6850a.r();
            }
            onItemClickListener.onItemClick(aiVar2.f6850a.bh(), view, i2, j2);
        }
        aiVar2.f6850a.k();
    }
}
