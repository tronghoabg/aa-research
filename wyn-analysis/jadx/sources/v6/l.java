package v6;

import android.view.WindowManager;
import androidx.fragment.app.X;
import kotlin.jvm.internal.AbstractC3340k;
import o1.C3641c;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import zg.C4668g;
import zg.InterfaceC4664c;
import zg.InterfaceC4667f;
import zg.Q;

/* loaded from: classes3.dex */
public class l implements k, InterfaceC4667f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f46890a;

    public /* synthetic */ l(Object obj) {
        this.f46890a = obj;
    }

    @Override // v6.k
    public void a(C3641c c3641c) {
        c3641c.d(((WindowManager) this.f46890a).getDefaultDisplay());
    }

    public void c(boolean z2) {
        ((WebSettingsBoundaryInterface) this.f46890a).setPaymentRequestEnabled(z2);
    }

    @Override // zg.InterfaceC4667f
    public void onFailure(InterfaceC4664c interfaceC4664c, Throwable th) {
        ((C4668g) this.f46890a).completeExceptionally(th);
    }

    @Override // zg.InterfaceC4667f
    public void onResponse(InterfaceC4664c interfaceC4664c, Q q4) {
        ((C4668g) this.f46890a).complete(q4);
    }

    public l(X serializer) {
        AbstractC3340k.e(serializer, "serializer");
        this.f46890a = serializer;
    }

    @Override // v6.k
    public void b() {
    }
}
