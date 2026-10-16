package defpackage;

/* loaded from: classes2.dex */
public final class eqp extends aitu {
    public final epg a = new epg();

    @Override // defpackage.aitu
    public final void a(afco afcoVar, Runnable runnable) {
        afcoVar.getClass();
        runnable.getClass();
        aitu aituVar = aium.a;
        aivr aivrVarI = ajct.a.i();
        boolean zEQ = aivrVarI.eQ(afcoVar);
        epg epgVar = this.a;
        if (zEQ || epgVar.c()) {
            aivrVarI.a(afcoVar, new esx(epgVar, runnable, 1, (byte[]) null));
        } else {
            epgVar.b(runnable);
        }
    }

    @Override // defpackage.aitu
    public final boolean eQ(afco afcoVar) {
        afcoVar.getClass();
        aitu aituVar = aium.a;
        return ajct.a.i().eQ(afcoVar) || !this.a.c();
    }
}
