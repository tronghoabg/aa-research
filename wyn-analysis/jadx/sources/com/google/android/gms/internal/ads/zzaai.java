package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes3.dex */
final /* synthetic */ class zzaai implements Comparator {
    static final /* synthetic */ zzaai zza = new zzaai();

    private /* synthetic */ zzaai() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Integer num = (Integer) obj2;
        Integer num2 = (Integer) obj;
        int i5 = zzaaz.zzb;
        if (num2.intValue() == -1) {
            return num.intValue() == -1 ? 0 : -1;
        }
        if (num.intValue() == -1) {
            return 1;
        }
        return num2.intValue() - num.intValue();
    }
}
