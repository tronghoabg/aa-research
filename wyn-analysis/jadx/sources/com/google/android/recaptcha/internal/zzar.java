package com.google.android.recaptcha.internal;

import Af.k;
import Ef.C0499l0;
import Ef.C0503n0;
import Ef.C0514u;
import Ef.InterfaceC0501m0;
import Ef.InterfaceC0508q;
import Ef.InterfaceC0511s;
import Ef.InterfaceC0513t;
import Ef.K;
import Ef.U;
import Ef.y0;
import Ef.z0;
import Fe.e;
import Mf.c;
import Mf.d;
import ef.InterfaceC2519c;
import java.util.concurrent.CancellationException;
import jf.InterfaceC3103c;
import jf.InterfaceC3106f;
import jf.InterfaceC3107g;
import jf.InterfaceC3108h;
import kf.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;
import tf.p;

/* loaded from: classes4.dex */
public final class zzar implements K {
    private final /* synthetic */ InterfaceC0513t zza;

    public zzar(InterfaceC0513t interfaceC0513t) {
        this.zza = interfaceC0513t;
    }

    @Override // Ef.InterfaceC0501m0
    @NotNull
    public final InterfaceC0508q attachChild(@NotNull InterfaceC0511s interfaceC0511s) {
        return ((z0) this.zza).attachChild(interfaceC0511s);
    }

    @Override // Ef.K
    @Nullable
    public final Object await(@NotNull InterfaceC3103c interfaceC3103c) {
        Object objP = ((C0514u) this.zza).p(interfaceC3103c);
        a aVar = a.f39711a;
        return objP;
    }

    @Override // Ef.InterfaceC0501m0
    public final void cancel(@Nullable CancellationException cancellationException) {
        ((z0) this.zza).cancel(cancellationException);
    }

    @Override // jf.InterfaceC3108h
    public final Object fold(Object obj, @NotNull p pVar) {
        z0 z0Var = (z0) this.zza;
        z0Var.getClass();
        return e.B(z0Var, obj, pVar);
    }

    @Override // jf.InterfaceC3108h
    @Nullable
    public final InterfaceC3106f get(@NotNull InterfaceC3107g interfaceC3107g) {
        z0 z0Var = (z0) this.zza;
        z0Var.getClass();
        return e.C(z0Var, interfaceC3107g);
    }

    @Override // Ef.InterfaceC0501m0
    @NotNull
    public final CancellationException getCancellationException() {
        return ((z0) this.zza).getCancellationException();
    }

    @Override // Ef.InterfaceC0501m0
    @NotNull
    public final k getChildren() {
        return ((z0) this.zza).getChildren();
    }

    @Override // Ef.K
    public final Object getCompleted() {
        return ((C0514u) this.zza).y();
    }

    @Override // Ef.K
    @Nullable
    public final Throwable getCompletionExceptionOrNull() {
        return ((z0) this.zza).getCompletionExceptionOrNull();
    }

    @Override // jf.InterfaceC3106f
    @NotNull
    public final InterfaceC3107g getKey() {
        this.zza.getClass();
        return C0499l0.f3748a;
    }

    @NotNull
    public final Mf.e getOnAwait() {
        return ((C0514u) this.zza).B();
    }

    @NotNull
    public final c getOnJoin() {
        z0 z0Var = (z0) this.zza;
        z0Var.getClass();
        kotlin.jvm.internal.K.e(3, y0.f3790a);
        return new d(z0Var);
    }

    @Nullable
    public final InterfaceC0501m0 getParent() {
        z0 z0Var = (z0) this.zza;
        z0Var.getClass();
        InterfaceC0508q interfaceC0508q = (InterfaceC0508q) z0.f3794b.get(z0Var);
        if (interfaceC0508q != null) {
            return interfaceC0508q.getParent();
        }
        return null;
    }

    @Override // Ef.InterfaceC0501m0
    @NotNull
    public final U invokeOnCompletion(@NotNull l lVar) {
        return ((z0) this.zza).invokeOnCompletion(lVar);
    }

    @Override // Ef.InterfaceC0501m0
    public final boolean isActive() {
        return ((z0) this.zza).isActive();
    }

    @Override // Ef.InterfaceC0501m0
    public final boolean isCancelled() {
        return ((z0) this.zza).isCancelled();
    }

    public final boolean isCompleted() {
        return ((z0) this.zza).I();
    }

    @Override // Ef.InterfaceC0501m0
    @Nullable
    public final Object join(@NotNull InterfaceC3103c interfaceC3103c) {
        return ((z0) this.zza).join(interfaceC3103c);
    }

    @Override // jf.InterfaceC3108h
    @NotNull
    public final InterfaceC3108h minusKey(@NotNull InterfaceC3107g interfaceC3107g) {
        z0 z0Var = (z0) this.zza;
        z0Var.getClass();
        return e.N(z0Var, interfaceC3107g);
    }

    @InterfaceC2519c
    @NotNull
    public final InterfaceC0501m0 plus(@NotNull InterfaceC0501m0 interfaceC0501m0) {
        ((z0) this.zza).getClass();
        return interfaceC0501m0;
    }

    @Override // Ef.InterfaceC0501m0
    public final boolean start() {
        return ((z0) this.zza).start();
    }

    @InterfaceC2519c
    public final /* synthetic */ boolean cancel(Throwable th) {
        z0 z0Var = (z0) this.zza;
        z0Var.getClass();
        z0Var.r(th != null ? z0.V(z0Var, th) : new C0503n0(z0Var, z0Var.t(), null));
        return true;
    }

    @Override // Ef.InterfaceC0501m0
    @NotNull
    public final U invokeOnCompletion(boolean z2, boolean z10, @NotNull l lVar) {
        return ((z0) this.zza).invokeOnCompletion(z2, z10, lVar);
    }

    @Override // jf.InterfaceC3108h
    @NotNull
    public final InterfaceC3108h plus(@NotNull InterfaceC3108h interfaceC3108h) {
        z0 z0Var = (z0) this.zza;
        z0Var.getClass();
        return e.O(z0Var, interfaceC3108h);
    }

    @InterfaceC2519c
    public final /* synthetic */ void cancel() {
        ((z0) this.zza).cancel(null);
    }
}
