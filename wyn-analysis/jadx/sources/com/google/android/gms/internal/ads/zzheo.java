package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class zzheo {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzhen zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzhen zzhenVar = (zzhen) it.next();
            if (zzhenVar.zza()) {
                return zzhenVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
