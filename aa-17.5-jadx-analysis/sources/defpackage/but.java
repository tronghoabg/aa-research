package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class but extends RuntimeException {
    public final aag a;
    public final aag b;
    public final zf c;
    public final int d;

    public but(aag aagVar, aag aagVar2, zf zfVar, int i, Throwable th) {
        super(th);
        this.a = aagVar;
        this.b = aagVar2;
        this.c = zfVar;
        this.d = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() throws IOException {
        return afyh.Q("\n            |Failed to execute op number " + this.d + ":\n            |" + woy.cu(woy.ce(afrg.j(new afbb(new bus(this, null), 3)), 50), "\n", null, null, null, 62) + "\n            ");
    }
}
