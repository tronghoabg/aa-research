package defpackage;

/* loaded from: classes3.dex */
public final class ajjh extends ajiu {
    final /* synthetic */ ajjt d;
    final /* synthetic */ ajji e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajjh(String str, ajjt ajjtVar, ajji ajjiVar) {
        super(str);
        this.d = ajjtVar;
        this.e = ajjiVar;
    }

    @Override // defpackage.ajiu
    public final long a() throws InterruptedException {
        ajjs ajjsVar;
        try {
            ajjsVar = this.d.d();
        } catch (Throwable th) {
            ajjsVar = new ajjs(this.d, null, th);
        }
        ajji ajjiVar = this.e;
        if (!ajjiVar.d.contains(this.d)) {
            return -1L;
        }
        ajjiVar.e.put(ajjsVar);
        return -1L;
    }
}
