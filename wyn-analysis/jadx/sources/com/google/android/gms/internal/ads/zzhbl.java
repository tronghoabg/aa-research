package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhay;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.logging.Level;

/* loaded from: classes3.dex */
abstract class zzhbl extends zzhay.zzf {
    private static final zzhbi zzbq;
    private static final zzhcn zzbr = new zzhcn(zzhbl.class);
    volatile int remainingField;
    volatile Set<Throwable> seenExceptionsField = null;

    static {
        Throwable th;
        zzhbi zzhbkVar;
        byte[] bArr = null;
        try {
            zzhbkVar = new zzhbj(bArr);
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzhbkVar = new zzhbk(bArr);
        }
        zzbq = zzhbkVar;
        if (th != null) {
            zzbr.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzhbl(int i5) {
        this.remainingField = i5;
    }

    public final Set zzB() {
        Set<Throwable> set = this.seenExceptionsField;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zzf(setNewSetFromMap);
        zzbq.zza(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptionsField;
        Objects.requireNonNull(set2);
        return set2;
    }

    public final int zzC() {
        return zzbq.zzb(this);
    }

    public abstract void zzf(Set set);
}
