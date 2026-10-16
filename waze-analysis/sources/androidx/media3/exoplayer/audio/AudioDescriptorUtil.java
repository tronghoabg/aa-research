package androidx.media3.exoplayer.audio;

import android.media.AudioDescriptor;
import android.os.Build;
import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.d.d.bn;
import com.waze.sound.fl$$ExternalSyntheticApiModelOutline1;
import j$.util.Comparator;
import j$.util.List;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class AudioDescriptorUtil {
    static final String TAG = "AudioDescriptorUtil";

    private AudioDescriptorUtil() {
    }

    public static bn<Integer> getAllChannelMasksFromSadbs(List<AudioDescriptor> list) {
        if (Build.VERSION.SDK_INT < 34 || list == null) {
            return bn.p();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<AudioDescriptor> it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorM29263m = fl$$ExternalSyntheticApiModelOutline1.m29263m((Object) it.next());
            if (audioDescriptorM29263m.getStandard() == 2) {
                byte[] descriptor = audioDescriptorM29263m.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    Log.w(TAG, "Invalid SADB length: " + length);
                } else {
                    arrayList.add(Integer.valueOf(getChannelMaskFromSadb(descriptor)));
                }
            }
        }
        List.EL.sort(arrayList, new Comparator() { // from class: androidx.media3.exoplayer.audio.AudioDescriptorUtil$$ExternalSyntheticLambda0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AudioDescriptorUtil.lambda$getAllChannelMasksFromSadbs$0((Integer) obj, (Integer) obj2);
            }
        });
        return bn.n(arrayList);
    }

    public static bn<Integer> getAllLpcmChannelMasksFromPcmSads(java.util.List<AudioDescriptor> list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            return bn.p();
        }
        TreeSet treeSet = new TreeSet(Comparator.EL.reversed(Comparator.CC.comparing(new Function() { // from class: androidx.media3.exoplayer.audio.AudioDescriptorUtil$$ExternalSyntheticLambda1
            public /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(Integer.bitCount(((Integer) obj).intValue()));
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })));
        Iterator<AudioDescriptor> it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor audioDescriptorM29263m = fl$$ExternalSyntheticApiModelOutline1.m29263m((Object) it.next());
            if (audioDescriptorM29263m.getStandard() == 1) {
                byte[] descriptor = audioDescriptorM29263m.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    Log.w(TAG, "Invalid SAD length: " + length);
                } else {
                    byte b2 = descriptor[0];
                    int i2 = (b2 & 7) + 1;
                    if (((b2 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(Util.getAudioTrackChannelConfig(i2)));
                    }
                }
            }
        }
        return bn.n(treeSet);
    }

    static int getChannelMaskFromSadb(byte[] bArr) {
        if (Build.VERSION.SDK_INT >= 34 && bArr.length == 3) {
            byte b2 = bArr[0];
            i = 1 == (b2 & 1) ? 12 : 0;
            if ((b2 & 2) != 0) {
                i |= 32;
            }
            if ((b2 & 4) != 0) {
                i |= 16;
            }
            if ((b2 & 8) != 0) {
                i |= 192;
            }
            if ((b2 & StylePropertiesKt.BottomId) != 0) {
                i |= 1024;
            }
            if ((b2 & StylePropertiesKt.ZIndexId) != 0) {
                i |= 768;
            }
            if ((b2 & 128) != 0) {
                i |= 201326592;
            }
            byte b3 = bArr[1];
            if ((b3 & 1) != 0) {
                i |= 81920;
            }
            if ((b3 & 2) != 0) {
                i |= 8192;
            }
            if ((b3 & 4) != 0) {
                i |= 32768;
            }
            if ((b3 & 8) != 0) {
                i |= 6144;
            }
            if ((b3 & StylePropertiesKt.BottomId) != 0) {
                i |= GroupFlagsKt.HasAuxSlotFlag;
            }
            if ((b3 & StylePropertiesKt.ZIndexId) != 0) {
                i |= 262144;
            }
            if ((b3 & 64) != 0) {
                i |= 6144;
            }
            if ((b3 & 128) != 0) {
                i |= 3145728;
            }
            byte b4 = bArr[2];
            if ((b4 & 1) != 0) {
                i |= 655360;
            }
            if ((b4 & 2) != 0) {
                i |= 8388608;
            }
            if ((b4 & 4) != 0) {
                return 20971520 | i;
            }
        }
        return i;
    }

    static /* synthetic */ int lambda$getAllChannelMasksFromSadbs$0(Integer num, Integer num2) {
        return Integer.bitCount(num2.intValue()) - Integer.bitCount(num.intValue());
    }
}
