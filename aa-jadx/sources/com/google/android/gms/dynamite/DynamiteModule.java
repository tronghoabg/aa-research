package com.google.android.gms.dynamite;

/* JADX INFO: loaded from: classes.dex */
public final class DynamiteModule {
    private static java.lang.Boolean d = null;
    private static java.lang.String e = null;
    private static boolean f = false;
    private static int g = -1;
    private static java.lang.Boolean h;
    private static defpackage.sru l;
    private static defpackage.srv m;
    public final android.content.Context c;
    private static final java.lang.ThreadLocal i = new java.lang.ThreadLocal();
    private static final java.lang.ThreadLocal j = new defpackage.srm();
    private static final defpackage.srr k = new defpackage.srn();
    public static final defpackage.srt a = new defpackage.sro(1);
    public static final defpackage.srt b = new defpackage.sro(0);

    public static class DynamiteLoaderClassLoader {
        public static java.lang.ClassLoader sClassLoader;
    }

    private DynamiteModule(android.content.Context context) {
        this.c = context;
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [android.database.Cursor, java.lang.Object] */
    public static int a(android.content.Context context, java.lang.String str, boolean z) {
        java.lang.Throwable th;
        android.os.RemoteException e2;
        int i2;
        defpackage.srh srfVar;
        ?? r1;
        try {
            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                java.lang.Boolean bool = d;
                android.database.Cursor cursor = null;
                if (bool == null) {
                    try {
                        java.lang.reflect.Field declaredField = context.getApplicationContext().getClassLoader().loadClass(com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                        synchronized (declaredField.getDeclaringClass()) {
                            try {
                                java.lang.ClassLoader classLoader = (java.lang.ClassLoader) declaredField.get(null);
                                if (classLoader == java.lang.ClassLoader.getSystemClassLoader()) {
                                    bool = java.lang.Boolean.FALSE;
                                } else if (classLoader != null) {
                                    try {
                                        f(classLoader);
                                    } catch (defpackage.srq unused) {
                                    }
                                    bool = java.lang.Boolean.TRUE;
                                } else {
                                    if (!h(context)) {
                                        return 0;
                                    }
                                    if (f || java.lang.Boolean.TRUE.equals(null)) {
                                        declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                        bool = java.lang.Boolean.FALSE;
                                    } else {
                                        try {
                                            int iD = d(context, str, z, true);
                                            java.lang.String str2 = e;
                                            if (str2 != null && !str2.isEmpty()) {
                                                java.lang.ClassLoader classLoaderA = defpackage.srk.a();
                                                if (classLoaderA == null) {
                                                    if (android.os.Build.VERSION.SDK_INT >= 29) {
                                                        java.lang.String str3 = e;
                                                        if (str3 == null) {
                                                            throw new java.lang.NullPointerException("null reference");
                                                        }
                                                        classLoaderA = new dalvik.system.DelegateLastClassLoader(str3, java.lang.ClassLoader.getSystemClassLoader());
                                                    } else {
                                                        java.lang.String str4 = e;
                                                        if (str4 == null) {
                                                            throw new java.lang.NullPointerException("null reference");
                                                        }
                                                        classLoaderA = new defpackage.srl(str4, java.lang.ClassLoader.getSystemClassLoader());
                                                    }
                                                }
                                                f(classLoaderA);
                                                declaredField.set(null, classLoaderA);
                                                d = java.lang.Boolean.TRUE;
                                                return iD;
                                            }
                                            return iD;
                                        } catch (defpackage.srq unused2) {
                                            declaredField.set(null, java.lang.ClassLoader.getSystemClassLoader());
                                            bool = java.lang.Boolean.FALSE;
                                        }
                                    }
                                }
                                d = bool;
                            } catch (java.lang.Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchFieldException e3) {
                        android.util.Log.w("DynamiteModule", defpackage.a.bW(e3, "Failed to load module via V2: "));
                        bool = java.lang.Boolean.FALSE;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return d(context, str, z, false);
                    } catch (defpackage.srq e4) {
                        android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                defpackage.sru sruVarI = i(context);
                try {
                    if (sruVarI == null) {
                        return 0;
                    }
                    try {
                        int iE = sruVarI.e();
                        if (iE >= 3) {
                            defpackage.nub nubVar = (defpackage.nub) i.get();
                            if (nubVar != null && (r1 = nubVar.a) != 0) {
                                return r1.getInt(0);
                            }
                            defpackage.srg srgVar = new defpackage.srg(context);
                            long jLongValue = ((java.lang.Long) j.get()).longValue();
                            android.os.Parcel parcelFp = sruVarI.fp();
                            defpackage.ijx.i(parcelFp, srgVar);
                            parcelFp.writeString(str);
                            parcelFp.writeInt(z ? 1 : 0);
                            parcelFp.writeLong(jLongValue);
                            android.os.Parcel parcelFq = sruVarI.fq(7, parcelFp);
                            android.os.IBinder strongBinder = parcelFq.readStrongBinder();
                            if (strongBinder == null) {
                                srfVar = null;
                            } else {
                                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                srfVar = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
                            }
                            parcelFq.recycle();
                            android.database.Cursor cursor2 = (android.database.Cursor) defpackage.srg.a(srfVar);
                            if (cursor2 != null) {
                                try {
                                    if (cursor2.moveToFirst()) {
                                        i2 = cursor2.getInt(0);
                                        cursor = (i2 <= 0 || !g(cursor2)) ? cursor2 : null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                    }
                                } catch (android.os.RemoteException e5) {
                                    e2 = e5;
                                    cursor = cursor2;
                                    android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e2.getMessage());
                                    if (cursor == null) {
                                        return 0;
                                    }
                                    cursor.close();
                                    return 0;
                                } catch (java.lang.Throwable th3) {
                                    th = th3;
                                    cursor = cursor2;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                            }
                            android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                            if (cursor2 == null) {
                                return 0;
                            }
                            cursor2.close();
                            return 0;
                        }
                        if (iE == 2) {
                            android.util.Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                            defpackage.srg srgVar2 = new defpackage.srg(context);
                            android.os.Parcel parcelFp2 = sruVarI.fp();
                            defpackage.ijx.i(parcelFp2, srgVar2);
                            parcelFp2.writeString(str);
                            parcelFp2.writeInt(z ? 1 : 0);
                            android.os.Parcel parcelFq2 = sruVarI.fq(5, parcelFp2);
                            i2 = parcelFq2.readInt();
                            parcelFq2.recycle();
                        } else {
                            android.util.Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                            defpackage.srg srgVar3 = new defpackage.srg(context);
                            android.os.Parcel parcelFp3 = sruVarI.fp();
                            defpackage.ijx.i(parcelFp3, srgVar3);
                            parcelFp3.writeString(str);
                            parcelFp3.writeInt(z ? 1 : 0);
                            android.os.Parcel parcelFq3 = sruVarI.fq(3, parcelFp3);
                            i2 = parcelFq3.readInt();
                            parcelFq3.recycle();
                        }
                        return i2;
                    } catch (android.os.RemoteException e6) {
                        e2 = e6;
                    }
                } catch (java.lang.Throwable th4) {
                    th = th4;
                }
            }
        } catch (java.lang.Throwable th5) {
            defpackage.tis.v(context);
            throw th5;
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [android.database.Cursor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.database.Cursor, java.lang.Object] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static com.google.android.gms.dynamite.DynamiteModule b(android.content.Context context, defpackage.srt srtVar, java.lang.String str) throws java.lang.Throwable {
        long j2;
        long j3;
        com.google.android.gms.dynamite.DynamiteModule dynamiteModuleE;
        java.lang.Boolean bool;
        defpackage.srh srfVar;
        defpackage.srv srvVar;
        boolean z;
        java.lang.Boolean boolValueOf;
        defpackage.srh srfVar2;
        android.content.Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new defpackage.srq("null application Context");
        }
        java.lang.ThreadLocal threadLocal = i;
        defpackage.nub nubVar = (defpackage.nub) threadLocal.get();
        defpackage.nub nubVar2 = new defpackage.nub();
        threadLocal.set(nubVar2);
        java.lang.ThreadLocal threadLocal2 = j;
        java.lang.Long l2 = (java.lang.Long) threadLocal2.get();
        long jLongValue = l2.longValue();
        try {
            threadLocal2.set(java.lang.Long.valueOf(android.os.SystemClock.uptimeMillis()));
            defpackage.srs srsVarA = srtVar.a(context, str, k);
            j3 = 0;
            try {
                int i2 = srsVarA.a;
                j2 = jLongValue;
                try {
                    android.util.Log.i("DynamiteModule", "Considering local module " + str + ":" + i2 + " and remote module " + str + ":" + srsVarA.b);
                    int i3 = srsVarA.c;
                    if (i3 == 0 || ((i3 == -1 && srsVarA.a == 0) || (i3 == 1 && srsVarA.b == 0))) {
                        throw new defpackage.srq("No acceptable module " + str + " found. Local version is " + srsVarA.a + " and remote version is " + srsVarA.b + ".");
                    }
                    if (i3 == -1) {
                        com.google.android.gms.dynamite.DynamiteModule dynamiteModuleE2 = e(applicationContext, str);
                        if (j2 == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(l2);
                        }
                        ?? r1 = nubVar2.a;
                        if (r1 != 0) {
                            r1.close();
                        }
                        threadLocal.set(nubVar);
                        return dynamiteModuleE2;
                    }
                    if (i3 != 1) {
                        throw new defpackage.srq(defpackage.a.bo(0, "VersionPolicy returned invalid code:"));
                    }
                    try {
                        int i4 = srsVarA.b;
                        try {
                            synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                if (!h(context)) {
                                    throw new defpackage.srq("Remote loading disabled");
                                }
                                bool = d;
                            }
                            if (bool == null) {
                                throw new defpackage.srq("Failed to determine which loading route to use.");
                            }
                            if (bool.booleanValue()) {
                                android.util.Log.i("DynamiteModule", defpackage.a.by(i4, str, "Selected remote version of ", ", version >= "));
                                synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                    srvVar = m;
                                }
                                if (srvVar == null) {
                                    throw new defpackage.srq("DynamiteLoaderV2 was not cached.");
                                }
                                defpackage.nub nubVar3 = (defpackage.nub) threadLocal.get();
                                if (nubVar3 == null || nubVar3.a == null) {
                                    throw new defpackage.srq("No result cursor");
                                }
                                android.content.Context applicationContext2 = context.getApplicationContext();
                                java.lang.Object obj = nubVar3.a;
                                new defpackage.srg(null);
                                synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                    z = g >= 2;
                                    boolValueOf = java.lang.Boolean.valueOf(z);
                                }
                                boolValueOf.getClass();
                                if (z) {
                                    android.util.Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                    defpackage.srg srgVar = new defpackage.srg(applicationContext2);
                                    defpackage.srg srgVar2 = new defpackage.srg(obj);
                                    android.os.Parcel parcelFp = srvVar.fp();
                                    java.lang.ClassLoader classLoader = defpackage.ijx.a;
                                    parcelFp.writeStrongBinder(srgVar);
                                    parcelFp.writeString(str);
                                    parcelFp.writeInt(i4);
                                    parcelFp.writeStrongBinder(srgVar2);
                                    android.os.Parcel parcelFq = srvVar.fq(3, parcelFp);
                                    android.os.IBinder strongBinder = parcelFq.readStrongBinder();
                                    if (strongBinder == null) {
                                        srfVar2 = null;
                                    } else {
                                        android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                        srfVar2 = iInterfaceQueryLocalInterface instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface : new defpackage.srf(strongBinder);
                                    }
                                    parcelFq.recycle();
                                } else {
                                    android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                    defpackage.srg srgVar3 = new defpackage.srg(applicationContext2);
                                    defpackage.srg srgVar4 = new defpackage.srg(obj);
                                    android.os.Parcel parcelFp2 = srvVar.fp();
                                    defpackage.ijx.i(parcelFp2, srgVar3);
                                    parcelFp2.writeString(str);
                                    parcelFp2.writeInt(i4);
                                    defpackage.ijx.i(parcelFp2, srgVar4);
                                    android.os.Parcel parcelFq2 = srvVar.fq(2, parcelFp2);
                                    android.os.IBinder strongBinder2 = parcelFq2.readStrongBinder();
                                    if (strongBinder2 == null) {
                                        srfVar2 = null;
                                    } else {
                                        android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                        srfVar2 = iInterfaceQueryLocalInterface2 instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface2 : new defpackage.srf(strongBinder2);
                                    }
                                    parcelFq2.recycle();
                                }
                                android.content.Context context2 = (android.content.Context) defpackage.srg.a(srfVar2);
                                if (context2 == null) {
                                    throw new defpackage.srq("Failed to get module context");
                                }
                                dynamiteModuleE = new com.google.android.gms.dynamite.DynamiteModule(context2);
                            } else {
                                android.util.Log.i("DynamiteModule", defpackage.a.by(i4, str, "Selected remote version of ", ", version >= "));
                                defpackage.sru sruVarI = i(context);
                                if (sruVarI == null) {
                                    throw new defpackage.srq("Failed to create IDynamiteLoader.");
                                }
                                int iE = sruVarI.e();
                                if (iE >= 3) {
                                    defpackage.nub nubVar4 = (defpackage.nub) threadLocal.get();
                                    if (nubVar4 == null) {
                                        throw new defpackage.srq("No cached result cursor holder");
                                    }
                                    defpackage.srg srgVar5 = new defpackage.srg(context);
                                    defpackage.srg srgVar6 = new defpackage.srg(nubVar4.a);
                                    android.os.Parcel parcelFp3 = sruVarI.fp();
                                    defpackage.ijx.i(parcelFp3, srgVar5);
                                    parcelFp3.writeString(str);
                                    parcelFp3.writeInt(i4);
                                    defpackage.ijx.i(parcelFp3, srgVar6);
                                    android.os.Parcel parcelFq3 = sruVarI.fq(8, parcelFp3);
                                    android.os.IBinder strongBinder3 = parcelFq3.readStrongBinder();
                                    if (strongBinder3 == null) {
                                        srfVar = null;
                                    } else {
                                        android.os.IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                        srfVar = iInterfaceQueryLocalInterface3 instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface3 : new defpackage.srf(strongBinder3);
                                    }
                                    parcelFq3.recycle();
                                } else if (iE == 2) {
                                    android.util.Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    defpackage.srg srgVar7 = new defpackage.srg(context);
                                    android.os.Parcel parcelFp4 = sruVarI.fp();
                                    defpackage.ijx.i(parcelFp4, srgVar7);
                                    parcelFp4.writeString(str);
                                    parcelFp4.writeInt(i4);
                                    android.os.Parcel parcelFq4 = sruVarI.fq(4, parcelFp4);
                                    android.os.IBinder strongBinder4 = parcelFq4.readStrongBinder();
                                    if (strongBinder4 == null) {
                                        srfVar = null;
                                    } else {
                                        android.os.IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                        srfVar = iInterfaceQueryLocalInterface4 instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface4 : new defpackage.srf(strongBinder4);
                                    }
                                    parcelFq4.recycle();
                                } else {
                                    android.util.Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    defpackage.srg srgVar8 = new defpackage.srg(context);
                                    android.os.Parcel parcelFp5 = sruVarI.fp();
                                    defpackage.ijx.i(parcelFp5, srgVar8);
                                    parcelFp5.writeString(str);
                                    parcelFp5.writeInt(i4);
                                    android.os.Parcel parcelFq5 = sruVarI.fq(2, parcelFp5);
                                    android.os.IBinder strongBinder5 = parcelFq5.readStrongBinder();
                                    if (strongBinder5 == null) {
                                        srfVar = null;
                                    } else {
                                        android.os.IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
                                        srfVar = iInterfaceQueryLocalInterface5 instanceof defpackage.srh ? (defpackage.srh) iInterfaceQueryLocalInterface5 : new defpackage.srf(strongBinder5);
                                    }
                                    parcelFq5.recycle();
                                }
                                java.lang.Object objA = defpackage.srg.a(srfVar);
                                if (objA == null) {
                                    throw new defpackage.srq("Failed to load remote module.");
                                }
                                dynamiteModuleE = new com.google.android.gms.dynamite.DynamiteModule((android.content.Context) objA);
                            }
                            if (j2 == 0) {
                                j.remove();
                            } else {
                                j.set(l2);
                            }
                            ?? r0 = nubVar2.a;
                            if (r0 != 0) {
                                r0.close();
                            }
                            i.set(nubVar);
                            return dynamiteModuleE;
                        } catch (android.os.RemoteException e2) {
                            throw new defpackage.srq("Failed to load remote module.", e2);
                        } catch (defpackage.srq e3) {
                            throw e3;
                        } catch (java.lang.Throwable th) {
                            defpackage.tis.v(context);
                            throw new defpackage.srq("Failed to load remote module.", th);
                        }
                    } catch (defpackage.srq e4) {
                        android.util.Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                        int i5 = srsVarA.a;
                        if (i5 == 0 || srtVar.a(context, str, new defpackage.srp(i5)).c != -1) {
                            throw new defpackage.srq("Remote load failed. No local fallback found.", e4);
                        }
                        dynamiteModuleE = e(applicationContext, str);
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (j2 == j3) {
                        j.remove();
                    } else {
                        j.set(l2);
                    }
                    ?? r2 = nubVar2.a;
                    if (r2 != 0) {
                        r2.close();
                    }
                    i.set(nubVar);
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                j2 = jLongValue;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            j2 = jLongValue;
            j3 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0125 A[PHI: r13
  0x0125: PHI (r13v6 boolean) = (r13v5 boolean), (r13v9 boolean) binds: [B:60:0x00ed, B:75:0x011e] A[DONT_GENERATE, DONT_INLINE]] */
    private static int d(android.content.Context context, java.lang.String str, boolean z, boolean z2) throws java.lang.Throwable {
        java.lang.Exception exc;
        java.lang.Throwable th;
        android.database.MatrixCursor matrixCursor;
        android.database.MatrixCursor matrixCursor2 = null;
        try {
            try {
                boolean z3 = true;
                android.net.Uri uriBuild = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").path(true != z ? "api" : "api_force_staging").appendPath(str).appendQueryParameter("requestStartUptime", java.lang.String.valueOf(((java.lang.Long) j.get()).longValue())).build();
                android.content.ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                boolean z4 = false;
                if (contentProviderClientAcquireUnstableContentProviderClient == null) {
                    matrixCursor = null;
                } else {
                    try {
                        android.database.Cursor cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, null, null, null, null);
                        if (cursorQuery == null) {
                            contentProviderClientAcquireUnstableContentProviderClient.release();
                            matrixCursor = null;
                        } else {
                            try {
                                int count = cursorQuery.getCount();
                                int columnCount = cursorQuery.getColumnCount();
                                matrixCursor = new android.database.MatrixCursor(cursorQuery.getColumnNames(), count);
                                for (int i2 = 0; i2 < count; i2++) {
                                    if (!cursorQuery.moveToPosition(i2)) {
                                        throw new android.os.RemoteException("Cursor read incomplete (ContentProvider dead?)");
                                    }
                                    java.lang.Object[] objArr = new java.lang.Object[columnCount];
                                    for (int i3 = 0; i3 < columnCount; i3++) {
                                        int type = cursorQuery.getType(i3);
                                        if (type == 0) {
                                            objArr[i3] = null;
                                        } else if (type == 1) {
                                            objArr[i3] = java.lang.Long.valueOf(cursorQuery.getLong(i3));
                                        } else if (type == 2) {
                                            objArr[i3] = java.lang.Double.valueOf(cursorQuery.getDouble(i3));
                                        } else if (type == 3) {
                                            objArr[i3] = cursorQuery.getString(i3);
                                        } else {
                                            if (type != 4) {
                                                throw new android.os.RemoteException("Unknown column type");
                                            }
                                            objArr[i3] = cursorQuery.getBlob(i3);
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                cursorQuery.close();
                                contentProviderClientAcquireUnstableContentProviderClient.release();
                            } catch (java.lang.Throwable th2) {
                                try {
                                    cursorQuery.close();
                                    throw th2;
                                } catch (java.lang.Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        }
                    } catch (android.os.RemoteException unused) {
                    } catch (java.lang.Throwable th4) {
                        contentProviderClientAcquireUnstableContentProviderClient.release();
                        throw th4;
                    }
                }
                if (matrixCursor != null) {
                    try {
                        if (matrixCursor.moveToFirst()) {
                            int i4 = matrixCursor.getInt(0);
                            if (i4 > 0) {
                                synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                                    e = matrixCursor.getString(2);
                                    int columnIndex = matrixCursor.getColumnIndex("loaderVersion");
                                    if (columnIndex >= 0) {
                                        g = matrixCursor.getInt(columnIndex);
                                    }
                                    int columnIndex2 = matrixCursor.getColumnIndex("disableStandaloneDynamiteLoader2");
                                    if (columnIndex2 >= 0) {
                                        if (matrixCursor.getInt(columnIndex2) == 0) {
                                            z3 = false;
                                        }
                                        f = z3;
                                        z4 = z3;
                                    }
                                }
                                matrixCursor2 = g(matrixCursor) ? null : matrixCursor;
                            }
                            if (z2 && z4) {
                                throw new defpackage.srq("forcing fallback to container DynamiteLoader impl");
                            }
                            if (matrixCursor2 != null) {
                                matrixCursor2.close();
                            }
                            return i4;
                        }
                    } catch (java.lang.Exception e2) {
                        exc = e2;
                        if (exc instanceof defpackage.srq) {
                            throw exc;
                        }
                        throw new defpackage.srq("V2 version check failed: " + exc.getMessage(), exc);
                    } catch (java.lang.Throwable th5) {
                        th = th5;
                        matrixCursor2 = matrixCursor;
                        if (matrixCursor2 == null) {
                            throw th;
                        }
                        matrixCursor2.close();
                        throw th;
                    }
                }
                synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
                    if (matrixCursor == null) {
                        if (java.lang.Boolean.FALSE.equals(null)) {
                            android.util.Log.w("DynamiteModule", "Play services is unavailable. Will not fall back to container v1 loader.");
                            return 0;
                        }
                    }
                    android.util.Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                    throw new defpackage.srq("Failed to connect to dynamite module ContentResolver.");
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Exception e3) {
            exc = e3;
        }
    }

    private static com.google.android.gms.dynamite.DynamiteModule e(android.content.Context context, java.lang.String str) {
        android.util.Log.i("DynamiteModule", "Selected local version of ".concat(str));
        return new com.google.android.gms.dynamite.DynamiteModule(context);
    }

    private static void f(java.lang.ClassLoader classLoader) throws defpackage.srq {
        try {
            defpackage.srv srvVar = null;
            android.os.IBinder iBinder = (android.os.IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                srvVar = iInterfaceQueryLocalInterface instanceof defpackage.srv ? (defpackage.srv) iInterfaceQueryLocalInterface : new defpackage.srv(iBinder);
            }
            m = srvVar;
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e2) {
            throw new defpackage.srq("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean g(android.database.Cursor cursor) {
        defpackage.nub nubVar = (defpackage.nub) i.get();
        if (nubVar == null || nubVar.a != null) {
            return false;
        }
        nubVar.a = cursor;
        return true;
    }

    private static boolean h(android.content.Context context) {
        if (java.lang.Boolean.TRUE.equals(null) || java.lang.Boolean.TRUE.equals(h)) {
            return true;
        }
        boolean z = false;
        if (h == null) {
            android.content.pm.ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != defpackage.sqs.e() ? 0 : 268435456);
            if (defpackage.sks.d.l(context, 10000000) == 0 && providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                z = true;
            }
            java.lang.Boolean boolValueOf = java.lang.Boolean.valueOf(z);
            h = boolValueOf;
            boolValueOf.getClass();
            if (z && providerInfoResolveContentProvider.applicationInfo != null && (providerInfoResolveContentProvider.applicationInfo.flags & 129) == 0) {
                android.util.Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f = true;
            }
        }
        if (!z) {
            android.util.Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    private static defpackage.sru i(android.content.Context context) {
        defpackage.sru sruVar;
        synchronized (com.google.android.gms.dynamite.DynamiteModule.class) {
            defpackage.sru sruVar2 = l;
            if (sruVar2 != null) {
                return sruVar2;
            }
            try {
                android.os.IBinder iBinder = (android.os.IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    sruVar = null;
                } else {
                    android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    sruVar = iInterfaceQueryLocalInterface instanceof defpackage.sru ? (defpackage.sru) iInterfaceQueryLocalInterface : new defpackage.sru(iBinder);
                }
                if (sruVar != null) {
                    l = sruVar;
                    return sruVar;
                }
            } catch (java.lang.Exception e2) {
                android.util.Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    public final android.os.IBinder c() throws defpackage.srq {
        try {
            return (android.os.IBinder) this.c.getClassLoader().loadClass("com.google.android.gms.common.GoogleCertificatesImpl").newInstance();
        } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException e2) {
            throw new defpackage.srq("Failed to instantiate module class: com.google.android.gms.common.GoogleCertificatesImpl", e2);
        }
    }
}
