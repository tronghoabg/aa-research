package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes3.dex */
public final class zzbgc {
    private final int zza;
    private final zzbfz zzb = new zzbge();

    public zzbgc(int i5) {
        this.zza = i5;
    }

    public final String zza(ArrayList arrayList) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            sb2.append(((String) arrayList.get(i5)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] strArrSplit = sb2.toString().split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        zzbgb zzbgbVar = new zzbgb();
        int i10 = this.zza;
        PriorityQueue priorityQueue = new PriorityQueue(i10, new zzbga(this));
        for (String str : strArrSplit) {
            String[] strArrZzb = zzbgd.zzb(str, false);
            if (strArrZzb.length != 0) {
                zzbgg.zza(strArrZzb, i10, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbgbVar.zzb.write(this.zzb.zza(((zzbgf) it.next()).zzb));
            } catch (IOException e7) {
                int i11 = G6.L.f4523b;
                H6.l.d("Error while writing hash to byteStream", e7);
            }
        }
        return zzbgbVar.toString();
    }
}
