package com.waze.ui.af;

import androidx.compose.runtime.Composer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class ae implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41812b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41813c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f41814d;

    public /* synthetic */ ae(Object obj, Object obj2, int i2, int i3) {
        this.f41814d = i3;
        this.f41812b = obj;
        this.f41813c = obj2;
        this.f41811a = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [androidx.compose.ui.Modifier, java.lang.Object] */
    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f41814d;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f41811a;
            ?? r0 = this.f41813c;
            return ap.s(this.f41812b, r0, i3, (Composer) obj);
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f41811a;
            ?? r02 = this.f41813c;
            return ap.q(this.f41812b, r02, i4, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i5 = this.f41811a;
        Object obj3 = this.f41813c;
        return ap.v(this.f41812b, (String) obj3, i5, (Composer) obj);
    }
}
