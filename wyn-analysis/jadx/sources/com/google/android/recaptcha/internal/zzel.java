package com.google.android.recaptcha.internal;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import ff.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzel {

    @NotNull
    private final Map zza = new LinkedHashMap();

    @NotNull
    private final Set zzb = new LinkedHashSet();

    private final List zzh(List list) {
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzrr) it.next()));
        }
        return arrayList;
    }

    @Nullable
    public final Object zza(@NotNull zzrr zzrrVar) throws zzby {
        int iZzQ = zzrrVar.zzQ();
        int i5 = iZzQ - 1;
        if (iZzQ == 0) {
            throw null;
        }
        switch (i5) {
            case 0:
                return this.zza.get(Integer.valueOf(zzrrVar.zzi()));
            case 1:
                return Boolean.valueOf(zzrrVar.zzO());
            case 2:
                byte[] bArrZzl = zzrrVar.zzK().zzl();
                if (bArrZzl.length == 1) {
                    return Byte.valueOf(bArrZzl[0]);
                }
                throw new zzby(4, 6, null);
            case 3:
                String strZzM = zzrrVar.zzM();
                if (strZzM.length() == 1) {
                    return Character.valueOf(strZzM.charAt(0));
                }
                throw new zzby(4, 6, null);
            case 4:
                int iZzj = zzrrVar.zzj();
                if (iZzj < -32768 || iZzj > 32767) {
                    throw new zzby(4, 6, null);
                }
                return Short.valueOf((short) iZzj);
            case 5:
                return Integer.valueOf(zzrrVar.zzk());
            case 6:
            case 8:
                throw new zzby(4, 6, null);
            case 7:
                return Long.valueOf(zzrrVar.zzJ());
            case 9:
                return Float.valueOf(zzrrVar.zzg());
            case 10:
                return Double.valueOf(zzrrVar.zzf());
            case 11:
                return zzrrVar.zzN();
            case 12:
                return null;
            default:
                throw new zzby(4, 5, null);
        }
    }

    @Nullable
    public final Object zzb(int i5) {
        return this.zza.remove(Integer.valueOf(i5));
    }

    public final void zzc() {
        this.zza.clear();
    }

    public final void zzd(int i5, @Nullable Object obj) {
        zze(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, obj);
        this.zzb.add(Integer.valueOf(TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173));
    }

    public final void zze(int i5, @Nullable Object obj) {
        this.zza.put(Integer.valueOf(i5), obj);
    }

    @NotNull
    public final Class[] zzf(@NotNull List list) {
        List listZzh = zzh(list);
        ArrayList arrayList = new ArrayList(p.a0(listZzh, 10));
        Iterator it = listZzh.iterator();
        while (it.hasNext()) {
            arrayList.add(zzej.zza(it.next()));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    @NotNull
    public final Object[] zzg(@NotNull List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
