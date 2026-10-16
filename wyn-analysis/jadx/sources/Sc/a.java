package Sc;

import a.AbstractC1304a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import e9.C2476b;
import java.util.HashMap;
import uc.C4281r;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements OnSuccessListener, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f11056a;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        b bVar = this.f11056a;
        bVar.getClass();
        HashMap map = new HashMap();
        map.put("code", "unknown");
        if (exc != null) {
            map.put(PglCryptUtils.KEY_MESSAGE, exc.getMessage());
        } else {
            map.put(PglCryptUtils.KEY_MESSAGE, "An unknown error has occurred.");
        }
        C4281r c4281r = bVar.f11060d;
        if (c4281r != null) {
            c4281r.a("FirebaseDynamicLink#onLinkError", map, null);
        } else {
            bVar.f11059c = map;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        b bVar = this.f11056a;
        bVar.getClass();
        HashMap mapR = AbstractC1304a.r((C2476b) obj);
        if (mapR != null) {
            C4281r c4281r = bVar.f11060d;
            if (c4281r != null) {
                c4281r.a("FirebaseDynamicLink#onLinkSuccess", mapR, null);
            } else {
                bVar.f11058b = mapR;
            }
        }
    }
}
