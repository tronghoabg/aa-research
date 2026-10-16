package com.waze.uid.state_impl.b;

import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.ClearCredentialException;
import h.g.b.x;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o implements CredentialManagerCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f44619a;

    o(p pVar) {
        this.f44619a = pVar;
    }

    @Override // androidx.credentials.CredentialManagerCallback
    public final /* bridge */ /* synthetic */ void onError(Object obj) {
        ClearCredentialException clearCredentialException = (ClearCredentialException) obj;
        x.f(clearCredentialException, "e");
        Objects.toString(clearCredentialException);
        com.waze.shared_infra.i.h.b("UidEventsController", "Error clearing google credential state: ".concat(String.valueOf(clearCredentialException)));
        this.f44619a.k();
    }

    @Override // androidx.credentials.CredentialManagerCallback
    public final /* bridge */ /* synthetic */ void onResult(Object obj) {
        com.waze.shared_infra.i.h.b("UidEventsController", "Google credential state cleared");
        this.f44619a.k();
    }
}
