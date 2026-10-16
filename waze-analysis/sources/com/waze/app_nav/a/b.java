package com.waze.app_nav.a;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import com.waze.shared_infra.coordinators.s;
import java.util.UUID;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class b<T extends com.waze.shared_infra.coordinators.s<?>> extends android.support.v4.app.ar implements com.waze.shared_infra.coordinators.f, org.a.d.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f15126a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f15127b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f15128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i2, String str) {
        super(i2);
        h.g.b.x.f(str, "uuid");
        this.f15126a = str;
        this.f15127b = h.g.b(h.h.f48130a, new a((org.a.d.a.a) this, 1));
        this.f15128c = h.g.a(new a((Object) this, 0));
    }

    static final com.waze.shared_infra.coordinators.s bD(b bVar) {
        String string;
        Bundle arguments = bVar.getArguments();
        if (arguments == null || (string = arguments.getString("COORDINATOR_CONTROLLER_ID_KEY")) == null) {
            return null;
        }
        com.waze.shared_infra.coordinators.s sVarA = ((com.waze.shared_infra.coordinators.c) bVar.f15127b.getValue()).a(string);
        if (true != (sVarA instanceof com.waze.shared_infra.coordinators.s)) {
            return null;
        }
        return sVarA;
    }

    protected final com.waze.shared_infra.coordinators.s bE() {
        return (com.waze.shared_infra.coordinators.s) this.f15128c.getValue();
    }

    @Override // com.waze.shared_infra.coordinators.f
    public final Lifecycle getAndroidLifecycle() {
        Lifecycle lifecycle = getLifecycle();
        h.g.b.x.e(lifecycle, "<get-lifecycle>(...)");
        return lifecycle;
    }

    @Override // org.a.d.a.a
    public /* synthetic */ org.a.d.a getKoin() {
        return org.a.b.b.d.e();
    }

    @Override // com.waze.shared_infra.coordinators.f
    public final String getUuid() {
        return this.f15126a;
    }

    @Override // android.support.v4.app.ar
    public void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        view.setFocusable(true);
        view.setClickable(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(0, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ b(int i2, String str, int i3, h.g.b.o oVar) {
        if ((i3 & 2) != 0) {
            str = UUID.randomUUID().toString();
            h.g.b.x.e(str, "toString(...)");
        }
        this(i2, str);
    }
}
