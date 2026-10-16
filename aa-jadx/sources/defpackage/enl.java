package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class enl {
    private static final java.util.Set A;
    private static final java.util.HashMap B;
    private static final byte[] C;
    private static final defpackage.xvl[] P;
    private static final defpackage.xvl[] Q;
    private static final defpackage.xvl[] R;
    private static final defpackage.xvl[] S;
    private static final defpackage.xvl[] T;
    private static final defpackage.xvl U;
    private static final defpackage.xvl[] V;
    private static final defpackage.xvl[] W;
    private static final defpackage.xvl[] X;
    private static final defpackage.xvl[] Y;
    private static final defpackage.xvl[] Z;
    public static final int[] a;
    public static final int[] b;
    static final byte[] c;
    static final byte[] d;
    public static final java.lang.String[] e;
    public static final int[] f;
    public static final byte[] g;
    public static final java.nio.charset.Charset h;
    static final byte[] i;
    static final defpackage.xvl[][] j;
    private static final boolean k = android.util.Log.isLoggable("ExifInterface", 3);
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
    private static final java.text.SimpleDateFormat w;
    private static final java.text.SimpleDateFormat x;
    private static final java.util.HashMap[] y;
    private static final java.util.HashMap[] z;
    private final java.io.FileDescriptor D;
    private final android.content.res.AssetManager.AssetInputStream E;
    private int F;
    private final java.util.HashMap[] G;
    private final java.util.Set H;
    private java.nio.ByteOrder I;
    private boolean J;
    private int K;
    private int L;
    private int M;
    private int N;
    private defpackage.enj O;

    static {
        java.util.Arrays.asList(1, 6, 3, 8);
        java.util.Arrays.asList(2, 7, 4, 5);
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
        d = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(java.nio.charset.StandardCharsets.UTF_8);
        t = new byte[]{82, 73, 70, 70};
        u = new byte[]{87, 69, 66, 80};
        v = new byte[]{69, 88, 73, 70};
        "VP8X".getBytes(java.nio.charset.Charset.defaultCharset());
        "VP8L".getBytes(java.nio.charset.Charset.defaultCharset());
        "VP8 ".getBytes(java.nio.charset.Charset.defaultCharset());
        "ANIM".getBytes(java.nio.charset.Charset.defaultCharset());
        "ANMF".getBytes(java.nio.charset.Charset.defaultCharset());
        e = new java.lang.String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        f = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        g = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        defpackage.xvl[] xvlVarArr = {new defpackage.xvl("NewSubfileType", 254, 4), new defpackage.xvl("SubfileType", 255, 4), new defpackage.xvl("ImageWidth", 256, 3, 4), new defpackage.xvl("ImageLength", 257, 3, 4), new defpackage.xvl("BitsPerSample", 258, 3), new defpackage.xvl("Compression", 259, 3), new defpackage.xvl("PhotometricInterpretation", 262, 3), new defpackage.xvl("ImageDescription", 270, 2), new defpackage.xvl("Make", 271, 2), new defpackage.xvl("Model", 272, 2), new defpackage.xvl("StripOffsets", 273, 3, 4), new defpackage.xvl("Orientation", 274, 3), new defpackage.xvl("SamplesPerPixel", 277, 3), new defpackage.xvl("RowsPerStrip", 278, 3, 4), new defpackage.xvl("StripByteCounts", 279, 3, 4), new defpackage.xvl("XResolution", 282, 5), new defpackage.xvl("YResolution", 283, 5), new defpackage.xvl("PlanarConfiguration", 284, 3), new defpackage.xvl("ResolutionUnit", 296, 3), new defpackage.xvl("TransferFunction", 301, 3), new defpackage.xvl("Software", 305, 2), new defpackage.xvl("DateTime", 306, 2), new defpackage.xvl("Artist", 315, 2), new defpackage.xvl("WhitePoint", 318, 5), new defpackage.xvl("PrimaryChromaticities", 319, 5), new defpackage.xvl("SubIFDPointer", 330, 4), new defpackage.xvl("JPEGInterchangeFormat", 513, 4), new defpackage.xvl("JPEGInterchangeFormatLength", 514, 4), new defpackage.xvl("YCbCrCoefficients", 529, 5), new defpackage.xvl("YCbCrSubSampling", 530, 3), new defpackage.xvl("YCbCrPositioning", 531, 3), new defpackage.xvl("ReferenceBlackWhite", 532, 5), new defpackage.xvl("Copyright", 33432, 2), new defpackage.xvl("ExifIFDPointer", 34665, 4), new defpackage.xvl("GPSInfoIFDPointer", 34853, 4), new defpackage.xvl("SensorTopBorder", 4, 4), new defpackage.xvl("SensorLeftBorder", 5, 4), new defpackage.xvl("SensorBottomBorder", 6, 4), new defpackage.xvl("SensorRightBorder", 7, 4), new defpackage.xvl("ISO", 23, 3), new defpackage.xvl("JpgFromRaw", 46, 7), new defpackage.xvl("Xmp", 700, 1)};
        P = xvlVarArr;
        defpackage.xvl[] xvlVarArr2 = {new defpackage.xvl("ExposureTime", 33434, 5), new defpackage.xvl("FNumber", 33437, 5), new defpackage.xvl("ExposureProgram", 34850, 3), new defpackage.xvl("SpectralSensitivity", 34852, 2), new defpackage.xvl("PhotographicSensitivity", 34855, 3), new defpackage.xvl("OECF", 34856, 7), new defpackage.xvl("SensitivityType", 34864, 3), new defpackage.xvl("StandardOutputSensitivity", 34865, 4), new defpackage.xvl("RecommendedExposureIndex", 34866, 4), new defpackage.xvl("ISOSpeed", 34867, 4), new defpackage.xvl("ISOSpeedLatitudeyyy", 34868, 4), new defpackage.xvl("ISOSpeedLatitudezzz", 34869, 4), new defpackage.xvl("ExifVersion", 36864, 2), new defpackage.xvl("DateTimeOriginal", 36867, 2), new defpackage.xvl("DateTimeDigitized", 36868, 2), new defpackage.xvl("OffsetTime", 36880, 2), new defpackage.xvl("OffsetTimeOriginal", 36881, 2), new defpackage.xvl("OffsetTimeDigitized", 36882, 2), new defpackage.xvl("ComponentsConfiguration", 37121, 7), new defpackage.xvl("CompressedBitsPerPixel", 37122, 5), new defpackage.xvl("ShutterSpeedValue", 37377, 10), new defpackage.xvl("ApertureValue", 37378, 5), new defpackage.xvl("BrightnessValue", 37379, 10), new defpackage.xvl("ExposureBiasValue", 37380, 10), new defpackage.xvl("MaxApertureValue", 37381, 5), new defpackage.xvl("SubjectDistance", 37382, 5), new defpackage.xvl("MeteringMode", 37383, 3), new defpackage.xvl("LightSource", 37384, 3), new defpackage.xvl("Flash", 37385, 3), new defpackage.xvl("FocalLength", 37386, 5), new defpackage.xvl("SubjectArea", 37396, 3), new defpackage.xvl("MakerNote", 37500, 7), new defpackage.xvl("UserComment", 37510, 7), new defpackage.xvl("SubSecTime", 37520, 2), new defpackage.xvl("SubSecTimeOriginal", 37521, 2), new defpackage.xvl("SubSecTimeDigitized", 37522, 2), new defpackage.xvl("FlashpixVersion", 40960, 7), new defpackage.xvl("ColorSpace", 40961, 3), new defpackage.xvl("PixelXDimension", 40962, 3, 4), new defpackage.xvl("PixelYDimension", 40963, 3, 4), new defpackage.xvl("RelatedSoundFile", 40964, 2), new defpackage.xvl("InteroperabilityIFDPointer", 40965, 4), new defpackage.xvl("FlashEnergy", 41483, 5), new defpackage.xvl("SpatialFrequencyResponse", 41484, 7), new defpackage.xvl("FocalPlaneXResolution", 41486, 5), new defpackage.xvl("FocalPlaneYResolution", 41487, 5), new defpackage.xvl("FocalPlaneResolutionUnit", 41488, 3), new defpackage.xvl("SubjectLocation", 41492, 3), new defpackage.xvl("ExposureIndex", 41493, 5), new defpackage.xvl("SensingMethod", 41495, 3), new defpackage.xvl("FileSource", 41728, 7), new defpackage.xvl("SceneType", 41729, 7), new defpackage.xvl("CFAPattern", 41730, 7), new defpackage.xvl("CustomRendered", 41985, 3), new defpackage.xvl("ExposureMode", 41986, 3), new defpackage.xvl("WhiteBalance", 41987, 3), new defpackage.xvl("DigitalZoomRatio", 41988, 5), new defpackage.xvl("FocalLengthIn35mmFilm", 41989, 3), new defpackage.xvl("SceneCaptureType", 41990, 3), new defpackage.xvl("GainControl", 41991, 3), new defpackage.xvl("Contrast", 41992, 3), new defpackage.xvl("Saturation", 41993, 3), new defpackage.xvl("Sharpness", 41994, 3), new defpackage.xvl("DeviceSettingDescription", 41995, 7), new defpackage.xvl("SubjectDistanceRange", 41996, 3), new defpackage.xvl("ImageUniqueID", 42016, 2), new defpackage.xvl("CameraOwnerName", 42032, 2), new defpackage.xvl("BodySerialNumber", 42033, 2), new defpackage.xvl("LensSpecification", 42034, 5), new defpackage.xvl("LensMake", 42035, 2), new defpackage.xvl("LensModel", 42036, 2), new defpackage.xvl("Gamma", 42240, 5), new defpackage.xvl("DNGVersion", 50706, 1), new defpackage.xvl("DefaultCropSize", 50720, 3, 4)};
        Q = xvlVarArr2;
        defpackage.xvl[] xvlVarArr3 = {new defpackage.xvl("GPSVersionID", 0, 1), new defpackage.xvl("GPSLatitudeRef", 1, 2), new defpackage.xvl("GPSLatitude", 2, 5, 10), new defpackage.xvl("GPSLongitudeRef", 3, 2), new defpackage.xvl("GPSLongitude", 4, 5, 10), new defpackage.xvl("GPSAltitudeRef", 5, 1), new defpackage.xvl("GPSAltitude", 6, 5), new defpackage.xvl("GPSTimeStamp", 7, 5), new defpackage.xvl("GPSSatellites", 8, 2), new defpackage.xvl("GPSStatus", 9, 2), new defpackage.xvl("GPSMeasureMode", 10, 2), new defpackage.xvl("GPSDOP", 11, 5), new defpackage.xvl("GPSSpeedRef", 12, 2), new defpackage.xvl("GPSSpeed", 13, 5), new defpackage.xvl("GPSTrackRef", 14, 2), new defpackage.xvl("GPSTrack", 15, 5), new defpackage.xvl("GPSImgDirectionRef", 16, 2), new defpackage.xvl("GPSImgDirection", 17, 5), new defpackage.xvl("GPSMapDatum", 18, 2), new defpackage.xvl("GPSDestLatitudeRef", 19, 2), new defpackage.xvl("GPSDestLatitude", 20, 5), new defpackage.xvl("GPSDestLongitudeRef", 21, 2), new defpackage.xvl("GPSDestLongitude", 22, 5), new defpackage.xvl("GPSDestBearingRef", 23, 2), new defpackage.xvl("GPSDestBearing", 24, 5), new defpackage.xvl("GPSDestDistanceRef", 25, 2), new defpackage.xvl("GPSDestDistance", 26, 5), new defpackage.xvl("GPSProcessingMethod", 27, 7), new defpackage.xvl("GPSAreaInformation", 28, 7), new defpackage.xvl("GPSDateStamp", 29, 2), new defpackage.xvl("GPSDifferential", 30, 3), new defpackage.xvl("GPSHPositioningError", 31, 5)};
        R = xvlVarArr3;
        defpackage.xvl[] xvlVarArr4 = {new defpackage.xvl("InteroperabilityIndex", 1, 2)};
        S = xvlVarArr4;
        defpackage.xvl[] xvlVarArr5 = {new defpackage.xvl("NewSubfileType", 254, 4), new defpackage.xvl("SubfileType", 255, 4), new defpackage.xvl("ThumbnailImageWidth", 256, 3, 4), new defpackage.xvl("ThumbnailImageLength", 257, 3, 4), new defpackage.xvl("BitsPerSample", 258, 3), new defpackage.xvl("Compression", 259, 3), new defpackage.xvl("PhotometricInterpretation", 262, 3), new defpackage.xvl("ImageDescription", 270, 2), new defpackage.xvl("Make", 271, 2), new defpackage.xvl("Model", 272, 2), new defpackage.xvl("StripOffsets", 273, 3, 4), new defpackage.xvl("ThumbnailOrientation", 274, 3), new defpackage.xvl("SamplesPerPixel", 277, 3), new defpackage.xvl("RowsPerStrip", 278, 3, 4), new defpackage.xvl("StripByteCounts", 279, 3, 4), new defpackage.xvl("XResolution", 282, 5), new defpackage.xvl("YResolution", 283, 5), new defpackage.xvl("PlanarConfiguration", 284, 3), new defpackage.xvl("ResolutionUnit", 296, 3), new defpackage.xvl("TransferFunction", 301, 3), new defpackage.xvl("Software", 305, 2), new defpackage.xvl("DateTime", 306, 2), new defpackage.xvl("Artist", 315, 2), new defpackage.xvl("WhitePoint", 318, 5), new defpackage.xvl("PrimaryChromaticities", 319, 5), new defpackage.xvl("SubIFDPointer", 330, 4), new defpackage.xvl("JPEGInterchangeFormat", 513, 4), new defpackage.xvl("JPEGInterchangeFormatLength", 514, 4), new defpackage.xvl("YCbCrCoefficients", 529, 5), new defpackage.xvl("YCbCrSubSampling", 530, 3), new defpackage.xvl("YCbCrPositioning", 531, 3), new defpackage.xvl("ReferenceBlackWhite", 532, 5), new defpackage.xvl("Copyright", 33432, 2), new defpackage.xvl("ExifIFDPointer", 34665, 4), new defpackage.xvl("GPSInfoIFDPointer", 34853, 4), new defpackage.xvl("DNGVersion", 50706, 1), new defpackage.xvl("DefaultCropSize", 50720, 3, 4)};
        T = xvlVarArr5;
        U = new defpackage.xvl("StripOffsets", 273, 3);
        defpackage.xvl[] xvlVarArr6 = {new defpackage.xvl("ThumbnailImage", 256, 7), new defpackage.xvl("CameraSettingsIFDPointer", 8224, 4), new defpackage.xvl("ImageProcessingIFDPointer", 8256, 4)};
        V = xvlVarArr6;
        defpackage.xvl[] xvlVarArr7 = {new defpackage.xvl("PreviewImageStart", 257, 4), new defpackage.xvl("PreviewImageLength", 258, 4)};
        W = xvlVarArr7;
        defpackage.xvl[] xvlVarArr8 = {new defpackage.xvl("AspectFrame", 4371, 3)};
        X = xvlVarArr8;
        defpackage.xvl[] xvlVarArr9 = {new defpackage.xvl("ColorSpace", 55, 3)};
        Y = xvlVarArr9;
        j = new defpackage.xvl[][]{xvlVarArr, xvlVarArr2, xvlVarArr3, xvlVarArr4, xvlVarArr5, xvlVarArr, xvlVarArr6, xvlVarArr7, xvlVarArr8, xvlVarArr9};
        Z = new defpackage.xvl[]{new defpackage.xvl("SubIFDPointer", 330, 4), new defpackage.xvl("ExifIFDPointer", 34665, 4), new defpackage.xvl("GPSInfoIFDPointer", 34853, 4), new defpackage.xvl("InteroperabilityIFDPointer", 40965, 4), new defpackage.xvl("CameraSettingsIFDPointer", 8224, 1), new defpackage.xvl("ImageProcessingIFDPointer", 8256, 1)};
        y = new java.util.HashMap[10];
        z = new java.util.HashMap[10];
        A = j$.util.DesugarCollections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        B = new java.util.HashMap();
        java.nio.charset.Charset charsetForName = java.nio.charset.Charset.forName("US-ASCII");
        h = charsetForName;
        i = "Exif\u0000\u0000".getBytes(charsetForName);
        C = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy:MM:dd HH:mm:ss", java.util.Locale.US);
        w = simpleDateFormat;
        simpleDateFormat.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("UTC"));
        java.text.SimpleDateFormat simpleDateFormat2 = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss", java.util.Locale.US);
        x = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(j$.util.DesugarTimeZone.getTimeZone("UTC"));
        int i2 = 0;
        while (true) {
            defpackage.xvl[][] xvlVarArr10 = j;
            int length = xvlVarArr10.length;
            if (i2 >= 10) {
                defpackage.xvl[] xvlVarArr11 = Z;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(xvlVarArr11[0].b);
                java.util.HashMap map = B;
                map.put(numValueOf, 5);
                map.put(java.lang.Integer.valueOf(xvlVarArr11[1].b), 1);
                map.put(java.lang.Integer.valueOf(xvlVarArr11[2].b), 2);
                map.put(java.lang.Integer.valueOf(xvlVarArr11[3].b), 3);
                map.put(java.lang.Integer.valueOf(xvlVarArr11[4].b), 7);
                map.put(java.lang.Integer.valueOf(xvlVarArr11[5].b), 8);
                java.util.regex.Pattern.compile(".*[1-9].*");
                java.util.regex.Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                java.util.regex.Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                java.util.regex.Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            y[i2] = new java.util.HashMap();
            z[i2] = new java.util.HashMap();
            for (defpackage.xvl xvlVar : xvlVarArr10[i2]) {
                y[i2].put(java.lang.Integer.valueOf(xvlVar.b), xvlVar);
                z[i2].put(xvlVar.d, xvlVar);
            }
            i2++;
        }
    }

    public enl(java.io.InputStream inputStream) throws java.lang.Throwable {
        int length = j.length;
        this.G = new java.util.HashMap[10];
        this.H = new java.util.HashSet(10);
        this.I = java.nio.ByteOrder.BIG_ENDIAN;
        if (inputStream instanceof android.content.res.AssetManager.AssetInputStream) {
            this.E = (android.content.res.AssetManager.AssetInputStream) inputStream;
            this.D = null;
        } else if (inputStream instanceof java.io.FileInputStream) {
            java.io.FileInputStream fileInputStream = (java.io.FileInputStream) inputStream;
            try {
                android.system.Os.lseek(fileInputStream.getFD(), 0L, android.system.OsConstants.SEEK_CUR);
                this.E = null;
                this.D = fileInputStream.getFD();
            } catch (java.lang.Exception unused) {
                if (k) {
                    android.util.Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.E = null;
                this.D = null;
            }
        } else {
            this.E = null;
            this.D = null;
        }
        j(inputStream);
    }

    private final defpackage.enj c(java.lang.String str) {
        defpackage.enj enjVar;
        int i2;
        defpackage.enj enjVar2;
        if ("ISOSpeedRatings".equals(str)) {
            if (k) {
                android.util.Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        int i3 = 0;
        if ("Xmp".equals(str) && (i2 = this.F) != 4 && ((i2 == 9 || i2 == 15 || i2 == 12 || i2 == 13) && (enjVar2 = this.O) != null)) {
            return enjVar2;
        }
        while (true) {
            int length = j.length;
            if (i3 >= 10) {
                if (!"Xmp".equals(str) || (enjVar = this.O) == null) {
                    return null;
                }
                return enjVar;
            }
            defpackage.enj enjVar3 = (defpackage.enj) this.G[i3].get(str);
            if (enjVar3 != null) {
                return enjVar3;
            }
            i3++;
        }
    }

    private final void d() throws java.lang.Throwable {
        java.lang.String strA = a("DateTimeOriginal");
        if (strA != null && a("DateTime") == null) {
            this.G[0].put("DateTime", defpackage.enj.b(strA));
        }
        if (a("ImageWidth") == null) {
            this.G[0].put("ImageWidth", defpackage.enj.c(0L, this.I));
        }
        if (a("ImageLength") == null) {
            this.G[0].put("ImageLength", defpackage.enj.c(0L, this.I));
        }
        if (a("Orientation") == null) {
            this.G[0].put("Orientation", defpackage.enj.c(0L, this.I));
        }
        if (a("LightSource") == null) {
            this.G[1].put("LightSource", defpackage.enj.c(0L, this.I));
        }
    }

    private final void e(defpackage.eni eniVar, int i2, int i3) throws java.lang.Throwable {
        boolean z2;
        boolean z3 = k;
        if (z3) {
            java.util.Objects.toString(eniVar);
            android.util.Log.d("ExifInterface", "getJpegAttributes starting with: ".concat(eniVar.toString()));
        }
        eniVar.c = java.nio.ByteOrder.BIG_ENDIAN;
        byte b2 = eniVar.readByte();
        if (b2 != -1) {
            throw new java.io.IOException("Invalid marker: ".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(b2 & 255))));
        }
        if (eniVar.readByte() != -40) {
            throw new java.io.IOException("Invalid marker: ff");
        }
        int i4 = 2;
        while (true) {
            byte b3 = eniVar.readByte();
            if (b3 != -1) {
                throw new java.io.IOException("Invalid marker:".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(b3 & 255))));
            }
            while (true) {
                byte b4 = eniVar.readByte();
                int i5 = i4 + 1;
                if (b4 != -1) {
                    int i6 = 0;
                    if (z3) {
                        android.util.Log.d("ExifInterface", "Found JPEG segment indicator: ".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(b4 & 255))));
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (b4 == -39 || b4 == -38) {
                        eniVar.c = this.I;
                        return;
                    }
                    int unsignedShort = eniVar.readUnsignedShort();
                    int i7 = unsignedShort - 2;
                    int i8 = i4 + 4;
                    if (z2) {
                        android.util.Log.d("ExifInterface", "JPEG segment: " + java.lang.Integer.toHexString(b4 & 255) + " (length: " + unsignedShort + ")");
                    }
                    if (i7 < 0) {
                        throw new java.io.IOException("Invalid length");
                    }
                    if (b4 == -31) {
                        byte[] bArr = new byte[i7];
                        eniVar.readFully(bArr);
                        int i9 = i8 + i7;
                        byte[] bArr2 = i;
                        if (defpackage.due.l(bArr, bArr2)) {
                            int length = bArr2.length;
                            byte[] bArrCopyOfRange = java.util.Arrays.copyOfRange(bArr, length, i7);
                            this.K = i2 + i8 + length;
                            m(bArrCopyOfRange, i3);
                            o(new defpackage.eni(bArrCopyOfRange));
                        } else {
                            byte[] bArr3 = C;
                            if (defpackage.due.l(bArr, bArr3)) {
                                int length2 = bArr3.length;
                                byte[] bArrCopyOfRange2 = java.util.Arrays.copyOfRange(bArr, length2, i7);
                                this.O = new defpackage.enj(1, bArrCopyOfRange2.length, i8 + length2, bArrCopyOfRange2);
                            }
                        }
                        i8 = i9;
                    } else if (b4 != -2) {
                        switch (b4) {
                            case -64:
                            case -63:
                            case -62:
                            case -61:
                                break;
                            default:
                                switch (b4) {
                                    case -59:
                                    case -58:
                                    case -57:
                                        break;
                                    default:
                                        switch (b4) {
                                            case -55:
                                            case -54:
                                            case -53:
                                                break;
                                            default:
                                                switch (b4) {
                                                    case -51:
                                                    case -50:
                                                    case -49:
                                                        break;
                                                    default:
                                                        i6 = i7;
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        eniVar.b(1);
                        java.util.HashMap[] mapArr = this.G;
                        mapArr[i3].put(i3 != 4 ? "ImageLength" : "ThumbnailImageLength", defpackage.enj.c(eniVar.readUnsignedShort(), this.I));
                        mapArr[i3].put(i3 != 4 ? "ImageWidth" : "ThumbnailImageWidth", defpackage.enj.c(eniVar.readUnsignedShort(), this.I));
                        i6 = unsignedShort - 7;
                    } else {
                        byte[] bArr4 = new byte[i7];
                        eniVar.readFully(bArr4);
                        if (a("UserComment") == null) {
                            this.G[1].put("UserComment", defpackage.enj.b(new java.lang.String(bArr4, h)));
                        }
                    }
                    if (i6 < 0) {
                        throw new java.io.IOException("Invalid length");
                    }
                    eniVar.b(i6);
                    i4 = i8 + i6;
                } else {
                    i4 = i5;
                }
            }
        }
    }

    private final void f(defpackage.eni eniVar) throws java.lang.Throwable {
        byte[] bArr;
        int length;
        if (k) {
            java.util.Objects.toString(eniVar);
            android.util.Log.d("ExifInterface", "getPngAttributes starting with: ".concat(eniVar.toString()));
        }
        eniVar.c = java.nio.ByteOrder.BIG_ENDIAN;
        int i2 = eniVar.b;
        int length2 = s.length;
        eniVar.b(8);
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
                int i3 = eniVar.readInt();
                int i4 = eniVar.readInt();
                int i5 = eniVar.b;
                int i6 = i5 + i3;
                int i7 = i5 - i2;
                if (i7 == 16) {
                    if (i4 != 1229472850) {
                        throw new java.io.IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
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
                        eniVar.readFully(bArr2);
                        int i8 = eniVar.readInt();
                        java.util.zip.CRC32 crc32 = new java.util.zip.CRC32();
                        crc32.update(androidx.car.app.hardware.info.EnergyProfile.EVCONNECTOR_TYPE_OTHER);
                        crc32.update(25944);
                        crc32.update(6641737);
                        crc32.update(1700284774);
                        crc32.update(bArr2);
                        if (((int) crc32.getValue()) != i8) {
                            throw new java.io.IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i8 + ", calculated CRC value: " + crc32.getValue());
                        }
                        m(bArr2, 0);
                        q();
                        o(new defpackage.eni(bArr2));
                        z2 = true;
                    }
                } else if (i4 == 1767135348 && !z3 && i3 >= (length = (bArr = d).length)) {
                    byte[] bArr3 = new byte[length];
                    eniVar.readFully(bArr3);
                    if (java.util.Arrays.equals(bArr3, bArr)) {
                        int i9 = eniVar.b - i2;
                        int i10 = i3 - length;
                        byte[] bArr4 = new byte[i10];
                        eniVar.readFully(bArr4);
                        this.O = new defpackage.enj(1, i10, i9, bArr4);
                        z3 = true;
                    }
                }
                eniVar.b((i6 + 4) - eniVar.b);
            } catch (java.io.EOFException e2) {
                throw new java.io.IOException("Encountered corrupt PNG file.", e2);
            }
        }
    }

    private final void g(defpackage.eni eniVar) throws java.lang.Throwable {
        if (k) {
            java.util.Objects.toString(eniVar);
            android.util.Log.d("ExifInterface", "getWebpAttributes starting with: ".concat(eniVar.toString()));
        }
        eniVar.c = java.nio.ByteOrder.LITTLE_ENDIAN;
        int length = t.length;
        eniVar.b(4);
        int i2 = eniVar.readInt() + 8;
        int length2 = u.length;
        eniVar.b(4);
        int i3 = 12;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                eniVar.readFully(bArr);
                int i4 = eniVar.readInt();
                int i5 = i3 + 8;
                if (java.util.Arrays.equals(v, bArr)) {
                    byte[] bArrCopyOfRange = new byte[i4];
                    eniVar.readFully(bArrCopyOfRange);
                    byte[] bArr2 = i;
                    if (defpackage.due.l(bArrCopyOfRange, bArr2)) {
                        bArrCopyOfRange = java.util.Arrays.copyOfRange(bArrCopyOfRange, bArr2.length, i4);
                    }
                    this.K = i5;
                    m(bArrCopyOfRange, 0);
                    o(new defpackage.eni(bArrCopyOfRange));
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
                    throw new java.io.IOException("Encountered WebP file with invalid chunk size");
                }
                eniVar.b(i4);
            } catch (java.io.EOFException e2) {
                throw new java.io.IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    private final void h(defpackage.eni eniVar, java.util.HashMap map) throws java.lang.Throwable {
        defpackage.enj enjVar = (defpackage.enj) map.get("JPEGInterchangeFormat");
        defpackage.enj enjVar2 = (defpackage.enj) map.get("JPEGInterchangeFormatLength");
        if (enjVar == null || enjVar2 == null) {
            return;
        }
        int iA = enjVar.a(this.I);
        int iA2 = enjVar2.a(this.I);
        if (this.F == 7) {
            iA += this.L;
        }
        if (iA > 0 && iA2 > 0 && this.E == null && this.D == null) {
            eniVar.b(iA);
            eniVar.readFully(new byte[iA2]);
        }
        if (k) {
            android.util.Log.d("ExifInterface", defpackage.a.bn(iA2, iA, "Setting thumbnail attributes with offset: ", ", length: "));
        }
    }

    private final void i(defpackage.eni eniVar, java.util.HashMap map) throws java.io.IOException {
        int length;
        int length2;
        byte[] bArr;
        defpackage.enj enjVar = (defpackage.enj) map.get("StripOffsets");
        defpackage.enj enjVar2 = (defpackage.enj) map.get("StripByteCounts");
        if (enjVar == null || enjVar2 == null) {
            return;
        }
        long[] jArrM = defpackage.due.m(enjVar.f(this.I));
        long[] jArrM2 = defpackage.due.m(enjVar2.f(this.I));
        if (jArrM == null || (length = jArrM.length) == 0) {
            android.util.Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrM2 == null || (length2 = jArrM2.length) == 0) {
            android.util.Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (length != length2) {
            android.util.Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j2 = 0;
        for (long j3 : jArrM2) {
            j2 += j3;
        }
        byte[] bArr2 = new byte[(int) j2];
        this.J = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int length3 = jArrM.length;
            if (i2 >= length3) {
                if (this.J) {
                    long j4 = jArrM[0];
                    return;
                }
                return;
            }
            int i5 = (int) jArrM[i2];
            int i6 = (int) jArrM2[i2];
            if (i2 < length3 - 1) {
                bArr = bArr2;
                if (i5 + i6 != jArrM[i2 + 1]) {
                    this.J = false;
                }
            } else {
                bArr = bArr2;
            }
            int i7 = i5 - i3;
            if (i7 < 0) {
                android.util.Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                eniVar.b(i7);
                int i8 = i3 + i7;
                byte[] bArr3 = new byte[i6];
                try {
                    eniVar.readFully(bArr3);
                    i2++;
                    i3 = i8 + i6;
                    java.lang.System.arraycopy(bArr3, 0, bArr, i4, i6);
                    i4 += i6;
                    bArr2 = bArr;
                } catch (java.io.EOFException unused) {
                    android.util.Log.d("ExifInterface", defpackage.a.bm(i6, "Failed to read ", " bytes."));
                    return;
                }
            } catch (java.io.EOFException unused2) {
                android.util.Log.d("ExifInterface", defpackage.a.bm(i7, "Failed to skip ", " bytes."));
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:222:0x04ae A[Catch: all -> 0x04a5, TRY_LEAVE, TryCatch #2 {all -> 0x04a5, blocks: (B:3:0x0009, B:5:0x0010, B:6:0x001c, B:7:0x0031, B:9:0x0045, B:11:0x004d, B:12:0x0059, B:14:0x005c, B:16:0x0062, B:27:0x0087, B:41:0x00b0, B:54:0x00cd, B:56:0x00d2, B:59:0x00da, B:61:0x00df, B:64:0x00e8, B:66:0x00ed, B:68:0x00f2, B:71:0x00fc, B:73:0x0101, B:48:0x00c1, B:49:0x00c4, B:52:0x00c8, B:34:0x0095, B:35:0x0098, B:38:0x009c, B:79:0x0115, B:86:0x0126, B:92:0x013b, B:94:0x014c, B:96:0x0174, B:100:0x0185, B:103:0x01a2, B:104:0x01b0, B:106:0x01bc, B:108:0x01c6, B:111:0x01ca, B:113:0x01d1, B:115:0x01d7, B:117:0x01df, B:118:0x01e3, B:119:0x01fb, B:97:0x017a, B:99:0x0180, B:183:0x03b6, B:122:0x0212, B:123:0x0217, B:125:0x021b, B:126:0x022b, B:128:0x023c, B:129:0x0249, B:132:0x025f, B:135:0x026a, B:138:0x026f, B:139:0x0276, B:140:0x0277, B:182:0x03b3, B:190:0x03cc, B:191:0x03cf, B:192:0x03d0, B:194:0x03d9, B:196:0x03e1, B:199:0x03ea, B:200:0x03ef, B:202:0x03f3, B:203:0x0403, B:205:0x0453, B:208:0x045f, B:210:0x046d, B:212:0x0491, B:213:0x049d, B:75:0x0106, B:77:0x010c, B:220:0x04aa, B:222:0x04ae), top: B:238:0x0009 }] */
    /* JADX WARN: Multi-variable type inference failed */
    private final void j(java.io.InputStream inputStream) throws java.lang.Throwable {
        java.lang.String strExtractMetadata;
        int i2;
        int iV;
        java.lang.String strExtractMetadata2;
        java.lang.String strExtractMetadata3;
        int i3;
        int i4;
        int i5;
        defpackage.eni eniVar;
        defpackage.eni eniVar2;
        int i6 = 0;
        while (true) {
            try {
                try {
                    try {
                        int length = j.length;
                        if (i6 >= 10) {
                            break;
                        }
                        this.G[i6] = new java.util.HashMap();
                        i6++;
                    } catch (java.lang.Throwable th) {
                        d();
                        if (k) {
                            l();
                        }
                        throw th;
                    }
                } catch (java.io.IOException e2) {
                    e = e2;
                    if (k) {
                        android.util.Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                    }
                }
            } catch (java.lang.UnsupportedOperationException e3) {
                e = e3;
                if (k) {
                    android.util.Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
            }
        }
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(inputStream, 5000);
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i7 = 0;
        while (true) {
            byte[] bArr2 = c;
            int length2 = bArr2.length;
            strExtractMetadata = null;
            defpackage.eni eniVar3 = null;
            defpackage.eni eniVar4 = null;
            if (i7 >= 3) {
                i2 = 3;
                iV = 4;
                break;
            }
            i2 = 3;
            if (bArr[i7] != bArr2[i7]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(java.nio.charset.Charset.defaultCharset());
                int i8 = 0;
                while (true) {
                    if (i8 >= bytes.length) {
                        iV = 9;
                        break;
                    }
                    if (bArr[i8] != bytes[i8]) {
                        iV = v(bArr);
                        if (iV != 0) {
                            break;
                        }
                        try {
                            eniVar = new defpackage.eni(bArr);
                            try {
                                java.nio.ByteOrder byteOrderW = w(eniVar);
                                this.I = byteOrderW;
                                eniVar.c = byteOrderW;
                                short s2 = eniVar.readShort();
                                java.lang.Object[] objArr = s2 == 20306 || s2 == 21330;
                                eniVar.close();
                                if (objArr == true) {
                                    iV = 7;
                                    break;
                                }
                                try {
                                    eniVar2 = new defpackage.eni(bArr);
                                    try {
                                        java.nio.ByteOrder byteOrderW2 = w(eniVar2);
                                        this.I = byteOrderW2;
                                        eniVar2.c = byteOrderW2;
                                        short s3 = eniVar2.readShort();
                                        eniVar2.close();
                                        if (s3 == 85) {
                                            iV = 10;
                                            break;
                                        }
                                        int i9 = 0;
                                        while (true) {
                                            byte[] bArr3 = s;
                                            int length3 = bArr3.length;
                                            if (i9 >= 8) {
                                                iV = 13;
                                                break;
                                            }
                                            if (bArr[i9] != bArr3[i9]) {
                                                int i10 = 0;
                                                while (true) {
                                                    byte[] bArr4 = t;
                                                    int length4 = bArr4.length;
                                                    if (i10 >= 4) {
                                                        int i11 = 0;
                                                        while (true) {
                                                            byte[] bArr5 = u;
                                                            int length5 = bArr5.length;
                                                            if (i11 >= 4) {
                                                                iV = 14;
                                                                break;
                                                            } else {
                                                                int length6 = bArr4.length;
                                                                if (bArr[i11 + 8] == bArr5[i11]) {
                                                                    i11++;
                                                                }
                                                            }
                                                        }
                                                    } else if (bArr[i10] == bArr4[i10]) {
                                                        i10++;
                                                    }
                                                    iV = 0;
                                                    break;
                                                }
                                            }
                                            i9++;
                                        }
                                    } catch (java.lang.Exception unused) {
                                        if (eniVar2 != null) {
                                            eniVar2.close();
                                        }
                                    } catch (java.lang.Throwable th2) {
                                        th = th2;
                                        eniVar3 = eniVar2;
                                        if (eniVar3 != null) {
                                            eniVar3.close();
                                        }
                                        throw th;
                                    }
                                } catch (java.lang.Exception unused2) {
                                    eniVar2 = null;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                }
                            } catch (java.lang.Exception unused3) {
                                if (eniVar != null) {
                                    eniVar.close();
                                }
                            } catch (java.lang.Throwable th4) {
                                th = th4;
                                eniVar4 = eniVar;
                                if (eniVar4 != null) {
                                    eniVar4.close();
                                }
                                throw th;
                            }
                        } catch (java.lang.Exception unused4) {
                            eniVar = null;
                        } catch (java.lang.Throwable th5) {
                            th = th5;
                        }
                    } else {
                        i8++;
                    }
                }
            } else {
                i7++;
            }
        }
        this.F = iV;
        if (iV == 4 || iV == 9 || iV == 13 || iV == 14) {
            defpackage.eni eniVar5 = new defpackage.eni(bufferedInputStream);
            int i12 = this.F;
            if (i12 == 4) {
                e(eniVar5, 0, 0);
            } else if (i12 == 13) {
                f(eniVar5);
            } else if (i12 == 9) {
                boolean z2 = k;
                if (z2) {
                    eniVar5.toString();
                    android.util.Log.d("ExifInterface", "getRafAttributes starting with: ".concat(eniVar5.toString()));
                }
                eniVar5.b(84);
                byte[] bArr6 = new byte[4];
                byte[] bArr7 = new byte[4];
                byte[] bArr8 = new byte[4];
                eniVar5.readFully(bArr6);
                eniVar5.readFully(bArr7);
                eniVar5.readFully(bArr8);
                int i13 = java.nio.ByteBuffer.wrap(bArr6).getInt();
                int i14 = java.nio.ByteBuffer.wrap(bArr7).getInt();
                int i15 = java.nio.ByteBuffer.wrap(bArr8).getInt();
                byte[] bArr9 = new byte[i14];
                eniVar5.b(i13 - eniVar5.b);
                eniVar5.readFully(bArr9);
                e(new defpackage.eni(bArr9), i13, 5);
                eniVar5.b(i15 - eniVar5.b);
                eniVar5.c = java.nio.ByteOrder.BIG_ENDIAN;
                int i16 = eniVar5.readInt();
                if (z2) {
                    android.util.Log.d("ExifInterface", defpackage.a.bo(i16, "numberOfDirectoryEntry: "));
                }
                for (int i17 = 0; i17 < i16; i17++) {
                    int unsignedShort = eniVar5.readUnsignedShort();
                    int unsignedShort2 = eniVar5.readUnsignedShort();
                    if (unsignedShort == U.b) {
                        short s4 = eniVar5.readShort();
                        short s5 = eniVar5.readShort();
                        defpackage.enj enjVarE = defpackage.enj.e(s4, this.I);
                        defpackage.enj enjVarE2 = defpackage.enj.e(s5, this.I);
                        java.util.HashMap[] mapArr = this.G;
                        mapArr[0].put("ImageLength", enjVarE);
                        mapArr[0].put("ImageWidth", enjVarE2);
                        if (!z2) {
                            break;
                        }
                        android.util.Log.d("ExifInterface", defpackage.a.bn(s5, s4, "Updated to length: ", ", width: "));
                        break;
                    }
                    eniVar5.b(unsignedShort2);
                }
            } else if (i12 == 14) {
                g(eniVar5);
            }
        } else {
            defpackage.eni eniVar6 = new defpackage.eni(bufferedInputStream, (byte[]) null);
            int i18 = this.F;
            if (i18 == 12 || i18 == 15) {
                if (i18 == 15 && android.os.Build.VERSION.SDK_INT < 31) {
                    throw new java.lang.UnsupportedOperationException("Reading EXIF from AVIF files is supported from SDK 31 and above");
                }
                android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
                try {
                    try {
                        mediaMetadataRetriever.setDataSource(new defpackage.enh(eniVar6));
                        java.lang.String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                        java.lang.String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                        java.lang.String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                        java.lang.String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                        if ("yes".equals(strExtractMetadata6)) {
                            strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                            java.lang.String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(30);
                            strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                            strExtractMetadata2 = strExtractMetadata8;
                        } else if ("yes".equals(strExtractMetadata7)) {
                            strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                            strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                            strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                        } else {
                            strExtractMetadata2 = null;
                            strExtractMetadata3 = null;
                        }
                        if (strExtractMetadata != null) {
                            this.G[0].put("ImageWidth", defpackage.enj.e(java.lang.Integer.parseInt(strExtractMetadata), this.I));
                        }
                        if (strExtractMetadata2 != null) {
                            this.G[0].put("ImageLength", defpackage.enj.e(java.lang.Integer.parseInt(strExtractMetadata2), this.I));
                        }
                        if (strExtractMetadata3 != null) {
                            int i19 = java.lang.Integer.parseInt(strExtractMetadata3);
                            if (i19 == 90) {
                                i3 = 6;
                            } else if (i19 != 180) {
                                i3 = i19 != 270 ? 1 : 8;
                            } else {
                                i3 = i2;
                            }
                            this.G[0].put("Orientation", defpackage.enj.e(i3, this.I));
                        }
                        if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                            int i20 = java.lang.Integer.parseInt(strExtractMetadata4);
                            int i21 = java.lang.Integer.parseInt(strExtractMetadata5);
                            if (i21 <= 6) {
                                throw new java.io.IOException("Invalid exif length");
                            }
                            eniVar6.c(i20);
                            byte[] bArr10 = new byte[6];
                            eniVar6.readFully(bArr10);
                            int i22 = i20 + 6;
                            int i23 = i21 - 6;
                            if (!java.util.Arrays.equals(bArr10, i)) {
                                throw new java.io.IOException("Invalid identifier");
                            }
                            byte[] bArr11 = new byte[i23];
                            eniVar6.readFully(bArr11);
                            this.K = i22;
                            m(bArr11, 0);
                        }
                        java.lang.String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(41);
                        java.lang.String strExtractMetadata10 = mediaMetadataRetriever.extractMetadata(42);
                        if (strExtractMetadata9 != null && strExtractMetadata10 != null) {
                            int i24 = java.lang.Integer.parseInt(strExtractMetadata9);
                            int i25 = java.lang.Integer.parseInt(strExtractMetadata10);
                            long j2 = i24;
                            eniVar6.c(j2);
                            byte[] bArr12 = new byte[i25];
                            eniVar6.readFully(bArr12);
                            this.O = new defpackage.enj(1, i25, j2, bArr12);
                        }
                        if (k) {
                            android.util.Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                        }
                        try {
                            mediaMetadataRetriever.release();
                        } catch (java.io.IOException unused5) {
                        }
                    } catch (java.lang.Throwable th6) {
                        try {
                            mediaMetadataRetriever.release();
                        } catch (java.io.IOException unused6) {
                        }
                        throw th6;
                    }
                } catch (java.lang.RuntimeException e4) {
                    throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e4);
                }
            } else if (i18 == 7) {
                s(eniVar6);
                java.util.HashMap[] mapArr2 = this.G;
                defpackage.enj enjVar = (defpackage.enj) mapArr2[1].get("MakerNote");
                if (enjVar != null) {
                    defpackage.eni eniVar7 = new defpackage.eni(enjVar.d, (byte[]) null);
                    eniVar7.c = this.I;
                    byte[] bArr13 = q;
                    int length7 = bArr13.length;
                    byte[] bArr14 = new byte[6];
                    eniVar7.readFully(bArr14);
                    eniVar7.c(0L);
                    byte[] bArr15 = r;
                    int length8 = bArr15.length;
                    byte[] bArr16 = new byte[10];
                    eniVar7.readFully(bArr16);
                    if (java.util.Arrays.equals(bArr14, bArr13)) {
                        eniVar7.c(8L);
                    } else if (java.util.Arrays.equals(bArr16, bArr15)) {
                        eniVar7.c(12L);
                    }
                    t(eniVar7, 6);
                    defpackage.enj enjVar2 = (defpackage.enj) mapArr2[7].get("PreviewImageStart");
                    defpackage.enj enjVar3 = (defpackage.enj) mapArr2[7].get("PreviewImageLength");
                    if (enjVar2 != null && enjVar3 != null) {
                        mapArr2[5].put("JPEGInterchangeFormat", enjVar2);
                        mapArr2[5].put("JPEGInterchangeFormatLength", enjVar3);
                    }
                    defpackage.enj enjVar4 = (defpackage.enj) mapArr2[8].get("AspectFrame");
                    if (enjVar4 != null) {
                        int[] iArr = (int[]) enjVar4.f(this.I);
                        if (iArr == null || iArr.length != 4) {
                            android.util.Log.w("ExifInterface", "Invalid aspect frame values. frame=".concat(java.lang.String.valueOf(java.util.Arrays.toString(iArr))));
                        } else {
                            int i26 = iArr[2];
                            int i27 = iArr[0];
                            if (i26 > i27 && (i4 = iArr[i2]) > (i5 = iArr[1])) {
                                int i28 = (i26 - i27) + 1;
                                int i29 = (i4 - i5) + 1;
                                if (i28 < i29) {
                                    int i30 = i28 + i29;
                                    i29 = i30 - i29;
                                    i28 = i30 - i29;
                                }
                                defpackage.enj enjVarE3 = defpackage.enj.e(i28, this.I);
                                defpackage.enj enjVarE4 = defpackage.enj.e(i29, this.I);
                                mapArr2[0].put("ImageWidth", enjVarE3);
                                mapArr2[0].put("ImageLength", enjVarE4);
                            }
                        }
                    }
                }
            } else if (i18 != 10) {
                s(eniVar6);
            } else {
                if (k) {
                    eniVar6.toString();
                    android.util.Log.d("ExifInterface", "getRw2Attributes starting with: ".concat(eniVar6.toString()));
                }
                s(eniVar6);
                java.util.HashMap[] mapArr3 = this.G;
                defpackage.enj enjVar5 = (defpackage.enj) mapArr3[0].get("JpgFromRaw");
                if (enjVar5 != null) {
                    e(new defpackage.eni(enjVar5.d), (int) enjVar5.c, 5);
                }
                defpackage.enj enjVar6 = (defpackage.enj) mapArr3[0].get("ISO");
                defpackage.enj enjVar7 = (defpackage.enj) mapArr3[1].get("PhotographicSensitivity");
                if (enjVar6 != null && enjVar7 == null) {
                    mapArr3[1].put("PhotographicSensitivity", enjVar6);
                }
            }
            eniVar6.c(this.K);
            o(eniVar6);
        }
        d();
        if (k) {
            l();
        }
    }

    private final void k(defpackage.eni eniVar) throws java.io.IOException {
        java.nio.ByteOrder byteOrderW = w(eniVar);
        this.I = byteOrderW;
        eniVar.c = byteOrderW;
        int unsignedShort = eniVar.readUnsignedShort();
        int i2 = this.F;
        if (i2 != 7 && i2 != 10 && unsignedShort != 42) {
            throw new java.io.IOException("Invalid start code: ".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(unsignedShort))));
        }
        int i3 = eniVar.readInt();
        if (i3 < 8) {
            throw new java.io.IOException(defpackage.a.bo(i3, "Invalid first Ifd offset: "));
        }
        int i4 = i3 - 8;
        if (i4 > 0) {
            eniVar.b(i4);
        }
    }

    private final void l() {
        for (int i2 = 0; i2 < 10; i2++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The size of tag group[");
            sb.append(i2);
            sb.append("]: ");
            java.util.HashMap[] mapArr = this.G;
            sb.append(mapArr[i2].size());
            android.util.Log.d("ExifInterface", sb.toString());
            for (java.util.Map.Entry entry : mapArr[i2].entrySet()) {
                defpackage.enj enjVar = (defpackage.enj) entry.getValue();
                android.util.Log.d("ExifInterface", "tagName: " + ((java.lang.String) entry.getKey()) + ", tagType: " + enjVar.toString() + ", tagValue: '" + enjVar.g(this.I) + "'");
            }
        }
    }

    private final void m(byte[] bArr, int i2) throws java.io.IOException {
        defpackage.eni eniVar = new defpackage.eni(bArr, (byte[]) null);
        k(eniVar);
        t(eniVar, i2);
    }

    private final void n(int i2, java.lang.String str, java.lang.String str2) {
        java.util.HashMap[] mapArr = this.G;
        if (mapArr[i2].isEmpty() || mapArr[i2].get(str) == null) {
            return;
        }
        java.util.HashMap map = mapArr[i2];
        map.put(str2, (defpackage.enj) map.get(str));
        mapArr[i2].remove(str);
    }

    private final void o(defpackage.eni eniVar) throws java.lang.Throwable {
        defpackage.enj enjVar;
        int iA;
        java.util.HashMap map = this.G[4];
        defpackage.enj enjVar2 = (defpackage.enj) map.get("Compression");
        if (enjVar2 == null) {
            h(eniVar, map);
            return;
        }
        int iA2 = enjVar2.a(this.I);
        if (iA2 != 1) {
            if (iA2 == 6) {
                h(eniVar, map);
                return;
            } else if (iA2 != 7) {
                return;
            }
        }
        defpackage.enj enjVar3 = (defpackage.enj) map.get("BitsPerSample");
        if (enjVar3 != null) {
            int[] iArr = (int[]) enjVar3.f(this.I);
            int[] iArr2 = a;
            if (java.util.Arrays.equals(iArr2, iArr) || (this.F == 3 && (enjVar = (defpackage.enj) map.get("PhotometricInterpretation")) != null && ((iA = enjVar.a(this.I)) != 1 ? !(iA != 6 || !java.util.Arrays.equals(iArr, iArr2)) : java.util.Arrays.equals(iArr, b)))) {
                i(eniVar, map);
                return;
            }
        }
        if (k) {
            android.util.Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    private final void p(int i2, int i3) throws java.lang.Throwable {
        java.util.HashMap[] mapArr = this.G;
        if (mapArr[i2].isEmpty() || mapArr[i3].isEmpty()) {
            if (k) {
                android.util.Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        defpackage.enj enjVar = (defpackage.enj) mapArr[i2].get("ImageLength");
        defpackage.enj enjVar2 = (defpackage.enj) mapArr[i2].get("ImageWidth");
        defpackage.enj enjVar3 = (defpackage.enj) mapArr[i3].get("ImageLength");
        defpackage.enj enjVar4 = (defpackage.enj) mapArr[i3].get("ImageWidth");
        if (enjVar == null || enjVar2 == null) {
            if (k) {
                android.util.Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (enjVar3 == null || enjVar4 == null) {
            if (k) {
                android.util.Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iA = enjVar.a(this.I);
        int iA2 = enjVar2.a(this.I);
        int iA3 = enjVar3.a(this.I);
        int iA4 = enjVar4.a(this.I);
        if (iA >= iA3 || iA2 >= iA4) {
            return;
        }
        java.util.HashMap map = mapArr[i2];
        mapArr[i2] = mapArr[i3];
        mapArr[i3] = map;
    }

    private final void q() throws java.lang.Throwable {
        p(0, 5);
        p(0, 4);
        p(5, 4);
        java.util.HashMap[] mapArr = this.G;
        defpackage.enj enjVar = (defpackage.enj) mapArr[1].get("PixelXDimension");
        defpackage.enj enjVar2 = (defpackage.enj) mapArr[1].get("PixelYDimension");
        if (enjVar != null && enjVar2 != null) {
            mapArr[0].put("ImageWidth", enjVar);
            mapArr[0].put("ImageLength", enjVar2);
        }
        if (mapArr[4].isEmpty() && r(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new java.util.HashMap();
        }
        if (!r(mapArr[4])) {
            android.util.Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
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

    private final boolean r(java.util.HashMap map) {
        defpackage.enj enjVar = (defpackage.enj) map.get("ImageLength");
        defpackage.enj enjVar2 = (defpackage.enj) map.get("ImageWidth");
        if (enjVar == null || enjVar2 == null) {
            return false;
        }
        return enjVar.a(this.I) <= 512 && enjVar2.a(this.I) <= 512;
    }

    private final void s(defpackage.eni eniVar) throws java.lang.Throwable {
        k(eniVar);
        t(eniVar, 0);
        u(eniVar, 0);
        u(eniVar, 5);
        u(eniVar, 4);
        q();
        if (this.F == 8) {
            java.util.HashMap[] mapArr = this.G;
            defpackage.enj enjVar = (defpackage.enj) mapArr[1].get("MakerNote");
            if (enjVar != null) {
                defpackage.eni eniVar2 = new defpackage.eni(enjVar.d, (byte[]) null);
                eniVar2.c = this.I;
                eniVar2.b(6);
                t(eniVar2, 9);
                defpackage.enj enjVar2 = (defpackage.enj) mapArr[9].get("ColorSpace");
                if (enjVar2 != null) {
                    mapArr[1].put("ColorSpace", enjVar2);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0205  */
    /* JADX WARN: Code duplicated, block: B:104:0x0211  */
    /* JADX WARN: Code duplicated, block: B:105:0x0216  */
    /* JADX WARN: Code duplicated, block: B:106:0x021b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0222  */
    /* JADX WARN: Code duplicated, block: B:112:0x0240  */
    /* JADX WARN: Code duplicated, block: B:121:0x027e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x0280  */
    /* JADX WARN: Code duplicated, block: B:124:0x028a  */
    /* JADX WARN: Code duplicated, block: B:127:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:129:0x02da  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:143:0x0317  */
    /* JADX WARN: Code duplicated, block: B:171:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0151  */
    /* JADX WARN: Code duplicated, block: B:70:0x0157  */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:75:0x016f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0179  */
    /* JADX WARN: Code duplicated, block: B:78:0x017c  */
    /* JADX WARN: Code duplicated, block: B:80:0x017f  */
    /* JADX WARN: Code duplicated, block: B:82:0x0187  */
    /* JADX WARN: Code duplicated, block: B:83:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:90:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:94:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:98:0x0201  */
    /* JADX WARN: Instruction removed from duplicated block: B:124:0x028a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00e1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x01dc, please report this as an issue */
    private final void t(defpackage.eni eniVar, int i2) throws java.io.IOException {
        boolean z2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        short s2;
        long j2;
        boolean z6;
        int i4;
        long j3;
        int i5;
        java.lang.Integer num;
        java.lang.Object obj;
        int unsignedShort;
        long jA;
        java.lang.String strBM;
        int i6;
        int i7;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(eniVar.b);
        java.util.Set set = this.H;
        set.add(numValueOf);
        short s3 = eniVar.readShort();
        boolean z7 = k;
        if (z7) {
            android.util.Log.d("ExifInterface", defpackage.a.bo(s3, "numberOfDirectoryEntry: "));
        }
        if (s3 > 0) {
            short s4 = 0;
            while (s4 < s3) {
                int unsignedShort2 = eniVar.readUnsignedShort();
                int unsignedShort3 = eniVar.readUnsignedShort();
                int i8 = eniVar.readInt();
                long j4 = eniVar.b;
                java.util.HashMap map = y[i2];
                java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(unsignedShort2);
                defpackage.xvl xvlVar = (defpackage.xvl) map.get(numValueOf2);
                if (z7) {
                    java.lang.Integer numValueOf3 = java.lang.Integer.valueOf(i2);
                    if (xvlVar != null) {
                        i3 = 3;
                        obj3 = xvlVar.d;
                    } else {
                        i3 = 3;
                        obj3 = null;
                    }
                    java.lang.Integer numValueOf4 = java.lang.Integer.valueOf(unsignedShort3);
                    java.lang.Integer numValueOf5 = java.lang.Integer.valueOf(i8);
                    java.lang.Object[] objArr = new java.lang.Object[5];
                    objArr[0] = numValueOf3;
                    objArr[1] = numValueOf2;
                    objArr[2] = obj3;
                    objArr[i3] = numValueOf4;
                    objArr[4] = numValueOf5;
                    android.util.Log.d("ExifInterface", java.lang.String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", objArr));
                    z3 = true;
                } else {
                    i3 = 3;
                    z3 = false;
                }
                if (xvlVar == null) {
                    if (z3) {
                        android.util.Log.d("ExifInterface", defpackage.a.bo(unsignedShort2, "Skip the tag entry since tag number is not defined: "));
                    }
                    z4 = z3;
                    z5 = z7;
                } else {
                    if (unsignedShort3 > 0) {
                        int[] iArr = f;
                        int length = iArr.length;
                        if (unsignedShort3 < 14) {
                            int i9 = xvlVar.c;
                            z4 = z3;
                            int i10 = 7;
                            if (i9 == 7 || unsignedShort3 == 7) {
                                z5 = z7;
                            } else {
                                if (i9 == unsignedShort3 || (i4 = xvlVar.a) == unsignedShort3) {
                                    z5 = z7;
                                } else {
                                    z5 = z7;
                                    if (i9 != 4) {
                                        if (i4 == 4) {
                                            i4 = 4;
                                            if (unsignedShort3 != i3) {
                                            }
                                        }
                                        if (i9 == 9) {
                                        }
                                        if (z4) {
                                            android.util.Log.d("ExifInterface", "Skip the tag entry since data format (" + e[unsignedShort3] + ") is unexpected for tag: " + ((java.lang.String) xvlVar.d));
                                        }
                                    } else if (unsignedShort3 != i3) {
                                        if ((i9 == 9 && i4 != 9) || unsignedShort3 != 8) {
                                            if (z4) {
                                                android.util.Log.d("ExifInterface", "Skip the tag entry since data format (" + e[unsignedShort3] + ") is unexpected for tag: " + ((java.lang.String) xvlVar.d));
                                            }
                                        }
                                    }
                                }
                                i10 = 7;
                            }
                            if (unsignedShort3 == i10) {
                                unsignedShort3 = i9;
                            }
                            s2 = s4;
                            j2 = ((long) iArr[unsignedShort3]) * ((long) i8);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z4) {
                                    android.util.Log.d("ExifInterface", defpackage.a.bo(i8, "Skip the tag entry since the number of components is invalid: "));
                                }
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            j3 = j4 + 4;
                            if (z6) {
                                if (j2 > 4) {
                                    i7 = eniVar.readInt();
                                    if (z4) {
                                        android.util.Log.d("ExifInterface", defpackage.a.bo(i7, "seek to data offset: "));
                                    }
                                    if (this.F == 7) {
                                        obj2 = xvlVar.d;
                                        if ("MakerNote".equals(obj2)) {
                                            this.L = i7;
                                        } else if (i2 == 6) {
                                            if ("ThumbnailImage".equals(obj2)) {
                                                this.M = i7;
                                                this.N = i8;
                                                defpackage.enj enjVarE = defpackage.enj.e(6, this.I);
                                                defpackage.enj enjVarC = defpackage.enj.c(this.M, this.I);
                                                defpackage.enj enjVarC2 = defpackage.enj.c(this.N, this.I);
                                                java.util.HashMap[] mapArr = this.G;
                                                mapArr[4].put("Compression", enjVarE);
                                                mapArr[4].put("JPEGInterchangeFormat", enjVarC);
                                                mapArr[4].put("JPEGInterchangeFormatLength", enjVarC2);
                                            }
                                            i5 = 6;
                                        }
                                        i8 = i8;
                                        i5 = i2;
                                    } else {
                                        i8 = i8;
                                        i5 = i2;
                                    }
                                    eniVar.c(i7);
                                } else {
                                    i8 = i8;
                                    i5 = i2;
                                }
                                num = (java.lang.Integer) B.get(numValueOf2);
                                if (z4) {
                                    android.util.Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                                }
                                if (num != null) {
                                    if (unsignedShort3 != 3) {
                                        if (unsignedShort3 != 4) {
                                            jA = eniVar.a();
                                        } else if (unsignedShort3 == 8) {
                                            unsignedShort = eniVar.readShort();
                                        } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                            unsignedShort = eniVar.readInt();
                                        } else {
                                            jA = -1;
                                        }
                                        if (z4) {
                                            android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), xvlVar.d));
                                        }
                                        if (jA > 0 || ((i6 = eniVar.d) != -1 && jA >= i6)) {
                                            if (z4) {
                                                strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                                                if (eniVar.d != -1) {
                                                    strBM = strBM + " (total length: " + eniVar.d + ")";
                                                }
                                                android.util.Log.d("ExifInterface", strBM);
                                            }
                                        } else if (!set.contains(java.lang.Integer.valueOf((int) jA))) {
                                            eniVar.c(jA);
                                            t(eniVar, num.intValue());
                                        } else if (z4) {
                                            android.util.Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jA + ")");
                                        }
                                        eniVar.c(j3);
                                    } else {
                                        unsignedShort = eniVar.readUnsignedShort();
                                    }
                                    jA = unsignedShort;
                                    if (z4) {
                                        android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), xvlVar.d));
                                    }
                                    if (jA > 0) {
                                        if (z4) {
                                            strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                                            if (eniVar.d != -1) {
                                                strBM = strBM + " (total length: " + eniVar.d + ")";
                                            }
                                            android.util.Log.d("ExifInterface", strBM);
                                        }
                                    } else if (z4) {
                                        strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                                        if (eniVar.d != -1) {
                                            strBM = strBM + " (total length: " + eniVar.d + ")";
                                        }
                                        android.util.Log.d("ExifInterface", strBM);
                                    }
                                    eniVar.c(j3);
                                } else {
                                    int i11 = eniVar.b + this.K;
                                    byte[] bArr = new byte[(int) j2];
                                    eniVar.readFully(bArr);
                                    defpackage.enj enjVar = new defpackage.enj(unsignedShort3, i8, i11, bArr);
                                    java.util.HashMap map2 = this.G[i5];
                                    obj = xvlVar.d;
                                    map2.put(obj, enjVar);
                                    if ("DNGVersion".equals(obj)) {
                                        this.F = 3;
                                    }
                                    if (((!"Make".equals(obj) || "Model".equals(obj)) && enjVar.g(this.I).contains("PENTAX")) || ("Compression".equals(obj) && enjVar.a(this.I) == 65535)) {
                                        this.F = 8;
                                    }
                                    if (eniVar.b != j3) {
                                        eniVar.c(j3);
                                    }
                                }
                            } else {
                                eniVar.c(j3);
                                s2 = s2;
                            }
                            s4 = (short) (s2 + 1);
                            s3 = s3;
                            z7 = z5;
                        } else if (z3) {
                            z4 = z3;
                            z5 = z7;
                            s2 = s4;
                        } else {
                            z4 = z3;
                            z5 = z7;
                        }
                    } else {
                        z4 = z3;
                        z5 = z7;
                        s2 = s4;
                        if (z4) {
                        }
                        j2 = 0;
                        z6 = false;
                        j3 = j4 + 4;
                        if (z6) {
                            eniVar.c(j3);
                            s2 = s2;
                        } else {
                            if (j2 > 4) {
                                i7 = eniVar.readInt();
                                if (z4) {
                                    android.util.Log.d("ExifInterface", defpackage.a.bo(i7, "seek to data offset: "));
                                }
                                if (this.F == 7) {
                                    obj2 = xvlVar.d;
                                    if ("MakerNote".equals(obj2)) {
                                        this.L = i7;
                                    } else if (i2 == 6) {
                                        if ("ThumbnailImage".equals(obj2)) {
                                            this.M = i7;
                                            this.N = i8;
                                            defpackage.enj enjVarE2 = defpackage.enj.e(6, this.I);
                                            defpackage.enj enjVarC3 = defpackage.enj.c(this.M, this.I);
                                            defpackage.enj enjVarC4 = defpackage.enj.c(this.N, this.I);
                                            java.util.HashMap[] mapArr2 = this.G;
                                            mapArr2[4].put("Compression", enjVarE2);
                                            mapArr2[4].put("JPEGInterchangeFormat", enjVarC3);
                                            mapArr2[4].put("JPEGInterchangeFormatLength", enjVarC4);
                                        }
                                        i5 = 6;
                                    }
                                    i8 = i8;
                                    i5 = i2;
                                } else {
                                    i8 = i8;
                                    i5 = i2;
                                }
                                eniVar.c(i7);
                            } else {
                                i8 = i8;
                                i5 = i2;
                            }
                            num = (java.lang.Integer) B.get(numValueOf2);
                            if (z4) {
                                android.util.Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                            }
                            if (num != null) {
                                if (unsignedShort3 != 3) {
                                    if (unsignedShort3 != 4) {
                                        jA = eniVar.a();
                                    } else if (unsignedShort3 == 8) {
                                        if (unsignedShort3 != 9) {
                                        }
                                        unsignedShort = eniVar.readInt();
                                    } else {
                                        unsignedShort = eniVar.readShort();
                                    }
                                    if (z4) {
                                        android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), xvlVar.d));
                                    }
                                    if (jA > 0) {
                                        if (z4) {
                                            strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                                            if (eniVar.d != -1) {
                                                strBM = strBM + " (total length: " + eniVar.d + ")";
                                            }
                                            android.util.Log.d("ExifInterface", strBM);
                                        }
                                    } else if (z4) {
                                        strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                                        if (eniVar.d != -1) {
                                            strBM = strBM + " (total length: " + eniVar.d + ")";
                                        }
                                        android.util.Log.d("ExifInterface", strBM);
                                    }
                                    eniVar.c(j3);
                                } else {
                                    unsignedShort = eniVar.readUnsignedShort();
                                }
                                jA = unsignedShort;
                                if (z4) {
                                    android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), xvlVar.d));
                                }
                                if (jA > 0) {
                                    if (z4) {
                                        strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                                        if (eniVar.d != -1) {
                                            strBM = strBM + " (total length: " + eniVar.d + ")";
                                        }
                                        android.util.Log.d("ExifInterface", strBM);
                                    }
                                } else if (z4) {
                                    strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                                    if (eniVar.d != -1) {
                                        strBM = strBM + " (total length: " + eniVar.d + ")";
                                    }
                                    android.util.Log.d("ExifInterface", strBM);
                                }
                                eniVar.c(j3);
                            } else {
                                int i12 = eniVar.b + this.K;
                                byte[] bArr2 = new byte[(int) j2];
                                eniVar.readFully(bArr2);
                                defpackage.enj enjVar2 = new defpackage.enj(unsignedShort3, i8, i12, bArr2);
                                java.util.HashMap map3 = this.G[i5];
                                obj = xvlVar.d;
                                map3.put(obj, enjVar2);
                                if ("DNGVersion".equals(obj)) {
                                    this.F = 3;
                                }
                                if (!"Make".equals(obj)) {
                                }
                                this.F = 8;
                                if (eniVar.b != j3) {
                                    eniVar.c(j3);
                                }
                            }
                        }
                        s4 = (short) (s2 + 1);
                        s3 = s3;
                        z7 = z5;
                    }
                    android.util.Log.d("ExifInterface", defpackage.a.bo(unsignedShort3, "Skip the tag entry since data format is invalid: "));
                    j2 = 0;
                    z6 = false;
                    j3 = j4 + 4;
                    if (z6) {
                        eniVar.c(j3);
                        s2 = s2;
                    } else {
                        if (j2 > 4) {
                            i7 = eniVar.readInt();
                            if (z4) {
                                android.util.Log.d("ExifInterface", defpackage.a.bo(i7, "seek to data offset: "));
                            }
                            if (this.F == 7) {
                                obj2 = xvlVar.d;
                                if ("MakerNote".equals(obj2)) {
                                    this.L = i7;
                                } else if (i2 == 6) {
                                    if ("ThumbnailImage".equals(obj2)) {
                                        this.M = i7;
                                        this.N = i8;
                                        defpackage.enj enjVarE3 = defpackage.enj.e(6, this.I);
                                        defpackage.enj enjVarC5 = defpackage.enj.c(this.M, this.I);
                                        defpackage.enj enjVarC6 = defpackage.enj.c(this.N, this.I);
                                        java.util.HashMap[] mapArr3 = this.G;
                                        mapArr3[4].put("Compression", enjVarE3);
                                        mapArr3[4].put("JPEGInterchangeFormat", enjVarC5);
                                        mapArr3[4].put("JPEGInterchangeFormatLength", enjVarC6);
                                    }
                                    i5 = 6;
                                }
                                i8 = i8;
                                i5 = i2;
                            } else {
                                i8 = i8;
                                i5 = i2;
                            }
                            eniVar.c(i7);
                        } else {
                            i8 = i8;
                            i5 = i2;
                        }
                        num = (java.lang.Integer) B.get(numValueOf2);
                        if (z4) {
                            android.util.Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 != 4) {
                                    jA = eniVar.a();
                                } else if (unsignedShort3 == 8) {
                                    if (unsignedShort3 != 9) {
                                    }
                                    unsignedShort = eniVar.readInt();
                                } else {
                                    unsignedShort = eniVar.readShort();
                                }
                                if (z4) {
                                    android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), xvlVar.d));
                                }
                                if (jA > 0) {
                                    if (z4) {
                                        strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                                        if (eniVar.d != -1) {
                                            strBM = strBM + " (total length: " + eniVar.d + ")";
                                        }
                                        android.util.Log.d("ExifInterface", strBM);
                                    }
                                } else if (z4) {
                                    strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                                    if (eniVar.d != -1) {
                                        strBM = strBM + " (total length: " + eniVar.d + ")";
                                    }
                                    android.util.Log.d("ExifInterface", strBM);
                                }
                                eniVar.c(j3);
                            } else {
                                unsignedShort = eniVar.readUnsignedShort();
                            }
                            jA = unsignedShort;
                            if (z4) {
                                android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), xvlVar.d));
                            }
                            if (jA > 0) {
                                if (z4) {
                                    strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                                    if (eniVar.d != -1) {
                                        strBM = strBM + " (total length: " + eniVar.d + ")";
                                    }
                                    android.util.Log.d("ExifInterface", strBM);
                                }
                            } else if (z4) {
                                strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                                if (eniVar.d != -1) {
                                    strBM = strBM + " (total length: " + eniVar.d + ")";
                                }
                                android.util.Log.d("ExifInterface", strBM);
                            }
                            eniVar.c(j3);
                        } else {
                            int i13 = eniVar.b + this.K;
                            byte[] bArr3 = new byte[(int) j2];
                            eniVar.readFully(bArr3);
                            defpackage.enj enjVar3 = new defpackage.enj(unsignedShort3, i8, i13, bArr3);
                            java.util.HashMap map4 = this.G[i5];
                            obj = xvlVar.d;
                            map4.put(obj, enjVar3);
                            if ("DNGVersion".equals(obj)) {
                                this.F = 3;
                            }
                            if (!"Make".equals(obj)) {
                            }
                            this.F = 8;
                            if (eniVar.b != j3) {
                                eniVar.c(j3);
                            }
                        }
                    }
                    s4 = (short) (s2 + 1);
                    s3 = s3;
                    z7 = z5;
                }
                s2 = s4;
                j2 = 0;
                z6 = false;
                j3 = j4 + 4;
                if (z6) {
                    eniVar.c(j3);
                    s2 = s2;
                } else {
                    if (j2 > 4) {
                        i7 = eniVar.readInt();
                        if (z4) {
                            android.util.Log.d("ExifInterface", defpackage.a.bo(i7, "seek to data offset: "));
                        }
                        if (this.F == 7) {
                            obj2 = xvlVar.d;
                            if ("MakerNote".equals(obj2)) {
                                this.L = i7;
                            } else if (i2 == 6) {
                                if ("ThumbnailImage".equals(obj2)) {
                                    this.M = i7;
                                    this.N = i8;
                                    defpackage.enj enjVarE4 = defpackage.enj.e(6, this.I);
                                    defpackage.enj enjVarC7 = defpackage.enj.c(this.M, this.I);
                                    defpackage.enj enjVarC8 = defpackage.enj.c(this.N, this.I);
                                    java.util.HashMap[] mapArr4 = this.G;
                                    mapArr4[4].put("Compression", enjVarE4);
                                    mapArr4[4].put("JPEGInterchangeFormat", enjVarC7);
                                    mapArr4[4].put("JPEGInterchangeFormatLength", enjVarC8);
                                }
                                i5 = 6;
                            }
                            i8 = i8;
                            i5 = i2;
                        } else {
                            i8 = i8;
                            i5 = i2;
                        }
                        eniVar.c(i7);
                    } else {
                        i8 = i8;
                        i5 = i2;
                    }
                    num = (java.lang.Integer) B.get(numValueOf2);
                    if (z4) {
                        android.util.Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 != 4) {
                                jA = eniVar.a();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = eniVar.readInt();
                            } else {
                                unsignedShort = eniVar.readShort();
                            }
                            if (z4) {
                                android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), xvlVar.d));
                            }
                            if (jA > 0) {
                                if (z4) {
                                    strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                                    if (eniVar.d != -1) {
                                        strBM = strBM + " (total length: " + eniVar.d + ")";
                                    }
                                    android.util.Log.d("ExifInterface", strBM);
                                }
                            } else if (z4) {
                                strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                                if (eniVar.d != -1) {
                                    strBM = strBM + " (total length: " + eniVar.d + ")";
                                }
                                android.util.Log.d("ExifInterface", strBM);
                            }
                            eniVar.c(j3);
                        } else {
                            unsignedShort = eniVar.readUnsignedShort();
                        }
                        jA = unsignedShort;
                        if (z4) {
                            android.util.Log.d("ExifInterface", java.lang.String.format("Offset: %d, tagName: %s", java.lang.Long.valueOf(jA), xvlVar.d));
                        }
                        if (jA > 0) {
                            if (z4) {
                                strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                                if (eniVar.d != -1) {
                                    strBM = strBM + " (total length: " + eniVar.d + ")";
                                }
                                android.util.Log.d("ExifInterface", strBM);
                            }
                        } else if (z4) {
                            strBM = defpackage.a.bM(jA, "Skip jump into the IFD since its offset is invalid: ");
                            if (eniVar.d != -1) {
                                strBM = strBM + " (total length: " + eniVar.d + ")";
                            }
                            android.util.Log.d("ExifInterface", strBM);
                        }
                        eniVar.c(j3);
                    } else {
                        int i14 = eniVar.b + this.K;
                        byte[] bArr4 = new byte[(int) j2];
                        eniVar.readFully(bArr4);
                        defpackage.enj enjVar4 = new defpackage.enj(unsignedShort3, i8, i14, bArr4);
                        java.util.HashMap map5 = this.G[i5];
                        obj = xvlVar.d;
                        map5.put(obj, enjVar4);
                        if ("DNGVersion".equals(obj)) {
                            this.F = 3;
                        }
                        if (!"Make".equals(obj)) {
                        }
                        this.F = 8;
                        if (eniVar.b != j3) {
                            eniVar.c(j3);
                        }
                    }
                }
                s4 = (short) (s2 + 1);
                s3 = s3;
                z7 = z5;
            }
            boolean z8 = z7;
            int i15 = eniVar.readInt();
            if (z8) {
                android.util.Log.d("ExifInterface", java.lang.String.format("nextIfdOffset: %d", java.lang.Integer.valueOf(i15)));
                z2 = true;
            } else {
                z2 = false;
            }
            long j5 = i15;
            if (j5 <= 0) {
                if (z2) {
                    android.util.Log.d("ExifInterface", defpackage.a.bo(i15, "Stop reading file since a wrong offset may cause an infinite loop: "));
                }
            } else {
                if (set.contains(java.lang.Integer.valueOf(i15))) {
                    if (z2) {
                        android.util.Log.d("ExifInterface", defpackage.a.bo(i15, "Stop reading file since re-reading an IFD may cause an infinite loop: "));
                        return;
                    }
                    return;
                }
                eniVar.c(j5);
                java.util.HashMap[] mapArr5 = this.G;
                if (mapArr5[4].isEmpty()) {
                    t(eniVar, 4);
                } else if (mapArr5[5].isEmpty()) {
                    t(eniVar, 5);
                }
            }
        }
    }

    private final void u(defpackage.eni eniVar, int i2) throws java.lang.Throwable {
        defpackage.enj enjVarE;
        defpackage.enj enjVarE2;
        java.util.HashMap[] mapArr = this.G;
        defpackage.enj enjVar = (defpackage.enj) mapArr[i2].get("DefaultCropSize");
        defpackage.enj enjVar2 = (defpackage.enj) mapArr[i2].get("SensorTopBorder");
        defpackage.enj enjVar3 = (defpackage.enj) mapArr[i2].get("SensorLeftBorder");
        defpackage.enj enjVar4 = (defpackage.enj) mapArr[i2].get("SensorBottomBorder");
        defpackage.enj enjVar5 = (defpackage.enj) mapArr[i2].get("SensorRightBorder");
        if (enjVar != null) {
            int i3 = enjVar.a;
            java.nio.ByteOrder byteOrder = this.I;
            if (i3 == 5) {
                defpackage.enk[] enkVarArr = (defpackage.enk[]) enjVar.f(byteOrder);
                if (enkVarArr == null || enkVarArr.length != 2) {
                    android.util.Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(java.lang.String.valueOf(java.util.Arrays.toString(enkVarArr))));
                    return;
                } else {
                    enjVarE = defpackage.enj.d(enkVarArr[0], this.I);
                    enjVarE2 = defpackage.enj.d(enkVarArr[1], this.I);
                }
            } else {
                int[] iArr = (int[]) enjVar.f(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    android.util.Log.w("ExifInterface", "Invalid crop size values. cropSize=".concat(java.lang.String.valueOf(java.util.Arrays.toString(iArr))));
                    return;
                } else {
                    enjVarE = defpackage.enj.e(iArr[0], this.I);
                    enjVarE2 = defpackage.enj.e(iArr[1], this.I);
                }
            }
            mapArr[i2].put("ImageWidth", enjVarE);
            mapArr[i2].put("ImageLength", enjVarE2);
            return;
        }
        if (enjVar2 != null && enjVar3 != null && enjVar4 != null && enjVar5 != null) {
            int iA = enjVar2.a(this.I);
            int iA2 = enjVar4.a(this.I);
            int iA3 = enjVar5.a(this.I);
            int iA4 = enjVar3.a(this.I);
            if (iA2 <= iA || iA3 <= iA4) {
                return;
            }
            defpackage.enj enjVarE3 = defpackage.enj.e(iA2 - iA, this.I);
            defpackage.enj enjVarE4 = defpackage.enj.e(iA3 - iA4, this.I);
            mapArr[i2].put("ImageLength", enjVarE3);
            mapArr[i2].put("ImageWidth", enjVarE4);
            return;
        }
        defpackage.enj enjVar6 = (defpackage.enj) mapArr[i2].get("ImageLength");
        defpackage.enj enjVar7 = (defpackage.enj) mapArr[i2].get("ImageWidth");
        if (enjVar6 == null || enjVar7 == null) {
            defpackage.enj enjVar8 = (defpackage.enj) mapArr[i2].get("JPEGInterchangeFormat");
            defpackage.enj enjVar9 = (defpackage.enj) mapArr[i2].get("JPEGInterchangeFormatLength");
            if (enjVar8 == null || enjVar9 == null) {
                return;
            }
            int iA5 = enjVar8.a(this.I);
            int iA6 = enjVar9.a(this.I);
            eniVar.c(iA5);
            byte[] bArr = new byte[iA6];
            eniVar.readFully(bArr);
            e(new defpackage.eni(bArr), iA5, i2);
        }
    }

    private static final int v(byte[] bArr) throws java.lang.Throwable {
        long j2;
        defpackage.eni eniVar = null;
        try {
            try {
                defpackage.eni eniVar2 = new defpackage.eni(bArr);
                try {
                    long j3 = eniVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    eniVar2.readFully(bArr2);
                    if (!java.util.Arrays.equals(bArr2, l)) {
                        eniVar2.close();
                        return 0;
                    }
                    if (j3 == 1) {
                        j3 = eniVar2.readLong();
                        j2 = 16;
                        if (j3 < 16) {
                            eniVar2.close();
                            return 0;
                        }
                    } else {
                        j2 = 8;
                    }
                    if (j3 > 5000) {
                        j3 = 5000;
                    }
                    long j4 = j3 - j2;
                    if (j4 < 8) {
                        eniVar2.close();
                        return 0;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    for (long j5 = 0; j5 < (j4 >> 2); j5++) {
                        try {
                            eniVar2.readFully(bArr3);
                            if (j5 != 1) {
                                if (java.util.Arrays.equals(bArr3, m)) {
                                    z2 = true;
                                } else if (java.util.Arrays.equals(bArr3, n)) {
                                    z3 = true;
                                } else if (java.util.Arrays.equals(bArr3, o) || java.util.Arrays.equals(bArr3, p)) {
                                    z4 = true;
                                }
                                if (!z2) {
                                    continue;
                                } else {
                                    if (z3) {
                                        eniVar2.close();
                                        return 12;
                                    }
                                    if (z4) {
                                        eniVar2.close();
                                        return 15;
                                    }
                                }
                            }
                        } catch (java.io.EOFException unused) {
                            eniVar2.close();
                            return 0;
                        }
                    }
                    eniVar2.close();
                } catch (java.lang.Exception e2) {
                    e = e2;
                    eniVar = eniVar2;
                    if (k) {
                        android.util.Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (eniVar != null) {
                        eniVar.close();
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    eniVar = eniVar2;
                    if (eniVar != null) {
                        eniVar.close();
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } catch (java.lang.Exception e3) {
            e = e3;
        }
        return 0;
    }

    private static final java.nio.ByteOrder w(defpackage.eni eniVar) throws java.io.IOException {
        short s2 = eniVar.readShort();
        if (s2 == 18761) {
            if (k) {
                android.util.Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return java.nio.ByteOrder.LITTLE_ENDIAN;
        }
        if (s2 != 19789) {
            throw new java.io.IOException("Invalid byte order: ".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(s2))));
        }
        if (k) {
            android.util.Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return java.nio.ByteOrder.BIG_ENDIAN;
    }

    public final java.lang.String a(java.lang.String str) throws java.lang.Throwable {
        double d2;
        defpackage.enj enjVarC = c(str);
        if (enjVarC == null) {
            return null;
        }
        if (str.equals("GPSTimeStamp")) {
            int i2 = enjVarC.a;
            if (i2 != 5 && i2 != 10) {
                android.util.Log.w("ExifInterface", defpackage.a.bo(i2, "GPS Timestamp format is not rational. format="));
                return null;
            }
            defpackage.enk[] enkVarArr = (defpackage.enk[]) enjVarC.f(this.I);
            if (enkVarArr == null || enkVarArr.length != 3) {
                android.util.Log.w("ExifInterface", "Invalid GPS Timestamp array. array=".concat(java.lang.String.valueOf(java.util.Arrays.toString(enkVarArr))));
                return null;
            }
            defpackage.enk enkVar = enkVarArr[0];
            java.lang.Integer numValueOf = java.lang.Integer.valueOf((int) (enkVar.a / enkVar.b));
            defpackage.enk enkVar2 = enkVarArr[1];
            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf((int) (enkVar2.a / enkVar2.b));
            defpackage.enk enkVar3 = enkVarArr[2];
            return java.lang.String.format("%02d:%02d:%02d", numValueOf, numValueOf2, java.lang.Integer.valueOf((int) (enkVar3.a / enkVar3.b)));
        }
        boolean zContains = A.contains(str);
        java.nio.ByteOrder byteOrder = this.I;
        if (!zContains) {
            return enjVarC.g(byteOrder);
        }
        try {
            java.lang.Object objF = enjVarC.f(byteOrder);
            if (objF == null) {
                throw new java.lang.NumberFormatException("NULL can't be converted to a double value");
            }
            if (objF instanceof java.lang.String) {
                d2 = java.lang.Double.parseDouble((java.lang.String) objF);
            } else if (objF instanceof long[]) {
                long[] jArr = (long[]) objF;
                if (jArr.length != 1) {
                    throw new java.lang.NumberFormatException("There are more than one component");
                }
                d2 = jArr[0];
            } else if (objF instanceof int[]) {
                int[] iArr = (int[]) objF;
                if (iArr.length != 1) {
                    throw new java.lang.NumberFormatException("There are more than one component");
                }
                d2 = iArr[0];
            } else if (objF instanceof double[]) {
                double[] dArr = (double[]) objF;
                if (dArr.length != 1) {
                    throw new java.lang.NumberFormatException("There are more than one component");
                }
                d2 = dArr[0];
            } else {
                if (!(objF instanceof defpackage.enk[])) {
                    throw new java.lang.NumberFormatException("Couldn't find a double value");
                }
                defpackage.enk[] enkVarArr2 = (defpackage.enk[]) objF;
                if (enkVarArr2.length != 1) {
                    throw new java.lang.NumberFormatException("There are more than one component");
                }
                defpackage.enk enkVar4 = enkVarArr2[0];
                d2 = enkVar4.a / enkVar4.b;
            }
            return java.lang.Double.toString(d2);
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public final int b() {
        defpackage.enj enjVarC = c("Orientation");
        if (enjVarC == null) {
            return 1;
        }
        try {
            return enjVarC.a(this.I);
        } catch (java.lang.NumberFormatException unused) {
            return 1;
        }
    }
}
