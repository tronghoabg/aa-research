package defpackage;

import android.app.Notification;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.sidekick.shared.remoteapi.RemoteApiConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class dtl {
    public final CharSequence a;
    public final long b;
    public final duk c;
    public String d;
    public Uri e;
    private final Bundle f = new Bundle();

    public dtl(CharSequence charSequence, long j, duk dukVar) {
        this.a = charSequence;
        this.b = j;
        this.c = dukVar;
    }

    static List b(Parcelable[] parcelableArr) {
        String str;
        String str2;
        duk dukVar;
        String str3 = "sender";
        String str4 = "sender_person";
        ArrayList arrayList = new ArrayList(parcelableArr.length);
        int i = 0;
        while (i < parcelableArr.length) {
            Parcelable parcelable = parcelableArr[i];
            if (parcelable instanceof Bundle) {
                Bundle bundle = (Bundle) parcelable;
                dtl dtlVar = null;
                if (bundle.containsKey("text") && bundle.containsKey("time")) {
                    if (bundle.containsKey("person")) {
                        dukVar = duk.b(bundle.getBundle("person"));
                    } else if (bundle.containsKey(str4)) {
                        dukVar = dsy.c(hg$$ExternalSyntheticApiModelOutline0.m((Object) bundle.getParcelable(str4)));
                    } else if (bundle.containsKey(str3)) {
                        duj dujVar = new duj();
                        dujVar.a = bundle.getCharSequence(str3);
                        dukVar = new duk(dujVar);
                    } else {
                        dukVar = null;
                    }
                    str = str3;
                    str2 = str4;
                    try {
                        dtl dtlVar2 = new dtl(bundle.getCharSequence("text"), bundle.getLong("time"), dukVar);
                        if (bundle.containsKey(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA) && bundle.containsKey("uri")) {
                            dtlVar2.c(bundle.getString(RemoteApiConstants.BROADCAST_INTENT_TYPE_EXTRA), (Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            dtlVar2.f.putAll(bundle.getBundle("extras"));
                        }
                        dtlVar = dtlVar2;
                    } catch (ClassCastException unused) {
                    }
                } else {
                    str = str3;
                    str2 = str4;
                }
                if (dtlVar != null) {
                    arrayList.add(dtlVar);
                }
            } else {
                str = str3;
                str2 = str4;
            }
            i++;
            str3 = str;
            str4 = str2;
        }
        return arrayList;
    }

    final Notification.MessagingStyle.Message a() {
        duk dukVar = this.c;
        Notification.MessagingStyle.Message messageA = dtk.a(this.a, this.b, dukVar == null ? null : dsy.b(dukVar));
        String str = this.d;
        if (str != null) {
            dtj.a(messageA, str, this.e);
        }
        dtk.b(messageA, this.f);
        return messageA;
    }

    public final void c(String str, Uri uri) {
        this.d = str;
        this.e = uri;
    }
}
