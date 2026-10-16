package com.google.android.gms.l;

import com.google.android.gms.common.api.internal.bf;
import com.google.android.gms.o.w;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class p implements bf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5636a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f5637b;

    public /* synthetic */ p(Object obj, int i2) {
        this.f5637b = i2;
        this.f5636a = obj;
    }

    @Override // com.google.android.gms.common.api.internal.bf
    public final void a(Object obj, Object obj2) {
        int i2 = this.f5637b;
        if (i2 == 0) {
            int i3 = v.f5645a;
            ((com.google.android.gms.l.a.g) ((com.google.android.gms.l.a.h) obj).y()).a(new u((w) obj2), (String) this.f5636a);
        } else if (i2 != 1) {
            int i4 = v.f5645a;
            ((com.google.android.gms.l.a.g) ((com.google.android.gms.l.a.h) obj).y()).b(new u((w) obj2), ((com.google.v.c) this.f5636a).toByteArray());
        } else {
            ((com.google.android.gms.l.a.g) ((com.google.android.gms.l.a.h) obj).y()).c(new r((v) this.f5636a, (w) obj2));
        }
    }
}
