package com.waze.z.a.b;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.waze.z.a.ae;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class i implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45744a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f45745b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f45746c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f45747d;

    public /* synthetic */ i(Object obj, int i2, int i3, int i4) {
        this.f45747d = i4;
        this.f45746c = obj;
        this.f45744a = i2;
        this.f45745b = i3;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.List] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f45747d;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f45745b;
            int i4 = this.f45744a;
            return y.f((k) this.f45746c, i4, i3, (Composer) obj);
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f45744a | 1);
            int i5 = this.f45745b;
            com.waze.design_components.g.b.g(this.f45746c, (Composer) obj, iUpdateChangedFlags, i5);
            return h.ab.f48028a;
        }
        ae aeVar = (ae) obj;
        int iIntValue = ((Integer) obj2).intValue();
        h.g.b.x.f(aeVar, "anchor");
        ?? r0 = this.f45746c;
        if (aeVar == ae.f45620b) {
            r0.invoke(Integer.valueOf(this.f45744a));
        } else if (iIntValue == this.f45745b) {
            r0.invoke(-1);
        }
        return h.ab.f48028a;
    }
}
