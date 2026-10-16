package B1;

import A7.AbstractC0279p0;
import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.vungle.ads.internal.protos.Sdk;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: U, reason: collision with root package name */
    public static final e f1535U;

    /* renamed from: V, reason: collision with root package name */
    public static final e[][] f1536V;

    /* renamed from: W, reason: collision with root package name */
    public static final e[] f1537W;

    /* renamed from: X, reason: collision with root package name */
    public static final HashMap[] f1538X;

    /* renamed from: Y, reason: collision with root package name */
    public static final HashMap[] f1539Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final HashSet f1540Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final HashMap f1541a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final Charset f1542b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f1543c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f1544d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f1545e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f1546f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f1547g0;

    /* renamed from: a, reason: collision with root package name */
    public final String f1555a;

    /* renamed from: b, reason: collision with root package name */
    public final FileDescriptor f1556b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager.AssetInputStream f1557c;

    /* renamed from: d, reason: collision with root package name */
    public int f1558d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap[] f1559e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f1560f;

    /* renamed from: g, reason: collision with root package name */
    public ByteOrder f1561g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1562h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1563i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1564j;
    public int k;

    /* renamed from: l, reason: collision with root package name */
    public int f1565l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f1566m;

    /* renamed from: n, reason: collision with root package name */
    public int f1567n;

    /* renamed from: o, reason: collision with root package name */
    public int f1568o;

    /* renamed from: p, reason: collision with root package name */
    public int f1569p;

    /* renamed from: q, reason: collision with root package name */
    public int f1570q;

    /* renamed from: r, reason: collision with root package name */
    public int f1571r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1572s;

    /* renamed from: t, reason: collision with root package name */
    public static final boolean f1548t = Log.isLoggable("ExifInterface", 3);

    /* renamed from: u, reason: collision with root package name */
    public static final List f1549u = Arrays.asList(1, 6, 3, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final List f1550v = Arrays.asList(2, 7, 4, 5);

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f1551w = {8, 8, 8};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f1552x = {8};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f1553y = {-1, -40, -1};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f1554z = {102, 116, 121, 112};

    /* renamed from: A, reason: collision with root package name */
    public static final byte[] f1516A = {109, 105, 102, 49};

    /* renamed from: B, reason: collision with root package name */
    public static final byte[] f1517B = {104, 101, 105, 99};

    /* renamed from: C, reason: collision with root package name */
    public static final byte[] f1518C = {79, 76, 89, 77, 80, 0};

    /* renamed from: D, reason: collision with root package name */
    public static final byte[] f1519D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: E, reason: collision with root package name */
    public static final byte[] f1520E = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: F, reason: collision with root package name */
    public static final byte[] f1521F = {101, 88, 73, 102};

    /* renamed from: G, reason: collision with root package name */
    public static final byte[] f1522G = {73, 72, 68, 82};

    /* renamed from: H, reason: collision with root package name */
    public static final byte[] f1523H = {73, 69, 78, 68};

    /* renamed from: I, reason: collision with root package name */
    public static final byte[] f1524I = {82, 73, 70, 70};

    /* renamed from: J, reason: collision with root package name */
    public static final byte[] f1525J = {87, 69, 66, 80};

    /* renamed from: K, reason: collision with root package name */
    public static final byte[] f1526K = {69, 88, 73, 70};
    public static final byte[] L = {-99, 1, 42};

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f1527M = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: N, reason: collision with root package name */
    public static final byte[] f1528N = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: O, reason: collision with root package name */
    public static final byte[] f1529O = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: P, reason: collision with root package name */
    public static final byte[] f1530P = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: Q, reason: collision with root package name */
    public static final byte[] f1531Q = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: R, reason: collision with root package name */
    public static final String[] f1532R = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: S, reason: collision with root package name */
    public static final int[] f1533S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: T, reason: collision with root package name */
    public static final byte[] f1534T = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 3), new e("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new e("DateTime", 306, 2), new e("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new e("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new e("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", Sdk.SDKError.Reason.MRAID_ERROR_VALUE, 3), new e("Software", Sdk.SDKError.Reason.MRAID_BRIDGE_ERROR_VALUE, 2), new e("DateTime", 306, 2), new e("Artist", Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 2), new e("WhitePoint", Sdk.SDKError.Reason.AD_CLOSED_MISSING_HEARTBEAT_VALUE, 5), new e("PrimaryChromaticities", Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f1535U = new e("StripOffsets", 273, 3);
        f1536V = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        f1537W = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f1538X = new HashMap[10];
        f1539Y = new HashMap[10];
        f1540Z = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f1541a0 = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        f1542b0 = charsetForName;
        f1543c0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f1544d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i5 = 0;
        while (true) {
            e[][] eVarArr6 = f1536V;
            if (i5 >= eVarArr6.length) {
                HashMap map = f1541a0;
                e[] eVarArr7 = f1537W;
                map.put(Integer.valueOf(eVarArr7[0].f1510a), 5);
                map.put(Integer.valueOf(eVarArr7[1].f1510a), 1);
                map.put(Integer.valueOf(eVarArr7[2].f1510a), 2);
                map.put(Integer.valueOf(eVarArr7[3].f1510a), 3);
                map.put(Integer.valueOf(eVarArr7[4].f1510a), 7);
                map.put(Integer.valueOf(eVarArr7[5].f1510a), 8);
                Pattern.compile(".*[1-9].*");
                f1545e0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f1546f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f1547g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f1538X[i5] = new HashMap();
            f1539Y[i5] = new HashMap();
            for (e eVar : eVarArr6[i5]) {
                f1538X[i5].put(Integer.valueOf(eVar.f1510a), eVar);
                f1539Y[i5].put(eVar.f1511b, eVar);
            }
            i5++;
        }
    }

    public h(String str) throws Throwable {
        FileInputStream fileInputStream;
        boolean z2;
        e[][] eVarArr = f1536V;
        this.f1559e = new HashMap[eVarArr.length];
        this.f1560f = new HashSet(eVarArr.length);
        this.f1561g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f1557c = null;
        this.f1555a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                i.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z2 = true;
            } catch (Exception unused) {
                if (f1548t) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                z2 = false;
            }
            if (z2) {
                this.f1556b = fileInputStream.getFD();
            } else {
                this.f1556b = null;
            }
            u(fileInputStream);
            gc.b.l(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            gc.b.l(fileInputStream2);
            throw th;
        }
    }

    public static String b(double d3) {
        long j8 = (long) d3;
        double d5 = d3 - j8;
        long j10 = (long) (d5 * 60.0d);
        return j8 + "/1," + j10 + "/1," + Math.round((d5 - (j10 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    public static double c(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d3 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d5 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d10 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d5 / 60.0d) + d3;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d10;
            }
            return -d10;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static Pair r(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair pairR = r(strArrSplit[0]);
            if (((Integer) pairR.first).intValue() == 2) {
                return pairR;
            }
            for (int i5 = 1; i5 < strArrSplit.length; i5++) {
                Pair pairR2 = r(strArrSplit[i5]);
                int iIntValue = (((Integer) pairR2.first).equals(pairR.first) || ((Integer) pairR2.second).equals(pairR.first)) ? ((Integer) pairR.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairR.second).intValue() == -1 || !(((Integer) pairR2.first).equals(pairR.second) || ((Integer) pairR2.second).equals(pairR.second))) ? -1 : ((Integer) pairR.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (iIntValue == -1) {
                    pairR = new Pair(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairR = new Pair(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairR;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j8 = Long.parseLong(str);
                    return (j8 < 0 || j8 > WebSocketProtocol.PAYLOAD_SHORT_MAX) ? j8 < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j10 = (long) Double.parseDouble(strArrSplit2[0]);
                long j11 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j10 >= 0 && j11 >= 0) {
                    if (j10 <= 2147483647L && j11 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    public static ByteOrder x(b bVar) throws IOException {
        short s10 = bVar.readShort();
        boolean z2 = f1548t;
        if (s10 == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    public final void A(String str) {
        for (int i5 = 0; i5 < f1536V.length; i5++) {
            this.f1559e[i5].remove(str);
        }
    }

    public final void B(int i5, String str, String str2) {
        HashMap[] mapArr = this.f1559e;
        if (mapArr[i5].isEmpty() || mapArr[i5].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i5];
        map.put(str2, map.get(str));
        mapArr[i5].remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fa A[Catch: all -> 0x010a, Exception -> 0x010d, TryCatch #19 {Exception -> 0x010d, all -> 0x010a, blocks: (B:80:0x00f6, B:82:0x00fa, B:89:0x0118, B:88:0x0110), top: B:128:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0110 A[Catch: all -> 0x010a, Exception -> 0x010d, TryCatch #19 {Exception -> 0x010d, all -> 0x010a, blocks: (B:80:0x00f6, B:82:0x00fa, B:89:0x0118, B:88:0x0110), top: B:128:0x00f6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.h.C():void");
    }

    public final void D(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (f1548t) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-40);
        String strD = d("Xmp");
        HashMap[] mapArr = this.f1559e;
        d dVar = (strD == null || !this.f1572s) ? null : (d) mapArr[0].remove("Xmp");
        cVar.a(-1);
        cVar.a(-31);
        L(cVar);
        if (dVar != null) {
            mapArr[0].put("Xmp", dVar);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b5 = bVar.readByte();
            if (b5 == -39 || b5 == -38) {
                cVar.a(-1);
                cVar.a(b5);
                gc.b.p(bVar, cVar);
                return;
            }
            if (b5 != -31) {
                cVar.a(-1);
                cVar.a(b5);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.i(unsignedShort);
                int i5 = unsignedShort - 2;
                if (i5 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i5 > 0) {
                    int i10 = bVar.read(bArr, 0, Math.min(i5, 4096));
                    if (i10 >= 0) {
                        cVar.write(bArr, 0, i10);
                        i5 -= i10;
                    }
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int i11 = unsignedShort2 - 2;
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i11 >= 6) {
                    bVar.readFully(bArr2);
                    if (Arrays.equals(bArr2, f1543c0)) {
                        bVar.a(unsignedShort2 - 8);
                    }
                }
                cVar.a(-1);
                cVar.a(b5);
                cVar.i(unsignedShort2);
                if (i11 >= 6) {
                    i11 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i11 > 0) {
                    int i12 = bVar.read(bArr, 0, Math.min(i11, 4096));
                    if (i12 >= 0) {
                        cVar.write(bArr, 0, i12);
                        i11 -= i12;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void E(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (f1548t) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(bufferedOutputStream, byteOrder);
        gc.b.o(bVar, cVar, f1520E.length);
        if (this.f1568o == 0) {
            int i5 = bVar.readInt();
            cVar.b(i5);
            gc.b.o(bVar, cVar, i5 + 8);
        } else {
            gc.b.o(bVar, cVar, (r2 - r7.length) - 8);
            bVar.a(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                L(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f1504a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.b((int) crc32.getValue());
                gc.b.l(byteArrayOutputStream2);
                gc.b.p(bVar, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                gc.b.l(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void F(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i5;
        int i10;
        int i11;
        int i12;
        ByteArrayOutputStream byteArrayOutputStream2;
        c cVar;
        byte[] bArr;
        boolean z2;
        if (f1548t) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(bufferedInputStream, byteOrder);
        c cVar2 = new c(bufferedOutputStream, byteOrder);
        byte[] bArr2 = f1524I;
        gc.b.o(bVar, cVar2, bArr2.length);
        byte[] bArr3 = f1525J;
        bVar.a(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                try {
                    c cVar3 = new c(byteArrayOutputStream4, byteOrder);
                    int i13 = this.f1568o;
                    try {
                        try {
                            if (i13 != 0) {
                                gc.b.o(bVar, cVar3, (i13 - ((bArr2.length + 4) + bArr3.length)) - 8);
                                bVar.a(4);
                                int i14 = bVar.readInt();
                                if (i14 % 2 != 0) {
                                    i14++;
                                }
                                bVar.a(i14);
                                L(cVar3);
                            } else {
                                byte[] bArr4 = new byte[4];
                                bVar.readFully(bArr4);
                                byte[] bArr5 = f1527M;
                                boolean zEquals = Arrays.equals(bArr4, bArr5);
                                byte[] bArr6 = f1529O;
                                byte[] bArr7 = f1528N;
                                if (!zEquals) {
                                    if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                                        int i15 = bVar.readInt();
                                        int i16 = i15 % 2 == 1 ? i15 + 1 : i15;
                                        byte[] bArr8 = new byte[3];
                                        boolean zEquals2 = Arrays.equals(bArr4, bArr6);
                                        boolean z10 = true;
                                        byte[] bArr9 = L;
                                        if (zEquals2) {
                                            bVar.readFully(bArr8);
                                            byte[] bArr10 = new byte[3];
                                            bVar.readFully(bArr10);
                                            if (!Arrays.equals(bArr9, bArr10)) {
                                                throw new IOException("Error checking VP8 signature");
                                            }
                                            i5 = bVar.readInt();
                                            i16 -= 10;
                                            i10 = (i5 << 18) >> 18;
                                            i11 = (i5 << 2) >> 18;
                                            z10 = false;
                                        } else if (!Arrays.equals(bArr4, bArr7)) {
                                            i5 = 0;
                                            i10 = 0;
                                            z10 = false;
                                            i11 = 0;
                                        } else {
                                            if (bVar.readByte() != 47) {
                                                throw new IOException("Error checking VP8L signature");
                                            }
                                            i5 = bVar.readInt();
                                            i10 = (i5 & 16383) + 1;
                                            i11 = ((i5 & 268419072) >>> 14) + 1;
                                            if ((i5 & 268435456) == 0) {
                                                z10 = false;
                                            }
                                            i16 -= 5;
                                        }
                                        cVar3.write(bArr5);
                                        cVar3.b(10);
                                        byte[] bArr11 = new byte[10];
                                        if (z10) {
                                            i12 = i10;
                                            bArr11[0] = (byte) (bArr11[0] | 16);
                                        } else {
                                            i12 = i10;
                                        }
                                        bArr11[0] = (byte) (bArr11[0] | 8);
                                        int i17 = i12 - 1;
                                        byteArrayOutputStream2 = byteArrayOutputStream4;
                                        int i18 = i11 - 1;
                                        cVar = cVar2;
                                        try {
                                            bArr11[4] = (byte) i17;
                                            bArr11[5] = (byte) (i17 >> 8);
                                            bArr11[6] = (byte) (i17 >> 16);
                                            bArr11[7] = (byte) i18;
                                            bArr11[8] = (byte) (i18 >> 8);
                                            bArr11[9] = (byte) (i18 >> 16);
                                            cVar3.write(bArr11);
                                            cVar3.write(bArr4);
                                            cVar3.b(i15);
                                        } catch (Exception e7) {
                                            e = e7;
                                            byteArrayOutputStream = byteArrayOutputStream2;
                                            byteArrayOutputStream3 = byteArrayOutputStream;
                                            throw new IOException("Failed to save WebP file", e);
                                        } catch (Throwable th) {
                                            th = th;
                                            byteArrayOutputStream = byteArrayOutputStream2;
                                            byteArrayOutputStream3 = byteArrayOutputStream;
                                            gc.b.l(byteArrayOutputStream3);
                                            throw th;
                                        }
                                        try {
                                            if (Arrays.equals(bArr4, bArr6)) {
                                                cVar3.write(bArr8);
                                                cVar3.write(bArr9);
                                                cVar3.b(i5);
                                            } else {
                                                if (Arrays.equals(bArr4, bArr7)) {
                                                    cVar3.write(47);
                                                    cVar3.b(i5);
                                                }
                                                gc.b.o(bVar, cVar3, i16);
                                                L(cVar3);
                                            }
                                            gc.b.o(bVar, cVar3, i16);
                                            L(cVar3);
                                        } catch (Exception e10) {
                                            e = e10;
                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                            throw new IOException("Failed to save WebP file", e);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                            gc.b.l(byteArrayOutputStream3);
                                            throw th;
                                        }
                                    }
                                    gc.b.p(bVar, cVar3);
                                    c cVar4 = cVar;
                                    cVar4.b(byteArrayOutputStream2.size() + bArr3.length);
                                    cVar4.write(bArr3);
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    byteArrayOutputStream.writeTo(cVar4);
                                    gc.b.l(byteArrayOutputStream);
                                    return;
                                }
                                int i19 = bVar.readInt();
                                byte[] bArr12 = new byte[i19 % 2 == 1 ? i19 + 1 : i19];
                                bVar.readFully(bArr12);
                                byte b5 = (byte) (8 | bArr12[0]);
                                bArr12[0] = b5;
                                boolean z11 = ((b5 >> 1) & 1) == 1;
                                cVar3.write(bArr5);
                                cVar3.b(i19);
                                cVar3.write(bArr12);
                                if (z11) {
                                    byte[] bArr13 = f1530P;
                                    do {
                                        bArr = new byte[4];
                                        bVar.readFully(bArr);
                                        int i20 = bVar.readInt();
                                        cVar3.write(bArr);
                                        cVar3.b(i20);
                                        if (i20 % 2 == 1) {
                                            i20++;
                                        }
                                        gc.b.o(bVar, cVar3, i20);
                                    } while (!Arrays.equals(bArr, bArr13));
                                    while (true) {
                                        byte[] bArr14 = new byte[4];
                                        try {
                                            bVar.readFully(bArr14);
                                            z2 = !Arrays.equals(bArr14, f1531Q);
                                        } catch (EOFException unused) {
                                            z2 = true;
                                        }
                                        if (z2) {
                                            break;
                                        }
                                        int i21 = bVar.readInt();
                                        cVar3.write(bArr14);
                                        cVar3.b(i21);
                                        if (i21 % 2 == 1) {
                                            i21++;
                                        }
                                        gc.b.o(bVar, cVar3, i21);
                                    }
                                    L(cVar3);
                                } else {
                                    while (true) {
                                        byte[] bArr15 = new byte[4];
                                        bVar.readFully(bArr15);
                                        int i22 = bVar.readInt();
                                        cVar3.write(bArr15);
                                        cVar3.b(i22);
                                        if (i22 % 2 == 1) {
                                            i22++;
                                        }
                                        gc.b.o(bVar, cVar3, i22);
                                        if (Arrays.equals(bArr15, bArr6) || (bArr7 != null && Arrays.equals(bArr15, bArr7))) {
                                            break;
                                        }
                                    }
                                    L(cVar3);
                                }
                            }
                            byteArrayOutputStream.writeTo(cVar4);
                            gc.b.l(byteArrayOutputStream);
                            return;
                        } catch (Exception e11) {
                            e = e11;
                            byteArrayOutputStream3 = byteArrayOutputStream;
                            throw new IOException("Failed to save WebP file", e);
                        } catch (Throwable th3) {
                            th = th3;
                            byteArrayOutputStream3 = byteArrayOutputStream;
                            gc.b.l(byteArrayOutputStream3);
                            throw th;
                        }
                        cVar = cVar2;
                        byteArrayOutputStream2 = byteArrayOutputStream4;
                        gc.b.p(bVar, cVar3);
                        c cVar42 = cVar;
                        cVar42.b(byteArrayOutputStream2.size() + bArr3.length);
                        cVar42.write(bArr3);
                        byteArrayOutputStream = byteArrayOutputStream2;
                    } catch (Exception e12) {
                        e = e12;
                        byteArrayOutputStream3 = byteArrayOutputStream4;
                    } catch (Throwable th4) {
                        th = th4;
                        byteArrayOutputStream3 = byteArrayOutputStream4;
                    }
                } catch (Exception e13) {
                    e = e13;
                    byteArrayOutputStream = byteArrayOutputStream4;
                } catch (Throwable th5) {
                    th = th5;
                    byteArrayOutputStream = byteArrayOutputStream4;
                }
            } catch (Exception e14) {
                e = e14;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(java.lang.String r21, java.lang.String r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.h.G(java.lang.String, java.lang.String):void");
    }

    public final void H(b bVar) throws IOException {
        String str;
        d dVar;
        int iH;
        HashMap map = this.f1559e[4];
        d dVar2 = (d) map.get("Compression");
        if (dVar2 == null) {
            this.f1567n = 6;
            s(bVar, map);
            return;
        }
        int iH2 = dVar2.h(this.f1561g);
        this.f1567n = iH2;
        int i5 = 1;
        if (iH2 != 1) {
            if (iH2 == 6) {
                s(bVar, map);
                return;
            } else if (iH2 != 7) {
                return;
            }
        }
        d dVar3 = (d) map.get("BitsPerSample");
        String str2 = "ExifInterface";
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.j(this.f1561g);
            int[] iArr2 = f1551w;
            if (Arrays.equals(iArr2, iArr) || (this.f1558d == 3 && (dVar = (d) map.get("PhotometricInterpretation")) != null && (((iH = dVar.h(this.f1561g)) == 1 && Arrays.equals(iArr, f1552x)) || (iH == 6 && Arrays.equals(iArr, iArr2))))) {
                d dVar4 = (d) map.get("StripOffsets");
                d dVar5 = (d) map.get("StripByteCounts");
                if (dVar4 == null || dVar5 == null) {
                    return;
                }
                long[] jArrN = gc.b.n(dVar4.j(this.f1561g));
                long[] jArrN2 = gc.b.n(dVar5.j(this.f1561g));
                if (jArrN == null || jArrN.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrN2 == null || jArrN2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrN.length != jArrN2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j8 = 0;
                for (long j10 : jArrN2) {
                    j8 += j10;
                }
                int i10 = (int) j8;
                byte[] bArr = new byte[i10];
                this.f1564j = true;
                this.f1563i = true;
                this.f1562h = true;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < jArrN.length) {
                    int i14 = (int) jArrN[i11];
                    int i15 = (int) jArrN2[i11];
                    if (i11 < jArrN.length - i5) {
                        str = str2;
                        if (i14 + i15 != jArrN[i11 + 1]) {
                            this.f1564j = false;
                        }
                    } else {
                        str = str2;
                    }
                    int i16 = i14 - i12;
                    if (i16 < 0) {
                        Log.d(str, "Invalid strip offset value");
                        return;
                    }
                    String str3 = str;
                    try {
                        bVar.a(i16);
                        int i17 = i12 + i16;
                        byte[] bArr2 = new byte[i15];
                        try {
                            bVar.readFully(bArr2);
                            i12 = i17 + i15;
                            System.arraycopy(bArr2, 0, bArr, i13, i15);
                            i13 += i15;
                            i11++;
                            str2 = str3;
                            i5 = 1;
                        } catch (EOFException unused) {
                            Log.d(str3, "Failed to read " + i15 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d(str3, "Failed to skip " + i16 + " bytes.");
                        return;
                    }
                }
                this.f1566m = bArr;
                if (this.f1564j) {
                    this.k = (int) jArrN[0];
                    this.f1565l = i10;
                    return;
                }
                return;
            }
        }
        if (f1548t) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void I(int i5, int i10) {
        HashMap[] mapArr = this.f1559e;
        boolean zIsEmpty = mapArr[i5].isEmpty();
        boolean z2 = f1548t;
        if (zIsEmpty || mapArr[i10].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = (d) mapArr[i5].get("ImageLength");
        d dVar2 = (d) mapArr[i5].get("ImageWidth");
        d dVar3 = (d) mapArr[i10].get("ImageLength");
        d dVar4 = (d) mapArr[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iH = dVar.h(this.f1561g);
        int iH2 = dVar2.h(this.f1561g);
        int iH3 = dVar3.h(this.f1561g);
        int iH4 = dVar4.h(this.f1561g);
        if (iH >= iH3 || iH2 >= iH4) {
            return;
        }
        HashMap map = mapArr[i5];
        mapArr[i5] = mapArr[i10];
        mapArr[i10] = map;
    }

    public final void J(g gVar, int i5) throws IOException {
        d dVarE;
        d dVarE2;
        HashMap[] mapArr = this.f1559e;
        d dVar = (d) mapArr[i5].get("DefaultCropSize");
        d dVar2 = (d) mapArr[i5].get("SensorTopBorder");
        d dVar3 = (d) mapArr[i5].get("SensorLeftBorder");
        d dVar4 = (d) mapArr[i5].get("SensorBottomBorder");
        d dVar5 = (d) mapArr[i5].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f1506a == 5) {
                f[] fVarArr = (f[]) dVar.j(this.f1561g);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                } else {
                    dVarE = d.d(new f[]{fVarArr[0]}, this.f1561g);
                    dVarE2 = d.d(new f[]{fVarArr[1]}, this.f1561g);
                }
            } else {
                int[] iArr = (int[]) dVar.j(this.f1561g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVarE = d.e(iArr[0], this.f1561g);
                dVarE2 = d.e(iArr[1], this.f1561g);
            }
            mapArr[i5].put("ImageWidth", dVarE);
            mapArr[i5].put("ImageLength", dVarE2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int iH = dVar2.h(this.f1561g);
            int iH2 = dVar4.h(this.f1561g);
            int iH3 = dVar5.h(this.f1561g);
            int iH4 = dVar3.h(this.f1561g);
            if (iH2 <= iH || iH3 <= iH4) {
                return;
            }
            d dVarE3 = d.e(iH2 - iH, this.f1561g);
            d dVarE4 = d.e(iH3 - iH4, this.f1561g);
            mapArr[i5].put("ImageLength", dVarE3);
            mapArr[i5].put("ImageWidth", dVarE4);
            return;
        }
        d dVar6 = (d) mapArr[i5].get("ImageLength");
        d dVar7 = (d) mapArr[i5].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = (d) mapArr[i5].get("JPEGInterchangeFormat");
            d dVar9 = (d) mapArr[i5].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int iH5 = dVar8.h(this.f1561g);
            int iH6 = dVar8.h(this.f1561g);
            gVar.b(iH5);
            byte[] bArr = new byte[iH6];
            gVar.readFully(bArr);
            h(new b(bArr), iH5, i5);
        }
    }

    public final void K() {
        I(0, 5);
        I(0, 4);
        I(5, 4);
        HashMap[] mapArr = this.f1559e;
        d dVar = (d) mapArr[1].get("PixelXDimension");
        d dVar2 = (d) mapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            mapArr[0].put("ImageWidth", dVar);
            mapArr[0].put("ImageLength", dVar2);
        }
        if (mapArr[4].isEmpty() && t(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!t(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        B(0, "ThumbnailOrientation", "Orientation");
        B(0, "ThumbnailImageLength", "ImageLength");
        B(0, "ThumbnailImageWidth", "ImageWidth");
        B(5, "ThumbnailOrientation", "Orientation");
        B(5, "ThumbnailImageLength", "ImageLength");
        B(5, "ThumbnailImageWidth", "ImageWidth");
        B(4, "Orientation", "ThumbnailOrientation");
        B(4, "ImageLength", "ThumbnailImageLength");
        B(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void L(c cVar) throws IOException {
        HashMap[] mapArr;
        int[] iArr;
        int i5;
        int i10;
        int i11;
        int i12 = 1;
        e[][] eVarArr = f1536V;
        int[] iArr2 = new int[eVarArr.length];
        int[] iArr3 = new int[eVarArr.length];
        e[] eVarArr2 = f1537W;
        for (e eVar : eVarArr2) {
            A(eVar.f1511b);
        }
        if (this.f1562h) {
            if (this.f1563i) {
                A("StripOffsets");
                A("StripByteCounts");
            } else {
                A("JPEGInterchangeFormat");
                A("JPEGInterchangeFormatLength");
            }
        }
        int i13 = 0;
        while (true) {
            int length = eVarArr.length;
            mapArr = this.f1559e;
            if (i13 >= length) {
                break;
            }
            Object[] array = mapArr[i13].entrySet().toArray();
            int i14 = i12;
            int length2 = array.length;
            int i15 = 0;
            while (i15 < length2) {
                Map.Entry entry = (Map.Entry) array[i15];
                if (entry.getValue() == null) {
                    i11 = i15;
                    mapArr[i13].remove(entry.getKey());
                } else {
                    i11 = i15;
                }
                i15 = i11 + 1;
            }
            i13++;
            i12 = i14;
        }
        int i16 = i12;
        int i17 = 4;
        if (!mapArr[i16].isEmpty()) {
            mapArr[0].put(eVarArr2[i16].f1511b, d.b(0L, this.f1561g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(eVarArr2[2].f1511b, d.b(0L, this.f1561g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[i16].put(eVarArr2[3].f1511b, d.b(0L, this.f1561g));
        }
        if (this.f1562h) {
            if (this.f1563i) {
                mapArr[4].put("StripOffsets", d.e(0, this.f1561g));
                mapArr[4].put("StripByteCounts", d.e(this.f1565l, this.f1561g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.b(0L, this.f1561g));
                mapArr[4].put("JPEGInterchangeFormatLength", d.b(this.f1565l, this.f1561g));
            }
        }
        int i18 = 0;
        while (true) {
            int length3 = eVarArr.length;
            iArr = f1533S;
            if (i18 >= length3) {
                break;
            }
            Iterator it = mapArr[i18].entrySet().iterator();
            int i19 = 0;
            while (it.hasNext()) {
                d dVar = (d) ((Map.Entry) it.next()).getValue();
                dVar.getClass();
                int i20 = iArr[dVar.f1506a] * dVar.f1507b;
                if (i20 > i17) {
                    i19 += i20;
                }
                i17 = 4;
            }
            iArr3[i18] = iArr3[i18] + i19;
            i18++;
            i17 = 4;
        }
        int size = 8;
        for (int i21 = 0; i21 < eVarArr.length; i21++) {
            if (!mapArr[i21].isEmpty()) {
                iArr2[i21] = size;
                size += (mapArr[i21].size() * 12) + 6 + iArr3[i21];
            }
        }
        if (this.f1562h) {
            if (this.f1563i) {
                mapArr[4].put("StripOffsets", d.e(size, this.f1561g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.b(size, this.f1561g));
            }
            this.k = size;
            size += this.f1565l;
        }
        if (this.f1558d == 4) {
            size += 8;
        }
        if (f1548t) {
            for (int i22 = 0; i22 < eVarArr.length; i22++) {
                Integer numValueOf = Integer.valueOf(i22);
                Integer numValueOf2 = Integer.valueOf(iArr2[i22]);
                Integer numValueOf3 = Integer.valueOf(mapArr[i22].size());
                Integer numValueOf4 = Integer.valueOf(iArr3[i22]);
                Integer numValueOf5 = Integer.valueOf(size);
                Object[] objArr = new Object[5];
                objArr[0] = numValueOf;
                objArr[i16] = numValueOf2;
                objArr[2] = numValueOf3;
                objArr[3] = numValueOf4;
                objArr[4] = numValueOf5;
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", objArr));
            }
        }
        if (!mapArr[i16].isEmpty()) {
            mapArr[0].put(eVarArr2[i16].f1511b, d.b(iArr2[i16], this.f1561g));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[0].put(eVarArr2[2].f1511b, d.b(iArr2[2], this.f1561g));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[i16].put(eVarArr2[3].f1511b, d.b(iArr2[3], this.f1561g));
        }
        int i23 = this.f1558d;
        if (i23 == 4) {
            if (size > 65535) {
                throw new IllegalStateException(AbstractC0279p0.i(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            cVar.i(size);
            cVar.write(f1543c0);
        } else if (i23 == 13) {
            cVar.b(size);
            cVar.write(f1521F);
        } else if (i23 == 14) {
            cVar.write(f1526K);
            cVar.b(size);
        }
        cVar.d(this.f1561g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f1505b = this.f1561g;
        cVar.i(42);
        cVar.h(8L);
        int i24 = 0;
        while (i24 < eVarArr.length) {
            if (mapArr[i24].isEmpty()) {
                i5 = size;
            } else {
                cVar.i(mapArr[i24].size());
                int size2 = (mapArr[i24].size() * 12) + iArr2[i24] + 2 + 4;
                for (Map.Entry entry2 : mapArr[i24].entrySet()) {
                    int i25 = ((e) f1539Y[i24].get(entry2.getKey())).f1510a;
                    d dVar2 = (d) entry2.getValue();
                    dVar2.getClass();
                    int i26 = dVar2.f1506a;
                    int i27 = iArr[i26];
                    int i28 = dVar2.f1507b;
                    int i29 = i27 * i28;
                    cVar.i(i25);
                    cVar.i(i26);
                    cVar.b(i28);
                    if (i29 > 4) {
                        i10 = size;
                        cVar.h(size2);
                        size2 += i29;
                    } else {
                        i10 = size;
                        cVar.write(dVar2.f1509d);
                        if (i29 < 4) {
                            while (i29 < 4) {
                                cVar.a(0);
                                i29++;
                            }
                        }
                    }
                    size = i10;
                }
                i5 = size;
                if (i24 != 0 || mapArr[4].isEmpty()) {
                    cVar.h(0L);
                } else {
                    cVar.h(iArr2[4]);
                }
                Iterator it2 = mapArr[i24].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it2.next()).getValue()).f1509d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
            i24++;
            size = i5;
        }
        int i30 = size;
        if (this.f1562h) {
            cVar.write(p());
        }
        if (this.f1558d == 14 && i30 % 2 == i16) {
            cVar.a(0);
        }
        cVar.f1505b = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strD = d("DateTimeOriginal");
        HashMap[] mapArr = this.f1559e;
        if (strD != null && d("DateTime") == null) {
            mapArr[0].put("DateTime", d.a(strD));
        }
        if (d("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", d.b(0L, this.f1561g));
        }
        if (d("ImageLength") == null) {
            mapArr[0].put("ImageLength", d.b(0L, this.f1561g));
        }
        if (d("Orientation") == null) {
            mapArr[0].put("Orientation", d.b(0L, this.f1561g));
        }
        if (d("LightSource") == null) {
            mapArr[1].put("LightSource", d.b(0L, this.f1561g));
        }
    }

    public final String d(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarF = f(str);
        if (dVarF != null) {
            if (!f1540Z.contains(str)) {
                return dVarF.i(this.f1561g);
            }
            if (str.equals("GPSTimeStamp")) {
                int i5 = dVarF.f1506a;
                if (i5 != 5 && i5 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i5);
                    return null;
                }
                f[] fVarArr = (f[]) dVarF.j(this.f1561g);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (fVar.f1514a / fVar.f1515b));
                f fVar2 = fVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (fVar2.f1514a / fVar2.f1515b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f1514a / fVar3.f1515b)));
            }
            try {
                return Double.toString(dVarF.g(this.f1561g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int e() {
        d dVarF = f("Orientation");
        if (dVarF == null) {
            return 1;
        }
        try {
            return dVarF.h(this.f1561g);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final d f(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f1548t) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i5 = 0; i5 < f1536V.length; i5++) {
            d dVar = (d) this.f1559e[i5].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final void g(g gVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                j.a(mediaMetadataRetriever, new a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap[] mapArr = this.f1559e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", d.e(Integer.parseInt(strExtractMetadata), this.f1561g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", d.e(Integer.parseInt(strExtractMetadata2), this.f1561g));
                }
                if (strExtractMetadata3 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", d.e(i5 != 90 ? i5 != 180 ? i5 != 270 ? 1 : 8 : 3 : 6, this.f1561g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i10 = Integer.parseInt(strExtractMetadata4);
                    int i11 = Integer.parseInt(strExtractMetadata5);
                    if (i11 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.b(i10);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i12 = i10 + 6;
                    int i13 = i11 - 6;
                    if (!Arrays.equals(bArr, f1543c0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i13];
                    gVar.readFully(bArr2);
                    this.f1568o = i12;
                    y(0, bArr2);
                }
                if (f1548t) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0190, code lost:
    
        r24.f1501c = r23.f1561g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0194, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(B1.b r24, int r25, int r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.h.h(B1.b, int, int):void");
    }

    public final double[] i() {
        String strD = d("GPSLatitude");
        String strD2 = d("GPSLatitudeRef");
        String strD3 = d("GPSLongitude");
        String strD4 = d("GPSLongitudeRef");
        if (strD == null || strD2 == null || strD3 == null || strD4 == null) {
            return null;
        }
        try {
            return new double[]{c(strD, strD2), c(strD3, strD4)};
        } catch (IllegalArgumentException unused) {
            StringBuilder sbR = AbstractC0279p0.r("latValue=", strD, ", latRef=", strD2, ", lngValue=");
            sbR.append(strD3);
            sbR.append(", lngRef=");
            sbR.append(strD4);
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. ".concat(sbR.toString()));
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:169|12|(4:164|13|150|14)|(16:17|(2:19|20)(1:28)|23|29|(1:31)|32|(4:152|35|(7:154|39|40|(3:43|(1:45)(2:46|(1:48))|(1:179)(3:177|51|52))(1:180)|53|36|37)|176)|34|160|65|162|66|67|(1:73)(1:72)|74|(1:87)(8:156|89|158|90|91|(1:93)(1:94)|95|(1:107)(3:109|(2:110|(2:112|(2:170|114)(1:115))(2:171|116))|(1:118)(4:120|(2:121|(2:123|(1:173)(1:126))(3:172|127|(2:128|(2:130|(1:175)(1:133))(2:174|134))))|125|(1:136)(1:138)))))|16|160|65|162|66|67|(3:69|73|74)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f0, code lost:
    
        r6 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f4, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f6, code lost:
    
        if (r6 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00f8, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fc, code lost:
    
        if (r2 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00fe, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0101, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(java.io.BufferedInputStream r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.h.j(java.io.BufferedInputStream):int");
    }

    public final void k(g gVar) throws IOException {
        int i5;
        int i10;
        n(gVar);
        HashMap[] mapArr = this.f1559e;
        d dVar = (d) mapArr[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f1509d);
            gVar2.f1501c = this.f1561g;
            byte[] bArr = f1518C;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.b(0L);
            byte[] bArr3 = f1519D;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.b(12L);
            }
            z(gVar2, 6);
            d dVar2 = (d) mapArr[7].get("PreviewImageStart");
            d dVar3 = (d) mapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", dVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = (d) mapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.j(this.f1561g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i11 = iArr[2];
                int i12 = iArr[0];
                if (i11 <= i12 || (i5 = iArr[3]) <= (i10 = iArr[1])) {
                    return;
                }
                int i13 = (i11 - i12) + 1;
                int i14 = (i5 - i10) + 1;
                if (i13 < i14) {
                    int i15 = i13 + i14;
                    i14 = i15 - i14;
                    i13 = i15 - i14;
                }
                d dVarE = d.e(i13, this.f1561g);
                d dVarE2 = d.e(i14, this.f1561g);
                mapArr[0].put("ImageWidth", dVarE);
                mapArr[0].put("ImageLength", dVarE2);
            }
        }
    }

    public final void l(b bVar) throws IOException {
        if (f1548t) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f1501c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = f1520E;
        bVar.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i5 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i10 = length + 8;
                if (i10 == 16 && !Arrays.equals(bArr2, f1522G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f1523H)) {
                    return;
                }
                if (Arrays.equals(bArr2, f1521F)) {
                    byte[] bArr3 = new byte[i5];
                    bVar.readFully(bArr3);
                    int i11 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i11) {
                        this.f1568o = i10;
                        y(0, bArr3);
                        K();
                        H(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i11 + ", calculated CRC value: " + crc32.getValue());
                }
                int i12 = i5 + 4;
                bVar.a(i12);
                length = i10 + i12;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void m(b bVar) throws IOException {
        boolean z2 = f1548t;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i5 = ByteBuffer.wrap(bArr).getInt();
        int i10 = ByteBuffer.wrap(bArr2).getInt();
        int i11 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i10];
        bVar.a(i5 - bVar.f1500b);
        bVar.readFully(bArr4);
        h(new b(bArr4), i5, 5);
        bVar.a(i11 - bVar.f1500b);
        bVar.f1501c = ByteOrder.BIG_ENDIAN;
        int i12 = bVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i12);
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == f1535U.f1510a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                d dVarE = d.e(s10, this.f1561g);
                d dVarE2 = d.e(s11, this.f1561g);
                HashMap[] mapArr = this.f1559e;
                mapArr[0].put("ImageLength", dVarE);
                mapArr[0].put("ImageWidth", dVarE2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.a(unsignedShort2);
        }
    }

    public final void n(g gVar) throws IOException {
        v(gVar);
        z(gVar, 0);
        J(gVar, 0);
        J(gVar, 5);
        J(gVar, 4);
        K();
        if (this.f1558d == 8) {
            HashMap[] mapArr = this.f1559e;
            d dVar = (d) mapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.f1509d);
                gVar2.f1501c = this.f1561g;
                gVar2.a(6);
                z(gVar2, 9);
                d dVar2 = (d) mapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    mapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final void o(g gVar) throws IOException {
        if (f1548t) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        n(gVar);
        HashMap[] mapArr = this.f1559e;
        d dVar = (d) mapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            h(new b(dVar.f1509d), (int) dVar.f1508c, 5);
        }
        d dVar2 = (d) mapArr[0].get("ISO");
        d dVar3 = (d) mapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", dVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v6, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.Closeable, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] p() throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r0 = "Error closing fd."
            java.lang.String r1 = "ExifInterfaceUtils"
            java.lang.String r2 = "ExifInterface"
            boolean r3 = r10.f1562h
            r4 = 0
            if (r3 != 0) goto Ld
            goto L9c
        Ld:
            byte[] r3 = r10.f1566m
            if (r3 == 0) goto L12
            return r3
        L12:
            android.content.res.AssetManager$AssetInputStream r3 = r10.f1557c     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            if (r3 == 0) goto L34
            boolean r5 = r3.markSupported()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L26
            if (r5 == 0) goto L2b
            r3.reset()     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L26
        L1f:
            r5 = r4
            goto L5d
        L21:
            r2 = move-exception
            r5 = r4
        L23:
            r4 = r3
            goto L9d
        L26:
            r5 = move-exception
            r6 = r5
            r5 = r4
            goto L8b
        L2b:
            java.lang.String r5 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r2, r5)     // Catch: java.lang.Throwable -> L21 java.lang.Exception -> L26
            gc.b.l(r3)
            return r4
        L34:
            java.lang.String r3 = r10.f1555a     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            if (r3 == 0) goto L48
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.lang.String r5 = r10.f1555a     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            goto L1f
        L40:
            r2 = move-exception
            r5 = r4
            goto L9d
        L43:
            r5 = move-exception
            r3 = r4
            r6 = r5
            r5 = r3
            goto L8b
        L48:
            java.io.FileDescriptor r3 = r10.f1556b     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            java.io.FileDescriptor r3 = B1.i.b(r3)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L43
            int r5 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
            r6 = 0
            B1.i.c(r3, r6, r5)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
            r9 = r5
            r5 = r3
            r3 = r9
        L5d:
            B1.b r6 = new B1.b     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            r6.<init>(r3)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            int r7 = r10.k     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            int r8 = r10.f1568o     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            int r7 = r7 + r8
            r6.a(r7)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            int r7 = r10.f1565l     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            r6.readFully(r7)     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            r10.f1566m = r7     // Catch: java.lang.Throwable -> L80 java.lang.Exception -> L82
            gc.b.l(r3)
            if (r5 == 0) goto L7f
            B1.i.a(r5)     // Catch: java.lang.Exception -> L7c
            return r7
        L7c:
            android.util.Log.e(r1, r0)
        L7f:
            return r7
        L80:
            r2 = move-exception
            goto L23
        L82:
            r6 = move-exception
            goto L8b
        L84:
            r2 = move-exception
            r5 = r3
            goto L9d
        L87:
            r5 = move-exception
            r6 = r5
            r5 = r3
            r3 = r4
        L8b:
            java.lang.String r7 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r2, r7, r6)     // Catch: java.lang.Throwable -> L80
            gc.b.l(r3)
            if (r5 == 0) goto L9c
            B1.i.a(r5)     // Catch: java.lang.Exception -> L99
            goto L9c
        L99:
            android.util.Log.e(r1, r0)
        L9c:
            return r4
        L9d:
            gc.b.l(r4)
            if (r5 == 0) goto La9
            B1.i.a(r5)     // Catch: java.lang.Exception -> La6
            goto La9
        La6:
            android.util.Log.e(r1, r0)
        La9:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.h.p():byte[]");
    }

    public final void q(b bVar) throws IOException {
        if (f1548t) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f1501c = ByteOrder.LITTLE_ENDIAN;
        bVar.a(f1524I.length);
        int i5 = bVar.readInt() + 8;
        byte[] bArr = f1525J;
        bVar.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i10 = bVar.readInt();
                int i11 = length + 8;
                if (Arrays.equals(f1526K, bArr2)) {
                    byte[] bArr3 = new byte[i10];
                    bVar.readFully(bArr3);
                    this.f1568o = i11;
                    y(0, bArr3);
                    H(new b(bArr3));
                    return;
                }
                if (i10 % 2 == 1) {
                    i10++;
                }
                length = i11 + i10;
                if (length == i5) {
                    return;
                }
                if (length > i5) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.a(i10);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void s(b bVar, HashMap map) throws IOException {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iH = dVar.h(this.f1561g);
        int iH2 = dVar2.h(this.f1561g);
        if (this.f1558d == 7) {
            iH += this.f1569p;
        }
        if (iH > 0 && iH2 > 0) {
            this.f1562h = true;
            if (this.f1555a == null && this.f1557c == null && this.f1556b == null) {
                byte[] bArr = new byte[iH2];
                bVar.a(iH);
                bVar.readFully(bArr);
                this.f1566m = bArr;
            }
            this.k = iH;
            this.f1565l = iH2;
        }
        if (f1548t) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iH + ", length: " + iH2);
        }
    }

    public final boolean t(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.h(this.f1561g) <= 512 && dVar2.h(this.f1561g) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x008f A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0004, B:5:0x0009, B:12:0x001e, B:18:0x003b, B:20:0x0046, B:28:0x005c, B:23:0x004d, B:26:0x0055, B:27:0x0059, B:29:0x0066, B:31:0x006f, B:33:0x0075, B:35:0x007b, B:37:0x0081, B:43:0x008f), top: B:53:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(java.io.InputStream r8) {
        /*
            r7 = this;
            boolean r0 = B1.h.f1548t
            r1 = 0
            r2 = r1
        L4:
            B1.e[][] r3 = B1.h.f1536V     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r3 = r3.length     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 >= r3) goto L1e
            java.util.HashMap[] r3 = r7.f1559e     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            java.util.HashMap r4 = new java.util.HashMap     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r4.<init>()     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3[r2] = r4     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r2 + 1
            goto L4
        L15:
            r8 = move-exception
            goto L97
        L18:
            r8 = move-exception
            goto L8d
        L1b:
            r8 = move-exception
            goto L8d
        L1e:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3 = 5000(0x1388, float:7.006E-42)
            r2.<init>(r8, r3)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r8 = r7.j(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r7.f1558d = r8     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r3 = 14
            r4 = 13
            r5 = 9
            r6 = 4
            if (r8 == r6) goto L66
            if (r8 == r5) goto L66
            if (r8 == r4) goto L66
            if (r8 != r3) goto L3b
            goto L66
        L3b:
            B1.g r8 = new B1.g     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r1 = r7.f1558d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r2 = 12
            if (r1 != r2) goto L4a
            r7.g(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L4a:
            r2 = 7
            if (r1 != r2) goto L51
            r7.k(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L51:
            r2 = 10
            if (r1 != r2) goto L59
            r7.o(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L5c
        L59:
            r7.n(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L5c:
            int r1 = r7.f1568o     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.b(r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r7.H(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L66:
            B1.b r8 = new B1.b     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            int r2 = r7.f1558d     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            if (r2 != r6) goto L73
            r7.h(r8, r1, r1)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L73:
            if (r2 != r4) goto L79
            r7.l(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L79:
            if (r2 != r5) goto L7f
            r7.m(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
            goto L84
        L7f:
            if (r2 != r3) goto L84
            r7.q(r8)     // Catch: java.lang.Throwable -> L15 java.lang.UnsupportedOperationException -> L18 java.io.IOException -> L1b
        L84:
            r7.a()
            if (r0 == 0) goto La8
            r7.w()
            return
        L8d:
            if (r0 == 0) goto La0
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r8)     // Catch: java.lang.Throwable -> L15
            goto La0
        L97:
            r7.a()
            if (r0 == 0) goto L9f
            r7.w()
        L9f:
            throw r8
        La0:
            r7.a()
            if (r0 == 0) goto La8
            r7.w()
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.h.u(java.io.InputStream):void");
    }

    public final void v(g gVar) throws IOException {
        ByteOrder byteOrderX = x(gVar);
        this.f1561g = byteOrderX;
        gVar.f1501c = byteOrderX;
        int unsignedShort = gVar.readUnsignedShort();
        int i5 = this.f1558d;
        if (i5 != 7 && i5 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i10 = gVar.readInt();
        if (i10 < 8) {
            throw new IOException(AbstractC3256n.g(i10, "Invalid first Ifd offset: "));
        }
        int i11 = i10 - 8;
        if (i11 > 0) {
            gVar.a(i11);
        }
    }

    public final void w() {
        int i5 = 0;
        while (true) {
            HashMap[] mapArr = this.f1559e;
            if (i5 >= mapArr.length) {
                return;
            }
            StringBuilder sbL = pd.f.l(i5, "The size of tag group[", "]: ");
            sbL.append(mapArr[i5].size());
            Log.d("ExifInterface", sbL.toString());
            for (Map.Entry entry : mapArr[i5].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.i(this.f1561g) + "'");
            }
            i5++;
        }
    }

    public final void y(int i5, byte[] bArr) throws IOException {
        g gVar = new g(bArr);
        v(gVar);
        z(gVar, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(B1.g r37, int r38) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 983
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B1.h.z(B1.g, int):void");
    }

    public h(InputStream inputStream) throws IOException {
        e[][] eVarArr = f1536V;
        this.f1559e = new HashMap[eVarArr.length];
        this.f1560f = new HashSet(eVarArr.length);
        this.f1561g = ByteOrder.BIG_ENDIAN;
        this.f1555a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.f1557c = (AssetManager.AssetInputStream) inputStream;
            this.f1556b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                i.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.f1557c = null;
                this.f1556b = fileInputStream.getFD();
            } catch (Exception unused) {
                if (f1548t) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        } else {
            this.f1557c = null;
            this.f1556b = null;
        }
        u(inputStream);
    }
}
