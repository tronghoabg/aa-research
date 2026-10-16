package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzbcp extends zzbdm {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzbcp(zzbbz zzbbzVar, String str, String str2, zzaxt zzaxtVar, int i5, int i10) {
        super(zzbbzVar, "c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", zzaxtVar, i5, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzbdm
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, new Object[0]);
                    }
                } finally {
                }
            }
        }
        zzaxt zzaxtVar = this.zzd;
        synchronized (zzaxtVar) {
            zzaxtVar.zzB(zzh.longValue());
        }
    }
}
