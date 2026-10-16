package com.google.e.a.c.a;

import com.google.e.a.e.ar;
import com.google.e.a.e.i;
import com.google.e.a.h.ci;
import com.google.e.a.s;
import com.waze.car_lib.r.ai;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements com.google.e.a.d {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.e.a.d f8367a;

    /* renamed from: b, reason: collision with root package name */
    private final ci f8368b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f8369c;

    private b(com.google.e.a.d dVar, ci ciVar, byte[] bArr) {
        this.f8367a = dVar;
        this.f8368b = ciVar;
        this.f8369c = bArr;
    }

    public static com.google.e.a.d c(i iVar) {
        ai aiVarG = iVar.g();
        com.google.e.a.d dVar = (com.google.e.a.d) com.google.e.a.e.c.a().c(aiVarG.h(), com.google.e.a.d.class).a(aiVarG.f());
        s sVarE = aiVarG.e();
        return new b(dVar, com.google.e.a.b.a.a.e(sVarE), com.google.e.a.b.a.a.f(sVarE, iVar.b()).c());
    }

    @Override // com.google.e.a.d
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (this.f8368b == ci.RAW) {
            return this.f8367a.a(bArr, bArr2);
        }
        if (ar.a(this.f8369c, bArr)) {
            return this.f8367a.a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }

    @Override // com.google.e.a.d
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        return this.f8368b == ci.RAW ? this.f8367a.b(bArr, bArr2) : com.google.e.a.d.a.d.d(this.f8369c, this.f8367a.b(bArr, bArr2));
    }
}
