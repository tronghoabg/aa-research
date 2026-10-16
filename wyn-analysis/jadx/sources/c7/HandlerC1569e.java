package c7;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zzf;
import j$.util.Objects;
import java.util.regex.Matcher;
import org.apache.tika.metadata.TikaCoreProperties;
import x.C4429v;

/* renamed from: c7.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class HandlerC1569e extends zzf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1566b f19686a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC1569e(C1566b c1566b, Looper looper) {
        super(looper);
        this.f19686a = c1566b;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1566b c1566b = this.f19686a;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new C1570f());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof C1571g) {
                        c1566b.f19680g = (C1571g) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c1566b.f19679f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = C1566b.f19673j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        c1566b.d(extras, strGroup);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (stringExtra2.startsWith("|")) {
                    String[] strArrSplit = stringExtra2.split("\\|");
                    if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                        Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                        return;
                    }
                    String str = strArrSplit[2];
                    String strSubstring = strArrSplit[3];
                    if (strSubstring.startsWith(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER)) {
                        strSubstring = strSubstring.substring(1);
                    }
                    c1566b.d(intent2.putExtra("error", strSubstring).getExtras(), str);
                    return;
                }
                synchronized (c1566b.f19674a) {
                    int i5 = 0;
                    while (true) {
                        try {
                            C4429v c4429v = c1566b.f19674a;
                            if (i5 < c4429v.f47563c) {
                                c1566b.d(intent2.getExtras(), (String) c4429v.g(i5));
                                i5++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }
}
