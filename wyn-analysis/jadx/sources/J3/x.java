package J3;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class x {
    public final S3.e a(s sVar) {
        List listSingletonList = Collections.singletonList(sVar);
        K3.q qVar = (K3.q) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        K3.k kVar = new K3.k(qVar, listSingletonList);
        if (kVar.f6491e) {
            r.d().g(K3.k.f6486g, "Already enqueued work ids (" + TextUtils.join(", ", kVar.f6489c) + ")");
        } else {
            T3.e eVar = new T3.e(kVar);
            qVar.f6504d.v(eVar);
            kVar.f6492f = eVar.f11410b;
        }
        return kVar.f6492f;
    }
}
