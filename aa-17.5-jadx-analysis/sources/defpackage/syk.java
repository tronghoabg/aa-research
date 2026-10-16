package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import j$.util.Collection;
import j$.util.stream.Stream;

/* loaded from: classes3.dex */
public final class syk extends sxt {
    public syk() {
        super(qnl.SHARED_PREFERENCES_DELETION, 10L);
    }

    @Override // defpackage.sxt
    public final sxy a(sxy sxyVar, xxh xxhVar) {
        long jCount;
        if (!xxhVar.f() || ((qnz) xxhVar.b()).b != 6) {
            throw new IllegalArgumentException();
        }
        Context contextCreateDeviceProtectedStorageContext = sxyVar.b;
        qnz qnzVar = (qnz) xxhVar.b();
        qnw qnwVar = qnzVar.b == 6 ? (qnw) qnzVar.c : qnw.a;
        if (qnwVar.b) {
            contextCreateDeviceProtectedStorageContext = contextCreateDeviceProtectedStorageContext.createDeviceProtectedStorageContext();
        }
        boolean z = false;
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences(qnwVar.c, 0);
        aboh<String> abohVar = qnwVar.d;
        aboh abohVar2 = qnwVar.e;
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        for (String str : abohVar) {
            if (sharedPreferences.contains(str)) {
                editorEdit.remove(str);
                z = true;
            }
        }
        if (abohVar2.isEmpty()) {
            jCount = 0;
        } else {
            Stream map = Collection.EL.stream(abohVar2).map(new ric(12));
            int i = yfq.d;
            Stream streamFilter = Collection.EL.stream(sharedPreferences.getAll().keySet()).filter(new pcx((yfq) map.collect(ycm.a), 13));
            editorEdit.getClass();
            jCount = streamFilter.map(new mix(editorEdit, 17)).count();
        }
        if ((z || jCount > 0) && editorEdit.commit()) {
            Log.i("SPDeletionFix", "Preferences were deleted.");
            return sxyVar;
        }
        Log.i("SPDeletionFix", "No preferences were deleted.");
        return sxyVar;
    }

    @Override // defpackage.sxt
    public final String b() {
        return "SHARED_PREFERENCES_DELETION";
    }
}
