package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jme extends android.companion.CompanionDeviceManager.Callback {
    final /* synthetic */ defpackage.jmj a;
    final /* synthetic */ defpackage.jml b;
    final /* synthetic */ defpackage.jly c;

    public jme(defpackage.jmj jmjVar, defpackage.jml jmlVar, defpackage.jly jlyVar) {
        this.a = jmjVar;
        this.b = jmlVar;
        this.c = jlyVar;
    }

    @Override // android.companion.CompanionDeviceManager.Callback
    public final void onAssociationCreated(android.companion.AssociationInfo associationInfo) {
        associationInfo.getClass();
        defpackage.jmd jmdVar = defpackage.jml.a;
        defpackage.jmj jmjVar = this.a;
        java.lang.String strC = defpackage.jmd.c(associationInfo, jmjVar.a);
        int iM = ag$.ExternalSyntheticApiModelOutline0.m(associationInfo);
        if (iM <= 0) {
            throw new java.lang.IllegalArgumentException("Association ID must be positive.");
        }
        if (jmjVar.b != 0) {
            throw new java.lang.IllegalStateException("Cannot set association ID more than once.");
        }
        jmjVar.b = iM;
        ((defpackage.yqj) defpackage.jml.b.f()).K("Associated device %s (%s).", strC, iM);
        defpackage.ebq.r(this.b.i, defpackage.zbd.Fr);
        jmjVar.c(defpackage.jmk.b);
        jmjVar.b(this.c);
    }

    @Override // android.companion.CompanionDeviceManager.Callback
    public final void onAssociationPending(android.content.IntentSender intentSender) {
        intentSender.getClass();
        onFailure("Association confirmation dialog unexpectedly shown!");
    }

    @Override // android.companion.CompanionDeviceManager.Callback
    public final void onFailure(java.lang.CharSequence charSequence) {
        ((defpackage.yqj) defpackage.jml.b.g()).y("Unable to associate device! %s", charSequence);
        defpackage.ebq.r(this.b.i, defpackage.zbd.Fs);
        this.c.a(-1);
    }
}
