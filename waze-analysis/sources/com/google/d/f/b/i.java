package com.google.d.f.b;

import androidx.media3.muxer.MuxerUtil;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Formattable;
import java.util.Formatter;
import java.util.Locale;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    static final Locale f7770a = Locale.ROOT;

    public static String a(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            if (obj.getClass().isArray()) {
                return obj instanceof int[] ? Arrays.toString((int[]) obj) : obj instanceof long[] ? Arrays.toString((long[]) obj) : obj instanceof byte[] ? Arrays.toString((byte[]) obj) : obj instanceof char[] ? Arrays.toString((char[]) obj) : obj instanceof short[] ? Arrays.toString((short[]) obj) : obj instanceof float[] ? Arrays.toString((float[]) obj) : obj instanceof double[] ? Arrays.toString((double[]) obj) : obj instanceof boolean[] ? Arrays.toString((boolean[]) obj) : Arrays.toString((Object[]) obj);
            }
            String string = obj.toString();
            return string != null ? string : d(obj, "toString() returned null");
        } catch (RuntimeException e2) {
            return e(obj, e2);
        }
    }

    static void b(StringBuilder sb, Number number, c cVar) {
        boolean zI = cVar.i();
        long jLongValue = number.longValue();
        if (number instanceof Long) {
            f(sb, jLongValue, zI);
            return;
        }
        if (number instanceof Integer) {
            f(sb, jLongValue & MuxerUtil.UNSIGNED_INT_MAX_VALUE, zI);
            return;
        }
        if (number instanceof Byte) {
            f(sb, jLongValue & 255, zI);
            return;
        }
        if (number instanceof Short) {
            f(sb, jLongValue & 65535, zI);
        } else {
            if (!(number instanceof BigInteger)) {
                throw new IllegalStateException("unsupported number type: ".concat(String.valueOf(String.valueOf(number.getClass()))));
            }
            String string = ((BigInteger) number).toString(16);
            if (zI) {
                string = string.toUpperCase(f7770a);
            }
            sb.append(string);
        }
    }

    public static void c(Formattable formattable, StringBuilder sb, c cVar) throws IOException {
        int iA = cVar.a();
        int i2 = iA & 162;
        if (i2 != 0) {
            i2 = ((iA & 32) != 0 ? 1 : 0) | ((iA & 128) != 0 ? 2 : 0) | ((iA & 2) != 0 ? 4 : 0);
        }
        int length = sb.length();
        Formatter formatter = new Formatter(sb, f7770a);
        try {
            formattable.formatTo(formatter, i2, cVar.c(), cVar.b());
        } catch (RuntimeException e2) {
            sb.setLength(length);
            try {
                formatter.out().append(e(formattable, e2));
            } catch (IOException unused) {
            }
        }
    }

    private static String d(Object obj, String str) {
        return "{" + obj.getClass().getName() + "@" + System.identityHashCode(obj) + ": " + str + "}";
    }

    private static String e(Object obj, RuntimeException runtimeException) {
        String simpleName;
        try {
            simpleName = runtimeException.toString();
        } catch (RuntimeException e2) {
            simpleName = e2.getClass().getSimpleName();
        }
        return d(obj, simpleName);
    }

    private static void f(StringBuilder sb, long j2, boolean z) {
        if (j2 == 0) {
            sb.append("0");
            return;
        }
        String str = true != z ? "0123456789abcdef" : "0123456789ABCDEF";
        for (int iNumberOfLeadingZeros = (63 - Long.numberOfLeadingZeros(j2)) & (-4); iNumberOfLeadingZeros >= 0; iNumberOfLeadingZeros -= 4) {
            sb.append(str.charAt((int) ((j2 >>> iNumberOfLeadingZeros) & 15)));
        }
    }
}
