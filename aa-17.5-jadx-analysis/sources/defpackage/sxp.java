package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final /* synthetic */ class sxp implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ sxp(fkm fkmVar, ArrayList arrayList, String str, int i) {
        this.d = i;
        this.b = fkmVar;
        this.a = arrayList;
        this.c = str;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, zqz] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws RemoteException {
        IInterface iInterface;
        int i = this.d;
        if (i == 0) {
            return Boolean.valueOf(((rju) this.a).o((Context) this.b, (qnj) this.c));
        }
        if (i == 1) {
            WorkDatabase workDatabase = ((fkm) this.b).e;
            String str = (String) this.c;
            ((ArrayList) this.a).addAll(workDatabase.y().a(str));
            return workDatabase.x().c(str);
        }
        if (i == 2) {
            sxw sxwVar = (sxw) this.b;
            return sxwVar.b((sxy) this.c, (rjg) this.a, sxwVar.e);
        }
        Object obj = this.a;
        synchronized (((zsj) obj).j) {
            iInterface = ((zsj) obj).k;
        }
        if (iInterface == null) {
            throw new RemoteException("Service was closed in the middle of the execution.");
        }
        try {
            try {
                String str2 = zqw.a;
                if (zrn.e(str2, 4)) {
                    Log.i(str2, "Sending API token request.");
                }
                Object obj2 = this.b;
                Bundle bundle = new Bundle(4);
                bundle.putString("PACKAGE_NAME", ((zqw) obj2).c);
                bundle.putString("API_KEY", ((zqw) obj2).b);
                bundle.putBoolean("IS_GMM10_RENDERER", true);
                bundle.putInt("CLIENT_TYPE", 3);
                Parcel parcelGh = ((ijn) iInterface).gh();
                ijp.g(parcelGh, bundle);
                Parcel parcelGi = ((ijn) iInterface).gi(1, parcelGh);
                Bundle bundle2 = (Bundle) ijp.a(parcelGi, Bundle.CREATOR);
                parcelGi.recycle();
                ?? r1 = this.c;
                short s = bundle2.getShort("ERROR_CODE", (short) -1);
                if (s == -1) {
                    String string = bundle2.getString("API_TOKEN");
                    if (string != null) {
                        long j = bundle2.getLong("VALIDITY_DURATION");
                        if (zrn.e(str2, 4)) {
                            Log.i(str2, "Received API Token: " + string + " / Expires in: " + j + "ms");
                        }
                        ((zqy) r1).h = -1L;
                        long jCurrentTimeMillis = System.currentTimeMillis() + j;
                        ((zqy) r1).f(string, jCurrentTimeMillis, j);
                        ((zqy) r1).i.b(((zqy) r1).g, string, jCurrentTimeMillis);
                    } else {
                        r1.d("Missing token in service response.");
                    }
                } else if (s == 1) {
                    ((zqw) obj2).c();
                    r1.d("Authentication failed. Package names don't match.");
                } else if (s == 2) {
                    ((zqw) obj2).c();
                    r1.d("Authentication failed. Could not extract app certificate");
                } else if (s == 3) {
                    ((zqw) obj2).c();
                    r1.d("Authentication failed. API Key not found in the request.");
                } else if (s == 4) {
                    ((zqw) obj2).c();
                    r1.d("Authentication failed on the server.");
                } else if (s != 5) {
                    ((zqw) obj2).c();
                    r1.d(a.bp(s, "Authentication failed. Unrecognized error: "));
                } else {
                    if (zrn.e(str2, 6)) {
                        Log.e(str2, "Authentication failed. Timeout while trying to contact the server.");
                    }
                    ((zqy) r1).e();
                }
            } catch (Throwable th) {
                ((zsj) this.b).d();
                throw th;
            }
        } catch (RemoteException | RuntimeException e) {
            String str3 = zqw.a;
            if (zrn.e(str3, 6)) {
                Log.e(str3, "Exception when sending the token request.", e);
            }
            ((zqy) this.c).e();
        }
        ((zsj) this.b).d();
        return null;
    }

    public /* synthetic */ sxp(rju rjuVar, Context context, qnj qnjVar, int i) {
        this.d = i;
        this.a = rjuVar;
        this.b = context;
        this.c = qnjVar;
    }

    public /* synthetic */ sxp(sxw sxwVar, sxy sxyVar, rjg rjgVar, int i) {
        this.d = i;
        this.b = sxwVar;
        this.c = sxyVar;
        this.a = rjgVar;
    }

    public sxp(zqw zqwVar, zqz zqzVar, int i) {
        this.d = i;
        this.c = zqzVar;
        this.b = zqwVar;
        this.a = zqwVar;
    }
}
