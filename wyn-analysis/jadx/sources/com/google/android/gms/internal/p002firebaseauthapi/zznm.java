package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zznm {
    private ArrayList<zznp> zza = new ArrayList<>();
    private zzng zzb = zzng.zza;
    private Integer zzc = null;

    public final zznm zza(zzbr zzbrVar, int i5, String str, String str2) {
        ArrayList<zznp> arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zznp(zzbrVar, i5, str, str2));
        return this;
    }

    public final zznm zza(zzng zzngVar) {
        if (this.zza != null) {
            this.zzb = zzngVar;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    public final zznm zza(int i5) {
        if (this.zza != null) {
            this.zzc = Integer.valueOf(i5);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    public final zznn zza() throws GeneralSecurityException {
        if (this.zza != null) {
            Integer num = this.zzc;
            if (num != null) {
                int iIntValue = num.intValue();
                ArrayList<zznp> arrayList = this.zza;
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    zznp zznpVar = arrayList.get(i5);
                    i5++;
                    if (zznpVar.zza() == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            zznn zznnVar = new zznn(this.zzb, DesugarCollections.unmodifiableList(this.zza), this.zzc);
            this.zza = null;
            return zznnVar;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
