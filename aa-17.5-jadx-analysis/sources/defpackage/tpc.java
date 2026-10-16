package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.xf.Flagging;
import com.google.android.libraries.geo.mapcore.geoxp.jni.fetcher.NativeOfflineDiskCache;
import com.google.android.libraries.geo.mapcore.geoxp.jni.fetcher.NativeUrlLoader;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class tpc implements ackr {
    private final acku a;
    private final acku b;
    private final /* synthetic */ int c;

    public tpc(acku ackuVar, acku ackuVar2, int i) {
        this.c = i;
        this.a = ackuVar;
        this.b = ackuVar2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tmb] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, tmb] */
    /* JADX WARN: Type inference failed for: r5v33, types: [java.lang.Object, tva] */
    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        Object obj;
        Object obj2;
        final int i = 0;
        switch (this.c) {
            case 0:
                return new tpb(this.a, (tsn) this.b.a());
            case 1:
                ((ackv) this.b).a();
                ((ackv) this.a).a();
                return new Flagging();
            case 2:
                return new NativeOfflineDiskCache(((uxv) this.a).b());
            case 3:
                ((uqy) this.b).a();
                return new NativeUrlLoader(((uxv) this.a).b());
            case 4:
                return new gjv((plq) this.b.a(), ((uxv) this.a).b());
            case 5:
                return new gjv((kex) this.b.a(), ((uxv) this.a).b());
            case 6:
                return new tsn(this.b, ackq.b(this.a));
            case 7:
                qaz qazVar = (qaz) this.a.a();
                xxh xxhVarB = ((uyq) this.b).b();
                qax qaxVar = qax.a;
                int iOrdinal = qaxVar.ordinal();
                if (iOrdinal == 0) {
                    qazVar.a = new qay(qaxVar, qazVar.c, (erb) qazVar.d);
                    obj = qazVar.a;
                } else {
                    if (iOrdinal != 1) {
                        throw new RuntimeException(null, null);
                    }
                    qazVar.b = new qay(qaxVar, qazVar.c, (erb) qazVar.d);
                    obj = qazVar.b;
                }
                ((qay) obj).a(new uab((erb) ((xxm) xxhVarB).a));
                obj.getClass();
                return obj;
            case 8:
                xxh xxhVar = (xxh) ((acks) this.a).b;
                Object pipVar = new pip((qrx) this.b.a());
                if (xxhVar.f()) {
                    pipVar = ((ajmd) xxhVar.b()).a.a();
                }
                pipVar.getClass();
                return pipVar;
            case 9:
                return new rhj((tmb) this.a.a(), (psj) this.b.a());
            case 10:
                xyc xycVar = ((uaj) this.a.a()).c;
                xxh xxhVar2 = (xxh) ((acks) this.b).b;
                return (((Boolean) xycVar.gu()).booleanValue() && xxhVar2.f()) ? (qrx) xxhVar2.b() : new qrx();
            case 11:
                return xvy.a;
            case 12:
                return new gjv(((pym) this.b).a(), this.a);
            case 13:
                xxh xxhVar3 = (xxh) ((acks) this.b).b;
                uaj uajVar = (uaj) this.a.a();
                zwf zwfVar = new zwf(null);
                zwfVar.b(true);
                byte b = zwfVar.b;
                zwfVar.c = xvy.a;
                zwfVar.b = (byte) (b | 30);
                int i2 = yfq.d;
                zwfVar.d = yfq.o(yls.a);
                zwfVar.b(uajVar.e());
                if (zwfVar.b != 31 || (obj2 = zwfVar.d) == null) {
                    throw new IllegalStateException();
                }
                return (tnw) xxhVar3.d(new tnw(zwfVar.a, (xxh) zwfVar.c, (yfq) obj2));
            case 14:
                return new urg(this.b, this.a, (byte[]) null);
            case 15:
                return new rjg((rjr) this.a.a(), (ajdr) this.b.a());
            case 16:
                return (std) ((xxh) ((acks) this.b).b).d((std) this.a.a());
            case 17:
                acku ackuVar = this.b;
                vqk vqkVarA = ((tmf) this.a).a();
                ((uya) ackuVar.a()).a();
                zhe zheVar = new zhe();
                zheVar.c();
                zheVar.d("Background-%d");
                final ThreadFactory threadFactoryB = zhe.b(zheVar);
                int[] iArr = tmi.a;
                final int i3 = 10;
                zgt zgtVarC = vqkVarA.c(yrm.aJ(Executors.newScheduledThreadPool(4, new ThreadFactory() { // from class: tmh
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        int i4;
                        int i5;
                        int[] iArr2 = tmi.a;
                        int i6 = 0;
                        while (true) {
                            i4 = i3;
                            i5 = 10;
                            if (i6 >= 10) {
                                break;
                            }
                            i5 = i6 + 1;
                            if (i4 >= tmi.a[i6]) {
                                break;
                            }
                            i6 = i5;
                        }
                        Thread threadNewThread = threadFactoryB.newThread(new sgu(i5, i4, runnable, 2));
                        threadNewThread.setPriority(i5);
                        return threadNewThread;
                    }
                })));
                zgtVarC.getClass();
                return zgtVarC;
            case 18:
                acku ackuVar2 = this.b;
                vqk vqkVarA2 = ((tmf) this.a).a();
                ((uya) ackuVar2.a()).a();
                zhe zheVar2 = new zhe();
                zheVar2.c();
                zheVar2.d("Blocking-%d");
                final ThreadFactory threadFactoryB2 = zhe.b(zheVar2);
                int[] iArr2 = tmi.a;
                final int i4 = 11;
                zgt zgtVarC2 = vqkVarA2.c(yrm.aJ(new ScheduledThreadPoolExecutor(0, new ThreadFactory() { // from class: tmh
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        int i42;
                        int i5;
                        int[] iArr22 = tmi.a;
                        int i6 = 0;
                        while (true) {
                            i42 = i4;
                            i5 = 10;
                            if (i6 >= 10) {
                                break;
                            }
                            i5 = i6 + 1;
                            if (i42 >= tmi.a[i6]) {
                                break;
                            }
                            i6 = i5;
                        }
                        Thread threadNewThread = threadFactoryB2.newThread(new sgu(i5, i42, runnable, 2));
                        threadNewThread.setPriority(i5);
                        return threadNewThread;
                    }
                })));
                zgtVarC2.getClass();
                return zgtVarC2;
            case 19:
                acku ackuVar3 = this.b;
                vqk vqkVarA3 = ((tmf) this.a).a();
                ((uya) ackuVar3.a()).a();
                int iMax = Math.max(2, Runtime.getRuntime().availableProcessors() - 2);
                zhe zheVar3 = new zhe();
                zheVar3.c();
                zheVar3.d("Lite-%d");
                final ThreadFactory threadFactoryB3 = zhe.b(zheVar3);
                int[] iArr3 = tmi.a;
                zgt zgtVarC3 = vqkVarA3.c(yrm.aJ(Executors.newScheduledThreadPool(iMax, new ThreadFactory() { // from class: tmh
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        int i42;
                        int i5;
                        int[] iArr22 = tmi.a;
                        int i6 = 0;
                        while (true) {
                            i42 = i;
                            i5 = 10;
                            if (i6 >= 10) {
                                break;
                            }
                            i5 = i6 + 1;
                            if (i42 >= tmi.a[i6]) {
                                break;
                            }
                            i6 = i5;
                        }
                        Thread threadNewThread = threadFactoryB3.newThread(new sgu(i5, i42, runnable, 2));
                        threadNewThread.setPriority(i5);
                        return threadNewThread;
                    }
                })));
                zgtVarC3.getClass();
                return zgtVarC3;
            default:
                return new uyp((Context) this.b.a(), ((uxv) this.a).b());
        }
    }

    public tpc(acku ackuVar, acku ackuVar2, int i, byte[] bArr) {
        this.c = i;
        this.b = ackuVar;
        this.a = ackuVar2;
    }
}
