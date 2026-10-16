package Ba;

import C6.l;
import Va.M6;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public final class d implements OnFailureListener, L8.e {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ d f1662a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d f1663b = new d();

    @Override // L8.e
    public Object o(l lVar) {
        Set setB = lVar.B(c.class);
        d dVar = new d();
        new HashMap();
        new HashMap();
        Iterator it = setB.iterator();
        if (it.hasNext()) {
            throw M6.j(it);
        }
        return dVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        b.f1648e.a(exc, "MobileVisionBase", "Error preloading model resource");
    }
}
