package androidx.lifecycle;

import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1458w {

    /* renamed from: a, reason: collision with root package name */
    public EnumC1450n f18688a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1455t f18689b;

    public final void a(InterfaceC1457v interfaceC1457v, EnumC1449m enumC1449m) {
        EnumC1450n enumC1450nA = enumC1449m.a();
        EnumC1450n state1 = this.f18688a;
        AbstractC3340k.e(state1, "state1");
        if (enumC1450nA.compareTo(state1) < 0) {
            state1 = enumC1450nA;
        }
        this.f18688a = state1;
        this.f18689b.onStateChanged(interfaceC1457v, enumC1449m);
        this.f18688a = enumC1450nA;
    }
}
