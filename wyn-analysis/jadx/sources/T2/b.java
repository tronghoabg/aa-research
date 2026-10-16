package T2;

import P2.l;
import Q1.k;
import Q1.o;
import Q1.x;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.unity3d.services.UnityAdsConstants;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class b implements l {

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f11370g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11371a;

    /* renamed from: b, reason: collision with root package name */
    public final a f11372b;

    /* renamed from: d, reason: collision with root package name */
    public LinkedHashMap f11374d;

    /* renamed from: e, reason: collision with root package name */
    public float f11375e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public float f11376f = -3.4028235E38f;

    /* renamed from: c, reason: collision with root package name */
    public final o f11373c = new o();

    public b(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.f11371a = false;
            this.f11372b = null;
            return;
        }
        this.f11371a = true;
        String strN = x.n((byte[]) list.get(0));
        k.c(strN.startsWith("Format:"));
        a aVarB = a.b(strN);
        aVarB.getClass();
        this.f11372b = aVarB;
        b(new o((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }

    public static int a(long j8, ArrayList arrayList, ArrayList arrayList2) {
        int i5;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i5 = 0;
                break;
            }
            if (((Long) arrayList.get(size)).longValue() == j8) {
                return size;
            }
            if (((Long) arrayList.get(size)).longValue() < j8) {
                i5 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i5, Long.valueOf(j8));
        arrayList2.add(i5, i5 == 0 ? new ArrayList() : new ArrayList((Collection) arrayList2.get(i5 - 1)));
        return i5;
    }

    public static long c(String str) {
        Matcher matcher = f11370g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i5 = x.f9724a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // P2.l
    public final void E(byte[] bArr, int i5, int i10, P2.k kVar, Q1.c cVar) throws NumberFormatException {
        Charset charset;
        a aVar;
        o oVar;
        int i11;
        float f10;
        int i12;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i13;
        PointF pointF;
        int i14;
        int i15;
        float f11;
        float f12;
        float f13;
        float f14;
        int i16;
        float f15;
        int i17;
        int i18;
        Integer num;
        int iA;
        int i19;
        b bVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        o oVar2 = bVar.f11373c;
        oVar2.E(i5 + i10, bArr);
        oVar2.G(i5);
        Charset charsetC = oVar2.C();
        if (charsetC == null) {
            charsetC = StandardCharsets.UTF_8;
        }
        boolean z2 = bVar.f11371a;
        if (!z2) {
            bVar.b(oVar2, charsetC);
        }
        a aVarB = z2 ? bVar.f11372b : null;
        while (true) {
            String strI = oVar2.i(charsetC);
            if (strI == null) {
                long j8 = kVar.f9081a;
                ArrayList arrayList3 = (j8 == -9223372036854775807L || !kVar.f9082b) ? null : new ArrayList();
                for (int i20 = 0; i20 < arrayList.size(); i20++) {
                    List list = (List) arrayList.get(i20);
                    if (!list.isEmpty() || i20 == 0) {
                        if (i20 == arrayList.size() - 1) {
                            throw new IllegalStateException();
                        }
                        long jLongValue = ((Long) arrayList2.get(i20)).longValue();
                        long jLongValue2 = ((Long) arrayList2.get(i20 + 1)).longValue() - ((Long) arrayList2.get(i20)).longValue();
                        if (j8 == -9223372036854775807L || jLongValue >= j8) {
                            cVar.accept(new P2.a(list, jLongValue, jLongValue2));
                        } else if (arrayList3 != null) {
                            arrayList3.add(new P2.a(list, jLongValue, jLongValue2));
                        }
                    }
                }
                if (arrayList3 != null) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        cVar.accept((P2.a) it.next());
                    }
                    return;
                }
                return;
            }
            if (strI.startsWith("Format:")) {
                aVarB = a.b(strI);
            } else if (strI.startsWith("Dialogue:")) {
                if (aVarB == null) {
                    k.w("SsaParser", "Skipping dialogue line before complete format: ".concat(strI));
                } else {
                    k.c(strI.startsWith("Dialogue:"));
                    String strSubstring = strI.substring(9);
                    int i21 = aVarB.f11369e;
                    String[] strArrSplit = strSubstring.split(",", i21);
                    if (strArrSplit.length != i21) {
                        k.w("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strI));
                    } else {
                        long jC = c(strArrSplit[aVarB.f11365a]);
                        if (jC == -9223372036854775807L) {
                            k.w("SsaParser", "Skipping invalid timing: ".concat(strI));
                        } else {
                            long jC2 = c(strArrSplit[aVarB.f11366b]);
                            if (jC2 == -9223372036854775807L) {
                                k.w("SsaParser", "Skipping invalid timing: ".concat(strI));
                            } else {
                                LinkedHashMap linkedHashMap = bVar.f11374d;
                                e eVar = (linkedHashMap == null || (i19 = aVarB.f11367c) == -1) ? null : (e) linkedHashMap.get(strArrSplit[i19].trim());
                                String str = strArrSplit[aVarB.f11368d];
                                Matcher matcher = d.f11387a.matcher(str);
                                int i22 = -1;
                                PointF pointF2 = null;
                                while (matcher.find()) {
                                    Charset charset2 = charsetC;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFA = d.a(strGroup);
                                        if (pointFA != null) {
                                            pointF2 = pointFA;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = d.f11390d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iA = e.a(strGroup2);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i22 = iA;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    charsetC = charset2;
                                }
                                charset = charsetC;
                                String strReplace = d.f11387a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f16 = bVar.f11375e;
                                float f17 = bVar.f11376f;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (eVar != null) {
                                    Integer num2 = eVar.f11393c;
                                    if (num2 != null) {
                                        aVar = aVarB;
                                        oVar = oVar2;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        aVar = aVarB;
                                        oVar = oVar2;
                                    }
                                    if (eVar.f11400j == 3 && (num = eVar.f11394d) != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    }
                                    float f18 = eVar.f11395e;
                                    if (f18 == -3.4028235E38f || f17 == -3.4028235E38f) {
                                        f14 = -3.4028235E38f;
                                        i16 = Integer.MIN_VALUE;
                                    } else {
                                        f14 = f18 / f17;
                                        i16 = 1;
                                    }
                                    boolean z10 = eVar.f11397g;
                                    boolean z11 = eVar.f11396f;
                                    if (z11 && z10) {
                                        f15 = f14;
                                        i17 = i16;
                                        i11 = 0;
                                        i18 = 33;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        f15 = f14;
                                        i17 = i16;
                                        i11 = 0;
                                        i18 = 33;
                                        if (z11) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z10) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (eVar.f11398h) {
                                        spannableString.setSpan(new UnderlineSpan(), i11, spannableString.length(), i18);
                                    }
                                    if (eVar.f11399i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i11, spannableString.length(), i18);
                                    }
                                    i12 = i17;
                                    f10 = f15;
                                } else {
                                    aVar = aVarB;
                                    oVar = oVar2;
                                    i11 = 0;
                                    f10 = -3.4028235E38f;
                                    i12 = Integer.MIN_VALUE;
                                }
                                int i23 = -1;
                                if (i22 != -1) {
                                    i23 = i22;
                                } else if (eVar != null) {
                                    i23 = eVar.f11392b;
                                }
                                switch (i23) {
                                    case 0:
                                    default:
                                        N0.a.o(i23, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        alignment2 = null;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        alignment = Layout.Alignment.ALIGN_NORMAL;
                                        alignment2 = alignment;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        alignment = Layout.Alignment.ALIGN_CENTER;
                                        alignment2 = alignment;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                        alignment2 = alignment;
                                        break;
                                }
                                int i24 = Integer.MIN_VALUE;
                                switch (i23) {
                                    case 0:
                                    default:
                                        N0.a.o(i23, "Unknown alignment: ", "SsaParser");
                                    case -1:
                                        i13 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        i13 = i11;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i13 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i13 = 2;
                                        break;
                                }
                                switch (i23) {
                                    case -1:
                                        pointF = pointF2;
                                        break;
                                    case 0:
                                    default:
                                        N0.a.o(i23, "Unknown alignment: ", "SsaParser");
                                        pointF = pointF2;
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        pointF = pointF2;
                                        i24 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        pointF = pointF2;
                                        i24 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        i24 = i11;
                                        pointF = pointF2;
                                        break;
                                }
                                if (pointF == null || f17 == -3.4028235E38f || f16 == -3.4028235E38f) {
                                    if (i13 != 0) {
                                        i14 = 1;
                                        if (i13 != 1) {
                                            i15 = 2;
                                            f11 = i13 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i15 = 2;
                                            f11 = 0.5f;
                                        }
                                    } else {
                                        i14 = 1;
                                        i15 = 2;
                                        f11 = 0.05f;
                                    }
                                    f12 = i24 != 0 ? i24 != i14 ? i24 != i15 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                    f13 = f11;
                                } else {
                                    float f19 = pointF.x / f16;
                                    f12 = pointF.y / f17;
                                    f13 = f19;
                                }
                                P1.b bVar2 = new P1.b(spannableString, alignment2, null, null, f12, i11, i24, f13, i13, i12, f10, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                int iA2 = a(jC2, arrayList2, arrayList);
                                for (int iA3 = a(jC, arrayList2, arrayList); iA3 < iA2; iA3++) {
                                    ((List) arrayList.get(iA3)).add(bVar2);
                                }
                                bVar = this;
                                charsetC = charset;
                                aVarB = aVar;
                                oVar2 = oVar;
                            }
                        }
                    }
                }
                charset = charsetC;
                aVar = aVarB;
                oVar = oVar2;
                bVar = this;
                charsetC = charset;
                aVarB = aVar;
                oVar2 = oVar;
            } else {
                charset = charsetC;
                aVar = aVarB;
                oVar = oVar2;
                bVar = this;
                charsetC = charset;
                aVarB = aVar;
                oVar2 = oVar;
            }
        }
    }

    @Override // P2.l
    public final /* synthetic */ P2.d H(int i5, int i10, byte[] bArr) {
        return N0.a.a(this, bArr, i10);
    }

    @Override // P2.l
    public final int P() {
        return 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(Q1.o r38, java.nio.charset.Charset r39) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.b.b(Q1.o, java.nio.charset.Charset):void");
    }

    @Override // P2.l
    public final /* synthetic */ void reset() {
    }
}
