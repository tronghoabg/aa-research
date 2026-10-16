package com.waze.reports;

import android.content.Context;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class df extends com.waze.sharedui.g.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    df(di diVar, Context context, String str, com.waze.sharedui.g.s[] sVarArr, com.waze.sharedui.g.q qVar) {
        super(context, str, sVarArr, qVar);
        Objects.requireNonNull(diVar);
    }

    @Override // com.waze.sharedui.g.t, com.waze.sharedui.g.b
    public final void a(int i2) {
        super.a(i2);
        dismiss();
    }
}
