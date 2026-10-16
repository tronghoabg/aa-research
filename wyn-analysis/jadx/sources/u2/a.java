package U2;

import P2.d;
import P2.k;
import P2.l;
import Q1.c;
import Q1.o;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l8.AbstractC3409K;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f12235d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f12236e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f12237a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f12238b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final o f12239c = new o();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static P1.b a(android.text.Spanned r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: U2.a.a(android.text.Spanned, java.lang.String):P1.b");
    }

    public static long b(Matcher matcher, int i5) {
        String strGroup = matcher.group(i5 + 1);
        long j8 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i5 + 2);
        strGroup2.getClass();
        long j10 = (Long.parseLong(strGroup2) * 60000) + j8;
        String strGroup3 = matcher.group(i5 + 3);
        strGroup3.getClass();
        long j11 = (Long.parseLong(strGroup3) * 1000) + j10;
        String strGroup4 = matcher.group(i5 + 4);
        if (strGroup4 != null) {
            j11 += Long.parseLong(strGroup4);
        }
        return j11 * 1000;
    }

    @Override // P2.l
    public final void E(byte[] bArr, int i5, int i10, k kVar, c cVar) throws NumberFormatException {
        String strI;
        String str;
        a aVar = this;
        o oVar = aVar.f12239c;
        oVar.E(i5 + i10, bArr);
        oVar.G(i5);
        Charset charsetC = oVar.C();
        if (charsetC == null) {
            charsetC = StandardCharsets.UTF_8;
        }
        long j8 = kVar.f9081a;
        long j10 = -9223372036854775807L;
        ArrayList arrayList = (j8 == -9223372036854775807L || !kVar.f9082b) ? null : new ArrayList();
        while (true) {
            String strI2 = oVar.i(charsetC);
            if (strI2 == null) {
                break;
            }
            if (strI2.length() != 0) {
                try {
                    Integer.parseInt(strI2);
                    strI = oVar.i(charsetC);
                } catch (NumberFormatException unused) {
                    Q1.k.w("SubripParser", "Skipping invalid index: ".concat(strI2));
                }
                if (strI == null) {
                    Q1.k.w("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f12235d.matcher(strI);
                if (matcher.matches()) {
                    long jB = b(matcher, 1);
                    long jB2 = b(matcher, 6);
                    StringBuilder sb2 = aVar.f12237a;
                    sb2.setLength(0);
                    long j11 = j10;
                    ArrayList arrayList2 = aVar.f12238b;
                    arrayList2.clear();
                    String strI3 = oVar.i(charsetC);
                    while (!TextUtils.isEmpty(strI3)) {
                        if (sb2.length() > 0) {
                            sb2.append("<br>");
                        }
                        String strTrim = strI3.trim();
                        StringBuilder sb3 = new StringBuilder(strTrim);
                        Matcher matcher2 = f12236e.matcher(strTrim);
                        int i11 = 0;
                        while (matcher2.find()) {
                            String strGroup = matcher2.group();
                            arrayList2.add(strGroup);
                            int iStart = matcher2.start() - i11;
                            int length = strGroup.length();
                            sb3.replace(iStart, iStart + length, "");
                            i11 += length;
                            j8 = j8;
                        }
                        sb2.append(sb3.toString());
                        strI3 = oVar.i(charsetC);
                        j8 = j8;
                    }
                    long j12 = j8;
                    Spanned spannedFromHtml = Html.fromHtml(sb2.toString());
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            str = null;
                            break;
                        }
                        str = (String) arrayList2.get(i12);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (j12 == j11 || jB >= j12) {
                        cVar.accept(new P2.a(AbstractC3409K.n(a(spannedFromHtml, str)), jB, jB2 - jB));
                    } else if (arrayList != null) {
                        arrayList.add(new P2.a(AbstractC3409K.n(a(spannedFromHtml, str)), jB, jB2 - jB));
                    }
                    aVar = this;
                    j10 = j11;
                    j8 = j12;
                } else {
                    Q1.k.w("SubripParser", "Skipping invalid timing: ".concat(strI));
                    aVar = this;
                }
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar.accept((P2.a) it.next());
            }
        }
    }

    @Override // P2.l
    public final /* synthetic */ d H(int i5, int i10, byte[] bArr) {
        return N0.a.a(this, bArr, i10);
    }

    @Override // P2.l
    public final int P() {
        return 1;
    }

    @Override // P2.l
    public final /* synthetic */ void reset() {
    }
}
