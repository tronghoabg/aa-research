package com.waze.uid.c;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.Composer;
import com.waze.trip_overview.cm;
import com.waze.uid.state_impl.util.InstallParameters;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class bx implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.af f44330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ModalBottomSheetState f44331b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h.g.a.p f44332c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f44333d;

    public /* synthetic */ bx(kotlinx.coroutines.af afVar, ModalBottomSheetState modalBottomSheetState, h.g.a.p pVar, int i2) {
        this.f44333d = i2;
        this.f44330a = afVar;
        this.f44331b = modalBottomSheetState;
        this.f44332c = pVar;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        if (this.f44333d != 0) {
            int iIntValue = ((Integer) obj2).intValue();
            h.g.a.p pVar = this.f44332c;
            ModalBottomSheetState modalBottomSheetState = this.f44331b;
            return cb.a(this.f44330a, modalBottomSheetState, pVar, (Composer) obj, iIntValue);
        }
        InstallParameters.Result result = (InstallParameters.Result) obj;
        h.g.b.x.f(result, "result");
        kotlinx.coroutines.aj.z(this.f44330a, null, null, new r(this.f44331b, (h.c.e) null, 2, (char[]) null), 3).bY(new cm(this.f44332c, result, (InstallParameters.Community) obj2, 6));
        return h.ab.f48028a;
    }
}
