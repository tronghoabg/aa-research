package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class zfh {
    public static volatile defpackage.zfh b;

    public zfh() {
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static java.lang.Long g(java.lang.String str) {
        if (str == null) {
            return null;
        }
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            return java.lang.Long.valueOf(java.nio.ByteBuffer.wrap(messageDigest.digest()).getLong());
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public static /* synthetic */ long h(long j) {
        int iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(j) + java.lang.Long.numberOfLeadingZeros(~j) + 44;
        if (iNumberOfLeadingZeros > 65) {
            return j * 1000000;
        }
        if (iNumberOfLeadingZeros >= 64) {
            long j2 = j * 1000000;
            if (j == 0 || j2 / j == 1000000) {
                return j2;
            }
        }
        throw new java.lang.ArithmeticException();
    }

    public static long i(java.lang.String str, int i) {
        str.getClass();
        if (str.isEmpty()) {
            throw new java.lang.NumberFormatException("empty string");
        }
        int i2 = zes.c[i] - 1;
        long j = 0;
        for (int i3 = 0; i3 < str.length(); i3++) {
            int iDigit = java.lang.Character.digit(str.charAt(i3), i);
            if (iDigit == -1) {
                throw new java.lang.NumberFormatException(str);
            }
            if (i3 > i2) {
                if (j >= 0) {
                    long j2 = zes.a[i];
                    if (j >= j2 && (j > j2 || iDigit > zes.b[i])) {
                    }
                }
                throw new java.lang.NumberFormatException("Too large for unsigned long: ".concat(str));
            }
            j = (j * ((long) i)) + ((long) iDigit);
        }
        return j;
    }

    public static long j(int i) {
        return ((long) i) & 4294967295L;
    }

    public static long k(long j, long j2, long j3) {
        defpackage.ysr.be(true, "min (%s) must be less than or equal to max (%s)", j2, j3);
        return java.lang.Math.min(java.lang.Math.max(j, j2), j3);
    }

    public static long l(byte b2, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9) {
        return (((long) b9) & 255) | ((((long) b8) & 255) << 8) | ((((long) b2) & 255) << 56) | ((((long) b3) & 255) << 48) | ((((long) b4) & 255) << 40) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 24) | ((((long) b7) & 255) << 16);
    }

    public static long[] m(java.util.Collection collection) {
        if (collection instanceof zeq) {
            throw null;
        }
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            java.lang.Object obj = array[i];
            obj.getClass();
            jArr[i] = ((java.lang.Number) obj).longValue();
        }
        return jArr;
    }

    public static zef n(java.lang.String str) {
        java.lang.String str2;
        java.lang.String strSubstring;
        java.lang.String strSubstring2;
        java.nio.charset.Charset charset = zeh.a;
        str.getClass();
        charset.getClass();
        int i = 0;
        int i2 = 0;
        while (i2 < str.length() && ":/\\?#".indexOf(str.charAt(i2)) < 0) {
            i2++;
        }
        java.lang.String strSubstring3 = null;
        if (i2 <= 0 || !str.startsWith(":", i2)) {
            str2 = null;
        } else {
            java.lang.String strSubstring4 = str.substring(0, i2);
            int i3 = i2 + 1;
            str2 = strSubstring4;
            i = i3;
        }
        if (str.startsWith("//", i)) {
            int i4 = i + 2;
            int i5 = i4;
            while (i5 < str.length() && "/\\?#".indexOf(str.charAt(i5)) < 0) {
                i5++;
            }
            strSubstring3 = str.substring(i4, i5);
            i = i5;
            strSubstring = null;
        } else {
            strSubstring = null;
        }
        int i6 = i;
        while (i6 < str.length() && "?#".indexOf(str.charAt(i6)) < 0) {
            i6++;
        }
        java.lang.String strSubstring5 = i6 > i ? str.substring(i, i6) : strSubstring;
        if (str.startsWith("?", i6)) {
            int i7 = i6 + 1;
            while (i6 < str.length() && str.charAt(i6) != '#') {
                i6++;
            }
            strSubstring2 = str.substring(i7, i6);
        } else {
            strSubstring2 = strSubstring;
        }
        if (str.startsWith("#", i6)) {
            strSubstring = str.substring(i6 + 1);
        }
        if ((str2 == null || str2.equals(zef.c(str2))) && charset.equals(charset)) {
            return new zef(str2, strSubstring3, strSubstring5, strSubstring2, strSubstring, charset, str);
        }
        return new zef(str2, strSubstring3, strSubstring5, strSubstring2, strSubstring, charset);
    }

    public static java.lang.String o(zei zeiVar, java.nio.charset.Charset charset) {
        charset.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        try {
            java.util.Iterator it = zeiVar.u().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                sb.append((java.lang.CharSequence) zeh.a((java.lang.String) entry.getKey(), charset));
                if (!((java.lang.String) entry.getValue()).isEmpty()) {
                    sb.append('=').append(zeh.a((java.lang.String) entry.getValue(), charset));
                }
                if (it.hasNext()) {
                    sb.append('&');
                }
            }
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new java.lang.AssertionError(e);
        }
    }

    public static int p(int i) {
        switch (i) {
            case defpackage.abnt.b /* 0 */:
                return 1;
            case 1:
                return 2;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return 3;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return 4;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return 5;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
            default:
                return 0;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
        }
    }

    public static zkb q(java.lang.String str, android.os.Parcelable.Creator creator) {
        adqu adquVar = new adqu(creator, false);
        int i = defpackage.admy.d;
        java.lang.String strConcat = str.concat("-bin");
        admz admzVar = new admz(strConcat, adquVar);
        defpackage.adkr adkrVar = defpackage.adkr.d;
        return new zkb(admzVar, new adko("REQ-".concat(strConcat)), new adko("RESH-".concat(strConcat)), new adko("REST-".concat(strConcat)));
    }

    public static zkb r(java.lang.String str, android.os.Parcelable.Creator creator) {
        creator.getClass();
        return q(str, creator);
    }

    public static void s(zkb zkbVar, android.os.Parcelable parcelable, defpackage.adnd adndVar) {
        zkbVar.getClass();
        parcelable.getClass();
        adndVar.f(zkbVar.a, parcelable);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: ados */
    public static void t(defpackage.adng adngVar, java.lang.Class cls, boolean z) throws ados {
        java.lang.Class<?> cls2;
        boolean z2;
        try {
            cls2 = ((defpackage.aedt) (z ? adngVar.d : adngVar.e)).a.getClass();
            z2 = false;
        } catch (java.lang.ClassCastException unused) {
            cls2 = java.lang.Object.class;
            z2 = true;
        }
        if (cls.isAssignableFrom(cls2)) {
            return;
        }
        java.lang.String str = true != z ? "response" : "request";
        java.lang.String str2 = adngVar.b;
        throw new ados(defpackage.ador.l.e("AsyncClientInterceptor: The " + str + " message type of method " + str2 + " (" + cls2.getName() + (true != z2 ? "" : ", assumed because method doesn't use ReflectableMarshaller") + ") must be a subclass of " + cls.toString()));
    }

    @java.lang.Deprecated
    public static defpackage.adpn u(android.content.Context context, defpackage.yhx yhxVar) {
        return new defpackage.ziz(context.getPackageManager(), yhxVar, defpackage.slj.a(context));
    }

    final java.lang.reflect.Type f() {
        java.lang.reflect.Type genericSuperclass = getClass().getGenericSuperclass();
        defpackage.ysr.bc(genericSuperclass instanceof java.lang.reflect.ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((java.lang.reflect.ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }

    public zfh(byte[] bArr) {
    }
}
