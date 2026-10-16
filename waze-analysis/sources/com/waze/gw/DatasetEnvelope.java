package com.waze.gw;

import android.content.Context;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.common.video.Frame;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import org.json.JSONObject;

/* loaded from: classes10.dex */
final class DatasetEnvelope {
    static final String POINT = "wme-point-notices";
    static final String ROAD = "road-notices";
    final byte[] aad;
    final String artifactUrl;
    final byte[] authTag;
    final String dataset;
    final String encryptedSha256;
    final long encryptedSize;
    final String keyId;
    final byte[] nonce;
    final String payloadFormat;
    final int payloadSchemaVersion;
    final String plaintextSha256;
    final long plaintextSize;
    final byte[] signature;
    final int spatialZoom;
    final long targetMapBuildId;
    final String version;

    private DatasetEnvelope(String str, String str2, String str3, long j2, String str4, String str5, byte[] bArr, byte[] bArr2, byte[] bArr3, String str6, long j3, String str7, byte[] bArr4, int i2, int i3, long j4) {
        this.dataset = str;
        this.version = str2;
        this.artifactUrl = str3;
        this.encryptedSize = j2;
        this.encryptedSha256 = str4;
        this.keyId = str5;
        this.nonce = bArr;
        this.authTag = bArr2;
        this.aad = bArr3;
        this.payloadFormat = str6;
        this.plaintextSize = j3;
        this.plaintextSha256 = str7;
        this.signature = bArr4;
        this.payloadSchemaVersion = i2;
        this.spatialZoom = i3;
        this.targetMapBuildId = j4;
    }

    static DatasetEnvelope parse(byte[] bArr, String str, int i2) throws Exception {
        long jPositiveLong;
        JSONObject jSONObject = new JSONObject(new String(bArr, "UTF-8"));
        String string = jSONObject.getString("dataset");
        if (!str.equals(string)) {
            throw new Exception("dataset mismatch");
        }
        int i3 = jSONObject.getInt("schemaVersion");
        if ((ROAD.equals(string) && i3 != 3) || (POINT.equals(string) && i3 != 2)) {
            throw new Exception("unsupported envelope schema");
        }
        String string2 = jSONObject.getString("version");
        if (!string2.matches("[0-9]{1,32}")) {
            throw new Exception("invalid dataset version");
        }
        long j2 = jSONObject.getLong("size");
        if (j2 > 0) {
            long j3 = i2;
            if (j2 <= Frame.USAGE_VIDEO_ENCODE + j3) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("checksum");
                requireAlgorithm(jSONObject2, "SHA-256");
                String strHash = hash(jSONObject2.getString("value"));
                String string3 = jSONObject.getJSONObject("artifact").getString("url");
                if (string3.isEmpty() || !string3.startsWith(DomExceptionUtils.SEPARATOR)) {
                    throw new Exception("invalid artifact URL");
                }
                JSONObject jSONObject3 = jSONObject.getJSONObject("encryption");
                if (!"ENCRYPTED".equals(jSONObject3.getString(NotificationCompat.CATEGORY_STATUS)) || !"AES-256-GCM/v1".equals(jSONObject3.getString("provider"))) {
                    throw new Exception("unsupported encryption");
                }
                String lowerCase = jSONObject3.getString("keyId").toLowerCase(Locale.ROOT);
                if (!lowerCase.matches("[0-9a-f]{16}")) {
                    throw new Exception("invalid key ID");
                }
                byte[] bArrDecode = Base64.decode(jSONObject3.getString("nonce"), 0);
                byte[] bArrDecode2 = Base64.decode(jSONObject3.getString("authTag"), 0);
                byte[] bytes = jSONObject3.getString("aad").getBytes("UTF-8");
                if (bArrDecode.length != 12 || bArrDecode2.length != 16 || bytes.length == 0 || bytes.length > 256) {
                    throw new Exception("invalid AES-GCM metadata");
                }
                if (!("wazemodserver:" + string + ":v2:" + string2 + ":" + lowerCase).equals(new String(bytes, "UTF-8"))) {
                    throw new Exception("dataset AAD mismatch");
                }
                JSONObject jSONObject4 = jSONObject.getJSONObject("payload");
                if (!"protobuf".equals(jSONObject4.getString("encoding")) || !"gzip".equals(jSONObject4.getString("compression"))) {
                    throw new Exception("unsupported payload encoding");
                }
                String string4 = jSONObject4.getString("format");
                if (!(ROAD.equals(string) ? "road-notices/v2" : "wme-point-notices/v2").equals(string4)) {
                    throw new Exception("payload format mismatch");
                }
                long j4 = jSONObject4.getLong("size");
                if (j4 <= 0 || j4 > j3) {
                    throw new Exception("invalid plaintext size");
                }
                JSONObject jSONObject5 = jSONObject4.getJSONObject("checksum");
                requireAlgorithm(jSONObject5, "SHA-256");
                String strHash2 = hash(jSONObject5.getString("value"));
                JSONObject jSONObject6 = jSONObject4.getJSONObject("signature");
                requireAlgorithm(jSONObject6, "Ed25519");
                byte[] bArrDecode3 = Base64.decode(jSONObject6.getString("value"), 0);
                if (bArrDecode3.length != 64) {
                    throw new Exception("invalid Ed25519 signature");
                }
                int i4 = jSONObject4.getInt("schemaVersion");
                int iOptInt = jSONObject4.optInt("spatialZoom", -1);
                if (!ROAD.equals(string)) {
                    jPositiveLong = 0;
                } else {
                    jPositiveLong = positiveLong(jSONObject.getString("targetWazeMapBuildId"), "target map build");
                }
                return new DatasetEnvelope(string, string2, string3, j2, strHash, lowerCase, bArrDecode, bArrDecode2, bytes, string4, j4, strHash2, bArrDecode3, i4, iOptInt, jPositiveLong);
            }
        }
        throw new Exception("invalid encrypted size");
    }

    byte[] decryptAndVerify(Context context, byte[] bArr, int i2) throws Exception {
        if (bArr.length != this.encryptedSize || !sha256(bArr).equalsIgnoreCase(this.encryptedSha256)) {
            throw new SecurityException("ciphertext integrity mismatch");
        }
        byte[] bArrDecrypt = DatasetCrypto.decrypt(context, bArr, this.nonce, this.authTag, this.aad, this.keyId);
        try {
            byte[] bArrGunzip = gunzip(bArrDecrypt, i2, this.plaintextSize);
            Arrays.fill(bArrDecrypt, (byte) 0);
            if (!sha256(bArrGunzip).equalsIgnoreCase(this.plaintextSha256) || !RoadNoticeCrypto.verify(bArrGunzip, this.signature)) {
                Arrays.fill(bArrGunzip, (byte) 0);
                throw new SecurityException("plaintext authentication rejected");
            }
            return bArrGunzip;
        } catch (Throwable th) {
            Arrays.fill(bArrDecrypt, (byte) 0);
            throw th;
        }
    }

    void verifyStoredPlaintext(byte[] bArr) throws Exception {
        if (bArr.length != this.plaintextSize || !sha256(bArr).equalsIgnoreCase(this.plaintextSha256) || !RoadNoticeCrypto.verify(bArr, this.signature)) {
            throw new SecurityException("stored plaintext authentication rejected");
        }
    }

    private static byte[] gunzip(byte[] bArr, int i2, long j2) throws Exception {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((j2 <= 0 || j2 > ((long) i2)) ? 4096 : (int) j2);
        try {
            byte[] bArr2 = new byte[16384];
            int i3 = 0;
            while (true) {
                int i4 = gZIPInputStream.read(bArr2);
                if (i4 != -1) {
                    if (i4 > i2 - i3) {
                        throw new Exception("decompressed payload too large");
                    }
                    byteArrayOutputStream.write(bArr2, 0, i4);
                    i3 += i4;
                } else {
                    gZIPInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (byteArray.length != j2) {
                        throw new Exception("decompressed size mismatch");
                    }
                    return byteArray;
                }
            }
        } catch (Throwable th) {
            gZIPInputStream.close();
            throw th;
        }
    }

    static String sha256(byte[] bArr) throws Exception {
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bArr);
        StringBuilder sb = new StringBuilder(64);
        for (byte b2 : bArrDigest) {
            sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b2 & 255)));
        }
        return sb.toString();
    }

    private static void requireAlgorithm(JSONObject jSONObject, String str) throws Exception {
        if (!str.equalsIgnoreCase(jSONObject.getString("algorithm"))) {
            throw new Exception("algorithm mismatch");
        }
    }

    private static String hash(String str) throws Exception {
        if (!str.matches("(?i)[0-9a-f]{64}")) {
            throw new Exception("invalid SHA-256");
        }
        return str.toLowerCase(Locale.ROOT);
    }

    private static long positiveLong(String str, String str2) throws Exception {
        try {
            long j2 = Long.parseLong(str);
            if (j2 <= 0) {
                throw new NumberFormatException();
            }
            return j2;
        } catch (NumberFormatException e2) {
            throw new Exception("invalid " + str2);
        }
    }
}
