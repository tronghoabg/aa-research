package defpackage;

import com.google.android.libraries.geo.mapcore.internal.legacy.internal.vector.gl.ClientLineStampShaderState;
import com.google.android.libraries.geo.mapcore.internal.legacy.internal.vector.gl.RoadStrokePointSpriteShaderState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class ufp extends ufo {
    private static long z;
    private final ush B;
    private urw C;
    private final float D;
    private int E;
    private float F;
    private float G;
    private uvx H;
    public final tqs g;
    public ulw h;
    public umb i;
    public final Object j;
    public boolean k;
    public final long l;
    public final List m;
    public boolean n;
    public int o;
    public int p;
    public final float q;
    public long r;
    public long s;
    public long t;
    public final Object u;
    public boolean v;
    public umi w;
    public final qrx x;
    private static final yob y = yob.c("com/google/android/libraries/geo/mapcore/internal/legacy/internal/overlay/RoadShaderPolylineProcessor");
    private static int A = 0;

    public ufp(ush ushVar, uvg uvgVar, tqs tqsVar, float f, qrx qrxVar, uaj uajVar) {
        super(uvgVar);
        this.j = new Object();
        this.w = umi.a;
        this.k = false;
        this.n = false;
        this.o = 1;
        this.p = 1;
        this.E = -2;
        this.F = 1.0f;
        this.u = new Object();
        this.v = false;
        this.B = ushVar;
        this.g = tqsVar;
        this.x = qrxVar;
        this.D = f;
        if (uajVar == null || !((Boolean) uajVar.m.gu()).booleanValue()) {
            this.q = f * 4.5f;
        } else {
            this.q = 4.5f;
        }
        this.m = new ArrayList();
        long j = z;
        z = 1 + j;
        this.l = j;
    }

    private final boolean n() {
        return uqw.x(((ujl) this.b.keySet().iterator().next()).g.d().H, 1);
    }

    @Override // defpackage.ufo
    public final synchronized void c() {
        super.c();
        usm usmVar = this.e;
        if (usmVar != null) {
            usmVar.k();
            this.e = null;
        }
    }

    @Override // defpackage.ufo
    protected final void d(utf utfVar) {
        ute uteVar;
        vaq.d();
        synchronized (this.u) {
            long j = this.r;
            long j2 = this.s;
            long j3 = this.t;
            int i = A;
            A = i + 1;
            uteVar = new ute(j, j2, j3, i);
        }
        ulw ulwVar = new ulw(utfVar, uteVar);
        this.h = ulwVar;
        ulwVar.a = this.B;
        ulwVar.s = 519;
        ulwVar.t(1, 771);
        umb umbVar = new umb(utfVar, uteVar);
        this.i = umbVar;
        umbVar.x = umi.a;
        this.C = new urw();
    }

    @Override // defpackage.ufo
    public final void g() {
        ulw ulwVar = this.h;
        if (ulwVar == null || this.i == null) {
            return;
        }
        if (this.v) {
            uvg uvgVar = this.f;
            uvgVar.i(ulwVar);
            uvgVar.i(this.i);
        }
        this.v = false;
    }

    @Override // defpackage.ufo
    protected final void h(usy usyVar) {
        float f = usyVar.o().l;
        if (Math.abs(f - this.G) < 0.001d) {
            return;
        }
        this.G = f;
        uvx uvxVar = this.H;
        if (uvxVar instanceof uge) {
            ((uge) uvxVar).b(f, this.E, false);
        }
    }

    @Override // defpackage.ufo
    @ResultIgnorabilityUnspecified
    protected final boolean j(usy usyVar, tot totVar) throws IOException {
        uvx uvxVar;
        if (this.h != null && this.i != null) {
            float f = usyVar.o().l;
            synchronized (this.u) {
            }
            int size = this.b.size();
            vaq.d();
            synchronized (this.u) {
                List list = this.m;
                if (!list.isEmpty()) {
                    int iAbs = Math.abs(size - list.size());
                    if (iAbs != 0) {
                        if (size < list.size()) {
                            int size2 = list.size() - 1;
                            for (int i = 0; i < iAbs; i++) {
                                list.remove(size2 - i);
                            }
                        } else {
                            list.addAll(Collections.nCopies(iAbs, (ukf) yrm.an(list)));
                        }
                    }
                }
            }
            this.E = (int) f;
            this.F = tsw.e(usyVar.o().l, usyVar.j(), usyVar.c(), usyVar.b());
            this.G = f;
            ugc ugcVar = new ugc(this.D, this.E, false);
            uws uwsVarL = l(ugcVar, totVar.c(), totVar.a);
            boolean zN = n();
            ulw ulwVar = this.h;
            if (zN) {
                ulwVar.getClass();
                uvx roadStrokePointSpriteShaderState = new RoadStrokePointSpriteShaderState();
                ujf ujfVarF = ((ujl) this.b.keySet().iterator().next()).g.f(this.G);
                if (ugcVar.d(ujfVarF) > 0) {
                    uwc uwcVarM = this.B.m(ugcVar.f(ujfVarF, 0).i);
                    if (uwcVarM != null) {
                        this.h.z(3, uwcVarM);
                    }
                }
                synchronized (this.u) {
                    this.h.g(ugcVar.c, false);
                    this.h.f(this.G);
                }
                uvxVar = roadStrokePointSpriteShaderState;
            } else {
                ulwVar.getClass();
                uwm uwmVar = new uwm("stroke_dash", null, 2, 3);
                uwmVar.d(new uuz(ugcVar.a((int) this.G), 1, 64, 32, true));
                this.h.z(5, uwmVar);
                uwm uwmVar2 = new uwm("stroke_color", null, 2, 1);
                uwmVar2.d(new uuz(ugcVar.b(), 4, ugc.a, 96, false));
                this.h.z(4, uwmVar2);
                vaq.d();
                synchronized (this.u) {
                    this.h.g(ugcVar.c, false);
                    this.h.f(this.G);
                }
                ClientLineStampShaderState clientLineStampShaderState = new ClientLineStampShaderState(this.E, this.h);
                clientLineStampShaderState.b(this.G, this.E, false);
                uvxVar = clientLineStampShaderState;
            }
            this.H = uvxVar;
            this.h.w(uwsVarL);
            if (uwsVarL != null) {
                this.h.v(this.H);
                this.h.l(totVar.a);
                this.h.m(1.0f);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ufo
    public final boolean k(usy usyVar) {
        if (this.b.isEmpty()) {
            return false;
        }
        synchronized (this) {
            if (this.d) {
                this.d = false;
                return true;
            }
            float f = usyVar.o().l - this.E;
            return f > (true != n() ? 1.0f : 0.25f) || f < BitmapDescriptorFactory.HUE_RED;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0359 A[Catch: all -> 0x072c, LOOP:9: B:111:0x0352->B:113:0x0359, LOOP_END, TryCatch #2 {, blocks: (B:4:0x0005, B:9:0x001a, B:10:0x0024, B:11:0x003e, B:13:0x0044, B:15:0x004c, B:16:0x006f, B:18:0x0075, B:19:0x0081, B:20:0x0089, B:21:0x009b, B:23:0x00a1, B:24:0x00b1, B:29:0x00c3, B:186:0x06da, B:188:0x06e2, B:190:0x06e7, B:193:0x06f9, B:196:0x070a, B:197:0x0718, B:32:0x00cc, B:34:0x00d9, B:178:0x06c5, B:184:0x06cf, B:37:0x00eb, B:39:0x0110, B:40:0x0118, B:42:0x011e, B:44:0x013e, B:46:0x015a, B:48:0x015e, B:49:0x0160, B:51:0x0166, B:53:0x016d, B:59:0x0197, B:56:0x017f, B:58:0x0185, B:61:0x01ae, B:63:0x01c1, B:64:0x01d7, B:66:0x01dd, B:68:0x0221, B:70:0x022c, B:72:0x023a, B:74:0x0245, B:76:0x024c, B:77:0x0253, B:79:0x025c, B:80:0x0263, B:81:0x027c, B:82:0x028b, B:84:0x0291, B:86:0x029f, B:120:0x03a3, B:88:0x02a7, B:90:0x02ad, B:94:0x02c7, B:95:0x02cd, B:96:0x02ec, B:98:0x02f2, B:100:0x0308, B:102:0x030e, B:111:0x0352, B:113:0x0359, B:114:0x036c, B:107:0x0318, B:115:0x0374, B:117:0x037e, B:119:0x0396, B:121:0x03ad, B:123:0x03d9, B:124:0x0426, B:126:0x042c, B:128:0x045e, B:130:0x0465, B:131:0x0471, B:132:0x0475, B:136:0x0485, B:137:0x04a1, B:138:0x04de, B:139:0x04ef, B:141:0x04f5, B:144:0x05b1, B:146:0x05c4, B:147:0x05db, B:149:0x05e1, B:151:0x05ff, B:153:0x060f, B:155:0x0616, B:157:0x0625, B:159:0x062b, B:161:0x0633, B:162:0x0635, B:163:0x0638, B:164:0x063d, B:166:0x0643, B:168:0x0649, B:170:0x0658, B:172:0x066f, B:173:0x0672, B:175:0x0678, B:204:0x072b, B:25:0x00b9, B:26:0x00bb, B:202:0x0729, B:27:0x00bc, B:28:0x00c2), top: B:212:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.uws l(defpackage.ugc r47, float r48, defpackage.too r49) {
        /*
            Method dump skipped, instructions count: 1839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufp.l(ugc, float, too):uws");
    }

    public final void m() {
        synchronized (this.j) {
            if (this.k) {
                return;
            }
            this.k = true;
            umb umbVar = this.i;
            if (umbVar != null) {
                umbVar.x = this.w;
            }
        }
    }
}
