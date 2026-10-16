package com.google.android.gms.internal.p002firebaseauthapi;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n7.AbstractC3601f;

/* loaded from: classes.dex */
public final class zzahq {
    private List<String> zza;

    public zzahq() {
        this(null);
    }

    public static zzahq zza() {
        return new zzahq(null);
    }

    public final List<String> zzb() {
        return this.zza;
    }

    private zzahq(List<String> list) {
        this.zza = new ArrayList();
    }

    public zzahq(int i5, List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                list.set(i10, AbstractC3601f.a(list.get(i10)));
            }
            this.zza = DesugarCollections.unmodifiableList(list);
            return;
        }
        this.zza = Collections.EMPTY_LIST;
    }
}
