package com.google.e.a.a;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ah extends b {

    /* renamed from: a, reason: collision with root package name */
    private final aj f8184a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.e.a.k.a f8185b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f8186c;

    private ah(aj ajVar, com.google.e.a.k.a aVar, Integer num) {
        this.f8184a = ajVar;
        this.f8185b = aVar;
        this.f8186c = num;
    }

    public static ah g(aj ajVar, Integer num) throws GeneralSecurityException {
        com.google.e.a.k.a aVarB;
        if (ajVar.f() == ai.f8187a) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            aVarB = com.google.e.a.k.a.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (ajVar.f() != ai.f8188b) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(ajVar.f().toString()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            aVarB = com.google.e.a.k.a.b(new byte[0]);
        }
        return new ah(ajVar, aVarB, num);
    }

    @Override // com.google.d.m.a.a.b
    public final Integer b() {
        return this.f8186c;
    }

    @Override // com.google.d.m.a.a.b
    public final /* synthetic */ com.google.d.m.a.a.b e() {
        return this.f8184a;
    }

    @Override // com.google.e.a.a.b
    public final com.google.e.a.k.a f() {
        return this.f8185b;
    }

    public final aj h() {
        return this.f8184a;
    }
}
