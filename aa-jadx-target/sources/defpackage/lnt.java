package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class lnt {
    public static pnj a;
    public static pnk b;

    public static void A(java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            if (!str.startsWith(str2)) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Prefix '%s' required for thread name '%s'.", str2, str));
            }
        } else if (str.length() > 15) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Thread name %s can't be longer than the systrace limit of %d.", str, 15));
        }
    }

    public static void B(defpackage.zhs zhsVar, java.util.concurrent.Executor executor) {
        defpackage.ysr.cy(zhsVar, new pse(), executor);
    }

    public static final boolean C(android.content.Context context) {
        try {
            return defpackage.htw.w((android.app.ActivityManager) context.getSystemService("activity"));
        } catch (vbi unused) {
            return false;
        }
    }

    public static boolean D(int i) {
        return i == 2 || i == 4;
    }

    public static final com.google.android.apps.gmm.systems.accounts.GmmAccount E(android.accounts.Account account) {
        int i;
        com.google.android.apps.gmm.systems.accounts.GmmAccount gmmAccount;
        com.google.android.apps.gmm.systems.accounts.GmmAccount incognitoAccount;
        if (account instanceof com.google.android.apps.gmm.systems.accounts.GmmAccount) {
            gmmAccount = (com.google.android.apps.gmm.systems.accounts.GmmAccount) account;
        } else {
            if (defpackage.afga.f(account.type, "com.google")) {
                i = 2;
            } else {
                if (!defpackage.afga.f(account.type, "com.google.android.apps.maps")) {
                    java.lang.String str = account.type;
                    throw new java.lang.IllegalArgumentException("GmmAccount requires a known type. ");
                }
                if (defpackage.afga.f(account.name, com.google.android.apps.gmm.systems.accounts.GmmAccount.SignedOut.a.name)) {
                    i = 4;
                } else {
                    java.lang.String str2 = account.name;
                    str2.getClass();
                    i = afzh.g(str2, "incognito@", false) ? 3 : 1;
                }
            }
            int i2 = i - 1;
            if (i2 != 0) {
                if (i2 == 2) {
                    java.lang.String str3 = account.name;
                    str3.getClass();
                    incognitoAccount = new com.google.android.apps.gmm.systems.accounts.IncognitoAccount(str3);
                } else if (i2 != 3) {
                    java.lang.String str4 = account.name;
                    str4.getClass();
                    java.lang.String str5 = account.type;
                    str5.getClass();
                    incognitoAccount = new com.google.android.apps.gmm.systems.accounts.GoogleAccount(str4, str5);
                } else {
                    gmmAccount = com.google.android.apps.gmm.systems.accounts.GmmAccount.SignedOut.a;
                }
                gmmAccount = incognitoAccount;
            } else {
                gmmAccount = com.google.android.apps.gmm.systems.accounts.GmmAccount.Unknown.a;
            }
        }
        return gmmAccount == null ? com.google.android.apps.gmm.systems.accounts.GmmAccount.SignedOut.a : gmmAccount;
    }

    public static final boolean F(java.lang.String str) {
        return str != null && afzh.g(str, " ", false);
    }

    public static final boolean G(android.accounts.Account account) {
        return defpackage.afga.f(account != null ? account.type : null, "com.google");
    }

    public static final boolean H(android.accounts.Account account) {
        if (defpackage.afga.f(account != null ? account.type : null, "com.google.android.apps.maps")) {
            java.lang.String str = account.name;
            str.getClass();
            if (afzh.g(str, "incognito@", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [abpy, java.lang.Object] */
    public static defpackage.abpy I(abqe abqeVar, java.nio.ByteBuffer byteBuffer, defpackage.abol abolVar) throws java.io.IOException {
        byte[] bArrC;
        int i;
        int i2 = byteBuffer.getInt();
        if (i2 < 0) {
            int iAbs = java.lang.Math.abs(i2);
            byte[] bArr = new byte[iAbs];
            byteBuffer.get(bArr);
            int i3 = iAbs < 4 ? 0 : ((bArr[iAbs - 1] & 255) << 24) + ((bArr[iAbs - 2] & 255) << 16) + ((bArr[iAbs - 3] & 255) << 8) + (bArr[iAbs - 4] & 255);
            try {
                java.util.zip.GZIPInputStream gZIPInputStream = new java.util.zip.GZIPInputStream(new java.io.ByteArrayInputStream(bArr, 0, iAbs), java.lang.Math.min(java.lang.Math.max(i3, iAbs) + 10, 8192));
                try {
                    if (i3 <= 10000000) {
                        bArrC = new byte[i3];
                        int i4 = 0;
                        while (i4 < i3 && (i = gZIPInputStream.read(bArrC, i4, i3 - i4)) != -1) {
                            i4 += i;
                        }
                        if (i4 < i3) {
                            bArrC = java.util.Arrays.copyOf(bArrC, i4);
                        } else {
                            int i5 = gZIPInputStream.read();
                            if (i5 != -1) {
                                boolean z = true;
                                byte[][] bArr2 = {bArrC, new byte[]{(byte) i5}, defpackage.yux.c(gZIPInputStream)};
                                long length = 0;
                                for (int i6 = 0; i6 < 3; i6++) {
                                    length += (long) bArr2[i6].length;
                                }
                                int i7 = (int) length;
                                if (length != i7) {
                                    z = false;
                                }
                                defpackage.ysr.bb(z, "the total number of elements (%s) in the arrays must fit in an int", length);
                                bArrC = new byte[i7];
                                int i8 = 0;
                                for (int i9 = 0; i9 < 3; i9++) {
                                    byte[] bArr3 = bArr2[i9];
                                    int length2 = bArr3.length;
                                    java.lang.System.arraycopy(bArr3, 0, bArrC, i8, length2);
                                    i8 += length2;
                                }
                            }
                        }
                    } else {
                        bArrC = defpackage.yux.c(gZIPInputStream);
                    }
                    gZIPInputStream.close();
                } catch (java.lang.Throwable th) {
                    try {
                        gZIPInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.io.IOException e) {
                throw new java.lang.RuntimeException(e);
            }
        } else {
            byte[] bArr4 = new byte[i2];
            byteBuffer.get(bArr4);
            bArrC = bArr4;
        }
        return abqeVar.j(bArrC, abolVar);
    }

    public static void J(java.io.DataOutputStream dataOutputStream, defpackage.abpy abpyVar) throws java.io.IOException {
        byte[] bArrH = abpyVar.h();
        int length = bArrH.length;
        if (length > 250) {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(length);
            java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArrH);
                gZIPOutputStream.close();
                if (byteArrayOutputStream.size() < length) {
                    dataOutputStream.writeInt(-byteArrayOutputStream.size());
                    byteArrayOutputStream.writeTo(dataOutputStream);
                    return;
                }
            } catch (java.lang.Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        dataOutputStream.writeInt(length);
        dataOutputStream.write(bArrH);
    }

    public static aatu K(pmv pmvVar) {
        acfi acfiVarA = pmvVar.a(acfh.e);
        return acfiVarA.c == 4 ? (aatu) acfiVarA.d : aatu.a;
    }

    public static aavq L(pmv pmvVar) {
        acfi acfiVarA = pmvVar.a(acfh.dN);
        return acfiVarA.c == 248 ? (aavq) acfiVarA.d : aavq.a;
    }

    public static aavr M(pmv pmvVar) {
        acfi acfiVarA = pmvVar.a(acfh.dI);
        return acfiVarA.c == 240 ? (aavr) acfiVarA.d : aavr.a;
    }

    public static abhl N(pmv pmvVar) {
        acfi acfiVarA = pmvVar.a(acfh.O);
        return acfiVarA.c == 39 ? (abhl) acfiVarA.d : abhl.a;
    }

    private static final java.lang.String O(java.util.List list) {
        return defpackage.afga.bo(list, " • ", null, null, new defpackage.ltk(17), 30);
    }

    public static void a() {
    }

    public static android.content.Intent b(android.content.ComponentName componentName, java.lang.String str, android.os.Bundle bundle) {
        defpackage.ysr.aY(!android.text.TextUtils.isEmpty(str), "search query is null");
        android.content.Intent intent = new android.content.Intent("MEDIA_SHOW_SEARCH_RESULTS");
        intent.setComponent(componentName);
        intent.putExtra("search_extras", bundle);
        intent.putExtra("query", str);
        return intent;
    }

    public static android.content.Intent c(android.content.ComponentName componentName) {
        defpackage.ljw ljwVarD = defpackage.ljw.d();
        boolean zContains = false;
        if (componentName != null && defpackage.actb.u()) {
            defpackage.yhx yhxVar = ljwVarD.e;
            if (yhxVar == null) {
                defpackage.yhv yhvVar = new defpackage.yhv();
                java.util.List<android.content.pm.ResolveInfo> listQueryIntentServices = defpackage.mkp.a.c.getPackageManager().queryIntentServices(new android.content.Intent("androidx.car.app.media.action.SHOW_MEDIA_PLAYBACK"), 0);
                listQueryIntentServices.getClass();
                java.util.ArrayList<android.content.pm.ResolveInfo> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listQueryIntentServices) {
                    if (((android.content.pm.ResolveInfo) obj).serviceInfo != null) {
                        arrayList.add(obj);
                    }
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(arrayList, 10));
                for (android.content.pm.ResolveInfo resolveInfo : arrayList) {
                    arrayList2.add(new android.content.ComponentName(resolveInfo.serviceInfo.packageName, resolveInfo.serviceInfo.name));
                }
                yhvVar.k(arrayList2);
                ljwVarD.e = yhvVar.g();
                defpackage.ljw.b.l().y("playbackIntentSupportedApps: %s", ljwVarD.e);
                yhxVar = ljwVarD.e;
            }
            if (yhxVar != null) {
                zContains = yhxVar.contains(componentName);
            }
        }
        android.content.Intent intent = new android.content.Intent(true != zContains ? "MEDIA_SHOW_PLAYBACK_VIEW" : "androidx.car.app.media.action.SHOW_MEDIA_PLAYBACK");
        intent.setComponent(componentName);
        return intent;
    }

    public static boolean d(android.content.Intent intent) {
        return !defpackage.jrk.d(intent);
    }

    public static boolean e(android.content.Intent intent) {
        if (intent.getComponent() != null) {
            return j$.util.Objects.equals(intent.getAction(), "MEDIA_SHOW_PLAYBACK_VIEW") || j$.util.Objects.equals(intent.getAction(), "androidx.car.app.media.action.SHOW_MEDIA_PLAYBACK");
        }
        return false;
    }

    public static final ltx f(android.net.Uri uri) {
        java.lang.String path;
        if (uri == null || !defpackage.afga.f(uri.getScheme(), "android.resource") || (path = uri.getPath()) == null || !afzh.u(path, "station_icon_fallback", false)) {
            return null;
        }
        android.content.res.Resources resources = defpackage.mkp.a.c.getResources();
        java.lang.String authority = uri.getAuthority();
        if (authority == null) {
            authority = "com.google.android.projection.gearhead";
        }
        java.lang.String lastPathSegment = uri.getLastPathSegment();
        lastPathSegment.getClass();
        int identifier = resources.getIdentifier(lastPathSegment, uri.getPathSegments().get(0), authority);
        if (identifier != 0) {
            return new ltx(authority, identifier);
        }
        return null;
    }

    public static final java.lang.String g(defpackage.lmk lmkVar, java.lang.String str, java.lang.String str2) {
        java.lang.String strQ = lmkVar.Q(str);
        java.lang.String str3 = null;
        if (strQ == null || true == afzh.v(strQ)) {
            strQ = null;
        }
        java.lang.String strQ2 = lmkVar.Q(str2);
        if (strQ2 != null && true != afzh.v(strQ2)) {
            str3 = strQ2;
        }
        return O(defpackage.afga.bU(new java.lang.String[]{strQ, str3}));
    }

    public static final java.lang.String h(defpackage.lmk lmkVar, java.lang.String str, java.lang.String str2) {
        java.lang.String strQ = lmkVar.Q("com.google.android.apps.auto.radio.FREQUENCY");
        java.lang.String str3 = null;
        if (strQ == null || true == afzh.v(strQ)) {
            strQ = null;
        }
        java.lang.String strQ2 = lmkVar.Q(str);
        if (strQ2 == null || true == afzh.v(strQ2)) {
            strQ2 = null;
        }
        java.lang.String strQ3 = lmkVar.Q(str2);
        if (strQ3 != null && true != afzh.v(strQ3)) {
            str3 = strQ3;
        }
        return O(defpackage.afga.bU(new java.lang.String[]{strQ, strQ2, str3}));
    }

    public static /* synthetic */ java.lang.String i(int i) {
        if (i == 1) {
            return "LOADING";
        }
        if (i != 2) {
            return i != 3 ? "DISCONNECTED" : "ERROR";
        }
        return "LOADED";
    }

    public static luj j() {
        return (luj) defpackage.mkp.a.i(luj.class);
    }

    public static defpackage.lui k() {
        return (defpackage.lui) defpackage.mkp.a.i(defpackage.lui.class);
    }

    public static defpackage.lud l() {
        return (defpackage.lud) defpackage.mkp.a.i(defpackage.lud.class);
    }

    public static defpackage.luc m() {
        return (defpackage.luc) defpackage.mkp.a.i(defpackage.luc.class);
    }

    public static final androidx.car.app.model.CarIconSpan n(int i) {
        android.content.Context context = defpackage.mkp.a.c;
        context.getClass();
        return androidx.car.app.model.CarIconSpan.create(tim.d(context, i, new defpackage.llk(11)), 2);
    }

    public static final androidx.car.app.model.Action o(java.lang.CharSequence charSequence) {
        tb tbVar = new tb();
        tbVar.e(charSequence);
        tbVar.b(androidx.car.app.model.CarColor.createCustom(0, 0));
        return tbVar.a();
    }

    public static final boolean p(com.google.android.apps.auto.components.media.compat.AaPlaybackState aaPlaybackState, defpackage.lmk lmkVar, android.content.ComponentName componentName) {
        onp onpVarC = defpackage.onn.c(aaPlaybackState, lmkVar);
        return onpVarC == onp.b || onpVarC == onp.c || defpackage.kzi.r().h(componentName);
    }

    public static final boolean q(lmj lmjVar) {
        java.lang.String string;
        if (lmjVar.O() != null) {
            return true;
        }
        android.net.Uri uriP = lmjVar.P();
        return (uriP == null || (string = uriP.toString()) == null || string.length() <= 0) ? false : true;
    }

    public static final llb r(android.net.Uri uri, defpackage.affc affcVar) {
        boolean z = java.lang.Boolean.parseBoolean(uri.getPathSegments().get(0));
        android.net.Uri uri2 = android.net.Uri.parse(uri.getPathSegments().get(1));
        uri2.getClass();
        return new llb(z, affcVar.invoke(uri2));
    }

    public static final rb s(qs qsVar, mot motVar) {
        return new tie(qsVar, new lkz(0), new defpackage.jxq(qsVar, motVar, 17));
    }

    public static final void t(java.util.List list, android.content.ComponentName componentName) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.lma lmaVar = (defpackage.lma) it.next();
            defpackage.oio oioVarA = defpackage.oio.a();
            defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.fF);
            rrvVarH.p(componentName);
            rrvVarH.z(((android.support.v4.media.MediaBrowserCompat.MediaItem) lmaVar.b).a);
            oioVarA.b((defpackage.rrw) rrvVarH.l());
        }
        java.util.Iterator it2 = list.iterator();
        boolean zContainsKey = false;
        boolean zContainsKey2 = false;
        boolean zContainsKey3 = false;
        boolean zContainsKey4 = false;
        boolean z = false;
        boolean z2 = false;
        while (it2.hasNext()) {
            defpackage.lma lmaVar2 = (defpackage.lma) it2.next();
            android.os.Bundle bundleN = lmaVar2.h().n();
            zContainsKey |= bundleN.containsKey("android.media.browse.CONTENT_STYLE_SINGLE_ITEM_HINT");
            zContainsKey2 |= bundleN.containsKey("androidx.media.MediaItem.Extras.COMPLETION_PERCENTAGE");
            zContainsKey3 |= bundleN.containsKey("android.media.browse.CONTENT_STYLE_PLAYABLE_HINT");
            zContainsKey4 |= bundleN.containsKey("android.media.browse.CONTENT_STYLE_BROWSABLE_HINT");
            defpackage.htw htwVar = new defpackage.htw(lmaVar2.h().n());
            java.util.List listAc = defpackage.afga.ac(htwVar.j(true), htwVar.j(false), htwVar.k());
            if (!listAc.isEmpty()) {
                java.util.Iterator it3 = listAc.iterator();
                while (it3.hasNext()) {
                    if (((llg) it3.next()) == llg.b) {
                        z = true;
                        break;
                    }
                }
            }
            java.util.List listAc2 = defpackage.afga.ac(htwVar.m(true), htwVar.m(false), htwVar.l());
            if (!listAc2.isEmpty()) {
                java.util.Iterator it4 = listAc2.iterator();
                while (it4.hasNext()) {
                    if (defpackage.afga.f((java.lang.Boolean) it4.next(), java.lang.Boolean.TRUE)) {
                        z2 = true;
                        break;
                    }
                }
            }
            if (zContainsKey) {
                defpackage.oio oioVarA2 = defpackage.oio.a();
                defpackage.rrv rrvVarH2 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.fD);
                rrvVarH2.p(componentName);
                oioVarA2.b((defpackage.rrw) rrvVarH2.l());
            }
            if (zContainsKey2) {
                defpackage.oio oioVarA3 = defpackage.oio.a();
                defpackage.rrv rrvVarH3 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.fE);
                rrvVarH3.p(componentName);
                oioVarA3.b((defpackage.rrw) rrvVarH3.l());
            }
            if (zContainsKey3) {
                defpackage.oio oioVarA4 = defpackage.oio.a();
                defpackage.rrv rrvVarH4 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.fP);
                rrvVarH4.p(componentName);
                oioVarA4.b((defpackage.rrw) rrvVarH4.l());
            }
            if (zContainsKey4) {
                defpackage.oio oioVarA5 = defpackage.oio.a();
                defpackage.rrv rrvVarH5 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.fO);
                rrvVarH5.p(componentName);
                oioVarA5.b((defpackage.rrw) rrvVarH5.l());
            }
            if (z) {
                defpackage.oio oioVarA6 = defpackage.oio.a();
                defpackage.rrv rrvVarH6 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.fM);
                rrvVarH6.p(componentName);
                oioVarA6.b((defpackage.rrw) rrvVarH6.l());
            }
            if (z2) {
                defpackage.oio oioVarA7 = defpackage.oio.a();
                defpackage.rrv rrvVarH7 = defpackage.rrw.h(defpackage.yzd.GEARHEAD, defpackage.zbe.MEDIA_FACET, defpackage.zbd.fN);
                rrvVarH7.p(componentName);
                oioVarA7.b((defpackage.rrw) rrvVarH7.l());
            }
        }
    }

    public static final int u(int i, android.content.Context context) {
        return defpackage.afhi.k(i * context.getResources().getDisplayMetrics().density);
    }

    public static final int v(rc rcVar) {
        java.util.Collection collectionB = rcVar.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collectionB) {
            if (defpackage.afga.f(((rb) obj).c, "BROWSE")) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() - 1;
    }

    public static java.lang.String w(acdd acddVar) {
        switch (acddVar.ordinal()) {
            case 15:
                return "acfr";
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 35:
            case 36:
            case 37:
            case 38:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 76:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 128:
            case 129:
            case 132:
            case 133:
            case 134:
            case 138:
            case 140:
            case 142:
            case 148:
            case 157:
            case 158:
            case 159:
            case 161:
            case 163:
            case 164:
            case 170:
            case 171:
            case 173:
            case 174:
            case 175:
            case 180:
            case 188:
            case 189:
            case 190:
            case 197:
            case 199:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 226:
            case 235:
            case 238:
            case 240:
            case 242:
            case 243:
            case 244:
            case 245:
            case 246:
            case 247:
            case 248:
            case 252:
            case 253:
            case 254:
            case 255:
            case 256:
            case 257:
            case 258:
            case 259:
            case 260:
            case 261:
            case 262:
            case 263:
            case 264:
            case 267:
            case 271:
            case 274:
            case 277:
            case 279:
            case 280:
            case 296:
            case 297:
            case 299:
            case 300:
            case 304:
            case 305:
            case 307:
            case 308:
            case 310:
            case 311:
            case 339:
            case 340:
            case 345:
            case 354:
            case 356:
            case 357:
            case 358:
            case 359:
            case 360:
            case 361:
            case 364:
            case 367:
            case 374:
            case 375:
            case 377:
            case 378:
            case 380:
            case 381:
            case 382:
            case 383:
            case 384:
            case 385:
            case 386:
            case 387:
            case 397:
            case 418:
            case 426:
            case 438:
            case 439:
            case 440:
            case 448:
            case 450:
            case 455:
            case 456:
            case 457:
            case 459:
            case 460:
            case 461:
            case 462:
            case 465:
            case 489:
            case 517:
            case 523:
            case 534:
            case 555:
            case 567:
            case 577:
            case 587:
            case 588:
            case 589:
            default:
                return "";
            case 34:
                return "acgs";
            case 39:
                return "acix";
            case 50:
                return "acge";
            case 53:
                return "aapf";
            case 75:
                return "accv";
            case 77:
                return "ackb";
            case 97:
                return "acgj";
            case 98:
                return "acgk";
            case 108:
                return "ackh";
            case 120:
                return "aakp";
            case 127:
                return "acir";
            case 130:
                return "acfz";
            case 131:
                return "acfy";
            case 135:
                return "achr";
            case 136:
                return "ache";
            case 137:
                return "acgw";
            case 139:
                return "acie";
            case 141:
                return "acci";
            case 143:
                return "acep";
            case 144:
                return "achh";
            case 145:
                return "aarc";
            case 146:
                return "acfq";
            case 147:
                return "aare";
            case 149:
                return "aarf";
            case 150:
                return "achi";
            case 151:
                return "aari";
            case 152:
                return "achg";
            case 153:
                return "achb";
            case 154:
                return "accl";
            case 155:
                return "aaqu";
            case 156:
                return "aarb";
            case 160:
                return "acdm";
            case 162:
                return "acen";
            case 165:
                return "aarh";
            case 166:
                return "aard";
            case 167:
                return "ackd";
            case 168:
                return "aaqs";
            case 169:
                return "acff";
            case 172:
                return "acgc";
            case 176:
                return "acih";
            case 177:
                return "aaqr";
            case 178:
                return "acgb";
            case 179:
                return "aaqt";
            case 181:
                return "acdu";
            case 182:
                return "acdv";
            case 183:
                return "aceq";
            case 184:
                return "acft";
            case 185:
                return "acdt";
            case 186:
                return "achw";
            case 187:
                return "aarj";
            case 191:
                return "com.google.wireless.googlenav.proto.MapsActivitiesTimelineRequest$MapsActivitiesTimelineRequestProto";
            case 192:
                return "aceo";
            case 193:
                return "com.google.wireless.googlenav.proto.MapsActivitiesHistoryEditRequest$MapsActivitiesHistoryEditRequestProto";
            case 194:
                return "com.google.wireless.googlenav.proto.MapsActivitiesDeleteDataRequest$MapsActivitiesDeleteDataRequestProto";
            case 195:
                return "achf";
            case 196:
                return "com.google.wireless.googlenav.proto.PersonalPlacesRequest$PersonalPlacesRequestProto";
            case 198:
                return "aaqy";
            case 200:
                return "com.google.wireless.googlenav.proto.UserPrefsReadRequest$UserPrefsReadRequestProto";
            case 201:
                return "com.google.wireless.googlenav.proto.UserPrefsWriteRequest$UserPrefsWriteRequestProto";
            case 202:
                return "aasi";
            case 203:
                return "aash";
            case 204:
                return "aasj";
            case 205:
                return "aarn";
            case 206:
                return "com.google.wireless.googlenav.proto.RiddlerFollowOnRequest$RiddlerFollowOnRequestProto";
            case 207:
                return "com.google.maps.gmm.ListRiddlerQuestionsRequest";
            case 208:
                return "com.google.maps.gmm.ListRiddlerQuestionsDeidentifiedRequest";
            case 209:
                return "aapc";
            case 210:
                return "aapd";
            case 216:
                return "aape";
            case 217:
                return "com.google.maps.gmm.LocationSharingUploadLocationRequest";
            case 218:
                return "aaqv";
            case 219:
                return "aajt";
            case 220:
                return "aake";
            case 221:
                return "aaqw";
            case 222:
                return "aasb";
            case 223:
                return "aasg";
            case 224:
                return "aara";
            case 225:
                return "com.google.wireless.googlenav.proto.UserContributionsRequest$UserContributionsRequestProto";
            case 227:
                return "com.google.wireless.googlenav.proto.PersonalNotesRequest$PersonalNotesRequestProto";
            case 228:
                return "aapq";
            case 229:
                return "aapr";
            case 230:
                return "aaps";
            case 231:
                return "acho";
            case 232:
                return "aakt";
            case 233:
                return "acio";
            case 234:
                return "aapp";
            case 236:
                return "com.google.wireless.googlenav.proto.AliasStickerRequestProto";
            case 237:
                return "aaoy";
            case 239:
                return "achp";
            case 241:
                return "acdi";
            case 249:
                return "aapu";
            case 250:
                return "aalx";
            case 251:
                return "aark";
            case 265:
                return "aase";
            case 266:
                return "com.google.maps.gmm.ThumbsVoteRequest";
            case 268:
                return "aanv";
            case 269:
                return "aapi";
            case 270:
                return "com.google.maps.gmm.PromotedPinAdsRequestProto";
            case 272:
                return "aapg";
            case 273:
                return "aaph";
            case 275:
                return "com.google.maps.gmm.AdBlockRequest";
            case 276:
                return "com.google.wireless.googlenav.proto.OfflineGetRegionSizeRequest$OfflineGetRegionSizeRequestProto";
            case 278:
                return "aapb";
            case 281:
                return "com.google.maps.gmm.AddressDataFeedbackRequest";
            case 282:
                return "com.google.maps.gmm.GetBuildingEntranceEditingDataRequest";
            case 283:
                return "aapt";
            case 284:
                return "com.google.maps.gmm.PlaceQaAnswerWriteRequest";
            case 285:
                return "com.google.maps.gmm.PlaceQaQuestionWriteRequest";
            case 286:
                return "com.google.maps.gmm.SuggestPlaceQaTaggableEntitiesRequest";
            case 287:
                return "com.google.maps.gmm.PlaceQaUserContributionsRequest";
            case 288:
                return "com.google.maps.gmm.PlaceQaVoteRequest";
            case 289:
                return "aaql";
            case 290:
                return "com.google.maps.gmm.PlaceQaRepliesRequest";
            case 291:
                return "com.google.maps.gmm.WritePlaceQaReplyRequest";
            case 292:
                return "aamu";
            case 293:
                return "aapa";
            case 294:
                return "aasf";
            case 295:
                return "com.google.maps.gmm.LocalPostsRequest";
            case 298:
                return "aanu";
            case 301:
                return "aaoz";
            case 302:
                return "com.google.maps.gmm.AreaTrafficRequest";
            case 303:
                return "aaqb";
            case 306:
                return "abap";
            case 309:
                return "com.google.maps.gmm.TransactionsGetUserStreamRequest";
            case 312:
                return "com.google.maps.gmm.SendPostTripNotificationRequest";
            case 313:
                return "com.google.maps.gmm.WritePostTripAnswerRequest";
            case 314:
                return "com.google.maps.gmm.GetPostTripQuestionsRequest";
            case 315:
                return "com.google.maps.gmm.CreateShareableUrlRequest";
            case 316:
                return "com.google.maps.gmm.CreateEntityListRequest";
            case 317:
                return "com.google.maps.gmm.DeleteEntityListRequest";
            case 318:
                return "com.google.maps.gmm.CreateEntityListItemRequest";
            case 319:
                return "com.google.maps.gmm.DeleteEntityListItemRequest";
            case 320:
                return "com.google.maps.gmm.CreateEntityListItemCustomDataRequest";
            case 321:
                return "com.google.maps.gmm.DeleteEntityListItemCustomDataRequest";
            case 322:
                return "com.google.maps.gmm.GetEntityListParticipantsRequest";
            case 323:
                return "com.google.maps.gmm.GetEntityListRecommendationsRequest";
            case 324:
                return "aalt";
            case 325:
                return "com.google.maps.gmm.ListEntityListsRequest";
            case 326:
                return "com.google.maps.gmm.ShareEntityListRequest";
            case 327:
                return "com.google.maps.gmm.UpdateEntityListRequest";
            case 328:
                return "com.google.maps.gmm.UpdateEntityListItemRequest";
            case 329:
                return "com.google.maps.gmm.UpdateEntityListItemCustomDataRequest";
            case 330:
                return "com.google.maps.gmm.UpdateEntityListRoleRequest";
            case 331:
                return "com.google.maps.gmm.UpdateEntityListVisibilityRequest";
            case 332:
                return "com.google.maps.gmm.CreateEntityListCustomDataRequest";
            case 333:
                return "com.google.maps.gmm.DeleteEntityListCustomDataRequest";
            case 334:
                return "com.google.maps.gmm.UpdateEntityListCustomDataRequest";
            case 335:
                return "aanw";
            case 336:
                return "aanx";
            case 337:
                return "aany";
            case 338:
                return "aaof";
            case 341:
                return "com.google.maps.gmm.PhotoVoteRequest";
            case 342:
                return "aarm";
            case 343:
                return "com.google.maps.gmm.localstream.LocalStreamFeedbackRequest";
            case 344:
                return "com.google.maps.gmm.localstream.LocalStreamDeleteCardRequest";
            case 346:
                return "com.google.maps.gmm.LocalStreamCreateMutedPlacesRequest";
            case 347:
                return "com.google.maps.gmm.LocalStreamDeleteMutedPlacesRequest";
            case 348:
                return "com.google.maps.gmm.LocalStreamUpdateAreasRequest";
            case 349:
                return "com.google.maps.gmm.LocalStreamDeleteTripDestinationsRequest";
            case 350:
                return "com.google.maps.gmm.localstream.LocalStreamVerifyAreaRequest";
            case 351:
                return "com.google.maps.gmm.LocalStreamEnablePlaceListsRequest";
            case 352:
                return "com.google.maps.gmm.LocalStreamDisablePlaceListsRequest";
            case 353:
                return "aaoc";
            case 355:
                return "com.google.maps.gmm.PlaceVisitStatsRequest";
            case 362:
                return "com.google.maps.gmm.GetEntityListHeroImagesRequest";
            case 363:
                return "com.google.maps.gmm.TransitLinesRequest";
            case 365:
                return "com.google.maps.gmm.GetEntityListMetadataRequest";
            case 366:
                return "aajw";
            case 368:
                return "com.google.maps.gmm.SendShareRequest";
            case 369:
                return "aamy";
            case 370:
                return "com.google.maps.gmm.SynthesizeTextRequest";
            case 371:
                return "aaqh";
            case 372:
                return "com.google.maps.gmm.GetCreatorProfileRequest";
            case 373:
                return "com.google.maps.gmm.EditCreatorProfileRequest";
            case 376:
                return "aamf";
            case 379:
                return "com.google.maps.gmm.UpdateDiscoveryPrefsRequest";
            case 388:
                return "com.google.maps.gmm.GetPlaceInsightsRequest";
            case 389:
                return "aaod";
            case 390:
                return "aanm";
            case 391:
                return "aamx";
            case 392:
                return "aamw";
            case 393:
                return "aanl";
            case 394:
                return "aame";
            case 395:
                return "aaqd";
            case 396:
                return "aajz";
            case 398:
                return "aamv";
            case 399:
                return "aakf";
            case 400:
                return "aakq";
            case 401:
                return "aanr";
            case 402:
                return "aaos";
            case 403:
                return "aasc";
            case 404:
                return "aask";
            case 405:
                return "aakc";
            case 406:
                return "aakn";
            case 407:
                return "com.google.maps.gmm.WriteOwnerResponseToReviewRequest";
            case 408:
                return "com.google.maps.gmm.DeleteOwnerResponseToReviewRequest";
            case 409:
                return "com.google.maps.gmm.BusinessCategoriesRequest";
            case 410:
                return "com.google.maps.gmm.DeleteLocalPostRequest";
            case 411:
                return "com.google.maps.gmm.CreateLocalPostRequest";
            case 412:
                return "com.google.maps.gmm.UpdateLocalPostRequest";
            case 413:
                return "aalg";
            case 414:
                return "aakw";
            case 415:
                return "aaks";
            case 416:
                return "aaol";
            case 417:
                return "aaku";
            case 419:
                return "aalj";
            case 420:
                return "aaoa";
            case 421:
                return "aarv";
            case 422:
                return "aani";
            case 423:
                return "aapj";
            case 424:
                return "aakv";
            case 425:
                return "aaln";
            case 427:
                return "aale";
            case 428:
                return "aanq";
            case 429:
                return "aaml";
            case 430:
                return "aasa";
            case 431:
                return "com.google.maps.gmm.GetCallTranscriptRequest";
            case 432:
                return "aakh";
            case 433:
                return "aaoi";
            case 434:
                return "aaoe";
            case 435:
                return "aaob";
            case 436:
                return "com.google.maps.gmm.ListPublicEntityListsForUserRequest";
            case 437:
                return "aami";
            case 441:
                return "aaoh";
            case 442:
                return "aarx";
            case 443:
                return "aaka";
            case 444:
                return "aakl";
            case 445:
                return "aali";
            case 446:
                return "aart";
            case 447:
                return "aamt";
            case 449:
                return "aamq";
            case 451:
                return "aalh";
            case 452:
                return "aars";
            case 453:
                return "aajp";
            case 454:
                return "aams";
            case 458:
                return "aaqp";
            case 463:
                return "aaoj";
            case 464:
                return "aapy";
            case 466:
                return "aarr";
            case 467:
                return "com.google.maps.gmm.DeleteSearchHistorySuggestRequest";
            case 468:
                return "aamh";
            case 469:
                return "aaly";
            case 470:
                return "aann";
            case 471:
                return "aano";
            case 472:
                return "aaqj";
            case 473:
                return "aalf";
            case 474:
                return "aalm";
            case 475:
                return "aamk";
            case 476:
                return "aaro";
            case 477:
                return "aalw";
            case 478:
                return "aasl";
            case 479:
                return "aako";
            case 480:
                return "aaom";
            case 481:
                return "aapo";
            case 482:
                return "aalo";
            case 483:
                return "aalp";
            case 484:
                return "aalq";
            case 485:
                return "aalr";
            case 486:
                return "aang";
            case 487:
                return "aanh";
            case 488:
                return "aakr";
            case 490:
                return "aasd";
            case 491:
                return "aamb";
            case 492:
                return "com.google.maps.gmm.GetRiddlerFamiliarPlacesRequest";
            case 493:
                return "aakx";
            case 494:
                return "aaov";
            case 495:
                return "aaow";
            case 496:
                return "aaou";
            case 497:
                return "aaop";
            case 498:
                return "aamj";
            case 499:
                return "com.google.maps.gmm.SuggestEditByChatRequest";
            case 500:
                return "aaqo";
            case 501:
                return "aama";
            case 502:
                return "aaqc";
            case 503:
                return "aanj";
            case 504:
                return "aary";
            case 505:
                return "aalv";
            case 506:
                return "aaqa";
            case 507:
                return "aajr";
            case 508:
                return "aaky";
            case 509:
                return "com.google.maps.gmm.OfflineGetDataViewRequest";
            case 510:
                return "aaor";
            case 511:
                return "aamg";
            case 512:
                return "aaok";
            case 513:
                return "aapz";
            case 514:
                return "aarz";
            case 515:
                return "aaoq";
            case 516:
                return "com.google.maps.gmm.DecodeUrlRequest";
            case 518:
                return "aanp";
            case 519:
                return "aank";
            case 520:
                return "aalb";
            case 521:
                return "aakz";
            case 522:
                return "aapw";
            case 524:
                return "aamp";
            case 525:
                return "aalz";
            case 526:
                return "aala";
            case 527:
                return "com.google.maps.gmm.GetMidTripUgcImpactRequest";
            case 528:
                return "com.google.maps.gmm.DeleteUserFactualEditRequest";
            case 529:
                return "aaqn";
            case 530:
                return "aaog";
            case 531:
                return "aaoo";
            case 532:
                return "aald";
            case 533:
                return "com.google.maps.gmm.GetPlacesAggregationForUserPrototypeRequest";
            case 535:
                return "com.google.maps.gmm.GetPlacesToAnnotatePrototypeRequest";
            case 536:
                return "com.google.maps.gmm.SubmitPlaceAnnotationsPrototypeRequest";
            case 537:
                return "com.google.maps.gmm.GetUserAnnotationAggregatesPrototypeRequest";
            case 538:
                return "com.google.maps.gmm.GetSimilarPlacesPrototypeRequest";
            case 539:
                return "aapx";
            case 540:
                return "aajy";
            case 541:
                return "aalu";
            case 542:
                return "aaki";
            case 543:
                return "aaru";
            case 544:
                return "aaqi";
            case 545:
                return "aakj";
            case 546:
                return "aamm";
            case 547:
                return "aaon";
            case 548:
                return "aarp";
            case 549:
                return "aals";
            case 550:
                return "com.google.maps.gmm.ListAddressEditingChildSubregionsRequest";
            case 551:
                return "com.google.maps.gmm.ListAddressEditingCountriesRequest";
            case 552:
                return "com.google.maps.gmm.GetAddressEditingCountryMetadataRequest";
            case 553:
                return "com.google.maps.gmm.CreateArrivalProblemReportRequest";
            case 554:
                return "aans";
            case 556:
                return "com.google.maps.gmm.GetKnowBeforeYouGoSummariesRequest";
            case 557:
                return "aapk";
            case 558:
                return "aanz";
            case 559:
                return "aakg";
            case 560:
                return "aajs";
            case 561:
                return "aaqe";
            case 562:
                return "aant";
            case 563:
                return "aanb";
            case 564:
                return "aanc";
            case 565:
                return "aand";
            case 566:
                return "aaot";
            case 568:
                return "com.google.maps.gmm.CallAskMapsAgentRequest";
            case 569:
                return "com.google.maps.gmm.StartBulkDeleteContributionsRequest";
            case 570:
                return "aamn";
            case 571:
                return "aanf";
            case 572:
                return "aalc";
            case 573:
                return "aamd";
            case 574:
                return "aajo";
            case 575:
                return "aarw";
            case 576:
                return "aaqk";
            case 578:
                return "aall";
            case 579:
                return "com.google.maps.gmm.GetFacadesByS2CellsRequest";
            case 580:
                return "aamc";
            case 581:
                return "com.google.maps.gmm.GetUserMotivationContentRequest";
            case 582:
                return "aane";
            case 583:
                return "aamo";
            case 584:
                return "aakk";
            case 585:
                return "aakd";
            case 586:
                return "aana";
            case 590:
                return "aalk";
        }
    }

    public static int x(java.nio.ByteBuffer byteBuffer) {
        return (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8);
    }

    public static zjf y(java.net.URL url) {
        java.lang.String host = url.getHost();
        int defaultPort = url.getDefaultPort();
        return new zjf(host, defaultPort, defaultPort);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static int z(java.io.DataInput dataInput) throws java.io.IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte < 128) {
            return unsignedByte;
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        int i = (unsignedByte & 127) | ((unsignedByte2 & 127) << 7);
        if (unsignedByte2 < 128) {
            return i;
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        int i2 = i | ((unsignedByte3 & 127) << 14);
        if (unsignedByte3 < 128) {
            return i2;
        }
        int unsignedByte4 = dataInput.readUnsignedByte();
        int i3 = i2 | ((unsignedByte4 & 127) << 21);
        if (unsignedByte4 < 128) {
            return i3;
        }
        int unsignedByte5 = dataInput.readUnsignedByte();
        int i4 = i3 | ((unsignedByte5 & 127) << 28);
        if (unsignedByte5 >= 128) {
            while (unsignedByte5 >= 128) {
                unsignedByte5 = dataInput.readUnsignedByte();
            }
        }
        return i4;
    }
}
