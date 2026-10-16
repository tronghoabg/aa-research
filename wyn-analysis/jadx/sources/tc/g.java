package tc;

import android.util.Log;
import q.C3828o;
import t6.q;
import uc.C4281r;
import uc.InterfaceC4280q;

/* loaded from: classes5.dex */
public final class g implements InterfaceC4280q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f46008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46009c;

    public /* synthetic */ g(int i5, Object obj, Object obj2) {
        this.f46007a = i5;
        this.f46009c = obj;
        this.f46008b = obj2;
    }

    @Override // uc.InterfaceC4280q
    public final void a(Object obj) {
        switch (this.f46007a) {
            case 0:
                ((C3828o) this.f46009c).f43849f = (byte[]) this.f46008b;
                break;
            default:
                ((mc.g) this.f46008b).a(((C4281r) ((q) this.f46009c).f45907b).f46763c.b(obj));
                break;
        }
    }

    @Override // uc.InterfaceC4280q
    public final void b(String str, String str2, Object obj) {
        switch (this.f46007a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((mc.g) this.f46008b).a(((C4281r) ((q) this.f46009c).f45907b).f46763c.f(str, str2, obj));
                break;
        }
    }

    @Override // uc.InterfaceC4280q
    public final void c() {
        switch (this.f46007a) {
            case 0:
                break;
            default:
                ((mc.g) this.f46008b).a(null);
                break;
        }
    }

    private final void d() {
    }
}
