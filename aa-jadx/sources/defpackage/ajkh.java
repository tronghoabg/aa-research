package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajkh extends defpackage.ajju {
    final /* synthetic */ defpackage.ajkt d;
    final /* synthetic */ defpackage.ajki e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajkh(java.lang.String str, defpackage.ajkt ajktVar, defpackage.ajki ajkiVar) {
        super(str);
        this.d = ajktVar;
        this.e = ajkiVar;
    }

    @Override // defpackage.ajju
    public final long a() throws java.lang.InterruptedException {
        defpackage.ajks ajksVar;
        try {
            ajksVar = this.d.d();
        } catch (java.lang.Throwable th) {
            ajksVar = new defpackage.ajks(this.d, null, th);
        }
        defpackage.ajki ajkiVar = this.e;
        if (!ajkiVar.d.contains(this.d)) {
            return -1L;
        }
        ajkiVar.e.put(ajksVar);
        return -1L;
    }
}
