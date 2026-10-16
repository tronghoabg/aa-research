package com.google.android.gearhead.sdk.assistant;

import android.os.Bundle;
import android.os.Parcelable;
import defpackage.qiz;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class ClientStateSnapshot extends AbstractBundleable {
    public static final Parcelable.Creator<ClientStateSnapshot> CREATOR = new qiz(ClientStateSnapshot.class);
    public long a;
    public List b;
    public GearheadStateSnapshot c;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    public final void a(Bundle bundle) {
        this.a = bundle.getLong("CREATED_MILLIS");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("RECENT_MESSAGES");
        if (parcelableArrayList != null) {
            this.b = new ArrayList(parcelableArrayList.size());
            int size = parcelableArrayList.size();
            for (int i = 0; i < size; i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                MessagingInfo messagingInfo = new MessagingInfo();
                messagingInfo.a(bundle2);
                this.b.add(messagingInfo);
            }
        }
        Bundle bundle3 = bundle.getBundle("GEARHEAD_STATE_SNAPSHOT");
        if (bundle3 != null) {
            GearheadStateSnapshot gearheadStateSnapshot = new GearheadStateSnapshot();
            this.c = gearheadStateSnapshot;
            gearheadStateSnapshot.a(bundle3);
        }
    }

    @Override // com.google.android.gearhead.sdk.assistant.AbstractBundleable
    protected final void b(Bundle bundle) {
        bundle.putLong("CREATED_MILLIS", this.a);
        List list = this.b;
        if (list != null) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
            for (MessagingInfo messagingInfo : this.b) {
                Bundle bundle2 = new Bundle();
                messagingInfo.b(bundle2);
                arrayList.add(bundle2);
            }
            bundle.putParcelableArrayList("RECENT_MESSAGES", arrayList);
        }
        if (this.c != null) {
            Bundle bundle3 = new Bundle();
            this.c.b(bundle3);
            bundle.putBundle("GEARHEAD_STATE_SNAPSHOT", bundle3);
        }
    }
}
