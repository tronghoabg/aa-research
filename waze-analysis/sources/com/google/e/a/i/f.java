package com.google.e.a.i;

import com.google.android.libraries.phenotype.client.stable.p;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final j f8623a;

    /* renamed from: b, reason: collision with root package name */
    private final p f8624b;

    private f(j jVar, p pVar) {
        this.f8623a = jVar;
        this.f8624b = pVar;
    }

    public static f g(j jVar, p pVar) throws GeneralSecurityException {
        if (jVar.h() == pVar.d()) {
            return new f(jVar, pVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.d.m.a.a.b
    public final /* synthetic */ com.google.d.m.a.a.b e() {
        return this.f8623a;
    }

    public final j f() {
        return this.f8623a;
    }

    public final p h() {
        return this.f8624b;
    }
}
