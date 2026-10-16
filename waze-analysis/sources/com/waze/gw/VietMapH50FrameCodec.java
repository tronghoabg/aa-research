package com.waze.gw;

import androidx.compose.foundation.style.StylePropertiesKt;
import androidx.media3.muxer.MuxerUtil;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes10.dex */
final class VietMapH50FrameCodec {
    static final int BLOCK_BYTES = 16;
    static final int COMMAND_IMAGE = 7;
    static final int COMMAND_LANE_INFO = 5;
    static final int COMMAND_LEFT_TYPE = 8;
    static final int COMMAND_NAVIGATION_ETA = 4;
    static final int COMMAND_NAVIGATION_INFO = 6;
    static final int COMMAND_QUERY_OBD = 36;
    static final int COMMAND_QUERY_SERIAL = 251;
    static final int COMMAND_QUERY_VERSION = 252;
    static final int COMMAND_SPEED_TWO = 2;
    static final int COMMAND_SYNC_TIME = 1;
    static final int COMMAND_UPCOMING_ALERT = 3;
    static final int MAX_U24 = 16777215;
    static final byte[] MAGIC = {-90, 106};
    static final byte[] FOOTER = {StylePropertiesKt.LeftId, 10};
    static final String AES_KEY_TEXT = "Walkiz52832iLock";
    private static final byte[] AES_KEY = AES_KEY_TEXT.getBytes(StandardCharsets.US_ASCII);
    static final String AES_IV_TEXT = "1234567890ABCDEF";
    private static final byte[] AES_IV = AES_IV_TEXT.getBytes(StandardCharsets.US_ASCII);

    private VietMapH50FrameCodec() {
    }

    static final class H50Frame {
        final int command;
        final int declaredLength;
        final int paddingLength;
        final byte[] payload;
        final long timestamp;

        H50Frame(long j2, int i2, int i3, byte[] bArr, int i4) {
            this.timestamp = j2;
            this.declaredLength = i2;
            this.command = i3;
            this.payload = (byte[]) bArr.clone();
            this.paddingLength = i4;
        }

        String commandName() {
            return VietMapH50FrameCodec.commandName(this.command);
        }

        byte[] payloadCopy() {
            return (byte[]) this.payload.clone();
        }
    }

    static final class AlertRecord {
        final int auxiliary;
        final int distanceM;
        final int type;

        AlertRecord(int i2, int i3, int i4) {
            VietMapH50FrameCodec.requireByte(i2, "alert type");
            VietMapH50FrameCodec.requireU24(i3, "alert distance");
            VietMapH50FrameCodec.requireByte(i4, "alert auxiliary");
            this.type = i2;
            this.distanceM = i3;
            this.auxiliary = i4;
        }
    }

    static final class SpeedTwoPayload {
        final int currentLimitKmh;
        final String currentRoadName;
        final int secondaryField1;
        final int secondaryField2;
        final int textFlag;

        SpeedTwoPayload(int i2, int i3, int i4, int i5, String str) {
            this.currentLimitKmh = i2;
            this.secondaryField1 = i3;
            this.secondaryField2 = i4;
            this.textFlag = i5;
            this.currentRoadName = str;
        }
    }

    static final class UpcomingAlertPayload {
        final AlertRecord first;
        final AlertRecord second;

        UpcomingAlertPayload(AlertRecord alertRecord, AlertRecord alertRecord2) {
            this.first = alertRecord;
            this.second = alertRecord2;
        }
    }

    static final class NavigationEtaPayload {
        final int etaHour;
        final int etaMinute;
        final int progress;
        final int remainingDistanceM;

        NavigationEtaPayload(int i2, int i3, int i4, int i5) {
            this.remainingDistanceM = i2;
            this.etaHour = i3;
            this.etaMinute = i4;
            this.progress = i5;
        }
    }

    static final class LaneInfoPayload {
        final int laneCount;
        final byte[] laneSlots;
        final boolean visible;

        LaneInfoPayload(boolean z, int i2, byte[] bArr) {
            this.visible = z;
            this.laneCount = i2;
            this.laneSlots = (byte[]) bArr.clone();
        }

        byte[] laneSlotsCopy() {
            return (byte[]) this.laneSlots.clone();
        }
    }

    static final class NavigationInfoPayload {
        final int distanceM;
        final int maneuver;
        final String roadName;
        final int textFlag;

        NavigationInfoPayload(int i2, int i3, int i4, String str) {
            this.maneuver = i2;
            this.distanceM = i3;
            this.textFlag = i4;
            this.roadName = str;
        }
    }

    static byte[] encodeFrame(int i2, byte[] bArr, long j2) {
        requireByte(i2, "command");
        if (bArr == null) {
            bArr = new byte[0];
        }
        long length = (bArr.length + 11 + 15) & (-16);
        if (length > 65535) {
            throw new IllegalArgumentException("H50 frame exceeds u16 length");
        }
        if (j2 < 0 || j2 > MuxerUtil.UNSIGNED_INT_MAX_VALUE) {
            throw new IllegalArgumentException("timestamp must fit u32");
        }
        int i3 = (int) length;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(MAGIC, 0, bArr2, 0, MAGIC.length);
        putU32(bArr2, 2, j2);
        putU16(bArr2, 6, i3);
        bArr2[8] = (byte) i2;
        System.arraycopy(bArr, 0, bArr2, 9, bArr.length);
        bArr2[bArr.length + 9] = FOOTER[0];
        bArr2[bArr.length + 10] = FOOTER[1];
        return bArr2;
    }

    static byte[] encodeFrame(int i2, byte[] bArr) {
        return encodeFrame(i2, bArr, System.currentTimeMillis() / 1000);
    }

    static byte[] encryptFrame(byte[] bArr) {
        requireCipherFrame(bArr, "plaintext");
        return crypt(1, bArr);
    }

    static byte[] decryptFrame(byte[] bArr) {
        requireCipherFrame(bArr, "ciphertext");
        return crypt(2, bArr);
    }

    static byte[] encodeEncryptedFrame(int i2, byte[] bArr, long j2) {
        return encryptFrame(encodeFrame(i2, bArr, j2));
    }

    static byte[] encodeEncryptedFrame(int i2, byte[] bArr) {
        return encryptFrame(encodeFrame(i2, bArr));
    }

    static H50Frame decodeEncryptedFrame(byte[] bArr) {
        return decodeFrame(decryptFrame(bArr));
    }

    static H50Frame decodeFrame(byte[] bArr) {
        if (bArr == null || bArr.length < 16) {
            throw new IllegalArgumentException("H50 frame is shorter than one block");
        }
        if (bArr.length % 16 != 0) {
            throw new IllegalArgumentException("H50 frame is not block aligned");
        }
        if (bArr[0] != MAGIC[0] || bArr[1] != MAGIC[1]) {
            throw new IllegalArgumentException("invalid H50 magic");
        }
        int iU16 = u16(bArr, 6);
        if (iU16 != bArr.length) {
            throw new IllegalArgumentException("declared H50 length does not match data");
        }
        int length = bArr.length - 9;
        while (length > 0 && bArr[(9 + length) - 1] == 0) {
            length--;
        }
        if (length >= 2) {
            int i2 = 9 + length;
            if (bArr[i2 - 2] == FOOTER[0] && bArr[i2 - 1] == FOOTER[1]) {
                return new H50Frame(u32(bArr, 2), iU16, bArr[8] & 255, Arrays.copyOfRange(bArr, 9, (length - 2) + 9), (bArr.length - 9) - length);
            }
        }
        throw new IllegalArgumentException("missing H50 footer before zero padding");
    }

    static String commandName(int i2) {
        int i3 = i2 & 255;
        switch (i3) {
            case 1:
                return "syncTime";
            case 2:
                return "sendSpeedTwo";
            case 3:
                return "upComingAlert";
            case 4:
                return "estNavigationInfo";
            case 5:
                return "sendLaneInfo";
            case 6:
                return "navigationInfo";
            case 7:
                return "sendImage";
            case 8:
                return "leftType";
            case 36:
                return "queryOBDVersion";
            case 251:
                return "querySerial";
            case 252:
                return "queryVersion";
            default:
                return String.format(Locale.US, "unknown_0x%02x", Integer.valueOf(i3));
        }
    }

    static byte[] buildSyncTimeFrame(long j2) {
        return encodeFrame(1, null, j2);
    }

    static byte[] buildSpeedTwoPayload(int i2, int i3, int i4, String str) {
        requireByte(i2, "current limit");
        requireByte(i3, "secondary field 1");
        requireByte(i4, "secondary field 2");
        if (str == null) {
            str = "";
        }
        byte[] bArrUtf8 = utf8(str);
        requireByte(bArrUtf8.length, "road name length");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArrUtf8.length + 5);
        byteArrayOutputStream.write(i2);
        byteArrayOutputStream.write(i3);
        byteArrayOutputStream.write(i4);
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(bArrUtf8.length);
        byteArrayOutputStream.write(bArrUtf8, 0, bArrUtf8.length);
        return byteArrayOutputStream.toByteArray();
    }

    static SpeedTwoPayload parseSpeedTwoPayload(byte[] bArr) {
        requireAtLeast(bArr, 5, 2);
        int i2 = bArr[4] & 255;
        if (i2 + 5 > bArr.length) {
            throw new IllegalArgumentException("truncated road name");
        }
        return new SpeedTwoPayload(bArr[0] & 255, bArr[1] & 255, bArr[2] & 255, bArr[3] & 255, new String(bArr, 5, i2, StandardCharsets.UTF_8));
    }

    static byte[] buildUpcomingAlertPayload(AlertRecord alertRecord, AlertRecord alertRecord2) {
        if (alertRecord == null) {
            alertRecord = new AlertRecord(0, 0, 0);
        }
        if (alertRecord2 == null) {
            alertRecord2 = new AlertRecord(0, 0, 0);
        }
        byte[] bArr = new byte[10];
        putAlert(bArr, 0, alertRecord);
        putAlert(bArr, 5, alertRecord2);
        return bArr;
    }

    static UpcomingAlertPayload parseUpcomingAlertPayload(byte[] bArr) {
        requireExact(bArr, 10, 3);
        return new UpcomingAlertPayload(parseAlert(bArr, 0), parseAlert(bArr, 5));
    }

    static byte[] buildNavigationEtaPayload(int i2, int i3, int i4, int i5) {
        requireU24(i2, "remaining distance");
        requireByte(i3, "ETA hour");
        requireByte(i4, "ETA minute");
        requireByte(i5, "progress");
        byte[] bArr = {0, 0, 0, (byte) i3, (byte) i4, (byte) i5};
        putU24(bArr, 0, i2);
        return bArr;
    }

    static NavigationEtaPayload parseNavigationEtaPayload(byte[] bArr) {
        requireExact(bArr, 6, 4);
        return new NavigationEtaPayload(u24(bArr, 0), bArr[3] & 255, bArr[4] & 255, bArr[5] & 255);
    }

    static byte[] buildLaneInfoPayload(byte[] bArr) {
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (bArr.length > 9) {
            throw new IllegalArgumentException("H50 supports at most 9 lanes");
        }
        byte[] bArr2 = new byte[11];
        bArr2[0] = (byte) (bArr.length == 0 ? 0 : 1);
        bArr2[1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr2, ((9 - bArr.length) / 2) + 2, bArr.length);
        return bArr2;
    }

    static LaneInfoPayload parseLaneInfoPayload(byte[] bArr) {
        requireAtLeast(bArr, 11, 5);
        return new LaneInfoPayload(bArr[0] != 0, bArr[1] & 255, Arrays.copyOfRange(bArr, 2, 11));
    }

    static byte[] buildNavigationInfoPayload(int i2, int i3, String str) {
        requireByte(i2, "maneuver");
        requireU24(i3, "turn distance");
        if (str == null) {
            str = "";
        }
        byte[] bArrUtf8 = utf8(str);
        requireByte(bArrUtf8.length, "road name length");
        byte[] bArr = new byte[bArrUtf8.length + 6];
        bArr[0] = (byte) i2;
        putU24(bArr, 1, i3);
        bArr[4] = 1;
        bArr[5] = (byte) bArrUtf8.length;
        System.arraycopy(bArrUtf8, 0, bArr, 6, bArrUtf8.length);
        return bArr;
    }

    static NavigationInfoPayload parseNavigationInfoPayload(byte[] bArr) {
        requireAtLeast(bArr, 6, 6);
        int i2 = bArr[5] & 255;
        if (i2 + 6 > bArr.length) {
            throw new IllegalArgumentException("truncated road name");
        }
        return new NavigationInfoPayload(bArr[0] & 255, u24(bArr, 1), bArr[4] & 255, new String(bArr, 6, i2, StandardCharsets.UTF_8));
    }

    static byte[] buildLeftTypePayload(int i2) {
        requireByte(i2, "left type");
        return new byte[]{(byte) i2};
    }

    static int parseLeftTypePayload(byte[] bArr) {
        requireAtLeast(bArr, 1, 8);
        return bArr[0] & 255;
    }

    static byte[] buildQueryFrame(int i2, long j2) {
        if (i2 != 251 && i2 != 252 && i2 != 36) {
            throw new IllegalArgumentException("not an H50 query command");
        }
        return encodeEncryptedFrame(i2, null, j2);
    }

    static byte[] buildSerialQueryFrame(long j2) {
        return buildQueryFrame(251, j2);
    }

    static byte[] buildVersionQueryFrame(long j2) {
        return buildQueryFrame(252, j2);
    }

    static byte[] buildObdQueryFrame(long j2) {
        return buildQueryFrame(36, j2);
    }

    static byte[] buildQueryResponsePayload(String str) {
        if (str == null) {
            str = "";
        }
        return utf8(str);
    }

    static String parseQueryResponsePayload(int i2, byte[] bArr) {
        if (i2 != 251 && i2 != 252 && i2 != 36) {
            throw new IllegalArgumentException("not an H50 query command");
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new String(bArr, StandardCharsets.UTF_8);
    }

    private static byte[] crypt(int i2, byte[] bArr) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
            cipher.init(i2, new SecretKeySpec(AES_KEY, "AES"), new IvParameterSpec(AES_IV));
            return cipher.doFinal(bArr);
        } catch (GeneralSecurityException e2) {
            throw new IllegalArgumentException("H50 AES operation failed", e2);
        }
    }

    private static void putAlert(byte[] bArr, int i2, AlertRecord alertRecord) {
        bArr[i2] = (byte) alertRecord.type;
        putU24(bArr, i2 + 1, alertRecord.distanceM);
        bArr[i2 + 4] = (byte) alertRecord.auxiliary;
    }

    private static AlertRecord parseAlert(byte[] bArr, int i2) {
        return new AlertRecord(bArr[i2] & 255, u24(bArr, i2 + 1), bArr[i2 + 4] & 255);
    }

    private static byte[] utf8(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    private static void requireCipherFrame(byte[] bArr, String str) {
        if (bArr == null || bArr.length == 0 || bArr.length % 16 != 0) {
            throw new IllegalArgumentException("H50 " + str + " must be non-empty and block aligned");
        }
    }

    private static void requireAtLeast(byte[] bArr, int i2, int i3) {
        if (bArr == null || bArr.length < i2) {
            throw new IllegalArgumentException(commandName(i3) + " payload is too short");
        }
    }

    private static void requireExact(byte[] bArr, int i2, int i3) {
        if (bArr == null || bArr.length != i2) {
            throw new IllegalArgumentException(commandName(i3) + " payload length mismatch");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void requireByte(int i2, String str) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException(str + " must fit u8");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void requireU24(int i2, String str) {
        if (i2 < 0 || i2 > 16777215) {
            throw new IllegalArgumentException(str + " must fit u24");
        }
    }

    private static int u16(byte[] bArr, int i2) {
        return (bArr[i2 + 1] & 255) | ((bArr[i2] & 255) << 8);
    }

    private static long u32(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 255) | ((bArr[i2] & 255) << 24) | ((bArr[i2 + 1] & 255) << 16) | ((bArr[i2 + 2] & 255) << 8);
    }

    private static int u24(byte[] bArr, int i2) {
        return (bArr[i2 + 2] & 255) | ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
    }

    private static void putU16(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >>> 8);
        bArr[i2 + 1] = (byte) i3;
    }

    private static void putU24(byte[] bArr, int i2, int i3) {
        bArr[i2] = (byte) (i3 >>> 16);
        bArr[i2 + 1] = (byte) (i3 >>> 8);
        bArr[i2 + 2] = (byte) i3;
    }

    private static void putU32(byte[] bArr, int i2, long j2) {
        bArr[i2] = (byte) (j2 >>> 24);
        bArr[i2 + 1] = (byte) (j2 >>> 16);
        bArr[i2 + 2] = (byte) (j2 >>> 8);
        bArr[i2 + 3] = (byte) j2;
    }
}
