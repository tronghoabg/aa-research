package com.google.android.gearhead.sdk.assistant;

/* JADX INFO: loaded from: classes2.dex */
public class MessagingInfo extends com.google.android.gearhead.sdk.assistant.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.gearhead.sdk.assistant.MessagingInfo> CREATOR = new defpackage.qjv(com.google.android.gearhead.sdk.assistant.MessagingInfo.class);

    @java.lang.Deprecated
    public android.service.notification.StatusBarNotification a;

    @java.lang.Deprecated
    public java.util.List b;

    @java.lang.Deprecated
    public java.lang.String c;
    public long d;
    public java.util.List e;
    public java.lang.String f;
    public android.app.PendingIntent g;
    public android.app.PendingIntent h;
    public android.app.PendingIntent i;
    public android.app.RemoteInput j;
    public java.lang.String k;
    public android.graphics.drawable.Icon l;
    public boolean m;
    public java.lang.String n;

    public MessagingInfo(defpackage.qkg qkgVar) {
        this.a = qkgVar.a;
        this.b = qkgVar.b;
        this.c = qkgVar.c;
        this.d = qkgVar.d;
        this.g = qkgVar.e;
        this.e = qkgVar.f;
        this.f = qkgVar.g;
        this.k = qkgVar.h;
        this.l = qkgVar.i;
        this.h = qkgVar.j;
        this.i = qkgVar.k;
        this.j = qkgVar.l;
        this.m = qkgVar.m;
        this.n = qkgVar.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(android.os.Bundle bundle) {
        java.util.List list;
        this.a = (android.service.notification.StatusBarNotification) bundle.getParcelable("NOTIFICATION");
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("SMS_PDUS");
        if (parcelableArrayList != null) {
            this.b = new java.util.ArrayList(parcelableArrayList.size());
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                this.b.add(((android.os.Bundle) parcelableArrayList.get(i)).getByteArray("SMS_PDU"));
            }
        }
        this.c = bundle.getString("SENDER_DISPLAY_NAME");
        this.d = bundle.getLong("LAST_READ_MILLIS");
        this.g = (android.app.PendingIntent) bundle.getParcelable("READ_PENDING_INTENT");
        android.os.Bundle bundle2 = bundle.getBundle("MESSAGES_LIST_BUNDLE");
        if (bundle2 == null) {
            list = java.util.Collections.EMPTY_LIST;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i2 = 0; i2 < bundle2.size(); i2++) {
                android.os.Bundle bundle3 = bundle2.getBundle(java.lang.Integer.toString(i2));
                defpackage.qkh qkhVar = null;
                if (bundle3 != null) {
                    java.lang.String string = bundle3.getString("sender");
                    java.lang.String string2 = bundle3.getString("sender_id", null);
                    java.lang.String string3 = bundle3.getString("body");
                    long j = bundle3.getLong("timestamp");
                    java.lang.Long lValueOf = java.lang.Long.valueOf(j);
                    java.lang.String string4 = bundle3.getString("mime_type");
                    android.net.Uri uri = (android.net.Uri) bundle3.getParcelable("uri");
                    if (string != null && string3 != null) {
                        lValueOf.getClass();
                        if (j != 0) {
                            java.lang.String str = string2 == null ? string : string2;
                            lValueOf.getClass();
                            qkhVar = new defpackage.qkh(string, str, string3, j, string4, uri);
                        }
                    }
                }
                if (qkhVar == null) {
                    list = java.util.Collections.EMPTY_LIST;
                } else {
                    arrayList.add(qkhVar);
                }
            }
            list = arrayList;
        }
        this.e = list;
        this.f = bundle.getString("CONVERSATION_TITLE");
        this.k = bundle.getString("PACKAGE_NAME");
        this.l = (android.graphics.drawable.Icon) bundle.getParcelable("ICON");
        this.h = (android.app.PendingIntent) bundle.getParcelable("REPLY_PENDING_INTENT");
        this.i = (android.app.PendingIntent) bundle.getParcelable("MUTE_PENDING_INTENT");
        this.j = (android.app.RemoteInput) bundle.getParcelable("REMOTE_INPUT");
        this.m = bundle.getBoolean("IS_GROUP_CONVERSATION");
        this.n = bundle.getString("SELF_SENDER_ID_KEY");
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        bundle.putParcelable("NOTIFICATION", this.a);
        java.util.List list = this.b;
        if (list != null) {
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(list.size());
            for (byte[] bArr : this.b) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putByteArray("SMS_PDU", bArr);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("SMS_PDUS", arrayList);
        }
        bundle.putString("SENDER_DISPLAY_NAME", this.c);
        bundle.putLong("LAST_READ_MILLIS", this.d);
        bundle.putParcelable("READ_PENDING_INTENT", this.g);
        java.util.List list2 = this.e;
        android.os.Bundle bundle3 = new android.os.Bundle();
        for (int i = 0; i < list2.size(); i++) {
            java.lang.String string = java.lang.Integer.toString(i);
            defpackage.qkh qkhVar = (defpackage.qkh) list2.get(i);
            android.os.Bundle bundle4 = new android.os.Bundle();
            bundle4.putString("sender", qkhVar.a);
            bundle4.putString("sender_id", qkhVar.b);
            bundle4.putString("body", qkhVar.c);
            bundle4.putString("mime_type", qkhVar.e);
            bundle4.putParcelable("uri", qkhVar.f);
            bundle4.putLong("timestamp", qkhVar.d);
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
    public final java.lang.String toString() {
        return "MessagingInfo: { lastReadMillis: " + this.d + ", Messages: " + this.e.size() + ", Originating package: " + this.k + " }";
    }

    public MessagingInfo() {
        this.e = new java.util.ArrayList();
    }
}
