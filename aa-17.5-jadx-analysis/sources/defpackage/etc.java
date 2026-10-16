package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes2.dex */
final class etc extends etp {
    final /* synthetic */ etg a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ ett d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etc(ett ettVar, Object obj, etg etgVar, String str, Bundle bundle) {
        super(obj);
        this.d = ettVar;
        this.a = etgVar;
        this.b = str;
        this.c = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.etp
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        etg etgVar = this.a;
        erb erbVar = etgVar.g;
        if (this.d.c.get(erbVar.G()) != etgVar) {
            if (ett.a) {
                Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.a.a + " id=" + this.b);
                return;
            }
            return;
        }
        Collection collectionE = obj;
        if ((this.h & 1) != 0) {
            collectionE = ett.e(obj, this.c);
        }
        try {
            String str = this.b;
            Bundle bundle = this.c;
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            bundle2.putBundle("data_notify_children_changed_options", null);
            if (collectionE != null) {
                bundle2.putParcelableArrayList("data_media_item_list", collectionE instanceof ArrayList ? (ArrayList) collectionE : new ArrayList<>(collectionE));
            }
            erbVar.H(3, bundle2);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.b + " package=" + this.a.a);
        }
    }
}
