package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.telecom.Call;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class dxs {
    public final Call a;
    private final aitx f;
    private final Set g = new LinkedHashSet();
    public final ajab b = ajac.a("");
    public final ajab c = ajac.a(0);
    public final ajab d = ajac.a(Uri.EMPTY);
    private boolean h = true;
    private boolean i = true;
    public final ajab e = ajac.a(false);

    public dxs(aitx aitxVar, Call call) {
        this.f = aitxVar;
        this.a = call;
    }

    private final Object d(String str, Bundle bundle, Set set, afec afecVar, Object obj, ajab ajabVar, afck afckVar) {
        Object objA;
        Object objInvoke;
        boolean zContains = set.contains(str);
        Set set2 = this.g;
        if (zContains) {
            set2.add(str);
            if (bundle != null && (objInvoke = afecVar.invoke(bundle)) != null) {
                obj = objInvoke;
            }
            Object objA2 = ajabVar.a(obj, afckVar);
            if (objA2 == afcr.a) {
                return objA2;
            }
        } else if (set2.contains(str) && (objA = ajabVar.a(obj, afckVar)) == afcr.a) {
            return objA;
        }
        return afak.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.os.Bundle r10, defpackage.dyw r11, defpackage.afck r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.dxn
            if (r0 == 0) goto L13
            r0 = r12
            dxn r0 = (defpackage.dxn) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            dxn r0 = new dxn
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.b
            afcr r1 = defpackage.afcr.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r9 = r0.a
            dyw r11 = r0.e
            defpackage.woy.dF(r12)
            goto L9e
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.woy.dF(r12)
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L3e
            r9 = 0
            return r9
        L3e:
            java.lang.String r12 = "android.telecom.extra.VOIP_API_VERSION"
            r2 = 0
            int r12 = r10.getInt(r12, r2)
            java.lang.String r4 = "android.telecom.extra.USE_LOCAL_CALL_SILENCE_CAPABILITY"
            boolean r5 = r10.containsKey(r4)
            if (r5 == 0) goto L53
            boolean r4 = r10.getBoolean(r4)
            r9.h = r4
        L53:
            r4 = 3
            androidx.core.telecom.extensions.Capability[] r5 = new androidx.core.telecom.extensions.Capability[r4]
            androidx.core.telecom.extensions.Capability r6 = new androidx.core.telecom.extensions.Capability
            r6.<init>()
            r7 = 4
            r6.a = r7
            r6.b = r12
            afbg r7 = defpackage.afbg.a
            int[] r8 = defpackage.woy.cp(r7)
            r6.c = r8
            r5[r2] = r6
            androidx.core.telecom.extensions.Capability r2 = new androidx.core.telecom.extensions.Capability
            r2.<init>()
            r2.a = r4
            r2.b = r12
            int[] r4 = defpackage.woy.cp(r7)
            r2.c = r4
            r5[r3] = r2
            androidx.core.telecom.extensions.Capability r2 = new androidx.core.telecom.extensions.Capability
            r2.<init>()
            r4 = 2
            r2.a = r4
            r2.b = r12
            int[] r12 = defpackage.woy.cp(r7)
            r2.c = r12
            r5[r4] = r2
            java.util.Set r12 = defpackage.woy.di(r5)
            r0.e = r11
            r0.a = r12
            r0.d = r3
            java.lang.Object r9 = r9.c(r10, r0)
            if (r9 == r1) goto Lab
            r9 = r12
        L9e:
            dyb r10 = r11.e
            dxk r11 = new dxk
            dyv r12 = new dyv
            r12.<init>(r10)
            r11.<init>(r9, r12)
            return r11
        Lab:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxs.a(android.os.Bundle, dyw, afck):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.aiyk r10, defpackage.afck r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.dxo
            if (r0 == 0) goto L13
            r0 = r11
            dxo r0 = (defpackage.dxo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dxo r0 = new dxo
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            afcr r1 = defpackage.afcr.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            defpackage.woy.dF(r11)
            return r11
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            dxs r9 = r0.e
            dyw r10 = r0.d
            defpackage.woy.dF(r11)
            goto L7c
        L3b:
            defpackage.woy.dF(r11)
            java.lang.String r11 = "ECEP"
            java.lang.String r2 = "handleExtrasExtensionsFromVoipApp: consuming extras"
            android.util.Log.i(r11, r2)
            aitx r11 = r9.f
            dyw r2 = new dyw
            r2.<init>(r11)
            bly r6 = new bly
            r7 = 11
            r6.<init>(r9, r7)
            r2.d = r6
            dxm r6 = new dxm
            r7 = 0
            r6.<init>(r9, r7)
            r2.c = r6
            dxm r6 = new dxm
            r6.<init>(r9, r4)
            r2.b = r6
            bns r6 = new bns
            r8 = 19
            r6.<init>(r10, r9, r5, r8)
            r8 = 3
            defpackage.ahnc.d(r11, r5, r7, r6, r8)
            r0.d = r2
            r0.e = r9
            r0.c = r4
            java.lang.Object r11 = defpackage.afpt.p(r10, r0)
            if (r11 == r1) goto L8c
            r10 = r2
        L7c:
            android.os.Bundle r11 = (android.os.Bundle) r11
            r0.d = r5
            r0.e = r5
            r0.c = r3
            java.lang.Object r9 = r9.a(r11, r10, r0)
            if (r9 != r1) goto L8b
            goto L8c
        L8b:
            return r9
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxs.b(aiyk, afck):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
    
        if (d("android.telecom.extra.LOCAL_CALL_SILENCE_STATE", r4, r5, r6, false, r8, r9) == r10) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca A[PHI: r4 r5
  0x00ca: PHI (r4v4 android.os.Bundle) = (r4v3 android.os.Bundle), (r4v7 android.os.Bundle) binds: [B:32:0x00c8, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x00ca: PHI (r5v4 java.util.Set<java.lang.String>) = (r5v3 java.util.Set<java.lang.String>), (r5v7 java.util.Set<java.lang.String>) binds: [B:32:0x00c8, B:17:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.os.Bundle r16, defpackage.afck r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxs.c(android.os.Bundle, afck):java.lang.Object");
    }
}
