package g3;

import A6.h;
import Ef.C0502n;
import Wf.AbstractC1258p;
import android.adservices.measurement.MeasurementManager;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import com.applovin.impl.T0;
import ef.C2515C;
import g1.C2666b;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: g3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2697b {

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f35706a;

    public C2697b(Context context) {
        AbstractC3340k.e(context, "context");
        Object systemService = context.getSystemService((Class<Object>) AbstractC1258p.z());
        AbstractC3340k.d(systemService, "context.getSystemService…:class.java\n            )");
        this.f35706a = AbstractC1258p.c(systemService);
    }

    @Nullable
    public Object a(@NotNull AbstractC2696a abstractC2696a, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        new C0502n(1, h.A(interfaceC3103c)).t();
        AbstractC1258p.k();
        throw null;
    }

    @Nullable
    public Object b(@NotNull InterfaceC3103c<? super Integer> interfaceC3103c) {
        C0502n c0502n = new C0502n(1, h.A(interfaceC3103c));
        c0502n.t();
        this.f35706a.getMeasurementApiStatus(new T0(1), new C2666b(c0502n));
        Object objS = c0502n.s();
        kf.a aVar = kf.a.f39711a;
        return objS;
    }

    @Nullable
    public Object c(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        C0502n c0502n = new C0502n(1, h.A(interfaceC3103c));
        c0502n.t();
        this.f35706a.registerSource(uri, inputEvent, new T0(1), new C2666b(c0502n));
        Object objS = c0502n.s();
        return objS == kf.a.f39711a ? objS : C2515C.f34653a;
    }

    @Nullable
    public Object d(@NotNull Uri uri, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        C0502n c0502n = new C0502n(1, h.A(interfaceC3103c));
        c0502n.t();
        this.f35706a.registerTrigger(uri, new T0(1), new C2666b(c0502n));
        Object objS = c0502n.s();
        return objS == kf.a.f39711a ? objS : C2515C.f34653a;
    }

    @Nullable
    public Object e(@NotNull AbstractC2698c abstractC2698c, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        new C0502n(1, h.A(interfaceC3103c)).t();
        AbstractC1258p.A();
        throw null;
    }

    @Nullable
    public Object f(@NotNull AbstractC2699d abstractC2699d, @NotNull InterfaceC3103c<? super C2515C> interfaceC3103c) {
        new C0502n(1, h.A(interfaceC3103c)).t();
        AbstractC1258p.D();
        throw null;
    }
}
