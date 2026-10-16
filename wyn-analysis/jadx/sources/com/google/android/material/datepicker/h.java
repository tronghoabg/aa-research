package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j0;

/* loaded from: classes4.dex */
public final class h extends LinearLayoutManager {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f26911b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, int i5, int i10) {
        super(i5, false);
        this.f26911b = kVar;
        this.f26910a = i10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void calculateExtraLayoutSpace(j0 j0Var, int[] iArr) {
        int i5 = this.f26910a;
        k kVar = this.f26911b;
        if (i5 == 0) {
            iArr[0] = kVar.f26922h.getWidth();
            iArr[1] = kVar.f26922h.getWidth();
        } else {
            iArr[0] = kVar.f26922h.getHeight();
            iArr[1] = kVar.f26922h.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.V
    public final void smoothScrollToPosition(RecyclerView recyclerView, j0 j0Var, int i5) {
        t tVar = new t(recyclerView.getContext());
        tVar.setTargetPosition(i5);
        startSmoothScroll(tVar);
    }
}
