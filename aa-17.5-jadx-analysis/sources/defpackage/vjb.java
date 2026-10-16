package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.libraries.maps.MapsApiSettings$$ExternalSyntheticLambda0;
import com.google.android.libraries.maps.model.RuntimeRemoteException;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.Queue;

/* loaded from: classes3.dex */
public final class vjb {
    public static volatile ved a = null;
    public static final Queue b = new ConcurrentLinkedQueue();
    private static final String c = "vjb";
    private static Context d;

    static {
        int i = vdw.a;
    }

    public static ved a(Context context) throws skk, PackageManager.NameNotFoundException {
        spu.aw(context);
        if (a == null) {
            int iB = skm.b(context, 12451000);
            if (iB != 0) {
                throw new skk(iB);
            }
            Log.i(c, "Making Creator statically");
            try {
                a = (ved) b(Class.forName("com.google.android.libraries.maps.internal.CreatorImpl"));
                try {
                    ved vedVar = a;
                    Context applicationContext = d;
                    if (applicationContext == null) {
                        applicationContext = context.getApplicationContext();
                        d = applicationContext;
                    }
                    vedVar.i(new sqi(applicationContext.getResources()), 0);
                    while (true) {
                        Queue queue = b;
                        if (queue.isEmpty()) {
                            break;
                        }
                        try {
                            MapsApiSettings$$ExternalSyntheticLambda0 mapsApiSettings$$ExternalSyntheticLambda0 = (MapsApiSettings$$ExternalSyntheticLambda0) queue.poll();
                            spu.aw(mapsApiSettings$$ExternalSyntheticLambda0);
                            mapsApiSettings$$ExternalSyntheticLambda0.run(a);
                        } catch (RemoteException e) {
                            throw new RuntimeRemoteException(e);
                        }
                    }
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new AssertionError(e3);
            }
        }
        return a;
    }

    private static Object b(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(String.valueOf(cls.getName())), e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(String.valueOf(cls.getName())), e2);
        }
    }
}
