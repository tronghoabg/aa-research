package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class lxd extends android.content.BroadcastReceiver {
    final /* synthetic */ defpackage.lxe a;

    public lxd(defpackage.lxe lxeVar) {
        this.a = lxeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        defpackage.lxe lxeVar = this.a;
        lxeVar.d++;
        android.telephony.SmsMessage[] messagesFromIntent = android.provider.Telephony.Sms.Intents.getMessagesFromIntent(intent);
        java.util.Iterator it = lxeVar.c.iterator();
        while (it.hasNext()) {
            a$.ExternalSyntheticApiModelOutline2.m(a$.ExternalSyntheticApiModelOutline2.m(it.next()), messagesFromIntent);
        }
    }
}
