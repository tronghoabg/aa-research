package G9;

import A6.h;
import S3.l;
import android.app.Application;
import df.InterfaceC2432a;
import y3.C4552j;
import z9.C4623B;

/* loaded from: classes4.dex */
public final class a implements InterfaceC2432a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4677a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4678b;

    public /* synthetic */ a(Object obj, int i5) {
        this.f4677a = i5;
        this.f4678b = obj;
    }

    @Override // df.InterfaceC2432a
    public final Object get() {
        switch (this.f4677a) {
            case 0:
                Application application = (Application) ((C4552j) this.f4678b).f48001b;
                h.j(application);
                return application;
            case 1:
                Application application2 = (Application) ((F9.a) this.f4678b).get();
                com.bumptech.glide.h hVarB = com.bumptech.glide.b.b(application2).f24215f.b(application2);
                h.j(hVarB);
                return hVarB;
            default:
                C4623B c4623b = (C4623B) ((l) this.f4678b).f10967a;
                h.j(c4623b);
                return c4623b;
        }
    }

    public a(ya.b bVar, F9.a aVar) {
        this.f4677a = 1;
        this.f4678b = aVar;
    }
}
