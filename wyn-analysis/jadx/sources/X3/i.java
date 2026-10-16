package X3;

import Ef.E;
import android.graphics.Bitmap;
import c4.C1557j;
import ef.C2515C;
import i4.C2849f;
import java.util.ArrayList;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes.dex */
public final class i extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f16104a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.h f16105b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f16106c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2849f f16107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f16108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bitmap f16109f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h4.h hVar, k kVar, C2849f c2849f, c cVar, Bitmap bitmap, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f16105b = hVar;
        this.f16106c = kVar;
        this.f16107d = c2849f;
        this.f16108e = cVar;
        this.f16109f = bitmap;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new i(this.f16105b, this.f16106c, this.f16107d, this.f16108e, this.f16109f, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f16104a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        ArrayList arrayList = this.f16106c.f16117g;
        boolean z2 = this.f16109f != null;
        h4.h hVar = this.f16105b;
        C1557j c1557j = new C1557j(hVar, arrayList, 0, hVar, this.f16107d, this.f16108e, z2);
        this.f16104a = 1;
        Object objB = c1557j.b(hVar, this);
        return objB == aVar ? aVar : objB;
    }
}
