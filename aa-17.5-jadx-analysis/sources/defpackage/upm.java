package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import j$.time.Duration;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class upm implements upr {
    public final ackk c;
    public final tmb d;
    public final ackk e;
    public final aezk f;
    public final Executor g;
    public final xyc h;
    public final xyc i;
    public final ackk j;
    public final ackk k;
    public final ackk l;
    public volatile uoj m;
    private final pws q;
    private final aezk r;
    private final Executor s;
    private final upo t;
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/internal/store/resource/ResourceManagerImpl");
    private static final Duration o = Duration.ofDays(1);
    static final Duration b = Duration.ofSeconds(10);
    private final AtomicBoolean p = new AtomicBoolean();
    public final plg n = new uph(this);

    public upm(pws pwsVar, pwr pwrVar, tmb tmbVar, ackk ackkVar, aezk aezkVar, aezk aezkVar2, Executor executor, Executor executor2, ackk ackkVar2, ackk ackkVar3, ackk ackkVar4, ackk ackkVar5) {
        this.q = pwsVar;
        this.t = new upe(pwrVar);
        this.d = tmbVar;
        this.e = ackkVar;
        this.r = aezkVar;
        this.s = executor;
        this.g = executor2;
        this.h = wub.L(new plm(aezkVar, ackkVar, 9, null));
        this.i = wub.L(new uai(ackkVar, 18));
        this.f = aezkVar2;
        this.l = ackkVar2;
        this.c = ackkVar3;
        this.j = ackkVar5;
        this.k = ackkVar4;
    }

    private final upy f(String str, boolean z) {
        if (z) {
            xyc xycVar = this.i;
            synchronized (xycVar) {
                SoftReference softReference = (SoftReference) ((plb) xycVar.gu()).h(str);
                upyVar = softReference != null ? (upy) softReference.get() : null;
                ackk ackkVar = this.c;
                if (upyVar == null) {
                    upyVar = new upy(str);
                    upyVar.b = false;
                    ((plb) xycVar.gu()).n(str, new SoftReference(upyVar));
                }
            }
            return upyVar;
        }
        xyc xycVar2 = this.h;
        synchronized (xycVar2) {
            upy upyVar = (upy) ((plb) xycVar2.gu()).h(str);
            if (upyVar == null && this.m != null) {
                uoj uojVar = this.m;
                abnp abnpVarN = pjw.a.n();
                abnpVarN.t();
                pjw pjwVar = (pjw) abnpVarN.b;
                pjwVar.c = 1;
                pjwVar.b |= 1;
                abnpVarN.t();
                pjw pjwVar2 = (pjw) abnpVarN.b;
                str.getClass();
                pjwVar2.b |= 2;
                pjwVar2.d = str;
                pjw pjwVar3 = (pjw) abnpVarN.q();
                try {
                    pjv pjvVarB = ((upb) uojVar).c.b(pjwVar3);
                    if (pjvVarB != null) {
                        try {
                            abnv abnvVarY = abnv.y(achw.a, pjvVarB.c, abnj.a);
                            abnv.U(abnvVarY);
                            achw achwVar = (achw) abnvVarY;
                            upyVar = new upy(str);
                            upyVar.b = true;
                            upyVar.n(achwVar);
                        } catch (abon e) {
                            ((ynz) ((ynz) ((ynz) upb.a.g()).p(e)).ai((char) 9534)).y("Failed to parse resource data from database of resource id= %s :", str);
                            try {
                                ((upb) uojVar).c.e(pjwVar3);
                            } catch (IOException e2) {
                                ((ynz) ((ynz) ((ynz) upb.a.g()).p(e2)).ai((char) 9535)).y("Failed to delete corrupt resources id= %s :", str);
                            }
                        }
                    }
                } catch (IOException e3) {
                    ((ynz) ((ynz) ((ynz) upb.a.g()).p(e3)).ai((char) 9536)).y("Failed to get resource %s", str);
                }
            }
            upyVar = upyVar;
            ackk ackkVar2 = this.c;
            if (upyVar == null) {
                upyVar = new upy(str);
                upyVar.b = true;
            }
            ((plb) xycVar2.gu()).n(str, upyVar);
        }
        return upyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final upy g(yfq yfqVar, int i, String str, float f, int i2, int i3, String str2, upw upwVar, int i4, int i5) {
        upy upyVarC;
        StringBuilder sb = new StringBuilder();
        int size = yfqVar.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            uiy uiyVar = (uiy) yfqVar.get(i7);
            sb.append("&name=");
            String str3 = uiyVar.b;
            sb.append(str3);
            sb.append("&highlight=");
            sb.append(uiyVar.e);
            sb.append("&filter=");
            sb.append(uiyVar.g);
            if (!woy.am(str3)) {
                i6++;
            }
        }
        sb.append("&scale=");
        sb.append(i);
        sb.append("&text=");
        sb.append(str);
        sb.append("&size=");
        sb.append(f);
        sb.append("&color=");
        sb.append(i2);
        sb.append("&textAttributes=");
        sb.append(i3);
        sb.append("&contentWidth=");
        sb.append(i4);
        sb.append("&contentHeight=");
        sb.append(i5);
        upy upyVarF = f(sb.toString(), false);
        if (!upyVarF.l() && !upyVarF.m()) {
            upyVarF.g(true);
            upj upjVar = new upj(upyVarF, i6, yfqVar.size(), this.d, i4 > 0 && i5 > 0, new upg(this, yfqVar, str, f, i2, i3, i4, i5));
            for (int i8 = 0; i8 < yfqVar.size(); i8++) {
                String str4 = ((uiy) yfqVar.get(i8)).b;
                if (!str4.isEmpty()) {
                    synchronized (upjVar) {
                        upyVarC = c(str4, str2, upjVar);
                        upjVar.a[i8] = upyVarC;
                    }
                    if (upyVarC.l()) {
                        upjVar.a(upyVarC);
                    }
                }
            }
            if (upyVarF.m()) {
                upyVarF.e(upwVar);
                return upyVarF;
            }
        } else if (upyVarF.m()) {
            upyVarF.e(upwVar);
        }
        return upyVarF;
    }

    @Override // defpackage.upr
    public final upy a(yfq yfqVar, int i, String str, upw upwVar, int i2, int i3) {
        return g(yfqVar, i, "", BitmapDescriptorFactory.HUE_RED, 0, 0, str, upwVar, i2, i3);
    }

    @Override // defpackage.upr
    public final upy b(yfq yfqVar, int i, String str, float f, int i2, int i3, String str2, upw upwVar) {
        return g(yfqVar, i, str, f, i2, i3, str2, upwVar, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x022e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0224  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.upr
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.upy c(java.lang.String r20, java.lang.String r21, defpackage.upw r22) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upm.c(java.lang.String, java.lang.String, upw):upy");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014e A[Catch: all -> 0x01a9, TryCatch #1 {, blocks: (B:10:0x002f, B:12:0x0035, B:14:0x004c, B:19:0x0056, B:21:0x0064, B:25:0x006e, B:27:0x007a, B:29:0x0096, B:32:0x00a6, B:34:0x00ca, B:36:0x00d4, B:38:0x00e6, B:39:0x013e, B:40:0x014d, B:41:0x014e, B:43:0x017a, B:44:0x018a, B:46:0x019e, B:48:0x01a4, B:49:0x01a7), top: B:54:0x002f }] */
    @Override // defpackage.upr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.upy d(java.lang.String r9, java.lang.String r10, defpackage.upw r11, boolean r12, defpackage.upz r13) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upm.d(java.lang.String, java.lang.String, upw, boolean, upz):upy");
    }

    @Override // defpackage.upr
    public final void e() {
        if (this.p.compareAndSet(false, true)) {
            this.g.execute(new upk(this, 1));
        }
    }
}
