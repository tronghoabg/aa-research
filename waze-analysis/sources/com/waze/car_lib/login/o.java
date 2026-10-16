package com.waze.car_lib.login;

import androidx.autofill.HintConstants;
import com.waze.NativeManager;
import com.waze.cw;
import com.waze.sharedui.api.r;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class o implements org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final cw f20322a;

    /* renamed from: b, reason: collision with root package name */
    private final r f20323b;

    public o(NativeManager nativeManager, com.waze.uid.d.i iVar, cw cwVar, r rVar) {
        x.f(nativeManager, "nativeManager");
        x.f(iVar, "installServices");
        x.f(cwVar, "loginListener");
        x.f(rVar, "uidApi");
        this.f20322a = cwVar;
        this.f20323b = rVar;
    }

    public final void b(String str, String str2, h.g.a.l lVar) {
        x.f(str, HintConstants.AUTOFILL_HINT_USERNAME);
        x.f(str2, HintConstants.AUTOFILL_HINT_PASSWORD);
        x.f(lVar, "onResponse");
        this.f20323b.b(str, str2, new n(this, lVar));
    }

    @Override // org.a.d.a.a
    public final /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }
}
