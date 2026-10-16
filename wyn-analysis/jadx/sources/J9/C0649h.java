package J9;

import A.e0;
import com.google.firebase.messaging.FirebaseMessaging;
import l9.C3445a;
import l9.InterfaceC3446b;

/* renamed from: J9.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C0649h implements InterfaceC3446b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5935b;

    public /* synthetic */ C0649h(Object obj, int i5) {
        this.f5934a = i5;
        this.f5935b = obj;
    }

    @Override // l9.InterfaceC3446b
    public final void a(C3445a c3445a) {
        Object obj = this.f5935b;
        switch (this.f5934a) {
            case 0:
                ((C0650i) obj).f5937b.set(c3445a.f40183a.f45322b);
                break;
            default:
                M.y yVar = (M.y) obj;
                if (yVar.f()) {
                    e0 e0Var = FirebaseMessaging.f27357l;
                    ((FirebaseMessaging) yVar.f7230e).l();
                    break;
                }
                break;
        }
    }
}
