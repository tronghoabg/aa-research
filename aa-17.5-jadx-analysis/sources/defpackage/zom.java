package defpackage;

import java.lang.Character;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class zom implements Iterator {
    private static final Pattern a;
    private static final Pattern h;
    private final zop i;
    private final CharSequence j;
    private final znx k;
    private final zoo l;
    private long m;
    private static final Pattern b = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    private static final Pattern c = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    private static final Pattern d = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
    private static final Pattern e = Pattern.compile(":[0-5]\\d");
    private static final Pattern[] g = {Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[‒-―－]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")};
    private static final Pattern f = Pattern.compile("(?:[(\\[（［])?(?:[^(\\[（［)\\]）］]+[)\\]）］])?[^(\\[（［)\\]）］]+(?:[(\\[（［][^(\\[（［)\\]）］]+[)\\]）］])" + d(0, 3) + "[^(\\[（［)\\]）］]*");
    private int p = 1;
    private zol n = null;
    private int o = 0;

    static {
        String strD = d(0, 2);
        String strD2 = d(0, 4);
        String strD3 = d(0, 20);
        String strD4 = d(1, 20);
        h = Pattern.compile("[(\\[（［+＋]");
        String str = zop.e;
        StringBuilder sb = new StringBuilder("(?:[(\\[（［+＋]");
        String strConcat = "[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]".concat(strD2);
        sb.append(strConcat);
        sb.append(")");
        sb.append(strD);
        String strConcat2 = "\\p{Nd}".concat(strD4);
        sb.append(strConcat2);
        sb.append("(?:");
        sb.append(strConcat);
        sb.append(strConcat2);
        sb.append(")");
        sb.append(strD3);
        sb.append("(?:");
        sb.append(str);
        sb.append(")?");
        a = Pattern.compile(sb.toString(), 66);
    }

    public zom(zop zopVar, CharSequence charSequence, znx znxVar, zoo zooVar) {
        new oct(32);
        this.i = zopVar;
        this.j = charSequence;
        this.k = znxVar;
        this.l = zooVar;
        this.m = Long.MAX_VALUE;
    }

    static boolean a(char c2) {
        if (!Character.isLetter(c2) && Character.getType(c2) != 6) {
            return false;
        }
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(c2);
        return unicodeBlockOf.equals(Character.UnicodeBlock.BASIC_LATIN) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || unicodeBlockOf.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || unicodeBlockOf.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0104 A[Catch: zoe -> 0x02a2, TryCatch #1 {zoe -> 0x02a2, blocks: (B:3:0x0001, B:5:0x000d, B:8:0x001b, B:11:0x0027, B:13:0x0033, B:15:0x0041, B:18:0x0048, B:20:0x0055, B:22:0x005f, B:25:0x0066, B:32:0x008a, B:33:0x008b, B:34:0x008c, B:35:0x008d, B:37:0x00a0, B:53:0x00fc, B:55:0x0104, B:57:0x010c, B:59:0x0112, B:62:0x0117, B:63:0x012a, B:64:0x012b, B:66:0x0135, B:67:0x013a, B:69:0x0142, B:94:0x01bd, B:72:0x014e, B:76:0x0159, B:79:0x016b, B:83:0x017b, B:85:0x017f, B:87:0x018d, B:90:0x0199, B:95:0x01c0, B:125:0x025a, B:100:0x01ce, B:102:0x01da, B:103:0x01e4, B:105:0x01ea, B:107:0x01f8, B:109:0x0212, B:114:0x0228, B:116:0x0230, B:118:0x0234, B:120:0x023c, B:122:0x0248, B:38:0x00b4, B:40:0x00ba, B:41:0x00c1, B:42:0x00c9, B:44:0x00cf, B:46:0x00e0, B:49:0x00f3, B:127:0x02a1, B:80:0x016f), top: B:132:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135 A[Catch: zoe -> 0x02a2, TryCatch #1 {zoe -> 0x02a2, blocks: (B:3:0x0001, B:5:0x000d, B:8:0x001b, B:11:0x0027, B:13:0x0033, B:15:0x0041, B:18:0x0048, B:20:0x0055, B:22:0x005f, B:25:0x0066, B:32:0x008a, B:33:0x008b, B:34:0x008c, B:35:0x008d, B:37:0x00a0, B:53:0x00fc, B:55:0x0104, B:57:0x010c, B:59:0x0112, B:62:0x0117, B:63:0x012a, B:64:0x012b, B:66:0x0135, B:67:0x013a, B:69:0x0142, B:94:0x01bd, B:72:0x014e, B:76:0x0159, B:79:0x016b, B:83:0x017b, B:85:0x017f, B:87:0x018d, B:90:0x0199, B:95:0x01c0, B:125:0x025a, B:100:0x01ce, B:102:0x01da, B:103:0x01e4, B:105:0x01ea, B:107:0x01f8, B:109:0x0212, B:114:0x0228, B:116:0x0230, B:118:0x0234, B:120:0x023c, B:122:0x0248, B:38:0x00b4, B:40:0x00ba, B:41:0x00c1, B:42:0x00c9, B:44:0x00cf, B:46:0x00e0, B:49:0x00f3, B:127:0x02a1, B:80:0x016f), top: B:132:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.zol b(java.lang.CharSequence r12, int r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zom.b(java.lang.CharSequence, int):zol");
    }

    private static CharSequence c(Pattern pattern, CharSequence charSequence) {
        Matcher matcher = pattern.matcher(charSequence);
        return matcher.find() ? charSequence.subSequence(0, matcher.start()) : charSequence;
    }

    private static String d(int i, int i2) {
        return a.bB(i2, i, "{", ",", "}");
    }

    private static boolean e(char c2) {
        return c2 == '%' || Character.getType(c2) == 26;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        if (defpackage.zom.e.matcher(r5.toString().substring(r7.length() + r1)).lookingAt() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cb, code lost:
    
        r14 = r14 + 1;
        r9 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00cb, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d3 A[LOOP:0: B:5:0x0013->B:40:0x00d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e0 A[EDGE_INSN: B:51:0x00e0->B:42:0x00e0 BREAK  A[LOOP:0: B:5:0x0013->B:40:0x00d3], SYNTHETIC] */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zom.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        zol zolVar = this.n;
        this.n = null;
        this.p = 1;
        return zolVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
