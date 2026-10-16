package com.waze;

import com.waze.profile.TempUserProfileActivity;
import com.waze.uid.FlowContext;
import com.waze.uid.FlowType;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class km implements com.waze.ab.q {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f25058a;

    public /* synthetic */ km(int i2) {
        this.f25058a = i2;
    }

    @Override // com.waze.ab.q
    public final void onClick(boolean z) {
        int i2 = this.f25058a;
        if (i2 == 0) {
            ix.A(z);
        } else if (i2 != 1) {
            int i3 = TempUserProfileActivity.f33377f;
            if (z) {
                com.waze.uid.b.ab.f44136a.a().A(com.waze.uid.r.d(FlowType.LOGIN, FlowContext.SETTINGS));
            }
        }
    }
}
