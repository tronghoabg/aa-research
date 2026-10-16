package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
final class aeai extends aeak {
    final /* synthetic */ aeal a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeai(aeal aealVar) {
        super(aealVar);
        this.a = aealVar;
        int i = aeeb.a;
    }

    @Override // defpackage.aeak
    public final void a() throws IOException {
        int i;
        ajmy ajmyVar = new ajmy();
        int i2 = aeeb.a;
        aeal aealVar = this.a;
        synchronized (aealVar.a) {
            ajmy ajmyVar2 = aealVar.b;
            ajmyVar.a(ajmyVar2, ajmyVar2.h());
            aealVar.d = false;
            i = aealVar.i;
        }
        aeal aealVar2 = this.a;
        aealVar2.f.a(ajmyVar, ajmyVar.b);
        synchronized (aealVar2.a) {
            aealVar2.i -= i;
        }
    }
}
