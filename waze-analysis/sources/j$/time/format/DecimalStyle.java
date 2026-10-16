package j$.time.format;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class DecimalStyle {

    /* renamed from: d, reason: collision with root package name */
    public static final DecimalStyle f49914d = new DecimalStyle('0', '-', '.');

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f49915e = new ConcurrentHashMap(16, 0.75f, 2);

    /* renamed from: a, reason: collision with root package name */
    public final char f49916a;

    /* renamed from: b, reason: collision with root package name */
    public final char f49917b;

    /* renamed from: c, reason: collision with root package name */
    public final char f49918c;

    public DecimalStyle(char c2, char c3, char c4) {
        this.f49916a = c2;
        this.f49917b = c3;
        this.f49918c = c4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static DecimalStyle of(Locale locale) {
        Objects.requireNonNull(locale, "locale");
        ConcurrentHashMap concurrentHashMap = f49915e;
        DecimalStyle decimalStyle = (DecimalStyle) concurrentHashMap.get(locale);
        if (decimalStyle != null) {
            return decimalStyle;
        }
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(locale);
        char zeroDigit = decimalFormatSymbols.getZeroDigit();
        char minusSign = decimalFormatSymbols.getMinusSign();
        char decimalSeparator = decimalFormatSymbols.getDecimalSeparator();
        concurrentHashMap.putIfAbsent(locale, (zeroDigit == '0' && minusSign == '-' && decimalSeparator == '.') ? f49914d : new DecimalStyle(zeroDigit, minusSign, decimalSeparator));
        return (DecimalStyle) concurrentHashMap.get(locale);
    }

    public final String a(String str) {
        char c2 = this.f49916a;
        if (c2 == '0') {
            return str;
        }
        int i2 = c2 - '0';
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < charArray.length; i3++) {
            charArray[i3] = (char) (charArray[i3] + i2);
        }
        return new String(charArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecimalStyle)) {
            return false;
        }
        DecimalStyle decimalStyle = (DecimalStyle) obj;
        return this.f49916a == decimalStyle.f49916a && this.f49917b == decimalStyle.f49917b && this.f49918c == decimalStyle.f49918c;
    }

    public final int hashCode() {
        return this.f49916a + '+' + this.f49917b + this.f49918c;
    }

    public final String toString() {
        return "DecimalStyle[" + this.f49916a + '+' + this.f49917b + this.f49918c + "]";
    }
}
