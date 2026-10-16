package com.waze.system;

import android.content.Context;
import android.content.Intent;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements e {
    @Override // com.waze.system.e
    public final void a(Context context) {
        x.f(context, "context");
        Intent intent = new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY");
        intent.setFlags(268435456);
        context.startActivity(intent);
    }
}
