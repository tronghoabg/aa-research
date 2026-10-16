package com.google.android.gms.internal.ads;

import j$.util.Objects;
import n7.C3597b;

/* loaded from: classes3.dex */
final class zzfue implements Runnable {
    final /* synthetic */ zzful zza;

    public zzfue(zzful zzfulVar) {
        Objects.requireNonNull(zzfulVar);
        this.zza = zzfulVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzful zzfulVar = this.zza;
        if (zzfulVar.zzN() != null) {
            ((C3597b) zzfulVar.zzO()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iZzs = zzfulVar.zzs();
            String strZzM = zzfulVar.zzM();
            zzfulVar.zzN().zzj(jCurrentTimeMillis, zzfulVar.zzP(), iZzs, strZzM);
        }
    }
}
