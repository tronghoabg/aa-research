package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public abstract class xrl extends android.content.ContentProvider {
    private java.lang.String a;
    private android.content.UriMatcher b;

    public android.database.Cursor a() {
        throw null;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(android.content.Context context, android.content.pm.ProviderInfo providerInfo) {
        this.a = providerInfo.authority;
        android.content.UriMatcher uriMatcher = new android.content.UriMatcher(-1);
        this.b = uriMatcher;
        uriMatcher.addURI(this.a, "settings/indexables_xml_res", 1);
        this.b.addURI(this.a, "settings/indexables_raw", 2);
        this.b.addURI(this.a, "settings/non_indexables_key", 3);
        this.b.addURI(this.a, "settings/site_map_pairs", 4);
        this.b.addURI(this.a, "settings/slice_uri_pairs", 5);
        this.b.addURI(this.a, "settings/dynamic_indexables_raw", 6);
        if (!providerInfo.exported) {
            throw new java.lang.SecurityException("Provider must be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new java.lang.SecurityException("Provider must grantUriPermissions");
        }
        if (!"android.permission.READ_SEARCH_INDEXABLES".equals(providerInfo.readPermission)) {
            throw new java.lang.SecurityException("Provider must be protected by READ_SEARCH_INDEXABLES");
        }
        super.attachInfo(context, providerInfo);
    }

    public abstract android.database.Cursor b();

    public abstract android.database.Cursor c();

    public abstract android.database.Cursor d();

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("Delete not supported");
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        int iMatch = this.b.match(uri);
        if (iMatch == 1) {
            return "vnd.android.cursor.dir/indexables_xml_res";
        }
        if (iMatch == 2) {
            return "vnd.android.cursor.dir/indexables_raw";
        }
        if (iMatch == 3) {
            return "vnd.android.cursor.dir/non_indexables_key";
        }
        if (iMatch == 6) {
            return "vnd.android.cursor.dir/indexables_raw";
        }
        throw new java.lang.IllegalArgumentException("Unknown URI ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uri))));
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException("Insert not supported");
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        try {
            switch (this.b.match(uri)) {
                case 1:
                    return d();
                case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                    return c();
                case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                    return b();
                case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                    return null;
                case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                    return a();
                default:
                    throw new java.lang.UnsupportedOperationException(defpackage.a.bX(uri, "Unknown Uri "));
            }
        } catch (java.lang.UnsupportedOperationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            android.util.Log.e("IndexablesProvider", "Provider querying exception:", e2);
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException("Update not supported");
    }
}
