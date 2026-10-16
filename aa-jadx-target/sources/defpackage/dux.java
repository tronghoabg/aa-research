package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class dux extends android.content.ContentProvider {
    private static final java.lang.String[] a = {"_display_name", "_size"};
    private static final java.io.File b = new java.io.File("/");
    private static final java.util.HashMap c = new java.util.HashMap();
    private final java.lang.Object d;
    private final int e;
    private java.lang.String f;
    private se g;

    protected dux(int i) {
        this.d = new java.lang.Object();
        this.e = i;
    }

    public static android.net.Uri a(android.content.Context context, java.lang.String str, java.io.File file) {
        se seVarD = d(context, str, 0);
        try {
            java.lang.String canonicalPath = file.getCanonicalPath();
            java.util.Map.Entry entry = null;
            for (java.util.Map.Entry entry2 : ((java.util.HashMap) seVarD.b).entrySet()) {
                java.lang.String path = ((java.io.File) entry2.getValue()).getPath();
                if (se.o(canonicalPath, path) && (entry == null || path.length() > ((java.io.File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                throw new java.lang.IllegalArgumentException("Failed to find configured root that contains ".concat(java.lang.String.valueOf(canonicalPath)));
            }
            java.lang.String path2 = ((java.io.File) entry.getValue()).getPath();
            return new android.net.Uri.Builder().scheme("content").authority((java.lang.String) seVarD.a).encodedPath(android.net.Uri.encode((java.lang.String) entry.getKey()) + '/' + android.net.Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (java.io.IOException unused) {
            java.util.Objects.toString(file);
            throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for ".concat(java.lang.String.valueOf(file)));
        }
    }

    public static java.lang.String b(java.lang.String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    private final se c() {
        se seVarD;
        synchronized (this.d) {
            defpackage.a.ak(this.f, "mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
            seVarD = this.g;
            if (seVarD == null) {
                seVarD = d(getContext(), this.f, this.e);
                this.g = seVarD;
            }
        }
        return seVarD;
    }

    private static se d(android.content.Context context, java.lang.String str, int i) {
        se seVar;
        java.util.HashMap map = c;
        synchronized (map) {
            seVar = (se) map.get(str);
            if (seVar == null) {
                try {
                    try {
                        seVar = new se(str);
                        android.content.pm.ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
                        if (providerInfoResolveContentProvider == null) {
                            throw new java.lang.IllegalArgumentException("Couldn't find meta-data for provider with authority ".concat(java.lang.String.valueOf(str)));
                        }
                        if (providerInfoResolveContentProvider.metaData == null && i != 0) {
                            providerInfoResolveContentProvider.metaData = new android.os.Bundle(1);
                            providerInfoResolveContentProvider.metaData.putInt("android.support.FILE_PROVIDER_PATHS", i);
                        }
                        android.content.res.XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                        if (xmlResourceParserLoadXmlMetaData == null) {
                            throw new java.lang.IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                        }
                        while (true) {
                            int next = xmlResourceParserLoadXmlMetaData.next();
                            if (next == 1) {
                                map.put(str, seVar);
                                break;
                            }
                            if (next == 2) {
                                java.lang.String name = xmlResourceParserLoadXmlMetaData.getName();
                                java.io.File externalStorageDirectory = null;
                                java.lang.String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                                java.lang.String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                                if ("root-path".equals(name)) {
                                    externalStorageDirectory = b;
                                } else if ("files-path".equals(name)) {
                                    externalStorageDirectory = context.getFilesDir();
                                } else if ("cache-path".equals(name)) {
                                    externalStorageDirectory = context.getCacheDir();
                                } else if ("external-path".equals(name)) {
                                    externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
                                } else if ("external-files-path".equals(name)) {
                                    java.io.File[] externalFilesDirs = context.getExternalFilesDirs(null);
                                    if (externalFilesDirs.length > 0) {
                                        externalStorageDirectory = externalFilesDirs[0];
                                    }
                                } else if ("external-cache-path".equals(name)) {
                                    java.io.File[] externalCacheDirs = context.getExternalCacheDirs();
                                    if (externalCacheDirs.length > 0) {
                                        externalStorageDirectory = externalCacheDirs[0];
                                    }
                                } else if ("external-media-path".equals(name)) {
                                    java.io.File[] externalMediaDirs = context.getExternalMediaDirs();
                                    if (externalMediaDirs.length > 0) {
                                        externalStorageDirectory = externalMediaDirs[0];
                                    }
                                }
                                if (externalStorageDirectory != null) {
                                    java.lang.String[] strArr = {attributeValue2};
                                    for (char c2 = 0; c2 <= 0; c2 = 1) {
                                        java.lang.String str2 = strArr[0];
                                        if (str2 != null) {
                                            externalStorageDirectory = new java.io.File(externalStorageDirectory, str2);
                                        }
                                    }
                                    if (android.text.TextUtils.isEmpty(attributeValue)) {
                                        throw new java.lang.IllegalArgumentException("Name must not be empty");
                                    }
                                    try {
                                        ((java.util.HashMap) seVar.b).put(attributeValue, externalStorageDirectory.getCanonicalFile());
                                    } catch (java.io.IOException e) {
                                        java.util.Objects.toString(externalStorageDirectory);
                                        throw new java.lang.IllegalArgumentException("Failed to resolve canonical path for ".concat(externalStorageDirectory.toString()), e);
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    } catch (java.io.IOException e2) {
                        throw new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                } catch (org.xmlpull.v1.XmlPullParserException e3) {
                    throw new java.lang.IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                }
            }
        }
        return seVar;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(android.content.Context context, android.content.pm.ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new java.lang.SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new java.lang.SecurityException("Provider must grant uri permissions");
        }
        if (providerInfo.authority == null || providerInfo.authority.trim().isEmpty()) {
            throw new java.lang.SecurityException("Provider must have a non-empty authority");
        }
        java.lang.String str = providerInfo.authority.split(";")[0];
        synchronized (this.d) {
            this.f = str;
        }
        java.util.HashMap map = c;
        synchronized (map) {
            map.remove(str);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return c().n(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        java.io.File fileN = c().n(uri);
        int iLastIndexOf = fileN.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        java.lang.String mimeTypeFromExtension = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileN.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getTypeAnonymous(android.net.Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) throws java.io.FileNotFoundException {
        int i;
        java.io.File fileN = c().n(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                throw new java.lang.IllegalArgumentException("Invalid mode: ".concat(java.lang.String.valueOf(str)));
            }
            i = 1006632960;
        }
        return android.os.ParcelFileDescriptor.open(fileN, i);
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int i;
        java.io.File fileN = c().n(uri);
        java.lang.String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = a;
        }
        int length = strArr.length;
        java.lang.String[] strArr3 = new java.lang.String[length];
        java.lang.Object[] objArr = new java.lang.Object[length];
        int i2 = 0;
        for (java.lang.String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                i = i2 + 1;
                strArr3[i2] = "_display_name";
                objArr[i2] = queryParameter == null ? fileN.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    i = i2 + 1;
                    strArr3[i2] = "_size";
                    objArr[i2] = java.lang.Long.valueOf(fileN.length());
                }
            }
            i2 = i;
        }
        java.lang.String[] strArr4 = new java.lang.String[i2];
        java.lang.System.arraycopy(strArr3, 0, strArr4, 0, i2);
        java.lang.Object[] objArr2 = new java.lang.Object[i2];
        java.lang.System.arraycopy(objArr, 0, objArr2, 0, i2);
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("No external updates");
    }

    public dux() {
        this(0);
    }
}
