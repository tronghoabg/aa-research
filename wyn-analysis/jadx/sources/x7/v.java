package x7;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final DecimalFormat f47821a;

    /* renamed from: b, reason: collision with root package name */
    public static final DecimalFormat f47822b;

    static {
        Locale locale = Locale.ROOT;
        f47821a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f47822b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    }
}
