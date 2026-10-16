package com.google.android.gms.internal.ads;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzfwg implements zzfwe {
    private final zzfwe zza;

    public zzfwg(zzfwe zzfweVar) {
        this.zza = zzfweVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final JSONObject zza(View view) throws JSONException {
        JSONObject jSONObjectZzb = zzfwo.zzb(0, 0, 0, 0);
        int iZzb = zzfwr.zzb();
        int i5 = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZzb.put("noOutputDevice", i5 == 0);
            return jSONObjectZzb;
        } catch (JSONException e7) {
            zzfwp.zza("Error with setting output device status", e7);
            return jSONObjectZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwe
    public final void zzb(View view, JSONObject jSONObject, zzfwd zzfwdVar, boolean z2, boolean z10) {
        ArrayList arrayList = new ArrayList();
        zzfvs zzfvsVarZza = zzfvs.zza();
        if (zzfvsVarZza != null) {
            Collection collectionZzf = zzfvsVarZza.zzf();
            int size = collectionZzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzf.iterator();
            while (it.hasNext()) {
                View viewZzi = ((zzfuy) it.next()).zzi();
                if (viewZzi != null && viewZzi.isAttachedToWindow() && viewZzi.isShown()) {
                    View view2 = viewZzi;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzi.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z11 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i5 = size2 - 1;
                                    if (((View) arrayList.get(i5)).getZ() <= z11) {
                                        break;
                                    } else {
                                        size2 = i5;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else {
                            if (view2.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                break;
                            }
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i10 = 0; i10 < size3; i10++) {
            zzfwdVar.zza((View) arrayList.get(i10), this.zza, jSONObject, z10);
        }
    }
}
