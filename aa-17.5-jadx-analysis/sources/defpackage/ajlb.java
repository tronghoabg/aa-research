package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class ajlb implements afdr {
    public final /* synthetic */ ajlc a;
    private final ajlf b;

    public ajlb(ajlc ajlcVar, ajlf ajlfVar) {
        this.a = ajlcVar;
        this.b = ajlfVar;
    }

    @Override // defpackage.afdr
    public final /* bridge */ /* synthetic */ Object invoke() throws IOException {
        ajlf ajlfVar;
        try {
            ajlfVar = this.b;
        } catch (IOException e) {
            this.a.j(2, 2, e);
            ajlf ajlfVar2 = this.b;
            int i = ajiq.a;
            a.e(ajlfVar2);
        } catch (Throwable th) {
            this.a.j(3, 3, null);
            ajlf ajlfVar3 = this.b;
            int i2 = ajiq.a;
            a.e(ajlfVar3);
            throw th;
        }
        if (!ajlfVar.a(true, this)) {
            throw new IOException("Required SETTINGS preface not received");
        }
        while (ajlfVar.a(false, this)) {
        }
        this.a.j(1, 9, null);
        int i3 = ajiq.a;
        a.e(ajlfVar);
        return afak.a;
    }
}
