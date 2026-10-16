package A7;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class Z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f786a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f787b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P0 f788c;

    public /* synthetic */ Z0(P0 p02, long j8, int i5) {
        this.f786a = i5;
        this.f787b = j8;
        this.f788c = p02;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f786a) {
            case 0:
                P0 p02 = this.f788c;
                C0234a0 c0234a0 = p02.a0().f771l;
                long j8 = this.f787b;
                c0234a0.f(j8);
                N nZzj = p02.zzj();
                nZzj.f611m.d("Session timeout duration set", Long.valueOf(j8));
                break;
            default:
                P0 p03 = this.f788c;
                p03.l0(this.f787b, true);
                ((C0273n0) p03.f421a).m().n0(new AtomicReference());
                break;
        }
    }
}
