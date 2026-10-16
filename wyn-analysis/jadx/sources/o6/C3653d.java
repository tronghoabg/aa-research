package o6;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import h6.C2782a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;

/* renamed from: o6.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3653d {

    /* renamed from: a, reason: collision with root package name */
    public final String f41384a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41385b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41386c;

    /* renamed from: d, reason: collision with root package name */
    public final long f41387d;

    /* renamed from: e, reason: collision with root package name */
    public final long f41388e;

    /* renamed from: f, reason: collision with root package name */
    public final f f41389f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f41390g;

    /* renamed from: h, reason: collision with root package name */
    public final String f41391h;

    /* renamed from: i, reason: collision with root package name */
    public final String f41392i;

    /* renamed from: j, reason: collision with root package name */
    public final C3653d f41393j;
    public final HashMap k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f41394l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f41395m;

    public C3653d(String str, String str2, long j8, long j10, f fVar, String[] strArr, String str3, String str4, C3653d c3653d) {
        this.f41384a = str;
        this.f41385b = str2;
        this.f41392i = str4;
        this.f41389f = fVar;
        this.f41390g = strArr;
        this.f41386c = str2 != null;
        this.f41387d = j8;
        this.f41388e = j10;
        str3.getClass();
        this.f41391h = str3;
        this.f41393j = c3653d;
        this.k = new HashMap();
        this.f41394l = new HashMap();
    }

    public static C3653d a(String str) {
        return new C3653d(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", StringUtils.SPACE).replaceAll("[ \t\\x0B\f\r]+", StringUtils.SPACE), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C2782a c2782a = new C2782a();
            c2782a.f36150a = new SpannableStringBuilder();
            treeMap.put(str, c2782a);
        }
        CharSequence charSequence = ((C2782a) treeMap.get(str)).f36150a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final C3653d b(int i5) {
        ArrayList arrayList = this.f41395m;
        if (arrayList != null) {
            return (C3653d) arrayList.get(i5);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f41395m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z2) {
        String str = this.f41384a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z2 || zEquals || (zEquals2 && this.f41392i != null)) {
            long j8 = this.f41387d;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
            long j10 = this.f41388e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f41395m == null) {
            return;
        }
        for (int i5 = 0; i5 < this.f41395m.size(); i5++) {
            ((C3653d) this.f41395m.get(i5)).d(treeSet, z2 || zEquals);
        }
    }

    public final boolean f(long j8) {
        long j10 = this.f41387d;
        long j11 = this.f41388e;
        if (j10 == -9223372036854775807L && j11 == -9223372036854775807L) {
            return true;
        }
        if (j10 <= j8 && j11 == -9223372036854775807L) {
            return true;
        }
        if (j10 != -9223372036854775807L || j8 >= j11) {
            return j10 <= j8 && j8 < j11;
        }
        return true;
    }

    public final void g(long j8, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f41391h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j8) && "div".equals(this.f41384a) && (str2 = this.f41392i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i5 = 0; i5 < c(); i5++) {
            b(i5).g(j8, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r19, java.util.Map r21, java.util.HashMap r22, java.lang.String r23, java.util.TreeMap r24) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C3653d.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j8, boolean z2, String str, TreeMap treeMap) {
        boolean z10;
        TreeMap treeMap2;
        long j10;
        HashMap map = this.k;
        map.clear();
        HashMap map2 = this.f41394l;
        map2.clear();
        String str2 = this.f41384a;
        if (ExternalParsersConfigReaderMetKeys.METADATA_TAG.equals(str2)) {
            return;
        }
        String str3 = this.f41391h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f41386c && z2) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f41385b;
            str5.getClass();
            spannableStringBuilderE.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z2) {
            e(str4, treeMap).append('\n');
            return;
        }
        if (f(j8)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C2782a) entry.getValue()).f36150a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i5 = 0; i5 < c(); i5++) {
                C3653d c3653dB = b(i5);
                if (z2 || zEquals) {
                    z10 = true;
                    treeMap2 = treeMap;
                    j10 = j8;
                } else {
                    z10 = false;
                    j10 = j8;
                    treeMap2 = treeMap;
                }
                c3653dB.i(j10, z10, str4, treeMap2);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderE2 = e(str4, treeMap);
                int length = spannableStringBuilderE2.length() - 1;
                while (length >= 0 && spannableStringBuilderE2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderE2.charAt(length) != '\n') {
                    spannableStringBuilderE2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C2782a) entry2.getValue()).f36150a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
