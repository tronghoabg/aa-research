package defpackage;

/* loaded from: classes3.dex */
final class vjt extends vja {
    final /* synthetic */ vjv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vjt(vjv vjvVar) {
        super((byte[]) null);
        this.a = vjvVar;
    }

    @Override // defpackage.vja
    public final void n(vjs vjsVar) {
        vjv vjvVar = this.a;
        aat aatVar = vjvVar.b;
        if (((Boolean) aatVar.get(vjsVar)).booleanValue()) {
            return;
        }
        aatVar.put(vjsVar, true);
        vjvVar.c++;
        vjvVar.a();
    }
}
