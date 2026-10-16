package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class zzul {
    public final int zza;
    public final zzxl zzb;
    private final CopyOnWriteArrayList zzc;

    private zzul(CopyOnWriteArrayList copyOnWriteArrayList, int i5, zzxl zzxlVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzxlVar;
    }

    public final zzul zza(int i5, zzxl zzxlVar) {
        return new zzul(this.zzc, 0, zzxlVar);
    }

    public final void zzb(Handler handler, zzum zzumVar) {
        this.zzc.add(new zzuk(handler, zzumVar));
    }

    public final void zzc(zzum zzumVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zzuk zzukVar = (zzuk) it.next();
            if (zzukVar.zza == zzumVar) {
                copyOnWriteArrayList.remove(zzukVar);
            }
        }
    }

    public zzul() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
