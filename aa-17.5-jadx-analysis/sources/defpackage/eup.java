package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final /* synthetic */ class eup implements afdr {
    private final /* synthetic */ int a;

    public /* synthetic */ eup(int i) {
        this.a = i;
    }

    @Override // defpackage.afdr
    public final Object invoke() {
        Class<?> returnType;
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                return new erh();
            case 1:
                return new vo(bArr);
            case 2:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ebc.e(affw.b(evt.class), new dmw(12), linkedHashMap);
                return ebc.d(linkedHashMap);
            case 3:
                return afak.a;
            case 4:
                return afak.a;
            case 5:
                int i = ezv.h;
                return true;
            case 6:
                String[] strArr = fbs.a;
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 7:
                String[] strArr2 = fbs.a;
                try {
                    Method methodF = dsq.f();
                    if (methodF != null && (returnType = methodF.getReturnType()) != null) {
                        Class<?> cls = Integer.TYPE;
                        return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                    }
                } catch (Throwable unused2) {
                }
                return null;
            case 8:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 9:
                return new fns();
            case 10:
                fmm fmmVar = fmm.a;
                return afak.a;
            case 11:
                return new ajia();
            case 12:
                return null;
            case 13:
                throw new IllegalStateException("No CarAppColors were set in this composition tree.");
            case 14:
                return fwf.b;
            case 15:
                return afak.a;
            case 16:
                return afak.a;
            case 17:
                return afak.a;
            case 18:
                return afak.a;
            case 19:
                return afak.a;
            default:
                return afak.a;
        }
    }
}
