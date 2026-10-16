package defpackage;

import android.content.res.AssetManager;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* loaded from: classes2.dex */
public final class enf {
    private static final Set A;
    private static final HashMap B;
    private static final byte[] C;
    private static final xuf[] P;
    private static final xuf[] Q;
    private static final xuf[] R;
    private static final xuf[] S;
    private static final xuf[] T;
    private static final xuf U;
    private static final xuf[] V;
    private static final xuf[] W;
    private static final xuf[] X;
    private static final xuf[] Y;
    private static final xuf[] Z;
    public static final int[] a;
    public static final int[] b;
    static final byte[] c;
    static final byte[] d;
    public static final String[] e;
    public static final int[] f;
    public static final byte[] g;
    public static final Charset h;
    static final byte[] i;
    static final xuf[][] j;
    private static final boolean k = Log.isLoggable("ExifInterface", 3);
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    private static final byte[] o;
    private static final byte[] p;
    private static final byte[] q;
    private static final byte[] r;
    private static final byte[] s;
    private static final byte[] t;
    private static final byte[] u;
    private static final byte[] v;
    private static final SimpleDateFormat w;
    private static final SimpleDateFormat x;
    private static final HashMap[] y;
    private static final HashMap[] z;
    private final FileDescriptor D;
    private final AssetManager.AssetInputStream E;
    private int F;
    private final HashMap[] G;
    private final Set H;
    private ByteOrder I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private int N;
    private end O;

    static {
        Arrays.asList(1, 6, 3, 8);
        Arrays.asList(2, 7, 4, 5);
        a = new int[]{8, 8, 8};
        b = new int[]{8};
        c = new byte[]{-1, -40, -1};
        l = new byte[]{102, 116, 121, 112};
        m = new byte[]{109, 105, 102, 49};
        n = new byte[]{104, 101, 105, 99};
        o = new byte[]{97, 118, 105, 102};
        p = new byte[]{97, 118, 105, 115};
        q = new byte[]{79, 76, 89, 77, 80, 0};
        r = new byte[]{79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
        s = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
        d = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
        t = new byte[]{82, 73, 70, 70};
        u = new byte[]{87, 69, 66, 80};
        v = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        e = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        g = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        xuf[] xufVarArr = {new xuf("NewSubfileType", 254, 4), new xuf("SubfileType", 255, 4), new xuf("ImageWidth", 256, 3, 4), new xuf("ImageLength", 257, 3, 4), new xuf("BitsPerSample", 258, 3), new xuf("Compression", 259, 3), new xuf("PhotometricInterpretation", 262, 3), new xuf("ImageDescription", 270, 2), new xuf("Make", 271, 2), new xuf("Model", 272, 2), new xuf("StripOffsets", 273, 3, 4), new xuf("Orientation", 274, 3), new xuf("SamplesPerPixel", 277, 3), new xuf("RowsPerStrip", 278, 3, 4), new xuf("StripByteCounts", 279, 3, 4), new xuf("XResolution", 282, 5), new xuf("YResolution", 283, 5), new xuf("PlanarConfiguration", 284, 3), new xuf("ResolutionUnit", 296, 3), new xuf("TransferFunction", 301, 3), new xuf("Software", 305, 2), new xuf("DateTime", 306, 2), new xuf("Artist", 315, 2), new xuf("WhitePoint", 318, 5), new xuf("PrimaryChromaticities", 319, 5), new xuf("SubIFDPointer", 330, 4), new xuf("JPEGInterchangeFormat", 513, 4), new xuf("JPEGInterchangeFormatLength", 514, 4), new xuf("YCbCrCoefficients", 529, 5), new xuf("YCbCrSubSampling", 530, 3), new xuf("YCbCrPositioning", 531, 3), new xuf("ReferenceBlackWhite", 532, 5), new xuf("Copyright", 33432, 2), new xuf("ExifIFDPointer", 34665, 4), new xuf("GPSInfoIFDPointer", 34853, 4), new xuf("SensorTopBorder", 4, 4), new xuf("SensorLeftBorder", 5, 4), new xuf("SensorBottomBorder", 6, 4), new xuf("SensorRightBorder", 7, 4), new xuf("ISO", 23, 3), new xuf("JpgFromRaw", 46, 7), new xuf("Xmp", 700, 1)};
        P = xufVarArr;
        xuf[] xufVarArr2 = {new xuf("ExposureTime", 33434, 5), new xuf("FNumber", 33437, 5), new xuf("ExposureProgram", 34850, 3), new xuf("SpectralSensitivity", 34852, 2), new xuf("PhotographicSensitivity", 34855, 3), new xuf("OECF", 34856, 7), new xuf("SensitivityType", 34864, 3), new xuf("StandardOutputSensitivity", 34865, 4), new xuf("RecommendedExposureIndex", 34866, 4), new xuf("ISOSpeed", 34867, 4), new xuf("ISOSpeedLatitudeyyy", 34868, 4), new xuf("ISOSpeedLatitudezzz", 34869, 4), new xuf("ExifVersion", 36864, 2), new xuf("DateTimeOriginal", 36867, 2), new xuf("DateTimeDigitized", 36868, 2), new xuf("OffsetTime", 36880, 2), new xuf("OffsetTimeOriginal", 36881, 2), new xuf("OffsetTimeDigitized", 36882, 2), new xuf("ComponentsConfiguration", 37121, 7), new xuf("CompressedBitsPerPixel", 37122, 5), new xuf("ShutterSpeedValue", 37377, 10), new xuf("ApertureValue", 37378, 5), new xuf("BrightnessValue", 37379, 10), new xuf("ExposureBiasValue", 37380, 10), new xuf("MaxApertureValue", 37381, 5), new xuf("SubjectDistance", 37382, 5), new xuf("MeteringMode", 37383, 3), new xuf("LightSource", 37384, 3), new xuf("Flash", 37385, 3), new xuf("FocalLength", 37386, 5), new xuf("SubjectArea", 37396, 3), new xuf("MakerNote", 37500, 7), new xuf("UserComment", 37510, 7), new xuf("SubSecTime", 37520, 2), new xuf("SubSecTimeOriginal", 37521, 2), new xuf("SubSecTimeDigitized", 37522, 2), new xuf("FlashpixVersion", 40960, 7), new xuf("ColorSpace", 40961, 3), new xuf("PixelXDimension", 40962, 3, 4), new xuf("PixelYDimension", 40963, 3, 4), new xuf("RelatedSoundFile", 40964, 2), new xuf("InteroperabilityIFDPointer", 40965, 4), new xuf("FlashEnergy", 41483, 5), new xuf("SpatialFrequencyResponse", 41484, 7), new xuf("FocalPlaneXResolution", 41486, 5), new xuf("FocalPlaneYResolution", 41487, 5), new xuf("FocalPlaneResolutionUnit", 41488, 3), new xuf("SubjectLocation", 41492, 3), new xuf("ExposureIndex", 41493, 5), new xuf("SensingMethod", 41495, 3), new xuf("FileSource", 41728, 7), new xuf("SceneType", 41729, 7), new xuf("CFAPattern", 41730, 7), new xuf("CustomRendered", 41985, 3), new xuf("ExposureMode", 41986, 3), new xuf("WhiteBalance", 41987, 3), new xuf("DigitalZoomRatio", 41988, 5), new xuf("FocalLengthIn35mmFilm", 41989, 3), new xuf("SceneCaptureType", 41990, 3), new xuf("GainControl", 41991, 3), new xuf("Contrast", 41992, 3), new xuf("Saturation", 41993, 3), new xuf("Sharpness", 41994, 3), new xuf("DeviceSettingDescription", 41995, 7), new xuf("SubjectDistanceRange", 41996, 3), new xuf("ImageUniqueID", 42016, 2), new xuf("CameraOwnerName", 42032, 2), new xuf("BodySerialNumber", 42033, 2), new xuf("LensSpecification", 42034, 5), new xuf("LensMake", 42035, 2), new xuf("LensModel", 42036, 2), new xuf("Gamma", 42240, 5), new xuf("DNGVersion", 50706, 1), new xuf("DefaultCropSize", 50720, 3, 4)};
        Q = xufVarArr2;
        xuf[] xufVarArr3 = {new xuf("GPSVersionID", 0, 1), new xuf("GPSLatitudeRef", 1, 2), new xuf("GPSLatitude", 2, 5, 10), new xuf("GPSLongitudeRef", 3, 2), new xuf("GPSLongitude", 4, 5, 10), new xuf("GPSAltitudeRef", 5, 1), new xuf("GPSAltitude", 6, 5), new xuf("GPSTimeStamp", 7, 5), new xuf("GPSSatellites", 8, 2), new xuf("GPSStatus", 9, 2), new xuf("GPSMeasureMode", 10, 2), new xuf("GPSDOP", 11, 5), new xuf("GPSSpeedRef", 12, 2), new xuf("GPSSpeed", 13, 5), new xuf("GPSTrackRef", 14, 2), new xuf("GPSTrack", 15, 5), new xuf("GPSImgDirectionRef", 16, 2), new xuf("GPSImgDirection", 17, 5), new xuf("GPSMapDatum", 18, 2), new xuf("GPSDestLatitudeRef", 19, 2), new xuf("GPSDestLatitude", 20, 5), new xuf("GPSDestLongitudeRef", 21, 2), new xuf("GPSDestLongitude", 22, 5), new xuf("GPSDestBearingRef", 23, 2), new xuf("GPSDestBearing", 24, 5), new xuf("GPSDestDistanceRef", 25, 2), new xuf("GPSDestDistance", 26, 5), new xuf("GPSProcessingMethod", 27, 7), new xuf("GPSAreaInformation", 28, 7), new xuf("GPSDateStamp", 29, 2), new xuf("GPSDifferential", 30, 3), new xuf("GPSHPositioningError", 31, 5)};
        R = xufVarArr3;
        xuf[] xufVarArr4 = {new xuf("InteroperabilityIndex", 1, 2)};
        S = xufVarArr4;
        xuf[] xufVarArr5 = {new xuf("NewSubfileType", 254, 4), new xuf("SubfileType", 255, 4), new xuf("ThumbnailImageWidth", 256, 3, 4), new xuf("ThumbnailImageLength", 257, 3, 4), new xuf("BitsPerSample", 258, 3), new xuf("Compression", 259, 3), new xuf("PhotometricInterpretation", 262, 3), new xuf("ImageDescription", 270, 2), new xuf("Make", 271, 2), new xuf("Model", 272, 2), new xuf("StripOffsets", 273, 3, 4), new xuf("ThumbnailOrientation", 274, 3), new xuf("SamplesPerPixel", 277, 3), new xuf("RowsPerStrip", 278, 3, 4), new xuf("StripByteCounts", 279, 3, 4), new xuf("XResolution", 282, 5), new xuf("YResolution", 283, 5), new xuf("PlanarConfiguration", 284, 3), new xuf("ResolutionUnit", 296, 3), new xuf("TransferFunction", 301, 3), new xuf("Software", 305, 2), new xuf("DateTime", 306, 2), new xuf("Artist", 315, 2), new xuf("WhitePoint", 318, 5), new xuf("PrimaryChromaticities", 319, 5), new xuf("SubIFDPointer", 330, 4), new xuf("JPEGInterchangeFormat", 513, 4), new xuf("JPEGInterchangeFormatLength", 514, 4), new xuf("YCbCrCoefficients", 529, 5), new xuf("YCbCrSubSampling", 530, 3), new xuf("YCbCrPositioning", 531, 3), new xuf("ReferenceBlackWhite", 532, 5), new xuf("Copyright", 33432, 2), new xuf("ExifIFDPointer", 34665, 4), new xuf("GPSInfoIFDPointer", 34853, 4), new xuf("DNGVersion", 50706, 1), new xuf("DefaultCropSize", 50720, 3, 4)};
        T = xufVarArr5;
        U = new xuf("StripOffsets", 273, 3);
        xuf[] xufVarArr6 = {new xuf("ThumbnailImage", 256, 7), new xuf("CameraSettingsIFDPointer", 8224, 4), new xuf("ImageProcessingIFDPointer", 8256, 4)};
        V = xufVarArr6;
        xuf[] xufVarArr7 = {new xuf("PreviewImageStart", 257, 4), new xuf("PreviewImageLength", 258, 4)};
        W = xufVarArr7;
        xuf[] xufVarArr8 = {new xuf("AspectFrame", 4371, 3)};
        X = xufVarArr8;
        xuf[] xufVarArr9 = {new xuf("ColorSpace", 55, 3)};
        Y = xufVarArr9;
        j = new xuf[][]{xufVarArr, xufVarArr2, xufVarArr3, xufVarArr4, xufVarArr5, xufVarArr, xufVarArr6, xufVarArr7, xufVarArr8, xufVarArr9};
        Z = new xuf[]{new xuf("SubIFDPointer", 330, 4), new xuf("ExifIFDPointer", 34665, 4), new xuf("GPSInfoIFDPointer", 34853, 4), new xuf("InteroperabilityIFDPointer", 40965, 4), new xuf("CameraSettingsIFDPointer", 8224, 1), new xuf("ImageProcessingIFDPointer", 8256, 1)};
        y = new HashMap[10];
        z = new HashMap[10];
        A = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        B = new HashMap();
        Charset charsetForName = Charset.forName("US-ASCII");
        h = charsetForName;
        i = "Exif\u0000\u0000".getBytes(charsetForName);
        C = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        w = simpleDateFormat;
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        x = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            xuf[][] xufVarArr10 = j;
            int length = xufVarArr10.length;
            if (i2 >= 10) {
                xuf[] xufVarArr11 = Z;
                Integer numValueOf = Integer.valueOf(xufVarArr11[0].b);
                HashMap map = B;
                map.put(numValueOf, 5);
                map.put(Integer.valueOf(xufVarArr11[1].b), 1);
                map.put(Integer.valueOf(xufVarArr11[2].b), 2);
                map.put(Integer.valueOf(xufVarArr11[3].b), 3);
                map.put(Integer.valueOf(xufVarArr11[4].b), 7);
                map.put(Integer.valueOf(xufVarArr11[5].b), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            y[i2] = new HashMap();
            z[i2] = new HashMap();
            for (xuf xufVar : xufVarArr10[i2]) {
                y[i2].put(Integer.valueOf(xufVar.b), xufVar);
                z[i2].put(xufVar.d, xufVar);
            }
            i2++;
        }
    }

    public enf(InputStream inputStream) throws Throwable {
        int length = j.length;
        this.G = new HashMap[10];
        this.H = new HashSet(10);
        this.I = ByteOrder.BIG_ENDIAN;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.E = (AssetManager.AssetInputStream) inputStream;
            this.D = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.E = null;
                this.D = fileInputStream.getFD();
            } catch (Exception unused) {
                if (k) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        } else {
            this.E = null;
            this.D = null;
        }
        j(inputStream);
    }

    private final end c(String str) {
        end endVar;
        int i2;
        end endVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (k) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        int i3 = 0;
        if ("Xmp".equals(str) && (i2 = this.F) != 4 && ((i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) && (endVar2 = this.O) != null)) {
            return endVar2;
        }
        while (true) {
            int length = j.length;
            if (i3 >= 10) {
                if (!"Xmp".equals(str) || (endVar = this.O) == null) {
                    return null;
                }
                return endVar;
            }
            end endVar3 = (end) this.G[i3].get(str);
            if (endVar3 != null) {
                return endVar3;
            }
            i3++;
        }
    }

    private final void d() throws Throwable {
        String strA = a("DateTimeOriginal");
        if (strA != null && a("DateTime") == null) {
            this.G[0].put("DateTime", end.b(strA));
        }
        if (a("ImageWidth") == null) {
            this.G[0].put("ImageWidth", end.c(0L, this.I));
        }
        if (a("ImageLength") == null) {
            this.G[0].put("ImageLength", end.c(0L, this.I));
        }
        if (a("Orientation") == null) {
            this.G[0].put("Orientation", end.c(0L, this.I));
        }
        if (a("LightSource") == null) {
            this.G[1].put("LightSource", end.c(0L, this.I));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x015d, code lost:
    
        r21.c = r20.I;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0161, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(defpackage.enc r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enf.e(enc, int, int):void");
    }

    private final void f(enc encVar) throws Throwable {
        byte[] bArr;
        int length;
        if (k) {
            Objects.toString(encVar);
            Log.d("ExifInterface", "getPngAttributes starting with: ".concat(encVar.toString()));
        }
        encVar.c = ByteOrder.BIG_ENDIAN;
        int i2 = encVar.b;
        int length2 = s.length;
        encVar.b(8);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2) {
                if (z3) {
                    return;
                } else {
                    z3 = false;
                }
            }
            try {
                int i3 = encVar.readInt();
                int i4 = encVar.readInt();
                int i5 = encVar.b;
                int i6 = i5 + i3;
                int i7 = i5 - i2;
                if (i7 == 16) {
                    if (i4 != 1229472850) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                    }
                    i7 = 16;
                }
                if (i4 == 1229278788) {
                    return;
                }
                if (i4 == 1700284774) {
                    if (z2) {
                        continue;
                    } else {
                        this.K = i7;
                        byte[] bArr2 = new byte[i3];
                        encVar.readFully(bArr2);
                        int i8 = encVar.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
                        crc32.update(25944);
                        crc32.update(6641737);
                        crc32.update(1700284774);
                        crc32.update(bArr2);
                        if (((int) crc32.getValue()) != i8) {
                            throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i8 + ", calculated CRC value: " + crc32.getValue());
                        }
                        m(bArr2, 0);
                        q();
                        o(new enc(bArr2));
                        z2 = true;
                    }
                } else if (i4 == 1767135348 && !z3 && i3 >= (length = (bArr = d).length)) {
                    byte[] bArr3 = new byte[length];
                    encVar.readFully(bArr3);
                    if (Arrays.equals(bArr3, bArr)) {
                        int i9 = encVar.b - i2;
                        int i10 = i3 - length;
                        byte[] bArr4 = new byte[i10];
                        encVar.readFully(bArr4);
                        this.O = new end(1, i10, i9, bArr4);
                        z3 = true;
                    }
                }
                encVar.b((i6 + 4) - encVar.b);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.", e2);
            }
        }
    }

    private final void g(enc encVar) throws Throwable {
        if (k) {
            Objects.toString(encVar);
            Log.d("ExifInterface", "getWebpAttributes starting with: ".concat(encVar.toString()));
        }
        encVar.c = ByteOrder.LITTLE_ENDIAN;
        int length = t.length;
        encVar.b(4);
        int i2 = encVar.readInt() + 8;
        int length2 = u.length;
        encVar.b(4);
        int i3 = 12;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                encVar.readFully(bArr);
                int i4 = encVar.readInt();
                int i5 = i3 + 8;
                if (Arrays.equals(v, bArr)) {
                    byte[] bArrCopyOfRange = new byte[i4];
                    encVar.readFully(bArrCopyOfRange);
                    byte[] bArr2 = i;
                    if (dtk.g(bArrCopyOfRange, bArr2)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr2.length, i4);
                    }
                    this.K = i5;
                    m(bArrCopyOfRange, 0);
                    o(new enc(bArrCopyOfRange));
                    return;
                }
                if (i4 % 2 == 1) {
                    i4++;
                }
                i3 = i5 + i4;
                if (i3 == i2) {
                    return;
                }
                if (i3 > i2) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                encVar.b(i4);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    private final void h(enc encVar, HashMap map) throws Throwable {
        end endVar = (end) map.get("JPEGInterchangeFormat");
        end endVar2 = (end) map.get("JPEGInterchangeFormatLength");
        if (endVar == null || endVar2 == null) {
            return;
        }
        int iA = endVar.a(this.I);
        int iA2 = endVar2.a(this.I);
        if (this.F == 7) {
            iA += this.L;
        }
        if (iA > 0 && iA2 > 0 && this.E == null && this.D == null) {
            encVar.b(iA);
            encVar.readFully(new byte[iA2]);
        }
        if (k) {
            Log.d("ExifInterface", a.bo(iA2, iA, "Setting thumbnail attributes with offset: ", ", length: "));
        }
    }

    private final void i(enc encVar, HashMap map) throws IOException {
        int length;
        int length2;
        byte[] bArr;
        end endVar = (end) map.get("StripOffsets");
        end endVar2 = (end) map.get("StripByteCounts");
        if (endVar == null || endVar2 == null) {
            return;
        }
        long[] jArrH = dtk.h(endVar.f(this.I));
        long[] jArrH2 = dtk.h(endVar2.f(this.I));
        if (jArrH == null || (length = jArrH.length) == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrH2 == null || (length2 = jArrH2.length) == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (length != length2) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j2 = 0;
        for (long j3 : jArrH2) {
            j2 += j3;
        }
        byte[] bArr2 = new byte[(int) j2];
        this.J = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int length3 = jArrH.length;
            if (i2 >= length3) {
                if (this.J) {
                    long j4 = jArrH[0];
                    return;
                }
                return;
            }
            int i5 = (int) jArrH[i2];
            int i6 = (int) jArrH2[i2];
            if (i2 < length3 - 1) {
                bArr = bArr2;
                if (i5 + i6 != jArrH[i2 + 1]) {
                    this.J = false;
                }
            } else {
                bArr = bArr2;
            }
            int i7 = i5 - i3;
            if (i7 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                encVar.b(i7);
                int i8 = i3 + i7;
                byte[] bArr3 = new byte[i6];
                try {
                    encVar.readFully(bArr3);
                    i2++;
                    i3 = i8 + i6;
                    System.arraycopy(bArr3, 0, bArr, i4, i6);
                    i4 += i6;
                    bArr2 = bArr;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", a.bn(i6, "Failed to read ", " bytes."));
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", a.bn(i7, "Failed to skip ", " bytes."));
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03d0 A[Catch: all -> 0x04a5, UnsupportedOperationException -> 0x04a7, IOException -> 0x04a9, TryCatch #2 {all -> 0x04a5, blocks: (B:3:0x0009, B:5:0x0010, B:6:0x001c, B:7:0x0031, B:9:0x0045, B:11:0x004d, B:12:0x0059, B:14:0x005c, B:16:0x0062, B:27:0x0087, B:41:0x00b0, B:54:0x00cd, B:56:0x00d2, B:59:0x00da, B:61:0x00df, B:64:0x00e8, B:66:0x00ed, B:68:0x00f2, B:71:0x00fc, B:73:0x0101, B:48:0x00c1, B:49:0x00c4, B:52:0x00c8, B:34:0x0095, B:35:0x0098, B:38:0x009c, B:79:0x0115, B:86:0x0126, B:92:0x013b, B:94:0x014c, B:96:0x0174, B:100:0x0185, B:103:0x01a2, B:104:0x01b0, B:106:0x01bc, B:108:0x01c6, B:111:0x01ca, B:113:0x01d1, B:115:0x01d7, B:117:0x01df, B:118:0x01e3, B:119:0x01fb, B:97:0x017a, B:99:0x0180, B:183:0x03b6, B:122:0x0212, B:123:0x0217, B:125:0x021b, B:126:0x022b, B:128:0x023c, B:129:0x0249, B:132:0x025f, B:135:0x026a, B:138:0x026f, B:139:0x0276, B:140:0x0277, B:182:0x03b3, B:190:0x03cc, B:191:0x03cf, B:192:0x03d0, B:194:0x03d9, B:196:0x03e1, B:199:0x03ea, B:200:0x03ef, B:202:0x03f3, B:203:0x0403, B:205:0x0453, B:208:0x045f, B:210:0x046d, B:212:0x0491, B:213:0x049d, B:75:0x0106, B:77:0x010c, B:220:0x04aa, B:222:0x04ae), top: B:238:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03d9 A[Catch: all -> 0x04a5, UnsupportedOperationException -> 0x04a7, IOException -> 0x04a9, TryCatch #2 {all -> 0x04a5, blocks: (B:3:0x0009, B:5:0x0010, B:6:0x001c, B:7:0x0031, B:9:0x0045, B:11:0x004d, B:12:0x0059, B:14:0x005c, B:16:0x0062, B:27:0x0087, B:41:0x00b0, B:54:0x00cd, B:56:0x00d2, B:59:0x00da, B:61:0x00df, B:64:0x00e8, B:66:0x00ed, B:68:0x00f2, B:71:0x00fc, B:73:0x0101, B:48:0x00c1, B:49:0x00c4, B:52:0x00c8, B:34:0x0095, B:35:0x0098, B:38:0x009c, B:79:0x0115, B:86:0x0126, B:92:0x013b, B:94:0x014c, B:96:0x0174, B:100:0x0185, B:103:0x01a2, B:104:0x01b0, B:106:0x01bc, B:108:0x01c6, B:111:0x01ca, B:113:0x01d1, B:115:0x01d7, B:117:0x01df, B:118:0x01e3, B:119:0x01fb, B:97:0x017a, B:99:0x0180, B:183:0x03b6, B:122:0x0212, B:123:0x0217, B:125:0x021b, B:126:0x022b, B:128:0x023c, B:129:0x0249, B:132:0x025f, B:135:0x026a, B:138:0x026f, B:139:0x0276, B:140:0x0277, B:182:0x03b3, B:190:0x03cc, B:191:0x03cf, B:192:0x03d0, B:194:0x03d9, B:196:0x03e1, B:199:0x03ea, B:200:0x03ef, B:202:0x03f3, B:203:0x0403, B:205:0x0453, B:208:0x045f, B:210:0x046d, B:212:0x0491, B:213:0x049d, B:75:0x0106, B:77:0x010c, B:220:0x04aa, B:222:0x04ae), top: B:238:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04ae A[Catch: all -> 0x04a5, TRY_LEAVE, TryCatch #2 {all -> 0x04a5, blocks: (B:3:0x0009, B:5:0x0010, B:6:0x001c, B:7:0x0031, B:9:0x0045, B:11:0x004d, B:12:0x0059, B:14:0x005c, B:16:0x0062, B:27:0x0087, B:41:0x00b0, B:54:0x00cd, B:56:0x00d2, B:59:0x00da, B:61:0x00df, B:64:0x00e8, B:66:0x00ed, B:68:0x00f2, B:71:0x00fc, B:73:0x0101, B:48:0x00c1, B:49:0x00c4, B:52:0x00c8, B:34:0x0095, B:35:0x0098, B:38:0x009c, B:79:0x0115, B:86:0x0126, B:92:0x013b, B:94:0x014c, B:96:0x0174, B:100:0x0185, B:103:0x01a2, B:104:0x01b0, B:106:0x01bc, B:108:0x01c6, B:111:0x01ca, B:113:0x01d1, B:115:0x01d7, B:117:0x01df, B:118:0x01e3, B:119:0x01fb, B:97:0x017a, B:99:0x0180, B:183:0x03b6, B:122:0x0212, B:123:0x0217, B:125:0x021b, B:126:0x022b, B:128:0x023c, B:129:0x0249, B:132:0x025f, B:135:0x026a, B:138:0x026f, B:139:0x0276, B:140:0x0277, B:182:0x03b3, B:190:0x03cc, B:191:0x03cf, B:192:0x03d0, B:194:0x03d9, B:196:0x03e1, B:199:0x03ea, B:200:0x03ef, B:202:0x03f3, B:203:0x0403, B:205:0x0453, B:208:0x045f, B:210:0x046d, B:212:0x0491, B:213:0x049d, B:75:0x0106, B:77:0x010c, B:220:0x04aa, B:222:0x04ae), top: B:238:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04ba A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d2 A[Catch: all -> 0x04a5, UnsupportedOperationException -> 0x04a7, IOException -> 0x04a9, TryCatch #2 {all -> 0x04a5, blocks: (B:3:0x0009, B:5:0x0010, B:6:0x001c, B:7:0x0031, B:9:0x0045, B:11:0x004d, B:12:0x0059, B:14:0x005c, B:16:0x0062, B:27:0x0087, B:41:0x00b0, B:54:0x00cd, B:56:0x00d2, B:59:0x00da, B:61:0x00df, B:64:0x00e8, B:66:0x00ed, B:68:0x00f2, B:71:0x00fc, B:73:0x0101, B:48:0x00c1, B:49:0x00c4, B:52:0x00c8, B:34:0x0095, B:35:0x0098, B:38:0x009c, B:79:0x0115, B:86:0x0126, B:92:0x013b, B:94:0x014c, B:96:0x0174, B:100:0x0185, B:103:0x01a2, B:104:0x01b0, B:106:0x01bc, B:108:0x01c6, B:111:0x01ca, B:113:0x01d1, B:115:0x01d7, B:117:0x01df, B:118:0x01e3, B:119:0x01fb, B:97:0x017a, B:99:0x0180, B:183:0x03b6, B:122:0x0212, B:123:0x0217, B:125:0x021b, B:126:0x022b, B:128:0x023c, B:129:0x0249, B:132:0x025f, B:135:0x026a, B:138:0x026f, B:139:0x0276, B:140:0x0277, B:182:0x03b3, B:190:0x03cc, B:191:0x03cf, B:192:0x03d0, B:194:0x03d9, B:196:0x03e1, B:199:0x03ea, B:200:0x03ef, B:202:0x03f3, B:203:0x0403, B:205:0x0453, B:208:0x045f, B:210:0x046d, B:212:0x0491, B:213:0x049d, B:75:0x0106, B:77:0x010c, B:220:0x04aa, B:222:0x04ae), top: B:238:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j(java.io.InputStream r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enf.j(java.io.InputStream):void");
    }

    private final void k(enc encVar) throws IOException {
        ByteOrder byteOrderW = w(encVar);
        this.I = byteOrderW;
        encVar.c = byteOrderW;
        int unsignedShort = encVar.readUnsignedShort();
        int i2 = this.F;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: ".concat(String.valueOf(Integer.toHexString(unsignedShort))));
        }
        int i3 = encVar.readInt();
        if (i3 < 8) {
            throw new IOException(a.bp(i3, "Invalid first Ifd offset: "));
        }
        int i4 = i3 - 8;
        if (i4 > 0) {
            encVar.b(i4);
        }
    }

    private final void l() {
        for (int i2 = 0; i2 < 10; i2++) {
            StringBuilder sb = new StringBuilder("The size of tag group[");
            sb.append(i2);
            sb.append("]: ");
            HashMap[] mapArr = this.G;
            sb.append(mapArr[i2].size());
            Log.d("ExifInterface", sb.toString());
            for (Map.Entry entry : mapArr[i2].entrySet()) {
                end endVar = (end) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + endVar.toString() + ", tagValue: '" + endVar.g(this.I) + "'");
            }
        }
    }

    private final void m(byte[] bArr, int i2) throws IOException {
        enc encVar = new enc(bArr, (byte[]) null);
        k(encVar);
        t(encVar, i2);
    }

    private final void n(int i2, String str, String str2) {
        HashMap[] mapArr = this.G;
        if (mapArr[i2].isEmpty() || mapArr[i2].get(str) == null) {
            return;
        }
        HashMap map = mapArr[i2];
        map.put(str2, (end) map.get(str));
        mapArr[i2].remove(str);
    }

    private final void o(enc encVar) throws Throwable {
        end endVar;
        int iA;
        HashMap map = this.G[4];
        end endVar2 = (end) map.get("Compression");
        if (endVar2 == null) {
            h(encVar, map);
            return;
        }
        int iA2 = endVar2.a(this.I);
        if (iA2 != 1) {
            if (iA2 == 6) {
                h(encVar, map);
                return;
            } else if (iA2 != 7) {
                return;
            }
        }
        end endVar3 = (end) map.get("BitsPerSample");
        if (endVar3 != null) {
            int[] iArr = (int[]) endVar3.f(this.I);
            int[] iArr2 = a;
            if (Arrays.equals(iArr2, iArr) || (this.F == 3 && (endVar = (end) map.get("PhotometricInterpretation")) != null && ((iA = endVar.a(this.I)) != 1 ? !(iA != 6 || !Arrays.equals(iArr, iArr2)) : Arrays.equals(iArr, b)))) {
                i(encVar, map);
                return;
            }
        }
        if (k) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    private final void p(int i2, int i3) throws Throwable {
        HashMap[] mapArr = this.G;
        if (mapArr[i2].isEmpty() || mapArr[i3].isEmpty()) {
            if (k) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        end endVar = (end) mapArr[i2].get("ImageLength");
        end endVar2 = (end) mapArr[i2].get("ImageWidth");
        end endVar3 = (end) mapArr[i3].get("ImageLength");
        end endVar4 = (end) mapArr[i3].get("ImageWidth");
        if (endVar == null || endVar2 == null) {
            if (k) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (endVar3 == null || endVar4 == null) {
            if (k) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iA = endVar.a(this.I);
        int iA2 = endVar2.a(this.I);
        int iA3 = endVar3.a(this.I);
        int iA4 = endVar4.a(this.I);
        if (iA >= iA3 || iA2 >= iA4) {
            return;
        }
        HashMap map = mapArr[i2];
        mapArr[i2] = mapArr[i3];
        mapArr[i3] = map;
    }

    private final void q() throws Throwable {
        p(0, 5);
        p(0, 4);
        p(5, 4);
        HashMap[] mapArr = this.G;
        end endVar = (end) mapArr[1].get("PixelXDimension");
        end endVar2 = (end) mapArr[1].get("PixelYDimension");
        if (endVar != null && endVar2 != null) {
            mapArr[0].put("ImageWidth", endVar);
            mapArr[0].put("ImageLength", endVar2);
        }
        if (mapArr[4].isEmpty() && r(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap();
        }
        if (!r(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        n(0, "ThumbnailOrientation", "Orientation");
        n(0, "ThumbnailImageLength", "ImageLength");
        n(0, "ThumbnailImageWidth", "ImageWidth");
        n(5, "ThumbnailOrientation", "Orientation");
        n(5, "ThumbnailImageLength", "ImageLength");
        n(5, "ThumbnailImageWidth", "ImageWidth");
        n(4, "Orientation", "ThumbnailOrientation");
        n(4, "ImageLength", "ThumbnailImageLength");
        n(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private final boolean r(HashMap map) {
        end endVar = (end) map.get("ImageLength");
        end endVar2 = (end) map.get("ImageWidth");
        if (endVar == null || endVar2 == null) {
            return false;
        }
        return endVar.a(this.I) <= 512 && endVar2.a(this.I) <= 512;
    }

    private final void s(enc encVar) throws Throwable {
        k(encVar);
        t(encVar, 0);
        u(encVar, 0);
        u(encVar, 5);
        u(encVar, 4);
        q();
        if (this.F == 8) {
            HashMap[] mapArr = this.G;
            end endVar = (end) mapArr[1].get("MakerNote");
            if (endVar != null) {
                enc encVar2 = new enc(endVar.d, (byte[]) null);
                encVar2.c = this.I;
                encVar2.b(6);
                t(encVar2, 9);
                end endVar2 = (end) mapArr[9].get("ColorSpace");
                if (endVar2 != null) {
                    mapArr[1].put("ColorSpace", endVar2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void t(defpackage.enc r34, int r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enf.t(enc, int):void");
    }

    private final void u(enc encVar, int i2) throws Throwable {
        end endVarE;
        end endVarE2;
        HashMap[] mapArr = this.G;
        end endVar = (end) mapArr[i2].get("DefaultCropSize");
        end endVar2 = (end) mapArr[i2].get("SensorTopBorder");
        end endVar3 = (end) mapArr[i2].get("SensorLeftBorder");
        end endVar4 = (end) mapArr[i2].get("SensorBottomBorder");
        end endVar5 = (end) mapArr[i2].get("SensorRightBorder");
        if (endVar != null) {
            int i3 = endVar.a;
            ByteOrder byteOrder = this.I;
            if (i3 == 5) {
                ene[] eneVarArr = (ene[]) endVar.f(byteOrder);
                if (eneVarArr == null || eneVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(eneVarArr))));
                    return;
                } else {
                    endVarE = end.d(eneVarArr[0], this.I);
                    endVarE2 = end.d(eneVarArr[1], this.I);
                }
            } else {
                int[] iArr = (int[]) endVar.f(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(String.valueOf(Arrays.toString(iArr))));
                    return;
                } else {
                    endVarE = end.e(iArr[0], this.I);
                    endVarE2 = end.e(iArr[1], this.I);
                }
            }
            mapArr[i2].put("ImageWidth", endVarE);
            mapArr[i2].put("ImageLength", endVarE2);
            return;
        }
        if (endVar2 != null && endVar3 != null && endVar4 != null && endVar5 != null) {
            int iA = endVar2.a(this.I);
            int iA2 = endVar4.a(this.I);
            int iA3 = endVar5.a(this.I);
            int iA4 = endVar3.a(this.I);
            if (iA2 <= iA || iA3 <= iA4) {
                return;
            }
            end endVarE3 = end.e(iA2 - iA, this.I);
            end endVarE4 = end.e(iA3 - iA4, this.I);
            mapArr[i2].put("ImageLength", endVarE3);
            mapArr[i2].put("ImageWidth", endVarE4);
            return;
        }
        end endVar6 = (end) mapArr[i2].get("ImageLength");
        end endVar7 = (end) mapArr[i2].get("ImageWidth");
        if (endVar6 == null || endVar7 == null) {
            end endVar8 = (end) mapArr[i2].get("JPEGInterchangeFormat");
            end endVar9 = (end) mapArr[i2].get("JPEGInterchangeFormatLength");
            if (endVar8 == null || endVar9 == null) {
                return;
            }
            int iA5 = endVar8.a(this.I);
            int iA6 = endVar9.a(this.I);
            encVar.c(iA5);
            byte[] bArr = new byte[iA6];
            encVar.readFully(bArr);
            e(new enc(bArr), iA5, i2);
        }
    }

    private static final int v(byte[] bArr) throws Throwable {
        enc encVar;
        long j2;
        byte[] bArr2;
        long j3;
        enc encVar2 = null;
        try {
            try {
                encVar = new enc(bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            j2 = encVar.readInt();
            bArr2 = new byte[4];
            encVar.readFully(bArr2);
        } catch (Exception e3) {
            e = e3;
            encVar2 = encVar;
            if (k) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (encVar2 != null) {
                encVar2.close();
            }
            return 0;
        } catch (Throwable th2) {
            th = th2;
            encVar2 = encVar;
            if (encVar2 != null) {
                encVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, l)) {
            encVar.close();
            return 0;
        }
        if (j2 == 1) {
            j2 = encVar.readLong();
            j3 = 16;
            if (j2 < 16) {
                encVar.close();
                return 0;
            }
        } else {
            j3 = 8;
        }
        if (j2 > 5000) {
            j2 = 5000;
        }
        long j4 = j2 - j3;
        if (j4 < 8) {
            encVar.close();
            return 0;
        }
        byte[] bArr3 = new byte[4];
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (long j5 = 0; j5 < (j4 >> 2); j5++) {
            try {
                encVar.readFully(bArr3);
                if (j5 != 1) {
                    if (Arrays.equals(bArr3, m)) {
                        z2 = true;
                    } else if (Arrays.equals(bArr3, n)) {
                        z3 = true;
                    } else if (Arrays.equals(bArr3, o) || Arrays.equals(bArr3, p)) {
                        z4 = true;
                    }
                    if (!z2) {
                        continue;
                    } else {
                        if (z3) {
                            encVar.close();
                            return 12;
                        }
                        if (z4) {
                            encVar.close();
                            return 15;
                        }
                    }
                }
            } catch (EOFException unused) {
                encVar.close();
                return 0;
            }
        }
        encVar.close();
        return 0;
    }

    private static final ByteOrder w(enc encVar) throws IOException {
        short s2 = encVar.readShort();
        if (s2 == 18761) {
            if (k) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 != 19789) {
            throw new IOException("Invalid byte order: ".concat(String.valueOf(Integer.toHexString(s2))));
        }
        if (k) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final String a(String str) throws Throwable {
        double d2;
        end endVarC = c(str);
        if (endVarC == null) {
            return null;
        }
        if (str.equals("GPSTimeStamp")) {
            int i2 = endVarC.a;
            if (i2 != 5 && i2 != 10) {
                Log.w("ExifInterface", a.bp(i2, "GPS Timestamp format is not rational. format="));
                return null;
            }
            ene[] eneVarArr = (ene[]) endVarC.f(this.I);
            if (eneVarArr == null || eneVarArr.length != 3) {
                Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(String.valueOf(Arrays.toString(eneVarArr))));
                return null;
            }
            ene eneVar = eneVarArr[0];
            Integer numValueOf = Integer.valueOf((int) (eneVar.a / eneVar.b));
            ene eneVar2 = eneVarArr[1];
            Integer numValueOf2 = Integer.valueOf((int) (eneVar2.a / eneVar2.b));
            ene eneVar3 = eneVarArr[2];
            return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (eneVar3.a / eneVar3.b)));
        }
        boolean zContains = A.contains(str);
        ByteOrder byteOrder = this.I;
        if (!zContains) {
            return endVarC.g(byteOrder);
        }
        try {
            Object objF = endVarC.f(byteOrder);
            if (objF == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objF instanceof String) {
                d2 = Double.parseDouble((String) objF);
            } else if (objF instanceof long[]) {
                long[] jArr = (long[]) objF;
                if (jArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = jArr[0];
            } else if (objF instanceof int[]) {
                int[] iArr = (int[]) objF;
                if (iArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = iArr[0];
            } else if (objF instanceof double[]) {
                double[] dArr = (double[]) objF;
                if (dArr.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                d2 = dArr[0];
            } else {
                if (!(objF instanceof ene[])) {
                    throw new NumberFormatException("Couldn't find a double value");
                }
                ene[] eneVarArr2 = (ene[]) objF;
                if (eneVarArr2.length != 1) {
                    throw new NumberFormatException("There are more than one component");
                }
                ene eneVar4 = eneVarArr2[0];
                d2 = eneVar4.a / eneVar4.b;
            }
            return Double.toString(d2);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final int b() {
        end endVarC = c("Orientation");
        if (endVarC == null) {
            return 1;
        }
        try {
            return endVarC.a(this.I);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }
}
