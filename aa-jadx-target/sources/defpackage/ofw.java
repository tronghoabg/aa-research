package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ofw implements defpackage.oei {
    public static final /* synthetic */ int b = 0;
    private static final defpackage.yqm c = defpackage.yqm.c("GH.TelecomUtils");
    private static final java.lang.String[] d = {"display_name", "type", "label", "_id"};
    private final java.util.HashMap e = new java.util.HashMap();
    private final java.util.HashMap f = new java.util.HashMap();
    private final java.util.HashMap g = new java.util.HashMap();
    private final java.util.HashMap h = new java.util.HashMap();
    private final java.util.HashMap i = new java.util.HashMap();

    private final java.lang.String T(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.util.HashMap map = this.i;
        java.lang.String str3 = (java.lang.String) map.get(str2);
        if (str3 != null) {
            return str3;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return context.getString(2132085415);
        }
        java.lang.String string = defpackage.omf.w().C(str2) ? context.getString(2132085454) : n(context.getContentResolver(), str2);
        if (true != android.text.TextUtils.isEmpty(string)) {
            str = string;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = r(context, str2);
        }
        map.put(str2, str);
        return str;
    }

    private static final java.lang.String U(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
            return context.getString(2132084780, str2, str, str3);
        }
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str3)) {
            return context.getString(2132084781, str, str3);
        }
        if (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str)) {
            return context.getString(2132084781, str2, str);
        }
        if (!android.text.TextUtils.isEmpty(str2) && !android.text.TextUtils.isEmpty(str3)) {
            return context.getString(2132084781, str2, str3);
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return android.text.TextUtils.isEmpty(str3) ? "" : str3;
        }
        return str2;
    }

    private static final java.lang.String V(long j) {
        if (j <= 0) {
            return "";
        }
        defpackage.ojm.a();
        return android.text.format.DateUtils.formatElapsedTime((j$.time.Instant.now().toEpochMilli() - j) / 1000);
    }

    private static final boolean W(int i) {
        return i == 0 || i == 9 || i == 1;
    }

    private static final boolean X(android.content.Context context, java.lang.String str) {
        return new defpackage.ths(context, defpackage.acrf.j()).b(str);
    }

    private static java.lang.String Y(android.content.ContentResolver contentResolver, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str2)) {
            ((defpackage.yqj) ((defpackage.yqj) c.f()).ai((char) 5827)).y("empty or null contact number %s", str2);
            return null;
        }
        if (android.telephony.PhoneNumberUtils.formatNumber(str2, java.util.Locale.getDefault().getCountry()) == null) {
            ((defpackage.yqj) ((defpackage.yqj) c.f()).ai((char) 5826)).y("invalid number: %s", str2);
            return null;
        }
        try {
            android.database.Cursor cursorQuery = contentResolver.query(android.net.Uri.withAppendedPath(android.provider.ContactsContract.PhoneLookup.ENTERPRISE_CONTENT_FILTER_URI, android.net.Uri.encode(str2)), new java.lang.String[]{str}, null, null, str3);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        java.lang.String string = cursorQuery.getString(cursorQuery.getColumnIndex(str));
                        cursorQuery.close();
                        return string;
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        cursorQuery.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (java.lang.SecurityException e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) c.h()).p(e)).ai((char) 5824)).u("Contacts permission denied");
        } catch (java.lang.RuntimeException e2) {
            if (!defpackage.ogv.k()) {
                throw e2;
            }
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) c.g()).p(e2)).ai((char) 5825)).y("Problem reading field %s", str);
        }
        return null;
    }

    @Override // defpackage.oei
    public final java.util.Collection A(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (H(context)) {
            arrayList.add(defpackage.acbk.x);
        }
        if (B(context)) {
            arrayList.add(defpackage.acbk.y);
        }
        if (X(context, o(context))) {
            arrayList.add(defpackage.acbk.L);
        }
        if (L(context)) {
            arrayList.add(defpackage.acbk.J);
        }
        return arrayList;
    }

    @Override // defpackage.oei
    public final boolean B(android.content.Context context) {
        if (defpackage.duw.c(context, "android.permission.READ_PRIVILEGED_PHONE_STATE") == 0 && android.os.Build.VERSION.SDK_INT >= 29) {
            android.telecom.TelecomManager telecomManager = (android.telecom.TelecomManager) context.getSystemService("telecom");
            telecomManager.getClass();
            if (ep$.ExternalSyntheticApiModelOutline0.m(telecomManager) != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.oei
    public final boolean C(defpackage.oeg oegVar, defpackage.oeg oegVar2) {
        if (oegVar2 != defpackage.oeg.ACTIVE) {
            return false;
        }
        return oegVar == null || oegVar == defpackage.oeg.RINGING || oegVar == defpackage.oeg.DISCONNECTED;
    }

    @Override // defpackage.oei
    public final boolean D(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        return (defpackage.mkc.R().u() && defpackage.mkc.R().t(carCall) && (carCall.f.g & 2) != 2) ? false : true;
    }

    @Override // defpackage.oei
    public final boolean E() {
        return j$.util.Collection.-EL.stream(defpackage.omf.w().k()).anyMatch(new mrx(14));
    }

    @Override // defpackage.oei
    public final boolean F(int i) {
        return i == 2;
    }

    @Override // defpackage.oei
    public final boolean G(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        return F(carCall.e);
    }

    @Override // defpackage.oei
    public final boolean H(android.content.Context context) {
        if (android.os.Build.VERSION.SDK_INT >= 30 && defpackage.mdp.d().k()) {
            android.telecom.TelecomManager telecomManager = (android.telecom.TelecomManager) context.getSystemService("telecom");
            telecomManager.getClass();
            java.util.List<android.telecom.PhoneAccountHandle> callCapablePhoneAccounts = telecomManager.getCallCapablePhoneAccounts();
            if (callCapablePhoneAccounts != null && callCapablePhoneAccounts.size() > 1) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.oei
    public final boolean I(int i) {
        return i == 4 || i == 3 || i == 1;
    }

    @Override // defpackage.oei
    public final boolean J(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        return W(carCall.e);
    }

    @Override // defpackage.oei
    public final boolean K(defpackage.oeg oegVar, defpackage.oeg oegVar2) {
        return oegVar2 == defpackage.oeg.ACTIVE && defpackage.oeg.DIALING.equals(oegVar);
    }

    @Override // defpackage.oei
    public final boolean L(android.content.Context context) {
        java.lang.String strO = o(context);
        final int i = 1;
        if (!X(context, strO)) {
            return android.os.Build.VERSION.SDK_INT >= 34;
        }
        java.lang.String str = (java.lang.String) ((defpackage.yhe) defpackage.tht.d(new defpackage.ngh(7), defpackage.acrf.h()).collect(defpackage.yds.a(new defpackage.vap(20), new java.util.function.Function() { // from class: zxg
            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function andThen(java.util.function.Function function) {
                int i2 = i;
                if (i2 != 0) {
                    return i2 != 1 ? j$.util.function.Function.-CC.$default$andThen(this, function) : j$.util.function.Function.-CC.$default$andThen(this, function);
                }
                return j$.util.function.Function.-CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    return new aclj();
                }
                if (i2 == 1) {
                    return ((java.util.Map.Entry) obj).getValue();
                }
                tst tstVar = (tst) obj;
                abeo abeoVar = tstVar.a.c;
                if (abeoVar == null) {
                    abeoVar = abeo.a;
                }
                defpackage.aboj abojVar = aagc.a;
                abeoVar.j(abojVar);
                java.lang.Object objJ = abeoVar.w.j(abojVar.d);
                int i3 = ((aagb) (objJ == null ? abojVar.b : abojVar.c(objJ))).d;
                defpackage.aboj abojVar2 = abil.a;
                abeoVar.j(abojVar2);
                java.lang.Object objJ2 = abeoVar.w.j(abojVar2.d);
                abip abipVar = ((abik) (objJ2 == null ? abojVar2.b : abojVar2.c(objJ2))).c;
                if (abipVar == null) {
                    abipVar = abip.a;
                }
                defpackage.aboj abojVar3 = abeq.v;
                abeoVar.j(abojVar3);
                java.lang.Object objJ3 = abeoVar.w.j(abojVar3.d);
                return new aady(tstVar, i3, tpm.l(abipVar.c, abipVar.d), ((abes) (objJ3 == null ? abojVar3.b : abojVar3.c(objJ3))).c);
            }

            @Override // java.util.function.Function
            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                int i2 = i;
                if (i2 != 0) {
                    return i2 != 1 ? j$.util.function.Function.-CC.$default$compose(this, function) : j$.util.function.Function.-CC.$default$compose(this, function);
                }
                return j$.util.function.Function.-CC.$default$compose(this, function);
            }
        }))).get(strO);
        if (str != null) {
            strO = str;
        }
        return new defpackage.ths(context, defpackage.acrf.j()).a(strO);
    }

    @Override // defpackage.oei
    public final boolean M(android.content.Context context, java.lang.String str) {
        try {
            return (context.getPackageManager().getApplicationInfo(str, 0).flags & 1) != 0;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            ((defpackage.yqj) ((defpackage.yqj) c.h()).ai((char) 5822)).y("Dialer with package name: %s not found", str);
            return false;
        }
    }

    @Override // defpackage.oei
    public final boolean N(defpackage.oeg oegVar, defpackage.oeg oegVar2) {
        defpackage.oeg oegVar3 = defpackage.oeg.DIALING;
        return oegVar2 == oegVar3 && !oegVar3.equals(oegVar);
    }

    @Override // defpackage.oei
    public final boolean O(defpackage.oeg oegVar, defpackage.oeg oegVar2) {
        defpackage.oeg oegVar3 = defpackage.oeg.RINGING;
        return oegVar2 == oegVar3 && !oegVar3.equals(oegVar);
    }

    @Override // defpackage.oei
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final int P(android.content.ContentResolver contentResolver, java.lang.String str) {
        java.lang.String strY = Y(contentResolver, "starred", str, "starred DESC");
        if (strY != null) {
            return true != strY.equals("0") ? 3 : 2;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (r7 != null) goto L13;
     */
    @Override // defpackage.oei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List Q(android.content.ContentResolver r7, java.lang.String r8) {
        /*
            r6 = this;
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r5 = "data2 LIMIT 1"
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L1b
            yqm r7 = defpackage.ofw.c
            ypu r7 = r7.g()
            java.lang.String r8 = "You must specify a valid id to get a contact's phone number."
            r0 = 5819(0x16bb, float:8.154E-42)
            defpackage.a.br(r7, r8, r0)
            return r6
        L1b:
            android.net.Uri r1 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            java.lang.String r0 = "data1"
            java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch: java.lang.RuntimeException -> L6e java.lang.SecurityException -> L85
            java.lang.String r3 = "contact_id = ?"
            java.lang.String[] r4 = new java.lang.String[]{r8}     // Catch: java.lang.RuntimeException -> L6e java.lang.SecurityException -> L85
            r0 = r7
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.RuntimeException -> L6e java.lang.SecurityException -> L85
            if (r7 == 0) goto L48
            boolean r8 = r7.moveToFirst()     // Catch: java.lang.Throwable -> L60
            if (r8 == 0) goto L48
        L36:
            r8 = 0
            java.lang.String r8 = r7.getString(r8)     // Catch: java.lang.Throwable -> L60
            r6.add(r8)     // Catch: java.lang.Throwable -> L60
            boolean r8 = r7.moveToNext()     // Catch: java.lang.Throwable -> L60
            if (r8 != 0) goto L36
        L44:
            r7.close()     // Catch: java.lang.RuntimeException -> L6e java.lang.SecurityException -> L85
            return r6
        L48:
            yqm r8 = defpackage.ofw.c     // Catch: java.lang.Throwable -> L60
            ypu r8 = r8.g()     // Catch: java.lang.Throwable -> L60
            yqj r8 = (defpackage.yqj) r8     // Catch: java.lang.Throwable -> L60
            r0 = 5816(0x16b8, float:8.15E-42)
            ypu r8 = r8.ai(r0)     // Catch: java.lang.Throwable -> L60
            yqj r8 = (defpackage.yqj) r8     // Catch: java.lang.Throwable -> L60
            java.lang.String r0 = "Unable to move phone number cursor to the first item."
            r8.u(r0)     // Catch: java.lang.Throwable -> L60
            if (r7 == 0) goto L94
            goto L44
        L60:
            r0 = move-exception
            r8 = r0
            if (r7 == 0) goto L6d
            r7.close()     // Catch: java.lang.Throwable -> L68
            goto L6d
        L68:
            r0 = move-exception
            r7 = r0
            r8.addSuppressed(r7)     // Catch: java.lang.RuntimeException -> L6e java.lang.SecurityException -> L85
        L6d:
            throw r8     // Catch: java.lang.RuntimeException -> L6e java.lang.SecurityException -> L85
        L6e:
            r0 = move-exception
            r7 = r0
            boolean r8 = defpackage.ogv.k()
            if (r8 == 0) goto L84
            yqm r8 = defpackage.ofw.c
            ypu r8 = r8.g()
            java.lang.String r0 = "Problem reading numbers"
            r1 = 5818(0x16ba, float:8.153E-42)
            defpackage.a.bu(r8, r0, r1, r7)
            goto L94
        L84:
            throw r7
        L85:
            r0 = move-exception
            r7 = r0
            yqm r8 = defpackage.ofw.c
            ypu r8 = r8.h()
            java.lang.String r0 = "Contacts permission denied"
            r1 = 5817(0x16b9, float:8.151E-42)
            defpackage.a.bu(r8, r0, r1, r7)
        L94:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ofw.Q(android.content.ContentResolver, java.lang.String):java.util.List");
    }

    @Override // defpackage.oei
    public final boolean R() {
        return (defpackage.ysr.bD("SAMSUNG", android.os.Build.MANUFACTURER) && android.os.Build.VERSION.SDK_INT >= 33) || android.os.Build.VERSION.SDK_INT >= 34;
    }

    @Override // defpackage.oei
    public final void S(android.content.Context context, android.content.ComponentName componentName) {
        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bd A[Catch: all -> 0x00c5, TRY_LEAVE, TryCatch #3 {all -> 0x00c5, blocks: (B:54:0x00ae, B:56:0x00bd), top: B:74:0x00ae, outer: #10 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.oei
    public final android.graphics.Bitmap a(android.content.ContentResolver contentResolver, java.lang.String str) {
        android.content.ContentResolver contentResolver2;
        int iIntValue;
        java.io.InputStream inputStreamOpenContactPhotoInputStream;
        android.graphics.Bitmap bitmapDecodeStream;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            java.util.HashMap map = this.f;
            if (map.containsKey(str)) {
                iIntValue = ((java.lang.Integer) map.get(str)).intValue();
                contentResolver2 = contentResolver;
            } else {
                try {
                    contentResolver2 = contentResolver;
                    try {
                        android.database.Cursor cursorQuery = contentResolver2.query(android.net.Uri.withAppendedPath(android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI, android.net.Uri.encode(str)), d, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    int columnIndex = cursorQuery.getColumnIndex("_id");
                                    if (columnIndex >= 0) {
                                        int i = cursorQuery.getInt(columnIndex);
                                        map.put(str, java.lang.Integer.valueOf(i));
                                        cursorQuery.close();
                                        iIntValue = i;
                                    }
                                } else if (cursorQuery != null) {
                                }
                                cursorQuery.close();
                            } catch (java.lang.Throwable th) {
                                try {
                                    cursorQuery.close();
                                    throw th;
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } else if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (java.lang.SecurityException e) {
                        e = e;
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) c.h()).p(e)).ai((char) 5811)).u("Contacts permission denied");
                        iIntValue = 0;
                        if (iIntValue == 0) {
                            return null;
                        }
                        try {
                            inputStreamOpenContactPhotoInputStream = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentResolver2, android.content.ContentUris.withAppendedId(android.provider.ContactsContract.Contacts.CONTENT_URI, iIntValue), true);
                            if (inputStreamOpenContactPhotoInputStream == null) {
                                return null;
                            }
                            try {
                                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                                options.inPreferQualityOverSpeed = true;
                                options.inScaled = false;
                                bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(inputStreamOpenContactPhotoInputStream, null, options);
                                if (bitmapDecodeStream != null) {
                                    bitmapDecodeStream.setDensity(0);
                                }
                                inputStreamOpenContactPhotoInputStream.close();
                                return bitmapDecodeStream;
                            } catch (java.lang.Throwable th3) {
                                try {
                                    inputStreamOpenContactPhotoInputStream.close();
                                    throw th3;
                                } catch (java.lang.Throwable th4) {
                                    th3.addSuppressed(th4);
                                    throw th3;
                                }
                            }
                        } catch (java.io.IOException | java.lang.SecurityException e2) {
                            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) c.h()).p(e2)).ai((char) 5813)).u("Could not get contact photo");
                            return null;
                        }
                    } catch (java.lang.RuntimeException e3) {
                        e = e3;
                        java.lang.RuntimeException runtimeException = e;
                        if (!defpackage.ogv.k()) {
                            throw runtimeException;
                        }
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) c.g()).p(runtimeException)).ai((char) 5812)).u("Problem reading contact id");
                        iIntValue = 0;
                        if (iIntValue == 0) {
                            return null;
                        }
                        inputStreamOpenContactPhotoInputStream = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentResolver2, android.content.ContentUris.withAppendedId(android.provider.ContactsContract.Contacts.CONTENT_URI, iIntValue), true);
                        if (inputStreamOpenContactPhotoInputStream == null) {
                            return null;
                        }
                        android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
                        options2.inPreferQualityOverSpeed = true;
                        options2.inScaled = false;
                        bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(inputStreamOpenContactPhotoInputStream, null, options2);
                        if (bitmapDecodeStream != null) {
                            bitmapDecodeStream.setDensity(0);
                        }
                        inputStreamOpenContactPhotoInputStream.close();
                        return bitmapDecodeStream;
                    }
                } catch (java.lang.SecurityException e4) {
                    e = e4;
                    contentResolver2 = contentResolver;
                } catch (java.lang.RuntimeException e5) {
                    e = e5;
                    contentResolver2 = contentResolver;
                }
            }
            if (iIntValue == 0) {
                return null;
            }
            inputStreamOpenContactPhotoInputStream = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentResolver2, android.content.ContentUris.withAppendedId(android.provider.ContactsContract.Contacts.CONTENT_URI, iIntValue), true);
            if (inputStreamOpenContactPhotoInputStream == null) {
                return null;
            }
            android.graphics.BitmapFactory.Options options3 = new android.graphics.BitmapFactory.Options();
            options3.inPreferQualityOverSpeed = true;
            options3.inScaled = false;
            bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(inputStreamOpenContactPhotoInputStream, null, options3);
            if (bitmapDecodeStream != null) {
                bitmapDecodeStream.setDensity(0);
            }
            inputStreamOpenContactPhotoInputStream.close();
            return bitmapDecodeStream;
        }
        contentResolver2 = contentResolver;
        iIntValue = 0;
        if (iIntValue == 0) {
            return null;
        }
        inputStreamOpenContactPhotoInputStream = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(contentResolver2, android.content.ContentUris.withAppendedId(android.provider.ContactsContract.Contacts.CONTENT_URI, iIntValue), true);
        if (inputStreamOpenContactPhotoInputStream == null) {
            return null;
        }
        android.graphics.BitmapFactory.Options options4 = new android.graphics.BitmapFactory.Options();
        options4.inPreferQualityOverSpeed = true;
        options4.inScaled = false;
        bitmapDecodeStream = android.graphics.BitmapFactory.decodeStream(inputStreamOpenContactPhotoInputStream, null, options4);
        if (bitmapDecodeStream != null) {
            bitmapDecodeStream.setDensity(0);
        }
        inputStreamOpenContactPhotoInputStream.close();
        return bitmapDecodeStream;
    }

    @Override // defpackage.oei
    public final android.net.Uri b(android.content.Context context, com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        defpackage.oej oejVarR = defpackage.mkc.R();
        if (!oejVarR.u() || !oejVarR.t(carCall)) {
            return jvb.d().b(u(carCall), p(context, carCall));
        }
        android.net.Uri uriF = oejVarR.f(carCall);
        return uriF != null ? uriF : jvb.d().a(u(carCall), p(context, carCall));
    }

    @Override // defpackage.lhn
    public final void d() {
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h.clear();
        this.i.clear();
    }

    @Override // defpackage.oei
    public final com.google.android.apps.auto.components.telecom.call.CarCall e(int i) {
        for (com.google.android.apps.auto.components.telecom.call.CarCall carCall : defpackage.omf.w().k()) {
            if (carCall.a == i) {
                return carCall;
            }
        }
        return null;
    }

    @Override // defpackage.oei
    public final com.google.android.apps.auto.components.telecom.call.CarCall f(int... iArr) {
        for (com.google.android.apps.auto.components.telecom.call.CarCall carCall : defpackage.omf.w().k()) {
            for (int i = 0; i < 3; i++) {
                if (carCall.e == iArr[i]) {
                    return carCall;
                }
            }
        }
        return null;
    }

    @Override // defpackage.oei
    public final com.google.android.apps.auto.components.telecom.call.CarCall g() {
        java.util.List listK = defpackage.omf.w().k();
        if (listK.isEmpty()) {
            return null;
        }
        com.google.android.apps.auto.components.telecom.call.CarCall carCall = (com.google.android.apps.auto.components.telecom.call.CarCall) listK.get(0);
        if (carCall.b != null) {
            return null;
        }
        return carCall;
    }

    @Override // defpackage.oei
    public final com.google.android.apps.auto.components.telecom.call.CarCall h() {
        java.util.List listK = defpackage.omf.w().k();
        if (listK.size() < 2) {
            return null;
        }
        com.google.android.apps.auto.components.telecom.call.CarCall carCall = (com.google.android.apps.auto.components.telecom.call.CarCall) listK.get(1);
        if (carCall.b != null) {
            return null;
        }
        return carCall;
    }

    @Override // defpackage.oei
    public final defpackage.rrv i(int i, defpackage.zbe zbeVar, defpackage.zbd zbdVar) {
        return j(e(i), zbeVar, zbdVar);
    }

    @Override // defpackage.oei
    public final defpackage.rrv j(com.google.android.apps.auto.components.telecom.call.CarCall carCall, defpackage.zbe zbeVar, defpackage.zbd zbdVar) {
        defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.GEARHEAD, zbeVar, zbdVar);
        if (carCall != null) {
            rrvVarH.h(carCall.a);
            rrvVarH.p(defpackage.mkc.R().b(carCall));
        }
        return rrvVarH;
    }

    @Override // defpackage.oei
    public final defpackage.rrv k(defpackage.zbe zbeVar, defpackage.zbd zbdVar) {
        return j(g(), zbeVar, zbdVar);
    }

    @Override // defpackage.oei
    public final java.lang.CharSequence l(android.content.Context context, com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        android.telecom.PhoneAccountHandle phoneAccountHandle = carCall.f.h;
        if (phoneAccountHandle == null) {
            ((defpackage.yqj) ((defpackage.yqj) c.f()).ai((char) 5810)).u("Account name not found (account handle missing from call)");
            return null;
        }
        android.telecom.TelecomManager telecomManager = (android.telecom.TelecomManager) context.getSystemService("telecom");
        telecomManager.getClass();
        android.telecom.PhoneAccount phoneAccount = telecomManager.getPhoneAccount(phoneAccountHandle);
        if (phoneAccount == null) {
            ((defpackage.yqj) ((defpackage.yqj) c.f()).ai((char) 5809)).u("Account name not found (account not found for handle)");
            return null;
        }
        java.lang.CharSequence label = phoneAccount.getLabel();
        if (label != null) {
            return label;
        }
        ((defpackage.yqj) ((defpackage.yqj) c.f()).ai((char) 5808)).u("Account name not found (account found, but name is null)");
        return null;
    }

    @Override // defpackage.oei
    public final java.lang.CharSequence m(android.content.Context context, java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            java.util.HashMap map = this.g;
            if (map.containsKey(str)) {
                return (java.lang.CharSequence) map.get(str);
            }
            android.content.ContentResolver contentResolver = context.getContentResolver();
            android.content.res.Resources resources = context.getResources();
            try {
                android.database.Cursor cursorQuery = contentResolver.query(android.net.Uri.withAppendedPath(android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI, android.net.Uri.encode(str)), d, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            java.lang.CharSequence charSequence = (java.lang.CharSequence) new defpackage.nub(android.provider.ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, cursorQuery.getInt(cursorQuery.getColumnIndex("type")), cursorQuery.getString(cursorQuery.getColumnIndex("label")))).i("");
                            map.put(str, charSequence);
                            cursorQuery.close();
                            return charSequence;
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            cursorQuery.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                    return "";
                }
            } catch (java.lang.SecurityException e) {
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) c.h()).p(e)).ai((char) 5820)).u("Contacts permission denied");
            } catch (java.lang.RuntimeException e2) {
                if (!defpackage.ogv.k()) {
                    throw e2;
                }
                ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) c.g()).p(e2)).ai((char) 5821)).u("Problem reading type");
            }
        }
        return "";
    }

    @Override // defpackage.oei
    public final java.lang.String n(android.content.ContentResolver contentResolver, java.lang.String str) {
        java.util.HashMap map = this.e;
        if (map.containsKey(str)) {
            return (java.lang.String) map.get(str);
        }
        java.lang.String strY = Y(contentResolver, "display_name", str, null);
        map.put(str, strY);
        return strY;
    }

    @Override // defpackage.oei
    public final java.lang.String o(android.content.Context context) {
        android.telecom.TelecomManager telecomManager = (android.telecom.TelecomManager) context.getSystemService("telecom");
        telecomManager.getClass();
        return telecomManager.getDefaultDialerPackage();
    }

    @Override // defpackage.oei
    public final java.lang.String p(android.content.Context context, com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        if (carCall.g) {
            return context.getString(2132083791);
        }
        if (defpackage.mkc.R().u() && defpackage.mkc.R().t(carCall)) {
            java.lang.String str = carCall.f.b;
            if (!android.text.TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return T(context, carCall.f.b, u(carCall));
    }

    @Override // defpackage.oei
    public final java.lang.String q(android.content.Context context, java.lang.String str) {
        return T(context, null, str);
    }

    @Override // defpackage.oei
    public final java.lang.String r(android.content.Context context, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return "";
        }
        java.util.HashMap map = this.h;
        if (map.containsKey(str)) {
            return (java.lang.String) map.get(str);
        }
        java.lang.String simCountryIso = ((android.telephony.TelephonyManager) context.getSystemService("phone")).getSimCountryIso();
        if ((android.text.TextUtils.isEmpty(simCountryIso) || simCountryIso.length() != 2) && ((simCountryIso = java.util.Locale.getDefault().getCountry()) == null || simCountryIso.length() != 2)) {
            simCountryIso = "US";
        }
        java.lang.String upperCase = simCountryIso.toUpperCase(java.util.Locale.US);
        java.lang.String number = android.telephony.PhoneNumberUtils.formatNumber(str, android.telephony.PhoneNumberUtils.formatNumberToE164(str, upperCase), upperCase);
        if (true == android.text.TextUtils.isEmpty(number)) {
            number = str;
        }
        map.put(str, number);
        return number;
    }

    @Override // defpackage.oei
    public final java.lang.String s(android.content.Context context, android.content.ComponentName componentName, int i) {
        com.google.android.apps.auto.components.telecom.call.CarCall carCallE;
        if (!componentName.equals(defpackage.mkt.b)) {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            try {
                java.lang.String string = packageManager.getApplicationLabel(packageManager.getApplicationInfo(componentName.getPackageName(), 0)).toString();
                if (!android.text.TextUtils.isEmpty(string)) {
                    return context.getString(2132084638, string);
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                ((defpackage.yqj) ((defpackage.yqj) c.g()).ai((char) 5815)).y("Could not find package info for component %s", componentName.flattenToShortString());
            }
        }
        if (H(context) && (carCallE = e(i)) != null) {
            java.lang.CharSequence charSequenceL = l(context, carCallE);
            if (!android.text.TextUtils.isEmpty(charSequenceL)) {
                return z(context, carCallE.e, charSequenceL.toString());
            }
            ((defpackage.yqj) ((defpackage.yqj) c.h()).ai((char) 5814)).u("Failed to generate SIM identification text (can't find account name)");
        }
        return context.getString(2132084637);
    }

    @Override // defpackage.oei
    public final java.lang.String t(android.content.Context context, long j, java.lang.String str) {
        context.getClass();
        return U(context, V(j), context.getString(2132084784), str);
    }

    @Override // defpackage.oei
    public final java.lang.String u(com.google.android.apps.auto.components.telecom.call.CarCall carCall) {
        com.google.android.apps.auto.components.telecom.call.CarCall.Details details;
        if (carCall == null || (details = carCall.f) == null) {
            return null;
        }
        android.net.Uri uri = details.e;
        if (uri != null) {
            return uri.getSchemeSpecificPart();
        }
        android.net.Uri uri2 = details.a;
        if (uri2 != null) {
            return uri2.getSchemeSpecificPart();
        }
        return null;
    }

    @Override // defpackage.oei
    public final java.lang.String v(android.content.Context context, long j, java.lang.String str) {
        context.getClass();
        return U(context, V(j), context.getString(2132084786), str);
    }

    @Override // defpackage.oei
    public final java.lang.String w(android.content.Context context, int i, java.lang.String str) {
        long j;
        com.google.android.apps.auto.components.telecom.call.CarCall carCallE = e(i);
        boolean z = false;
        if (carCallE != null) {
            z = carCallE.e == 3;
            j = carCallE.f.d;
        } else {
            j = 0;
        }
        long j2 = j;
        if (z) {
            return v(context, j2, null);
        }
        return defpackage.omf.w().z(i) ? t(context, j2, null) : x(context, j2, str, null);
    }

    @Override // defpackage.oei
    public final java.lang.String x(android.content.Context context, long j, java.lang.String str, java.lang.String str2) {
        context.getClass();
        return U(context, V(j), str, str2);
    }

    @Override // defpackage.oei
    public final java.lang.String y(android.content.Context context, long j) {
        if (j <= 0) {
            return "";
        }
        defpackage.ooa.b();
        return defpackage.ooa.a(context, j);
    }

    @Override // defpackage.oei
    public final java.lang.String z(android.content.Context context, int i, java.lang.String str) {
        if (F(i)) {
            return context.getString(2132085287, str);
        }
        return W(i) ? context.getString(2132085288, str) : str;
    }

    @Override // defpackage.lhn
    public final void eQ() {
    }
}
