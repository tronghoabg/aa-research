package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.google.android.libraries.geo.mapcore.renderer.LabelRenderer;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class uvg implements uyl {
    private static final yob J = yob.c("com/google/android/libraries/geo/mapcore/renderer/LegacyEntityRenderer");
    public static final Comparator a = new civ(12);
    public static final Comparator b = new civ(13);
    public static final Comparator c = new civ(14);
    public static final Comparator d = new civ(15);
    public final boolean A;
    public List B;
    public List C;
    public uue D;
    public final utl E;
    public String F;
    AccessibilityManager G;
    public volatile udd H;
    public final utk I;
    private final Set K = new HashSet();
    private Set L = new LinkedHashSet();
    private Set M = new HashSet();
    private final List N = new ArrayList();
    private final CopyOnWriteArraySet O;
    private final CopyOnWriteArraySet P;
    private final uvz Q;
    private final uvz R;
    private final uve S;
    private final uve T;
    private final uvz U;
    private final uve V;
    private final uvz W;
    private final uvz X;
    private final uvz Y;
    private final uvz Z;
    private final uvz aa;
    private final uve ab;
    private final uve ac;
    private final uvz ad;
    private final vaa ae;
    private int af;
    private yfq ag;
    private yfq ah;
    private final AtomicBoolean ai;
    public yfq e;
    public final CopyOnWriteArraySet f;
    public final uvz g;
    public final uvz h;
    public final uve i;
    public final yfq j;
    public uvs k;
    public usy l;
    public final uwg m;
    public final uwg n;
    public final uwg o;
    public boolean p;
    public uvl q;
    public final uud r;
    public Runnable s;
    public Runnable t;
    public final AtomicBoolean u;
    public LabelRenderer v;
    public uvh w;
    public ust x;
    public uwb y;
    public final usv z;

    /* JADX WARN: Removed duplicated region for block: B:39:0x0233 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public uvg(android.content.Context r29, defpackage.erb r30, defpackage.uud r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvg.<init>(android.content.Context, erb, uud):void");
    }

    private final void r(boolean z) {
        Runnable runnable;
        Runnable runnable2 = this.s;
        if (runnable2 != null) {
            runnable2.run();
        }
        if (!z || (runnable = this.t) == null) {
            return;
        }
        runnable.run();
    }

    public final uud a() {
        return this.r;
    }

    public final synchronized yfq c() {
        return this.e;
    }

    public final void d(uth uthVar, tqs tqsVar) {
        utk utkVar = this.I;
        boolean zD = utkVar.d();
        utkVar.a.add(new uvi(uthVar, tqsVar));
        utkVar.b.incrementAndGet();
        utkVar.c();
        r(zD);
    }

    public final void e(Runnable runnable) {
        this.O.add(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1043:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1045:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e A[Catch: all -> 0x0a3c, TRY_ENTER, TryCatch #16 {all -> 0x0a3c, blocks: (B:17:0x0037, B:25:0x0071, B:28:0x0085, B:30:0x009e, B:33:0x00a6, B:55:0x010b, B:58:0x0116, B:24:0x006e), top: B:782:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0620 A[Catch: all -> 0x062c, Merged into TryCatch #10 {all -> 0x0632, blocks: (B:295:0x0586, B:297:0x058d, B:298:0x0599, B:300:0x05d6, B:301:0x05dc, B:304:0x05ea, B:313:0x0614, B:322:0x062d, B:324:0x062f, B:326:0x0631, B:314:0x0617, B:316:0x0620, B:305:0x05ed, B:307:0x05f8, B:311:0x0601, B:312:0x060c, B:303:0x05e1), top: B:772:0x0586, outer: #18 }, TRY_LEAVE] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0628 A[Catch: all -> 0x063f, TRY_ENTER, TRY_LEAVE, TryCatch #18 {, blocks: (B:294:0x0580, B:319:0x0628, B:334:0x063e, B:333:0x063b, B:295:0x0586, B:297:0x058d, B:298:0x0599, B:300:0x05d6, B:301:0x05dc, B:304:0x05ea, B:313:0x0614, B:322:0x062d, B:324:0x062f, B:326:0x0631, B:314:0x0617, B:316:0x0620, B:305:0x05ed, B:307:0x05f8, B:311:0x0601, B:312:0x060c, B:303:0x05e1, B:330:0x0636), top: B:786:0x0580, outer: #84, inners: #10, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x075f A[Catch: all -> 0x07ce, TRY_LEAVE, TryCatch #75 {all -> 0x07ce, blocks: (B:366:0x06b7, B:368:0x06c3, B:371:0x06ce, B:373:0x0717, B:379:0x075a, B:380:0x075b, B:382:0x075f, B:388:0x07c6, B:374:0x071a, B:376:0x074d, B:383:0x0762, B:385:0x0789), top: B:883:0x06b7, outer: #82 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x08e4 A[Catch: all -> 0x0982, TRY_ENTER, TRY_LEAVE, TryCatch #40 {all -> 0x0982, blocks: (B:573:0x08e4, B:619:0x0981, B:618:0x097e, B:615:0x0979), top: B:825:0x03eb, inners: #39 }] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f A[Catch: all -> 0x0068, TRY_ENTER, TRY_LEAVE, TryCatch #32 {all -> 0x0068, blocks: (B:19:0x0063, B:27:0x0078, B:35:0x00b0, B:38:0x00b7, B:40:0x00bb, B:42:0x00c4, B:44:0x00ca, B:46:0x00d9, B:48:0x00e6, B:50:0x00fa, B:57:0x010f), top: B:810:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:582:0x091f A[LOOP:11: B:581:0x091d->B:582:0x091f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0931  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0949 A[Catch: all -> 0x0959, LOOP:12: B:588:0x0943->B:590:0x0949, LOOP_END, TRY_LEAVE, TryCatch #26 {all -> 0x0959, blocks: (B:587:0x093d, B:588:0x0943, B:590:0x0949), top: B:799:0x093d }] */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0190 A[Catch: all -> 0x0a3a, TryCatch #15 {all -> 0x0a3a, blocks: (B:60:0x0130, B:63:0x015a, B:65:0x015e, B:70:0x0169, B:73:0x01a6, B:75:0x01c5, B:77:0x01c9, B:78:0x01cc, B:71:0x0190, B:72:0x0198), top: B:780:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:788:0x0a42 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvg.f():void");
    }

    public final void g(uth uthVar) {
        ((uvo) this.j.get(uthVar.F().ordinal())).e(uthVar);
        uvl uvlVar = this.q;
        if (uvlVar != null) {
            uvlVar.c();
        }
    }

    @Override // defpackage.uyl
    public final void gt(String str, PrintWriter printWriter) {
        throw null;
    }

    public final synchronized void h(Runnable runnable) {
        this.K.add(runnable);
    }

    public final void i(uth uthVar) {
        utk utkVar = this.I;
        boolean zD = utkVar.d();
        utkVar.a.add(new uvk(uthVar));
        utkVar.c.incrementAndGet();
        utkVar.c();
        r(zD);
    }

    public final void j(Runnable runnable) {
        this.O.remove(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k() {
        if (this.ai.get()) {
            return;
        }
        this.ae.c(true);
        this.u.set(true);
        Runnable runnable = this.s;
        if (runnable != null) {
            runnable.run();
        }
        yfq yfqVarC = c();
        int i = ((yls) yfqVarC).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((zwk) ((ul) yfqVarC.get(i2)).b).b(false);
        }
    }

    public final synchronized void l(Runnable runnable) {
        this.L.add(runnable);
    }

    public final synchronized void m(Runnable runnable) {
        this.N.add(runnable);
    }

    public final synchronized void n(Runnable runnable) {
        if (this.K.contains(runnable)) {
            this.L.add(runnable);
        }
    }

    public final synchronized void o() {
        this.K.clear();
        this.L.clear();
    }

    public final synchronized void p(Runnable runnable) {
        this.K.remove(runnable);
        this.L.remove(runnable);
    }

    public final synchronized void q(ul ulVar) {
        if (this.e.contains(ulVar)) {
            return;
        }
        yfl yflVar = new yfl(4);
        yflVar.k(this.e);
        yflVar.i(ulVar);
        this.e = yflVar.g();
    }
}
