package u0;

import A7.C0237b0;
import N.C0713a0;
import android.view.View;
import androidx.lifecycle.EnumC1449m;
import androidx.lifecycle.InterfaceC1455t;
import androidx.lifecycle.InterfaceC1457v;
import ef.C2515C;
import java.util.ArrayList;
import jf.InterfaceC3103c;

/* loaded from: classes.dex */
public final class G0 implements InterfaceC1455t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Kd.a f46110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0713a0 f46111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N.p0 f46112c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f46113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f46114e;

    public G0(Kd.a aVar, C0713a0 c0713a0, N.p0 p0Var, kotlin.jvm.internal.G g9, View view) {
        this.f46110a = aVar;
        this.f46111b = c0713a0;
        this.f46112c = p0Var;
        this.f46113d = g9;
        this.f46114e = view;
    }

    @Override // androidx.lifecycle.InterfaceC1455t
    public final void onStateChanged(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) {
        int i5 = D0.f46097a[enumC1449m.ordinal()];
        if (i5 == 1) {
            Kd.a aVar = this.f46110a;
            Ef.F f10 = Ef.F.f3663a;
            Ef.H.D(aVar, null, new F0(this.f46113d, this.f46112c, interfaceC1457v, this, this.f46114e, null), 1);
            return;
        }
        if (i5 != 2) {
            if (i5 != 3) {
                if (i5 != 4) {
                    return;
                }
                this.f46112c.w();
                return;
            } else {
                C0713a0 c0713a0 = this.f46111b;
                if (c0713a0 != null) {
                    c0713a0.a();
                    return;
                }
                return;
            }
        }
        C0713a0 c0713a02 = this.f46111b;
        if (c0713a02 != null) {
            C0237b0 c0237b0 = c0713a02.f7743b;
            synchronized (c0237b0.f813c) {
                try {
                    if (c0237b0.q()) {
                        return;
                    }
                    ArrayList arrayList = (ArrayList) c0237b0.f814d;
                    c0237b0.f814d = (ArrayList) c0237b0.f815e;
                    c0237b0.f815e = arrayList;
                    c0237b0.f812b = true;
                    int size = arrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((InterfaceC3103c) arrayList.get(i10)).resumeWith(C2515C.f34653a);
                    }
                    arrayList.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
