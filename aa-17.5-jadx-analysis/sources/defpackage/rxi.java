package defpackage;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.ContentObserver;
import android.os.RemoteException;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class rxi {
    private static final ypf a = ols.R("GH.TROUBLESHOOTER");
    public final Executor c;
    public final Context d;
    public final Map e = DesugarCollections.synchronizedMap(new HashMap());

    public rxi(Context context, Executor executor) {
        this.d = context;
        this.c = executor;
    }

    protected static ContentProviderClient p(Context context) throws RemoteException {
        ContentProviderClient contentProviderClientAcquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(rxj.a);
        if (contentProviderClientAcquireContentProviderClient == null) {
            throw new RemoteException("Content provider not found");
        }
        if (u(context)) {
            return contentProviderClientAcquireContentProviderClient;
        }
        contentProviderClientAcquireContentProviderClient.release();
        throw new SecurityException("Content provider is not Google signed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.okx q(android.content.Context r3) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "retrieve_stored_troubleshooter_parameters"
            r3.getClass()
            ypf r1 = defpackage.rxi.a
            yop r1 = r1.l()
            r2 = 8475(0x211b, float:1.1876E-41)
            yop r1 = r1.ai(r2)
            java.lang.String r2 = "Retrieving troubleshooter parameters"
            r1.u(r2)
            r1 = 0
            android.content.ContentProviderClient r3 = p(r3)     // Catch: java.lang.Throwable -> L4b java.lang.UnsupportedOperationException -> L4d java.lang.AssertionError -> L4f defpackage.abon -> L51 java.lang.SecurityException -> L53 android.os.RemoteException -> L55
            android.os.Bundle r2 = android.os.Bundle.EMPTY     // Catch: java.lang.Throwable -> L3d java.lang.UnsupportedOperationException -> L40 java.lang.AssertionError -> L42 defpackage.abon -> L44 java.lang.SecurityException -> L46 android.os.RemoteException -> L48
            android.os.Bundle r1 = r3.call(r0, r1, r2)     // Catch: java.lang.Throwable -> L3d java.lang.UnsupportedOperationException -> L40 java.lang.AssertionError -> L42 defpackage.abon -> L44 java.lang.SecurityException -> L46 android.os.RemoteException -> L48
            r1.getClass()     // Catch: java.lang.Throwable -> L3d java.lang.UnsupportedOperationException -> L40 java.lang.AssertionError -> L42 defpackage.abon -> L44 java.lang.SecurityException -> L46 android.os.RemoteException -> L48
            byte[] r0 = r1.getByteArray(r0)     // Catch: java.lang.Throwable -> L3d java.lang.UnsupportedOperationException -> L40 java.lang.AssertionError -> L42 defpackage.abon -> L44 java.lang.SecurityException -> L46 android.os.RemoteException -> L48
            if (r0 != 0) goto L2d
            okx r0 = defpackage.rxj.b     // Catch: java.lang.Throwable -> L3d java.lang.UnsupportedOperationException -> L40 java.lang.AssertionError -> L42 defpackage.abon -> L44 java.lang.SecurityException -> L46 android.os.RemoteException -> L48
            goto L39
        L2d:
            abnj r1 = defpackage.abnj.a()     // Catch: java.lang.Throwable -> L3d java.lang.UnsupportedOperationException -> L40 java.lang.AssertionError -> L42 defpackage.abon -> L44 java.lang.SecurityException -> L46 android.os.RemoteException -> L48
            okx r2 = defpackage.okx.a     // Catch: java.lang.Throwable -> L3d java.lang.UnsupportedOperationException -> L40 java.lang.AssertionError -> L42 defpackage.abon -> L44 java.lang.SecurityException -> L46 android.os.RemoteException -> L48
            abnv r0 = defpackage.abnv.B(r2, r0, r1)     // Catch: java.lang.Throwable -> L3d java.lang.UnsupportedOperationException -> L40 java.lang.AssertionError -> L42 defpackage.abon -> L44 java.lang.SecurityException -> L46 android.os.RemoteException -> L48
            okx r0 = (defpackage.okx) r0     // Catch: java.lang.Throwable -> L3d java.lang.UnsupportedOperationException -> L40 java.lang.AssertionError -> L42 defpackage.abon -> L44 java.lang.SecurityException -> L46 android.os.RemoteException -> L48
        L39:
            r3.release()
            return r0
        L3d:
            r0 = move-exception
            r1 = r3
            goto L76
        L40:
            r0 = move-exception
            goto L49
        L42:
            r0 = move-exception
            goto L49
        L44:
            r0 = move-exception
            goto L49
        L46:
            r0 = move-exception
            goto L49
        L48:
            r0 = move-exception
        L49:
            r1 = r3
            goto L57
        L4b:
            r0 = move-exception
            goto L76
        L4d:
            r3 = move-exception
            goto L56
        L4f:
            r3 = move-exception
            goto L56
        L51:
            r3 = move-exception
            goto L56
        L53:
            r3 = move-exception
            goto L56
        L55:
            r3 = move-exception
        L56:
            r0 = r3
        L57:
            ypf r3 = defpackage.rxi.a     // Catch: java.lang.Throwable -> L74
            yop r3 = r3.l()     // Catch: java.lang.Throwable -> L74
            yop r3 = r3.p(r0)     // Catch: java.lang.Throwable -> L74
            r0 = 8476(0x211c, float:1.1877E-41)
            yop r3 = r3.ai(r0)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "Failed to retrieve troubleshooter parameters."
            r3.u(r0)     // Catch: java.lang.Throwable -> L74
            okx r3 = defpackage.rxj.b     // Catch: java.lang.Throwable -> L74
            if (r1 == 0) goto L73
            r1.release()
        L73:
            return r3
        L74:
            r3 = move-exception
            r0 = r3
        L76:
            if (r1 == 0) goto L7b
            r1.release()
        L7b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxi.q(android.content.Context):okx");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.okz r(android.content.Context r3) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "retrieve_stored_issue_detectors"
            r3.getClass()
            ypf r1 = defpackage.rxi.a
            yop r1 = r1.l()
            r2 = 8473(0x2119, float:1.1873E-41)
            yop r1 = r1.ai(r2)
            java.lang.String r2 = "Retrieving issue list"
            r1.u(r2)
            r1 = 0
            android.content.ContentProviderClient r3 = p(r3)     // Catch: java.lang.Throwable -> L53 java.lang.AssertionError -> L55 defpackage.abon -> L57 java.lang.SecurityException -> L59 android.os.RemoteException -> L5b
            android.os.Bundle r2 = android.os.Bundle.EMPTY     // Catch: java.lang.Throwable -> L47 java.lang.AssertionError -> L4a defpackage.abon -> L4c java.lang.SecurityException -> L4e android.os.RemoteException -> L50
            android.os.Bundle r1 = r3.call(r0, r1, r2)     // Catch: java.lang.Throwable -> L47 java.lang.AssertionError -> L4a defpackage.abon -> L4c java.lang.SecurityException -> L4e android.os.RemoteException -> L50
            r1.getClass()     // Catch: java.lang.Throwable -> L47 java.lang.AssertionError -> L4a defpackage.abon -> L4c java.lang.SecurityException -> L4e android.os.RemoteException -> L50
            byte[] r0 = r1.getByteArray(r0)     // Catch: java.lang.Throwable -> L47 java.lang.AssertionError -> L4a defpackage.abon -> L4c java.lang.SecurityException -> L4e android.os.RemoteException -> L50
            if (r0 != 0) goto L2d
            okz r0 = defpackage.okz.a     // Catch: java.lang.Throwable -> L47 java.lang.AssertionError -> L4a defpackage.abon -> L4c java.lang.SecurityException -> L4e android.os.RemoteException -> L50
            goto L43
        L2d:
            okz r1 = defpackage.okz.a     // Catch: java.lang.Throwable -> L47 java.lang.AssertionError -> L4a defpackage.abon -> L4c java.lang.SecurityException -> L4e android.os.RemoteException -> L50
            abnp r1 = r1.n()     // Catch: java.lang.Throwable -> L47 java.lang.AssertionError -> L4a defpackage.abon -> L4c java.lang.SecurityException -> L4e android.os.RemoteException -> L50
            abnj r2 = defpackage.abnj.a()     // Catch: java.lang.Throwable -> L47 java.lang.AssertionError -> L4a defpackage.abon -> L4c java.lang.SecurityException -> L4e android.os.RemoteException -> L50
            abmc r0 = r1.h(r0, r2)     // Catch: java.lang.Throwable -> L47 java.lang.AssertionError -> L4a defpackage.abon -> L4c java.lang.SecurityException -> L4e android.os.RemoteException -> L50
            abnp r0 = (defpackage.abnp) r0     // Catch: java.lang.Throwable -> L47 java.lang.AssertionError -> L4a defpackage.abon -> L4c java.lang.SecurityException -> L4e android.os.RemoteException -> L50
            abnv r0 = r0.q()     // Catch: java.lang.Throwable -> L47 java.lang.AssertionError -> L4a defpackage.abon -> L4c java.lang.SecurityException -> L4e android.os.RemoteException -> L50
            okz r0 = (defpackage.okz) r0     // Catch: java.lang.Throwable -> L47 java.lang.AssertionError -> L4a defpackage.abon -> L4c java.lang.SecurityException -> L4e android.os.RemoteException -> L50
        L43:
            r3.release()
            return r0
        L47:
            r0 = move-exception
            r1 = r3
            goto L7c
        L4a:
            r0 = move-exception
            goto L51
        L4c:
            r0 = move-exception
            goto L51
        L4e:
            r0 = move-exception
            goto L51
        L50:
            r0 = move-exception
        L51:
            r1 = r3
            goto L5d
        L53:
            r0 = move-exception
            goto L7c
        L55:
            r3 = move-exception
            goto L5c
        L57:
            r3 = move-exception
            goto L5c
        L59:
            r3 = move-exception
            goto L5c
        L5b:
            r3 = move-exception
        L5c:
            r0 = r3
        L5d:
            ypf r3 = defpackage.rxi.a     // Catch: java.lang.Throwable -> L7a
            yop r3 = r3.l()     // Catch: java.lang.Throwable -> L7a
            yop r3 = r3.p(r0)     // Catch: java.lang.Throwable -> L7a
            r0 = 8474(0x211a, float:1.1875E-41)
            yop r3 = r3.ai(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = "Failed to retrieve issue list."
            r3.u(r0)     // Catch: java.lang.Throwable -> L7a
            okz r3 = defpackage.okz.a     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L79
            r1.release()
        L79:
            return r3
        L7a:
            r3 = move-exception
            r0 = r3
        L7c:
            if (r1 == 0) goto L81
            r1.release()
        L81:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxi.r(android.content.Context):okz");
    }

    protected static boolean u(Context context) {
        context.getClass();
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.projection.gearhead.troubleshooter_provider", 0);
        if (providerInfoResolveContentProvider == null) {
            throw new AssertionError("Content provider info not found");
        }
        a.l().ai(8472).y("Checking package %s", providerInfoResolveContentProvider.packageName);
        return skn.a(context).b(providerInfoResolveContentProvider.packageName);
    }

    public final void s(rxh rxhVar) {
        rxhVar.getClass();
        try {
            Context context = this.d;
            if (!u(context)) {
                a.l().ai(8469).u("Not adding listener as Gearhead cannot be verified");
                return;
            }
            a.l().ai(8471).u("Adding new troubleshooter listener");
            rxg rxgVar = new rxg(this, new sss(context.getMainLooper()), rxhVar);
            Map map = this.e;
            synchronized (map) {
                context.getContentResolver().registerContentObserver(rxj.a, true, rxgVar);
                map.put(rxhVar, rxgVar);
            }
        } catch (AssertionError e) {
            a.l().p(e).ai(8470).u("Not adding listener as Gearhead cannot be verified");
        }
    }

    public final void t() {
        Map map = this.e;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                this.d.getContentResolver().unregisterContentObserver((ContentObserver) it.next());
            }
            map.clear();
        }
    }
}
