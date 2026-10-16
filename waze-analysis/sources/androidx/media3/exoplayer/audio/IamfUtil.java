package androidx.media3.exoplayer.audio;

import android.os.Build;
import androidx.media3.common.util.Log;
import com.google.d.d.ci;
import com.waze.strings.DisplayStrings;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class IamfUtil {
    private static final int CHANNEL_OUT_IAMF_3POINT1POINT2 = 81980;
    private static final int CHANNEL_OUT_IAMF_7POINT1POINT2 = 88316;
    private static final int CHANNEL_OUT_IAMF_9POINT1POINT4 = 744444;
    private static final int CHANNEL_OUT_IAMF_9POINT1POINT6 = 3890172;
    private static final int CHANNEL_OUT_ITU_2051_SOUND_SYSTEM_C_2_5_0 = 82172;
    private static final int CHANNEL_OUT_ITU_2051_SOUND_SYSTEM_E_4_5_1 = 9126140;
    public static final int CHANNEL_OUT_ITU_2051_SOUND_SYSTEM_H_9_10_3 = 67108860;
    public static final ci<Integer> IAMF_SUPPORTED_CHANNEL_MASKS;
    private static final int ITU_2051_SOUND_SYSTEM_F_3_7_0 = 33904892;
    public static final int OUTPUT_LAYOUT_BINAURAL = 14;
    public static final int OUTPUT_LAYOUT_IAMF_SOUND_SYSTEM_EXTENSION_0_1_0 = 12;
    public static final int OUTPUT_LAYOUT_IAMF_SOUND_SYSTEM_EXTENSION_2_3_0 = 11;
    public static final int OUTPUT_LAYOUT_IAMF_SOUND_SYSTEM_EXTENSION_2_7_0 = 10;
    public static final int OUTPUT_LAYOUT_IAMF_SOUND_SYSTEM_EXTENSION_6_9_0 = 13;
    public static final int OUTPUT_LAYOUT_ITU2051_SOUND_SYSTEM_A_0_2_0 = 0;
    public static final int OUTPUT_LAYOUT_ITU2051_SOUND_SYSTEM_B_0_5_0 = 1;
    public static final int OUTPUT_LAYOUT_ITU2051_SOUND_SYSTEM_C_2_5_0 = 2;
    public static final int OUTPUT_LAYOUT_ITU2051_SOUND_SYSTEM_D_4_5_0 = 3;
    public static final int OUTPUT_LAYOUT_ITU2051_SOUND_SYSTEM_E_4_5_1 = 4;
    public static final int OUTPUT_LAYOUT_ITU2051_SOUND_SYSTEM_F_3_7_0 = 5;
    public static final int OUTPUT_LAYOUT_ITU2051_SOUND_SYSTEM_G_4_9_0 = 6;
    public static final int OUTPUT_LAYOUT_ITU2051_SOUND_SYSTEM_H_9_10_3 = 7;
    public static final int OUTPUT_LAYOUT_ITU2051_SOUND_SYSTEM_I_0_7_0 = 8;
    public static final int OUTPUT_LAYOUT_ITU2051_SOUND_SYSTEM_J_4_7_0 = 9;
    public static final int OUTPUT_LAYOUT_UNSET = -1;
    public static final long REQUESTED_MIX_PRESENTATION_ID_UNSET = -1;
    private static final String TAG = "IamfUtil";

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputLayout {
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        Integer numValueOf = Integer.valueOf(DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5);
        IAMF_SUPPORTED_CHANNEL_MASKS = i2 < 32 ? ci.s(12, numValueOf, 6396, 4) : ci.u(12, numValueOf, 6396, 4, 3145980, Integer.valueOf(CHANNEL_OUT_ITU_2051_SOUND_SYSTEM_C_2_5_0), 737532, Integer.valueOf(CHANNEL_OUT_ITU_2051_SOUND_SYSTEM_E_4_5_1), Integer.valueOf(ITU_2051_SOUND_SYSTEM_F_3_7_0), 202070268, Integer.valueOf(CHANNEL_OUT_IAMF_9POINT1POINT4), Integer.valueOf(CHANNEL_OUT_ITU_2051_SOUND_SYSTEM_H_9_10_3), 743676, 3152124, Integer.valueOf(CHANNEL_OUT_IAMF_7POINT1POINT2), Integer.valueOf(CHANNEL_OUT_IAMF_3POINT1POINT2), 205215996, Integer.valueOf(CHANNEL_OUT_IAMF_9POINT1POINT6));
    }

    private IamfUtil() {
    }

    public static int getChannelMaskForOutputLayout(int i2) {
        if (i2 == 0) {
            return 12;
        }
        if (i2 == 1) {
            return DisplayStrings.DS_TRIP_OVERVIEW_PERSONALIZATION_LOADER_MESSAGE_ENDPOINT_NEW_USER_5;
        }
        if (i2 == 8) {
            return 6396;
        }
        if (i2 == 12) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 32) {
            switch (i2) {
                case 2:
                    return CHANNEL_OUT_ITU_2051_SOUND_SYSTEM_C_2_5_0;
                case 3:
                    return 737532;
                case 4:
                    return CHANNEL_OUT_ITU_2051_SOUND_SYSTEM_E_4_5_1;
                case 5:
                    return ITU_2051_SOUND_SYSTEM_F_3_7_0;
                case 6:
                    return CHANNEL_OUT_IAMF_9POINT1POINT4;
                case 7:
                    return CHANNEL_OUT_ITU_2051_SOUND_SYSTEM_H_9_10_3;
                case 9:
                    return 743676;
                case 10:
                    return CHANNEL_OUT_IAMF_7POINT1POINT2;
                case 11:
                    return CHANNEL_OUT_IAMF_3POINT1POINT2;
                case 13:
                    return CHANNEL_OUT_IAMF_9POINT1POINT6;
            }
        }
        throw new IllegalArgumentException("Unsupported output layout: " + i2);
    }

    private static int getFirstCompatibleChannelMask(List<Integer> list) {
        for (Integer num : list) {
            int iIntValue = num.intValue();
            if (IAMF_SUPPORTED_CHANNEL_MASKS.contains(num)) {
                return iIntValue;
            }
        }
        return 0;
    }

    public static int getOutputChannelMaskForCurrentConfiguration(AudioCapabilities audioCapabilities) {
        int firstCompatibleChannelMask = getFirstCompatibleChannelMask(audioCapabilities.getSpatializerChannelMasks());
        if (firstCompatibleChannelMask != 0) {
            return firstCompatibleChannelMask;
        }
        int firstCompatibleChannelMask2 = getFirstCompatibleChannelMask(audioCapabilities.getSpeakerLayoutChannelMasks());
        if (firstCompatibleChannelMask2 != 0) {
            return firstCompatibleChannelMask2;
        }
        return 12;
    }

    public static int getOutputLayoutForChannelMask(int i2) {
        if (i2 == 4) {
            return 12;
        }
        if (i2 == 12) {
            return 0;
        }
        if (i2 == 252) {
            return 1;
        }
        if (i2 == 6396) {
            return 8;
        }
        if (Build.VERSION.SDK_INT >= 32) {
            switch (i2) {
                case CHANNEL_OUT_IAMF_3POINT1POINT2 /* 81980 */:
                    return 11;
                case CHANNEL_OUT_ITU_2051_SOUND_SYSTEM_C_2_5_0 /* 82172 */:
                case 3145980:
                    return 2;
                case CHANNEL_OUT_IAMF_7POINT1POINT2 /* 88316 */:
                case 3152124:
                    return 10;
                case 737532:
                    return 3;
                case 743676:
                    return 9;
                case CHANNEL_OUT_IAMF_9POINT1POINT4 /* 744444 */:
                case 202070268:
                    return 6;
                case CHANNEL_OUT_IAMF_9POINT1POINT6 /* 3890172 */:
                case 205215996:
                    return 13;
                case CHANNEL_OUT_ITU_2051_SOUND_SYSTEM_E_4_5_1 /* 9126140 */:
                    return 4;
                case ITU_2051_SOUND_SYSTEM_F_3_7_0 /* 33904892 */:
                    return 5;
                case CHANNEL_OUT_ITU_2051_SOUND_SYSTEM_H_9_10_3 /* 67108860 */:
                    return 7;
            }
        }
        throw new IllegalArgumentException("Unsupported channel mask: " + i2);
    }

    public static int getOutputLayoutForCurrentConfiguration(AudioCapabilities audioCapabilities, boolean z) {
        if (!audioCapabilities.getSpatializerChannelMasks().isEmpty()) {
            if (z) {
                return 14;
            }
            int firstCompatibleChannelMask = getFirstCompatibleChannelMask(audioCapabilities.getSpatializerChannelMasks());
            if (firstCompatibleChannelMask != 0) {
                return getOutputLayoutForChannelMask(firstCompatibleChannelMask);
            }
            Log.w(TAG, "No spatializer channel mask is compatible with IAMF, falling back to speaker layout.");
        }
        int firstCompatibleChannelMask2 = getFirstCompatibleChannelMask(audioCapabilities.getSpeakerLayoutChannelMasks());
        if (firstCompatibleChannelMask2 != 0) {
            return getOutputLayoutForChannelMask(firstCompatibleChannelMask2);
        }
        return 0;
    }
}
