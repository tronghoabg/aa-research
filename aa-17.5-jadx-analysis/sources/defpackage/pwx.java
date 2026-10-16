package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* loaded from: classes2.dex */
public final class pwx implements pww {
    public final absi b;
    public final Instant c;

    public pwx(absi absiVar) {
        this.b = absiVar;
        absg absgVar = absiVar.f;
        int i = (absgVar == null ? absg.a : absgVar).c;
        absg absgVar2 = absiVar.f;
        int i2 = (absgVar2 == null ? absg.a : absgVar2).d;
        if ((absiVar.b & 4) != 0) {
            this.c = zeo.a(absiVar.e);
        } else {
            this.c = Instant.ofEpochMilli(-1L);
        }
    }

    @Override // defpackage.pww
    public final absi a() {
        return this.b;
    }

    @Override // defpackage.pww
    public final Duration b() {
        throw null;
    }
}
