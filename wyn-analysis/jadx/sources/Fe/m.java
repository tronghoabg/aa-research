package Fe;

import A7.B0;
import E5.Q;
import Ef.E;
import Ef.H;
import Ef.S;
import ac.C1346a;
import androidx.fragment.app.X;
import com.qonversion.android.sdk.dto.products.QSubscriptionPeriod;
import ge.InterfaceC2753a;
import kotlin.jvm.internal.AbstractC3340k;
import qe.C3892a;

/* loaded from: classes5.dex */
public final class m extends B0 implements a {

    /* renamed from: b, reason: collision with root package name */
    public final Ce.a f4102b;

    /* renamed from: c, reason: collision with root package name */
    public final h f4103c;

    /* renamed from: d, reason: collision with root package name */
    public final C8.i f4104d;

    /* renamed from: e, reason: collision with root package name */
    public final X f4105e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2753a f4106f;

    /* renamed from: g, reason: collision with root package name */
    public final E f4107g;

    /* renamed from: h, reason: collision with root package name */
    public C3892a f4108h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Ce.a service, h hVar, C1346a logger, C8.i delegateProvider, X serializer, InterfaceC2753a actionMapper) {
        super(logger);
        Lf.e eVar = S.f3698a;
        Kd.a aVarC = H.c(Lf.d.f7120b);
        AbstractC3340k.e(service, "service");
        AbstractC3340k.e(logger, "logger");
        AbstractC3340k.e(delegateProvider, "delegateProvider");
        AbstractC3340k.e(serializer, "serializer");
        AbstractC3340k.e(actionMapper, "actionMapper");
        this.f4102b = service;
        this.f4103c = hVar;
        this.f4104d = delegateProvider;
        this.f4105e = serializer;
        this.f4106f = actionMapper;
        this.f4107g = aVarC;
    }

    public static final String e0(QSubscriptionPeriod.Unit unit) {
        int i5 = i.f4091a[unit.ordinal()];
        if (i5 == 1) {
            return "day";
        }
        if (i5 == 2) {
            return "week";
        }
        if (i5 == 3) {
            return "month";
        }
        if (i5 == 4) {
            return "year";
        }
        if (i5 == 5) {
            return null;
        }
        throw new Q((byte) 0, 9);
    }
}
