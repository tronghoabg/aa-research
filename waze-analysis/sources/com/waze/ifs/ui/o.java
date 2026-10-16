package com.waze.ifs.ui;

import android.widget.Filter;
import com.waze.settings.gw;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class o extends Filter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f24567a;

    o(p pVar) {
        Objects.requireNonNull(pVar);
        this.f24567a = pVar;
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        int i2;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        p pVar = this.f24567a;
        gw[] gwVarArr = new gw[pVar.f24568a.length];
        Locale localeD = ((com.waze.sharedui.m) com.waze.web.r.h(com.waze.sharedui.m.class)).d();
        String lowerCase = charSequence.toString().toLowerCase(localeD);
        int i3 = 0;
        for (gw gwVar : pVar.f24568a) {
            if (gwVar == pVar.f24569b) {
                i2 = i3 + 1;
                gwVar.f37353f = 0.0f;
                gwVarArr[i3] = gwVar;
            } else {
                gwVar.f37353f = w.a(gwVar.f37350c.toLowerCase(localeD), lowerCase);
                String[] strArr = gwVar.f37355h;
                if (strArr != null) {
                    for (String str : strArr) {
                        float f2 = gwVar.f37353f;
                        if (f2 >= 2.0f) {
                            break;
                        }
                        if (str != null) {
                            gwVar.f37353f = Math.max(f2, w.a(str.toLowerCase(localeD), lowerCase));
                        }
                    }
                }
                if (gwVar.f37353f >= 1.0f) {
                    i2 = i3 + 1;
                    gwVarArr[i3] = gwVar;
                }
            }
            i3 = i2;
        }
        filterResults.count = i3;
        gw[] gwVarArr2 = (gw[]) Arrays.copyOf(gwVarArr, i3);
        Arrays.sort(gwVarArr2, new n(this));
        filterResults.values = gwVarArr2;
        return filterResults;
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        gw[] gwVarArr = (gw[]) filterResults.values;
        p pVar = this.f24567a;
        pVar.f24580e = gwVarArr;
        pVar.notifyDataSetChanged();
    }
}
