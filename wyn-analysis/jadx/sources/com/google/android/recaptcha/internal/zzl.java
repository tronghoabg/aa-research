package com.google.android.recaptcha.internal;

import Ef.H;
import ff.t;
import ff.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class zzl {
    public zzdc zza;

    @NotNull
    private final List zzb;

    /* JADX WARN: Multi-variable type inference failed */
    public zzl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void zzg(zze... zzeVarArr) {
        t.f0(this.zzb, zzeVarArr);
    }

    @NotNull
    public final zzdc zza() {
        zzdc zzdcVar = this.zza;
        if (zzdcVar != null) {
            return zzdcVar;
        }
        return null;
    }

    @Nullable
    public final Object zzb(@NotNull String str, long j8, @NotNull InterfaceC3103c interfaceC3103c) {
        return H.l(new zzh(this, str, j8, null), interfaceC3103c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(long r11, @org.jetbrains.annotations.NotNull com.google.android.recaptcha.internal.zzpq r13, @org.jetbrains.annotations.NotNull jf.InterfaceC3103c r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzi
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzi r0 = (com.google.android.recaptcha.internal.zzi) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzi r0 = new com.google.android.recaptcha.internal.zzi
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            kf.a r1 = kf.a.f39711a
            int r2 = r0.zzc
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            Fe.e.U(r14)
            goto L44
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            Fe.e.U(r14)
            com.google.android.recaptcha.internal.zzk r4 = new com.google.android.recaptcha.internal.zzk
            r9 = 0
            r5 = r10
            r6 = r11
            r8 = r13
            r4.<init>(r5, r6, r8, r9)
            r0.zzc = r3
            java.lang.Object r14 = Ef.H.l(r4, r0)
            if (r14 != r1) goto L44
            return r1
        L44:
            ef.n r14 = (ef.C2530n) r14
            java.lang.Object r11 = r14.f34674a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzl.zzc(long, com.google.android.recaptcha.internal.zzpq, jf.c):java.lang.Object");
    }

    @NotNull
    public final List zzd() {
        return this.zzb;
    }

    public final void zze(@NotNull zze... zzeVarArr) {
        zzg((zze[]) Arrays.copyOf(zzeVarArr, 2));
    }

    public final void zzf(@NotNull zzqf zzqfVar) {
        Iterator it = this.zzb.iterator();
        while (it.hasNext()) {
            ((zze) it.next()).zzk(zzqfVar);
        }
    }

    public /* synthetic */ zzl(List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        v vVar = v.f35432a;
        this.zzb = new ArrayList();
        zze[] zzeVarArr = (zze[]) vVar.toArray(new zze[0]);
        zzg((zze[]) Arrays.copyOf(zzeVarArr, zzeVarArr.length));
    }
}
