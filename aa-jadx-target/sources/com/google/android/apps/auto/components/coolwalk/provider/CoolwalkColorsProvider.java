package com.google.android.apps.auto.components.coolwalk.provider;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u001e"}, d2 = {"Lcom/google/android/apps/auto/components/coolwalk/provider/CoolwalkColorsProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "onCreate", "", "query", "Landroid/database/Cursor;", "uri", "Landroid/net/Uri;", "projection", "", "", "selection", "selectionArgs", "sortOrder", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "getType", "insert", "values", "Landroid/content/ContentValues;", "delete", "", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "enforceCallerIsGoogleSigned", "", "callerUid", "Companion", "java.com.google.android.apps.auto.components.coolwalk.provider_provider"}, k = 1, mv = {defpackage.eie.FLOAT_FIELD_NUMBER, defpackage.eie.LONG_FIELD_NUMBER, defpackage.abnt.b}, xi = 48)
public final class CoolwalkColorsProvider extends android.content.ContentProvider {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.ColorsProvider");

    private final void a(int i) {
        if (i == android.os.Process.myUid()) {
            return;
        }
        android.content.Context context = getContext();
        context.getClass();
        java.lang.String[] packagesForUid = context.getPackageManager().getPackagesForUid(i);
        defpackage.slj sljVarA = defpackage.slj.a(getContext());
        if (packagesForUid != null) {
            for (java.lang.String str : packagesForUid) {
                if (sljVarA.b(str)) {
                    return;
                }
            }
        }
        throw new java.lang.SecurityException(defpackage.a.bo(i, "Access denied to non-Google uid: "));
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        uri.getClass();
        a(android.os.Binder.getCallingUid());
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        uri.getClass();
        a(android.os.Binder.getCallingUid());
        return "vnd.android.cursor.item/vnd.com.google.android.projection.gearhead.color_provider.gearheadColors";
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        uri.getClass();
        a(android.os.Binder.getCallingUid());
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:41:0x0103  */
    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        uri.getClass();
        a(android.os.Binder.getCallingUid());
        if (strArr == null || (strArr.length) == 0) {
            throw new java.lang.IllegalArgumentException("Query does not contain any columns");
        }
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(strArr);
        defpackage.ksb ksbVarB = defpackage.ksi.a.a().c().a.b();
        android.database.MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
        for (java.lang.String str3 : strArr) {
            switch (str3) {
                case "neutralColorHue":
                    rowBuilderNewRow.add(str3, java.lang.Double.valueOf(ksbVarB.d.b));
                    break;
                case "secondaryColorHue":
                    rowBuilderNewRow.add(str3, java.lang.Double.valueOf(ksbVarB.b.b));
                    break;
                case "tertiaryColorHue":
                    rowBuilderNewRow.add(str3, java.lang.Double.valueOf(ksbVarB.c.b));
                    break;
                case "primaryColorChroma":
                    rowBuilderNewRow.add(str3, java.lang.Double.valueOf(ksbVarB.a.c));
                    break;
                case "neutralVariantColorHue":
                    rowBuilderNewRow.add(str3, java.lang.Double.valueOf(ksbVarB.e.b));
                    break;
                case "tertiaryColorChroma":
                    rowBuilderNewRow.add(str3, java.lang.Double.valueOf(ksbVarB.c.c));
                    break;
                case "neutralColorChroma":
                    rowBuilderNewRow.add(str3, java.lang.Double.valueOf(ksbVarB.d.c));
                    break;
                case "primaryColorHue":
                    rowBuilderNewRow.add(str3, java.lang.Double.valueOf(ksbVarB.a.b));
                    break;
                case "secondaryColorChroma":
                    rowBuilderNewRow.add(str3, java.lang.Double.valueOf(ksbVarB.b.c));
                    break;
                case "neutralVariantColorChroma":
                    rowBuilderNewRow.add(str3, java.lang.Double.valueOf(ksbVarB.e.c));
                    break;
                default:
                    ((defpackage.yqj) a.h()).y("Unknown column requested: %s", str3);
                    break;
            }
        }
        android.content.Context context = getContext();
        context.getClass();
        android.content.ContentResolver contentResolver = context.getContentResolver();
        android.net.Uri uri2 = defpackage.tds.a;
        matrixCursor.setNotificationUri(contentResolver, defpackage.tds.a);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        uri.getClass();
        a(android.os.Binder.getCallingUid());
        throw new java.lang.UnsupportedOperationException();
    }
}
