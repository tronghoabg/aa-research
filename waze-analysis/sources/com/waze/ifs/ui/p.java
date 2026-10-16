package com.waze.ifs.ui;

import android.widget.Filter;
import android.widget.Filterable;
import com.waze.settings.gw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class p extends u implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    gw[] f24568a;

    /* renamed from: b, reason: collision with root package name */
    gw f24569b;

    public final int a(gw gwVar) {
        int i2 = 0;
        while (true) {
            gw[] gwVarArr = this.f24568a;
            if (i2 >= gwVarArr.length) {
                return -1;
            }
            if (gwVarArr[i2] == gwVar) {
                return i2;
            }
            i2++;
        }
    }

    @Override // com.waze.ifs.ui.u
    public final void b(gw[] gwVarArr) {
        this.f24568a = gwVarArr;
        super.b(gwVarArr);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        return new o(this);
    }
}
