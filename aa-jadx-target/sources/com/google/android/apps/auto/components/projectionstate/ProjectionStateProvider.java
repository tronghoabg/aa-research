package com.google.android.apps.auto.components.projectionstate;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class ProjectionStateProvider extends android.content.ContentProvider {
    private static final defpackage.yqm a = defpackage.yqm.c("GH.ProjStateProv");
    private defpackage.rqt b;

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        return "text/plain";
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        android.content.Context context = getContext();
        context.getClass();
        defpackage.wba.c(context.getApplicationContext());
        android.content.Context context2 = getContext();
        context2.getClass();
        this.b = defpackage.rqt.a(context2);
        return true;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        int i;
        strArr.getClass();
        if (strArr.length <= 0) {
            throw new java.lang.IllegalArgumentException("Query does not contain any columns");
        }
        java.lang.String callingPackage = getCallingPackage();
        callingPackage.getClass();
        defpackage.rqt rqtVar = this.b;
        rqtVar.getClass();
        defpackage.yzd yzdVar = defpackage.yzd.PROVIDER;
        defpackage.zbe zbeVar = defpackage.zbe.PROVIDER_EVENTS;
        defpackage.rrv rrvVarH = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.BK);
        rrvVarH.p(new android.content.ComponentName(callingPackage, ""));
        rqtVar.c(rrvVarH.l());
        if (!defpackage.kmv.c(defpackage.adae.e(), callingPackage)) {
            ((defpackage.yqj) ((defpackage.yqj) a.h()).ai((char) 4977)).y("App %s denied from checking projection state", callingPackage);
            defpackage.rqt rqtVar2 = this.b;
            defpackage.rrv rrvVarH2 = defpackage.rrw.h(yzdVar, zbeVar, defpackage.zbd.BL);
            rrvVarH2.p(new android.content.ComponentName(callingPackage, ""));
            rqtVar2.c(rrvVarH2.l());
            return null;
        }
        android.database.MatrixCursor matrixCursor = new android.database.MatrixCursor(strArr);
        android.database.MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
        for (java.lang.String str3 : strArr) {
            if ("CarConnectionState".equals(str3)) {
                defpackage.mie mieVar = com.google.android.apps.auto.components.projectionstate.ProjectionStateService.a;
                if (mieVar == null) {
                    android.util.Log.v("GH.ProjStateSvc", "No binder to the car, notifying not projecting");
                } else {
                    try {
                        i = true == mieVar.e() ? 2 : 0;
                    } catch (android.os.RemoteException e) {
                        android.util.Log.v("GH.ProjStateSvc", "Car process is dead, notifying not projecting", e);
                        com.google.android.apps.auto.components.projectionstate.ProjectionStateService.a = null;
                    }
                    rowBuilderNewRow.add("CarConnectionState", java.lang.Integer.valueOf(i));
                }
                rowBuilderNewRow.add("CarConnectionState", java.lang.Integer.valueOf(i));
            } else {
                android.util.Log.e("GH.ProjStateProv", "Unexpected column requested: ".concat(java.lang.String.valueOf(str3)));
            }
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        throw new java.lang.UnsupportedOperationException();
    }
}
