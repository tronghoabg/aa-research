package com.google.android.gms.internal.ads;

import D6.x1;
import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzflm {
    public static x1 zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfko zzfkoVar = (zzfko) it.next();
            if (zzfkoVar.zzc) {
                arrayList.add(AdSize.f26291m);
            } else {
                arrayList.add(new AdSize(zzfkoVar.zza, zzfkoVar.zzb));
            }
        }
        return new x1(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfko zzb(x1 x1Var) {
        return x1Var.f2538i ? new zzfko(-3, 0, true) : new zzfko(x1Var.f2534e, x1Var.f2531b, false);
    }
}
