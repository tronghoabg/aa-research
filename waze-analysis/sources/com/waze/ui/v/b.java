package com.waze.ui.v;

import androidx.compose.runtime.Composer;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h.g.a.a f43489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f43490b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f43491c;

    public /* synthetic */ b(h.g.a.a aVar, int i2, int i3) {
        this.f43491c = i3;
        this.f43489a = aVar;
        this.f43490b = i2;
    }

    @Override // h.g.a.p
    public final Object invoke(Object obj, Object obj2) {
        int i2 = this.f43491c;
        if (i2 == 0) {
            ((Integer) obj2).intValue();
            int i3 = this.f43490b;
            return f.g(this.f43489a, i3, (Composer) obj);
        }
        if (i2 == 1) {
            ((Integer) obj2).intValue();
            int i4 = this.f43490b;
            return f.f(this.f43489a, i4, (Composer) obj);
        }
        if (i2 != 2) {
            ((Integer) obj2).intValue();
            int i5 = this.f43490b;
            return f.b(this.f43489a, i5, (Composer) obj);
        }
        ((Integer) obj2).intValue();
        int i6 = this.f43490b;
        return f.e(this.f43489a, i6, (Composer) obj);
    }
}
