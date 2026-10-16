package com.google.android.recaptcha.internal;

import ff.m;
import ff.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzeu implements zzfe {

    @NotNull
    public static final zzeu zza = new zzeu();

    private zzeu() {
    }

    private static final boolean zzb(List list) {
        ArrayList arrayList = new ArrayList(p.a0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzrr) it.next()).zzP()));
        }
        return !arrayList.contains(Boolean.FALSE);
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i5, @NotNull zzek zzekVar, @NotNull zzrr... zzrrVarArr) throws zzby {
        if (!zzb(m.L0(zzrrVarArr))) {
            throw new zzby(4, 5, null);
        }
        for (zzrr zzrrVar : zzrrVarArr) {
            zzekVar.zzc().zzb(zzrrVar.zzi());
        }
    }
}
