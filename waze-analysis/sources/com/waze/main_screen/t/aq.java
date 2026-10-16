package com.waze.main_screen.t;

import androidx.lifecycle.ViewModel;
import com.waze.main_screen.p.bm;
import com.waze.main_screen.p.bs;
import kotlinx.coroutines.b.bn;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final /* synthetic */ class aq implements com.waze.main_screen.q.b.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewModel f27501a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f27502b;

    public /* synthetic */ aq(ViewModel viewModel, int i2) {
        this.f27502b = i2;
        this.f27501a = viewModel;
    }

    @Override // com.waze.main_screen.q.b.f
    public final void a() {
        Object objD;
        int i2 = this.f27502b;
        ViewModel viewModel = this.f27501a;
        if (i2 == 0) {
            aw.w((aw) viewModel);
            return;
        }
        bn bnVar = ((bs) viewModel).H;
        do {
            objD = bnVar.d();
        } while (!bnVar.f(objD, bm.m((bm) objD, null, null, null, null, null, null, null, null, null, null, null, 4093)));
    }
}
