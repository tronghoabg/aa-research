package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import java.util.Iterator;

/* loaded from: classes.dex */
final class lww extends BroadcastReceiver {
    final /* synthetic */ lwx a;

    public lww(lwx lwxVar) {
        this.a = lwxVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        lwx lwxVar = this.a;
        lwxVar.d++;
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        Iterator it = lwxVar.c.iterator();
        while (it.hasNext()) {
            a$$ExternalSyntheticApiModelOutline3.m39m(it.next()).accept(messagesFromIntent);
        }
    }
}
