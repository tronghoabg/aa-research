package com.waze.ifs.ui;

import android.widget.Filter;
import android.widget.Filterable;
import com.waze.settings.gw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r extends v implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    gw[] f24571a;

    @Override // com.waze.ifs.ui.v, com.waze.ifs.ui.u
    public final void b(gw[] gwVarArr) {
        this.f24571a = gwVarArr;
        super.b(gwVarArr);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new q(this);
    }
}
