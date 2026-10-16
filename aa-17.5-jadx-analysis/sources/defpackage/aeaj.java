package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
final class aeaj extends aeak {
    final /* synthetic */ aeal a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeaj(aeal aealVar) {
        super(aealVar);
        this.a = aealVar;
        int i = aeeb.a;
    }

    @Override // defpackage.aeak
    public final void a() throws IOException {
        ajmy ajmyVar = new ajmy();
        int i = aeeb.a;
        aeal aealVar = this.a;
        synchronized (aealVar.a) {
            ajmy ajmyVar2 = aealVar.b;
            ajmyVar.a(ajmyVar2, ajmyVar2.b);
            aealVar.e = false;
        }
        aeal aealVar2 = this.a;
        aealVar2.f.a(ajmyVar, ajmyVar.b);
        aealVar2.f.flush();
    }
}
