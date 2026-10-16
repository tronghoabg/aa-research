package com.waze.ifs.ui;

import android.widget.Filter;
import com.waze.settings.gw;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class q extends Filter {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f24570a;

    q(r rVar) {
        Objects.requireNonNull(rVar);
        this.f24570a = rVar;
    }

    @Override // android.widget.Filter
    protected final Filter.FilterResults performFiltering(CharSequence charSequence) {
        int i2;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        r rVar = this.f24570a;
        gw[] gwVarArr = new gw[rVar.f24571a.length];
        Locale localeD = ((com.waze.sharedui.m) com.waze.web.r.h(com.waze.sharedui.m.class)).d();
        String lowerCase = charSequence.toString().toLowerCase(localeD);
        int i3 = 0;
        int i4 = 0;
        for (gw gwVar : rVar.f24571a) {
            float fA = w.a(gwVar.f37350c.toLowerCase(localeD), lowerCase);
            gwVar.f37353f = fA;
            if (fA >= 1.0f || gwVar.f37354g) {
                gwVarArr[i4] = gwVar;
                i4++;
            }
        }
        gw[] gwVarArr2 = (gw[]) Arrays.copyOf(gwVarArr, i4);
        rVar.g(gwVarArr2);
        gw[] gwVarArr3 = new gw[gwVarArr2.length];
        int i5 = 0;
        while (true) {
            int length = gwVarArr2.length;
            if (i3 >= length) {
                gw[] gwVarArr4 = (gw[]) Arrays.copyOf(gwVarArr3, i5);
                rVar.g(gwVarArr4);
                filterResults.count = gwVarArr4.length;
                filterResults.values = gwVarArr4;
                return filterResults;
            }
            int i6 = i3 + 1;
            gw gwVar2 = gwVarArr2[i3];
            if (gwVar2.f37353f >= 1.0f) {
                i2 = i5 + 1;
                gwVarArr3[i5] = gwVar2;
            } else if (!gwVar2.f37354g || i3 >= length - 1 || gwVarArr2[i6].f37354g) {
                i3 = i6;
            } else {
                i2 = i5 + 1;
                gwVarArr3[i5] = gwVar2;
            }
            i5 = i2;
            i3 = i6;
        }
    }

    @Override // android.widget.Filter
    protected final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        gw[] gwVarArr = (gw[]) filterResults.values;
        r rVar = this.f24570a;
        rVar.f24580e = gwVarArr;
        rVar.notifyDataSetChanged();
    }
}
