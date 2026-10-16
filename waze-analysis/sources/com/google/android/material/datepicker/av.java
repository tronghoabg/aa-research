package com.google.android.material.datepicker;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
class av extends LinearLayoutManager {
    av(int i2) {
        super(i2);
    }

    @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.en
    public final void aq(RecyclerView recyclerView, int i2) {
        au auVar = new au(this, recyclerView.getContext());
        auVar.h(i2);
        bh(auVar);
    }
}
