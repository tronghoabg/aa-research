package com.google.android.gms.auth.a.a;

import com.google.android.gms.common.api.internal.bf;
import com.google.android.gms.o.w;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements bf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f4402a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a.a f4403b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f4404c;

    public /* synthetic */ e(h hVar, com.google.android.gms.common.internal.a.a aVar, int i2) {
        this.f4404c = i2;
        this.f4402a = hVar;
        this.f4403b = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.bf
    public final void a(Object obj, Object obj2) {
        int i2 = this.f4404c;
        if (i2 == 0) {
            ((b) ((a) obj).y()).b(new d(this.f4402a, (w) obj2, 0), (com.google.android.gms.auth.a.h) this.f4403b);
        } else if (i2 != 1) {
            ((b) ((a) obj).y()).a(new g(this.f4402a, (w) obj2), (com.google.android.gms.auth.a.d) this.f4403b);
        } else {
            ((b) ((a) obj).y()).c(new d(this.f4402a, (w) obj2, 1, null), (com.google.android.gms.auth.a.a) this.f4403b);
        }
    }
}
