package defpackage;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class lbo {
    private static final yph a = yph.c("GH.FeedbackUtils");

    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, rjb] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, rjb] */
    public static void a(qrn qrnVar, OutputStream outputStream, lbn lbnVar) throws IOException {
        rjh rjhVar;
        rjg rjgVarM = ols.m(qrnVar);
        rjh rjhVar2 = null;
        if (rjgVarM == null) {
            ((ype) ((ype) a.g()).ai((char) 3735)).u("diagnosticsManager is null, so skipping writing logcat and dumpsys!");
            lbnVar.a("diagnosticsManager is null, so skipping writing logcat and dumpsys!");
            rjhVar = null;
        } else {
            lbnVar.a("begin fetching logcat");
            rjf rjfVar = new rjf((Looper) rjgVarM.b);
            try {
                rjgVarM.a.c(new rjd(rjfVar));
            } catch (RemoteException unused) {
                rjfVar.j(new rjh(Status.c, (InputStream) null, 0));
            }
            rjh rjhVar3 = (rjh) rjfVar.c(300L, TimeUnit.SECONDS);
            lbnVar.a("end fetching logcat");
            lbnVar.a("begin fetching dumpsys");
            rjf rjfVar2 = new rjf((Looper) rjgVarM.b);
            try {
                rjgVarM.a.b(new rjd(rjfVar2));
            } catch (RemoteException unused2) {
                rjfVar2.j(new rjh(Status.c, (InputStream) null, 0));
            }
            rjh rjhVar4 = (rjh) rjfVar2.c(300L, TimeUnit.SECONDS);
            lbnVar.a("end fetching dumpsys");
            rjhVar = rjhVar4;
            rjhVar2 = rjhVar3;
        }
        b("Gearhead", outputStream);
        outputStream.write("Gearhead L logging: Full dump of circular log maintained by L class.\nIncludes all recent logs from gearhead package regardless of TAG or logging level\n".getBytes(StandardCharsets.UTF_8));
        PrintWriter printWriter = new PrintWriter(outputStream);
        tez.c(printWriter);
        printWriter.flush();
        if (rjhVar2 != null) {
            b("logcat", outputStream);
            c("logcat", lbnVar, rjhVar2, outputStream);
        }
        if (rjhVar != null) {
            c("dumpsys", lbnVar, rjhVar, outputStream);
        }
        outputStream.flush();
    }

    private static void b(String str, OutputStream outputStream) throws IOException {
        outputStream.write(String.format(Locale.US, "---------- %s ----------\n", str).getBytes(StandardCharsets.UTF_8));
    }

    private static void c(String str, lbn lbnVar, rjh rjhVar, OutputStream outputStream) throws IOException {
        Status status = rjhVar.a;
        lbnVar.a("fetch ", str, " status: ", status.toString());
        if (status.c()) {
            try {
                if (status.f != 0) {
                    throw new IllegalStateException();
                }
                Object obj = rjhVar.b;
                try {
                    lbnVar.a("fetch ", str, " size: ", Long.toString(yts.a((InputStream) obj, outputStream)));
                    if (obj != null) {
                        ((InputStream) obj).close();
                    }
                } finally {
                }
            } catch (IOException e) {
                ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 3736)).y("IO error writing %s", str);
                lbnVar.a("IO error writing ".concat(str));
            }
        }
    }
}
