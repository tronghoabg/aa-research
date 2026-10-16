package U1;

import android.content.Context;
import android.os.Handler;
import e2.C2469b;
import java.util.ArrayList;
import m2.C3482d;
import q2.C3861e;
import r2.C3912a;

/* renamed from: U1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0839i implements Z {

    /* renamed from: a, reason: collision with root package name */
    public final Context f12081a;

    /* renamed from: b, reason: collision with root package name */
    public final E0.a f12082b;

    public C0839i(Context context) {
        this.f12081a = context;
        this.f12082b = new E0.a(context, false);
    }

    @Override // U1.Z
    public final W[] a(Handler handler, r rVar, r rVar2, r rVar3, r rVar4) {
        ArrayList arrayList = new ArrayList();
        E0.a aVar = this.f12082b;
        Context context = this.f12081a;
        arrayList.add(new C3861e(context, aVar, handler, rVar));
        K8.H h10 = new K8.H(context);
        Q1.k.g(!h10.f6582a);
        h10.f6582a = true;
        if (((b7.k) h10.f6585d) == null) {
            h10.f6585d = new b7.k(new O1.d[0]);
        }
        if (((S3.c) h10.f6588g) == null) {
            h10.f6588g = new S3.c(context, 28);
        }
        arrayList.add(new W1.v(this.f12081a, aVar, handler, rVar2, new W1.t(h10)));
        arrayList.add(new C3482d(rVar3, handler.getLooper()));
        arrayList.add(new C2469b(rVar4, handler.getLooper()));
        arrayList.add(new C3912a());
        arrayList.add(new c2.h(c2.c.W8));
        return (W[]) arrayList.toArray(new W[0]);
    }
}
