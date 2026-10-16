package com.google.firebase;

import Ef.A;
import L8.a;
import L8.b;
import L8.l;
import L8.t;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import s8.i;
import y8.InterfaceC4566a;
import y8.InterfaceC4567b;
import y8.InterfaceC4568c;
import y8.d;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LL8/b;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<b> getComponents() {
        a aVarA = b.a(new t(InterfaceC4566a.class, A.class));
        aVarA.c(new l(new t(InterfaceC4566a.class, Executor.class), 1, 0));
        aVarA.f6989g = i.f45338b;
        b bVarD = aVarA.d();
        a aVarA2 = b.a(new t(InterfaceC4568c.class, A.class));
        aVarA2.c(new l(new t(InterfaceC4568c.class, Executor.class), 1, 0));
        aVarA2.f6989g = i.f45339c;
        b bVarD2 = aVarA2.d();
        a aVarA3 = b.a(new t(InterfaceC4567b.class, A.class));
        aVarA3.c(new l(new t(InterfaceC4567b.class, Executor.class), 1, 0));
        aVarA3.f6989g = i.f45340d;
        b bVarD3 = aVarA3.d();
        a aVarA4 = b.a(new t(d.class, A.class));
        aVarA4.c(new l(new t(d.class, Executor.class), 1, 0));
        aVarA4.f6989g = i.f45341e;
        return AbstractC3935e.D(bVarD, bVarD2, bVarD3, aVarA4.d());
    }
}
