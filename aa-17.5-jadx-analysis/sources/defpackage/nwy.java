package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class nwy extends afey implements afec {
    private final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwy(Object obj, int i) {
        super(1, obj, nxv.class, "removeNotification", "removeNotification(Lcom/google/android/apps/auto/components/system/notification/NotificationEntry;)V", 0);
        this.a = i;
    }

    @Override // defpackage.afec
    public final /* synthetic */ Object invoke(Object obj) {
        int i = this.a;
        if (i == 0) {
            nuh nuhVar = (nuh) obj;
            String str = nuhVar.c.f;
            long j = nuhVar.a;
            nuj.b().g(nuhVar.b, j, str);
            return afak.a;
        }
        if (i != 1) {
            ((aivk) this.receiver).b((Throwable) obj);
            return afak.a;
        }
        nwc nwcVar = (nwc) obj;
        nwcVar.getClass();
        nvv nvvVar = (nvv) this.receiver;
        float f = nvv.a;
        nvvVar.g = nwcVar;
        return afak.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwy(Object obj, int i, byte[] bArr) {
        super(1, obj, nvv.class, "setDismissDirection", "setDismissDirection(Lcom/google/android/apps/auto/components/system/notification/ui/DismissDirection;)V", 0);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nwy(Object obj, int i, char[] cArr) {
        super(1, obj, aivk.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        this.a = i;
    }
}
