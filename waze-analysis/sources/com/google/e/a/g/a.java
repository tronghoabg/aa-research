package com.google.e.a.g;

import com.google.android.libraries.phenotype.client.stable.p;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final b f8537a;

    /* renamed from: b, reason: collision with root package name */
    private final p f8538b;

    private a(b bVar, p pVar) {
        this.f8537a = bVar;
        this.f8538b = pVar;
    }

    public static a f(b bVar, p pVar) throws GeneralSecurityException {
        if (bVar.f() == pVar.d()) {
            return new a(bVar, pVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.d.m.a.a.b
    public final Integer b() {
        return null;
    }

    @Override // com.google.d.m.a.a.b
    public final /* synthetic */ com.google.d.m.a.a.b e() {
        return this.f8537a;
    }

    public final p g() {
        return this.f8538b;
    }
}
