package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dzb extends android.telecom.Call.Callback {
    final /* synthetic */ defpackage.aiyu a;

    public dzb(defpackage.aiyu aiyuVar) {
        this.a = aiyuVar;
    }

    @Override // android.telecom.Call.Callback
    public final void onDetailsChanged(android.telecom.Call call, android.telecom.Call.Details details) {
        if (details != null) {
            defpackage.aiyu aiyuVar = this.a;
            boolean zHasProperty = details.hasProperty(32768);
            boolean zHasProperty2 = details.hasProperty(256);
            android.telecom.PhoneAccountHandle accountHandle = details.getAccountHandle();
            android.os.Bundle extras = details.getExtras();
            defpackage.aiea.a(aiyuVar, new defpackage.dxs(zHasProperty, zHasProperty2, accountHandle, extras != null ? new android.os.Bundle(extras) : null));
        }
    }
}
