package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfwh implements zzfwe {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfwo.zzb(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return zzfwo.zzb(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final void zzb(View view, JSONObject jSONObject, zzfwd zzfwdVar, boolean z2, boolean z10) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z2) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    zzfwdVar.zza(viewGroup.getChildAt(i10), this, jSONObject, z10);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                View childAt = viewGroup.getChildAt(i11);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i12));
                int size2 = arrayList3.size();
                int i13 = 0;
                while (true) {
                    i5 = i12 + 1;
                    if (i13 < size2) {
                        zzfwdVar.zza((View) arrayList3.get(i13), this, jSONObject, z10);
                        i13++;
                    }
                }
                i12 = i5;
            }
        }
    }
}
