package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* loaded from: classes3.dex */
public final class van implements tmb {
    public final long a;
    private final long b;
    private final long c;
    private final Duration d;
    private final long e;
    private final Duration f;

    public van(tmb tmbVar) {
        this.b = tmbVar.f().toEpochMilli();
        this.c = tmbVar.c();
        this.d = tmbVar.d();
        this.a = tmbVar.a();
        this.e = tmbVar.b();
        this.f = tmbVar.e();
    }

    @Override // defpackage.tmb
    public final long a() {
        return this.a;
    }

    @Override // defpackage.tmb
    public final long b() {
        return this.e;
    }

    @Override // defpackage.tmb
    public final long c() {
        return this.c;
    }

    @Override // defpackage.tmb
    public final Duration d() {
        return this.d;
    }

    @Override // defpackage.tmb
    public final Duration e() {
        return this.f;
    }

    @Override // defpackage.tmb
    public final Instant f() {
        return Instant.ofEpochMilli(this.b);
    }
}
