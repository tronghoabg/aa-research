package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes2.dex */
public final /* synthetic */ class nas {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public nas(Context context) {
        this.a = context;
        this.b = "image_manager_disk_cache";
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, owc] */
    public final void a(CharSequence charSequence, int i) {
        jsp jspVar = ((jso) this.a).b;
        Context context = jspVar.getContext();
        if (context == null && jspVar.u == null) {
            return;
        }
        Object obj = this.b;
        obs obsVar = jspVar.j;
        if (obsVar != null && context != null) {
            obsVar.e(context, ((mqb) obj).a, charSequence, i, null);
            return;
        }
        oct octVar = jspVar.u;
        octVar.getClass();
        try {
            octVar.a.f(charSequence, i, ((mqb) obj).a);
        } catch (RemoteException e) {
            Log.e("CSL.ToastController", "Error showing toast.", e);
        }
    }

    public /* synthetic */ nas(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public nas(mhv mhvVar, mjt mjtVar) {
        this.a = mjtVar;
        this.b = mhvVar;
    }
}
