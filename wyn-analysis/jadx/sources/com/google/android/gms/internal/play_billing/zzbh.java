package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import org.apache.tika.fork.ForkServer;

/* loaded from: classes4.dex */
final class zzbh implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzbq zzbqVar = (zzbq) obj;
        zzbq zzbqVar2 = (zzbq) obj2;
        zzbg zzbgVar = new zzbg(zzbqVar);
        zzbg zzbgVar2 = new zzbg(zzbqVar2);
        while (zzbgVar.hasNext() && zzbgVar2.hasNext()) {
            int iCompareTo = Integer.valueOf(zzbgVar.zza() & ForkServer.ERROR).compareTo(Integer.valueOf(zzbgVar2.zza() & ForkServer.ERROR));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(zzbqVar.zzd()).compareTo(Integer.valueOf(zzbqVar2.zzd()));
    }
}
