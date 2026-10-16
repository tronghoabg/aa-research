package androidx.media3.exoplayer.audio;

import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.d.d.bn;
import com.waze.sound.fl$$ExternalSyntheticApiModelOutline1;
import j$.util.Comparator;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class SpeakerLayoutUtil {
    private static final bn<Integer> DEFAULT_CHANNEL_MASK = bn.q(12);
    private static final String TAG = "SpeakerLayoutUtil";

    private SpeakerLayoutUtil() {
    }

    private static bn<Integer> getChannelMasksForBluetooth() {
        return DEFAULT_CHANNEL_MASK;
    }

    private static bn<Integer> getChannelMasksForBuiltInSpeakers(AudioDeviceInfo audioDeviceInfo) {
        int speakerLayoutChannelMask;
        if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
            return bn.q(Integer.valueOf(speakerLayoutChannelMask));
        }
        Log.w(TAG, "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
        return DEFAULT_CHANNEL_MASK;
    }

    private static bn<Integer> getChannelMasksForHdmiArc(AudioDeviceInfo audioDeviceInfo) {
        bn<Integer> channelMasksFromPcmAudioProfiles = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
        if (!channelMasksFromPcmAudioProfiles.isEmpty()) {
            return channelMasksFromPcmAudioProfiles;
        }
        bn<Integer> allLpcmChannelMasksFromPcmSads = AudioDescriptorUtil.getAllLpcmChannelMasksFromPcmSads(audioDeviceInfo.getAudioDescriptors());
        return !allLpcmChannelMasksFromPcmSads.isEmpty() ? allLpcmChannelMasksFromPcmSads : DEFAULT_CHANNEL_MASK;
    }

    private static bn<Integer> getChannelMasksForHdmiEarc(AudioDeviceInfo audioDeviceInfo) {
        bn<Integer> channelMasksFromPcmAudioProfiles = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
        if (!channelMasksFromPcmAudioProfiles.isEmpty()) {
            return channelMasksFromPcmAudioProfiles;
        }
        List audioDescriptors = audioDeviceInfo.getAudioDescriptors();
        if (Build.VERSION.SDK_INT >= 34) {
            bn<Integer> allChannelMasksFromSadbs = AudioDescriptorUtil.getAllChannelMasksFromSadbs(audioDescriptors);
            if (!allChannelMasksFromSadbs.isEmpty()) {
                return allChannelMasksFromSadbs;
            }
        }
        bn<Integer> allLpcmChannelMasksFromPcmSads = AudioDescriptorUtil.getAllLpcmChannelMasksFromPcmSads(audioDescriptors);
        return !allLpcmChannelMasksFromPcmSads.isEmpty() ? allLpcmChannelMasksFromPcmSads : DEFAULT_CHANNEL_MASK;
    }

    private static bn<Integer> getChannelMasksForUsb(AudioDeviceInfo audioDeviceInfo) {
        bn<Integer> channelMasksFromPcmAudioProfiles = getChannelMasksFromPcmAudioProfiles(audioDeviceInfo);
        return !channelMasksFromPcmAudioProfiles.isEmpty() ? channelMasksFromPcmAudioProfiles : DEFAULT_CHANNEL_MASK;
    }

    private static bn<Integer> getChannelMasksFromPcmAudioProfiles(AudioDeviceInfo audioDeviceInfo) {
        List audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.EL.reversed(Comparator.CC.comparing(new Function() { // from class: androidx.media3.exoplayer.audio.SpeakerLayoutUtil$$ExternalSyntheticLambda0
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
        Iterator it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile audioProfileM29264m = fl$$ExternalSyntheticApiModelOutline1.m29264m(it.next());
            if (audioProfileM29264m.getEncapsulationType() != 1 && Util.isEncodingLinearPcm(audioProfileM29264m.getFormat())) {
                for (int i2 : audioProfileM29264m.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i2));
                }
            }
        }
        return bn.n(treeSet);
    }

    public static bn<Integer> getLoudspeakerLayoutChannelMasks(AudioDeviceInfo audioDeviceInfo) {
        return DeviceTypeUtil.isBluetoothDevice(audioDeviceInfo.getType()) ? getChannelMasksForBluetooth() : DeviceTypeUtil.isBuiltInEarpiece(audioDeviceInfo.getType()) ? bn.q(4) : DeviceTypeUtil.isBuiltInSpeaker(audioDeviceInfo.getType()) ? getChannelMasksForBuiltInSpeakers(audioDeviceInfo) : (Build.VERSION.SDK_INT < 31 || !DeviceTypeUtil.isHdmiArc(audioDeviceInfo.getType())) ? (Build.VERSION.SDK_INT < 31 || !DeviceTypeUtil.isHdmiEarc(audioDeviceInfo.getType())) ? (Build.VERSION.SDK_INT < 31 || !DeviceTypeUtil.isUsbDevice(audioDeviceInfo.getType())) ? DEFAULT_CHANNEL_MASK : getChannelMasksForUsb(audioDeviceInfo) : getChannelMasksForHdmiEarc(audioDeviceInfo) : getChannelMasksForHdmiArc(audioDeviceInfo);
    }
}
