package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbfo {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final boolean zza(zzbfn zzbfnVar) {
        synchronized (this.zzb) {
            try {
                return this.zzc.contains(zzbfnVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(zzbfn zzbfnVar) {
        synchronized (this.zzb) {
            try {
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    zzbfn zzbfnVar2 = (zzbfn) it.next();
                    C6.n nVar = C6.n.f1857D;
                    if (((G6.O) nVar.f1868h.zzp()).o()) {
                        if (!((G6.O) nVar.f1868h.zzp()).p() && !zzbfnVar.equals(zzbfnVar2) && zzbfnVar2.zzc().equals(zzbfnVar.zzc())) {
                            it.remove();
                            return true;
                        }
                    } else if (!zzbfnVar.equals(zzbfnVar2) && zzbfnVar2.zzb().equals(zzbfnVar.zzb())) {
                        it.remove();
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzc(zzbfn zzbfnVar) {
        synchronized (this.zzb) {
            try {
                List list = this.zzc;
                if (list.size() >= 10) {
                    int size = list.size();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 30);
                    sb2.append("Queue is full, current size = ");
                    sb2.append(size);
                    String string = sb2.toString();
                    int i5 = G6.L.f4523b;
                    H6.l.a(string);
                    list.remove(0);
                }
                int i10 = this.zza;
                this.zza = i10 + 1;
                zzbfnVar.zzk(i10);
                zzbfnVar.zzh();
                list.add(zzbfnVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
