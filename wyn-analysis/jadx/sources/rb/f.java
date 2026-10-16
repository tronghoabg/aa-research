package rb;

import ad.L;
import android.app.Activity;
import android.content.Context;
import nb.InterfaceC3612a;
import x6.C4476g;

/* loaded from: classes4.dex */
public final class f extends a implements InterfaceC3612a {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f44727h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Context context, nb.c cVar, L l10, com.unity3d.scar.adapter.common.c cVar2, int i5) {
        super(context, cVar, l10, cVar2, 0);
        this.f44727h = i5;
    }

    @Override // nb.InterfaceC3612a
    public final void a(Activity activity) {
        switch (this.f44727h) {
            case 0:
                Object obj = this.f44712b;
                if (obj == null) {
                    this.f44715e.handleError(com.unity3d.scar.adapter.common.a.a(this.f44714d));
                    break;
                } else {
                    ((I6.a) obj).show(activity);
                    break;
                }
            default:
                Object obj2 = this.f44712b;
                if (obj2 == null) {
                    this.f44715e.handleError(com.unity3d.scar.adapter.common.a.a(this.f44714d));
                    break;
                } else {
                    ((R6.c) obj2).show(activity, ((j) ((b) this.f44717g)).f44739e);
                    break;
                }
        }
    }

    @Override // rb.a
    public final void c(C4476g c4476g) {
        switch (this.f44727h) {
            case 0:
                I6.a.load(this.f44713c, this.f44714d.f41002c, c4476g, ((h) ((b) this.f44717g)).f44732d);
                break;
            default:
                R6.c.load(this.f44713c, this.f44714d.f41002c, c4476g, ((j) ((b) this.f44717g)).f44738d);
                break;
        }
    }
}
