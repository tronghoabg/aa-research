package defpackage;

import com.google.android.libraries.geo.mapcore.geoxp.jni.observers.NativeMapFactoryObserversHandler;
import com.google.android.libraries.geo.mapcore.internal.label.jni.SharedLabelerJni;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class jor implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ jor(aaev aaevVar, long j, aadw aadwVar, int i) {
        this.d = i;
        this.c = aaevVar;
        this.a = j;
        this.b = aadwVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, jnh] */
    @Override // java.lang.Runnable
    public final void run() {
        aado aadoVar;
        switch (this.d) {
            case 0:
                ?? r0 = this.b;
                if (!((joi) r0).v) {
                    r0.a((xhv) this.c);
                    break;
                } else {
                    ((ype) ((ype) jou.a.f()).ai(2518)).x("Not sending ByeByeRequest because session %d has been torn down", this.a);
                    break;
                }
            case 1:
                long j = this.a;
                Object obj = this.c;
                hqt hqtVar = (hqt) this.b;
                hre hreVar = hqtVar.a;
                hreVar.a((String) obj, j);
                hreVar.b(hqtVar.toString());
                break;
            case 2:
                pto ptoVar = (pto) this.c;
                PriorityQueue priorityQueue = ptoVar.c;
                Object obj2 = this.b;
                priorityQueue.offer(obj2);
                ptoVar.d.a();
                if (priorityQueue.peek() == obj2) {
                    ptoVar.b(this.a);
                    break;
                }
                break;
            case 3:
                try {
                    ((NativeMapFactoryObserversHandler) this.b).b.j(this.a, (zqr) abnv.B(zqr.a, (byte[]) this.c, abnj.a()));
                    break;
                } catch (abon e) {
                    ((ynz) ((ynz) ((ynz) NativeMapFactoryObserversHandler.a.h()).p(e)).ai((char) 9121)).u("Failed to parse PrefetchTileMetadata");
                    return;
                }
            case 4:
                SharedLabelerJni sharedLabelerJni = ((uel) this.b).i;
                sharedLabelerJni.getClass();
                sharedLabelerJni.nativeReportStyleTable(sharedLabelerJni.b, this.a, (byte[]) this.c);
                break;
            case 5:
                new whs((wht) this.b, this.a, (abxk) this.c).start();
                break;
            case 6:
                aaev aaevVar = (aaev) this.c;
                aaevVar.g.a();
                if ((addm.l() || aaevVar.g(this.a)) && (aadoVar = aaevVar.j) != null) {
                    aadoVar.A(((aadw) this.b).g);
                    break;
                }
                break;
            default:
                long j2 = this.a;
                long jAbs = Math.abs(j2);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long j3 = jAbs / 1000000000;
                long jAbs2 = Math.abs(j2);
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                long j4 = jAbs2 % 1000000000;
                StringBuilder sb = new StringBuilder();
                if (j2 < 0) {
                    sb.append("ClientCall started after ");
                    sb.append((String) this.c);
                    sb.append(" deadline was exceeded. Deadline has been exceeded for ");
                } else {
                    sb.append("Deadline ");
                    sb.append((String) this.c);
                    sb.append(" was exceeded after ");
                }
                sb.append(j3);
                sb.append(String.format(Locale.US, ".%09d", Long.valueOf(j4)));
                sb.append("s waiting for ");
                adtc adtcVar = (adtc) this.b;
                sb.append(adtcVar.b);
                adtcVar.l(adnq.f.e(sb.toString()), true);
                break;
        }
    }

    public jor(adtc adtcVar, long j, String str, int i) {
        this.d = i;
        this.a = j;
        this.c = str;
        this.b = adtcVar;
    }

    public /* synthetic */ jor(NativeMapFactoryObserversHandler nativeMapFactoryObserversHandler, byte[] bArr, long j, int i) {
        this.d = i;
        this.b = nativeMapFactoryObserversHandler;
        this.c = bArr;
        this.a = j;
    }

    public jor(hqt hqtVar, String str, long j, int i) {
        this.d = i;
        this.c = str;
        this.a = j;
        this.b = hqtVar;
    }

    public /* synthetic */ jor(Object obj, long j, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.a = j;
        this.c = obj2;
    }

    public jor(jnh jnhVar, long j, xhv xhvVar, int i) {
        this.d = i;
        this.b = jnhVar;
        this.a = j;
        this.c = xhvVar;
    }

    public /* synthetic */ jor(pto ptoVar, ptn ptnVar, long j, int i) {
        this.d = i;
        this.c = ptoVar;
        this.b = ptnVar;
        this.a = j;
    }
}
