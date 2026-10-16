package com.google.firebase.crashlytics.a.c;

import java.util.concurrent.CountDownLatch;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class aw implements com.google.android.gms.o.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f9157a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f9158b;

    public /* synthetic */ aw(Object obj, int i2) {
        this.f9158b = i2;
        this.f9157a = obj;
    }

    @Override // com.google.android.gms.o.a
    public final Object a(com.google.android.gms.o.t tVar) {
        int i2 = this.f9158b;
        if (i2 == 0) {
            int i3 = ay.f9162a;
            boolean zK = tVar.k();
            Object obj = this.f9157a;
            if (zK) {
                ((com.google.android.gms.o.w) obj).c(tVar.g());
            } else if (tVar.f() != null) {
                ((com.google.android.gms.o.w) obj).b(tVar.f());
            }
            return null;
        }
        if (i2 == 1) {
            int i4 = ay.f9162a;
            boolean zK2 = tVar.k();
            Object obj2 = this.f9157a;
            if (zK2) {
                ((com.google.android.gms.o.w) obj2).e(tVar.g());
            } else if (tVar.f() != null) {
                ((com.google.android.gms.o.w) obj2).d(tVar.f());
            }
            return null;
        }
        if (i2 == 2) {
            int i5 = ay.f9162a;
            ((CountDownLatch) this.f9157a).countDown();
            return null;
        }
        if (i2 != 3) {
            return Boolean.valueOf(com.google.firebase.remoteconfig.b.f((com.google.firebase.remoteconfig.b) this.f9157a, tVar));
        }
        int i6 = ay.f9162a;
        boolean zK3 = tVar.k();
        Object obj3 = this.f9157a;
        if (zK3) {
            ((com.google.android.gms.o.w) obj3).e(tVar.g());
        } else if (tVar.f() != null) {
            ((com.google.android.gms.o.w) obj3).d(tVar.f());
        }
        return null;
    }
}
