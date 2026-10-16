package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class euz extends defpackage.op {
    final /* synthetic */ defpackage.eva a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public euz(defpackage.eva evaVar) {
        super(false);
        this.a = evaVar;
    }

    @Override // defpackage.op
    public final void b() {
        ewv ewvVar = this.a.b;
        if (ewvVar.e.isEmpty()) {
            return;
        }
        defpackage.evf evfVarE = ewvVar.e();
        evfVarE.getClass();
        ewvVar.t(evfVarE.c(), true);
    }
}
