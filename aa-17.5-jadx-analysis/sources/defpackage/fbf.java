package defpackage;

import android.os.Bundle;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class fbf {
    public final Object a;
    public final Object b;

    public fbf(byte[] bArr) {
        bxp bxpVar = bxp.c;
        this.a = new ParcelableSnapshotMutableState(false, bxpVar);
        this.b = new ParcelableSnapshotMutableState(false, bxpVar);
    }

    public static yzy h(otx otxVar) {
        int iOrdinal = otxVar.ordinal();
        if (iOrdinal == 0) {
            return yzy.xz;
        }
        if (iOrdinal == 1) {
            return yzy.xA;
        }
        if (iOrdinal == 2) {
            return yzy.xB;
        }
        if (iOrdinal == 3) {
            return yzy.xC;
        }
        if (iOrdinal == 4) {
            return yzy.xD;
        }
        throw new RuntimeException(null, null);
    }

    public static yzy i(ouc oucVar) {
        switch (oucVar.ordinal()) {
            case 0:
                return yzy.xN;
            case 1:
                return yzy.xO;
            case 2:
                return yzy.xP;
            case 3:
                return yzy.xQ;
            case 4:
                return yzy.xR;
            case 5:
                return yzy.xS;
            case 6:
                return yzy.xT;
            case 7:
                return yzy.xU;
            case 8:
                return yzy.xV;
            case 9:
                return yzy.xW;
            case 10:
                return yzy.xX;
            case 11:
                return yzy.xY;
            case 12:
                return yzy.xZ;
            case 13:
                return yzy.ya;
            case 14:
                return yzy.yb;
            case 15:
                return yzy.yc;
            case 16:
                return yzy.yd;
            case 17:
                return yzy.ye;
            default:
                throw new RuntimeException(null, null);
        }
    }

    public final void a() {
        ((fbj) this.a).a();
    }

    public final void b(Bundle bundle) {
        fbj fbjVar = (fbj) this.a;
        if (!fbjVar.b) {
            fbjVar.a();
        }
        fbg fbgVar = fbjVar.a;
        if (fbgVar.getLifecycle().a().a(eps.d)) {
            eps epsVarA = fbgVar.getLifecycle().a();
            Objects.toString(epsVarA);
            throw new IllegalStateException("performRestore cannot be called when owner is ".concat(String.valueOf(epsVarA)));
        }
        if (fbjVar.d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleB = null;
        if (bundle != null && fbb.f(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleB = fbb.b(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        fbjVar.c = bundleB;
        fbjVar.d = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = 0
            aezu[] r1 = new defpackage.aezu[r0]
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            aezu[] r1 = (defpackage.aezu[]) r1
            android.os.Bundle r1 = defpackage.dsg.z(r1)
            r2 = r18
            java.lang.Object r2 = r2.a
            r3 = r2
            fbj r3 = (defpackage.fbj) r3
            android.os.Bundle r4 = r3.c
            if (r4 == 0) goto L1b
            r1.putAll(r4)
        L1b:
            ebi r3 = r3.g
            monitor-enter(r3)
            fbj r2 = (defpackage.fbj) r2     // Catch: java.lang.Throwable -> L7f
            aan r2 = r2.f     // Catch: java.lang.Throwable -> L7f
            java.lang.Object[] r4 = r2.b     // Catch: java.lang.Throwable -> L7f
            java.lang.Object[] r5 = r2.c     // Catch: java.lang.Throwable -> L7f
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L7f
            int r6 = r2.length     // Catch: java.lang.Throwable -> L7f
            int r6 = r6 + (-2)
            if (r6 < 0) goto L70
            r7 = r0
        L2e:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L7f
            long r10 = ~r8     // Catch: java.lang.Throwable -> L7f
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6b
            int r10 = r7 - r6
            r11 = r0
        L41:
            int r12 = ~r10     // Catch: java.lang.Throwable -> L7f
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L69
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L65
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r4[r12]     // Catch: java.lang.Throwable -> L7f
            r12 = r5[r12]     // Catch: java.lang.Throwable -> L7f
            fbd r12 = (defpackage.fbd) r12     // Catch: java.lang.Throwable -> L7f
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L7f
            android.os.Bundle r12 = r12.a()     // Catch: java.lang.Throwable -> L7f
            defpackage.fbh.a(r1, r14, r12)     // Catch: java.lang.Throwable -> L7f
        L65:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L41
        L69:
            if (r12 != r13) goto L70
        L6b:
            if (r7 == r6) goto L70
            int r7 = r7 + 1
            goto L2e
        L70:
            monitor-exit(r3)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L7e
            java.lang.String r0 = "androidx.lifecycle.BundlableSavedStateRegistry.key"
            r2 = r19
            defpackage.fbh.a(r2, r0, r1)
        L7e:
            return
        L7f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbf.c(android.os.Bundle):void");
    }

    public final boolean d() {
        return affa.f(((fbf) this.a).f(), this);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [djq, java.lang.Object] */
    public final void e(djv djvVar, djv djvVar2) {
        if (d()) {
            this.b.g(djvVar, djvVar2);
        }
    }

    public final fbf f() {
        return (fbf) ((AtomicReference) this.a).get();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bwq, java.lang.Object] */
    public final void g(boolean z) {
        this.b.b(Boolean.valueOf(z));
    }

    public final void j(yzy yzyVar, int i) {
        if (i == 0) {
            return;
        }
        ((kgx) this.b).c((rrc) rrc.h(yxy.CAR_SERVICE, yzz.MICROPHONE_DIAGNOSTICS, yzyVar).l(), i);
    }

    public final void k(yzy yzyVar) {
        ((kgx) this.b).c((rrc) rrc.h(yxy.CAR_SERVICE, yzz.MICROPHONE_DIAGNOSTICS_ORPHANED_EVENT, yzyVar).l(), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, jfg] */
    public final synchronized void l() {
        ((kgx) this.b).d(this.a);
    }

    public fbf(fbj fbjVar) {
        this.a = fbjVar;
        this.b = new fbe(fbjVar);
    }

    public fbf(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    public fbf() {
        this.a = new dka();
        this.b = new zu(16);
    }

    public fbf(jfg jfgVar) {
        this.b = new kgx();
        this.a = jfgVar;
    }

    public fbf(fbf fbfVar, djq djqVar) {
        this.a = fbfVar;
        this.b = djqVar;
    }

    public fbf(djq djqVar) {
        this.b = djqVar;
        this.a = new AtomicReference(null);
    }

    public fbf(byte[] bArr, byte[] bArr2) {
        this(jcv.c, new jdg(0));
    }
}
