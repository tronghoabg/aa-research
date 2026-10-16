package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
final /* synthetic */ class zzzz implements Comparator {
    static final /* synthetic */ zzzz zza = new zzzz();

    private /* synthetic */ zzzz() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return ((zzzy) Collections.max((List) obj)).compareTo((zzzy) Collections.max((List) obj2));
    }
}
