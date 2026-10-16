package com.google.android.recaptcha.internal;

import ff.m;
import ff.o;
import ff.v;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class zzgf {

    @NotNull
    private List zza = v.f35432a;

    public final long zza(@NotNull long[] jArr) {
        Iterator it = o.E0(m.K0(jArr), this.zza).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) it.next()).longValue() ^ ((Number) next).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(@NotNull long[] jArr) {
        this.zza = m.K0(jArr);
    }
}
