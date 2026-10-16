package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
final class adsc extends adsu {
    final /* synthetic */ adzx a;
    final /* synthetic */ adsf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adsc(adsf adsfVar, adzx adzxVar) {
        super(adsfVar.b.e);
        this.a = adzxVar;
        this.b = adsfVar;
    }

    @Override // defpackage.adsu
    public final void a() throws IOException {
        int i = aeeb.a;
        adsf adsfVar = this.b;
        adsg adsgVar = adsfVar.b;
        if (adsfVar.a != null) {
            adue.f(this.a);
            return;
        }
        while (true) {
            try {
                InputStream inputStreamG = this.a.g();
                if (inputStreamG == null) {
                    return;
                }
                try {
                    adsfVar.c.g(adsgVar.b.e.b(inputStreamG));
                    inputStreamG.close();
                } catch (Throwable th) {
                    adue.g(inputStreamG);
                    throw th;
                }
            } catch (Throwable th2) {
                adue.f(this.a);
                this.b.b(adnq.c.d(th2).e("Failed to read message."));
                return;
            }
        }
    }
}
