package com.google.e.a.i;

import com.google.android.libraries.phenotype.client.stable.p;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class a extends com.google.d.m.a.a.b {

    /* renamed from: a, reason: collision with root package name */
    private final e f8586a;

    /* renamed from: b, reason: collision with root package name */
    private final p f8587b;

    private a(e eVar, p pVar) {
        this.f8586a = eVar;
        this.f8587b = pVar;
    }

    public static a g(e eVar, p pVar) throws GeneralSecurityException {
        if (eVar.i() == pVar.d()) {
            return new a(eVar, pVar);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.d.m.a.a.b
    public final /* synthetic */ com.google.d.m.a.a.b e() {
        return this.f8586a;
    }

    public final e f() {
        return this.f8586a;
    }

    public final p h() {
        return this.f8587b;
    }
}
