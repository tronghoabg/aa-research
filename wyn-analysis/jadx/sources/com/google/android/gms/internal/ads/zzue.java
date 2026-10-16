package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import j$.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* loaded from: classes3.dex */
final class zzue {
    private static final zzgwt zza = zzgwt.zzj(12);

    /* JADX WARN: Removed duplicated region for block: B:117:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzgwt zza(android.media.AudioDeviceInfo r10) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzue.zza(android.media.AudioDeviceInfo):com.google.android.gms.internal.ads.zzgwt");
    }

    private static zzgwt zzb(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.EL.reversed(Comparator.CC.comparing(zzud.zza)));
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile audioProfileC = V1.h.c(it.next());
            if (audioProfileC.getEncapsulationType() != 1 && zzfm.zzE(audioProfileC.getFormat())) {
                for (int i5 : audioProfileC.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i5));
                }
            }
        }
        return zzgwt.zzq(treeSet);
    }
}
