package defpackage;

/* loaded from: classes3.dex */
final class ahte implements afec {
    final /* synthetic */ agba val$current;

    public ahte(agba agbaVar) {
        this.val$current = agbaVar;
    }

    @Override // defpackage.afec
    public Boolean invoke(agax agaxVar) {
        boolean z = false;
        if (!agcb.isPrivate(agaxVar.getVisibility()) && agcb.isVisibleIgnoringReceiver(agaxVar, this.val$current, false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
