package defpackage;

import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.window.InputTransferToken;
import com.google.android.gms.car.display.CarRegionId;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ims extends rbj {
    public volatile boolean a;
    final /* synthetic */ ina b;
    private final Integer[] c;
    private final ConcurrentLinkedQueue d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ims(ina inaVar, Looper looper) {
        super(null, looper);
        this.b = inaVar;
        this.c = new Integer[]{0, 1, 2};
        this.a = false;
        this.d = new ConcurrentLinkedQueue();
    }

    private final void i(int i, jhf jhfVar) {
        this.d.add(new dzi(this.c[i], new imr(jhfVar)));
        sendMessageAtFrontOfQueue(obtainMessage(5));
    }

    public final synchronized void a() {
        if (this.a) {
            return;
        }
        sendMessage(obtainMessage(8));
    }

    public final synchronized void b(xop xopVar) {
        ((ype) ina.a.l().ai((char) 454)).u("onUpdateUiConfigRequest");
        boolean z = this.a;
        ina inaVar = this.b;
        if (z) {
            inaVar.ai.e(xopVar);
        } else {
            sendMessage(obtainMessage(6, new dzi(xopVar, inaVar.w)));
        }
    }

    public final synchronized void c(CarRegionId carRegionId, jiw jiwVar) {
        if (this.a) {
            return;
        }
        sendMessage(obtainMessage(4, new dzi(carRegionId, jiwVar)));
    }

    public final synchronized void d(int i, InputTransferToken inputTransferToken, int i2) {
        if (this.a) {
            return;
        }
        sendMessage(obtainMessage(9, new imx(i, inputTransferToken, i2)));
    }

    public final synchronized void e() {
        if (this.a) {
            return;
        }
        this.a = true;
        sendMessage(obtainMessage(3));
    }

    public final synchronized void f(jhf jhfVar) {
        if (this.a) {
            return;
        }
        i(1, jhfVar);
    }

    public final synchronized void g(jhf jhfVar) {
        if (!this.a) {
            i(0, jhfVar);
        } else if (acvt.a.gu().r()) {
            ((ype) ((ype) ina.a.h()).ai((char) 455)).y("requestWindowInit called when composition thread stopped for %s", jhfVar);
            jhfVar.V();
        }
    }

    public final synchronized void h(jhf jhfVar, int i) {
        if (this.a) {
            return;
        }
        imr imrVar = new imr(jhfVar);
        imrVar.a = i;
        this.d.add(new dzi(this.c[2], imrVar));
        sendMessageAtFrontOfQueue(obtainMessage(5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, jhf] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, jhf] */
    /* JADX WARN: Type inference failed for: r12v4, types: [ype] */
    /* JADX WARN: Type inference failed for: r14v11, types: [ype] */
    /* JADX WARN: Type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v12, types: [ina] */
    /* JADX WARN: Type inference failed for: r3v17, types: [ype] */
    /* JADX WARN: Type inference failed for: r3v18, types: [ina] */
    /* JADX WARN: Type inference failed for: r3v19, types: [ina] */
    /* JADX WARN: Type inference failed for: r4v16, types: [ype] */
    /* JADX WARN: Type inference failed for: r4v17, types: [jii] */
    /* JADX WARN: Type inference failed for: r4v24, types: [ype] */
    /* JADX WARN: Type inference failed for: r4v28, types: [ype] */
    /* JADX WARN: Type inference failed for: r4v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v30, types: [java.lang.Object, jhf] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.util.Queue] */
    /* JADX WARN: Type inference failed for: r9v17, types: [ype] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.lang.Object, jhf] */
    /* JADX WARN: Type inference failed for: r9v31, types: [ype] */
    /* JADX WARN: Type inference failed for: r9v6, types: [ype] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.Queue] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = 0;
        ?? r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        r2 = 0;
        switch (message.what) {
            case 3:
                ArrayList arrayList = new ArrayList();
                ConcurrentLinkedQueue concurrentLinkedQueue = this.d;
                for (dzi dziVar = (dzi) concurrentLinkedQueue.poll(); dziVar != null; dziVar = (dzi) concurrentLinkedQueue.poll()) {
                    if (((Integer) dziVar.a).intValue() == 0) {
                        arrayList.add(((imr) dziVar.b).b);
                    }
                }
                this.b.v(arrayList);
                break;
            case 4:
                if (!this.a) {
                    try {
                        dzi dziVar2 = (dzi) message.obj;
                        ina inaVar = this.b;
                        inaVar.aq.b((CarRegionId) dziVar2.a, (jiw) dziVar2.b, inaVar.u, inaVar.c(), inaVar.b(), inaVar.S, inaVar.w);
                        break;
                    } catch (jiy e) {
                        r2 = e;
                        break;
                    }
                }
                break;
            case 5:
                if (!this.a) {
                    dzi dziVar3 = (dzi) this.d.poll();
                    while (dziVar3 != null) {
                        int iIntValue = ((Integer) dziVar3.a).intValue();
                        if (iIntValue == 0) {
                            try {
                                ?? r3 = this.b;
                                ?? r0 = ((imr) dziVar3.b).b;
                                int iH = r0.h();
                                boolean z = r3.an;
                                if (z && r0.ax(2)) {
                                    ?? r9 = r3.T;
                                    if (r9.contains(r0)) {
                                        ((ype) ((ype) ina.a.f()).ai(506)).K("window init window already in system window list %s for layoutZ %d", r0, iH);
                                    } else {
                                        r9.add(r0);
                                        if (r0.equals(r9.peek())) {
                                            for (jhf jhfVar : r3.U) {
                                                if (jhfVar.x() != null) {
                                                    int iH2 = jhfVar.h() + iH;
                                                    ((ype) ((ype) ina.a.f()).ai(505)).M("Moving %s above %s", jhfVar, r0);
                                                    r3.ao(jhfVar, iH2, 1);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (z && r0.ax(1)) {
                                    r3.U.add(r0);
                                    jhf jhfVar2 = (jhf) r3.T.peek();
                                    if (jhfVar2 != null) {
                                        iH += jhfVar2.h();
                                        ((ype) ((ype) ina.a.f()).ai(504)).M("Moving %s above %s", r0, jhfVar2);
                                        r3.ao(r0, iH, 1);
                                    }
                                }
                                SparseArray sparseArray = r3.S;
                                List list = (List) sparseArray.get(iH);
                                ?? r7 = list;
                                if (list == null) {
                                    ArrayList arrayList2 = new ArrayList(2);
                                    sparseArray.put(iH, arrayList2);
                                    r7 = arrayList2;
                                }
                                if (r7.contains(r0)) {
                                    ((ype) ((ype) ina.a.f()).ai(503)).K("window init window already in list %s for layoutZ %d", r0, iH);
                                } else {
                                    r7.add(r0);
                                }
                                if (iH % 3 == 0) {
                                    r3.S(r0, iH - 1);
                                    r3.S(r0, iH + 1);
                                }
                                r0.aR(r3.ap);
                                ((ype) ina.a.l().ai(501)).R("doWindowInit active windows %d in layoutZ %d added %s", Integer.valueOf(r7.size()), Integer.valueOf(iH), r0);
                            } catch (jiy e2) {
                                r2 = e2;
                            }
                        } else if (iIntValue == 1) {
                            ?? r32 = this.b;
                            ?? r02 = ((imr) dziVar3.b).b;
                            if (r02 != 0) {
                                int iH3 = r02.h();
                                if (r02.h() % 3 != 0) {
                                    int i2 = r02.i();
                                    ?? r8 = (List) r32.S.get(i2);
                                    if (r8 != 0 && r8.remove(r02)) {
                                        ((ype) ((ype) ina.a.f()).ai(572)).R("Removed window from stable z: %d. Window removed: %s. Remaining windows: %d", Integer.valueOf(i2), r02, Integer.valueOf(r8.size()));
                                        r32.y();
                                    }
                                }
                                boolean z2 = r32.an;
                                if (z2 && r02.ax(2)) {
                                    ?? r82 = r32.T;
                                    ?? r92 = (jhf) r82.peek();
                                    if (r92 != 0 && r92.equals(r02)) {
                                        r82.remove(r02);
                                        jhf jhfVar3 = (jhf) r82.peek();
                                        if (jhfVar3 == null) {
                                            Iterator it = r32.U.iterator();
                                            while (it.hasNext()) {
                                                r32.ao((jhf) it.next(), 0, 2);
                                            }
                                        } else {
                                            for (jhf jhfVar4 : r32.U) {
                                                r32.ao(jhfVar4, jhfVar3.h() + jhfVar4.h(), 1);
                                            }
                                        }
                                    }
                                }
                                if (z2 && r02.ax(1)) {
                                    r32.ao(r02, 0, 2);
                                    r32.U.remove(r02);
                                }
                                r32.Y.e(r02);
                                r02.G();
                                r02.aV(0L);
                                SparseArray sparseArray2 = r32.S;
                                ?? r5 = (List) sparseArray2.get(iH3);
                                if (r5 == 0 || !r5.contains(r02)) {
                                    ((ype) ((ype) ina.a.f()).ai(498)).D("window cleanup window not in list for layoutZ %d win %s", iH3, r02);
                                    r32.y();
                                } else {
                                    r5.remove(r02);
                                    if (r5.isEmpty()) {
                                        sparseArray2.remove(iH3);
                                    }
                                    ((ype) ina.a.l().ai(499)).K("doWindowCleanup removed %s remaining wins in list %d", r02, r5.size());
                                    r32.y();
                                }
                            }
                        } else if (iIntValue == 2) {
                            ?? r33 = this.b;
                            imr imrVar = (imr) dziVar3.b;
                            r33.ao(imrVar.b, imrVar.a, 3);
                        }
                        dziVar3 = (dzi) this.d.poll();
                        r2 = r2;
                    }
                    break;
                }
                break;
            case 6:
                dzi dziVar4 = (dzi) message.obj;
                ina inaVar2 = this.b;
                xop xopVar = (xop) dziVar4.a;
                xopVar.getClass();
                jhc jhcVar = (jhc) dziVar4.b;
                jhcVar.getClass();
                ((ype) ina.a.l().ai((char) 496)).u("doUpdateUiConfigRequest");
                inaVar2.aq.e(jhcVar);
                inaVar2.ai.e(xopVar);
                break;
            case 7:
                ina inaVar3 = this.b;
                ((ype) ((ype) ina.a.f()).ai(495)).B("Updating background colors to %08X and %08X", message.arg1, message.arg2);
                new sss(Looper.getMainLooper()).post(new ne(inaVar3, 19, r2));
                break;
            case 8:
                if (!this.a) {
                    this.b.y();
                    break;
                }
                break;
            case 9:
                if (!this.a) {
                    imx imxVar = (imx) message.obj;
                    ina inaVar4 = this.b;
                    while (true) {
                        SparseArray sparseArray3 = inaVar4.S;
                        if (i >= sparseArray3.size()) {
                            ((ype) ((ype) ina.a.h()).ai(453)).w("Window %d not found in windowsByLayoutZ for host token delivery", imxVar.a);
                            break;
                        } else {
                            for (jhf jhfVar5 : (List) sparseArray3.valueAt(i)) {
                                int iL = jhfVar5.l();
                                int i3 = imxVar.a;
                                if (iL == i3) {
                                    ((ype) ((ype) ina.a.f()).ai((char) 491)).w("Found window %d for host token delivery", i3);
                                    ((jhk) jhfVar5).T(imxVar.b, imxVar.c);
                                    break;
                                }
                            }
                            i++;
                        }
                    }
                }
                break;
            default:
                throw new RuntimeException(a.cc(message, "unknown msg "));
        }
        if (r2 != 0) {
            ((ype) ((ype) ((ype) ina.a.h()).p(r2)).ai(452)).w("ProjectionCompositionException in CompositionThread command %s", message.what);
        }
    }

    @Override // android.os.Handler
    public final String toString() {
        ConcurrentLinkedQueue concurrentLinkedQueue = this.d;
        return "CompositionHandler{stopped=" + this.a + ", windowInitCleanupRequests=" + String.valueOf(concurrentLinkedQueue) + "}";
    }
}
