package Gf;

import Ef.E;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import ef.C2515C;
import ef.C2529m;
import ef.C2530n;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class n extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f4830a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f4831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f4832c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VolumeSettingsChange f4833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w wVar, VolumeSettingsChange volumeSettingsChange, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f4832c = wVar;
        this.f4833d = volumeSettingsChange;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        n nVar = new n(this.f4832c, this.f4833d, interfaceC3103c);
        nVar.f4831b = obj;
        return nVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        Object objZ;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f4830a;
        Object jVar = C2515C.f34653a;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                w wVar = this.f4832c;
                VolumeSettingsChange volumeSettingsChange = this.f4833d;
                this.f4830a = 1;
                if (wVar.i(volumeSettingsChange, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Fe.e.U(obj);
            }
            objZ = jVar;
        } catch (Throwable th) {
            objZ = Fe.e.z(th);
        }
        if (objZ instanceof C2529m) {
            jVar = new j(C2530n.a(objZ));
        }
        return new l(jVar);
    }
}
