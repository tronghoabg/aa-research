package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class ahmq implements ahld {
    public static final ahmp Companion = new ahmp(null);
    private static final List<String> PREDEFINED_STRINGS;
    private static final Map<String, Integer> PREDEFINED_STRINGS_MAP;

    /* renamed from: kotlin, reason: collision with root package name */
    private static final String f15kotlin;
    private final Set<Integer> localNameIndices;
    private final List<ahmf> records;
    private final String[] strings;

    static {
        String strCu = woy.cu(woy.bi('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        f15kotlin = strCu;
        List<String> listBi = woy.bi(String.valueOf(strCu).concat("/Any"), String.valueOf(strCu).concat("/Nothing"), String.valueOf(strCu).concat("/Unit"), String.valueOf(strCu).concat("/Throwable"), String.valueOf(strCu).concat("/Number"), String.valueOf(strCu).concat("/Byte"), String.valueOf(strCu).concat("/Double"), String.valueOf(strCu).concat("/Float"), String.valueOf(strCu).concat("/Int"), String.valueOf(strCu).concat("/Long"), String.valueOf(strCu).concat("/Short"), String.valueOf(strCu).concat("/Boolean"), String.valueOf(strCu).concat("/Char"), String.valueOf(strCu).concat("/CharSequence"), String.valueOf(strCu).concat("/String"), String.valueOf(strCu).concat("/Comparable"), String.valueOf(strCu).concat("/Enum"), String.valueOf(strCu).concat("/Array"), String.valueOf(strCu).concat("/ByteArray"), String.valueOf(strCu).concat("/DoubleArray"), String.valueOf(strCu).concat("/FloatArray"), String.valueOf(strCu).concat("/IntArray"), String.valueOf(strCu).concat("/LongArray"), String.valueOf(strCu).concat("/ShortArray"), String.valueOf(strCu).concat("/BooleanArray"), String.valueOf(strCu).concat("/CharArray"), String.valueOf(strCu).concat("/Cloneable"), String.valueOf(strCu).concat("/Annotation"), String.valueOf(strCu).concat("/collections/Iterable"), String.valueOf(strCu).concat("/collections/MutableIterable"), String.valueOf(strCu).concat("/collections/Collection"), String.valueOf(strCu).concat("/collections/MutableCollection"), String.valueOf(strCu).concat("/collections/List"), String.valueOf(strCu).concat("/collections/MutableList"), String.valueOf(strCu).concat("/collections/Set"), String.valueOf(strCu).concat("/collections/MutableSet"), String.valueOf(strCu).concat("/collections/Map"), String.valueOf(strCu).concat("/collections/MutableMap"), String.valueOf(strCu).concat("/collections/Map.Entry"), String.valueOf(strCu).concat("/collections/MutableMap.MutableEntry"), String.valueOf(strCu).concat("/collections/Iterator"), String.valueOf(strCu).concat("/collections/MutableIterator"), String.valueOf(strCu).concat("/collections/ListIterator"), String.valueOf(strCu).concat("/collections/MutableListIterator"));
        PREDEFINED_STRINGS = listBi;
        Iterable<afbh> iterableBD = woy.bD(listBi);
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(iterableBD, 10)), 16));
        for (afbh afbhVar : iterableBD) {
            linkedHashMap.put((String) afbhVar.b, Integer.valueOf(afbhVar.a));
        }
        PREDEFINED_STRINGS_MAP = linkedHashMap;
    }

    public ahmq(String[] strArr, Set<Integer> set, List<ahmf> list) {
        strArr.getClass();
        set.getClass();
        list.getClass();
        this.strings = strArr;
        this.localNameIndices = set;
        this.records = list;
    }

    @Override // defpackage.ahld
    public String getQualifiedClassName(int i) {
        return getString(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // defpackage.ahld
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getString(int r8) {
        /*
            r7 = this;
            java.util.List<ahmf> r0 = r7.records
            java.lang.Object r0 = r0.get(r8)
            ahmf r0 = (defpackage.ahmf) r0
            boolean r1 = r0.hasString()
            if (r1 == 0) goto L13
            java.lang.String r7 = r0.getString()
            goto L36
        L13:
            boolean r1 = r0.hasPredefinedIndex()
            if (r1 == 0) goto L32
            java.util.List<java.lang.String> r1 = defpackage.ahmq.PREDEFINED_STRINGS
            int r2 = r1.size()
            int r3 = r0.getPredefinedIndex()
            if (r3 < 0) goto L32
            if (r3 >= r2) goto L32
            int r7 = r0.getPredefinedIndex()
            java.lang.Object r7 = r1.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L36
        L32:
            java.lang.String[] r7 = r7.strings
            r7 = r7[r8]
        L36:
            int r8 = r0.getSubstringIndexCount()
            r1 = 0
            r2 = 1
            r3 = 2
            if (r8 < r3) goto L84
            java.util.List r8 = r0.getSubstringIndexList()
            r8.getClass()
            java.lang.Object r4 = r8.get(r1)
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r8.get(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r5 = r4.intValue()
            if (r5 < 0) goto L84
            int r5 = r4.intValue()
            int r6 = r8.intValue()
            if (r5 > r6) goto L84
            int r5 = r8.intValue()
            int r6 = r7.length()
            if (r5 > r6) goto L84
            r7.getClass()
            r4.getClass()
            int r4 = r4.intValue()
            r8.getClass()
            int r8 = r8.intValue()
            java.lang.String r7 = r7.substring(r4, r8)
            r7.getClass()
        L84:
            int r8 = r0.getReplaceCharCount()
            if (r8 < r3) goto Lae
            java.util.List r8 = r0.getReplaceCharList()
            r8.getClass()
            java.lang.Object r1 = r8.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r8 = r8.get(r2)
            java.lang.Integer r8 = (java.lang.Integer) r8
            r7.getClass()
            int r1 = r1.intValue()
            char r1 = (char) r1
            int r8 = r8.intValue()
            char r8 = (char) r8
            java.lang.String r7 = defpackage.afyh.I(r7, r1, r8)
        Lae:
            ahme r8 = r0.getOperation()
            if (r8 != 0) goto Lb6
            ahme r8 = defpackage.ahme.NONE
        Lb6:
            int r8 = r8.ordinal()
            if (r8 == 0) goto Lef
            r0 = 46
            r1 = 36
            if (r8 == r2) goto Le8
            if (r8 != r3) goto Le2
            int r8 = r7.length()
            if (r8 < r3) goto Lda
            r7.getClass()
            int r8 = r7.length()
            int r8 = r8 + (-1)
            java.lang.String r7 = r7.substring(r2, r8)
            r7.getClass()
        Lda:
            r7.getClass()
            java.lang.String r7 = defpackage.afyh.I(r7, r1, r0)
            goto Lef
        Le2:
            aezs r7 = new aezs
            r7.<init>()
            throw r7
        Le8:
            r7.getClass()
            java.lang.String r7 = defpackage.afyh.I(r7, r1, r0)
        Lef:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahmq.getString(int):java.lang.String");
    }

    @Override // defpackage.ahld
    public boolean isLocalClassName(int i) {
        return this.localNameIndices.contains(Integer.valueOf(i));
    }
}
