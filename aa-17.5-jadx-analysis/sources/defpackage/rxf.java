package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class rxf extends rxi {
    public static final ypf a = ols.R("GH.TROUBLESHOOTER");
    public final Context b;

    public rxf(Context context, Executor executor) {
        super(context, executor);
        this.b = context;
    }

    public static oky g(Context context, UUID uuid) {
        for (oky okyVar : rxi.r(context).b) {
            if (okyVar.c.equals(uuid.toString())) {
                return okyVar;
            }
        }
        return null;
    }

    public static void h(Context context, Executor executor, yxo yxoVar) {
        executor.execute(new rpo(context, yxoVar, 8, null));
    }

    public static void i(Context context, Executor executor, yxo yxoVar) {
        executor.execute(new rpo(context, yxoVar, 4, null));
    }

    public static void j(Context context, Executor executor, yxo yxoVar) {
        executor.execute(new rpo(context, yxoVar, 6, null));
    }

    @ResultIgnorabilityUnspecified
    public static void k(Context context, final String str, final yxo yxoVar) {
        a.l().ai(8463).M("Execute command %s for issue %s", str, yxoVar.name());
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        o(context, new rxe() { // from class: rxc
            @Override // defpackage.rxe
            public final void a(ContentProviderClient contentProviderClient) throws RemoteException {
                ypf ypfVar = rxf.a;
                Bundle bundle = new Bundle();
                bundle.putInt("detector_type", yxoVar.r);
                String str2 = str;
                Bundle bundleCall = contentProviderClient.call(str2, null, bundle);
                if (bundleCall == null) {
                    return;
                }
                atomicBoolean.set(bundleCall.getBoolean(str2, false));
            }
        });
        atomicBoolean.get();
    }

    @ResultIgnorabilityUnspecified
    public static void l(Context context, yxo yxoVar) {
        context.getClass();
        yxoVar.name();
        o(context, new rxd(yxoVar, 1));
    }

    @ResultIgnorabilityUnspecified
    public static void m(Context context, yxo yxoVar) {
        context.getClass();
        a.l().ai(8466).y("Reporting issue %s", yxoVar.name());
        AtomicReference atomicReference = new AtomicReference();
        o(context, new rxb(yxoVar, atomicReference, 1));
    }

    @ResultIgnorabilityUnspecified
    public static oky n(Context context, oky okyVar, int i) {
        abnp abnpVarK = okyVar.K();
        abnpVarK.t();
        oky okyVar2 = (oky) abnpVarK.b;
        okyVar2.i = i - 1;
        okyVar2.b |= 64;
        oky okyVar3 = (oky) abnpVarK.q();
        context.getClass();
        okyVar3.getClass();
        a.l().ai(8467).y("Updating issue %s", okyVar3.c);
        ContentValues contentValues = new ContentValues();
        contentValues.put("stored_issue", okyVar3.h());
        o(context, new rxd(contentValues, 0));
        return okyVar3;
    }

    @ResultIgnorabilityUnspecified
    public static void o(Context context, rxe rxeVar) {
        ContentProviderClient contentProviderClientP = null;
        try {
            try {
                contentProviderClientP = p(context);
                rxeVar.a(contentProviderClientP);
            } catch (Throwable th) {
                if (contentProviderClientP != null) {
                    contentProviderClientP.release();
                }
                throw th;
            }
        } catch (RemoteException | AssertionError | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException e) {
            a.g().p(e).ai(8464).u("Failed to operate on troubleshooter client");
        }
        if (contentProviderClientP != null) {
            contentProviderClientP.release();
        }
    }
}
