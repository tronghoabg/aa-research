package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class vwq {
    private final defpackage.afak i;
    private final defpackage.afak j;
    private static final defpackage.yhx d = defpackage.yhx.r("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
    private static final java.util.regex.Pattern e = java.util.regex.Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
    public static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("([^\\?]+)(\\?+)");
    private static final java.util.regex.Pattern f = java.util.regex.Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+$)");
    public static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+\\.[\\w]*$)");
    private static final java.util.regex.Pattern g = java.util.regex.Pattern.compile("([a-zA-Z0-9-_]+)");
    private static final java.util.regex.Pattern h = java.util.regex.Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");

    public vwq(defpackage.afak afakVar, defpackage.afak afakVar2) {
        this.i = afakVar;
        this.j = afakVar2;
    }

    static java.lang.String a(java.lang.String str) {
        java.util.regex.Matcher matcher = f.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.regex.Matcher matcher = h.matcher(str);
        return matcher.find() ? matcher.replaceFirst("<ip>") : str;
    }

    static java.lang.String d(java.lang.String str, boolean z) {
        boolean z2;
        if (defpackage.ysr.bw(str)) {
            return null;
        }
        if (z) {
            z2 = true;
        } else {
            java.lang.String strA = a(str);
            if (strA != null) {
                str = strA;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        java.util.regex.Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            str = matcher.group(1);
            z2 = true;
        }
        java.lang.String strB = b(str);
        if (strB != null && !strB.equals(str)) {
            z2 = true;
        }
        if (strB != null) {
            java.util.regex.Matcher matcher2 = h.matcher(strB);
            if (matcher2.find()) {
                strB = matcher2.replaceFirst("<ip>");
                z2 = true;
            }
        }
        if (strB == null || z2) {
            return strB;
        }
        java.util.regex.Matcher matcher3 = g.matcher(strB);
        if (matcher3.find()) {
            return matcher3.group(1);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0239  */
    /* JADX WARN: Code duplicated, block: B:91:0x0245  */
    /* JADX WARN: Code duplicated, block: B:93:0x024b  */
    public final ajht c(java.lang.Iterable iterable) {
        int i;
        java.lang.String strB;
        boolean zAnyMatch;
        java.lang.String strD;
        int i2;
        java.lang.String strGroup;
        defpackage.abor aborVarN = ajgg.a.n();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            defpackage.vwp vwpVar = (defpackage.vwp) it.next();
            defpackage.abor aborVarN2 = ajgf.a.n();
            int i3 = vwpVar.e;
            if (i3 > 0) {
                aborVarN2.t();
                ajgf ajgfVar = aborVarN2.b;
                ajgfVar.b |= 128;
                ajgfVar.l = i3;
            }
            int i4 = vwpVar.d;
            if (i4 > 0) {
                aborVarN2.t();
                ajgf ajgfVar2 = aborVarN2.b;
                ajgfVar2.b |= 64;
                ajgfVar2.k = i4;
            }
            long j = vwpVar.c;
            long j2 = 0;
            if (j > 0) {
                aborVarN2.t();
                ajgf ajgfVar3 = aborVarN2.b;
                ajgfVar3.b |= 8;
                ajgfVar3.h = (int) j;
            }
            long j3 = vwpVar.b;
            if (j3 > 0) {
                aborVarN2.t();
                ajgf ajgfVar4 = aborVarN2.b;
                ajgfVar4.b |= 16;
                ajgfVar4.i = (int) j3;
            }
            int i5 = vwpVar.j;
            aborVarN2.t();
            ajgf ajgfVar5 = aborVarN2.b;
            ajgfVar5.b |= 32;
            ajgfVar5.j = i5;
            if (vwpVar.p >= 0) {
                defpackage.abor aborVarN3 = ajgh.a.n();
                int i6 = vwpVar.p;
                aborVarN3.t();
                ajgh ajghVar = aborVarN3.b;
                ajghVar.b |= 1;
                ajghVar.c = i6;
                ajgh ajghVarQ = aborVarN3.q();
                aborVarN2.t();
                ajgf ajgfVar6 = aborVarN2.b;
                ajghVarQ.getClass();
                ajgfVar6.z = ajghVarQ;
                ajgfVar6.b |= 4194304;
            }
            java.lang.String str = vwpVar.k;
            java.lang.String strGroup2 = null;
            if (str != null) {
                if (defpackage.ysr.bw(str)) {
                    strGroup = null;
                } else {
                    java.util.regex.Matcher matcher = e.matcher(str);
                    if (matcher.find()) {
                        strGroup = matcher.group(0);
                    } else {
                        ((defpackage.ype) ((defpackage.ype) vmf.a.h()).ai((char) 9871)).y("contentType extraction failed for %s, skipping logging path", str);
                        strGroup = null;
                    }
                }
                if (strGroup != null) {
                    aborVarN2.t();
                    ajgf ajgfVar7 = aborVarN2.b;
                    ajgfVar7.b |= 1;
                    ajgfVar7.e = strGroup;
                }
            }
            java.lang.String str2 = vwpVar.i;
            if (defpackage.ysr.bw(str2)) {
                i = 1;
            } else if (str2.equals("http/1.1")) {
                i = 2;
            } else if (str2.equals("spdy/2")) {
                i = 3;
            } else if (str2.equals("spdy/3")) {
                i = 4;
            } else if (str2.equals("spdy/3.1")) {
                i = 5;
            } else if (str2.startsWith("h2")) {
                i = 6;
            } else if (str2.equals("quic/1+spdy/3")) {
                i = 7;
            } else if (str2.startsWith("http/2+quic")) {
                i = 11;
            } else if (str2.startsWith("h3")) {
                i = 12;
            } else if (str2.equals("http/0.9")) {
                i = 9;
            } else if (str2.equals("http/1.0")) {
                i = 10;
            } else {
                i = 1;
            }
            aborVarN2.t();
            ajgf ajgfVar8 = aborVarN2.b;
            ajgfVar8.m = i - 1;
            ajgfVar8.b |= 256;
            defpackage.vlq vlqVar = (defpackage.vlq) this.i;
            vlqVar.a();
            java.lang.String str3 = vwpVar.f;
            if (str3 == null) {
                j2 = 0;
            } else if (vwpVar.h) {
                strGroup2 = vwpVar.g;
                aborVarN2.t();
                ajgf ajgfVar9 = aborVarN2.b;
                ajgfVar9.b = 4 | ajgfVar9.b;
                ajgfVar9.g = str3;
                j2 = 0;
            } else {
                java.lang.String strA = a(str3);
                int i7 = vwpVar.t;
                if (vlqVar.a().b) {
                    if (((java.lang.Boolean) this.j.a()).booleanValue()) {
                        java.lang.String strA2 = a(str3);
                        if (strA2 == null) {
                            j2 = 0;
                        } else {
                            zAnyMatch = j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(d), j$.util.Collection.-EL.stream(vlqVar.a().d)).anyMatch(new defpackage.orr(strA2.replaceAll("^(https?://)", "").replaceAll("(?::\\d+)$", ""), 18));
                        }
                        if (i7 == 0 && ((i2 = i7 - 1) == 1 || i2 == 2)) {
                            strD = d(str3, true);
                            if (strD != null) {
                                java.util.regex.Matcher matcher2 = f.matcher(strD);
                                strGroup2 = matcher2.matches() ? matcher2.group(2) : null;
                                if (strGroup2 != null) {
                                    aborVarN2.t();
                                    ajgf ajgfVar10 = aborVarN2.b;
                                    ajgfVar10.b |= 524288;
                                    ajgfVar10.w = strGroup2;
                                }
                            }
                        }
                        strGroup2 = strA;
                    } else {
                        zAnyMatch = j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(d), j$.util.Collection.-EL.stream(vlqVar.a().d)).anyMatch(new defpackage.orr(str3, 19));
                    }
                    if (!zAnyMatch) {
                        if (i7 == 0) {
                        }
                    }
                    strD = d(str3, true);
                    if (strD != null) {
                        java.util.regex.Matcher matcher3 = f.matcher(strD);
                        if (matcher3.matches()) {
                        }
                        if (strGroup2 != null) {
                            aborVarN2.t();
                            ajgf ajgfVar11 = aborVarN2.b;
                            ajgfVar11.b |= 524288;
                            ajgfVar11.w = strGroup2;
                        }
                    }
                    strGroup2 = strA;
                } else {
                    j2 = 0;
                }
                java.lang.String strD2 = d(str3, false);
                if (strD2 != null) {
                    aborVarN2.t();
                    ajgf ajgfVar12 = aborVarN2.b;
                    ajgfVar12.b |= 2;
                    ajgfVar12.f = strD2;
                }
                strGroup2 = strA;
            }
            if (strGroup2 != null && (strB = b(strGroup2)) != null) {
                aborVarN2.t();
                ajgf ajgfVar13 = aborVarN2.b;
                ajgfVar13.b |= 2097152;
                ajgfVar13.y = strB;
            }
            ajgv ajgvVar = vwpVar.l;
            if (ajgvVar != null) {
                aborVarN2.t();
                ajgf ajgfVar14 = aborVarN2.b;
                ajgfVar14.n = ajgvVar;
                ajgfVar14.b |= 512;
            }
            int i8 = vwpVar.r;
            if (i8 != 0) {
                aborVarN2.t();
                ajgf ajgfVar15 = aborVarN2.b;
                ajgfVar15.o = i8 - 1;
                ajgfVar15.b |= 1024;
            }
            defpackage.abor aborVarN4 = ajge.a.n();
            int i9 = vwpVar.s;
            if (i9 != 0) {
                aborVarN4.t();
                ajge ajgeVar = aborVarN4.b;
                ajgeVar.c = i9 - 2;
                ajgeVar.b |= 1;
            }
            aborVarN2.t();
            ajgf ajgfVar16 = aborVarN2.b;
            ajge ajgeVarQ = aborVarN4.q();
            ajgeVarQ.getClass();
            ajgfVar16.p = ajgeVarQ;
            ajgfVar16.b |= 2048;
            int i10 = vwpVar.t;
            if (i10 != 0) {
                aborVarN2.t();
                ajgf ajgfVar17 = aborVarN2.b;
                ajgfVar17.q = i10 - 1;
                ajgfVar17.b |= 4096;
            }
            ajfx ajfxVar = vwpVar.m;
            long j4 = vwpVar.a;
            if (j4 > j2) {
                aborVarN2.t();
                ajgf ajgfVar18 = aborVarN2.b;
                ajgfVar18.b |= 16384;
                ajgfVar18.r = j4;
            }
            int i11 = vwpVar.o;
            defpackage.vzf vzfVar = vwpVar.q;
            if (vzfVar != null) {
                if (vzfVar.e()) {
                    int i12 = vzfVar.c;
                    aborVarN2.t();
                    ajgf ajgfVar19 = aborVarN2.b;
                    ajgfVar19.c = 28;
                    ajgfVar19.d = java.lang.Long.valueOf(i12);
                } else {
                    defpackage.abor aborVarN5 = ajgx.a.n();
                    int i13 = vzfVar.c;
                    aborVarN5.t();
                    ajgx ajgxVar = aborVarN5.b;
                    ajgxVar.b = 1 | ajgxVar.b;
                    ajgxVar.c = i13;
                    int i14 = vzfVar.d;
                    aborVarN5.t();
                    ajgx ajgxVar2 = aborVarN5.b;
                    ajgxVar2.b |= 2;
                    ajgxVar2.d = i14;
                    aborVarN2.t();
                    ajgf ajgfVar20 = aborVarN2.b;
                    ajgx ajgxVarQ = aborVarN5.q();
                    ajgxVarQ.getClass();
                    ajgfVar20.d = ajgxVarQ;
                    ajgfVar20.c = 29;
                }
            }
            int i15 = vwpVar.u;
            if (i15 != 0) {
                aborVarN2.t();
                ajgf ajgfVar21 = aborVarN2.b;
                ajgfVar21.t = i15 - 1;
                ajgfVar21.b |= 65536;
            }
            int i16 = vwpVar.v;
            if (i16 != 0) {
                aborVarN2.t();
                ajgf ajgfVar22 = aborVarN2.b;
                ajgfVar22.s = i16 - 1;
                ajgfVar22.b |= 32768;
            }
            java.lang.Integer num = vwpVar.n;
            if (num != null) {
                int iIntValue = num.intValue();
                aborVarN2.t();
                ajgf ajgfVar23 = aborVarN2.b;
                ajgfVar23.b |= 131072;
                ajgfVar23.u = iIntValue;
            }
            aborVarN2.t();
            ajgf ajgfVar24 = aborVarN2.b;
            ajgfVar24.b |= 262144;
            ajgfVar24.v = 0;
            aborVarN.t();
            ajgg ajggVar = aborVarN.b;
            ajgf ajgfVarQ = aborVarN2.q();
            ajgfVarQ.getClass();
            ajggVar.b();
            ajggVar.b.add(ajgfVarQ);
        }
        defpackage.abor aborVarN6 = ajht.a.n();
        aborVarN6.t();
        ajht ajhtVar = aborVarN6.b;
        ajgg ajggVarQ = aborVarN.q();
        ajggVarQ.getClass();
        ajhtVar.h = ajggVarQ;
        ajhtVar.b |= 32;
        return aborVarN6.q();
    }
}
