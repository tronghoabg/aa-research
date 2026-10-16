package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zop {
    public static final Logger a = Logger.getLogger(zop.class.getName());
    static final Pattern b;
    static final Pattern c;
    static final Pattern d;
    static final String e;
    public static final Pattern f;
    public static final znx g;
    private static final ygr j;
    private static final Pattern k;
    private static final Pattern l;
    private static final String m;
    private static final String n;
    private static final Pattern o;
    private static final Pattern p;
    private static zop q;
    public final Map h;
    private final aacq u;
    private final oct v;
    private final Set r = EnumSet.noneOf(znx.class);
    public final oct i = new oct(100);
    private final Set s = new HashSet(320);
    private final Set t = new HashSet();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [char] */
    /* JADX WARN: Type inference failed for: r5v4 */
    static {
        yfy.k(54, "9");
        ygp ygpVar = new ygp();
        ygpVar.c(86);
        ygr ygrVarG = ygpVar.g();
        j = ygrVarG;
        new ymp(52);
        ygp ygpVar2 = new ygp();
        ygpVar2.c(52);
        ygpVar2.c(54);
        ygpVar2.c(55);
        ygpVar2.c(62);
        ygpVar2.k(ygrVarG);
        ygpVar2.g();
        yfu yfuVar = new yfu(4);
        yfuVar.h(znz.a);
        yfuVar.e('+', '+');
        yfuVar.e('*', '*');
        yfuVar.e('#', '#');
        yfuVar.d(true);
        HashMap map = new HashMap();
        yno it = znz.b.keySet().iterator();
        while (it.hasNext()) {
            Character ch = (Character) it.next();
            int iCharValue = ch.charValue();
            if (woy.av(iCharValue)) {
                iCharValue ^= 32;
            }
            map.put(Character.valueOf((char) iCharValue), ch);
            map.put(ch, ch);
        }
        yfu yfuVar2 = new yfu(4);
        yfuVar2.h(znz.a);
        yfuVar2.h(map);
        yfuVar2.e('-', '-');
        yfuVar2.e((char) 65293, '-');
        yfuVar2.e((char) 8208, '-');
        yfuVar2.e((char) 8209, '-');
        yfuVar2.e((char) 8210, '-');
        yfuVar2.e((char) 8211, '-');
        yfuVar2.e((char) 8212, '-');
        yfuVar2.e((char) 8213, '-');
        yfuVar2.e((char) 8722, '-');
        yfuVar2.e('/', '/');
        yfuVar2.e((char) 65295, '/');
        yfuVar2.e(' ', ' ');
        yfuVar2.e((char) 12288, ' ');
        yfuVar2.e((char) 8288, ' ');
        yfuVar2.e('.', '.');
        yfuVar2.e((char) 65294, '.');
        yfuVar2.d(true);
        Pattern.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        b = Pattern.compile("[+＋]+");
        Pattern.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        k = Pattern.compile("(\\p{Nd})");
        l = Pattern.compile("[+＋\\p{Nd}]");
        c = Pattern.compile("[\\\\/] *x");
        d = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        String str = "\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*" + znz.d + "\\p{Nd}]*";
        m = str;
        String strR = r(true);
        n = strR;
        e = r(false);
        o = Pattern.compile("(?:" + strR + ")$", 66);
        p = Pattern.compile(str + "(?:" + strR + ")?", 66);
        Pattern.compile("(\\D+)");
        Pattern.compile("(\\$\\d)");
        f = Pattern.compile("\\(?\\$1\\)?");
        q = null;
        g = zoq.a;
    }

    public zop(aacq aacqVar, Map map) {
        this.v = new oct(map.keySet());
        this.u = aacqVar;
        this.h = map;
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && g.equals(list.get(0))) {
                this.t.add((Integer) entry.getKey());
            } else {
                this.s.addAll(list);
            }
        }
        if (this.s.remove(g)) {
            a.logp(Level.WARNING, "com.google.i18n.phonenumbers.PhoneNumberUtil", "<init>", "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.r.addAll((Collection) map.get(1));
    }

    public static synchronized zop d() {
        if (q == null) {
            ajds ajdsVar = ajds.d;
            if (ajdsVar == null) {
                throw new IllegalStateException("Context not configured");
            }
            h(new zop((aacq) ajdsVar.b, zoa.a));
        }
        return q;
    }

    static synchronized void h(zop zopVar) {
        q = zopVar;
    }

    static boolean i(CharSequence charSequence) {
        if (charSequence.length() < 2) {
            return false;
        }
        return p.matcher(charSequence).matches();
    }

    static void k(StringBuilder sb) {
        if (!znz.e.matcher(sb).matches()) {
            sb.replace(0, sb.length(), zkt.c(sb));
            return;
        }
        int length = sb.length();
        yfy yfyVar = znz.c;
        StringBuilder sb2 = new StringBuilder(sb.length());
        for (int i = 0; i < sb.length(); i++) {
            Character ch = (Character) yfyVar.get(Character.valueOf(woy.aq(sb.charAt(i))));
            if (ch != null) {
                sb2.append(ch);
            }
        }
        sb.replace(0, length, sb2.toString());
    }

    public static final int n(zpd zpdVar, zpd zpdVar2) {
        abnp abnpVarZ = z(zpdVar);
        zpd zpdVar3 = (zpd) abnpVarZ.q();
        zpd zpdVar4 = (zpd) z(zpdVar2).q();
        if ((zpdVar3.b & 4) != 0 && (zpdVar4.b & 4) != 0 && !zpdVar3.e.equals(zpdVar4.e)) {
            return 2;
        }
        int i = zpdVar3.c;
        int i2 = zpdVar4.c;
        if (i != 0 && i2 != 0) {
            if (zpdVar3.equals(zpdVar4)) {
                return 5;
            }
            return (i == i2 && y(zpdVar3, zpdVar4)) ? 3 : 2;
        }
        abnpVarZ.t();
        zpd zpdVar5 = (zpd) abnpVarZ.b;
        zpdVar5.b |= 1;
        zpdVar5.c = i2;
        zpd zpdVar6 = (zpd) abnpVarZ.q();
        if (zpdVar6.equals(zpdVar4)) {
            return 4;
        }
        return y(zpdVar6, zpdVar4) ? 3 : 2;
    }

    static final boolean o(String str, zok zokVar) {
        abod abodVar = zokVar.d;
        return (abodVar.isEmpty() || abodVar.contains(Integer.valueOf(str.length()))) && zkt.b(str, zokVar) == 1;
    }

    public static final int q(String str, zoi zoiVar) {
        zok zokVar = zoiVar.c;
        if (zokVar == null) {
            zokVar = zok.a;
        }
        if (!o(str, zokVar)) {
            return 12;
        }
        zok zokVar2 = zoiVar.g;
        if (zokVar2 == null) {
            zokVar2 = zok.a;
        }
        if (o(str, zokVar2)) {
            return 5;
        }
        zok zokVar3 = zoiVar.f;
        if (zokVar3 == null) {
            zokVar3 = zok.a;
        }
        if (o(str, zokVar3)) {
            return 4;
        }
        zok zokVar4 = zoiVar.h;
        if (zokVar4 == null) {
            zokVar4 = zok.a;
        }
        if (o(str, zokVar4)) {
            return 6;
        }
        zok zokVar5 = zoiVar.j;
        if (zokVar5 == null) {
            zokVar5 = zok.a;
        }
        if (o(str, zokVar5)) {
            return 7;
        }
        zok zokVar6 = zoiVar.i;
        if (zokVar6 == null) {
            zokVar6 = zok.a;
        }
        if (o(str, zokVar6)) {
            return 8;
        }
        zok zokVar7 = zoiVar.k;
        if (zokVar7 == null) {
            zokVar7 = zok.a;
        }
        if (o(str, zokVar7)) {
            return 9;
        }
        zok zokVar8 = zoiVar.l;
        if (zokVar8 == null) {
            zokVar8 = zok.a;
        }
        if (o(str, zokVar8)) {
            return 10;
        }
        zok zokVar9 = zoiVar.m;
        if (zokVar9 == null) {
            zokVar9 = zok.a;
        }
        if (o(str, zokVar9)) {
            return 11;
        }
        zok zokVar10 = zoiVar.d;
        if (zokVar10 == null) {
            zokVar10 = zok.a;
        }
        if (o(str, zokVar10)) {
            if (zoiVar.s) {
                return 3;
            }
            zok zokVar11 = zoiVar.e;
            if (zokVar11 == null) {
                zokVar11 = zok.a;
            }
            return o(str, zokVar11) ? 3 : 1;
        }
        if (!zoiVar.s) {
            zok zokVar12 = zoiVar.e;
            if (zokVar12 == null) {
                zokVar12 = zok.a;
            }
            if (o(str, zokVar12)) {
                return 2;
            }
        }
        return 12;
    }

    private static String r(boolean z) {
        String strS = s(20);
        String str = ";ext=".concat(strS) + "|" + ("[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|anexo)[:\\.．]?[  \\t,-]*" + s(20) + "#?") + "|" + ("[  \\t,]*(?:[xｘ#＃~～]|int|ｉｎｔ)[:\\.．]?[  \\t,-]*" + s(9) + "#?") + "|" + ("[- ]+" + s(6) + "#");
        if (!z) {
            return str;
        }
        return str + "|" + ("[  \\t]*(?:,{2}|;)[:\\.．]?[  \\t,-]*" + s(15) + "#?") + "|" + ("[  \\t]*(?:,)+[:\\.．]?[  \\t,-]*" + s(9) + "#?");
    }

    private static String s(int i) {
        return a.bn(i, "(\\p{Nd}{1,", "})");
    }

    private static void t(zoi zoiVar, String str) {
        if (zoiVar == null) {
            throw new zoc(str);
        }
    }

    private static boolean u(zok zokVar) {
        return (zokVar.d.size() == 1 && zokVar.d.e(0) == -1) ? false : true;
    }

    private final boolean v(znx znxVar) {
        return znxVar != null && this.s.contains(znxVar);
    }

    private static zok w(zoi zoiVar, int i) {
        switch (i - 1) {
            case 0:
            case 2:
                zok zokVar = zoiVar.d;
                if (zokVar == null) {
                    break;
                }
                break;
            case 1:
                zok zokVar2 = zoiVar.e;
                if (zokVar2 == null) {
                    break;
                }
                break;
            case 3:
                zok zokVar3 = zoiVar.f;
                if (zokVar3 == null) {
                    break;
                }
                break;
            case 4:
                zok zokVar4 = zoiVar.g;
                if (zokVar4 == null) {
                    break;
                }
                break;
            case 5:
                zok zokVar5 = zoiVar.h;
                if (zokVar5 == null) {
                    break;
                }
                break;
            case 6:
                zok zokVar6 = zoiVar.j;
                if (zokVar6 == null) {
                    break;
                }
                break;
            case 7:
                zok zokVar7 = zoiVar.i;
                if (zokVar7 == null) {
                    break;
                }
                break;
            case 8:
                zok zokVar8 = zoiVar.k;
                if (zokVar8 == null) {
                    break;
                }
                break;
            case 9:
                zok zokVar9 = zoiVar.l;
                if (zokVar9 == null) {
                    break;
                }
                break;
            case 10:
                zok zokVar10 = zoiVar.m;
                if (zokVar10 == null) {
                    break;
                }
                break;
            default:
                zok zokVar11 = zoiVar.c;
                if (zokVar11 == null) {
                    break;
                }
                break;
        }
        return zok.a;
    }

    private final int x(CharSequence charSequence, zoi zoiVar, int i) {
        List list;
        abod abodVar;
        zok zokVarW = w(zoiVar, i);
        if (zokVarW.d.size() == 0) {
            zok zokVar = zoiVar.c;
            if (zokVar == null) {
                zokVar = zok.a;
            }
            list = zokVar.d;
        } else {
            list = zokVarW.d;
        }
        List list2 = zokVarW.e;
        if (i == 3) {
            if (!u(w(zoiVar, 1))) {
                return x(charSequence, zoiVar, 2);
            }
            zok zokVarW2 = w(zoiVar, 2);
            if (u(zokVarW2)) {
                List arrayList = new ArrayList(list);
                if (zokVarW2.d.size() == 0) {
                    zok zokVar2 = zoiVar.c;
                    if (zokVar2 == null) {
                        zokVar2 = zok.a;
                    }
                    abodVar = zokVar2.d;
                } else {
                    abodVar = zokVarW2.d;
                }
                arrayList.addAll(abodVar);
                Collections.sort(arrayList);
                if (list2.isEmpty()) {
                    list2 = zokVarW2.e;
                } else {
                    List arrayList2 = new ArrayList(list2);
                    arrayList2.addAll(zokVarW2.e);
                    Collections.sort(arrayList2);
                    list2 = arrayList2;
                }
                list = arrayList;
            }
        }
        if (((Integer) list.get(0)).intValue() == -1) {
            return 5;
        }
        int length = charSequence.length();
        Object objValueOf = Integer.valueOf(length);
        if (list2.contains(objValueOf)) {
            return 2;
        }
        int iIntValue = ((Integer) list.get(0)).intValue();
        if (iIntValue == length) {
            return 1;
        }
        if (iIntValue > length) {
            return 4;
        }
        if (((Integer) list.get(list.size() - 1)).intValue() < length) {
            return 6;
        }
        return list.subList(1, list.size()).contains(objValueOf) ? 1 : 5;
    }

    private static final boolean y(zpd zpdVar, zpd zpdVar2) {
        String strValueOf = String.valueOf(zpdVar.d);
        String strValueOf2 = String.valueOf(zpdVar2.d);
        return strValueOf.endsWith(strValueOf2) || strValueOf2.endsWith(strValueOf);
    }

    private static abnp z(zpd zpdVar) {
        abnp abnpVarN = zpd.a.n();
        int i = zpdVar.c;
        abnpVarN.t();
        zpd zpdVar2 = (zpd) abnpVarN.b;
        zpdVar2.b |= 1;
        zpdVar2.c = i;
        long j2 = zpdVar.d;
        abnpVarN.t();
        zpd zpdVar3 = (zpd) abnpVarN.b;
        zpdVar3.b |= 2;
        zpdVar3.d = j2;
        if (zpdVar.e.length() > 0) {
            String str = zpdVar.e;
            abnpVarN.t();
            zpd zpdVar4 = (zpd) abnpVarN.b;
            str.getClass();
            zpdVar4.b |= 4;
            zpdVar4.e = str;
        }
        if (zpdVar.f) {
            abnpVarN.t();
            zpd zpdVar5 = (zpd) abnpVarN.b;
            zpdVar5.b |= 8;
            zpdVar5.f = true;
            int i2 = zpdVar.g;
            abnpVarN.t();
            zpd zpdVar6 = (zpd) abnpVarN.b;
            zpdVar6.b |= 16;
            zpdVar6.g = i2;
        }
        return abnpVarN;
    }

    public final znx a(int i) {
        List list = (List) this.h.get(Integer.valueOf(i));
        return list == null ? znx.ZZ : (znx) list.get(0);
    }

    final zoi b(znx znxVar) {
        if (!v(znxVar)) {
            return null;
        }
        aacq aacqVar = this.u;
        woy.N(zoq.a(znxVar));
        zoi zoiVarB = ((zoy) ((zre) aacqVar.b).c(((oct) aacqVar.a).j(znxVar))).b.b(znxVar);
        t(zoiVarB, "Missing metadata for region code ".concat(String.valueOf(String.valueOf(znxVar))));
        return zoiVarB;
    }

    public final zoi c(int i, znx znxVar) {
        if (!g.equals(znxVar)) {
            return b(znxVar);
        }
        Set set = this.t;
        Integer numValueOf = Integer.valueOf(i);
        if (!set.contains(numValueOf)) {
            return null;
        }
        aacq aacqVar = this.u;
        znx znxVar2 = zoq.a;
        List list = (List) zoa.a.get(numValueOf);
        boolean z = false;
        if (list != null && !list.contains(zoq.a)) {
            z = true;
        }
        woy.N(!z);
        zoi zoiVarB = ((zoy) ((zre) aacqVar.b).c(((oct) aacqVar.a).j(numValueOf))).a.b(numValueOf);
        t(zoiVarB, a.bp(i, "Missing metadata for country code "));
        return zoiVarB;
    }

    @ResultIgnorabilityUnspecified
    public final zpd e(CharSequence charSequence, znx znxVar) throws zoe {
        zof zofVarA = zog.a();
        zofVarA.a = znxVar;
        return f(charSequence, zofVarA.a());
    }

    public final zpd f(CharSequence charSequence, zog zogVar) throws zoe, NumberFormatException {
        abnp abnpVarN = zpd.a.n();
        m(charSequence, zogVar, true, abnpVarN);
        return (zpd) abnpVarN.q();
    }

    public final String g(zpd zpdVar) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (zpdVar.f && (i = zpdVar.g) > 0) {
            char[] cArr = new char[i];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(zpdVar.d);
        return sb.toString();
    }

    @ResultIgnorabilityUnspecified
    final boolean j(StringBuilder sb, zoi zoiVar, StringBuilder sb2) {
        int length = sb.length();
        String str = zoiVar.q;
        if (length != 0 && str.length() != 0) {
            Matcher matcher = this.i.k(str).matcher(sb);
            if (matcher.lookingAt()) {
                zok zokVar = zoiVar.c;
                if (zokVar == null) {
                    zokVar = zok.a;
                }
                int iB = zkt.b(sb, zokVar);
                int iGroupCount = matcher.groupCount();
                String str2 = zoiVar.r;
                if (str2.length() != 0 && matcher.group(iGroupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (iB != 1 || zkt.b(sb3.toString(), zokVar) == 1) {
                        if (sb2 != null && iGroupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                        return true;
                    }
                } else if (iB != 1 || zkt.b(sb.substring(matcher.end()), zokVar) == 1) {
                    if (sb2 != null && iGroupCount > 0 && matcher.group(iGroupCount) != null) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int l(java.lang.CharSequence r9, defpackage.zoi r10, java.lang.StringBuilder r11, boolean r12, defpackage.abnp r13) throws defpackage.zoe, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zop.l(java.lang.CharSequence, zoi, java.lang.StringBuilder, boolean, abnp):int");
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Set] */
    public final void m(CharSequence charSequence, zog zogVar, boolean z, abnp abnpVar) throws zoe, NumberFormatException {
        String strSubstring;
        int i;
        StringBuilder sb;
        zop zopVar;
        abnp abnpVar2;
        int iL;
        CharSequence charSequenceSubSequence;
        if (charSequence == null) {
            throw new zoe(2, "The phone number supplied was null.");
        }
        if (charSequence.length() > 250) {
            throw new zoe(5, "The string supplied was too long to parse.");
        }
        StringBuilder sb2 = new StringBuilder();
        String string = charSequence.toString();
        oct octVar = this.v;
        int iIndexOf = string.indexOf(";phone-context=");
        zoh zohVar = null;
        if (iIndexOf == -1) {
            strSubstring = null;
        } else {
            int i2 = iIndexOf + 15;
            if (i2 >= string.length()) {
                strSubstring = "";
            } else {
                int iIndexOf2 = string.indexOf(59, i2);
                strSubstring = iIndexOf2 < 0 ? string.substring(i2) : string.substring(i2, iIndexOf2);
            }
        }
        int i3 = 1;
        if (strSubstring == null) {
            i = 5;
        } else {
            if (strSubstring.isEmpty() || !(znz.f.matcher(strSubstring).matches() || znz.k.matcher(strSubstring).matches())) {
                throw new zoe(2, "The phone-context value is invalid.");
            }
            if (strSubstring.charAt(0) != '+') {
                zohVar = new zoh(strSubstring, null);
                i = 5;
            } else {
                String strC = zkt.c(strSubstring.substring(1));
                if (strC.isEmpty()) {
                    i = 5;
                } else {
                    i = 5;
                    if (strC.length() <= 3) {
                        int i4 = Integer.parseInt(strC);
                        ?? r3 = octVar.a;
                        Integer numValueOf = Integer.valueOf(i4);
                        if (r3.contains(numValueOf)) {
                            zohVar = new zoh(strSubstring, numValueOf);
                        }
                    }
                }
                zohVar = new zoh(strSubstring, null);
            }
        }
        if (zohVar == null) {
            Matcher matcher = l.matcher(string);
            if (matcher.find()) {
                charSequenceSubSequence = string.subSequence(matcher.start(), string.length());
                Matcher matcher2 = d.matcher(charSequenceSubSequence);
                if (matcher2.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher2.start());
                }
                Matcher matcher3 = c.matcher(charSequenceSubSequence);
                if (matcher3.find()) {
                    charSequenceSubSequence = charSequenceSubSequence.subSequence(0, matcher3.start());
                }
            } else {
                charSequenceSubSequence = "";
            }
            sb2.append(charSequenceSubSequence);
            int iIndexOf3 = sb2.indexOf(";isub=");
            if (iIndexOf3 >= 0) {
                sb2.delete(iIndexOf3, sb2.length());
            }
        } else {
            int iIndexOf4 = string.indexOf("tel:");
            int i5 = iIndexOf4 >= 0 ? iIndexOf4 + 4 : 0;
            int iIndexOf5 = string.indexOf(";", i5);
            if (iIndexOf5 < 0) {
                throw new zoe(2, "The string supplied does not form a valid RFC3966 number.");
            }
            String strSubstring2 = string.substring(i5, iIndexOf5);
            String str = zohVar.a;
            if (str.charAt(0) == '+') {
                Integer num = zohVar.b;
                if (num == null) {
                    strSubstring2 = str.concat(String.valueOf(strSubstring2));
                } else {
                    zoi zoiVarC = c(num.intValue(), a(num.intValue()));
                    if (zoiVarC == null) {
                        strSubstring2 = str.concat(String.valueOf(strSubstring2));
                    } else {
                        StringBuilder sb3 = new StringBuilder(strSubstring2);
                        j(sb3, zoiVarC, new StringBuilder());
                        strSubstring2 = "+" + num.toString() + sb3.toString();
                    }
                }
            }
            sb2.append(strSubstring2);
            int iIndexOf6 = string.indexOf(";ext=");
            if (iIndexOf6 >= 0) {
                int i6 = iIndexOf6 + 5;
                int iIndexOf7 = string.indexOf(";", i6);
                if (iIndexOf7 < 0) {
                    iIndexOf7 = string.length();
                }
                sb2.append(" ext. ");
                sb2.append((CharSequence) string, i6, iIndexOf7);
            }
        }
        if (!i(sb2)) {
            throw new zoe(2, "The string supplied did not seem to be a phone number.");
        }
        znx znxVar = zogVar.a;
        if (z && !v(znxVar) && (sb2.length() == 0 || !b.matcher(sb2).lookingAt())) {
            throw new zoe(1, "Missing or invalid default region.");
        }
        String strGroup = "";
        boolean z2 = zogVar.b;
        if (z2) {
            abnpVar.t();
            zpd zpdVar = (zpd) abnpVar.b;
            zpd zpdVar2 = zpd.a;
            string.getClass();
            zpdVar.b |= 32;
            zpdVar.h = string;
        }
        Matcher matcher4 = o.matcher(sb2);
        if (matcher4.find() && i(sb2.substring(0, matcher4.start()))) {
            int iGroupCount = matcher4.groupCount();
            int i7 = 1;
            while (true) {
                if (i7 > iGroupCount) {
                    break;
                }
                if (matcher4.group(i7) != null) {
                    strGroup = matcher4.group(i7);
                    sb2.delete(matcher4.start(), sb2.length());
                    break;
                }
                i7++;
            }
        }
        if (strGroup.length() > 0) {
            abnpVar.t();
            zpd zpdVar3 = (zpd) abnpVar.b;
            zpd zpdVar4 = zpd.a;
            strGroup.getClass();
            zpdVar3.b |= 4;
            zpdVar3.e = strGroup;
        }
        zoi zoiVarB = b(znxVar);
        StringBuilder sb4 = new StringBuilder();
        try {
            iL = l(sb2, zoiVarB, sb4, z2, abnpVar);
            sb = sb2;
            zopVar = this;
            abnpVar2 = abnpVar;
        } catch (zoe e2) {
            sb = sb2;
            Matcher matcher5 = b.matcher(sb);
            int i8 = e2.a;
            if (i8 != 1) {
                i3 = i8;
            } else if (matcher5.lookingAt()) {
                String strSubstring3 = sb.substring(matcher5.end());
                zopVar = this;
                abnpVar2 = abnpVar;
                iL = zopVar.l(strSubstring3, zoiVarB, sb4, z2, abnpVar2);
                if (iL == 0) {
                    throw new zoe(1, "Could not interpret numbers after plus-sign.");
                }
            }
            throw new zoe(i3, e2.getMessage());
        }
        boolean z3 = iL != 0;
        if (z3) {
            znx znxVarA = zopVar.a(iL);
            if (!znxVarA.equals(znxVar)) {
                zoiVarB = zopVar.c(iL, znxVarA);
            }
        } else {
            k(sb);
            sb4.append((CharSequence) sb);
            if (znxVar != null) {
                int i9 = zoiVarB.o;
                abnpVar2.t();
                zpd zpdVar5 = (zpd) abnpVar2.b;
                zpd zpdVar6 = zpd.a;
                zpdVar5.b |= 1;
                zpdVar5.c = i9;
            } else if (z2) {
                abnpVar2.t();
                zpd zpdVar7 = (zpd) abnpVar2.b;
                zpd zpdVar8 = zpd.a;
                zpdVar7.b &= -65;
                zpdVar7.i = 0;
            }
        }
        if (sb4.length() < 2) {
            throw new zoe(4, "The string supplied is too short to be a phone number.");
        }
        if (zoiVarB != null && (zogVar.c || !z3)) {
            StringBuilder sb5 = new StringBuilder();
            StringBuilder sb6 = new StringBuilder(sb4);
            zopVar.j(sb6, zoiVarB, sb5);
            int iX = zopVar.x(sb6, zoiVarB, 12);
            if (iX != 4 && iX != 2 && iX != i) {
                if (z2 && sb5.length() > 0) {
                    String string2 = sb5.toString();
                    abnpVar2.t();
                    zpd zpdVar9 = (zpd) abnpVar2.b;
                    zpd zpdVar10 = zpd.a;
                    zpdVar9.b |= 128;
                    zpdVar9.j = string2;
                }
                sb4 = sb6;
            }
        }
        int length = sb4.length();
        if (length < 2) {
            throw new zoe(4, "The string supplied is too short to be a phone number.");
        }
        if (length > 17) {
            throw new zoe(5, "The string supplied is too long to be a phone number.");
        }
        if (sb4.length() > 1 && sb4.charAt(0) == '0') {
            abnpVar2.t();
            zpd zpdVar11 = (zpd) abnpVar2.b;
            zpd zpdVar12 = zpd.a;
            zpdVar11.b |= 8;
            zpdVar11.f = true;
            int i10 = 1;
            while (i10 < sb4.length() - 1 && sb4.charAt(i10) == '0') {
                i10++;
            }
            if (i10 != 1) {
                abnpVar2.t();
                zpd zpdVar13 = (zpd) abnpVar2.b;
                zpdVar13.b |= 16;
                zpdVar13.g = i10;
            }
        }
        long j2 = Long.parseLong(sb4.toString());
        abnpVar2.t();
        zpd zpdVar14 = (zpd) abnpVar2.b;
        zpd zpdVar15 = zpd.a;
        zpdVar14.b |= 2;
        zpdVar14.d = j2;
    }

    public final void p(int i, StringBuilder sb) {
        sb.insert(0, i).insert(0, '+');
    }
}
