package com.waze.stats;

import androidx.compose.material.ModalBottomSheetState;
import com.waze.uid.c.bo;
import com.waze.uid.c.bt;
import com.waze.uid.state_impl.util.InstallParameters;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ay implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f40551a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f40552b;

    public /* synthetic */ ay(Object obj, int i2) {
        this.f40552b = i2;
        this.f40551a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v27, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [h.g.a.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [h.g.a.p, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f40552b) {
            case 0:
                return ba.h((ba) this.f40551a);
            case 1:
                return ba.f((ba) this.f40551a);
            case 2:
                return ba.e((ba) this.f40551a);
            case 3:
                return ba.g((ba) this.f40551a);
            case 4:
                return bo.c((bo) this.f40551a);
            case 5:
                return bo.a((bo) this.f40551a);
            case 6:
                return bo.e((bo) this.f40551a);
            case 7:
                ((android.support.v4.app.ar) this.f40551a).requireActivity().getOnBackPressedDispatcher().onBackPressed();
                return h.ab.f48028a;
            case 8:
                bt.J(5, true);
                return null;
            case 9:
                bt.J(4, true);
                return null;
            case 10:
                this.f40551a.invoke(InstallParameters.Result.NEW_USER, InstallParameters.Community.GOOGLE);
                return h.ab.f48028a;
            case 11:
                this.f40551a.invoke(InstallParameters.Result.NEW_USER, InstallParameters.Community.EMAIL);
                return h.ab.f48028a;
            case 12:
                this.f40551a.invoke(InstallParameters.Result.GUEST, null);
                return h.ab.f48028a;
            default:
                return ((ModalBottomSheetState) this.f40551a).getTargetValue();
        }
    }
}
