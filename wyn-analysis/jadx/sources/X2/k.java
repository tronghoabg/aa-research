package X2;

import N1.D;
import Q1.o;
import Q1.x;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f16077a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(o oVar) {
        oVar.getClass();
        String strI = oVar.i(StandardCharsets.UTF_8);
        return strI != null && strI.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i5 = x.f9724a;
        String[] strArrSplit = str.split("\\.", 2);
        long j8 = 0;
        for (String str2 : strArrSplit[0].split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1)) {
            j8 = (j8 * 60) + Long.parseLong(str2);
        }
        long j10 = j8 * 1000;
        if (strArrSplit.length == 2) {
            j10 += Long.parseLong(strArrSplit[1]);
        }
        return j10 * 1000;
    }

    public static void d(o oVar) {
        int i5 = oVar.f9703b;
        if (a(oVar)) {
            return;
        }
        oVar.G(i5);
        throw D.a(null, "Expected WEBVTT. Got " + oVar.i(StandardCharsets.UTF_8));
    }
}
