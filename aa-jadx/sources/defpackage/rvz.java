package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rvz {
    public java.lang.String d;
    public long e;
    public java.lang.String f;
    public java.lang.String g;
    final defpackage.rwa i;
    public javax.net.ssl.SSLContext k;
    public javax.net.ssl.SSLEngine l;
    public int m;
    public int n;
    private final android.content.Context p;
    public static final defpackage.yqk a = defpackage.omv.n("CAR.GAL.SECURITY");
    private static final java.math.BigInteger o = java.math.BigInteger.valueOf(Long.MAX_VALUE);
    public static final byte[] b = {-125, 98, 0, 8, 37, -94, -109, -120, 17, 121, -127, 99, 32, -47, -67, 102, 80, 103, 92, -49, -30, -48, 108, -52, 21, 83, 32, -91, 36, 117, 109, -88, -105, 107, 4, 14, 20, 103, 103, 19, -62, 70, 42, -90, 33, 40, 72, -7, -113, -12, 64, -20, 92, 122, 13, -55, -89, 112, -119, 60, 57, -31, -3, -39, -127, 12, -7, 25, 4, -8, -6, -110, 127, 8, -3, 103, -82, -35, 117, -23, -7, -114, -49, 125, -32, -18, -41, 72, 84, -108, 39, 56, -24, -33, -19, 12, 81, 10, -12, -37, -36, -10, 98, -69, 93, 52, 56, -72, 88, -22, 123, -117, 46, 107, -64, 113, 15, 10, 88, -26, 125, -95, 85, -98, -40, 84, -128, -93, -89, 48, -119, 16, -14, -10, 119, 81, -101, 46, -14, 105, -86, -7, 100, -121, 69, -117, -70, -73, 127, -81, -123, 99, -10, 105, -99, 121, -28, 39, -74, -39, -35, 32, -50, 11, -59, -7, 4, -3, -103, -65, 1, 37, 80, -32, 123, 78, -67, 85, 38, 101, -66, 65, 6, 27, 118, -40, -61, 53, -16, 75, 23, -99, 58, 15, -23, -94, -21, -92, -77, -83, -45, 33, -57, 8, 105, 12, -126, 96, -51, 104, -120, -26, -39, -17, 18, -64, -18, 35, 71, -17, 1, 71, -14, -101, 34, 27, -107, -81, -120, 19, 109, 102, -86, 120, -69, -68, -111, -2, -127, -33, -90, 63, -108, 23, 95, -124, -97, 74, -55, 96, 59, -63, -55, 118, 12, 29};
    public static final byte[] c = {-75, 125, 114, -74, 10, -66, -92, -58, -110, -40, -90, -56, -106, 83, 89, -97, 95, -115, 63, -124, 103, -95, 93, 16, -1, -119, 75, -127, -88, -78, 70, -110, 48, 3, 73, 26, -6, -11, 109, -30, 104, 50, -41, -11, -39, 67, -48, -103, -61, 93, 29, -67, 26, 33, 41, -20, 4, 19, -88, 8, -41, -119, 3, 62, -105, 26, -73, 63, 121, 58, -93, 125, -127, 75, 73, -26, -100, -25, 47, 78, -38, -9, -56, -39, 22, -70, 93, -43, 77, -6, -63, 111, -37, 54, -23, -114, -123, 5, 71, -108, 52, 123, -68, 21, -60, -46, 114, -79, 89, 34, 34, 85, 41, -86, -45, -94, 23, -46, -4, -64, 61, -42, 12, -74, -81, -125, 118, 119, -110, 52, -39, 107, -5, 13, 80, -8, 117, 68, -121, 45, 69, 11, 113, 95, -92, -125, 116, -78, -71, -101, -1, 91, 19, -45, 106, 78, -73, 58, 53, 126, 54, -124, -24, -52, -102, 13, -19, -3, 107, -111, 21, 78, -127, 60, -39, 127, -106, 28, 31, -63, 28, -55, -24, -31, -70, 28, -50, 52, -25, 43, 112, 105, -92, 58, 34, 116, 73, -108, 31, -79, -61, 127, -113, -37, -7, 107, 74, 122, -13, 112, 95, 38, 100, -55, -122, -47, -17, 50, 2, -102, -111, -28, -23, 77, -108, -46, -121, -2, 64, 60, 102, -127, 76, -21, 47, -84, 72, -2, 69, -122, 107, 2, 76, 98, -75, -65, -8, -98, -20, 98, 127, 58, 103, -117, -84, -53, 102, -99, -47, -6, -13, -58, 87, 127, -96, -90, -47, 39, -26, -97, -91, 125, 31, 37, -51, -45, 90, -20, -2, -115, -3, -12, 39, -71, 55, 57, -63, 88, -100, 106, 117, -93, 59, -115, -125, 80, 127, -15, -104, -37, -29, 49, 16, 47, -46, -86, 124, -21, -93, -126, 78, 117, 70, -54, 60, -28, -58, 97, -106, 67, -73, -76, 8, 110, 100, 82, -88, 7, 117, -16, -52, 0, 27, -96, -61, 13, -92, 60, 30, 28, 66, 47, 27, -52, 64, 99, -2, 124, -13, 38, 0, 27, 22, -86, -36, 88, 43, -66, -43, 76, 58, -38, 108, -39, -43, -95, -24, -122, -5, -122, 1, -114, 81, -31, 66, -20, 55, 70, 57, 101, -29, -5, -53, 61, 36, -47, -75, -20, -64, -14, 117, -65, -121, 119, 28, -15, -18, 79, 123, -95, -99, 2, 78, 127, -84, 54, -96, -124, -35, -28, 56, 50, 122, -38, -54, -67, 6, -86, 55, 26, 86, -90, 109, 51, 101, 63, -60, 107, 52, -34, -72, -91, -104, 10, -88, 8, -115, 95, 89, 99, 81, 37, -32, -7, 21, 72, 90, 100, -35, -20, -112, 26, 90, 89, 98, 84, -98, -45, -75, -94, -38, 120, 59, -30, -4, -31, -82, 49, -114, -53, -59, 94, -113, -26, -41, -122, -117, 0, 115, -86, -105, 43, -64, -31, -18, 88, -25, 21, 37, 108, -81, -109, 11, -21, 117, 6, 30, -48, -114, 0, 2, -77, -51, -111, 70, -37, 42, 45, -67, -126, 42, 125, -37, -78, -37, -121, -45, -114, -108, -126, -98, 1, 34, -128, 89, -15, -87, -58, -9, -63, -124, -39, 73, 118, 4, -14, 127, -111, -27, -84, -62, -90, 52, 90, -122, 59, -25, 52, 105, -33, -74, -9, 20, -38, 90, -105, 51, -61, 28, -13, -68, 49, -35, 63, 38, 104, 40, 124, -48, 119, 96, -18, -47, 41, 29, 36, 71, 112, -48, 51, 67, -59, -53, 48, 90, -41, 88, 27, -59, -44, 72, 89, 42, -6, 122, -13, 93, -95, 75, 113, -22, -26, 40, 121, -57, 0, 40, 77, -4, 103, 76, 6, 88, -17, 48, 88, 72, -75, 55, -89, 116, 14, 105, 43, 126, -57, -126, -72, 99, -84, 113, 27, -52, 76, -93, -59, -127, 70, 85, -99, -120, 30, 102, -36, -1, 29, -103, -92, 17, 60, -103, -5, -102, 5, 39, -28, -78, -5, -87, 122, -52, -17, 59, -24, 24, 30, -30, -32, 91, -7, 104, 33, -98, 117, -109, -83, 63, 53, -1, 13, 38, 55, 57, -111, -22, 71, -61, 97, 6, -48, 32, 96, -65, -92, 35, -113, -21, -67, 73, 20, 11, -82, -5, 22, 39, -12, 103, 71, -101, -44, -6, -110, -80, -126, -26, -62, -119, -22, -14, 106, 4, -31, 33, 82, -34, 22, 83, 84, 121, 55, -8, -125, -104, -88, -71, 82, -23, 13, -61, -125, -6, 27, 111, -27, 91, -55, -26, -60, -19, 57, 102, -88, -121, -110, -7, -97, 123, 23, -102, -45, 85, 34, 53, 0, -118, -1, 51, 15, 7, -97, -69, -93, 62, 78, 114, -90, 0, 17, 118, -97, -87, 55, 37, 18, 46, 49, -114, 24, 34, -51, -2, -95, 96, 99, -118, 59, -112, -113, -7, 2, -74, 58, 62, -73, -125, 42, 127, 50, 51, -43, 81, -87, 51, -68, 70, 48, 84, -127, -4, 78, 74, -19, 65, -73, -122, -102, -12, -110, 9, -94, -32, -126, -91, -128, -115, 45, 56, -13, 84, 74, -105, 92, 3, -119, -117, -70, -122, -29, 20, 110, 51, 111, -76, 13, -108, 1, 125, 109, -33, -105, 102, 11, -78, -61, 100, -1, -48, 50, -105, 100, -35, 34, -33, -27, 86, 48, -45, -76, -38, -101, 48, 4, 85, -115, 28, 20, -20, -50, 70, -126, 96, -87, -17, 36, 54, -22, -73, -95, 61, 36, 80, -115, 2, 65, 29, -84, 11, -87, -115, -127, -89, -102, -99, -54, -111, 56, 66, -122, 100, 69, 100, -124, 39, -40, -107, -40, 88, 120, -106, 33, -100, 54, 39, -101, 70, -36, 77, -80, 126, -36, -28, -106, -18, -23, 24, -66, 90, -85, 12, -125, 121, 98, 6, -34, -121, -116, 60, -26, 51, 113, 111, 114, -14, 110, 53, 25, -128, -128, -120, -50, 125, -31, 41, 21, -107, 125, 70, 46, -35, -98, -81, -9, -4, -84, 99, 100, -122, -14, 126, -16, -59, 118, -88, -90, 83, -85, -118, -32, 58, -83, 
    -60, -58, 34, -65, 117, -60, 105, 10, 43, -66, 34, 75, -4, -73, -7, -16, -63, -79, 17, -36, 79, 64, -53, 47, -87, -35, -10, -48, 106, 70, -82, 54, -96, 4, 45, 119, -54, 17, 20, 23, -59, 44, -104, 71, -4, 69, -116, 52, 86, 118, 98, -73, 39, 1, -78, 99, 55, 82, -112, -17, 68, 82, 66, 93, 26, -122, 12, -93, 76, 87, -88, 83, 92, -101, 82, 32, 62, 26, -42, 105, -40, -87, -85, 97, 54, 45, 21, -25, -47, -14, 14, 56, 24, -72, -119, -46, 117, 45, -121, -109, -17, 80, 45, 55, -96, -99, 47, -107, 12, 80, 10, -22, -105, 7, 57, 112, -97, 103, -97, -5, -103, -100, 0, -107, 61, 116, -77, 54, 73, -14, -82, -115, 43, -94, -74, -97, 126, 14, -5, -87, 21, 79, -102, 123, 45, -34, 17, -37, -16, -92, -59, -4, 78, -9, 66, -13, 29, 52, 72, -53, -43, -22, -69, 46, 17, -93, -49, -128, -100, 107, 96, -53, 2, -1, 33, -75, -22, 38, 43, 58, 34, 117, 8, 37, 51, 55, -33, -36, 51, 56, 62, 118, -25, -42, -46, -97, 24, 25, -98, 17, 58, 30, -25, 70, -38, 35, -74, -102, -97, -82, 82, 121, 122, 22, 73, 32, -103, -121, -36, -19, -27, -119, 72, -33, 11, -7, 23, 97, 13, 50, 80, 115, 6, -30, -23, -33, -127, -61, -114, 124, 46, 104, 46, -56, -114, -16, 58, -45, -116, 113, 86, -76, 76, -51, -5, -14, 109, -14, -34, 39, -126, 80, 67, -65, 123, 19, -17, -56, 41, 2, 56, 55, -23, 37, -106, 104, 10, 47, -105, 108, 114, -79, 106, 19, -68, -80, 66, -118, 107, 0, -56, 12, -66, 62, 53, -99, -113, -128, -85, -36, 69, -48, -118, -11, 28, 93, 114, -27, 86, -37, 87, 120, -68, -111, -12, 68, -64, 87, -94, 62, -92, -67, -67, 121, -12, 38, 96, -64, 124, -62, -93, -105, -21, 96, 84, 63, 19, 21, 61, 72, 67, -93, 111, 96, -1, 57, -79, 108, 0, -20, -43, -25, -8, -98, 31, -57, 93, 4, 70, 125, 105, 58, -109, 2, -121, 116, -69, -56, 104, 58, -115, -35, 35, -60, 118, -97, -126, 104, 96, -19, -34, 107, 3, -108, -71, -41, 78, 49, 47, -14, -26, 71, -68, 51, 25, 73, 83, 96, -126, 73, -29, 75, -117, 94, 67, 7, -107, -38, 114, -81, -11, 93, -13, -116, -9, 114, 70, -8, 33, -111, 105, -37, 99, -33, 85, 57, 13, 101, -20, 33, 106, 55, 42, 85, -2, -36, -84, 119, 107, -25, 44, -34, -11, -74, -27, -106, 41, 102, -71, -79, -28, 26, -93, -94, 17, 76, 84, -82, -55, -112, -21, -45, 73, 92, -10, 45, 24, 102, 86, -91, -87, 48, 126, 21, -18, 37, -67, 78, 63, -127, 83, -85, -30, -54, -24, 17, 124, -42, 80, -39, 78, 64, 81, -110, -88, 63, -59, -26, 101, -40, 48, -58, -34, 46, -99, 17, -88, -12, 74, 95, 106, 67, 35, -72, 57, 65, 21, -100, -109, -24, 1, -22, 65, 48, -59, -112, 64, -74, 123, -15, 61, -100, 13, -10, 101, -72, 69, -66, -117, 1, -119, -41, 83, 102, -112, -66, 123, 112, -43, 62, 42, -102, -124, -51, -58, -119, -100, 77, 97, -62, 100, 110, -79, 112, -12, -93, -1, -93, -125, 102, -11, -19, -52, -77, 68, -94, -29, 54, 71, 117, -40, 7, 114, 12, 88, -69, 64, -125, -123, 54, -128, 97, 75, 83, 57, 115, 116, -121, 124, -67, -71, 121, -99, -106, -118, 36, 87, 66, -24, 64, -30, -121, -19, -40, 82, 117, 8, 47, 99, 41, 5, -125, -64, -17, -30, -127, 42, 18, 73, -124, 2, -25, -49, -104, 19, -103, 33, 61, -107, -125, 17, 123, -44, -36, -72, 123, -14, -24, 114, -105, 16, 6, 119, 41, -23, -45, 110, 93, -91, 100, -51, -52, -44, -127, 38, 30, 25, -119, -37, 1, 91, -126, -18, 29, 57, -42, -77, -2, 4, 91, 46, -127, 58, -63, 109, -10, -41, -87, 58, -52, -67, -123, -81, -126, -47, -79, -40, -74, 98, -120, -58, 23, -75, -46, -12, 113, -4, -17, 98, -118, 105, -30};
    public int h = 0;
    public final java.nio.ByteBuffer[] j = new java.nio.ByteBuffer[64];
    private final java.lang.Object q = new java.lang.Object();

    public rvz(android.content.Context context) {
        this.p = context;
        defpackage.adcn adcnVar = defpackage.adcn.a;
        java.lang.String strA = adcnVar.fF().a();
        byte[] bArrDecode = strA == null ? null : android.util.Base64.decode(strA, 0);
        java.lang.String strB = adcnVar.fF().b();
        java.lang.String str = (!d(strB == null ? null : android.util.Base64.decode(strB, 0), bArrDecode) || bArrDecode == null) ? null : new java.lang.String(bArrDecode);
        java.lang.String strC = adcnVar.fF().c();
        byte[] bArrDecode2 = strC == null ? null : android.util.Base64.decode(strC, 0);
        java.lang.String strD = adcnVar.fF().d();
        bArrDecode2 = true != d(strD == null ? null : android.util.Base64.decode(strD, 0), bArrDecode2) ? null : bArrDecode2;
        java.lang.String strE = adcnVar.fF().e();
        byte[] bArrDecode3 = strE == null ? null : android.util.Base64.decode(strE, 0);
        java.lang.String strF = adcnVar.fF().f();
        byte[] bArr = true == d(strF == null ? null : android.util.Base64.decode(strF, 0), bArrDecode3) ? bArrDecode3 : null;
        this.i = (str == null || bArrDecode2 == null || bArr == null) ? new defpackage.rvw() : new defpackage.rvy(str, bArrDecode2, bArr);
    }

    private static boolean d(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            try {
                java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-1");
                messageDigest.update(bArr2);
                if (java.util.Arrays.equals(messageDigest.digest(), bArr)) {
                    return true;
                }
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
            a.g().ai(8431).u("Checking validity - reject");
        }
        return false;
    }

    private static final java.nio.ByteBuffer e(java.nio.ByteBuffer[] byteBufferArr, int i, int i2) {
        defpackage.kwv kwvVar = defpackage.rtg.a;
        defpackage.rly.a(kwvVar);
        if (i == 0) {
            defpackage.rly.a(kwvVar);
            return defpackage.rwc.a.a(0);
        }
        java.nio.ByteBuffer byteBufferA = defpackage.rwc.a.a(i2);
        for (int i3 = 0; i3 < i; i3++) {
            if (byteBufferArr[i3].hasRemaining()) {
                byteBufferA.put(byteBufferArr[i3]);
            }
            byteBufferArr[i3].clear();
        }
        byteBufferA.position(0);
        byteBufferA.limit(i2);
        defpackage.rly.a(kwvVar);
        return byteBufferA;
    }

    public final java.nio.ByteBuffer a(java.nio.ByteBuffer byteBuffer) {
        int i;
        defpackage.yqk yqkVar;
        defpackage.kwv kwvVar = defpackage.rtg.a;
        defpackage.rly.a(kwvVar);
        int i2 = this.h;
        if (i2 == 0) {
            a.l().ai(8413).u("Cannot do handshake before init");
            defpackage.rly.a(kwvVar);
            return null;
        }
        if (i2 == 3) {
            a.l().ai(8412).u("Cannot handle SSL renegotiation requests.");
            defpackage.rly.a(kwvVar);
            return null;
        }
        int i3 = 2;
        if (i2 != 2) {
            try {
                javax.net.ssl.SSLEngine sSLEngine = this.l;
                sSLEngine.getClass();
                sSLEngine.beginHandshake();
                this.h = 2;
            } catch (javax.net.ssl.SSLException e) {
                a.g().p(e).ai(8411).u("Error beginning SSL Handshake");
                this.h = 4;
                defpackage.rly.a(defpackage.rtg.a);
                return null;
            }
        }
        int i4 = 0;
        java.nio.ByteBuffer byteBufferA = defpackage.rwc.a.a(0);
        int i5 = 5;
        java.nio.ByteBuffer[] byteBufferArr = new java.nio.ByteBuffer[5];
        boolean z = false;
        int i6 = 0;
        int iRemaining = 0;
        boolean z2 = false;
        while (true) {
            try {
                try {
                    javax.net.ssl.SSLEngine sSLEngine2 = this.l;
                    sSLEngine2.getClass();
                    javax.net.ssl.SSLEngineResult.HandshakeStatus handshakeStatus = sSLEngine2.getHandshakeStatus();
                    if (z) {
                        a.f().ai(8410).y("Current status: %s", handshakeStatus);
                    }
                    int i7 = defpackage.rvv.a[handshakeStatus.ordinal()];
                    if (i7 == 1) {
                        i = i4;
                        javax.net.ssl.SSLEngine sSLEngine3 = this.l;
                        sSLEngine3.getClass();
                        sSLEngine3.getDelegatedTask().run();
                        if (z) {
                            a.f().ai(8406).u("Finished running delegated task.");
                        }
                    } else if (i7 != i3) {
                        if (i7 != 3) {
                            if (i7 == 4 || i7 == i5) {
                                defpackage.yqk yqkVar2 = a;
                                yqkVar2.l().ai(8408).u("Phone finished SSL handshaking");
                                javax.net.ssl.SSLEngine sSLEngine4 = this.l;
                                sSLEngine4.getClass();
                                java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) sSLEngine4.getSession().getPeerCertificates()[i4];
                                this.d = x509Certificate.getSubjectDN().getName();
                                java.math.BigInteger serialNumber = x509Certificate.getSerialNumber();
                                if (serialNumber.compareTo(o) < 0) {
                                    yqkVar = yqkVar2;
                                    this.e = serialNumber.longValue();
                                } else {
                                    yqkVar = yqkVar2;
                                    yqkVar.h().ai(8420).y("Unable to convert serial number to long: %s", serialNumber);
                                    this.e = -1L;
                                }
                                this.g = x509Certificate.getNotAfter().toString();
                                this.f = x509Certificate.getNotBefore().toString();
                                yqkVar.f().ai(8421).y("Peer certificate subject name: %s", this.d);
                                defpackage.ypu ypuVarAi = yqkVar.f().ai(8422);
                                long j = this.e;
                                ypuVarAi.G("Peer certificate serial number: %d (0x%x)", j, j);
                                yqkVar.f().ai(8423).u("Valid Times:");
                                yqkVar.f().ai(8424).y("    notBefore= %s", this.f);
                                yqkVar.f().ai(8425).y("    notAfter= %s", this.g);
                                javax.net.ssl.SSLEngine sSLEngine5 = this.l;
                                sSLEngine5.getClass();
                                java.security.cert.X509Certificate x509Certificate2 = (java.security.cert.X509Certificate) sSLEngine5.getSession().getLocalCertificates()[i4];
                                x509Certificate2.getSubjectDN().getName();
                                x509Certificate2.getNotBefore();
                                x509Certificate2.getNotAfter();
                                java.lang.String str = this.d;
                                str.getClass();
                                if (str.contains("CarService")) {
                                    throw new javax.net.ssl.SSLPeerUnverifiedException("Head Unit must not use CarService certificate");
                                }
                                java.lang.String str2 = this.d;
                                str2.getClass();
                                if (str2.contains("Google Automotive Link")) {
                                    throw new javax.net.ssl.SSLPeerUnverifiedException("Head Unit cannot send certificate of the CA. It must send its own certificate");
                                }
                                this.h = 3;
                                if (z) {
                                    yqkVar.f().ai(8409).u("Finished handling handshake complete.");
                                }
                            }
                        } else if (byteBuffer == null || !byteBuffer.hasRemaining()) {
                            try {
                                a.h().ai(8407).u("Phone will wait for car to send more SSL handshake data");
                                z = true;
                                z2 = true;
                            } catch (java.lang.Exception e2) {
                                e = e2;
                                z = true;
                                a.g().p(e).ai(8405).u("Error in SSL handshake");
                                this.h = 4;
                            }
                        } else {
                            c(byteBuffer, null);
                        }
                        i = i4;
                    } else {
                        i = i4;
                        java.nio.ByteBuffer byteBufferB = b(byteBufferA, i, i, i);
                        byteBufferArr[i6] = byteBufferB;
                        iRemaining += byteBufferB.remaining();
                        i6++;
                    }
                    if (z2 || this.h != 2) {
                        break;
                    }
                    i4 = i;
                    i3 = 2;
                    i5 = 5;
                } catch (java.lang.Exception e3) {
                    e = e3;
                }
            } catch (java.lang.Throwable th) {
                if (byteBufferA != null) {
                    defpackage.rwc.a.b(byteBufferA);
                }
                throw th;
            }
        }
        if (byteBufferA != null) {
            defpackage.rwc.a.b(byteBufferA);
        }
        java.nio.ByteBuffer byteBufferE = iRemaining > 0 ? e(byteBufferArr, i6, iRemaining) : null;
        if (byteBufferE != null) {
            a.l().ai(8404).u("Phone will send SSL handshake data to car");
        }
        defpackage.rly.a(defpackage.rtg.a);
        if (z) {
            a.f().ai(8403).y("Final result: %s", byteBufferE);
        }
        return byteBufferE;
    }

    public final java.nio.ByteBuffer b(java.nio.ByteBuffer byteBuffer, int i, int i2, int i3) throws javax.net.ssl.SSLException {
        javax.net.ssl.SSLEngineResult sSLEngineResultWrap;
        defpackage.rly.a(defpackage.rtg.a);
        int iLimit = byteBuffer.limit();
        try {
            byteBuffer.position(i);
            byteBuffer.limit(i + i2);
            int i4 = 0;
            int iBytesProduced = 0;
            boolean z = false;
            do {
                java.nio.ByteBuffer[] byteBufferArr = this.j;
                java.nio.ByteBuffer byteBufferAllocateDirect = byteBufferArr[i4];
                if (byteBufferAllocateDirect == null) {
                    byteBufferAllocateDirect = java.nio.ByteBuffer.allocateDirect(this.m);
                    byteBufferArr[i4] = byteBufferAllocateDirect;
                }
                byteBufferAllocateDirect.clear();
                if (i4 == 0) {
                    byteBufferArr[0].position(i3);
                    i4 = 0;
                }
                synchronized (this.q) {
                    javax.net.ssl.SSLEngine sSLEngine = this.l;
                    sSLEngine.getClass();
                    sSLEngineResultWrap = sSLEngine.wrap(byteBuffer, byteBufferArr[i4]);
                }
                byteBufferArr[i4].flip();
                iBytesProduced += sSLEngineResultWrap.bytesProduced();
                i4++;
                int i5 = defpackage.rvv.b[sSLEngineResultWrap.getStatus().ordinal()];
                if (i5 != 1) {
                    if (i5 == 2) {
                        a.g().ai(8417).u("Buffer underflow when encrypting bytes to send");
                    } else if (i5 == 4) {
                        a.g().ai(8418).u("SSLEngine closed when preparing bytes to send");
                    }
                    z = true;
                } else {
                    a.h().ai(8416).u("Buffer overflow when encrypting bytes to send");
                }
                if (z || !byteBuffer.hasRemaining()) {
                    break;
                }
            } while (i4 < 64);
            java.nio.ByteBuffer[] byteBufferArr2 = this.j;
            java.nio.ByteBuffer byteBufferE = i4 == 1 ? byteBufferArr2[0] : e(byteBufferArr2, i4, iBytesProduced);
            defpackage.rly.a(defpackage.rtg.a);
            if (byteBuffer.hasRemaining()) {
                a.g().ai(8414).u("Did not encrypt all the bytes in the input!");
            }
            byteBuffer.limit(iLimit);
            return byteBufferE;
        } catch (java.lang.Throwable th) {
            if (byteBuffer.hasRemaining()) {
                a.g().ai(8415).u("Did not encrypt all the bytes in the input!");
            }
            byteBuffer.limit(iLimit);
            throw th;
        }
    }

    public final void c(java.nio.ByteBuffer byteBuffer, java.nio.ByteBuffer byteBuffer2) throws javax.net.ssl.SSLException {
        javax.net.ssl.SSLEngineResult sSLEngineResultUnwrap;
        defpackage.rly.a(defpackage.rtg.a);
        java.nio.ByteBuffer byteBufferA = byteBuffer2 == null ? defpackage.rwc.a.a(this.n) : byteBuffer2;
        int iLimit = byteBuffer.limit();
        int i = 0;
        boolean z = false;
        do {
            if (byteBuffer2 == null) {
                try {
                    byteBufferA.clear();
                } catch (java.lang.Throwable th) {
                    if (byteBuffer.hasRemaining()) {
                        a.g().ai(8399).u("Did not decrypt all the bytes in the input buffer!");
                    }
                    byteBuffer.limit(iLimit);
                    throw th;
                }
            }
            synchronized (this.q) {
                javax.net.ssl.SSLEngine sSLEngine = this.l;
                sSLEngine.getClass();
                sSLEngineResultUnwrap = sSLEngine.unwrap(byteBuffer, byteBufferA);
            }
            i++;
            int i2 = defpackage.rvv.b[sSLEngineResultUnwrap.getStatus().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    a.g().ai(8401).u("Buffer underflow when decrypting bytes received");
                    defpackage.omv.i(this.p, defpackage.yyn.DECRYPTION_BUFFER_UNDERFLOW);
                } else if (i2 == 4) {
                    a.g().ai(8402).u("SSLEngine closed when preparing bytes to send");
                }
                z = true;
            } else {
                a.f().ai(8400).u("Buffer overflow when decrypting bytes received");
                defpackage.omv.i(this.p, defpackage.yyn.DECRYPTION_BUFFER_OVERFLOW);
            }
            if (z || !byteBuffer.hasRemaining()) {
                break;
            }
        } while (i < 64);
        if (byteBuffer2 == null) {
            defpackage.rwc.a.b(byteBufferA);
        }
        defpackage.rly.a(defpackage.rtg.a);
        if (byteBuffer.hasRemaining()) {
            a.g().ai(8398).u("Did not decrypt all the bytes in the input buffer!");
        }
        byteBuffer.limit(iLimit);
    }
}
