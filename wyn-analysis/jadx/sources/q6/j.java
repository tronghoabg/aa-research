package q6;

import java.util.regex.Pattern;
import org.apache.tika.metadata.TikaCoreProperties;
import u6.v;

/* loaded from: classes3.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f44168a = 0;

    static {
        Pattern.compile("^NOTE([ \t].*)?$");
    }

    public static float a(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long b(String str) {
        int i5 = v.f46721a;
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
}
