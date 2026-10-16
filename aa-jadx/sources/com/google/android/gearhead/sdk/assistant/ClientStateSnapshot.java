package com.google.android.gearhead.sdk.assistant;

/* JADX INFO: loaded from: classes2.dex */
public class ClientStateSnapshot extends com.google.android.gearhead.sdk.assistant.AbstractBundleable {
    public static final android.os.Parcelable.Creator<com.google.android.gearhead.sdk.assistant.ClientStateSnapshot> CREATOR = new defpackage.qjv(com.google.android.gearhead.sdk.assistant.ClientStateSnapshot.class);
    public long a;
    public java.util.List b;
    public com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot c;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(android.os.Bundle bundle) {
        this.a = bundle.getLong("CREATED_MILLIS");
        java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList("RECENT_MESSAGES");
        if (parcelableArrayList != null) {
            this.b = new java.util.ArrayList(parcelableArrayList.size());
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                android.os.Bundle bundle2 = (android.os.Bundle) parcelableArrayList.get(i);
                com.google.android.gearhead.sdk.assistant.MessagingInfo messagingInfo = new com.google.android.gearhead.sdk.assistant.MessagingInfo();
                messagingInfo.a(bundle2);
                this.b.add(messagingInfo);
            }
        }
        android.os.Bundle bundle3 = bundle.getBundle("GEARHEAD_STATE_SNAPSHOT");
        if (bundle3 != null) {
            com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot gearheadStateSnapshot = new com.google.android.gearhead.sdk.assistant.GearheadStateSnapshot();
            this.c = gearheadStateSnapshot;
            gearheadStateSnapshot.a(bundle3);
        }
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(android.os.Bundle bundle) {
        bundle.putLong("CREATED_MILLIS", this.a);
        java.util.List list = this.b;
        if (list != null) {
            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(list.size());
            for (com.google.android.gearhead.sdk.assistant.MessagingInfo messagingInfo : this.b) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                messagingInfo.b(bundle2);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("RECENT_MESSAGES", arrayList);
        }
        if (this.c != null) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            this.c.b(bundle3);
            bundle.putBundle("GEARHEAD_STATE_SNAPSHOT", bundle3);
        }
    }
}
