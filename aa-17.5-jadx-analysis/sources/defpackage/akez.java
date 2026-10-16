package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class akez implements akfn, akfl {
    public static final akez a;
    static final int b;
    static final int c;
    private static final List d;
    private static final Map e;
    private static final List f;
    private static final /* synthetic */ akez[] g;

    static {
        akez akezVar = new akez();
        a = akezVar;
        g = new akez[]{akezVar};
        f = new ArrayList();
        ArrayList<String> arrayList = new ArrayList(akcl.b);
        d = arrayList;
        Collections.sort(arrayList);
        e = new HashMap();
        int iMax = 0;
        int iMax2 = 0;
        for (String str : arrayList) {
            int iIndexOf = str.indexOf(47);
            if (iIndexOf >= 0) {
                iIndexOf = iIndexOf < str.length() ? iIndexOf + 1 : iIndexOf;
                iMax2 = Math.max(iMax2, iIndexOf);
                String strSubstring = str.substring(0, iIndexOf + 1);
                String strSubstring2 = str.substring(iIndexOf);
                Map map = e;
                if (!map.containsKey(strSubstring)) {
                    map.put(strSubstring, new ArrayList());
                }
                ((List) map.get(strSubstring)).add(strSubstring2);
            } else {
                f.add(str);
            }
            iMax = Math.max(iMax, str.length());
        }
        b = iMax;
        c = iMax2;
    }

    private akez() {
    }

    public static akez valueOf(String str) {
        return (akez) Enum.valueOf(akez.class, str);
    }

    public static akez[] values() {
        return (akez[]) g.clone();
    }

    @Override // defpackage.akfl
    public final int a() {
        return b;
    }

    @Override // defpackage.akfn
    public final int b() {
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        r2 = 0;
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
    
        if (r2 >= r8.size()) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
    
        r4 = (java.lang.String) r8.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (defpackage.akfe.c(r10, r1, r4) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0071, code lost:
    
        if (r4.length() <= r3.length()) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        r9.f(defpackage.akcl.i(java.lang.String.valueOf(r0).concat(r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        return r1 + r3.length();
     */
    @Override // defpackage.akfl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(defpackage.akfh r9, java.lang.CharSequence r10, int r11) {
        /*
            r8 = this;
            java.util.List r8 = defpackage.akez.f
            int r0 = r10.length()
            int r1 = defpackage.akez.c
            int r1 = r1 + r11
            int r1 = java.lang.Math.min(r0, r1)
            r2 = r11
        Le:
            if (r2 >= r1) goto L50
            int r3 = r2 + 1
            char r4 = r10.charAt(r2)
            r5 = 47
            if (r4 != r5) goto L4e
            java.lang.CharSequence r8 = r10.subSequence(r11, r3)
            java.lang.String r8 = r8.toString()
            int r1 = r8.length()
            int r1 = r1 + r11
            int r0 = r0 + (-1)
            if (r2 >= r0) goto L3f
            char r0 = r10.charAt(r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r8)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L40
        L3f:
            r0 = r8
        L40:
            java.util.Map r2 = defpackage.akez.e
            java.lang.Object r0 = r2.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L8e
            r7 = r0
            r0 = r8
            r8 = r7
            goto L53
        L4e:
            r2 = r3
            goto Le
        L50:
            java.lang.String r0 = ""
            r1 = r11
        L53:
            r2 = 0
            r3 = 0
        L55:
            int r4 = r8.size()
            if (r2 >= r4) goto L77
            java.lang.Object r4 = r8.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = defpackage.akfe.c(r10, r1, r4)
            if (r5 == 0) goto L74
            if (r3 == 0) goto L73
            int r5 = r4.length()
            int r6 = r3.length()
            if (r5 <= r6) goto L74
        L73:
            r3 = r4
        L74:
            int r2 = r2 + 1
            goto L55
        L77:
            if (r3 == 0) goto L8e
            java.lang.String r8 = java.lang.String.valueOf(r0)
            java.lang.String r8 = r8.concat(r3)
            akcl r8 = defpackage.akcl.i(r8)
            r9.f(r8)
            int r8 = r3.length()
            int r1 = r1 + r8
            return r1
        L8e:
            int r8 = ~r11
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akez.c(akfh, java.lang.CharSequence, int):int");
    }

    @Override // defpackage.akfn
    public final void d(Appendable appendable, long j, akcd akcdVar, int i, akcl akclVar, Locale locale) throws IOException {
        appendable.append(akclVar != null ? akclVar.c : "");
    }
}
