package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.car.RadioProgramSelector;
import java.io.ByteArrayOutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class rjg {
    public final Object a;
    public final Object b;

    public rjg(Context context) {
        rdx rdxVarB = tss.B(context);
        spu spuVar = ssr.a;
        ExecutorService executorServiceAF = spu.aF(4);
        Pattern pattern = wez.a;
        wey weyVar = new wey(context);
        weyVar.b("app_doctor");
        weyVar.c("AppDoctor.pb");
        Uri uriA = weyVar.a();
        wgg wggVarA = wgh.a();
        wggVarA.d(uriA);
        wggVarA.c(syo.a);
        this.a = rdxVarB.d(wggVarA.a());
        this.b = executorServiceAF;
    }

    public final RadioProgramSelector a() {
        return new RadioProgramSelector((RadioProgramSelector.RadioProgramIdentifier) this.b, ((yfl) this.a).g());
    }

    public final String b(String str) {
        return ((String) this.b).concat(str);
    }

    public final void c(String str, Throwable th) {
        Log.e((String) this.a, b(str), th);
    }

    public final void d(String str) {
        Log.e((String) this.a, b(str));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, shk] */
    public final void e(yzz yzzVar) {
        qst qstVar = (qst) this.b;
        if (qstVar.d("frx_activation_logged", false)) {
            return;
        }
        this.a.a(yzzVar, yzy.bX);
        qstVar.c("frx_activation_logged", true);
    }

    public final Object f() {
        synchronized (this.a) {
        }
        return this.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ackk, java.lang.Object] */
    public final synchronized void g(aazo aazoVar) {
        ((erb) this.b.a()).S(pxf.a);
        ((vaa) this.a).c(aazoVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void h(ygu yguVar) {
        yno it = yguVar.b().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            psm psmVar = (psm) this.a.get(entry.getKey());
            if (psmVar != null) {
                ((psj) this.b).a(psmVar, (psk) entry.getValue());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public final synchronized void i(psm psmVar, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.a.put((Class) it.next(), psmVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, uko] */
    public final uko j() {
        ?? r0 = this.b;
        if (r0 != 0) {
            return r0;
        }
        Object obj = this.a;
        if (obj == null) {
            return null;
        }
        return (uko) ((SoftReference) obj).get();
    }

    public final kex k(trm trmVar, Ctry ctry) {
        urg urgVar = new urg(this, ctry);
        scz sczVar = new scz((ajdr) this.a);
        uxc uxcVarE = sczVar.e(trmVar);
        abnr abnrVar = (abnr) abcs.a.n();
        abnrVar.t();
        abcs abcsVar = (abcs) abnrVar.b;
        abcsVar.b |= 4096;
        abcsVar.l = uxcVarE.a;
        return new kex(abnrVar, sczVar, urgVar);
    }

    public rjg(Object obj) {
        this.a = new Object();
        this.b = obj;
    }

    public rjg(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public rjg(qmh qmhVar) {
        this.b = qmhVar;
        this.a = new qmz();
    }

    public rjg(rjb rjbVar, Looper looper) {
        this.a = rjbVar;
        this.b = looper;
    }

    public rjg(trd trdVar) {
        this.b = trdVar.a;
        this.a = trdVar.b;
    }

    public rjg(byte[] bArr) {
        this.b = "b";
        this.a = "c";
    }

    public rjg(byte[] bArr, byte[] bArr2) {
        this.b = "k";
        this.a = "l";
    }

    public rjg(ackk ackkVar) {
        this.a = new vaa(aazo.a);
        this.b = ackkVar;
    }

    public rjg(Activity activity) {
        this.a = activity;
        this.b = new qfe(activity, 3);
    }

    public rjg(Context context, shk shkVar) {
        this.b = qst.a(context);
        this.a = shkVar;
    }

    public rjg(RadioProgramSelector.RadioProgramIdentifier radioProgramIdentifier) {
        this.a = new yfl(4);
        this.b = radioProgramIdentifier;
    }

    public rjg(psj psjVar) {
        this.a = new HashMap();
        this.b = psjVar;
    }

    public rjg() {
        this.a = null;
        this.b = new ByteArrayOutputStream(32768);
    }

    public rjg(Context context, byte[] bArr) {
        spu.aw(context);
        Context applicationContext = context.getApplicationContext();
        spu.ax(applicationContext, "Application context can't be null");
        this.b = applicationContext;
        this.a = applicationContext;
    }

    public rjg(String str) {
        this.b = str;
        this.a = "Auth";
        for (int i = 2; i <= 7 && !Log.isLoggable((String) this.a, i); i++) {
        }
    }

    public rjg(int i) {
        this.a = ByteBuffer.allocate(i);
        this.b = null;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [aels, java.lang.Object] */
    public rjg(abfe abfeVar) {
        this.b = new aemi(null);
        this.a = yfq.o(abfeVar.c);
        for (abfd abfdVar : abfeVar.b) {
            this.b.a((abfdVar.b << 32) | abfdVar.c, abfdVar.d);
        }
    }

    public rjg(uky ukyVar, List list) {
        this.a = ukyVar;
        this.b = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            abls ablsVar = (abls) it.next();
            ((ArrayList) this.b).add(new ukp(ablsVar.c, ablsVar.d, ablsVar.e, null));
        }
    }

    public rjg(uko ukoVar) {
        yob yobVar = ukx.a;
        uko ukoVar2 = true != (ukoVar instanceof uit) ? null : ukoVar;
        this.b = ukoVar2;
        this.a = ukoVar2 == null ? new SoftReference(ukoVar) : null;
    }

    public rjg(rjs rjsVar) {
        this.a = new ArrayList();
        this.b = rjsVar;
    }
}
