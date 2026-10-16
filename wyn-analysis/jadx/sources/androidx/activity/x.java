package androidx.activity;

import android.util.Log;
import lc.C3458b;
import uc.C4281r;

/* loaded from: classes.dex */
public final class x extends o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f17751e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(Object obj, int i5) {
        super(true);
        this.f17750d = i5;
        this.f17751e = obj;
    }

    @Override // androidx.activity.o
    public final void b() {
        switch (this.f17750d) {
            case 0:
                ((tf.l) this.f17751e).invoke(this);
                break;
            default:
                kc.l lVar = (kc.l) this.f17751e;
                if (lVar.G("onBackPressed")) {
                    kc.f fVar = lVar.f39493b;
                    fVar.c();
                    C3458b c3458b = fVar.f39463b;
                    if (c3458b == null) {
                        Log.w("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
                        break;
                    } else {
                        ((C4281r) c3458b.f40259i.f17489b).a("popRoute", null, null);
                        break;
                    }
                }
                break;
        }
    }
}
