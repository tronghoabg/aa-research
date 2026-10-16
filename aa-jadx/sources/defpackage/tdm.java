package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tdm extends defpackage.tdh {
    final /* synthetic */ defpackage.tdn a;
    final /* synthetic */ defpackage.tdo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdm(defpackage.tdn tdnVar, defpackage.tdo tdoVar, java.util.Iterator it) {
        super(it);
        this.a = tdnVar;
        this.b = tdoVar;
    }

    @Override // defpackage.tdh
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.tdh, java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        return new defpackage.tdl(this.b, (java.util.Map.Entry) super.next());
    }
}
