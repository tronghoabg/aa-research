package com.google.android.gms.auth.a.b.a;

import com.google.android.gms.auth.api.identity.a.n;
import com.google.android.gms.auth.api.identity.a.o;
import com.google.android.gms.common.api.internal.bf;
import com.google.android.gms.common.internal.b.l;
import com.google.android.gms.common.internal.bi;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.o.w;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements bf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4412a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f4413b;

    public /* synthetic */ c(Object obj, int i2) {
        this.f4413b = i2;
        this.f4412a = obj;
    }

    @Override // com.google.android.gms.common.api.internal.bf
    public final void a(Object obj, Object obj2) {
        int i2 = this.f4413b;
        if (i2 == 0) {
            int i3 = e.f4414a;
            ((b) ((f) obj).y()).b((com.google.android.gms.auth.a.b.a) this.f4412a, new a((w) obj2, 1, (byte[]) null));
            return;
        }
        if (i2 == 1) {
            n.c((n) this.f4412a, (o) obj, (w) obj2);
            return;
        }
        if (i2 == 2) {
            int i4 = e.f4414a;
            ((b) ((f) obj).y()).a((com.google.android.gms.auth.a.b.b) this.f4412a, new a((w) obj2, 0));
            return;
        }
        if (i2 == 3) {
            int i5 = e.f4414a;
            ((b) ((f) obj).y()).c((com.google.android.gms.auth.a.b.d) this.f4412a, new a((w) obj2, 2, (char[]) null));
        } else if (i2 == 4) {
            ((com.google.android.gms.common.internal.b.c) ((com.google.android.gms.common.internal.b.a) obj).y()).a((com.google.android.gms.common.internal.n) this.f4412a);
            ((w) obj2).c(null);
        } else if (i2 != 5) {
            ((com.google.android.gms.common.internal.b.d) ((l) obj).y()).a((bi) this.f4412a);
            ((w) obj2).c(null);
        } else {
            ((com.google.android.gms.common.internal.b.e) ((com.google.android.gms.common.internal.b.b) obj).y()).a((r) this.f4412a);
            ((w) obj2).c(null);
        }
    }
}
