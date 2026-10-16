package com.google.android.gms.internal.ads;

import android.media.AudioDescriptor;
import android.os.Build;
import cb.AbstractC1593a;
import j$.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class zzqs {
    public static zzgwt zza(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            return zzgwt.zzi();
        }
        TreeSet treeSet = new TreeSet(Comparator.EL.reversed(Comparator.CC.comparing(zzqr.zza)));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorF = ab.d.f(it.next());
            if (audioDescriptorF.getStandard() == 1) {
                byte[] descriptor = audioDescriptorF.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    AbstractC1593a.v(new StringBuilder(String.valueOf(length).length() + 20), "Invalid SAD length: ", length, "AudioDescriptorUtil");
                } else {
                    byte b5 = descriptor[0];
                    int i5 = (b5 & 7) + 1;
                    if (((b5 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(zzfm.zzG(i5)));
                    }
                }
            }
        }
        return zzgwt.zzq(treeSet);
    }
}
