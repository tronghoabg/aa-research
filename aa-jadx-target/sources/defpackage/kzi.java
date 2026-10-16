package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kzi {
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static java.lang.Object A(java.util.concurrent.Callable callable) throws java.lang.Exception {
        int i = 0;
        do {
            try {
                return callable.call();
            } catch (java.lang.Exception e) {
                i++;
            }
        } while (i < 2);
        throw e;
    }

    public static int B(int i) {
        switch (i) {
            case 1:
                return 1;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            default:
                return 0;
        }
    }

    public static /* synthetic */ java.lang.String C(int i) {
        return i != 1 ? "CALLOUT" : "CVO";
    }

    public static boolean D(int i) {
        return i + (-1) == 0;
    }

    public static defpackage.abpy E(xqs xqsVar) {
        switch (xqsVar.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                return xqy.a;
            case 1:
                return xqq.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return xqr.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return xra.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return xrb.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return xqo.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return xqz.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return xqt.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return xqu.a;
            case 9:
                return xqp.a;
            case 10:
                return xqx.a;
            default:
                throw new java.lang.RuntimeException(null, null);
        }
    }

    public static void F(xqs xqsVar, defpackage.abpy abpyVar) {
        java.lang.String str;
        switch (xqsVar.ordinal()) {
            case defpackage.abnt.b /* 0 */:
                xqy xqyVar = (xqy) abpyVar;
                defpackage.xym xymVar = new defpackage.xym("WifiStartRequest");
                xymVar.b("ipAddress", xqyVar.c);
                xymVar.f("port", xqyVar.d);
                xymVar.toString();
                return;
            case 1:
                new defpackage.xym("WifiInfoRequest").toString();
                return;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                xqr xqrVar = (xqr) abpyVar;
                defpackage.xym xymVar2 = new defpackage.xym("WifiInfoResponse");
                xymVar2.b("wifiSsid", xqrVar.b);
                xqw xqwVarB = xqw.b(xqrVar.e);
                if (xqwVarB == null) {
                    xqwVarB = xqw.a;
                }
                xymVar2.b("wifiSecurityMode", xqwVarB.name());
                int iAB = defpackage.a.aB(xqrVar.f);
                xymVar2.b("accessPointType", (iAB == 0 || iAB == 1) ? "STATIC" : "DYNAMIC");
                xymVar2.toString();
                return;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                xra xraVar = (xra) abpyVar;
                defpackage.xym xymVar3 = new defpackage.xym("WifiVersionRequest");
                xymVar3.f("majorVersion", xraVar.c);
                xymVar3.f("minorVersion", xraVar.d);
                xymVar3.b("supportedWifiChannels", xraVar.f);
                xymVar3.toString();
                return;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                xrb xrbVar = (xrb) abpyVar;
                defpackage.xym xymVar4 = new defpackage.xym("WifiVersionResponse");
                xymVar4.f("majorVersion", xrbVar.c);
                xymVar4.f("minorVersion", xrbVar.d);
                xymVar4.b("deviceSerial", xrbVar.e);
                int iD = defpackage.wva.D(xrbVar.f);
                xymVar4.b("versionStatus", defpackage.wva.C(iD != 0 ? iD : 13));
                int iAx = defpackage.a.ax(xrbVar.g);
                if (iAx == 0 || iAx == 1) {
                    str = "CHANNELS_5GHZ_ONLY";
                } else if (iAx != 2) {
                    str = iAx != 3 ? "NO_CHANNELS_SUPPORTED" : "CHANNELS_DUAL_BAND";
                } else {
                    str = "CHANNELS_24GHZ_ONLY";
                }
                xymVar4.b("selectedWifiChannelType", str);
                xymVar4.toString();
                return;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                xqo xqoVar = (xqo) abpyVar;
                defpackage.xym xymVar5 = new defpackage.xym("WifiConnectStatus");
                int iD2 = defpackage.wva.D(xqoVar.c);
                xymVar5.b("connectStatus", defpackage.wva.C(iD2 != 0 ? iD2 : 13));
                xymVar5.b("errorMessageHint", xqoVar.d);
                xymVar5.toString();
                return;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                xqz xqzVar = (xqz) abpyVar;
                defpackage.xym xymVar6 = new defpackage.xym("WifiStartResponse");
                xymVar6.b("ipAddress", xqzVar.c);
                xymVar6.f("port", xqzVar.d);
                int iD3 = defpackage.wva.D(xqzVar.e);
                xymVar6.b("messageStatus", defpackage.wva.C(iD3 != 0 ? iD3 : 13));
                xymVar6.toString();
                return;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.xym xymVar7 = new defpackage.xym("WifiPingRequest");
                xymVar7.g("timestampMs", ((xqt) abpyVar).c);
                xymVar7.toString();
                return;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.xym xymVar8 = new defpackage.xym("WifiPingResponse");
                xymVar8.g("timestampMs", ((xqu) abpyVar).b);
                xymVar8.toString();
                return;
            case 9:
                defpackage.xym xymVar9 = new defpackage.xym("WifiConnectionRejection");
                int iAo = defpackage.a.ao(((xqp) abpyVar).b);
                xymVar9.b("rejectionReason", defpackage.wva.E(iAo != 0 ? iAo : 1));
                xymVar9.toString();
                return;
            case 10:
                xqx xqxVar = (xqx) abpyVar;
                defpackage.xym xymVar10 = new defpackage.xym("WifiSetupInfo");
                xymVar10.f("majorVersion", xqxVar.b);
                xymVar10.f("minorVersion", xqxVar.c);
                xqn xqnVar = xqxVar.f;
                if (xqnVar == null) {
                    xqnVar = xqn.a;
                }
                xymVar10.b("accessPointInfo.ssid", xqnVar.b);
                xqn xqnVar2 = xqxVar.f;
                if (xqnVar2 == null) {
                    xqnVar2 = xqn.a;
                }
                xqw xqwVarB2 = xqw.b(xqnVar2.e);
                if (xqwVarB2 == null) {
                    xqwVarB2 = xqw.a;
                }
                xymVar10.b("accessPointInfo.wifiSecurityMode", xqwVarB2.name());
                xqn xqnVar3 = xqxVar.f;
                if (xqnVar3 == null) {
                    xqnVar3 = xqn.a;
                }
                xymVar10.b("accessPointInfo.supportedWifiChannels", xqnVar3.f);
                xymVar10.toString();
                return;
            default:
                throw new java.lang.RuntimeException(null, null);
        }
    }

    public static /* synthetic */ int G(pau pauVar) {
        j$.util.Objects.checkIndex(0, 4);
        if (pauVar instanceof par) {
            return 0;
        }
        if (pauVar instanceof pas) {
            return 1;
        }
        return pauVar instanceof pat ? 2 : -2;
    }

    public static /* synthetic */ int H(pgt pgtVar) {
        j$.util.Objects.checkIndex(0, 3);
        if (pgtVar instanceof pgr) {
            return 0;
        }
        return pgtVar instanceof pgs ? 1 : -2;
    }

    public static boolean I(pff pffVar) {
        j$.util.Objects.checkIndex(0, 5);
        if (N(pffVar, pfa.a)) {
            return false;
        }
        if (P(pffVar, pfa.a) || O(pffVar, pfa.a)) {
            return true;
        }
        if (!(pffVar instanceof pfb)) {
            throw new java.lang.RuntimeException(null, null);
        }
        return true;
    }

    public static boolean J(pep pepVar) {
        if ((pepVar instanceof pem) || defpackage.afga.f(pepVar, pen.a)) {
            return true;
        }
        if (pepVar instanceof peo) {
            return false;
        }
        throw new defpackage.afas();
    }

    public static /* synthetic */ java.lang.String K(int i) {
        if (i == 1) {
            return "USE_FOR_GAL";
        }
        if (i != 2) {
            return i != 3 ? "null" : "DO_NOT_USE";
        }
        return "USE_FOR_WPP";
    }

    public static /* synthetic */ java.lang.String L(java.lang.Object[] objArr, java.lang.Class cls) {
        java.lang.String[] strArrSplit = "timeSinceStart".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(cls.getSimpleName());
        sb.append("[");
        int i = 0;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    public static /* synthetic */ java.lang.String M(java.lang.Object[] objArr, java.lang.Class cls) {
        java.lang.String[] strArrSplit = "connection".split(";");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(cls.getSimpleName());
        sb.append("[");
        int i = 0;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }

    public static /* synthetic */ boolean N(pff pffVar, java.lang.Object[] objArr) {
        java.lang.Object obj;
        java.lang.Object obj2 = objArr[0];
        if (obj2 == null) {
            try {
                obj = pfe.valueOf("INSTANCE");
            } catch (java.lang.Throwable unused) {
                obj = null;
            }
            if (obj == null) {
                obj = new java.lang.Object();
            }
            obj2 = obj;
            objArr[0] = obj2;
        }
        return pffVar == obj2;
    }

    public static /* synthetic */ boolean O(pff pffVar, java.lang.Object[] objArr) {
        java.lang.Object obj;
        java.lang.Object obj2 = objArr[2];
        if (obj2 == null) {
            try {
                obj = pfd.valueOf("INSTANCE");
            } catch (java.lang.Throwable unused) {
                obj = null;
            }
            if (obj == null) {
                obj = new java.lang.Object();
            }
            obj2 = obj;
            objArr[2] = obj2;
        }
        return pffVar == obj2;
    }

    public static /* synthetic */ boolean P(pff pffVar, java.lang.Object[] objArr) {
        java.lang.Object obj;
        java.lang.Object obj2 = objArr[1];
        if (obj2 == null) {
            try {
                obj = pfc.valueOf("INSTANCE");
            } catch (java.lang.Throwable unused) {
                obj = null;
            }
            if (obj == null) {
                obj = new java.lang.Object();
            }
            obj2 = obj;
            objArr[1] = obj2;
        }
        return pffVar == obj2;
    }

    private static final java.lang.String Q(com.google.android.gms.car.CarInfo carInfo) {
        return carInfo.a + "_" + carInfo.b + "_" + carInfo.c + "_" + carInfo.i + "_" + carInfo.j + "_" + carInfo.l + "_" + carInfo.k + "_" + carInfo.d;
    }

    public static final android.content.res.ColorStateList a(android.util.AttributeSet attributeSet, android.content.Context context, int[] iArr, int i) {
        if (attributeSet == null) {
            return null;
        }
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        android.content.res.ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(i);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }

    public static int b(android.net.Uri uri, lab labVar, android.content.Context context) {
        java.lang.String strC = c(uri);
        java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
        int size = pathSegments.size();
        defpackage.ysr.bf(size >= 2, "Uri %s has %s path segments, expected at least 2", uri, pathSegments.size());
        try {
            int iA = labVar.a(context.getPackageManager().getResourcesForApplication(strC), pathSegments.get(1), pathSegments.get(0), strC);
            defpackage.ysr.bc(iA != 0, "Couldn't find the resource ID for URI %s", uri);
            return iA;
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            throw new java.lang.IllegalArgumentException("Resources not found for ".concat(strC), e);
        }
    }

    public static java.lang.String c(android.net.Uri uri) {
        java.lang.String authority = uri.getAuthority();
        authority.getClass();
        return authority;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static defpackage.saf d(defpackage.saf safVar, osy osyVar) {
        return safVar.f("AssistantSuggestionSignal", new defpackage.kzz(safVar, osyVar, 2));
    }

    public static java.lang.String e(osv osvVar) {
        return java.lang.String.format(java.util.Locale.US, "Action {id=%s, dismiss_on_tap=%b}", osvVar.c, java.lang.Boolean.valueOf(osvVar.d));
    }

    public static java.lang.String f(osz oszVar) {
        return java.lang.String.format(java.util.Locale.US, "%s/%s", oszVar.c, oszVar.d);
    }

    public static java.lang.String g(java.lang.String str) {
        return java.lang.String.format(java.util.Locale.US, "'%s'", str);
    }

    public static void h(defpackage.saf safVar, ota otaVar) {
        safVar.f("Icon", new defpackage.kza(safVar, (java.lang.Object) otaVar, 15));
    }

    public static void i(defpackage.saf safVar, oth othVar) {
        safVar.f("RowRenderingMetadata", new defpackage.kzz(safVar, othVar, 1));
    }

    public static final boolean j() {
        android.content.Context context = defpackage.mkp.a.c;
        context.getClass();
        return context.getSharedPreferences("action_developer_settings", 0).getBoolean("cal_beta_features_enabled", false);
    }

    public static final boolean k() {
        return defpackage.acpd.t() || defpackage.leo.a.a().e() || j();
    }

    public static void l(java.util.List list, java.lang.String str, android.os.PersistableBundle persistableBundle) {
        java.lang.String string = persistableBundle.getString(str);
        if (string != null) {
            list.add(new defpackage.dzp(str, string));
        }
    }

    public static final java.lang.String m(java.lang.String str, android.content.Context context) {
        try {
            java.lang.String str2 = context.getPackageManager().getPackageInfo(str, 0).versionName;
            return str2 == null ? "UNAVAILABLE" : str2;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return "UNAVAILABLE";
        }
    }

    public static defpackage.ldq n() {
        return (defpackage.ldq) defpackage.mkp.a.i(defpackage.ldq.class);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:105:0x0135  */
    /* JADX WARN: Code duplicated, block: B:106:0x013e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0142  */
    /* JADX WARN: Code duplicated, block: B:110:0x014c  */
    /* JADX WARN: Code duplicated, block: B:111:0x014f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x015e  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:120:0x0166  */
    /* JADX WARN: Code duplicated, block: B:122:0x016f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0171  */
    /* JADX WARN: Code duplicated, block: B:125:0x0175  */
    /* JADX WARN: Code duplicated, block: B:128:0x0184  */
    /* JADX WARN: Code duplicated, block: B:132:0x018c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:136:0x0197  */
    /* JADX WARN: Code duplicated, block: B:137:0x019f  */
    /* JADX WARN: Code duplicated, block: B:139:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:150:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:157:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:158:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:160:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:161:0x01df  */
    /* JADX WARN: Code duplicated, block: B:163:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:165:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:167:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:170:0x0210  */
    /* JADX WARN: Code duplicated, block: B:171:0x0212  */
    /* JADX WARN: Code duplicated, block: B:174:0x0224  */
    /* JADX WARN: Code duplicated, block: B:177:0x022f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0236  */
    /* JADX WARN: Code duplicated, block: B:183:0x0291  */
    /* JADX WARN: Code duplicated, block: B:186:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0099  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:96:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    public static final void o(defpackage.gjv gjvVar, defpackage.cgf cgfVar, defpackage.cfu cfuVar, defpackage.csr csrVar, float f, defpackage.cke ckeVar, hea heaVar, hea heaVar2, defpackage.cjl cjlVar, defpackage.affc affcVar, defpackage.bve bveVar, int i, int i2, int i3) {
        int i4;
        defpackage.cgf cgfVar2;
        int i5;
        int i6;
        defpackage.cfu cfuVar2;
        int i7;
        int i8;
        defpackage.csr csrVar2;
        int i9;
        int i10;
        float f2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean zE;
        int i17;
        int i18;
        boolean zE2;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z;
        defpackage.bve bveVar2;
        hea heaVar3;
        hea heaVar4;
        defpackage.affc affcVar2;
        float f3;
        defpackage.cgf cgfVar3;
        defpackage.csr csrVar3;
        defpackage.cfu cfuVar3;
        defpackage.cke ckeVar2;
        defpackage.cjl cjlVar2;
        defpackage.bxl bxlVarJ;
        int i26;
        defpackage.cgf cgfVar4;
        defpackage.cfu cfuVar4;
        defpackage.csr csrVar4;
        int i27;
        float f4;
        defpackage.cke ckeVar3;
        hea heaVar5;
        hea heaVar6;
        defpackage.cjl cjlVar3;
        defpackage.affc affcVar3;
        htb htbVarC;
        boolean z2;
        boolean zE3;
        boolean z3;
        defpackage.bwc bwcVar;
        java.lang.Object objS;
        defpackage.cjl cjlVar4;
        defpackage.bwc bwcVar2;
        java.lang.Object objS2;
        gjvVar.getClass();
        int i28 = i & 6;
        defpackage.bve bveVarC = bveVar.c(-486958549);
        if (i28 == 0) {
            i4 = (true != bveVarC.E(gjvVar) ? 2 : 4) | i;
        } else {
            i4 = i;
        }
        int i29 = i3 & 2;
        if (i29 == 0) {
            if ((i & 48) == 0) {
                cgfVar2 = cgfVar;
                i4 |= true != bveVarC.C(cgfVar2) ? 16 : 32;
            }
            if ((i3 & 4) != 0) {
                i4 |= 384;
            } else if ((i & 384) == 0) {
                if (true != bveVarC.C(null)) {
                    i5 = 128;
                } else {
                    i5 = 256;
                }
                i4 |= i5;
            }
            i6 = i3 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    cfuVar2 = cfuVar;
                    if (true != bveVarC.C(cfuVar2)) {
                        i7 = 1024;
                    } else {
                        i7 = 2048;
                    }
                    i4 |= i7;
                }
                i8 = i3 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        csrVar2 = csrVar;
                        if (true != bveVarC.C(csrVar2)) {
                            i9 = 8192;
                        } else {
                            i9 = 16384;
                        }
                        i4 |= i9;
                    }
                    i10 = i3 & 32;
                    if (i10 != 0) {
                        i4 |= 196608;
                        f2 = f;
                    } else {
                        f2 = f;
                        i11 = i4;
                        if ((i & 196608) == 0) {
                            if (true != bveVarC.z(f2)) {
                                i12 = 65536;
                            } else {
                                i12 = 131072;
                            }
                            i4 = i11 | i12;
                        }
                    }
                    i13 = i3 & 64;
                    if (i13 != 0) {
                        if ((i & 1572864) == 0) {
                            int i30 = i4;
                            if (true != bveVarC.C(ckeVar)) {
                                i14 = 524288;
                            } else {
                                i14 = 1048576;
                            }
                            i15 = i30 | i14;
                        }
                        i16 = i3 & 128;
                        if (i16 != 0) {
                            i15 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            if ((i & 16777216) == 0) {
                                zE = bveVarC.C(heaVar);
                            } else {
                                zE = bveVarC.E(heaVar);
                            }
                            if (true != zE) {
                                i17 = 4194304;
                            } else {
                                i17 = 8388608;
                            }
                            i15 |= i17;
                        }
                        i18 = i3 & 256;
                        if (i18 != 0) {
                            if ((i & 100663296) == 0) {
                                if ((i & 134217728) == 0) {
                                    zE2 = bveVarC.C(heaVar2);
                                } else {
                                    zE2 = bveVarC.E(heaVar2);
                                }
                                if (true != zE2) {
                                    i19 = 33554432;
                                } else {
                                    i19 = 67108864;
                                }
                                i15 |= i19;
                            }
                            i20 = i3 & 512;
                            if (i20 != 0) {
                                i20 = i20;
                                i21 = i15 | 805306368;
                            } else {
                                if ((i & 805306368) != 0) {
                                    if (true != bveVarC.C(cjlVar)) {
                                        i22 = 268435456;
                                    } else {
                                        i22 = 536870912;
                                    }
                                    i15 |= i22;
                                }
                                i21 = i15;
                            }
                            i23 = i3 & 1024;
                            if (i23 != 0) {
                                i24 = i2 | 6;
                            } else if ((i2 & 6) == 0) {
                                if (true != bveVarC.E(affcVar)) {
                                    i25 = 2;
                                } else {
                                    i25 = 4;
                                }
                                i24 = i2 | i25;
                            } else {
                                i24 = i2;
                            }
                            if ((306783379 & i21) == 306783378 || (i24 & 3) != 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (bveVarC.I(z, i21 & 1)) {
                                if (i29 != 0) {
                                    cgfVar4 = defpackage.cgf.e;
                                    i26 = i8;
                                } else {
                                    i26 = i8;
                                    cgfVar4 = cgfVar2;
                                }
                                if (i6 != 0) {
                                    cfuVar4 = defpackage.cfs.e;
                                } else {
                                    cfuVar4 = cfuVar2;
                                }
                                if (i26 != 0) {
                                    csrVar4 = defpackage.csq.b;
                                } else {
                                    csrVar4 = csrVar2;
                                }
                                if (i10 != 0) {
                                    f4 = 1.0f;
                                    i27 = i13;
                                } else {
                                    i27 = i13;
                                    f4 = f2;
                                }
                                if (i27 != 0) {
                                    ckeVar3 = null;
                                } else {
                                    ckeVar3 = ckeVar;
                                }
                                if (i16 != 0) {
                                    heaVar5 = null;
                                } else {
                                    heaVar5 = heaVar;
                                }
                                if (i18 != 0) {
                                    heaVar6 = null;
                                } else {
                                    heaVar6 = heaVar2;
                                }
                                if (i20 != 0) {
                                    cjlVar3 = null;
                                } else {
                                    cjlVar3 = cjlVar;
                                }
                                if (i23 != 0) {
                                    bwcVar2 = (defpackage.bwc) bveVarC;
                                    objS2 = bwcVar2.S();
                                    if (objS2 == defpackage.bvd.a) {
                                        objS2 = new lfs(0);
                                        bwcVar2.ad(objS2);
                                    }
                                    affcVar3 = (defpackage.affc) objS2;
                                } else {
                                    affcVar3 = affcVar;
                                }
                                htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                                htbVarC.getClass();
                                android.net.Uri uri = gjvVar.b;
                                if ((i24 & 14) == 4) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                                z3 = (1879048192 & i21) == 536870912;
                                bwcVar = (defpackage.bwc) bveVarC;
                                objS = bwcVar.S();
                                if ((!zE3 && !z3) || objS == defpackage.bvd.a) {
                                    defpackage.cjl cjlVar5 = cjlVar3;
                                    objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar5, 11, (byte[]) null);
                                    cjlVar4 = cjlVar5;
                                    bwcVar.ad(objS);
                                } else {
                                    cjlVar4 = cjlVar3;
                                }
                                bveVar2 = bveVarC;
                                htq.b(uri, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                                affcVar2 = affcVar3;
                                cgfVar3 = cgfVar4;
                                cfuVar3 = cfuVar4;
                                csrVar3 = csrVar4;
                                f3 = f4;
                                ckeVar2 = ckeVar3;
                                heaVar3 = heaVar5;
                                heaVar4 = heaVar6;
                                cjlVar2 = cjlVar4;
                            } else {
                                bveVar2 = bveVarC;
                                bveVar2.s();
                                heaVar3 = heaVar;
                                heaVar4 = heaVar2;
                                affcVar2 = affcVar;
                                f3 = f2;
                                cgfVar3 = cgfVar2;
                                csrVar3 = csrVar2;
                                cfuVar3 = cfuVar2;
                                ckeVar2 = ckeVar;
                                cjlVar2 = cjlVar;
                            }
                            bxlVarJ = bveVar2.J();
                            if (bxlVarJ != null) {
                                bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                            }
                        }
                        i15 |= 100663296;
                        i20 = i3 & 512;
                        if (i20 != 0) {
                            i20 = i20;
                            i21 = i15 | 805306368;
                        } else {
                            if ((i & 805306368) != 0) {
                                if (true != bveVarC.C(cjlVar)) {
                                    i22 = 268435456;
                                } else {
                                    i22 = 536870912;
                                }
                                i15 |= i22;
                            }
                            i21 = i15;
                        }
                        i23 = i3 & 1024;
                        if (i23 != 0) {
                            i24 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (true != bveVarC.E(affcVar)) {
                                i25 = 2;
                            } else {
                                i25 = 4;
                            }
                            i24 = i2 | i25;
                        } else {
                            i24 = i2;
                        }
                        if ((306783379 & i21) == 306783378) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (bveVarC.I(z, i21 & 1)) {
                            if (i29 != 0) {
                                cgfVar4 = defpackage.cgf.e;
                                i26 = i8;
                            } else {
                                i26 = i8;
                                cgfVar4 = cgfVar2;
                            }
                            if (i6 != 0) {
                                cfuVar4 = defpackage.cfs.e;
                            } else {
                                cfuVar4 = cfuVar2;
                            }
                            if (i26 != 0) {
                                csrVar4 = defpackage.csq.b;
                            } else {
                                csrVar4 = csrVar2;
                            }
                            if (i10 != 0) {
                                f4 = 1.0f;
                                i27 = i13;
                            } else {
                                i27 = i13;
                                f4 = f2;
                            }
                            if (i27 != 0) {
                                ckeVar3 = null;
                            } else {
                                ckeVar3 = ckeVar;
                            }
                            if (i16 != 0) {
                                heaVar5 = null;
                            } else {
                                heaVar5 = heaVar;
                            }
                            if (i18 != 0) {
                                heaVar6 = null;
                            } else {
                                heaVar6 = heaVar2;
                            }
                            if (i20 != 0) {
                                cjlVar3 = null;
                            } else {
                                cjlVar3 = cjlVar;
                            }
                            if (i23 != 0) {
                                bwcVar2 = (defpackage.bwc) bveVarC;
                                objS2 = bwcVar2.S();
                                if (objS2 == defpackage.bvd.a) {
                                    objS2 = new lfs(0);
                                    bwcVar2.ad(objS2);
                                }
                                affcVar3 = (defpackage.affc) objS2;
                            } else {
                                affcVar3 = affcVar;
                            }
                            htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                            htbVarC.getClass();
                            android.net.Uri uri2 = gjvVar.b;
                            if ((i24 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                            if ((1879048192 & i21) == 536870912) {
                            }
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (!zE3 && !z3) {
                                defpackage.cjl cjlVar6 = cjlVar3;
                                objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar6, 11, (byte[]) null);
                                cjlVar4 = cjlVar6;
                                bwcVar.ad(objS);
                            } else {
                                defpackage.cjl cjlVar7 = cjlVar3;
                                objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar7, 11, (byte[]) null);
                                cjlVar4 = cjlVar7;
                                bwcVar.ad(objS);
                            }
                            bveVar2 = bveVarC;
                            htq.b(uri2, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                            affcVar2 = affcVar3;
                            cgfVar3 = cgfVar4;
                            cfuVar3 = cfuVar4;
                            csrVar3 = csrVar4;
                            f3 = f4;
                            ckeVar2 = ckeVar3;
                            heaVar3 = heaVar5;
                            heaVar4 = heaVar6;
                            cjlVar2 = cjlVar4;
                        } else {
                            bveVar2 = bveVarC;
                            bveVar2.s();
                            heaVar3 = heaVar;
                            heaVar4 = heaVar2;
                            affcVar2 = affcVar;
                            f3 = f2;
                            cgfVar3 = cgfVar2;
                            csrVar3 = csrVar2;
                            cfuVar3 = cfuVar2;
                            ckeVar2 = ckeVar;
                            cjlVar2 = cjlVar;
                        }
                        bxlVarJ = bveVar2.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                        }
                    }
                    i4 |= 1572864;
                    i15 = i4;
                    i16 = i3 & 128;
                    if (i16 != 0) {
                        i15 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if ((i & 16777216) == 0) {
                            zE = bveVarC.C(heaVar);
                        } else {
                            zE = bveVarC.E(heaVar);
                        }
                        if (true != zE) {
                            i17 = 4194304;
                        } else {
                            i17 = 8388608;
                        }
                        i15 |= i17;
                    }
                    i18 = i3 & 256;
                    if (i18 != 0) {
                        if ((i & 100663296) == 0) {
                            if ((i & 134217728) == 0) {
                                zE2 = bveVarC.C(heaVar2);
                            } else {
                                zE2 = bveVarC.E(heaVar2);
                            }
                            if (true != zE2) {
                                i19 = 33554432;
                            } else {
                                i19 = 67108864;
                            }
                            i15 |= i19;
                        }
                        i20 = i3 & 512;
                        if (i20 != 0) {
                            i20 = i20;
                            i21 = i15 | 805306368;
                        } else {
                            if ((i & 805306368) != 0) {
                                if (true != bveVarC.C(cjlVar)) {
                                    i22 = 268435456;
                                } else {
                                    i22 = 536870912;
                                }
                                i15 |= i22;
                            }
                            i21 = i15;
                        }
                        i23 = i3 & 1024;
                        if (i23 != 0) {
                            i24 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (true != bveVarC.E(affcVar)) {
                                i25 = 2;
                            } else {
                                i25 = 4;
                            }
                            i24 = i2 | i25;
                        } else {
                            i24 = i2;
                        }
                        if ((306783379 & i21) == 306783378) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (bveVarC.I(z, i21 & 1)) {
                            if (i29 != 0) {
                                cgfVar4 = defpackage.cgf.e;
                                i26 = i8;
                            } else {
                                i26 = i8;
                                cgfVar4 = cgfVar2;
                            }
                            if (i6 != 0) {
                                cfuVar4 = defpackage.cfs.e;
                            } else {
                                cfuVar4 = cfuVar2;
                            }
                            if (i26 != 0) {
                                csrVar4 = defpackage.csq.b;
                            } else {
                                csrVar4 = csrVar2;
                            }
                            if (i10 != 0) {
                                f4 = 1.0f;
                                i27 = i13;
                            } else {
                                i27 = i13;
                                f4 = f2;
                            }
                            if (i27 != 0) {
                                ckeVar3 = null;
                            } else {
                                ckeVar3 = ckeVar;
                            }
                            if (i16 != 0) {
                                heaVar5 = null;
                            } else {
                                heaVar5 = heaVar;
                            }
                            if (i18 != 0) {
                                heaVar6 = null;
                            } else {
                                heaVar6 = heaVar2;
                            }
                            if (i20 != 0) {
                                cjlVar3 = null;
                            } else {
                                cjlVar3 = cjlVar;
                            }
                            if (i23 != 0) {
                                bwcVar2 = (defpackage.bwc) bveVarC;
                                objS2 = bwcVar2.S();
                                if (objS2 == defpackage.bvd.a) {
                                    objS2 = new lfs(0);
                                    bwcVar2.ad(objS2);
                                }
                                affcVar3 = (defpackage.affc) objS2;
                            } else {
                                affcVar3 = affcVar;
                            }
                            htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                            htbVarC.getClass();
                            android.net.Uri uri3 = gjvVar.b;
                            if ((i24 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                            if ((1879048192 & i21) == 536870912) {
                            }
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (!zE3 && !z3) {
                                defpackage.cjl cjlVar8 = cjlVar3;
                                objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar8, 11, (byte[]) null);
                                cjlVar4 = cjlVar8;
                                bwcVar.ad(objS);
                            } else {
                                defpackage.cjl cjlVar9 = cjlVar3;
                                objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar9, 11, (byte[]) null);
                                cjlVar4 = cjlVar9;
                                bwcVar.ad(objS);
                            }
                            bveVar2 = bveVarC;
                            htq.b(uri3, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                            affcVar2 = affcVar3;
                            cgfVar3 = cgfVar4;
                            cfuVar3 = cfuVar4;
                            csrVar3 = csrVar4;
                            f3 = f4;
                            ckeVar2 = ckeVar3;
                            heaVar3 = heaVar5;
                            heaVar4 = heaVar6;
                            cjlVar2 = cjlVar4;
                        } else {
                            bveVar2 = bveVarC;
                            bveVar2.s();
                            heaVar3 = heaVar;
                            heaVar4 = heaVar2;
                            affcVar2 = affcVar;
                            f3 = f2;
                            cgfVar3 = cgfVar2;
                            csrVar3 = csrVar2;
                            cfuVar3 = cfuVar2;
                            ckeVar2 = ckeVar;
                            cjlVar2 = cjlVar;
                        }
                        bxlVarJ = bveVar2.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                        }
                    }
                    i15 |= 100663296;
                    i20 = i3 & 512;
                    if (i20 != 0) {
                        i20 = i20;
                        i21 = i15 | 805306368;
                    } else {
                        if ((i & 805306368) != 0) {
                            if (true != bveVarC.C(cjlVar)) {
                                i22 = 268435456;
                            } else {
                                i22 = 536870912;
                            }
                            i15 |= i22;
                        }
                        i21 = i15;
                    }
                    i23 = i3 & 1024;
                    if (i23 != 0) {
                        i24 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (true != bveVarC.E(affcVar)) {
                            i25 = 2;
                        } else {
                            i25 = 4;
                        }
                        i24 = i2 | i25;
                    } else {
                        i24 = i2;
                    }
                    if ((306783379 & i21) == 306783378) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (bveVarC.I(z, i21 & 1)) {
                        if (i29 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i26 = i8;
                        } else {
                            i26 = i8;
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            cfuVar4 = defpackage.cfs.e;
                        } else {
                            cfuVar4 = cfuVar2;
                        }
                        if (i26 != 0) {
                            csrVar4 = defpackage.csq.b;
                        } else {
                            csrVar4 = csrVar2;
                        }
                        if (i10 != 0) {
                            f4 = 1.0f;
                            i27 = i13;
                        } else {
                            i27 = i13;
                            f4 = f2;
                        }
                        if (i27 != 0) {
                            ckeVar3 = null;
                        } else {
                            ckeVar3 = ckeVar;
                        }
                        if (i16 != 0) {
                            heaVar5 = null;
                        } else {
                            heaVar5 = heaVar;
                        }
                        if (i18 != 0) {
                            heaVar6 = null;
                        } else {
                            heaVar6 = heaVar2;
                        }
                        if (i20 != 0) {
                            cjlVar3 = null;
                        } else {
                            cjlVar3 = cjlVar;
                        }
                        if (i23 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new lfs(0);
                                bwcVar2.ad(objS2);
                            }
                            affcVar3 = (defpackage.affc) objS2;
                        } else {
                            affcVar3 = affcVar;
                        }
                        htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                        htbVarC.getClass();
                        android.net.Uri uri4 = gjvVar.b;
                        if ((i24 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                        if ((1879048192 & i21) == 536870912) {
                        }
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (!zE3 && !z3) {
                            defpackage.cjl cjlVar10 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar10, 11, (byte[]) null);
                            cjlVar4 = cjlVar10;
                            bwcVar.ad(objS);
                        } else {
                            defpackage.cjl cjlVar11 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar11, 11, (byte[]) null);
                            cjlVar4 = cjlVar11;
                            bwcVar.ad(objS);
                        }
                        bveVar2 = bveVarC;
                        htq.b(uri4, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                        affcVar2 = affcVar3;
                        cgfVar3 = cgfVar4;
                        cfuVar3 = cfuVar4;
                        csrVar3 = csrVar4;
                        f3 = f4;
                        ckeVar2 = ckeVar3;
                        heaVar3 = heaVar5;
                        heaVar4 = heaVar6;
                        cjlVar2 = cjlVar4;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        heaVar3 = heaVar;
                        heaVar4 = heaVar2;
                        affcVar2 = affcVar;
                        f3 = f2;
                        cgfVar3 = cgfVar2;
                        csrVar3 = csrVar2;
                        cfuVar3 = cfuVar2;
                        ckeVar2 = ckeVar;
                        cjlVar2 = cjlVar;
                    }
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                    }
                }
                i4 |= 24576;
                csrVar2 = csrVar;
                i10 = i3 & 32;
                if (i10 != 0) {
                    i4 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    i11 = i4;
                    if ((i & 196608) == 0) {
                        if (true != bveVarC.z(f2)) {
                            i12 = 65536;
                        } else {
                            i12 = 131072;
                        }
                        i4 = i11 | i12;
                    }
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    if ((i & 1572864) == 0) {
                        int i31 = i4;
                        if (true != bveVarC.C(ckeVar)) {
                            i14 = 524288;
                        } else {
                            i14 = 1048576;
                        }
                        i15 = i31 | i14;
                    }
                    i16 = i3 & 128;
                    if (i16 != 0) {
                        i15 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if ((i & 16777216) == 0) {
                            zE = bveVarC.C(heaVar);
                        } else {
                            zE = bveVarC.E(heaVar);
                        }
                        if (true != zE) {
                            i17 = 4194304;
                        } else {
                            i17 = 8388608;
                        }
                        i15 |= i17;
                    }
                    i18 = i3 & 256;
                    if (i18 != 0) {
                        if ((i & 100663296) == 0) {
                            if ((i & 134217728) == 0) {
                                zE2 = bveVarC.C(heaVar2);
                            } else {
                                zE2 = bveVarC.E(heaVar2);
                            }
                            if (true != zE2) {
                                i19 = 33554432;
                            } else {
                                i19 = 67108864;
                            }
                            i15 |= i19;
                        }
                        i20 = i3 & 512;
                        if (i20 != 0) {
                            i20 = i20;
                            i21 = i15 | 805306368;
                        } else {
                            if ((i & 805306368) != 0) {
                                if (true != bveVarC.C(cjlVar)) {
                                    i22 = 268435456;
                                } else {
                                    i22 = 536870912;
                                }
                                i15 |= i22;
                            }
                            i21 = i15;
                        }
                        i23 = i3 & 1024;
                        if (i23 != 0) {
                            i24 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (true != bveVarC.E(affcVar)) {
                                i25 = 2;
                            } else {
                                i25 = 4;
                            }
                            i24 = i2 | i25;
                        } else {
                            i24 = i2;
                        }
                        if ((306783379 & i21) == 306783378) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (bveVarC.I(z, i21 & 1)) {
                            if (i29 != 0) {
                                cgfVar4 = defpackage.cgf.e;
                                i26 = i8;
                            } else {
                                i26 = i8;
                                cgfVar4 = cgfVar2;
                            }
                            if (i6 != 0) {
                                cfuVar4 = defpackage.cfs.e;
                            } else {
                                cfuVar4 = cfuVar2;
                            }
                            if (i26 != 0) {
                                csrVar4 = defpackage.csq.b;
                            } else {
                                csrVar4 = csrVar2;
                            }
                            if (i10 != 0) {
                                f4 = 1.0f;
                                i27 = i13;
                            } else {
                                i27 = i13;
                                f4 = f2;
                            }
                            if (i27 != 0) {
                                ckeVar3 = null;
                            } else {
                                ckeVar3 = ckeVar;
                            }
                            if (i16 != 0) {
                                heaVar5 = null;
                            } else {
                                heaVar5 = heaVar;
                            }
                            if (i18 != 0) {
                                heaVar6 = null;
                            } else {
                                heaVar6 = heaVar2;
                            }
                            if (i20 != 0) {
                                cjlVar3 = null;
                            } else {
                                cjlVar3 = cjlVar;
                            }
                            if (i23 != 0) {
                                bwcVar2 = (defpackage.bwc) bveVarC;
                                objS2 = bwcVar2.S();
                                if (objS2 == defpackage.bvd.a) {
                                    objS2 = new lfs(0);
                                    bwcVar2.ad(objS2);
                                }
                                affcVar3 = (defpackage.affc) objS2;
                            } else {
                                affcVar3 = affcVar;
                            }
                            htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                            htbVarC.getClass();
                            android.net.Uri uri5 = gjvVar.b;
                            if ((i24 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                            if ((1879048192 & i21) == 536870912) {
                            }
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (!zE3 && !z3) {
                                defpackage.cjl cjlVar12 = cjlVar3;
                                objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar12, 11, (byte[]) null);
                                cjlVar4 = cjlVar12;
                                bwcVar.ad(objS);
                            } else {
                                defpackage.cjl cjlVar13 = cjlVar3;
                                objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar13, 11, (byte[]) null);
                                cjlVar4 = cjlVar13;
                                bwcVar.ad(objS);
                            }
                            bveVar2 = bveVarC;
                            htq.b(uri5, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                            affcVar2 = affcVar3;
                            cgfVar3 = cgfVar4;
                            cfuVar3 = cfuVar4;
                            csrVar3 = csrVar4;
                            f3 = f4;
                            ckeVar2 = ckeVar3;
                            heaVar3 = heaVar5;
                            heaVar4 = heaVar6;
                            cjlVar2 = cjlVar4;
                        } else {
                            bveVar2 = bveVarC;
                            bveVar2.s();
                            heaVar3 = heaVar;
                            heaVar4 = heaVar2;
                            affcVar2 = affcVar;
                            f3 = f2;
                            cgfVar3 = cgfVar2;
                            csrVar3 = csrVar2;
                            cfuVar3 = cfuVar2;
                            ckeVar2 = ckeVar;
                            cjlVar2 = cjlVar;
                        }
                        bxlVarJ = bveVar2.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                        }
                    }
                    i15 |= 100663296;
                    i20 = i3 & 512;
                    if (i20 != 0) {
                        i20 = i20;
                        i21 = i15 | 805306368;
                    } else {
                        if ((i & 805306368) != 0) {
                            if (true != bveVarC.C(cjlVar)) {
                                i22 = 268435456;
                            } else {
                                i22 = 536870912;
                            }
                            i15 |= i22;
                        }
                        i21 = i15;
                    }
                    i23 = i3 & 1024;
                    if (i23 != 0) {
                        i24 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (true != bveVarC.E(affcVar)) {
                            i25 = 2;
                        } else {
                            i25 = 4;
                        }
                        i24 = i2 | i25;
                    } else {
                        i24 = i2;
                    }
                    if ((306783379 & i21) == 306783378) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (bveVarC.I(z, i21 & 1)) {
                        if (i29 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i26 = i8;
                        } else {
                            i26 = i8;
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            cfuVar4 = defpackage.cfs.e;
                        } else {
                            cfuVar4 = cfuVar2;
                        }
                        if (i26 != 0) {
                            csrVar4 = defpackage.csq.b;
                        } else {
                            csrVar4 = csrVar2;
                        }
                        if (i10 != 0) {
                            f4 = 1.0f;
                            i27 = i13;
                        } else {
                            i27 = i13;
                            f4 = f2;
                        }
                        if (i27 != 0) {
                            ckeVar3 = null;
                        } else {
                            ckeVar3 = ckeVar;
                        }
                        if (i16 != 0) {
                            heaVar5 = null;
                        } else {
                            heaVar5 = heaVar;
                        }
                        if (i18 != 0) {
                            heaVar6 = null;
                        } else {
                            heaVar6 = heaVar2;
                        }
                        if (i20 != 0) {
                            cjlVar3 = null;
                        } else {
                            cjlVar3 = cjlVar;
                        }
                        if (i23 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new lfs(0);
                                bwcVar2.ad(objS2);
                            }
                            affcVar3 = (defpackage.affc) objS2;
                        } else {
                            affcVar3 = affcVar;
                        }
                        htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                        htbVarC.getClass();
                        android.net.Uri uri6 = gjvVar.b;
                        if ((i24 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                        if ((1879048192 & i21) == 536870912) {
                        }
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (!zE3 && !z3) {
                            defpackage.cjl cjlVar14 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar14, 11, (byte[]) null);
                            cjlVar4 = cjlVar14;
                            bwcVar.ad(objS);
                        } else {
                            defpackage.cjl cjlVar15 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar15, 11, (byte[]) null);
                            cjlVar4 = cjlVar15;
                            bwcVar.ad(objS);
                        }
                        bveVar2 = bveVarC;
                        htq.b(uri6, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                        affcVar2 = affcVar3;
                        cgfVar3 = cgfVar4;
                        cfuVar3 = cfuVar4;
                        csrVar3 = csrVar4;
                        f3 = f4;
                        ckeVar2 = ckeVar3;
                        heaVar3 = heaVar5;
                        heaVar4 = heaVar6;
                        cjlVar2 = cjlVar4;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        heaVar3 = heaVar;
                        heaVar4 = heaVar2;
                        affcVar2 = affcVar;
                        f3 = f2;
                        cgfVar3 = cgfVar2;
                        csrVar3 = csrVar2;
                        cfuVar3 = cfuVar2;
                        ckeVar2 = ckeVar;
                        cjlVar2 = cjlVar;
                    }
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                    }
                }
                i4 |= 1572864;
                i15 = i4;
                i16 = i3 & 128;
                if (i16 != 0) {
                    i15 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if ((i & 16777216) == 0) {
                        zE = bveVarC.C(heaVar);
                    } else {
                        zE = bveVarC.E(heaVar);
                    }
                    if (true != zE) {
                        i17 = 4194304;
                    } else {
                        i17 = 8388608;
                    }
                    i15 |= i17;
                }
                i18 = i3 & 256;
                if (i18 != 0) {
                    if ((i & 100663296) == 0) {
                        if ((i & 134217728) == 0) {
                            zE2 = bveVarC.C(heaVar2);
                        } else {
                            zE2 = bveVarC.E(heaVar2);
                        }
                        if (true != zE2) {
                            i19 = 33554432;
                        } else {
                            i19 = 67108864;
                        }
                        i15 |= i19;
                    }
                    i20 = i3 & 512;
                    if (i20 != 0) {
                        i20 = i20;
                        i21 = i15 | 805306368;
                    } else {
                        if ((i & 805306368) != 0) {
                            if (true != bveVarC.C(cjlVar)) {
                                i22 = 268435456;
                            } else {
                                i22 = 536870912;
                            }
                            i15 |= i22;
                        }
                        i21 = i15;
                    }
                    i23 = i3 & 1024;
                    if (i23 != 0) {
                        i24 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (true != bveVarC.E(affcVar)) {
                            i25 = 2;
                        } else {
                            i25 = 4;
                        }
                        i24 = i2 | i25;
                    } else {
                        i24 = i2;
                    }
                    if ((306783379 & i21) == 306783378) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (bveVarC.I(z, i21 & 1)) {
                        if (i29 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i26 = i8;
                        } else {
                            i26 = i8;
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            cfuVar4 = defpackage.cfs.e;
                        } else {
                            cfuVar4 = cfuVar2;
                        }
                        if (i26 != 0) {
                            csrVar4 = defpackage.csq.b;
                        } else {
                            csrVar4 = csrVar2;
                        }
                        if (i10 != 0) {
                            f4 = 1.0f;
                            i27 = i13;
                        } else {
                            i27 = i13;
                            f4 = f2;
                        }
                        if (i27 != 0) {
                            ckeVar3 = null;
                        } else {
                            ckeVar3 = ckeVar;
                        }
                        if (i16 != 0) {
                            heaVar5 = null;
                        } else {
                            heaVar5 = heaVar;
                        }
                        if (i18 != 0) {
                            heaVar6 = null;
                        } else {
                            heaVar6 = heaVar2;
                        }
                        if (i20 != 0) {
                            cjlVar3 = null;
                        } else {
                            cjlVar3 = cjlVar;
                        }
                        if (i23 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new lfs(0);
                                bwcVar2.ad(objS2);
                            }
                            affcVar3 = (defpackage.affc) objS2;
                        } else {
                            affcVar3 = affcVar;
                        }
                        htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                        htbVarC.getClass();
                        android.net.Uri uri7 = gjvVar.b;
                        if ((i24 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                        if ((1879048192 & i21) == 536870912) {
                        }
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (!zE3 && !z3) {
                            defpackage.cjl cjlVar16 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar16, 11, (byte[]) null);
                            cjlVar4 = cjlVar16;
                            bwcVar.ad(objS);
                        } else {
                            defpackage.cjl cjlVar17 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar17, 11, (byte[]) null);
                            cjlVar4 = cjlVar17;
                            bwcVar.ad(objS);
                        }
                        bveVar2 = bveVarC;
                        htq.b(uri7, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                        affcVar2 = affcVar3;
                        cgfVar3 = cgfVar4;
                        cfuVar3 = cfuVar4;
                        csrVar3 = csrVar4;
                        f3 = f4;
                        ckeVar2 = ckeVar3;
                        heaVar3 = heaVar5;
                        heaVar4 = heaVar6;
                        cjlVar2 = cjlVar4;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        heaVar3 = heaVar;
                        heaVar4 = heaVar2;
                        affcVar2 = affcVar;
                        f3 = f2;
                        cgfVar3 = cgfVar2;
                        csrVar3 = csrVar2;
                        cfuVar3 = cfuVar2;
                        ckeVar2 = ckeVar;
                        cjlVar2 = cjlVar;
                    }
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                    }
                }
                i15 |= 100663296;
                i20 = i3 & 512;
                if (i20 != 0) {
                    i20 = i20;
                    i21 = i15 | 805306368;
                } else {
                    if ((i & 805306368) != 0) {
                        if (true != bveVarC.C(cjlVar)) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i15 |= i22;
                    }
                    i21 = i15;
                }
                i23 = i3 & 1024;
                if (i23 != 0) {
                    i24 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (true != bveVarC.E(affcVar)) {
                        i25 = 2;
                    } else {
                        i25 = 4;
                    }
                    i24 = i2 | i25;
                } else {
                    i24 = i2;
                }
                if ((306783379 & i21) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (bveVarC.I(z, i21 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i26 = i8;
                    } else {
                        i26 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i26 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i10 != 0) {
                        f4 = 1.0f;
                        i27 = i13;
                    } else {
                        i27 = i13;
                        f4 = f2;
                    }
                    if (i27 != 0) {
                        ckeVar3 = null;
                    } else {
                        ckeVar3 = ckeVar;
                    }
                    if (i16 != 0) {
                        heaVar5 = null;
                    } else {
                        heaVar5 = heaVar;
                    }
                    if (i18 != 0) {
                        heaVar6 = null;
                    } else {
                        heaVar6 = heaVar2;
                    }
                    if (i20 != 0) {
                        cjlVar3 = null;
                    } else {
                        cjlVar3 = cjlVar;
                    }
                    if (i23 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new lfs(0);
                            bwcVar2.ad(objS2);
                        }
                        affcVar3 = (defpackage.affc) objS2;
                    } else {
                        affcVar3 = affcVar;
                    }
                    htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                    htbVarC.getClass();
                    android.net.Uri uri8 = gjvVar.b;
                    if ((i24 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                    if ((1879048192 & i21) == 536870912) {
                    }
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (!zE3 && !z3) {
                        defpackage.cjl cjlVar18 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar18, 11, (byte[]) null);
                        cjlVar4 = cjlVar18;
                        bwcVar.ad(objS);
                    } else {
                        defpackage.cjl cjlVar19 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar19, 11, (byte[]) null);
                        cjlVar4 = cjlVar19;
                        bwcVar.ad(objS);
                    }
                    bveVar2 = bveVarC;
                    htq.b(uri8, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                    affcVar2 = affcVar3;
                    cgfVar3 = cgfVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    f3 = f4;
                    ckeVar2 = ckeVar3;
                    heaVar3 = heaVar5;
                    heaVar4 = heaVar6;
                    cjlVar2 = cjlVar4;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    heaVar3 = heaVar;
                    heaVar4 = heaVar2;
                    affcVar2 = affcVar;
                    f3 = f2;
                    cgfVar3 = cgfVar2;
                    csrVar3 = csrVar2;
                    cfuVar3 = cfuVar2;
                    ckeVar2 = ckeVar;
                    cjlVar2 = cjlVar;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                }
            }
            i4 |= 3072;
            cfuVar2 = cfuVar;
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    csrVar2 = csrVar;
                    if (true != bveVarC.C(csrVar2)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                    i4 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    i11 = i4;
                    if ((i & 196608) == 0) {
                        if (true != bveVarC.z(f2)) {
                            i12 = 65536;
                        } else {
                            i12 = 131072;
                        }
                        i4 = i11 | i12;
                    }
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    if ((i & 1572864) == 0) {
                        int i32 = i4;
                        if (true != bveVarC.C(ckeVar)) {
                            i14 = 524288;
                        } else {
                            i14 = 1048576;
                        }
                        i15 = i32 | i14;
                    }
                    i16 = i3 & 128;
                    if (i16 != 0) {
                        i15 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if ((i & 16777216) == 0) {
                            zE = bveVarC.C(heaVar);
                        } else {
                            zE = bveVarC.E(heaVar);
                        }
                        if (true != zE) {
                            i17 = 4194304;
                        } else {
                            i17 = 8388608;
                        }
                        i15 |= i17;
                    }
                    i18 = i3 & 256;
                    if (i18 != 0) {
                        if ((i & 100663296) == 0) {
                            if ((i & 134217728) == 0) {
                                zE2 = bveVarC.C(heaVar2);
                            } else {
                                zE2 = bveVarC.E(heaVar2);
                            }
                            if (true != zE2) {
                                i19 = 33554432;
                            } else {
                                i19 = 67108864;
                            }
                            i15 |= i19;
                        }
                        i20 = i3 & 512;
                        if (i20 != 0) {
                            i20 = i20;
                            i21 = i15 | 805306368;
                        } else {
                            if ((i & 805306368) != 0) {
                                if (true != bveVarC.C(cjlVar)) {
                                    i22 = 268435456;
                                } else {
                                    i22 = 536870912;
                                }
                                i15 |= i22;
                            }
                            i21 = i15;
                        }
                        i23 = i3 & 1024;
                        if (i23 != 0) {
                            i24 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (true != bveVarC.E(affcVar)) {
                                i25 = 2;
                            } else {
                                i25 = 4;
                            }
                            i24 = i2 | i25;
                        } else {
                            i24 = i2;
                        }
                        if ((306783379 & i21) == 306783378) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (bveVarC.I(z, i21 & 1)) {
                            if (i29 != 0) {
                                cgfVar4 = defpackage.cgf.e;
                                i26 = i8;
                            } else {
                                i26 = i8;
                                cgfVar4 = cgfVar2;
                            }
                            if (i6 != 0) {
                                cfuVar4 = defpackage.cfs.e;
                            } else {
                                cfuVar4 = cfuVar2;
                            }
                            if (i26 != 0) {
                                csrVar4 = defpackage.csq.b;
                            } else {
                                csrVar4 = csrVar2;
                            }
                            if (i10 != 0) {
                                f4 = 1.0f;
                                i27 = i13;
                            } else {
                                i27 = i13;
                                f4 = f2;
                            }
                            if (i27 != 0) {
                                ckeVar3 = null;
                            } else {
                                ckeVar3 = ckeVar;
                            }
                            if (i16 != 0) {
                                heaVar5 = null;
                            } else {
                                heaVar5 = heaVar;
                            }
                            if (i18 != 0) {
                                heaVar6 = null;
                            } else {
                                heaVar6 = heaVar2;
                            }
                            if (i20 != 0) {
                                cjlVar3 = null;
                            } else {
                                cjlVar3 = cjlVar;
                            }
                            if (i23 != 0) {
                                bwcVar2 = (defpackage.bwc) bveVarC;
                                objS2 = bwcVar2.S();
                                if (objS2 == defpackage.bvd.a) {
                                    objS2 = new lfs(0);
                                    bwcVar2.ad(objS2);
                                }
                                affcVar3 = (defpackage.affc) objS2;
                            } else {
                                affcVar3 = affcVar;
                            }
                            htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                            htbVarC.getClass();
                            android.net.Uri uri9 = gjvVar.b;
                            if ((i24 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                            if ((1879048192 & i21) == 536870912) {
                            }
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (!zE3 && !z3) {
                                defpackage.cjl cjlVar110 = cjlVar3;
                                objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar110, 11, (byte[]) null);
                                cjlVar4 = cjlVar110;
                                bwcVar.ad(objS);
                            } else {
                                defpackage.cjl cjlVar111 = cjlVar3;
                                objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar111, 11, (byte[]) null);
                                cjlVar4 = cjlVar111;
                                bwcVar.ad(objS);
                            }
                            bveVar2 = bveVarC;
                            htq.b(uri9, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                            affcVar2 = affcVar3;
                            cgfVar3 = cgfVar4;
                            cfuVar3 = cfuVar4;
                            csrVar3 = csrVar4;
                            f3 = f4;
                            ckeVar2 = ckeVar3;
                            heaVar3 = heaVar5;
                            heaVar4 = heaVar6;
                            cjlVar2 = cjlVar4;
                        } else {
                            bveVar2 = bveVarC;
                            bveVar2.s();
                            heaVar3 = heaVar;
                            heaVar4 = heaVar2;
                            affcVar2 = affcVar;
                            f3 = f2;
                            cgfVar3 = cgfVar2;
                            csrVar3 = csrVar2;
                            cfuVar3 = cfuVar2;
                            ckeVar2 = ckeVar;
                            cjlVar2 = cjlVar;
                        }
                        bxlVarJ = bveVar2.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                        }
                    }
                    i15 |= 100663296;
                    i20 = i3 & 512;
                    if (i20 != 0) {
                        i20 = i20;
                        i21 = i15 | 805306368;
                    } else {
                        if ((i & 805306368) != 0) {
                            if (true != bveVarC.C(cjlVar)) {
                                i22 = 268435456;
                            } else {
                                i22 = 536870912;
                            }
                            i15 |= i22;
                        }
                        i21 = i15;
                    }
                    i23 = i3 & 1024;
                    if (i23 != 0) {
                        i24 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (true != bveVarC.E(affcVar)) {
                            i25 = 2;
                        } else {
                            i25 = 4;
                        }
                        i24 = i2 | i25;
                    } else {
                        i24 = i2;
                    }
                    if ((306783379 & i21) == 306783378) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (bveVarC.I(z, i21 & 1)) {
                        if (i29 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i26 = i8;
                        } else {
                            i26 = i8;
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            cfuVar4 = defpackage.cfs.e;
                        } else {
                            cfuVar4 = cfuVar2;
                        }
                        if (i26 != 0) {
                            csrVar4 = defpackage.csq.b;
                        } else {
                            csrVar4 = csrVar2;
                        }
                        if (i10 != 0) {
                            f4 = 1.0f;
                            i27 = i13;
                        } else {
                            i27 = i13;
                            f4 = f2;
                        }
                        if (i27 != 0) {
                            ckeVar3 = null;
                        } else {
                            ckeVar3 = ckeVar;
                        }
                        if (i16 != 0) {
                            heaVar5 = null;
                        } else {
                            heaVar5 = heaVar;
                        }
                        if (i18 != 0) {
                            heaVar6 = null;
                        } else {
                            heaVar6 = heaVar2;
                        }
                        if (i20 != 0) {
                            cjlVar3 = null;
                        } else {
                            cjlVar3 = cjlVar;
                        }
                        if (i23 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new lfs(0);
                                bwcVar2.ad(objS2);
                            }
                            affcVar3 = (defpackage.affc) objS2;
                        } else {
                            affcVar3 = affcVar;
                        }
                        htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                        htbVarC.getClass();
                        android.net.Uri uri10 = gjvVar.b;
                        if ((i24 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                        if ((1879048192 & i21) == 536870912) {
                        }
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (!zE3 && !z3) {
                            defpackage.cjl cjlVar112 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar112, 11, (byte[]) null);
                            cjlVar4 = cjlVar112;
                            bwcVar.ad(objS);
                        } else {
                            defpackage.cjl cjlVar113 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar113, 11, (byte[]) null);
                            cjlVar4 = cjlVar113;
                            bwcVar.ad(objS);
                        }
                        bveVar2 = bveVarC;
                        htq.b(uri10, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                        affcVar2 = affcVar3;
                        cgfVar3 = cgfVar4;
                        cfuVar3 = cfuVar4;
                        csrVar3 = csrVar4;
                        f3 = f4;
                        ckeVar2 = ckeVar3;
                        heaVar3 = heaVar5;
                        heaVar4 = heaVar6;
                        cjlVar2 = cjlVar4;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        heaVar3 = heaVar;
                        heaVar4 = heaVar2;
                        affcVar2 = affcVar;
                        f3 = f2;
                        cgfVar3 = cgfVar2;
                        csrVar3 = csrVar2;
                        cfuVar3 = cfuVar2;
                        ckeVar2 = ckeVar;
                        cjlVar2 = cjlVar;
                    }
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                    }
                }
                i4 |= 1572864;
                i15 = i4;
                i16 = i3 & 128;
                if (i16 != 0) {
                    i15 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if ((i & 16777216) == 0) {
                        zE = bveVarC.C(heaVar);
                    } else {
                        zE = bveVarC.E(heaVar);
                    }
                    if (true != zE) {
                        i17 = 4194304;
                    } else {
                        i17 = 8388608;
                    }
                    i15 |= i17;
                }
                i18 = i3 & 256;
                if (i18 != 0) {
                    if ((i & 100663296) == 0) {
                        if ((i & 134217728) == 0) {
                            zE2 = bveVarC.C(heaVar2);
                        } else {
                            zE2 = bveVarC.E(heaVar2);
                        }
                        if (true != zE2) {
                            i19 = 33554432;
                        } else {
                            i19 = 67108864;
                        }
                        i15 |= i19;
                    }
                    i20 = i3 & 512;
                    if (i20 != 0) {
                        i20 = i20;
                        i21 = i15 | 805306368;
                    } else {
                        if ((i & 805306368) != 0) {
                            if (true != bveVarC.C(cjlVar)) {
                                i22 = 268435456;
                            } else {
                                i22 = 536870912;
                            }
                            i15 |= i22;
                        }
                        i21 = i15;
                    }
                    i23 = i3 & 1024;
                    if (i23 != 0) {
                        i24 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (true != bveVarC.E(affcVar)) {
                            i25 = 2;
                        } else {
                            i25 = 4;
                        }
                        i24 = i2 | i25;
                    } else {
                        i24 = i2;
                    }
                    if ((306783379 & i21) == 306783378) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (bveVarC.I(z, i21 & 1)) {
                        if (i29 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i26 = i8;
                        } else {
                            i26 = i8;
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            cfuVar4 = defpackage.cfs.e;
                        } else {
                            cfuVar4 = cfuVar2;
                        }
                        if (i26 != 0) {
                            csrVar4 = defpackage.csq.b;
                        } else {
                            csrVar4 = csrVar2;
                        }
                        if (i10 != 0) {
                            f4 = 1.0f;
                            i27 = i13;
                        } else {
                            i27 = i13;
                            f4 = f2;
                        }
                        if (i27 != 0) {
                            ckeVar3 = null;
                        } else {
                            ckeVar3 = ckeVar;
                        }
                        if (i16 != 0) {
                            heaVar5 = null;
                        } else {
                            heaVar5 = heaVar;
                        }
                        if (i18 != 0) {
                            heaVar6 = null;
                        } else {
                            heaVar6 = heaVar2;
                        }
                        if (i20 != 0) {
                            cjlVar3 = null;
                        } else {
                            cjlVar3 = cjlVar;
                        }
                        if (i23 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new lfs(0);
                                bwcVar2.ad(objS2);
                            }
                            affcVar3 = (defpackage.affc) objS2;
                        } else {
                            affcVar3 = affcVar;
                        }
                        htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                        htbVarC.getClass();
                        android.net.Uri uri11 = gjvVar.b;
                        if ((i24 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                        if ((1879048192 & i21) == 536870912) {
                        }
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (!zE3 && !z3) {
                            defpackage.cjl cjlVar114 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar114, 11, (byte[]) null);
                            cjlVar4 = cjlVar114;
                            bwcVar.ad(objS);
                        } else {
                            defpackage.cjl cjlVar115 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar115, 11, (byte[]) null);
                            cjlVar4 = cjlVar115;
                            bwcVar.ad(objS);
                        }
                        bveVar2 = bveVarC;
                        htq.b(uri11, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                        affcVar2 = affcVar3;
                        cgfVar3 = cgfVar4;
                        cfuVar3 = cfuVar4;
                        csrVar3 = csrVar4;
                        f3 = f4;
                        ckeVar2 = ckeVar3;
                        heaVar3 = heaVar5;
                        heaVar4 = heaVar6;
                        cjlVar2 = cjlVar4;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        heaVar3 = heaVar;
                        heaVar4 = heaVar2;
                        affcVar2 = affcVar;
                        f3 = f2;
                        cgfVar3 = cgfVar2;
                        csrVar3 = csrVar2;
                        cfuVar3 = cfuVar2;
                        ckeVar2 = ckeVar;
                        cjlVar2 = cjlVar;
                    }
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                    }
                }
                i15 |= 100663296;
                i20 = i3 & 512;
                if (i20 != 0) {
                    i20 = i20;
                    i21 = i15 | 805306368;
                } else {
                    if ((i & 805306368) != 0) {
                        if (true != bveVarC.C(cjlVar)) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i15 |= i22;
                    }
                    i21 = i15;
                }
                i23 = i3 & 1024;
                if (i23 != 0) {
                    i24 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (true != bveVarC.E(affcVar)) {
                        i25 = 2;
                    } else {
                        i25 = 4;
                    }
                    i24 = i2 | i25;
                } else {
                    i24 = i2;
                }
                if ((306783379 & i21) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (bveVarC.I(z, i21 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i26 = i8;
                    } else {
                        i26 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i26 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i10 != 0) {
                        f4 = 1.0f;
                        i27 = i13;
                    } else {
                        i27 = i13;
                        f4 = f2;
                    }
                    if (i27 != 0) {
                        ckeVar3 = null;
                    } else {
                        ckeVar3 = ckeVar;
                    }
                    if (i16 != 0) {
                        heaVar5 = null;
                    } else {
                        heaVar5 = heaVar;
                    }
                    if (i18 != 0) {
                        heaVar6 = null;
                    } else {
                        heaVar6 = heaVar2;
                    }
                    if (i20 != 0) {
                        cjlVar3 = null;
                    } else {
                        cjlVar3 = cjlVar;
                    }
                    if (i23 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new lfs(0);
                            bwcVar2.ad(objS2);
                        }
                        affcVar3 = (defpackage.affc) objS2;
                    } else {
                        affcVar3 = affcVar;
                    }
                    htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                    htbVarC.getClass();
                    android.net.Uri uri12 = gjvVar.b;
                    if ((i24 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                    if ((1879048192 & i21) == 536870912) {
                    }
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (!zE3 && !z3) {
                        defpackage.cjl cjlVar116 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar116, 11, (byte[]) null);
                        cjlVar4 = cjlVar116;
                        bwcVar.ad(objS);
                    } else {
                        defpackage.cjl cjlVar117 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar117, 11, (byte[]) null);
                        cjlVar4 = cjlVar117;
                        bwcVar.ad(objS);
                    }
                    bveVar2 = bveVarC;
                    htq.b(uri12, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                    affcVar2 = affcVar3;
                    cgfVar3 = cgfVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    f3 = f4;
                    ckeVar2 = ckeVar3;
                    heaVar3 = heaVar5;
                    heaVar4 = heaVar6;
                    cjlVar2 = cjlVar4;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    heaVar3 = heaVar;
                    heaVar4 = heaVar2;
                    affcVar2 = affcVar;
                    f3 = f2;
                    cgfVar3 = cgfVar2;
                    csrVar3 = csrVar2;
                    cfuVar3 = cfuVar2;
                    ckeVar2 = ckeVar;
                    cjlVar2 = cjlVar;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                }
            }
            i4 |= 24576;
            csrVar2 = csrVar;
            i10 = i3 & 32;
            if (i10 != 0) {
                i4 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                i11 = i4;
                if ((i & 196608) == 0) {
                    if (true != bveVarC.z(f2)) {
                        i12 = 65536;
                    } else {
                        i12 = 131072;
                    }
                    i4 = i11 | i12;
                }
            }
            i13 = i3 & 64;
            if (i13 != 0) {
                if ((i & 1572864) == 0) {
                    int i33 = i4;
                    if (true != bveVarC.C(ckeVar)) {
                        i14 = 524288;
                    } else {
                        i14 = 1048576;
                    }
                    i15 = i33 | i14;
                }
                i16 = i3 & 128;
                if (i16 != 0) {
                    i15 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if ((i & 16777216) == 0) {
                        zE = bveVarC.C(heaVar);
                    } else {
                        zE = bveVarC.E(heaVar);
                    }
                    if (true != zE) {
                        i17 = 4194304;
                    } else {
                        i17 = 8388608;
                    }
                    i15 |= i17;
                }
                i18 = i3 & 256;
                if (i18 != 0) {
                    if ((i & 100663296) == 0) {
                        if ((i & 134217728) == 0) {
                            zE2 = bveVarC.C(heaVar2);
                        } else {
                            zE2 = bveVarC.E(heaVar2);
                        }
                        if (true != zE2) {
                            i19 = 33554432;
                        } else {
                            i19 = 67108864;
                        }
                        i15 |= i19;
                    }
                    i20 = i3 & 512;
                    if (i20 != 0) {
                        i20 = i20;
                        i21 = i15 | 805306368;
                    } else {
                        if ((i & 805306368) != 0) {
                            if (true != bveVarC.C(cjlVar)) {
                                i22 = 268435456;
                            } else {
                                i22 = 536870912;
                            }
                            i15 |= i22;
                        }
                        i21 = i15;
                    }
                    i23 = i3 & 1024;
                    if (i23 != 0) {
                        i24 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (true != bveVarC.E(affcVar)) {
                            i25 = 2;
                        } else {
                            i25 = 4;
                        }
                        i24 = i2 | i25;
                    } else {
                        i24 = i2;
                    }
                    if ((306783379 & i21) == 306783378) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (bveVarC.I(z, i21 & 1)) {
                        if (i29 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i26 = i8;
                        } else {
                            i26 = i8;
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            cfuVar4 = defpackage.cfs.e;
                        } else {
                            cfuVar4 = cfuVar2;
                        }
                        if (i26 != 0) {
                            csrVar4 = defpackage.csq.b;
                        } else {
                            csrVar4 = csrVar2;
                        }
                        if (i10 != 0) {
                            f4 = 1.0f;
                            i27 = i13;
                        } else {
                            i27 = i13;
                            f4 = f2;
                        }
                        if (i27 != 0) {
                            ckeVar3 = null;
                        } else {
                            ckeVar3 = ckeVar;
                        }
                        if (i16 != 0) {
                            heaVar5 = null;
                        } else {
                            heaVar5 = heaVar;
                        }
                        if (i18 != 0) {
                            heaVar6 = null;
                        } else {
                            heaVar6 = heaVar2;
                        }
                        if (i20 != 0) {
                            cjlVar3 = null;
                        } else {
                            cjlVar3 = cjlVar;
                        }
                        if (i23 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new lfs(0);
                                bwcVar2.ad(objS2);
                            }
                            affcVar3 = (defpackage.affc) objS2;
                        } else {
                            affcVar3 = affcVar;
                        }
                        htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                        htbVarC.getClass();
                        android.net.Uri uri13 = gjvVar.b;
                        if ((i24 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                        if ((1879048192 & i21) == 536870912) {
                        }
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (!zE3 && !z3) {
                            defpackage.cjl cjlVar118 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar118, 11, (byte[]) null);
                            cjlVar4 = cjlVar118;
                            bwcVar.ad(objS);
                        } else {
                            defpackage.cjl cjlVar119 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar119, 11, (byte[]) null);
                            cjlVar4 = cjlVar119;
                            bwcVar.ad(objS);
                        }
                        bveVar2 = bveVarC;
                        htq.b(uri13, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                        affcVar2 = affcVar3;
                        cgfVar3 = cgfVar4;
                        cfuVar3 = cfuVar4;
                        csrVar3 = csrVar4;
                        f3 = f4;
                        ckeVar2 = ckeVar3;
                        heaVar3 = heaVar5;
                        heaVar4 = heaVar6;
                        cjlVar2 = cjlVar4;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        heaVar3 = heaVar;
                        heaVar4 = heaVar2;
                        affcVar2 = affcVar;
                        f3 = f2;
                        cgfVar3 = cgfVar2;
                        csrVar3 = csrVar2;
                        cfuVar3 = cfuVar2;
                        ckeVar2 = ckeVar;
                        cjlVar2 = cjlVar;
                    }
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                    }
                }
                i15 |= 100663296;
                i20 = i3 & 512;
                if (i20 != 0) {
                    i20 = i20;
                    i21 = i15 | 805306368;
                } else {
                    if ((i & 805306368) != 0) {
                        if (true != bveVarC.C(cjlVar)) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i15 |= i22;
                    }
                    i21 = i15;
                }
                i23 = i3 & 1024;
                if (i23 != 0) {
                    i24 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (true != bveVarC.E(affcVar)) {
                        i25 = 2;
                    } else {
                        i25 = 4;
                    }
                    i24 = i2 | i25;
                } else {
                    i24 = i2;
                }
                if ((306783379 & i21) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (bveVarC.I(z, i21 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i26 = i8;
                    } else {
                        i26 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i26 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i10 != 0) {
                        f4 = 1.0f;
                        i27 = i13;
                    } else {
                        i27 = i13;
                        f4 = f2;
                    }
                    if (i27 != 0) {
                        ckeVar3 = null;
                    } else {
                        ckeVar3 = ckeVar;
                    }
                    if (i16 != 0) {
                        heaVar5 = null;
                    } else {
                        heaVar5 = heaVar;
                    }
                    if (i18 != 0) {
                        heaVar6 = null;
                    } else {
                        heaVar6 = heaVar2;
                    }
                    if (i20 != 0) {
                        cjlVar3 = null;
                    } else {
                        cjlVar3 = cjlVar;
                    }
                    if (i23 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new lfs(0);
                            bwcVar2.ad(objS2);
                        }
                        affcVar3 = (defpackage.affc) objS2;
                    } else {
                        affcVar3 = affcVar;
                    }
                    htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                    htbVarC.getClass();
                    android.net.Uri uri14 = gjvVar.b;
                    if ((i24 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                    if ((1879048192 & i21) == 536870912) {
                    }
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (!zE3 && !z3) {
                        defpackage.cjl cjlVar1110 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1110, 11, (byte[]) null);
                        cjlVar4 = cjlVar1110;
                        bwcVar.ad(objS);
                    } else {
                        defpackage.cjl cjlVar1111 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1111, 11, (byte[]) null);
                        cjlVar4 = cjlVar1111;
                        bwcVar.ad(objS);
                    }
                    bveVar2 = bveVarC;
                    htq.b(uri14, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                    affcVar2 = affcVar3;
                    cgfVar3 = cgfVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    f3 = f4;
                    ckeVar2 = ckeVar3;
                    heaVar3 = heaVar5;
                    heaVar4 = heaVar6;
                    cjlVar2 = cjlVar4;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    heaVar3 = heaVar;
                    heaVar4 = heaVar2;
                    affcVar2 = affcVar;
                    f3 = f2;
                    cgfVar3 = cgfVar2;
                    csrVar3 = csrVar2;
                    cfuVar3 = cfuVar2;
                    ckeVar2 = ckeVar;
                    cjlVar2 = cjlVar;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                }
            }
            i4 |= 1572864;
            i15 = i4;
            i16 = i3 & 128;
            if (i16 != 0) {
                i15 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if ((i & 16777216) == 0) {
                    zE = bveVarC.C(heaVar);
                } else {
                    zE = bveVarC.E(heaVar);
                }
                if (true != zE) {
                    i17 = 4194304;
                } else {
                    i17 = 8388608;
                }
                i15 |= i17;
            }
            i18 = i3 & 256;
            if (i18 != 0) {
                if ((i & 100663296) == 0) {
                    if ((i & 134217728) == 0) {
                        zE2 = bveVarC.C(heaVar2);
                    } else {
                        zE2 = bveVarC.E(heaVar2);
                    }
                    if (true != zE2) {
                        i19 = 33554432;
                    } else {
                        i19 = 67108864;
                    }
                    i15 |= i19;
                }
                i20 = i3 & 512;
                if (i20 != 0) {
                    i20 = i20;
                    i21 = i15 | 805306368;
                } else {
                    if ((i & 805306368) != 0) {
                        if (true != bveVarC.C(cjlVar)) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i15 |= i22;
                    }
                    i21 = i15;
                }
                i23 = i3 & 1024;
                if (i23 != 0) {
                    i24 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (true != bveVarC.E(affcVar)) {
                        i25 = 2;
                    } else {
                        i25 = 4;
                    }
                    i24 = i2 | i25;
                } else {
                    i24 = i2;
                }
                if ((306783379 & i21) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (bveVarC.I(z, i21 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i26 = i8;
                    } else {
                        i26 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i26 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i10 != 0) {
                        f4 = 1.0f;
                        i27 = i13;
                    } else {
                        i27 = i13;
                        f4 = f2;
                    }
                    if (i27 != 0) {
                        ckeVar3 = null;
                    } else {
                        ckeVar3 = ckeVar;
                    }
                    if (i16 != 0) {
                        heaVar5 = null;
                    } else {
                        heaVar5 = heaVar;
                    }
                    if (i18 != 0) {
                        heaVar6 = null;
                    } else {
                        heaVar6 = heaVar2;
                    }
                    if (i20 != 0) {
                        cjlVar3 = null;
                    } else {
                        cjlVar3 = cjlVar;
                    }
                    if (i23 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new lfs(0);
                            bwcVar2.ad(objS2);
                        }
                        affcVar3 = (defpackage.affc) objS2;
                    } else {
                        affcVar3 = affcVar;
                    }
                    htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                    htbVarC.getClass();
                    android.net.Uri uri15 = gjvVar.b;
                    if ((i24 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                    if ((1879048192 & i21) == 536870912) {
                    }
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (!zE3 && !z3) {
                        defpackage.cjl cjlVar1112 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1112, 11, (byte[]) null);
                        cjlVar4 = cjlVar1112;
                        bwcVar.ad(objS);
                    } else {
                        defpackage.cjl cjlVar1113 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1113, 11, (byte[]) null);
                        cjlVar4 = cjlVar1113;
                        bwcVar.ad(objS);
                    }
                    bveVar2 = bveVarC;
                    htq.b(uri15, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                    affcVar2 = affcVar3;
                    cgfVar3 = cgfVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    f3 = f4;
                    ckeVar2 = ckeVar3;
                    heaVar3 = heaVar5;
                    heaVar4 = heaVar6;
                    cjlVar2 = cjlVar4;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    heaVar3 = heaVar;
                    heaVar4 = heaVar2;
                    affcVar2 = affcVar;
                    f3 = f2;
                    cgfVar3 = cgfVar2;
                    csrVar3 = csrVar2;
                    cfuVar3 = cfuVar2;
                    ckeVar2 = ckeVar;
                    cjlVar2 = cjlVar;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                }
            }
            i15 |= 100663296;
            i20 = i3 & 512;
            if (i20 != 0) {
                i20 = i20;
                i21 = i15 | 805306368;
            } else {
                if ((i & 805306368) != 0) {
                    if (true != bveVarC.C(cjlVar)) {
                        i22 = 268435456;
                    } else {
                        i22 = 536870912;
                    }
                    i15 |= i22;
                }
                i21 = i15;
            }
            i23 = i3 & 1024;
            if (i23 != 0) {
                i24 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.E(affcVar)) {
                    i25 = 2;
                } else {
                    i25 = 4;
                }
                i24 = i2 | i25;
            } else {
                i24 = i2;
            }
            if ((306783379 & i21) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (bveVarC.I(z, i21 & 1)) {
                if (i29 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                    i26 = i8;
                } else {
                    i26 = i8;
                    cgfVar4 = cgfVar2;
                }
                if (i6 != 0) {
                    cfuVar4 = defpackage.cfs.e;
                } else {
                    cfuVar4 = cfuVar2;
                }
                if (i26 != 0) {
                    csrVar4 = defpackage.csq.b;
                } else {
                    csrVar4 = csrVar2;
                }
                if (i10 != 0) {
                    f4 = 1.0f;
                    i27 = i13;
                } else {
                    i27 = i13;
                    f4 = f2;
                }
                if (i27 != 0) {
                    ckeVar3 = null;
                } else {
                    ckeVar3 = ckeVar;
                }
                if (i16 != 0) {
                    heaVar5 = null;
                } else {
                    heaVar5 = heaVar;
                }
                if (i18 != 0) {
                    heaVar6 = null;
                } else {
                    heaVar6 = heaVar2;
                }
                if (i20 != 0) {
                    cjlVar3 = null;
                } else {
                    cjlVar3 = cjlVar;
                }
                if (i23 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new lfs(0);
                        bwcVar2.ad(objS2);
                    }
                    affcVar3 = (defpackage.affc) objS2;
                } else {
                    affcVar3 = affcVar;
                }
                htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                htbVarC.getClass();
                android.net.Uri uri16 = gjvVar.b;
                if ((i24 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                if ((1879048192 & i21) == 536870912) {
                }
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (!zE3 && !z3) {
                    defpackage.cjl cjlVar1114 = cjlVar3;
                    objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1114, 11, (byte[]) null);
                    cjlVar4 = cjlVar1114;
                    bwcVar.ad(objS);
                } else {
                    defpackage.cjl cjlVar1115 = cjlVar3;
                    objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1115, 11, (byte[]) null);
                    cjlVar4 = cjlVar1115;
                    bwcVar.ad(objS);
                }
                bveVar2 = bveVarC;
                htq.b(uri16, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                affcVar2 = affcVar3;
                cgfVar3 = cgfVar4;
                cfuVar3 = cfuVar4;
                csrVar3 = csrVar4;
                f3 = f4;
                ckeVar2 = ckeVar3;
                heaVar3 = heaVar5;
                heaVar4 = heaVar6;
                cjlVar2 = cjlVar4;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                heaVar3 = heaVar;
                heaVar4 = heaVar2;
                affcVar2 = affcVar;
                f3 = f2;
                cgfVar3 = cgfVar2;
                csrVar3 = csrVar2;
                cfuVar3 = cfuVar2;
                ckeVar2 = ckeVar;
                cjlVar2 = cjlVar;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
            }
        }
        i4 |= 48;
        cgfVar2 = cgfVar;
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            if (true != bveVarC.C(null)) {
                i5 = 128;
            } else {
                i5 = 256;
            }
            i4 |= i5;
        }
        i6 = i3 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                cfuVar2 = cfuVar;
                if (true != bveVarC.C(cfuVar2)) {
                    i7 = 1024;
                } else {
                    i7 = 2048;
                }
                i4 |= i7;
            }
            i8 = i3 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    csrVar2 = csrVar;
                    if (true != bveVarC.C(csrVar2)) {
                        i9 = 8192;
                    } else {
                        i9 = 16384;
                    }
                    i4 |= i9;
                }
                i10 = i3 & 32;
                if (i10 != 0) {
                    i4 |= 196608;
                    f2 = f;
                } else {
                    f2 = f;
                    i11 = i4;
                    if ((i & 196608) == 0) {
                        if (true != bveVarC.z(f2)) {
                            i12 = 65536;
                        } else {
                            i12 = 131072;
                        }
                        i4 = i11 | i12;
                    }
                }
                i13 = i3 & 64;
                if (i13 != 0) {
                    if ((i & 1572864) == 0) {
                        int i34 = i4;
                        if (true != bveVarC.C(ckeVar)) {
                            i14 = 524288;
                        } else {
                            i14 = 1048576;
                        }
                        i15 = i34 | i14;
                    }
                    i16 = i3 & 128;
                    if (i16 != 0) {
                        i15 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        if ((i & 16777216) == 0) {
                            zE = bveVarC.C(heaVar);
                        } else {
                            zE = bveVarC.E(heaVar);
                        }
                        if (true != zE) {
                            i17 = 4194304;
                        } else {
                            i17 = 8388608;
                        }
                        i15 |= i17;
                    }
                    i18 = i3 & 256;
                    if (i18 != 0) {
                        if ((i & 100663296) == 0) {
                            if ((i & 134217728) == 0) {
                                zE2 = bveVarC.C(heaVar2);
                            } else {
                                zE2 = bveVarC.E(heaVar2);
                            }
                            if (true != zE2) {
                                i19 = 33554432;
                            } else {
                                i19 = 67108864;
                            }
                            i15 |= i19;
                        }
                        i20 = i3 & 512;
                        if (i20 != 0) {
                            i20 = i20;
                            i21 = i15 | 805306368;
                        } else {
                            if ((i & 805306368) != 0) {
                                if (true != bveVarC.C(cjlVar)) {
                                    i22 = 268435456;
                                } else {
                                    i22 = 536870912;
                                }
                                i15 |= i22;
                            }
                            i21 = i15;
                        }
                        i23 = i3 & 1024;
                        if (i23 != 0) {
                            i24 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            if (true != bveVarC.E(affcVar)) {
                                i25 = 2;
                            } else {
                                i25 = 4;
                            }
                            i24 = i2 | i25;
                        } else {
                            i24 = i2;
                        }
                        if ((306783379 & i21) == 306783378) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (bveVarC.I(z, i21 & 1)) {
                            if (i29 != 0) {
                                cgfVar4 = defpackage.cgf.e;
                                i26 = i8;
                            } else {
                                i26 = i8;
                                cgfVar4 = cgfVar2;
                            }
                            if (i6 != 0) {
                                cfuVar4 = defpackage.cfs.e;
                            } else {
                                cfuVar4 = cfuVar2;
                            }
                            if (i26 != 0) {
                                csrVar4 = defpackage.csq.b;
                            } else {
                                csrVar4 = csrVar2;
                            }
                            if (i10 != 0) {
                                f4 = 1.0f;
                                i27 = i13;
                            } else {
                                i27 = i13;
                                f4 = f2;
                            }
                            if (i27 != 0) {
                                ckeVar3 = null;
                            } else {
                                ckeVar3 = ckeVar;
                            }
                            if (i16 != 0) {
                                heaVar5 = null;
                            } else {
                                heaVar5 = heaVar;
                            }
                            if (i18 != 0) {
                                heaVar6 = null;
                            } else {
                                heaVar6 = heaVar2;
                            }
                            if (i20 != 0) {
                                cjlVar3 = null;
                            } else {
                                cjlVar3 = cjlVar;
                            }
                            if (i23 != 0) {
                                bwcVar2 = (defpackage.bwc) bveVarC;
                                objS2 = bwcVar2.S();
                                if (objS2 == defpackage.bvd.a) {
                                    objS2 = new lfs(0);
                                    bwcVar2.ad(objS2);
                                }
                                affcVar3 = (defpackage.affc) objS2;
                            } else {
                                affcVar3 = affcVar;
                            }
                            htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                            htbVarC.getClass();
                            android.net.Uri uri17 = gjvVar.b;
                            if ((i24 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                            if ((1879048192 & i21) == 536870912) {
                            }
                            bwcVar = (defpackage.bwc) bveVarC;
                            objS = bwcVar.S();
                            if (!zE3 && !z3) {
                                defpackage.cjl cjlVar1116 = cjlVar3;
                                objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1116, 11, (byte[]) null);
                                cjlVar4 = cjlVar1116;
                                bwcVar.ad(objS);
                            } else {
                                defpackage.cjl cjlVar1117 = cjlVar3;
                                objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1117, 11, (byte[]) null);
                                cjlVar4 = cjlVar1117;
                                bwcVar.ad(objS);
                            }
                            bveVar2 = bveVarC;
                            htq.b(uri17, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                            affcVar2 = affcVar3;
                            cgfVar3 = cgfVar4;
                            cfuVar3 = cfuVar4;
                            csrVar3 = csrVar4;
                            f3 = f4;
                            ckeVar2 = ckeVar3;
                            heaVar3 = heaVar5;
                            heaVar4 = heaVar6;
                            cjlVar2 = cjlVar4;
                        } else {
                            bveVar2 = bveVarC;
                            bveVar2.s();
                            heaVar3 = heaVar;
                            heaVar4 = heaVar2;
                            affcVar2 = affcVar;
                            f3 = f2;
                            cgfVar3 = cgfVar2;
                            csrVar3 = csrVar2;
                            cfuVar3 = cfuVar2;
                            ckeVar2 = ckeVar;
                            cjlVar2 = cjlVar;
                        }
                        bxlVarJ = bveVar2.J();
                        if (bxlVarJ != null) {
                            bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                        }
                    }
                    i15 |= 100663296;
                    i20 = i3 & 512;
                    if (i20 != 0) {
                        i20 = i20;
                        i21 = i15 | 805306368;
                    } else {
                        if ((i & 805306368) != 0) {
                            if (true != bveVarC.C(cjlVar)) {
                                i22 = 268435456;
                            } else {
                                i22 = 536870912;
                            }
                            i15 |= i22;
                        }
                        i21 = i15;
                    }
                    i23 = i3 & 1024;
                    if (i23 != 0) {
                        i24 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (true != bveVarC.E(affcVar)) {
                            i25 = 2;
                        } else {
                            i25 = 4;
                        }
                        i24 = i2 | i25;
                    } else {
                        i24 = i2;
                    }
                    if ((306783379 & i21) == 306783378) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (bveVarC.I(z, i21 & 1)) {
                        if (i29 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i26 = i8;
                        } else {
                            i26 = i8;
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            cfuVar4 = defpackage.cfs.e;
                        } else {
                            cfuVar4 = cfuVar2;
                        }
                        if (i26 != 0) {
                            csrVar4 = defpackage.csq.b;
                        } else {
                            csrVar4 = csrVar2;
                        }
                        if (i10 != 0) {
                            f4 = 1.0f;
                            i27 = i13;
                        } else {
                            i27 = i13;
                            f4 = f2;
                        }
                        if (i27 != 0) {
                            ckeVar3 = null;
                        } else {
                            ckeVar3 = ckeVar;
                        }
                        if (i16 != 0) {
                            heaVar5 = null;
                        } else {
                            heaVar5 = heaVar;
                        }
                        if (i18 != 0) {
                            heaVar6 = null;
                        } else {
                            heaVar6 = heaVar2;
                        }
                        if (i20 != 0) {
                            cjlVar3 = null;
                        } else {
                            cjlVar3 = cjlVar;
                        }
                        if (i23 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new lfs(0);
                                bwcVar2.ad(objS2);
                            }
                            affcVar3 = (defpackage.affc) objS2;
                        } else {
                            affcVar3 = affcVar;
                        }
                        htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                        htbVarC.getClass();
                        android.net.Uri uri18 = gjvVar.b;
                        if ((i24 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                        if ((1879048192 & i21) == 536870912) {
                        }
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (!zE3 && !z3) {
                            defpackage.cjl cjlVar1118 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1118, 11, (byte[]) null);
                            cjlVar4 = cjlVar1118;
                            bwcVar.ad(objS);
                        } else {
                            defpackage.cjl cjlVar1119 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1119, 11, (byte[]) null);
                            cjlVar4 = cjlVar1119;
                            bwcVar.ad(objS);
                        }
                        bveVar2 = bveVarC;
                        htq.b(uri18, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                        affcVar2 = affcVar3;
                        cgfVar3 = cgfVar4;
                        cfuVar3 = cfuVar4;
                        csrVar3 = csrVar4;
                        f3 = f4;
                        ckeVar2 = ckeVar3;
                        heaVar3 = heaVar5;
                        heaVar4 = heaVar6;
                        cjlVar2 = cjlVar4;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        heaVar3 = heaVar;
                        heaVar4 = heaVar2;
                        affcVar2 = affcVar;
                        f3 = f2;
                        cgfVar3 = cgfVar2;
                        csrVar3 = csrVar2;
                        cfuVar3 = cfuVar2;
                        ckeVar2 = ckeVar;
                        cjlVar2 = cjlVar;
                    }
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                    }
                }
                i4 |= 1572864;
                i15 = i4;
                i16 = i3 & 128;
                if (i16 != 0) {
                    i15 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if ((i & 16777216) == 0) {
                        zE = bveVarC.C(heaVar);
                    } else {
                        zE = bveVarC.E(heaVar);
                    }
                    if (true != zE) {
                        i17 = 4194304;
                    } else {
                        i17 = 8388608;
                    }
                    i15 |= i17;
                }
                i18 = i3 & 256;
                if (i18 != 0) {
                    if ((i & 100663296) == 0) {
                        if ((i & 134217728) == 0) {
                            zE2 = bveVarC.C(heaVar2);
                        } else {
                            zE2 = bveVarC.E(heaVar2);
                        }
                        if (true != zE2) {
                            i19 = 33554432;
                        } else {
                            i19 = 67108864;
                        }
                        i15 |= i19;
                    }
                    i20 = i3 & 512;
                    if (i20 != 0) {
                        i20 = i20;
                        i21 = i15 | 805306368;
                    } else {
                        if ((i & 805306368) != 0) {
                            if (true != bveVarC.C(cjlVar)) {
                                i22 = 268435456;
                            } else {
                                i22 = 536870912;
                            }
                            i15 |= i22;
                        }
                        i21 = i15;
                    }
                    i23 = i3 & 1024;
                    if (i23 != 0) {
                        i24 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (true != bveVarC.E(affcVar)) {
                            i25 = 2;
                        } else {
                            i25 = 4;
                        }
                        i24 = i2 | i25;
                    } else {
                        i24 = i2;
                    }
                    if ((306783379 & i21) == 306783378) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (bveVarC.I(z, i21 & 1)) {
                        if (i29 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i26 = i8;
                        } else {
                            i26 = i8;
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            cfuVar4 = defpackage.cfs.e;
                        } else {
                            cfuVar4 = cfuVar2;
                        }
                        if (i26 != 0) {
                            csrVar4 = defpackage.csq.b;
                        } else {
                            csrVar4 = csrVar2;
                        }
                        if (i10 != 0) {
                            f4 = 1.0f;
                            i27 = i13;
                        } else {
                            i27 = i13;
                            f4 = f2;
                        }
                        if (i27 != 0) {
                            ckeVar3 = null;
                        } else {
                            ckeVar3 = ckeVar;
                        }
                        if (i16 != 0) {
                            heaVar5 = null;
                        } else {
                            heaVar5 = heaVar;
                        }
                        if (i18 != 0) {
                            heaVar6 = null;
                        } else {
                            heaVar6 = heaVar2;
                        }
                        if (i20 != 0) {
                            cjlVar3 = null;
                        } else {
                            cjlVar3 = cjlVar;
                        }
                        if (i23 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new lfs(0);
                                bwcVar2.ad(objS2);
                            }
                            affcVar3 = (defpackage.affc) objS2;
                        } else {
                            affcVar3 = affcVar;
                        }
                        htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                        htbVarC.getClass();
                        android.net.Uri uri19 = gjvVar.b;
                        if ((i24 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                        if ((1879048192 & i21) == 536870912) {
                        }
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (!zE3 && !z3) {
                            defpackage.cjl cjlVar11110 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar11110, 11, (byte[]) null);
                            cjlVar4 = cjlVar11110;
                            bwcVar.ad(objS);
                        } else {
                            defpackage.cjl cjlVar11111 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar11111, 11, (byte[]) null);
                            cjlVar4 = cjlVar11111;
                            bwcVar.ad(objS);
                        }
                        bveVar2 = bveVarC;
                        htq.b(uri19, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                        affcVar2 = affcVar3;
                        cgfVar3 = cgfVar4;
                        cfuVar3 = cfuVar4;
                        csrVar3 = csrVar4;
                        f3 = f4;
                        ckeVar2 = ckeVar3;
                        heaVar3 = heaVar5;
                        heaVar4 = heaVar6;
                        cjlVar2 = cjlVar4;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        heaVar3 = heaVar;
                        heaVar4 = heaVar2;
                        affcVar2 = affcVar;
                        f3 = f2;
                        cgfVar3 = cgfVar2;
                        csrVar3 = csrVar2;
                        cfuVar3 = cfuVar2;
                        ckeVar2 = ckeVar;
                        cjlVar2 = cjlVar;
                    }
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                    }
                }
                i15 |= 100663296;
                i20 = i3 & 512;
                if (i20 != 0) {
                    i20 = i20;
                    i21 = i15 | 805306368;
                } else {
                    if ((i & 805306368) != 0) {
                        if (true != bveVarC.C(cjlVar)) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i15 |= i22;
                    }
                    i21 = i15;
                }
                i23 = i3 & 1024;
                if (i23 != 0) {
                    i24 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (true != bveVarC.E(affcVar)) {
                        i25 = 2;
                    } else {
                        i25 = 4;
                    }
                    i24 = i2 | i25;
                } else {
                    i24 = i2;
                }
                if ((306783379 & i21) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (bveVarC.I(z, i21 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i26 = i8;
                    } else {
                        i26 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i26 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i10 != 0) {
                        f4 = 1.0f;
                        i27 = i13;
                    } else {
                        i27 = i13;
                        f4 = f2;
                    }
                    if (i27 != 0) {
                        ckeVar3 = null;
                    } else {
                        ckeVar3 = ckeVar;
                    }
                    if (i16 != 0) {
                        heaVar5 = null;
                    } else {
                        heaVar5 = heaVar;
                    }
                    if (i18 != 0) {
                        heaVar6 = null;
                    } else {
                        heaVar6 = heaVar2;
                    }
                    if (i20 != 0) {
                        cjlVar3 = null;
                    } else {
                        cjlVar3 = cjlVar;
                    }
                    if (i23 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new lfs(0);
                            bwcVar2.ad(objS2);
                        }
                        affcVar3 = (defpackage.affc) objS2;
                    } else {
                        affcVar3 = affcVar;
                    }
                    htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                    htbVarC.getClass();
                    android.net.Uri uri110 = gjvVar.b;
                    if ((i24 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                    if ((1879048192 & i21) == 536870912) {
                    }
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (!zE3 && !z3) {
                        defpackage.cjl cjlVar11112 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar11112, 11, (byte[]) null);
                        cjlVar4 = cjlVar11112;
                        bwcVar.ad(objS);
                    } else {
                        defpackage.cjl cjlVar11113 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar11113, 11, (byte[]) null);
                        cjlVar4 = cjlVar11113;
                        bwcVar.ad(objS);
                    }
                    bveVar2 = bveVarC;
                    htq.b(uri110, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                    affcVar2 = affcVar3;
                    cgfVar3 = cgfVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    f3 = f4;
                    ckeVar2 = ckeVar3;
                    heaVar3 = heaVar5;
                    heaVar4 = heaVar6;
                    cjlVar2 = cjlVar4;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    heaVar3 = heaVar;
                    heaVar4 = heaVar2;
                    affcVar2 = affcVar;
                    f3 = f2;
                    cgfVar3 = cgfVar2;
                    csrVar3 = csrVar2;
                    cfuVar3 = cfuVar2;
                    ckeVar2 = ckeVar;
                    cjlVar2 = cjlVar;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                }
            }
            i4 |= 24576;
            csrVar2 = csrVar;
            i10 = i3 & 32;
            if (i10 != 0) {
                i4 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                i11 = i4;
                if ((i & 196608) == 0) {
                    if (true != bveVarC.z(f2)) {
                        i12 = 65536;
                    } else {
                        i12 = 131072;
                    }
                    i4 = i11 | i12;
                }
            }
            i13 = i3 & 64;
            if (i13 != 0) {
                if ((i & 1572864) == 0) {
                    int i35 = i4;
                    if (true != bveVarC.C(ckeVar)) {
                        i14 = 524288;
                    } else {
                        i14 = 1048576;
                    }
                    i15 = i35 | i14;
                }
                i16 = i3 & 128;
                if (i16 != 0) {
                    i15 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if ((i & 16777216) == 0) {
                        zE = bveVarC.C(heaVar);
                    } else {
                        zE = bveVarC.E(heaVar);
                    }
                    if (true != zE) {
                        i17 = 4194304;
                    } else {
                        i17 = 8388608;
                    }
                    i15 |= i17;
                }
                i18 = i3 & 256;
                if (i18 != 0) {
                    if ((i & 100663296) == 0) {
                        if ((i & 134217728) == 0) {
                            zE2 = bveVarC.C(heaVar2);
                        } else {
                            zE2 = bveVarC.E(heaVar2);
                        }
                        if (true != zE2) {
                            i19 = 33554432;
                        } else {
                            i19 = 67108864;
                        }
                        i15 |= i19;
                    }
                    i20 = i3 & 512;
                    if (i20 != 0) {
                        i20 = i20;
                        i21 = i15 | 805306368;
                    } else {
                        if ((i & 805306368) != 0) {
                            if (true != bveVarC.C(cjlVar)) {
                                i22 = 268435456;
                            } else {
                                i22 = 536870912;
                            }
                            i15 |= i22;
                        }
                        i21 = i15;
                    }
                    i23 = i3 & 1024;
                    if (i23 != 0) {
                        i24 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (true != bveVarC.E(affcVar)) {
                            i25 = 2;
                        } else {
                            i25 = 4;
                        }
                        i24 = i2 | i25;
                    } else {
                        i24 = i2;
                    }
                    if ((306783379 & i21) == 306783378) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (bveVarC.I(z, i21 & 1)) {
                        if (i29 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i26 = i8;
                        } else {
                            i26 = i8;
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            cfuVar4 = defpackage.cfs.e;
                        } else {
                            cfuVar4 = cfuVar2;
                        }
                        if (i26 != 0) {
                            csrVar4 = defpackage.csq.b;
                        } else {
                            csrVar4 = csrVar2;
                        }
                        if (i10 != 0) {
                            f4 = 1.0f;
                            i27 = i13;
                        } else {
                            i27 = i13;
                            f4 = f2;
                        }
                        if (i27 != 0) {
                            ckeVar3 = null;
                        } else {
                            ckeVar3 = ckeVar;
                        }
                        if (i16 != 0) {
                            heaVar5 = null;
                        } else {
                            heaVar5 = heaVar;
                        }
                        if (i18 != 0) {
                            heaVar6 = null;
                        } else {
                            heaVar6 = heaVar2;
                        }
                        if (i20 != 0) {
                            cjlVar3 = null;
                        } else {
                            cjlVar3 = cjlVar;
                        }
                        if (i23 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new lfs(0);
                                bwcVar2.ad(objS2);
                            }
                            affcVar3 = (defpackage.affc) objS2;
                        } else {
                            affcVar3 = affcVar;
                        }
                        htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                        htbVarC.getClass();
                        android.net.Uri uri111 = gjvVar.b;
                        if ((i24 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                        if ((1879048192 & i21) == 536870912) {
                        }
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (!zE3 && !z3) {
                            defpackage.cjl cjlVar11114 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar11114, 11, (byte[]) null);
                            cjlVar4 = cjlVar11114;
                            bwcVar.ad(objS);
                        } else {
                            defpackage.cjl cjlVar11115 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar11115, 11, (byte[]) null);
                            cjlVar4 = cjlVar11115;
                            bwcVar.ad(objS);
                        }
                        bveVar2 = bveVarC;
                        htq.b(uri111, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                        affcVar2 = affcVar3;
                        cgfVar3 = cgfVar4;
                        cfuVar3 = cfuVar4;
                        csrVar3 = csrVar4;
                        f3 = f4;
                        ckeVar2 = ckeVar3;
                        heaVar3 = heaVar5;
                        heaVar4 = heaVar6;
                        cjlVar2 = cjlVar4;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        heaVar3 = heaVar;
                        heaVar4 = heaVar2;
                        affcVar2 = affcVar;
                        f3 = f2;
                        cgfVar3 = cgfVar2;
                        csrVar3 = csrVar2;
                        cfuVar3 = cfuVar2;
                        ckeVar2 = ckeVar;
                        cjlVar2 = cjlVar;
                    }
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                    }
                }
                i15 |= 100663296;
                i20 = i3 & 512;
                if (i20 != 0) {
                    i20 = i20;
                    i21 = i15 | 805306368;
                } else {
                    if ((i & 805306368) != 0) {
                        if (true != bveVarC.C(cjlVar)) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i15 |= i22;
                    }
                    i21 = i15;
                }
                i23 = i3 & 1024;
                if (i23 != 0) {
                    i24 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (true != bveVarC.E(affcVar)) {
                        i25 = 2;
                    } else {
                        i25 = 4;
                    }
                    i24 = i2 | i25;
                } else {
                    i24 = i2;
                }
                if ((306783379 & i21) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (bveVarC.I(z, i21 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i26 = i8;
                    } else {
                        i26 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i26 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i10 != 0) {
                        f4 = 1.0f;
                        i27 = i13;
                    } else {
                        i27 = i13;
                        f4 = f2;
                    }
                    if (i27 != 0) {
                        ckeVar3 = null;
                    } else {
                        ckeVar3 = ckeVar;
                    }
                    if (i16 != 0) {
                        heaVar5 = null;
                    } else {
                        heaVar5 = heaVar;
                    }
                    if (i18 != 0) {
                        heaVar6 = null;
                    } else {
                        heaVar6 = heaVar2;
                    }
                    if (i20 != 0) {
                        cjlVar3 = null;
                    } else {
                        cjlVar3 = cjlVar;
                    }
                    if (i23 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new lfs(0);
                            bwcVar2.ad(objS2);
                        }
                        affcVar3 = (defpackage.affc) objS2;
                    } else {
                        affcVar3 = affcVar;
                    }
                    htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                    htbVarC.getClass();
                    android.net.Uri uri112 = gjvVar.b;
                    if ((i24 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                    if ((1879048192 & i21) == 536870912) {
                    }
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (!zE3 && !z3) {
                        defpackage.cjl cjlVar11116 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar11116, 11, (byte[]) null);
                        cjlVar4 = cjlVar11116;
                        bwcVar.ad(objS);
                    } else {
                        defpackage.cjl cjlVar11117 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar11117, 11, (byte[]) null);
                        cjlVar4 = cjlVar11117;
                        bwcVar.ad(objS);
                    }
                    bveVar2 = bveVarC;
                    htq.b(uri112, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                    affcVar2 = affcVar3;
                    cgfVar3 = cgfVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    f3 = f4;
                    ckeVar2 = ckeVar3;
                    heaVar3 = heaVar5;
                    heaVar4 = heaVar6;
                    cjlVar2 = cjlVar4;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    heaVar3 = heaVar;
                    heaVar4 = heaVar2;
                    affcVar2 = affcVar;
                    f3 = f2;
                    cgfVar3 = cgfVar2;
                    csrVar3 = csrVar2;
                    cfuVar3 = cfuVar2;
                    ckeVar2 = ckeVar;
                    cjlVar2 = cjlVar;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                }
            }
            i4 |= 1572864;
            i15 = i4;
            i16 = i3 & 128;
            if (i16 != 0) {
                i15 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if ((i & 16777216) == 0) {
                    zE = bveVarC.C(heaVar);
                } else {
                    zE = bveVarC.E(heaVar);
                }
                if (true != zE) {
                    i17 = 4194304;
                } else {
                    i17 = 8388608;
                }
                i15 |= i17;
            }
            i18 = i3 & 256;
            if (i18 != 0) {
                if ((i & 100663296) == 0) {
                    if ((i & 134217728) == 0) {
                        zE2 = bveVarC.C(heaVar2);
                    } else {
                        zE2 = bveVarC.E(heaVar2);
                    }
                    if (true != zE2) {
                        i19 = 33554432;
                    } else {
                        i19 = 67108864;
                    }
                    i15 |= i19;
                }
                i20 = i3 & 512;
                if (i20 != 0) {
                    i20 = i20;
                    i21 = i15 | 805306368;
                } else {
                    if ((i & 805306368) != 0) {
                        if (true != bveVarC.C(cjlVar)) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i15 |= i22;
                    }
                    i21 = i15;
                }
                i23 = i3 & 1024;
                if (i23 != 0) {
                    i24 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (true != bveVarC.E(affcVar)) {
                        i25 = 2;
                    } else {
                        i25 = 4;
                    }
                    i24 = i2 | i25;
                } else {
                    i24 = i2;
                }
                if ((306783379 & i21) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (bveVarC.I(z, i21 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i26 = i8;
                    } else {
                        i26 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i26 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i10 != 0) {
                        f4 = 1.0f;
                        i27 = i13;
                    } else {
                        i27 = i13;
                        f4 = f2;
                    }
                    if (i27 != 0) {
                        ckeVar3 = null;
                    } else {
                        ckeVar3 = ckeVar;
                    }
                    if (i16 != 0) {
                        heaVar5 = null;
                    } else {
                        heaVar5 = heaVar;
                    }
                    if (i18 != 0) {
                        heaVar6 = null;
                    } else {
                        heaVar6 = heaVar2;
                    }
                    if (i20 != 0) {
                        cjlVar3 = null;
                    } else {
                        cjlVar3 = cjlVar;
                    }
                    if (i23 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new lfs(0);
                            bwcVar2.ad(objS2);
                        }
                        affcVar3 = (defpackage.affc) objS2;
                    } else {
                        affcVar3 = affcVar;
                    }
                    htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                    htbVarC.getClass();
                    android.net.Uri uri113 = gjvVar.b;
                    if ((i24 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                    if ((1879048192 & i21) == 536870912) {
                    }
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (!zE3 && !z3) {
                        defpackage.cjl cjlVar11118 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar11118, 11, (byte[]) null);
                        cjlVar4 = cjlVar11118;
                        bwcVar.ad(objS);
                    } else {
                        defpackage.cjl cjlVar11119 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar11119, 11, (byte[]) null);
                        cjlVar4 = cjlVar11119;
                        bwcVar.ad(objS);
                    }
                    bveVar2 = bveVarC;
                    htq.b(uri113, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                    affcVar2 = affcVar3;
                    cgfVar3 = cgfVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    f3 = f4;
                    ckeVar2 = ckeVar3;
                    heaVar3 = heaVar5;
                    heaVar4 = heaVar6;
                    cjlVar2 = cjlVar4;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    heaVar3 = heaVar;
                    heaVar4 = heaVar2;
                    affcVar2 = affcVar;
                    f3 = f2;
                    cgfVar3 = cgfVar2;
                    csrVar3 = csrVar2;
                    cfuVar3 = cfuVar2;
                    ckeVar2 = ckeVar;
                    cjlVar2 = cjlVar;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                }
            }
            i15 |= 100663296;
            i20 = i3 & 512;
            if (i20 != 0) {
                i20 = i20;
                i21 = i15 | 805306368;
            } else {
                if ((i & 805306368) != 0) {
                    if (true != bveVarC.C(cjlVar)) {
                        i22 = 268435456;
                    } else {
                        i22 = 536870912;
                    }
                    i15 |= i22;
                }
                i21 = i15;
            }
            i23 = i3 & 1024;
            if (i23 != 0) {
                i24 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.E(affcVar)) {
                    i25 = 2;
                } else {
                    i25 = 4;
                }
                i24 = i2 | i25;
            } else {
                i24 = i2;
            }
            if ((306783379 & i21) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (bveVarC.I(z, i21 & 1)) {
                if (i29 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                    i26 = i8;
                } else {
                    i26 = i8;
                    cgfVar4 = cgfVar2;
                }
                if (i6 != 0) {
                    cfuVar4 = defpackage.cfs.e;
                } else {
                    cfuVar4 = cfuVar2;
                }
                if (i26 != 0) {
                    csrVar4 = defpackage.csq.b;
                } else {
                    csrVar4 = csrVar2;
                }
                if (i10 != 0) {
                    f4 = 1.0f;
                    i27 = i13;
                } else {
                    i27 = i13;
                    f4 = f2;
                }
                if (i27 != 0) {
                    ckeVar3 = null;
                } else {
                    ckeVar3 = ckeVar;
                }
                if (i16 != 0) {
                    heaVar5 = null;
                } else {
                    heaVar5 = heaVar;
                }
                if (i18 != 0) {
                    heaVar6 = null;
                } else {
                    heaVar6 = heaVar2;
                }
                if (i20 != 0) {
                    cjlVar3 = null;
                } else {
                    cjlVar3 = cjlVar;
                }
                if (i23 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new lfs(0);
                        bwcVar2.ad(objS2);
                    }
                    affcVar3 = (defpackage.affc) objS2;
                } else {
                    affcVar3 = affcVar;
                }
                htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                htbVarC.getClass();
                android.net.Uri uri114 = gjvVar.b;
                if ((i24 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                if ((1879048192 & i21) == 536870912) {
                }
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (!zE3 && !z3) {
                    defpackage.cjl cjlVar111110 = cjlVar3;
                    objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar111110, 11, (byte[]) null);
                    cjlVar4 = cjlVar111110;
                    bwcVar.ad(objS);
                } else {
                    defpackage.cjl cjlVar111111 = cjlVar3;
                    objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar111111, 11, (byte[]) null);
                    cjlVar4 = cjlVar111111;
                    bwcVar.ad(objS);
                }
                bveVar2 = bveVarC;
                htq.b(uri114, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                affcVar2 = affcVar3;
                cgfVar3 = cgfVar4;
                cfuVar3 = cfuVar4;
                csrVar3 = csrVar4;
                f3 = f4;
                ckeVar2 = ckeVar3;
                heaVar3 = heaVar5;
                heaVar4 = heaVar6;
                cjlVar2 = cjlVar4;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                heaVar3 = heaVar;
                heaVar4 = heaVar2;
                affcVar2 = affcVar;
                f3 = f2;
                cgfVar3 = cgfVar2;
                csrVar3 = csrVar2;
                cfuVar3 = cfuVar2;
                ckeVar2 = ckeVar;
                cjlVar2 = cjlVar;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
            }
        }
        i4 |= 3072;
        cfuVar2 = cfuVar;
        i8 = i3 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                csrVar2 = csrVar;
                if (true != bveVarC.C(csrVar2)) {
                    i9 = 8192;
                } else {
                    i9 = 16384;
                }
                i4 |= i9;
            }
            i10 = i3 & 32;
            if (i10 != 0) {
                i4 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                i11 = i4;
                if ((i & 196608) == 0) {
                    if (true != bveVarC.z(f2)) {
                        i12 = 65536;
                    } else {
                        i12 = 131072;
                    }
                    i4 = i11 | i12;
                }
            }
            i13 = i3 & 64;
            if (i13 != 0) {
                if ((i & 1572864) == 0) {
                    int i36 = i4;
                    if (true != bveVarC.C(ckeVar)) {
                        i14 = 524288;
                    } else {
                        i14 = 1048576;
                    }
                    i15 = i36 | i14;
                }
                i16 = i3 & 128;
                if (i16 != 0) {
                    i15 |= 12582912;
                } else if ((i & 12582912) == 0) {
                    if ((i & 16777216) == 0) {
                        zE = bveVarC.C(heaVar);
                    } else {
                        zE = bveVarC.E(heaVar);
                    }
                    if (true != zE) {
                        i17 = 4194304;
                    } else {
                        i17 = 8388608;
                    }
                    i15 |= i17;
                }
                i18 = i3 & 256;
                if (i18 != 0) {
                    if ((i & 100663296) == 0) {
                        if ((i & 134217728) == 0) {
                            zE2 = bveVarC.C(heaVar2);
                        } else {
                            zE2 = bveVarC.E(heaVar2);
                        }
                        if (true != zE2) {
                            i19 = 33554432;
                        } else {
                            i19 = 67108864;
                        }
                        i15 |= i19;
                    }
                    i20 = i3 & 512;
                    if (i20 != 0) {
                        i20 = i20;
                        i21 = i15 | 805306368;
                    } else {
                        if ((i & 805306368) != 0) {
                            if (true != bveVarC.C(cjlVar)) {
                                i22 = 268435456;
                            } else {
                                i22 = 536870912;
                            }
                            i15 |= i22;
                        }
                        i21 = i15;
                    }
                    i23 = i3 & 1024;
                    if (i23 != 0) {
                        i24 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        if (true != bveVarC.E(affcVar)) {
                            i25 = 2;
                        } else {
                            i25 = 4;
                        }
                        i24 = i2 | i25;
                    } else {
                        i24 = i2;
                    }
                    if ((306783379 & i21) == 306783378) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (bveVarC.I(z, i21 & 1)) {
                        if (i29 != 0) {
                            cgfVar4 = defpackage.cgf.e;
                            i26 = i8;
                        } else {
                            i26 = i8;
                            cgfVar4 = cgfVar2;
                        }
                        if (i6 != 0) {
                            cfuVar4 = defpackage.cfs.e;
                        } else {
                            cfuVar4 = cfuVar2;
                        }
                        if (i26 != 0) {
                            csrVar4 = defpackage.csq.b;
                        } else {
                            csrVar4 = csrVar2;
                        }
                        if (i10 != 0) {
                            f4 = 1.0f;
                            i27 = i13;
                        } else {
                            i27 = i13;
                            f4 = f2;
                        }
                        if (i27 != 0) {
                            ckeVar3 = null;
                        } else {
                            ckeVar3 = ckeVar;
                        }
                        if (i16 != 0) {
                            heaVar5 = null;
                        } else {
                            heaVar5 = heaVar;
                        }
                        if (i18 != 0) {
                            heaVar6 = null;
                        } else {
                            heaVar6 = heaVar2;
                        }
                        if (i20 != 0) {
                            cjlVar3 = null;
                        } else {
                            cjlVar3 = cjlVar;
                        }
                        if (i23 != 0) {
                            bwcVar2 = (defpackage.bwc) bveVarC;
                            objS2 = bwcVar2.S();
                            if (objS2 == defpackage.bvd.a) {
                                objS2 = new lfs(0);
                                bwcVar2.ad(objS2);
                            }
                            affcVar3 = (defpackage.affc) objS2;
                        } else {
                            affcVar3 = affcVar;
                        }
                        htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                        htbVarC.getClass();
                        android.net.Uri uri115 = gjvVar.b;
                        if ((i24 & 14) == 4) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                        if ((1879048192 & i21) == 536870912) {
                        }
                        bwcVar = (defpackage.bwc) bveVarC;
                        objS = bwcVar.S();
                        if (!zE3 && !z3) {
                            defpackage.cjl cjlVar111112 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar111112, 11, (byte[]) null);
                            cjlVar4 = cjlVar111112;
                            bwcVar.ad(objS);
                        } else {
                            defpackage.cjl cjlVar111113 = cjlVar3;
                            objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar111113, 11, (byte[]) null);
                            cjlVar4 = cjlVar111113;
                            bwcVar.ad(objS);
                        }
                        bveVar2 = bveVarC;
                        htq.b(uri115, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                        affcVar2 = affcVar3;
                        cgfVar3 = cgfVar4;
                        cfuVar3 = cfuVar4;
                        csrVar3 = csrVar4;
                        f3 = f4;
                        ckeVar2 = ckeVar3;
                        heaVar3 = heaVar5;
                        heaVar4 = heaVar6;
                        cjlVar2 = cjlVar4;
                    } else {
                        bveVar2 = bveVarC;
                        bveVar2.s();
                        heaVar3 = heaVar;
                        heaVar4 = heaVar2;
                        affcVar2 = affcVar;
                        f3 = f2;
                        cgfVar3 = cgfVar2;
                        csrVar3 = csrVar2;
                        cfuVar3 = cfuVar2;
                        ckeVar2 = ckeVar;
                        cjlVar2 = cjlVar;
                    }
                    bxlVarJ = bveVar2.J();
                    if (bxlVarJ != null) {
                        bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                    }
                }
                i15 |= 100663296;
                i20 = i3 & 512;
                if (i20 != 0) {
                    i20 = i20;
                    i21 = i15 | 805306368;
                } else {
                    if ((i & 805306368) != 0) {
                        if (true != bveVarC.C(cjlVar)) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i15 |= i22;
                    }
                    i21 = i15;
                }
                i23 = i3 & 1024;
                if (i23 != 0) {
                    i24 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (true != bveVarC.E(affcVar)) {
                        i25 = 2;
                    } else {
                        i25 = 4;
                    }
                    i24 = i2 | i25;
                } else {
                    i24 = i2;
                }
                if ((306783379 & i21) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (bveVarC.I(z, i21 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i26 = i8;
                    } else {
                        i26 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i26 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i10 != 0) {
                        f4 = 1.0f;
                        i27 = i13;
                    } else {
                        i27 = i13;
                        f4 = f2;
                    }
                    if (i27 != 0) {
                        ckeVar3 = null;
                    } else {
                        ckeVar3 = ckeVar;
                    }
                    if (i16 != 0) {
                        heaVar5 = null;
                    } else {
                        heaVar5 = heaVar;
                    }
                    if (i18 != 0) {
                        heaVar6 = null;
                    } else {
                        heaVar6 = heaVar2;
                    }
                    if (i20 != 0) {
                        cjlVar3 = null;
                    } else {
                        cjlVar3 = cjlVar;
                    }
                    if (i23 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new lfs(0);
                            bwcVar2.ad(objS2);
                        }
                        affcVar3 = (defpackage.affc) objS2;
                    } else {
                        affcVar3 = affcVar;
                    }
                    htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                    htbVarC.getClass();
                    android.net.Uri uri116 = gjvVar.b;
                    if ((i24 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                    if ((1879048192 & i21) == 536870912) {
                    }
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (!zE3 && !z3) {
                        defpackage.cjl cjlVar111114 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar111114, 11, (byte[]) null);
                        cjlVar4 = cjlVar111114;
                        bwcVar.ad(objS);
                    } else {
                        defpackage.cjl cjlVar111115 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar111115, 11, (byte[]) null);
                        cjlVar4 = cjlVar111115;
                        bwcVar.ad(objS);
                    }
                    bveVar2 = bveVarC;
                    htq.b(uri116, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                    affcVar2 = affcVar3;
                    cgfVar3 = cgfVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    f3 = f4;
                    ckeVar2 = ckeVar3;
                    heaVar3 = heaVar5;
                    heaVar4 = heaVar6;
                    cjlVar2 = cjlVar4;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    heaVar3 = heaVar;
                    heaVar4 = heaVar2;
                    affcVar2 = affcVar;
                    f3 = f2;
                    cgfVar3 = cgfVar2;
                    csrVar3 = csrVar2;
                    cfuVar3 = cfuVar2;
                    ckeVar2 = ckeVar;
                    cjlVar2 = cjlVar;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                }
            }
            i4 |= 1572864;
            i15 = i4;
            i16 = i3 & 128;
            if (i16 != 0) {
                i15 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if ((i & 16777216) == 0) {
                    zE = bveVarC.C(heaVar);
                } else {
                    zE = bveVarC.E(heaVar);
                }
                if (true != zE) {
                    i17 = 4194304;
                } else {
                    i17 = 8388608;
                }
                i15 |= i17;
            }
            i18 = i3 & 256;
            if (i18 != 0) {
                if ((i & 100663296) == 0) {
                    if ((i & 134217728) == 0) {
                        zE2 = bveVarC.C(heaVar2);
                    } else {
                        zE2 = bveVarC.E(heaVar2);
                    }
                    if (true != zE2) {
                        i19 = 33554432;
                    } else {
                        i19 = 67108864;
                    }
                    i15 |= i19;
                }
                i20 = i3 & 512;
                if (i20 != 0) {
                    i20 = i20;
                    i21 = i15 | 805306368;
                } else {
                    if ((i & 805306368) != 0) {
                        if (true != bveVarC.C(cjlVar)) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i15 |= i22;
                    }
                    i21 = i15;
                }
                i23 = i3 & 1024;
                if (i23 != 0) {
                    i24 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (true != bveVarC.E(affcVar)) {
                        i25 = 2;
                    } else {
                        i25 = 4;
                    }
                    i24 = i2 | i25;
                } else {
                    i24 = i2;
                }
                if ((306783379 & i21) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (bveVarC.I(z, i21 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i26 = i8;
                    } else {
                        i26 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i26 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i10 != 0) {
                        f4 = 1.0f;
                        i27 = i13;
                    } else {
                        i27 = i13;
                        f4 = f2;
                    }
                    if (i27 != 0) {
                        ckeVar3 = null;
                    } else {
                        ckeVar3 = ckeVar;
                    }
                    if (i16 != 0) {
                        heaVar5 = null;
                    } else {
                        heaVar5 = heaVar;
                    }
                    if (i18 != 0) {
                        heaVar6 = null;
                    } else {
                        heaVar6 = heaVar2;
                    }
                    if (i20 != 0) {
                        cjlVar3 = null;
                    } else {
                        cjlVar3 = cjlVar;
                    }
                    if (i23 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new lfs(0);
                            bwcVar2.ad(objS2);
                        }
                        affcVar3 = (defpackage.affc) objS2;
                    } else {
                        affcVar3 = affcVar;
                    }
                    htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                    htbVarC.getClass();
                    android.net.Uri uri117 = gjvVar.b;
                    if ((i24 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                    if ((1879048192 & i21) == 536870912) {
                    }
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (!zE3 && !z3) {
                        defpackage.cjl cjlVar111116 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar111116, 11, (byte[]) null);
                        cjlVar4 = cjlVar111116;
                        bwcVar.ad(objS);
                    } else {
                        defpackage.cjl cjlVar111117 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar111117, 11, (byte[]) null);
                        cjlVar4 = cjlVar111117;
                        bwcVar.ad(objS);
                    }
                    bveVar2 = bveVarC;
                    htq.b(uri117, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                    affcVar2 = affcVar3;
                    cgfVar3 = cgfVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    f3 = f4;
                    ckeVar2 = ckeVar3;
                    heaVar3 = heaVar5;
                    heaVar4 = heaVar6;
                    cjlVar2 = cjlVar4;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    heaVar3 = heaVar;
                    heaVar4 = heaVar2;
                    affcVar2 = affcVar;
                    f3 = f2;
                    cgfVar3 = cgfVar2;
                    csrVar3 = csrVar2;
                    cfuVar3 = cfuVar2;
                    ckeVar2 = ckeVar;
                    cjlVar2 = cjlVar;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                }
            }
            i15 |= 100663296;
            i20 = i3 & 512;
            if (i20 != 0) {
                i20 = i20;
                i21 = i15 | 805306368;
            } else {
                if ((i & 805306368) != 0) {
                    if (true != bveVarC.C(cjlVar)) {
                        i22 = 268435456;
                    } else {
                        i22 = 536870912;
                    }
                    i15 |= i22;
                }
                i21 = i15;
            }
            i23 = i3 & 1024;
            if (i23 != 0) {
                i24 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.E(affcVar)) {
                    i25 = 2;
                } else {
                    i25 = 4;
                }
                i24 = i2 | i25;
            } else {
                i24 = i2;
            }
            if ((306783379 & i21) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (bveVarC.I(z, i21 & 1)) {
                if (i29 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                    i26 = i8;
                } else {
                    i26 = i8;
                    cgfVar4 = cgfVar2;
                }
                if (i6 != 0) {
                    cfuVar4 = defpackage.cfs.e;
                } else {
                    cfuVar4 = cfuVar2;
                }
                if (i26 != 0) {
                    csrVar4 = defpackage.csq.b;
                } else {
                    csrVar4 = csrVar2;
                }
                if (i10 != 0) {
                    f4 = 1.0f;
                    i27 = i13;
                } else {
                    i27 = i13;
                    f4 = f2;
                }
                if (i27 != 0) {
                    ckeVar3 = null;
                } else {
                    ckeVar3 = ckeVar;
                }
                if (i16 != 0) {
                    heaVar5 = null;
                } else {
                    heaVar5 = heaVar;
                }
                if (i18 != 0) {
                    heaVar6 = null;
                } else {
                    heaVar6 = heaVar2;
                }
                if (i20 != 0) {
                    cjlVar3 = null;
                } else {
                    cjlVar3 = cjlVar;
                }
                if (i23 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new lfs(0);
                        bwcVar2.ad(objS2);
                    }
                    affcVar3 = (defpackage.affc) objS2;
                } else {
                    affcVar3 = affcVar;
                }
                htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                htbVarC.getClass();
                android.net.Uri uri118 = gjvVar.b;
                if ((i24 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                if ((1879048192 & i21) == 536870912) {
                }
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (!zE3 && !z3) {
                    defpackage.cjl cjlVar111118 = cjlVar3;
                    objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar111118, 11, (byte[]) null);
                    cjlVar4 = cjlVar111118;
                    bwcVar.ad(objS);
                } else {
                    defpackage.cjl cjlVar111119 = cjlVar3;
                    objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar111119, 11, (byte[]) null);
                    cjlVar4 = cjlVar111119;
                    bwcVar.ad(objS);
                }
                bveVar2 = bveVarC;
                htq.b(uri118, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                affcVar2 = affcVar3;
                cgfVar3 = cgfVar4;
                cfuVar3 = cfuVar4;
                csrVar3 = csrVar4;
                f3 = f4;
                ckeVar2 = ckeVar3;
                heaVar3 = heaVar5;
                heaVar4 = heaVar6;
                cjlVar2 = cjlVar4;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                heaVar3 = heaVar;
                heaVar4 = heaVar2;
                affcVar2 = affcVar;
                f3 = f2;
                cgfVar3 = cgfVar2;
                csrVar3 = csrVar2;
                cfuVar3 = cfuVar2;
                ckeVar2 = ckeVar;
                cjlVar2 = cjlVar;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
            }
        }
        i4 |= 24576;
        csrVar2 = csrVar;
        i10 = i3 & 32;
        if (i10 != 0) {
            i4 |= 196608;
            f2 = f;
        } else {
            f2 = f;
            i11 = i4;
            if ((i & 196608) == 0) {
                if (true != bveVarC.z(f2)) {
                    i12 = 65536;
                } else {
                    i12 = 131072;
                }
                i4 = i11 | i12;
            }
        }
        i13 = i3 & 64;
        if (i13 != 0) {
            if ((i & 1572864) == 0) {
                int i37 = i4;
                if (true != bveVarC.C(ckeVar)) {
                    i14 = 524288;
                } else {
                    i14 = 1048576;
                }
                i15 = i37 | i14;
            }
            i16 = i3 & 128;
            if (i16 != 0) {
                i15 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if ((i & 16777216) == 0) {
                    zE = bveVarC.C(heaVar);
                } else {
                    zE = bveVarC.E(heaVar);
                }
                if (true != zE) {
                    i17 = 4194304;
                } else {
                    i17 = 8388608;
                }
                i15 |= i17;
            }
            i18 = i3 & 256;
            if (i18 != 0) {
                if ((i & 100663296) == 0) {
                    if ((i & 134217728) == 0) {
                        zE2 = bveVarC.C(heaVar2);
                    } else {
                        zE2 = bveVarC.E(heaVar2);
                    }
                    if (true != zE2) {
                        i19 = 33554432;
                    } else {
                        i19 = 67108864;
                    }
                    i15 |= i19;
                }
                i20 = i3 & 512;
                if (i20 != 0) {
                    i20 = i20;
                    i21 = i15 | 805306368;
                } else {
                    if ((i & 805306368) != 0) {
                        if (true != bveVarC.C(cjlVar)) {
                            i22 = 268435456;
                        } else {
                            i22 = 536870912;
                        }
                        i15 |= i22;
                    }
                    i21 = i15;
                }
                i23 = i3 & 1024;
                if (i23 != 0) {
                    i24 = i2 | 6;
                } else if ((i2 & 6) == 0) {
                    if (true != bveVarC.E(affcVar)) {
                        i25 = 2;
                    } else {
                        i25 = 4;
                    }
                    i24 = i2 | i25;
                } else {
                    i24 = i2;
                }
                if ((306783379 & i21) == 306783378) {
                    z = true;
                } else {
                    z = true;
                }
                if (bveVarC.I(z, i21 & 1)) {
                    if (i29 != 0) {
                        cgfVar4 = defpackage.cgf.e;
                        i26 = i8;
                    } else {
                        i26 = i8;
                        cgfVar4 = cgfVar2;
                    }
                    if (i6 != 0) {
                        cfuVar4 = defpackage.cfs.e;
                    } else {
                        cfuVar4 = cfuVar2;
                    }
                    if (i26 != 0) {
                        csrVar4 = defpackage.csq.b;
                    } else {
                        csrVar4 = csrVar2;
                    }
                    if (i10 != 0) {
                        f4 = 1.0f;
                        i27 = i13;
                    } else {
                        i27 = i13;
                        f4 = f2;
                    }
                    if (i27 != 0) {
                        ckeVar3 = null;
                    } else {
                        ckeVar3 = ckeVar;
                    }
                    if (i16 != 0) {
                        heaVar5 = null;
                    } else {
                        heaVar5 = heaVar;
                    }
                    if (i18 != 0) {
                        heaVar6 = null;
                    } else {
                        heaVar6 = heaVar2;
                    }
                    if (i20 != 0) {
                        cjlVar3 = null;
                    } else {
                        cjlVar3 = cjlVar;
                    }
                    if (i23 != 0) {
                        bwcVar2 = (defpackage.bwc) bveVarC;
                        objS2 = bwcVar2.S();
                        if (objS2 == defpackage.bvd.a) {
                            objS2 = new lfs(0);
                            bwcVar2.ad(objS2);
                        }
                        affcVar3 = (defpackage.affc) objS2;
                    } else {
                        affcVar3 = affcVar;
                    }
                    htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                    htbVarC.getClass();
                    android.net.Uri uri119 = gjvVar.b;
                    if ((i24 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                    if ((1879048192 & i21) == 536870912) {
                    }
                    bwcVar = (defpackage.bwc) bveVarC;
                    objS = bwcVar.S();
                    if (!zE3 && !z3) {
                        defpackage.cjl cjlVar1111110 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1111110, 11, (byte[]) null);
                        cjlVar4 = cjlVar1111110;
                        bwcVar.ad(objS);
                    } else {
                        defpackage.cjl cjlVar1111111 = cjlVar3;
                        objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1111111, 11, (byte[]) null);
                        cjlVar4 = cjlVar1111111;
                        bwcVar.ad(objS);
                    }
                    bveVar2 = bveVarC;
                    htq.b(uri119, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                    affcVar2 = affcVar3;
                    cgfVar3 = cgfVar4;
                    cfuVar3 = cfuVar4;
                    csrVar3 = csrVar4;
                    f3 = f4;
                    ckeVar2 = ckeVar3;
                    heaVar3 = heaVar5;
                    heaVar4 = heaVar6;
                    cjlVar2 = cjlVar4;
                } else {
                    bveVar2 = bveVarC;
                    bveVar2.s();
                    heaVar3 = heaVar;
                    heaVar4 = heaVar2;
                    affcVar2 = affcVar;
                    f3 = f2;
                    cgfVar3 = cgfVar2;
                    csrVar3 = csrVar2;
                    cfuVar3 = cfuVar2;
                    ckeVar2 = ckeVar;
                    cjlVar2 = cjlVar;
                }
                bxlVarJ = bveVar2.J();
                if (bxlVarJ != null) {
                    bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
                }
            }
            i15 |= 100663296;
            i20 = i3 & 512;
            if (i20 != 0) {
                i20 = i20;
                i21 = i15 | 805306368;
            } else {
                if ((i & 805306368) != 0) {
                    if (true != bveVarC.C(cjlVar)) {
                        i22 = 268435456;
                    } else {
                        i22 = 536870912;
                    }
                    i15 |= i22;
                }
                i21 = i15;
            }
            i23 = i3 & 1024;
            if (i23 != 0) {
                i24 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.E(affcVar)) {
                    i25 = 2;
                } else {
                    i25 = 4;
                }
                i24 = i2 | i25;
            } else {
                i24 = i2;
            }
            if ((306783379 & i21) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (bveVarC.I(z, i21 & 1)) {
                if (i29 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                    i26 = i8;
                } else {
                    i26 = i8;
                    cgfVar4 = cgfVar2;
                }
                if (i6 != 0) {
                    cfuVar4 = defpackage.cfs.e;
                } else {
                    cfuVar4 = cfuVar2;
                }
                if (i26 != 0) {
                    csrVar4 = defpackage.csq.b;
                } else {
                    csrVar4 = csrVar2;
                }
                if (i10 != 0) {
                    f4 = 1.0f;
                    i27 = i13;
                } else {
                    i27 = i13;
                    f4 = f2;
                }
                if (i27 != 0) {
                    ckeVar3 = null;
                } else {
                    ckeVar3 = ckeVar;
                }
                if (i16 != 0) {
                    heaVar5 = null;
                } else {
                    heaVar5 = heaVar;
                }
                if (i18 != 0) {
                    heaVar6 = null;
                } else {
                    heaVar6 = heaVar2;
                }
                if (i20 != 0) {
                    cjlVar3 = null;
                } else {
                    cjlVar3 = cjlVar;
                }
                if (i23 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new lfs(0);
                        bwcVar2.ad(objS2);
                    }
                    affcVar3 = (defpackage.affc) objS2;
                } else {
                    affcVar3 = affcVar;
                }
                htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                htbVarC.getClass();
                android.net.Uri uri1110 = gjvVar.b;
                if ((i24 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                if ((1879048192 & i21) == 536870912) {
                }
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (!zE3 && !z3) {
                    defpackage.cjl cjlVar1111112 = cjlVar3;
                    objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1111112, 11, (byte[]) null);
                    cjlVar4 = cjlVar1111112;
                    bwcVar.ad(objS);
                } else {
                    defpackage.cjl cjlVar1111113 = cjlVar3;
                    objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1111113, 11, (byte[]) null);
                    cjlVar4 = cjlVar1111113;
                    bwcVar.ad(objS);
                }
                bveVar2 = bveVarC;
                htq.b(uri1110, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                affcVar2 = affcVar3;
                cgfVar3 = cgfVar4;
                cfuVar3 = cfuVar4;
                csrVar3 = csrVar4;
                f3 = f4;
                ckeVar2 = ckeVar3;
                heaVar3 = heaVar5;
                heaVar4 = heaVar6;
                cjlVar2 = cjlVar4;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                heaVar3 = heaVar;
                heaVar4 = heaVar2;
                affcVar2 = affcVar;
                f3 = f2;
                cgfVar3 = cgfVar2;
                csrVar3 = csrVar2;
                cfuVar3 = cfuVar2;
                ckeVar2 = ckeVar;
                cjlVar2 = cjlVar;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
            }
        }
        i4 |= 1572864;
        i15 = i4;
        i16 = i3 & 128;
        if (i16 != 0) {
            i15 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if ((i & 16777216) == 0) {
                zE = bveVarC.C(heaVar);
            } else {
                zE = bveVarC.E(heaVar);
            }
            if (true != zE) {
                i17 = 4194304;
            } else {
                i17 = 8388608;
            }
            i15 |= i17;
        }
        i18 = i3 & 256;
        if (i18 != 0) {
            if ((i & 100663296) == 0) {
                if ((i & 134217728) == 0) {
                    zE2 = bveVarC.C(heaVar2);
                } else {
                    zE2 = bveVarC.E(heaVar2);
                }
                if (true != zE2) {
                    i19 = 33554432;
                } else {
                    i19 = 67108864;
                }
                i15 |= i19;
            }
            i20 = i3 & 512;
            if (i20 != 0) {
                i20 = i20;
                i21 = i15 | 805306368;
            } else {
                if ((i & 805306368) != 0) {
                    if (true != bveVarC.C(cjlVar)) {
                        i22 = 268435456;
                    } else {
                        i22 = 536870912;
                    }
                    i15 |= i22;
                }
                i21 = i15;
            }
            i23 = i3 & 1024;
            if (i23 != 0) {
                i24 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (true != bveVarC.E(affcVar)) {
                    i25 = 2;
                } else {
                    i25 = 4;
                }
                i24 = i2 | i25;
            } else {
                i24 = i2;
            }
            if ((306783379 & i21) == 306783378) {
                z = true;
            } else {
                z = true;
            }
            if (bveVarC.I(z, i21 & 1)) {
                if (i29 != 0) {
                    cgfVar4 = defpackage.cgf.e;
                    i26 = i8;
                } else {
                    i26 = i8;
                    cgfVar4 = cgfVar2;
                }
                if (i6 != 0) {
                    cfuVar4 = defpackage.cfs.e;
                } else {
                    cfuVar4 = cfuVar2;
                }
                if (i26 != 0) {
                    csrVar4 = defpackage.csq.b;
                } else {
                    csrVar4 = csrVar2;
                }
                if (i10 != 0) {
                    f4 = 1.0f;
                    i27 = i13;
                } else {
                    i27 = i13;
                    f4 = f2;
                }
                if (i27 != 0) {
                    ckeVar3 = null;
                } else {
                    ckeVar3 = ckeVar;
                }
                if (i16 != 0) {
                    heaVar5 = null;
                } else {
                    heaVar5 = heaVar;
                }
                if (i18 != 0) {
                    heaVar6 = null;
                } else {
                    heaVar6 = heaVar2;
                }
                if (i20 != 0) {
                    cjlVar3 = null;
                } else {
                    cjlVar3 = cjlVar;
                }
                if (i23 != 0) {
                    bwcVar2 = (defpackage.bwc) bveVarC;
                    objS2 = bwcVar2.S();
                    if (objS2 == defpackage.bvd.a) {
                        objS2 = new lfs(0);
                        bwcVar2.ad(objS2);
                    }
                    affcVar3 = (defpackage.affc) objS2;
                } else {
                    affcVar3 = affcVar;
                }
                htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
                htbVarC.getClass();
                android.net.Uri uri1111 = gjvVar.b;
                if ((i24 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
                if ((1879048192 & i21) == 536870912) {
                }
                bwcVar = (defpackage.bwc) bveVarC;
                objS = bwcVar.S();
                if (!zE3 && !z3) {
                    defpackage.cjl cjlVar1111114 = cjlVar3;
                    objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1111114, 11, (byte[]) null);
                    cjlVar4 = cjlVar1111114;
                    bwcVar.ad(objS);
                } else {
                    defpackage.cjl cjlVar1111115 = cjlVar3;
                    objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1111115, 11, (byte[]) null);
                    cjlVar4 = cjlVar1111115;
                    bwcVar.ad(objS);
                }
                bveVar2 = bveVarC;
                htq.b(uri1111, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
                affcVar2 = affcVar3;
                cgfVar3 = cgfVar4;
                cfuVar3 = cfuVar4;
                csrVar3 = csrVar4;
                f3 = f4;
                ckeVar2 = ckeVar3;
                heaVar3 = heaVar5;
                heaVar4 = heaVar6;
                cjlVar2 = cjlVar4;
            } else {
                bveVar2 = bveVarC;
                bveVar2.s();
                heaVar3 = heaVar;
                heaVar4 = heaVar2;
                affcVar2 = affcVar;
                f3 = f2;
                cgfVar3 = cgfVar2;
                csrVar3 = csrVar2;
                cfuVar3 = cfuVar2;
                ckeVar2 = ckeVar;
                cjlVar2 = cjlVar;
            }
            bxlVarJ = bveVar2.J();
            if (bxlVarJ != null) {
                bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
            }
        }
        i15 |= 100663296;
        i20 = i3 & 512;
        if (i20 != 0) {
            i20 = i20;
            i21 = i15 | 805306368;
        } else {
            if ((i & 805306368) != 0) {
                if (true != bveVarC.C(cjlVar)) {
                    i22 = 268435456;
                } else {
                    i22 = 536870912;
                }
                i15 |= i22;
            }
            i21 = i15;
        }
        i23 = i3 & 1024;
        if (i23 != 0) {
            i24 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (true != bveVarC.E(affcVar)) {
                i25 = 2;
            } else {
                i25 = 4;
            }
            i24 = i2 | i25;
        } else {
            i24 = i2;
        }
        if ((306783379 & i21) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (bveVarC.I(z, i21 & 1)) {
            if (i29 != 0) {
                cgfVar4 = defpackage.cgf.e;
                i26 = i8;
            } else {
                i26 = i8;
                cgfVar4 = cgfVar2;
            }
            if (i6 != 0) {
                cfuVar4 = defpackage.cfs.e;
            } else {
                cfuVar4 = cfuVar2;
            }
            if (i26 != 0) {
                csrVar4 = defpackage.csq.b;
            } else {
                csrVar4 = csrVar2;
            }
            if (i10 != 0) {
                f4 = 1.0f;
                i27 = i13;
            } else {
                i27 = i13;
                f4 = f2;
            }
            if (i27 != 0) {
                ckeVar3 = null;
            } else {
                ckeVar3 = ckeVar;
            }
            if (i16 != 0) {
                heaVar5 = null;
            } else {
                heaVar5 = heaVar;
            }
            if (i18 != 0) {
                heaVar6 = null;
            } else {
                heaVar6 = heaVar2;
            }
            if (i20 != 0) {
                cjlVar3 = null;
            } else {
                cjlVar3 = cjlVar;
            }
            if (i23 != 0) {
                bwcVar2 = (defpackage.bwc) bveVarC;
                objS2 = bwcVar2.S();
                if (objS2 == defpackage.bvd.a) {
                    objS2 = new lfs(0);
                    bwcVar2.ad(objS2);
                }
                affcVar3 = (defpackage.affc) objS2;
            } else {
                affcVar3 = affcVar;
            }
            htbVarC = hsc.c((android.content.Context) bveVarC.f(defpackage.daj.b));
            htbVarC.getClass();
            android.net.Uri uri1112 = gjvVar.b;
            if ((i24 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            zE3 = z2 | bveVarC.E(htbVarC) | bveVarC.E(gjvVar);
            if ((1879048192 & i21) == 536870912) {
            }
            bwcVar = (defpackage.bwc) bveVarC;
            objS = bwcVar.S();
            if (!zE3 && !z3) {
                defpackage.cjl cjlVar1111116 = cjlVar3;
                objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1111116, 11, (byte[]) null);
                cjlVar4 = cjlVar1111116;
                bwcVar.ad(objS);
            } else {
                defpackage.cjl cjlVar1111117 = cjlVar3;
                objS = new gbf(affcVar3, htbVarC, gjvVar, cjlVar1111117, 11, (byte[]) null);
                cjlVar4 = cjlVar1111117;
                bwcVar.ad(objS);
            }
            bveVar2 = bveVarC;
            htq.b(uri1112, cgfVar4, cfuVar4, csrVar4, f4, ckeVar3, heaVar5, heaVar6, (defpackage.affc) objS, bveVar2, ((i21 >> 3) & 112) | ((i21 << 3) & 896) | (i21 & 7168) | (57344 & i21) | (458752 & i21) | (3670016 & i21) | 16777216 | (29360128 & i21) | 134217728 | (i21 & 234881024));
            affcVar2 = affcVar3;
            cgfVar3 = cgfVar4;
            cfuVar3 = cfuVar4;
            csrVar3 = csrVar4;
            f3 = f4;
            ckeVar2 = ckeVar3;
            heaVar3 = heaVar5;
            heaVar4 = heaVar6;
            cjlVar2 = cjlVar4;
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
            heaVar3 = heaVar;
            heaVar4 = heaVar2;
            affcVar2 = affcVar;
            f3 = f2;
            cgfVar3 = cgfVar2;
            csrVar3 = csrVar2;
            cfuVar3 = cfuVar2;
            ckeVar2 = ckeVar;
            cjlVar2 = cjlVar;
        }
        bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new lft(gjvVar, cgfVar3, cfuVar3, csrVar3, f3, ckeVar2, heaVar3, heaVar4, cjlVar2, affcVar2, i, i2, i3, 0);
        }
    }

    public static final void p(rb rbVar) {
        rbVar.g().f(rbVar);
    }

    public static final void q(rb rbVar) {
        java.util.Collection collectionB = rbVar.g().b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionB) {
            if (defpackage.afga.f(((rb) obj).c, rbVar.c)) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            rbVar.g().g((rb) it.next());
        }
        rbVar.g().f(rbVar);
    }

    public static defpackage.ljz r() {
        return (defpackage.ljz) defpackage.mkp.a.i(defpackage.ljz.class);
    }

    public static defpackage.ljx s() {
        return (defpackage.ljx) defpackage.mkp.a.i(defpackage.ljx.class);
    }

    public static final void t(defpackage.bve bveVar, int i) {
        defpackage.bve bveVarC = bveVar.c(-180966693);
        if (bveVarC.I(i != 0, i & 1)) {
            defpackage.cgf cgfVarA = defpackage.awj.c(defpackage.cgf.e, 1.0f).a(new defpackage.ajc(defpackage.cjv.j(0), defpackage.cky.a));
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.a, false);
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarA);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            bwcVar.Y(true);
        } else {
            bveVarC.s();
        }
        defpackage.bxl bxlVarJ = bveVarC.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new gur(i, 8);
        }
    }

    public static final void u(lgt lgtVar, defpackage.bve bveVar, int i) {
        defpackage.bve bveVar2;
        lgt lgtVar2;
        int i2 = i & 1;
        defpackage.bve bveVarC = bveVar.c(-992032212);
        if (bveVarC.I(1 == i2, i2)) {
            defpackage.bwc bwcVar = (defpackage.bwc) bveVarC;
            bwcVar.ab(-127, null, 0, null);
            if (i2 == 0 || bveVarC.F()) {
                defpackage.bvm bvmVar = defpackage.esn.a;
                defpackage.esa esaVarA = defpackage.esn.a(bveVarC);
                if (esaVarA == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                lgtVar2 = (lgt) defpackage.ebl.l(defpackage.afgw.b(lgt.class), esaVarA, null, null, defpackage.edd.f(esaVarA));
            } else {
                bveVarC.s();
                lgtVar2 = lgtVar;
            }
            bveVarC.l();
            defpackage.cgf cgfVarC = defpackage.awj.c(defpackage.cgf.e, 1.0f);
            defpackage.cty ctyVarB = defpackage.atp.b(defpackage.cfs.e, false);
            int iF = defpackage.a.f(bwcVar.u);
            defpackage.cdd cddVarAh = bwcVar.ah();
            defpackage.cgf cgfVarN = defpackage.bzo.n(bveVarC, cgfVarC);
            defpackage.afer aferVar = defpackage.cwl.a;
            bveVarC.w();
            if (bwcVar.t) {
                bveVarC.j(aferVar);
            } else {
                bveVarC.y();
            }
            defpackage.byw.c(bveVarC, ctyVarB, defpackage.cwl.e);
            defpackage.byw.c(bveVarC, cddVarAh, defpackage.cwl.d);
            defpackage.byw.c(bveVarC, java.lang.Integer.valueOf(iF), defpackage.cwl.f);
            defpackage.byw.b(bveVarC, defpackage.cwl.g);
            defpackage.byw.c(bveVarC, cgfVarN, defpackage.cwl.c);
            lgtVar = lgtVar2;
            bveVar2 = bveVarC;
            defpackage.brv.b("TODO", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, bveVar2, 6, 0, 262142);
            bwcVar.Y(true);
        } else {
            bveVar2 = bveVarC;
            bveVar2.s();
        }
        lgt lgtVar3 = lgtVar;
        defpackage.bxl bxlVarJ = bveVar2.J();
        if (bxlVarJ != null) {
            bxlVarJ.c = new jty(lgtVar3, i, 8);
        }
    }

    public static final java.lang.String v(com.google.android.gms.car.CarInfo carInfo) {
        return "HEAD_UNIT_MANAGER_LAST_NOTIFICATION_".concat(Q(carInfo));
    }

    public static final java.lang.String w(com.google.android.gms.car.CarInfo carInfo) {
        return "HEAD_UNIT_MANAGER_NUMBER_OF_NOTIFICATIONS_".concat(Q(carInfo));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    public static final defpackage.cne x(androidx.car.app.model.CarIcon carIcon, defpackage.bve bveVar) {
        androidx.car.app.model.CarColor carColorE;
        int colorDark;
        android.content.Context context = (android.content.Context) bveVar.f(defpackage.daj.b);
        boolean zC = bveVar.C(carIcon);
        java.lang.Object objG = bveVar.g();
        if (zC || objG == defpackage.bvd.a) {
            context.getClass();
            androidx.core.graphics.drawable.IconCompat icon = carIcon.getIcon();
            androidx.car.app.model.CarColor tint = null;
            if (icon != null && (carColorE = icon.e(context)) != null) {
                androidx.car.app.model.CarIconStyle style = carIcon.getStyle();
                tint = style != null ? style.getTint() : null;
                if (tint == null) {
                    tint = carColorE;
                } else {
                    if (tint.getType() == 0) {
                        colorDark = (context.getResources().getConfiguration().uiMode & 48) == 32 ? tint.getColorDark() : tint.getColor();
                    } else {
                        colorDark = 0;
                    }
                    if (colorDark != 0) {
                        tint = carColorE.mutate();
                        tint.getClass();
                        tint.setTint(colorDark);
                    } else {
                        tint = carColorE;
                    }
                }
            }
            objG = tint == null ? new defpackage.cnd(defpackage.cjv.j(0)) : new lge(tint);
            bveVar.x(objG);
        }
        return (defpackage.cne) objG;
    }

    public static final androidx.car.app.model.CarIcon y(android.content.Context context, int i, boolean z) {
        context.getClass();
        defpackage.to toVar = new defpackage.to(androidx.core.graphics.drawable.IconCompat.m(context, i));
        if (z) {
            toVar.a(androidx.car.app.model.CarColor.createCustom(-16777216, -1));
        }
        return new androidx.car.app.model.CarIcon(toVar);
    }

    public static final boolean z(android.content.Context context) {
        context.getClass();
        java.lang.Object systemService = context.getSystemService("activity");
        systemService.getClass();
        android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
        try {
            return activityManager.isLowRamDevice();
        } catch (java.lang.VerifyError e) {
            ((defpackage.ype) ((defpackage.ype) pmd.a.h()).p(e).ai(6799)).w("Expected isLowRamDevice API from version %d", android.os.Build.VERSION.SDK_INT);
            android.app.ActivityManager.MemoryInfo memoryInfo = new android.app.ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return memoryInfo.totalMem <= 1073741824;
        }
    }
}
