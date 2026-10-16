package m6;

import A7.AbstractC0279p0;
import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.moloco.sdk.acm.http.d;
import com.unity3d.services.UnityAdsConstants;
import h6.AbstractC2786e;
import h6.C2783b;
import h6.InterfaceC2787f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k8.AbstractC3198g;
import u6.AbstractC4256a;
import u6.v;

/* renamed from: m6.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3490a extends AbstractC2786e {

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f40369r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: m, reason: collision with root package name */
    public final boolean f40370m;

    /* renamed from: n, reason: collision with root package name */
    public final T2.a f40371n;

    /* renamed from: o, reason: collision with root package name */
    public LinkedHashMap f40372o;

    /* renamed from: p, reason: collision with root package name */
    public float f40373p = -3.4028235E38f;

    /* renamed from: q, reason: collision with root package name */
    public float f40374q = -3.4028235E38f;

    public C3490a(List list) throws NumberFormatException {
        if (list == null || list.isEmpty()) {
            this.f40370m = false;
            this.f40371n = null;
            return;
        }
        this.f40370m = true;
        byte[] bArr = (byte[]) list.get(0);
        int i5 = v.f46721a;
        String str = new String(bArr, AbstractC3198g.f39301c);
        AbstractC4256a.e(str.startsWith("Format:"));
        T2.a aVarC = T2.a.c(str);
        aVarC.getClass();
        this.f40371n = aVarC;
        i(new Y4.b((byte[]) list.get(1)));
    }

    public static int h(long j8, ArrayList arrayList, ArrayList arrayList2) {
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

    public static long j(String str) {
        Matcher matcher = f40369r.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i5 = v.f46721a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(strGroup) * 3600000000L);
    }

    @Override // h6.AbstractC2786e
    public final InterfaceC2787f e(byte[] bArr, int i5, boolean z2) throws NumberFormatException {
        Y4.b bVar;
        T2.a aVar;
        float f10;
        int i10;
        float f11;
        int i11;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i12;
        int i13;
        int i14;
        float f12;
        float f13;
        float f14;
        float f15;
        int i15;
        float f16;
        int i16;
        int i17;
        Integer num;
        int iA;
        int i18;
        C3490a c3490a = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Y4.b bVar2 = new Y4.b(bArr, i5);
        boolean z10 = c3490a.f40370m;
        if (!z10) {
            c3490a.i(bVar2);
        }
        T2.a aVarC = z10 ? c3490a.f40371n : null;
        while (true) {
            String strE = bVar2.e();
            if (strE == null) {
                return new d(arrayList, arrayList2);
            }
            if (strE.startsWith("Format:")) {
                aVarC = T2.a.c(strE);
            } else if (strE.startsWith("Dialogue:")) {
                if (aVarC == null) {
                    AbstractC4256a.E("SsaDecoder", "Skipping dialogue line before complete format: ".concat(strE));
                } else {
                    AbstractC4256a.e(strE.startsWith("Dialogue:"));
                    String strSubstring = strE.substring(9);
                    int i19 = aVarC.f11369e;
                    String[] strArrSplit = strSubstring.split(",", i19);
                    if (strArrSplit.length != i19) {
                        AbstractC4256a.E("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(strE));
                    } else {
                        long j8 = j(strArrSplit[aVarC.f11365a]);
                        if (j8 == -9223372036854775807L) {
                            AbstractC4256a.E("SsaDecoder", "Skipping invalid timing: ".concat(strE));
                        } else {
                            long j10 = j(strArrSplit[aVarC.f11366b]);
                            if (j10 == -9223372036854775807L) {
                                AbstractC4256a.E("SsaDecoder", "Skipping invalid timing: ".concat(strE));
                            } else {
                                LinkedHashMap linkedHashMap = c3490a.f40372o;
                                C3492c c3492c = (linkedHashMap == null || (i18 = aVarC.f11367c) == -1) ? null : (C3492c) linkedHashMap.get(strArrSplit[i18].trim());
                                String str = strArrSplit[aVarC.f11368d];
                                Matcher matcher = C3491b.f40375a.matcher(str);
                                int i20 = -1;
                                PointF pointF = null;
                                while (matcher.find()) {
                                    Y4.b bVar3 = bVar2;
                                    String strGroup = matcher.group(1);
                                    strGroup.getClass();
                                    try {
                                        PointF pointFA = C3491b.a(strGroup);
                                        if (pointFA != null) {
                                            pointF = pointFA;
                                        }
                                    } catch (RuntimeException unused) {
                                    }
                                    try {
                                        Matcher matcher2 = C3491b.f40378d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            String strGroup2 = matcher2.group(1);
                                            strGroup2.getClass();
                                            iA = C3492c.a(strGroup2);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i20 = iA;
                                        }
                                    } catch (RuntimeException unused2) {
                                    }
                                    bVar2 = bVar3;
                                }
                                bVar = bVar2;
                                String strReplace = C3491b.f40375a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                float f17 = c3490a.f40373p;
                                float f18 = c3490a.f40374q;
                                SpannableString spannableString = new SpannableString(strReplace);
                                if (c3492c != null) {
                                    Integer num2 = c3492c.f40381c;
                                    if (num2 != null) {
                                        aVar = aVarC;
                                        f10 = f17;
                                        spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                    } else {
                                        aVar = aVarC;
                                        f10 = f17;
                                    }
                                    if (c3492c.f40388j == 3 && (num = c3492c.f40382d) != null) {
                                        spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                    }
                                    float f19 = c3492c.f40383e;
                                    if (f19 == -3.4028235E38f || f18 == -3.4028235E38f) {
                                        f15 = -3.4028235E38f;
                                        i15 = Integer.MIN_VALUE;
                                    } else {
                                        f15 = f19 / f18;
                                        i15 = 1;
                                    }
                                    boolean z11 = c3492c.f40385g;
                                    boolean z12 = c3492c.f40384f;
                                    if (z12 && z11) {
                                        f16 = f15;
                                        i16 = i15;
                                        i10 = 0;
                                        i17 = 33;
                                        spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                    } else {
                                        f16 = f15;
                                        i16 = i15;
                                        i10 = 0;
                                        i17 = 33;
                                        if (z12) {
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        } else if (z11) {
                                            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                        }
                                    }
                                    if (c3492c.f40386h) {
                                        spannableString.setSpan(new UnderlineSpan(), i10, spannableString.length(), i17);
                                    }
                                    if (c3492c.f40387i) {
                                        spannableString.setSpan(new StrikethroughSpan(), i10, spannableString.length(), i17);
                                    }
                                    i11 = i16;
                                    f11 = f16;
                                } else {
                                    aVar = aVarC;
                                    f10 = f17;
                                    i10 = 0;
                                    f11 = -3.4028235E38f;
                                    i11 = Integer.MIN_VALUE;
                                }
                                int i21 = -1;
                                if (i20 != -1) {
                                    i21 = i20;
                                } else if (c3492c != null) {
                                    i21 = c3492c.f40380b;
                                }
                                switch (i21) {
                                    case 0:
                                    default:
                                        AbstractC0279p0.u(i21, "Unknown alignment: ", "SsaDecoder");
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
                                int i22 = Integer.MIN_VALUE;
                                switch (i21) {
                                    case 0:
                                    default:
                                        AbstractC0279p0.u(i21, "Unknown alignment: ", "SsaDecoder");
                                    case -1:
                                        i12 = Integer.MIN_VALUE;
                                        break;
                                    case 1:
                                    case 4:
                                    case 7:
                                        i12 = i10;
                                        break;
                                    case 2:
                                    case 5:
                                    case 8:
                                        i12 = 1;
                                        break;
                                    case 3:
                                    case 6:
                                    case 9:
                                        i12 = 2;
                                        break;
                                }
                                switch (i21) {
                                    case -1:
                                        break;
                                    case 0:
                                    default:
                                        AbstractC0279p0.u(i21, "Unknown alignment: ", "SsaDecoder");
                                        break;
                                    case 1:
                                    case 2:
                                    case 3:
                                        i22 = 2;
                                        break;
                                    case 4:
                                    case 5:
                                    case 6:
                                        i22 = 1;
                                        break;
                                    case 7:
                                    case 8:
                                    case 9:
                                        i22 = i10;
                                        break;
                                }
                                if (pointF == null || f18 == -3.4028235E38f || f10 == -3.4028235E38f) {
                                    if (i12 != 0) {
                                        i14 = 1;
                                        if (i12 != 1) {
                                            i13 = 2;
                                            f12 = i12 != 2 ? -3.4028235E38f : 0.95f;
                                        } else {
                                            i13 = 2;
                                            f12 = 0.5f;
                                        }
                                    } else {
                                        i13 = 2;
                                        i14 = 1;
                                        f12 = 0.05f;
                                    }
                                    f13 = i22 != 0 ? i22 != i14 ? i22 != i13 ? -3.4028235E38f : 0.95f : 0.5f : 0.05f;
                                    f14 = f12;
                                } else {
                                    f14 = pointF.x / f10;
                                    f13 = pointF.y / f18;
                                }
                                C2783b c2783b = new C2783b(spannableString, alignment2, null, null, f13, i10, i22, f14, i12, i11, f11, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                int iH = h(j10, arrayList2, arrayList);
                                for (int iH2 = h(j8, arrayList2, arrayList); iH2 < iH; iH2++) {
                                    ((List) arrayList.get(iH2)).add(c2783b);
                                }
                                c3490a = this;
                                bVar2 = bVar;
                                aVarC = aVar;
                            }
                        }
                    }
                }
                bVar = bVar2;
                aVar = aVarC;
                c3490a = this;
                bVar2 = bVar;
                aVarC = aVar;
            } else {
                bVar = bVar2;
                aVar = aVarC;
                c3490a = this;
                bVar2 = bVar;
                aVarC = aVar;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(Y4.b r40) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.C3490a.i(Y4.b):void");
    }
}
