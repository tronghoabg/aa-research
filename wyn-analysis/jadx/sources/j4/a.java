package J4;

import C4.l;
import I4.m;
import I4.n;
import I4.o;
import I4.p;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: b, reason: collision with root package name */
    public static final B4.f f5592b = B4.f.a(Integer.valueOf(UnityAdsConstants.RequestPolicy.RETRY_MAX_INTERVAL), "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final Y9.c f5593a;

    public a(Y9.c cVar) {
        this.f5593a = cVar;
    }

    @Override // I4.p
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // I4.p
    public final o b(Object obj, int i5, int i10, B4.g gVar) {
        I4.f fVar = (I4.f) obj;
        Y9.c cVar = this.f5593a;
        if (cVar != null) {
            n nVarA = n.a(fVar);
            m mVar = (m) cVar.f16739b;
            Object objB = mVar.b(nVarA);
            ArrayDeque arrayDeque = n.f5351b;
            synchronized (arrayDeque) {
                arrayDeque.offer(nVarA);
            }
            I4.f fVar2 = (I4.f) objB;
            if (fVar2 == null) {
                mVar.e(n.a(fVar), fVar);
            } else {
                fVar = fVar2;
            }
        }
        return new o(fVar, new l(fVar, ((Integer) gVar.c(f5592b)).intValue()));
    }
}
