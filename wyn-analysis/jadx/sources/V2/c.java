package V2;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f12963a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12964b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f12965c;

    /* renamed from: d, reason: collision with root package name */
    public final long f12966d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12967e;

    /* renamed from: f, reason: collision with root package name */
    public final g f12968f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f12969g;

    /* renamed from: h, reason: collision with root package name */
    public final String f12970h;

    /* renamed from: i, reason: collision with root package name */
    public final String f12971i;

    /* renamed from: j, reason: collision with root package name */
    public final c f12972j;
    public final HashMap k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f12973l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f12974m;

    public c(String str, String str2, long j8, long j10, g gVar, String[] strArr, String str3, String str4, c cVar) {
        this.f12963a = str;
        this.f12964b = str2;
        this.f12971i = str4;
        this.f12968f = gVar;
        this.f12969g = strArr;
        this.f12965c = str2 != null;
        this.f12966d = j8;
        this.f12967e = j10;
        str3.getClass();
        this.f12970h = str3;
        this.f12972j = cVar;
        this.k = new HashMap();
        this.f12973l = new HashMap();
    }

    public static c a(String str) {
        return new c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", StringUtils.SPACE).replaceAll("[ \t\\x0B\f\r]+", StringUtils.SPACE), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            P1.a aVar = new P1.a();
            aVar.f8985a = new SpannableStringBuilder();
            treeMap.put(str, aVar);
        }
        CharSequence charSequence = ((P1.a) treeMap.get(str)).f8985a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final c b(int i5) {
        ArrayList arrayList = this.f12974m;
        if (arrayList != null) {
            return (c) arrayList.get(i5);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.f12974m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z2) {
        String str = this.f12963a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z2 || zEquals || (zEquals2 && this.f12971i != null)) {
            long j8 = this.f12966d;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
            long j10 = this.f12967e;
            if (j10 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j10));
            }
        }
        if (this.f12974m == null) {
            return;
        }
        for (int i5 = 0; i5 < this.f12974m.size(); i5++) {
            ((c) this.f12974m.get(i5)).d(treeSet, z2 || zEquals);
        }
    }

    public final boolean f(long j8) {
        long j10 = this.f12966d;
        long j11 = this.f12967e;
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
        String str3 = this.f12970h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j8) && "div".equals(this.f12963a) && (str2 = this.f12971i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i5 = 0; i5 < c(); i5++) {
            b(i5).g(j8, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r21, java.util.Map r23, java.util.HashMap r24, java.lang.String r25, java.util.TreeMap r26) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V2.c.h(long, java.util.Map, java.util.HashMap, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j8, boolean z2, String str, TreeMap treeMap) {
        boolean z10;
        TreeMap treeMap2;
        long j10;
        HashMap map = this.k;
        map.clear();
        HashMap map2 = this.f12973l;
        map2.clear();
        String str2 = this.f12963a;
        if (ExternalParsersConfigReaderMetKeys.METADATA_TAG.equals(str2)) {
            return;
        }
        String str3 = this.f12970h;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f12965c && z2) {
            SpannableStringBuilder spannableStringBuilderE = e(str4, treeMap);
            String str5 = this.f12964b;
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
                CharSequence charSequence = ((P1.a) entry.getValue()).f8985a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i5 = 0; i5 < c(); i5++) {
                c cVarB = b(i5);
                if (z2 || zEquals) {
                    z10 = true;
                    treeMap2 = treeMap;
                    j10 = j8;
                } else {
                    z10 = false;
                    j10 = j8;
                    treeMap2 = treeMap;
                }
                cVarB.i(j10, z10, str4, treeMap2);
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
                CharSequence charSequence2 = ((P1.a) entry2.getValue()).f8985a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
