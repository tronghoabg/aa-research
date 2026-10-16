package com.waze.reports_v2.a.b;

import com.waze.config.ConfigValues;
import com.waze.reports_v2.c.bv;
import com.waze.reports_v2.c.bw;
import h.g.b.x;
import java.util.Iterator;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements bw {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.config.d f34000a = ConfigValues.CONFIG_VALUE_REPORTING_CONVERSATIONAL_REPORTING_USER_ENABLED_STATE;

    /* JADX INFO: Access modifiers changed from: private */
    public static final bv f(String str) {
        Object next;
        Iterator<E> it = bv.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x.n(((bv) next).a(), str)) {
                break;
            }
        }
        bv bvVar = (bv) next;
        return bvVar == null ? bv.f34293a : bvVar;
    }

    @Override // com.waze.reports_v2.c.bw
    public final bv a() {
        return f(this.f34000a.b());
    }

    @Override // com.waze.reports_v2.c.bw
    public final k b() {
        k kVarK = this.f34000a.k();
        x.e(kVarK, "getFlow(...)");
        return new d(kVarK, this);
    }

    @Override // com.waze.reports_v2.c.bw
    public final void c() {
        this.f34000a.d(bv.f34294b.a());
    }

    @Override // com.waze.reports_v2.c.bw
    public final void d() {
        this.f34000a.d(bv.f34295c.a());
    }
}
