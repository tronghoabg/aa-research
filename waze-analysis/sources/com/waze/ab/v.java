package com.waze.ab;

import android.content.Context;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class v extends com.waze.sharedui.d.b {
    public v(Context context, String str, int i2, boolean z) {
        super(context, com.waze.shared_infra.o.b.a().b(str), i2, z);
    }

    @Override // com.waze.sharedui.d.b
    protected final boolean a() {
        Context context = this.f38855a;
        return (context == null || !(context instanceof com.waze.ifs.ui.a)) ? super.a() : ((com.waze.ifs.ui.a) context).bs();
    }
}
