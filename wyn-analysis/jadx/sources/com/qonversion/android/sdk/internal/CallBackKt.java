package com.qonversion.android.sdk.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tf.l;
import zg.InterfaceC4664c;
import zg.InterfaceC4667f;
import zg.Q;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000e\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR6\u0010\u000e\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020\t\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/qonversion/android/sdk/internal/CallBackKt;", "T", "Lzg/f;", "<init>", "()V", "Lzg/c;", "call", "", "t", "Lef/C;", "onFailure", "(Lzg/c;Ljava/lang/Throwable;)V", "Lzg/Q;", "response", "onResponse", "(Lzg/c;Lzg/Q;)V", "Lkotlin/Function1;", "Ltf/l;", "getOnResponse", "()Ltf/l;", "setOnResponse", "(Ltf/l;)V", "getOnFailure", "setOnFailure", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CallBackKt<T> implements InterfaceC4667f {

    @Nullable
    private l onFailure;

    @Nullable
    private l onResponse;

    @Nullable
    public final l getOnFailure() {
        return this.onFailure;
    }

    @Nullable
    public final l getOnResponse() {
        return this.onResponse;
    }

    @Override // zg.InterfaceC4667f
    public void onFailure(@NotNull InterfaceC4664c<T> call, @NotNull Throwable t10) {
        AbstractC3340k.e(call, "call");
        AbstractC3340k.e(t10, "t");
        l lVar = this.onFailure;
        if (lVar != null) {
            lVar.invoke(t10);
        }
    }

    @Override // zg.InterfaceC4667f
    public void onResponse(@NotNull InterfaceC4664c<T> call, @NotNull Q<T> response) {
        AbstractC3340k.e(call, "call");
        AbstractC3340k.e(response, "response");
        l lVar = this.onResponse;
        if (lVar != null) {
            lVar.invoke(response);
        }
    }

    public final void setOnFailure(@Nullable l lVar) {
        this.onFailure = lVar;
    }

    public final void setOnResponse(@Nullable l lVar) {
        this.onResponse = lVar;
    }
}
