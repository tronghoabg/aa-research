package defpackage;

import android.os.Trace;
import android.util.Log;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class xsg extends cfx implements cwk {
    private static final String o = "xsg";
    private final afeg B;
    private final afdr C;
    private aivh D;
    private long E;
    private boolean F;
    private final long G;
    private float H;
    private float I;
    private final AtomicInteger J;
    private Integer K;
    private String L;
    public xqp a;
    public Map b;
    public xqq c;
    public final adu d = adv.a(BitmapDescriptorFactory.HUE_RED);
    public final adu e;
    public aivh f;
    public xsl g;
    public ckt h;
    public xqr i;
    public Map j;
    public xrg k;
    public List l;
    public int m;
    public Map n;
    private final xqq p;

    public xsg(xqq xqqVar, xqp xqpVar, Map map, afeg afegVar, afdr afdrVar, xqq xqqVar2) {
        this.p = xqqVar;
        this.a = xqpVar;
        this.b = map;
        this.B = afegVar;
        this.C = afdrVar;
        this.c = xqqVar2;
        afgr afgrVar = afgs.a;
        this.G = afgs.b.f();
        this.e = adv.a(BitmapDescriptorFactory.HUE_RED);
        new ParcelableSnapshotMutableState(xsf.a, bxp.c);
        xsl xslVar = new xsl(d());
        this.g = xslVar;
        this.h = new cjt(xslVar);
        int i = xqs.a;
        this.i = null;
        this.j = d().a();
        this.l = afbe.a;
        System.identityHashCode(this);
        this.J = new AtomicInteger(2000);
        this.n = afbf.a;
    }

    private final void h() {
        Integer num;
        if (!Trace.isEnabled() || this.L == null || (num = this.K) == null) {
            return;
        }
        num.intValue();
        this.L = null;
        this.K = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0807  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02a0  */
    /* JADX WARN: Type inference failed for: r11v9, types: [afck, afco] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // defpackage.cwk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.cxd r41) {
        /*
            Method dump skipped, instructions count: 2080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsg.b(cxd):void");
    }

    public final xqq d() {
        xqq xqqVar = this.c;
        return xqqVar == null ? this.p : xqqVar;
    }

    @Override // defpackage.cfx
    public final void er() {
        this.E = ((Number) this.C.invoke()).longValue();
        g(this.a);
    }

    public final void f() {
        if (!this.A) {
            this.k = null;
            return;
        }
        if (this.m >= this.l.size()) {
            xrd xrdVar = (xrd) this.b.get(this.a);
            if (xrdVar == null || !xrdVar.b || this.l.isEmpty()) {
                this.k = null;
                if (this.A) {
                    ahnc.d(N(), null, 0, new nba(this, (afck) null, 15, (byte[]) null), 3);
                    this.B.invoke(this.a, this.j);
                    cjn.w(this);
                    h();
                    return;
                }
                return;
            }
            this.m = 0;
        }
        this.D = ahnc.d(N(), null, 0, new giy(this, (afck) null, 4), 3);
    }

    public final void g(xqp xqpVar) {
        xrg xrgVar;
        xqpVar.getClass();
        if (this.a != xqpVar) {
            h();
        }
        int andIncrement = this.J.getAndIncrement();
        if (Trace.isEnabled()) {
            Objects.toString(xqpVar);
            String strConcat = "EnergyShaderNode#State:".concat(xqpVar.toString());
            this.K = Integer.valueOf(andIncrement);
            this.L = strConcat;
        }
        if (!this.F && xqpVar != xqp.b) {
            this.F = true;
        } else if (xqpVar == xqp.b) {
            this.F = false;
        }
        float fFloatValue = ((Number) this.d.d()).floatValue();
        aivh aivhVar = this.D;
        if (this.A && aivhVar != null && aivhVar.t() && (xrgVar = this.k) != null) {
            for (xrc xrcVar : xrgVar.d) {
                aes aesVar = xrcVar.c;
                if (aesVar == null) {
                    aesVar = xrgVar.c;
                }
                float fA = aesVar.a(fFloatValue);
                xsy xsyVar = xrcVar.a;
                Object obj = xrcVar.b;
                Object obj2 = this.j.get(xsyVar);
                if (obj2 != null) {
                    this.j.put(xsyVar, wpq.J(xsyVar, obj2, obj, fA));
                } else {
                    this.j.put(xsyVar, obj);
                }
            }
            Log.d(o, "Rebased currentBaseValues at progress " + fFloatValue + " for transition to " + xqpVar);
        }
        aivh aivhVar2 = this.D;
        if (aivhVar2 != null) {
            aivhVar2.s(null);
        }
        this.D = null;
        xrd xrdVar = (xrd) this.b.get(xqpVar);
        this.l = xrdVar != null ? xrdVar.a : afbe.a;
        this.m = 0;
        this.k = null;
        if (this.A) {
            f();
        }
    }

    @Override // defpackage.cfx
    public final void q() {
        aivh aivhVar = this.D;
        if (aivhVar != null) {
            aivhVar.s(null);
        }
        aivh aivhVar2 = this.f;
        if (aivhVar2 != null) {
            aivhVar2.s(null);
        }
        h();
    }

    @Override // defpackage.cwk
    public final /* synthetic */ void a() {
    }
}
