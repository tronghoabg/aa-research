package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class ajzk extends ajzc {
    private final ajpk b;
    private final akbh c;

    @Deprecated
    public ajzk(ajzu ajzuVar, ajpk ajpkVar, akas akasVar) {
        super(ajzuVar, akasVar);
        this.b = ajpkVar;
        this.c = new akbh(128);
    }

    @Override // defpackage.ajzc
    protected final /* bridge */ /* synthetic */ ajpg a(ajzu ajzuVar) throws ajpd, ajpr, IOException {
        akbh akbhVar = this.c;
        akbhVar.i();
        if (ajzuVar.c(akbhVar) == -1) {
            throw new ajpq("The target server failed to respond");
        }
        return this.b.a(this.a.a(akbhVar, new akao(0, akbhVar.b)));
    }
}
