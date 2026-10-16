package com.waze.car_lib.b;

import android.content.BroadcastReceiver;
import androidx.car.app.CarContext;
import androidx.lifecycle.Lifecycle;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class as {

    /* renamed from: a, reason: collision with root package name */
    private final Object f18996a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f18997b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f18998c;

    public as() {
        this.f18996a = h.g.a(new l(18));
        this.f18998c = h.g.a(new l(19));
        this.f18997b = h.g.a(new l(20));
    }

    public static final /* synthetic */ BroadcastReceiver a(as asVar) {
        return (BroadcastReceiver) asVar.f18998c;
    }

    public static final /* synthetic */ ap b(as asVar) {
        return (ap) asVar.f18996a;
    }

    public final void d(CarContext carContext, Lifecycle lifecycle) {
        h.g.b.x.f(carContext, "carContext");
        h.g.b.x.f(lifecycle, "lifecycle");
        lifecycle.addObserver(new ar(carContext, this));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.f, java.lang.Object] */
    public final boolean e() {
        Object value = this.f18998c.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.f, java.lang.Object] */
    public final boolean f() {
        Object value = this.f18996a.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.f, java.lang.Object] */
    public final boolean g() {
        Object value = this.f18997b.getValue();
        h.g.b.x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    public as(ap apVar, com.waze.shared_infra.i.b bVar) {
        h.g.b.x.f(apVar, "alertPresenter");
        h.g.b.x.f(bVar, "exceptionReporter");
        this.f18996a = apVar;
        this.f18997b = bVar;
        this.f18998c = new aq(this);
    }
}
