package com.google.android.gearhead.sdk.assistant;

import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.service.notification.StatusBarNotification;
import defpackage.qiz;
import defpackage.qjk;
import defpackage.qjl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class MessagingInfo extends AbstractBundleable {
    public static final Parcelable.Creator<MessagingInfo> CREATOR = new qiz(MessagingInfo.class);

    @Deprecated
    public StatusBarNotification a;

    @Deprecated
    public List b;

    @Deprecated
    public String c;
    public long d;
    public List e;
    public String f;
    public PendingIntent g;
    public PendingIntent h;
    public PendingIntent i;
    public RemoteInput j;
    public String k;
    public Icon l;
    public boolean m;
    public String n;

    public MessagingInfo(qjk qjkVar) {
        this.a = qjkVar.a;
        this.b = qjkVar.b;
        this.c = qjkVar.c;
        this.d = qjkVar.d;
        this.g = qjkVar.e;
        this.e = qjkVar.f;
        this.f = qjkVar.g;
        this.k = qjkVar.h;
        this.l = qjkVar.i;
        this.h = qjkVar.j;
        this.i = qjkVar.k;
        this.j = qjkVar.l;
        this.m = qjkVar.m;
        this.n = qjkVar.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(Bundle bundle) {
        List list;
        this.a = (StatusBarNotification) bundle.getParcelable("NOTIFICATION");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("SMS_PDUS");
        int i = 0;
        if (parcelableArrayList != null) {
            this.b = new ArrayList(parcelableArrayList.size());
            int size = parcelableArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.b.add(((Bundle) parcelableArrayList.get(i2)).getByteArray("SMS_PDU"));
            }
        }
        this.c = bundle.getString("SENDER_DISPLAY_NAME");
        this.d = bundle.getLong("LAST_READ_MILLIS");
        this.g = (PendingIntent) bundle.getParcelable("READ_PENDING_INTENT");
        Bundle bundle2 = bundle.getBundle("MESSAGES_LIST_BUNDLE");
        if (bundle2 != null) {
            ArrayList arrayList = new ArrayList();
            while (true) {
                if (i >= bundle2.size()) {
                    list = arrayList;
                    break;
                }
                Bundle bundle3 = bundle2.getBundle(Integer.toString(i));
                qjl qjlVar = null;
                if (bundle3 != null) {
                    String string = bundle3.getString("sender");
                    String string2 = bundle3.getString("sender_id", null);
                    String string3 = bundle3.getString("body");
                    long j = bundle3.getLong("timestamp");
                    Long lValueOf = Long.valueOf(j);
                    String string4 = bundle3.getString("mime_type");
                    Uri uri = (Uri) bundle3.getParcelable("uri");
                    if (string != null && string3 != null) {
                        lValueOf.getClass();
                        if (j != 0) {
                            String str = string2 == null ? string : string2;
                            lValueOf.getClass();
                            qjlVar = new qjl(string, str, string3, j, string4, uri);
                        }
                    }
                }
                if (qjlVar == null) {
                    list = Collections.EMPTY_LIST;
                    break;
                } else {
                    arrayList.add(qjlVar);
                    i++;
                }
            }
        } else {
            list = Collections.EMPTY_LIST;
        }
        this.e = list;
        this.f = bundle.getString("CONVERSATION_TITLE");
        this.k = bundle.getString("PACKAGE_NAME");
        this.l = (Icon) bundle.getParcelable("ICON");
        this.h = (PendingIntent) bundle.getParcelable("REPLY_PENDING_INTENT");
        this.i = (PendingIntent) bundle.getParcelable("MUTE_PENDING_INTENT");
        this.j = (RemoteInput) bundle.getParcelable("REMOTE_INPUT");
        this.m = bundle.getBoolean("IS_GROUP_CONVERSATION");
        this.n = bundle.getString("SELF_SENDER_ID_KEY");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(Bundle bundle) {
        bundle.putParcelable("NOTIFICATION", this.a);
        List list = this.b;
        if (list != null) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
            for (byte[] bArr : this.b) {
                Bundle bundle2 = new Bundle();
                bundle2.putByteArray("SMS_PDU", bArr);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("SMS_PDUS", arrayList);
        }
        bundle.putString("SENDER_DISPLAY_NAME", this.c);
        bundle.putLong("LAST_READ_MILLIS", this.d);
        bundle.putParcelable("READ_PENDING_INTENT", this.g);
        List list2 = this.e;
        Bundle bundle3 = new Bundle();
        for (int i = 0; i < list2.size(); i++) {
            String string = Integer.toString(i);
            qjl qjlVar = (qjl) list2.get(i);
            Bundle bundle4 = new Bundle();
            bundle4.putString("sender", qjlVar.a);
            bundle4.putString("sender_id", qjlVar.b);
            bundle4.putString("body", qjlVar.c);
            bundle4.putString("mime_type", qjlVar.e);
            bundle4.putParcelable("uri", qjlVar.f);
            bundle4.putLong("timestamp", qjlVar.d);
            bundle3.putBundle(string, bundle4);
        }
        bundle.putBundle("MESSAGES_LIST_BUNDLE", bundle3);
        bundle.putString("CONVERSATION_TITLE", this.f);
        bundle.putString("PACKAGE_NAME", this.k);
        bundle.putParcelable("ICON", this.l);
        bundle.putParcelable("REPLY_PENDING_INTENT", this.h);
        bundle.putParcelable("MUTE_PENDING_INTENT", this.i);
        bundle.putParcelable("REMOTE_INPUT", this.j);
        bundle.putBoolean("IS_GROUP_CONVERSATION", this.m);
        bundle.putString("SELF_SENDER_ID_KEY", this.n);
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final String toString() {
        return "MessagingInfo: { lastReadMillis: " + this.d + ", Messages: " + this.e.size() + ", Originating package: " + this.k + " }";
    }

    public MessagingInfo() {
        this.e = new ArrayList();
    }
}
