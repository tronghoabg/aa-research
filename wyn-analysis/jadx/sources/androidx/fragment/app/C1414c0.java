package androidx.fragment.app;

import java.util.ArrayList;

/* renamed from: androidx.fragment.app.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1414c0 implements InterfaceC1412b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18385a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f18387c;

    public C1414c0(e0 e0Var, int i5, int i10) {
        this.f18387c = e0Var;
        this.f18385a = i5;
        this.f18386b = i10;
    }

    @Override // androidx.fragment.app.InterfaceC1412b0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        e0 e0Var = this.f18387c;
        F f10 = e0Var.f18431y;
        int i5 = this.f18385a;
        if (f10 == null || i5 >= 0 || !f10.getChildFragmentManager().Q(-1, 0)) {
            return e0Var.R(arrayList, arrayList2, i5, this.f18386b);
        }
        return false;
    }
}
