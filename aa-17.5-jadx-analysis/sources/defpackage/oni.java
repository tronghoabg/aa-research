package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.text.format.DateUtils;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.projection.gearhead.R;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j$.time.Instant;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public final class oni {
    public static boolean a;

    public static final String a(Context context, long j) {
        oit.a();
        long epochMilli = Instant.now().toEpochMilli();
        return epochMilli - j < 60000 ? context.getString(R.string.now) : DateUtils.getRelativeTimeSpanString(j, epochMilli, 60000L, 262144).toString();
    }

    public static void b() {
    }

    public static final int c(qrn qrnVar) throws qrz {
        return qrnVar.a().a();
    }

    public static final CarInfo d(qrn qrnVar) throws qrz {
        return qrnVar.a().c();
    }

    public static final rog e(qrn qrnVar) throws qrz, qsa {
        return qrnVar.a().x();
    }

    public static final roj f(qrn qrnVar) throws qrz, qsa {
        return qrnVar.a().y();
    }

    public static final rol g(qrn qrnVar, String str) throws qrz, qsa {
        rdm rdmVarD = ((qsz) qrnVar).d();
        return (rol) rdmVarD.f.a(new rcy(rdmVarD, str, 3));
    }

    public static final boolean h(qrn qrnVar) {
        rdm rdmVarD = ((qsz) qrnVar).d();
        try {
            return ((Boolean) rdmVarD.f.d(new rcl(rdmVarD.C(), 9), false)).booleanValue();
        } catch (RemoteException | IllegalStateException unused) {
            return false;
        }
    }

    public static boolean i(Future future) {
        if (!future.isDone() || future.isCancelled()) {
            return false;
        }
        try {
            woy.ad(future.isDone(), "Future was expected to be done: %s", future);
            a.L(future);
            return true;
        } catch (CancellationException | ExecutionException unused) {
            return false;
        }
    }

    public static final boolean j(String str) {
        return a || rrd.e(str, 3);
    }

    public static skw k(Status status) {
        return status.h != null ? new slh(status) : new skw(status);
    }

    public static void l(Status status, Object obj, nok nokVar) {
        if (status.c()) {
            nokVar.e(obj);
        } else {
            nokVar.d(k(status));
        }
    }

    public static void m(Status status, Object obj, nok nokVar, ApiMetadata apiMetadata) {
        if (apiMetadata != null) {
            std stdVar = ssh.a;
        }
        n(status, obj, nokVar);
    }

    @ResultIgnorabilityUnspecified
    public static void n(Status status, Object obj, nok nokVar) {
        if (status.c()) {
            nokVar.e(obj);
        } else {
            nokVar.d(k(status));
        }
    }
}
