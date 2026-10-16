package com.google.android.apps.auto.components.projectionstate;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import defpackage.aczc;
import defpackage.kmo;
import defpackage.mhy;
import defpackage.rpz;
import defpackage.rrb;
import defpackage.rrc;
import defpackage.wae;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes.dex */
public class ProjectionStateProvider extends ContentProvider {
    private static final yph a = yph.c("GH.ProjStateProv");
    private rpz b;

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return "text/plain";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        context.getClass();
        wae.c(context.getApplicationContext());
        Context context2 = getContext();
        context2.getClass();
        this.b = rpz.a(context2);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        strArr.getClass();
        if (strArr.length <= 0) {
            throw new IllegalArgumentException("Query does not contain any columns");
        }
        String callingPackage = getCallingPackage();
        callingPackage.getClass();
        rpz rpzVar = this.b;
        rpzVar.getClass();
        yxy yxyVar = yxy.PROVIDER;
        yzz yzzVar = yzz.PROVIDER_EVENTS;
        rrb rrbVarH = rrc.h(yxyVar, yzzVar, yzy.BG);
        rrbVarH.p(new ComponentName(callingPackage, ""));
        rpzVar.c(rrbVarH.l());
        if (!kmo.c(aczc.e(), callingPackage)) {
            ((ype) ((ype) a.h()).ai((char) 4974)).y("App %s denied from checking projection state", callingPackage);
            rpz rpzVar2 = this.b;
            rrb rrbVarH2 = rrc.h(yxyVar, yzzVar, yzy.BH);
            rrbVarH2.p(new ComponentName(callingPackage, ""));
            rpzVar2.c(rrbVarH2.l());
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        MatrixCursor.RowBuilder rowBuilderNewRow = matrixCursor.newRow();
        for (String str3 : strArr) {
            if ("CarConnectionState".equals(str3)) {
                mhy mhyVar = ProjectionStateService.a;
                if (mhyVar == null) {
                    Log.v("GH.ProjStateSvc", "No binder to the car, notifying not projecting");
                } else {
                    try {
                        i = true == mhyVar.e() ? 2 : 0;
                    } catch (RemoteException e) {
                        Log.v("GH.ProjStateSvc", "Car process is dead, notifying not projecting", e);
                        ProjectionStateService.a = null;
                    }
                    rowBuilderNewRow.add("CarConnectionState", Integer.valueOf(i));
                }
                rowBuilderNewRow.add("CarConnectionState", Integer.valueOf(i));
            } else {
                Log.e("GH.ProjStateProv", "Unexpected column requested: ".concat(String.valueOf(str3)));
            }
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }
}
