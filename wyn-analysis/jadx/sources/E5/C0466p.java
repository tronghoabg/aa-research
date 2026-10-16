package E5;

import U1.C0839i;
import android.content.Context;
import android.media.AudioManager;
import com.unity3d.services.core.device.MimeTypes;
import f6.C2600m;
import java.util.HashMap;
import k2.C3164v;
import k8.InterfaceC3207p;

/* renamed from: E5.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0466p implements InterfaceC3207p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f3495b;

    public /* synthetic */ C0466p(Context context, int i5) {
        this.f3494a = i5;
        this.f3495b = context;
    }

    private final Object a() {
        o2.g gVar;
        Context context = this.f3495b;
        l8.e0 e0Var = o2.g.f41288n;
        synchronized (o2.g.class) {
            try {
                if (o2.g.f41294t == null) {
                    Lc.b bVar = new Lc.b(context, 3);
                    o2.g.f41294t = new o2.g((Context) bVar.f7076c, (HashMap) bVar.f7077d, bVar.f7075b, (Q1.q) bVar.f7078e, bVar.f7074a);
                }
                gVar = o2.g.f41294t;
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    @Override // k8.InterfaceC3207p
    public final Object get() {
        t6.p pVar;
        switch (this.f3494a) {
            case 0:
                return new C0463m(this.f3495b);
            case 1:
                return new C2600m(new t6.q(this.f3495b, 0), new J5.i());
            case 2:
                return new r6.l(this.f3495b);
            case 3:
                Context context = this.f3495b;
                l8.e0 e0Var = t6.p.f45887n;
                synchronized (t6.p.class) {
                    try {
                        if (t6.p.f45893t == null) {
                            Lc.b bVar = new Lc.b(context, 4);
                            t6.p.f45893t = new t6.p((Context) bVar.f7076c, (HashMap) bVar.f7077d, bVar.f7075b, (u6.q) bVar.f7078e, bVar.f7074a);
                        }
                        pVar = t6.p.f45893t;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return pVar;
            case 4:
                AudioManager audioManager = (AudioManager) this.f3495b.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                audioManager.getClass();
                return audioManager;
            case 5:
                return new C3164v(this.f3495b, new s2.k());
            case 6:
                return new n2.o(this.f3495b);
            case 7:
                return a();
            case 8:
                return new C0839i(this.f3495b);
            default:
                return new C3164v(this.f3495b, new s2.k());
        }
    }
}
