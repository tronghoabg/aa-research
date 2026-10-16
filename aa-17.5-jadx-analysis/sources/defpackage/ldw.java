package defpackage;

import android.app.Activity;
import android.app.ApplicationErrorReport;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.gms.car.CarInfo;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.phenotype.ExperimentTokens;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class ldw {
    public static final yph a = yph.c("GH.FeedbackSender");
    public static xyc b = new imq(12);

    static xxh a(Context context, Uri uri) throws IOException {
        try {
            int i = wdx.a;
            InputStream inputStreamB = wdx.b(context, uri, wdw.a);
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    yph yphVar = a;
                    ((ype) yphVar.l().ai(3790)).y("Copying bugreport %s", uri);
                    if (inputStreamB == null) {
                        ((ype) ((ype) yphVar.h()).ai(3793)).y("Couldn't find bugreport %s", uri);
                        xvy xvyVar = xvy.a;
                        byteArrayOutputStream.close();
                        return xvyVar;
                    }
                    yts.a(inputStreamB, byteArrayOutputStream);
                    byteArrayOutputStream.flush();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    inputStreamB.close();
                    return xxh.h(byteArray);
                } finally {
                }
            } catch (Throwable th) {
                if (inputStreamB != null) {
                    try {
                        inputStreamB.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            ((ype) ((ype) ((ype) a.h()).p(e)).ai((char) 3791)).y("Couldn't read bugreport %s from disk", uri);
            return xvy.a;
        } catch (OutOfMemoryError e2) {
            ((ype) ((ype) ((ype) a.h()).p(e2)).ai((char) 3792)).y("Bugreport %s is too large to process", uri);
            return xvy.a;
        }
    }

    public static void b(List list, byte[] bArr, boolean z) {
        ((ype) a.l().ai((char) 3786)).u("Adding bugreport to Feedback PSBD");
        list.add(new FileTeleporter(bArr, "text/plain", true != z ? "bugreport.zip" : "bugreport_minimal.zip"));
    }

    public static void c(List list, byte[] bArr) {
        ((ype) a.l().ai((char) 3787)).u("Adding logs to Feedback PSBD");
        list.add(new FileTeleporter(bArr, "text/logs", "car_logs"));
    }

    public static void d(Context context, yzy yzyVar) {
        rpz.a(context).c(rrc.h(yxy.GEARHEAD, yzz.FEEDBACK, yzyVar).l());
    }

    public static void e(Context context) {
        String strN;
        sxo.b(context);
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        new ApplicationErrorReport();
        try {
            strN = ((Boolean) srk.a.a()).booleanValue() ? a.ce("_") : thg.n();
        } catch (SecurityException unused) {
            strN = thg.n();
        }
        String str = strN;
        Bitmap bitmapB = suz.b((Activity) context);
        if (bitmapB == null) {
            bitmapB = null;
        }
        new suz(context, null).f(thg.x(bitmapB, bundle, null, null, arrayList, null, null, str)).m(new ldu());
    }

    static Map f(Context context) {
        svz svzVarAz;
        svz svzVarAz2;
        HashMap map = new HashMap();
        map.put("gearhead_version", Integer.toString(175663214));
        int i = 0;
        try {
            map.put("gearhead_version_name", context.getApplicationContext().getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e) {
            ((ype) ((ype) ((ype) a.g()).p(e)).ai((char) 3799)).u("Problems fetching gearhead package info ");
        }
        kmr kmrVar = (kmr) b.gu();
        ExperimentTokens experimentTokens = (ExperimentTokens) kmrVar.d.get();
        ExperimentTokens experimentTokens2 = ExperimentTokens.b;
        int i2 = 1;
        if (experimentTokens.equals(experimentTokens2)) {
            svz svzVarH = kmrVar.b.h("com.google.android.projection.gearhead");
            Executor executor = kmrVar.c;
            svzVarH.l(executor, new kmp(kmrVar, i2));
            svzVarH.k(executor, new kmq(i2));
            svzVarAz = svzVarH;
        } else {
            svzVarAz = spu.az(experimentTokens);
        }
        svz svzVarH2 = h(svzVarAz);
        kmr kmrVar2 = (kmr) b.gu();
        ExperimentTokens experimentTokens3 = (ExperimentTokens) kmrVar2.e.get();
        if (experimentTokens3.equals(experimentTokens2)) {
            svz svzVarH3 = kmrVar2.b.h("com.google.android.gms.car");
            Executor executor2 = kmrVar2.c;
            svzVarH3.l(executor2, new kmp(kmrVar2, i));
            svzVarH3.k(executor2, new kmq(i));
            svzVarAz2 = svzVarH3;
        } else {
            svzVarAz2 = spu.az(experimentTokens3);
        }
        svz svzVarH4 = h(svzVarAz2);
        try {
            dsg.w(new fjy(svzVarH2, svzVarH4, 2)).get(600L, TimeUnit.MILLISECONDS);
            zho zhoVar = (zho) svzVarH2.e();
            zho zhoVar2 = (zho) svzVarH4.e();
            if (zhoVar == null) {
                zhoVar = zhoVar2;
            } else if (zhoVar2 != null) {
                abnp abnpVarK = zhoVar.K();
                abnpVarK.Q(zhoVar2.d);
                zhoVar = (zho) abnpVarK.q();
            }
            if (zhoVar != null) {
                map.put("encryptedExperimentIdsProto", Base64.encodeToString(zhoVar.h(), 11));
            }
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            ((ype) ((ype) a.h()).ai((char) 3798)).u("Timer exception while waiting for experiment ids.");
        }
        CarInfo carInfoB = kiq.a().b();
        if (carInfoB != null) {
            map.put("car_manufacturer", carInfoB.a);
            map.put("car_model", carInfoB.b);
            map.put("car_model_year", carInfoB.c);
            map.put("head_unit_make", carInfoB.i);
            map.put("head_unit_model", carInfoB.j);
            map.put("head_unit_software", String.format(Locale.US, "%d.%d:%s:%s", Integer.valueOf(carInfoB.e), Integer.valueOf(carInfoB.f), carInfoB.k, carInfoB.l));
        }
        yyi yyiVarB = yyi.b((int) acvz.b());
        if (yyiVarB != null && !yyi.UNKNOWN.equals(yyiVarB)) {
            map.put("gearhead_channel", yyiVarB.name());
        }
        return map;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:0|2|88|3|(1:5)(2:101|6)|(10:87|7|(1:9)(2:93|10)|86|11|(3:91|13|14)(1:22)|89|23|(1:25)|(1:30))|63|(1:65)|66|98|67|(1:69)(1:70)|97|73|(2:76|74)|109|77|(1:79)(3:107|80|81)|84|85|(2:(0)|(1:100))) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bd, code lost:
    
        r0 = defpackage.thg.n();
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[Catch: all -> 0x0040, SYNTHETIC, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:25:0x003c, B:44:0x0059, B:43:0x0056, B:40:0x0051), top: B:86:0x001b, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b1 A[Catch: SecurityException -> 0x00bd, TryCatch #7 {SecurityException -> 0x00bd, blocks: (B:67:0x00a3, B:69:0x00b1, B:70:0x00b8), top: B:98:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8 A[Catch: SecurityException -> 0x00bd, TRY_LEAVE, TryCatch #7 {SecurityException -> 0x00bd, blocks: (B:67:0x00a3, B:69:0x00b1, B:70:0x00b8), top: B:98:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7 A[LOOP:0: B:74:0x00d1->B:76:0x00d7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(android.content.Context r24, defpackage.lbk r25) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ldw.g(android.content.Context, lbk):void");
    }

    private static svz h(svz svzVar) {
        return svzVar.c(zfq.a, new sjt(1));
    }
}
