package com.google.android.libraries.phenotype.client;

import android.content.Context;
import com.google.android.libraries.phenotype.client.stable.ak;
import com.google.android.libraries.phenotype.client.stable.ar;
import com.google.android.libraries.phenotype.client.stable.bg;
import com.google.android.libraries.phenotype.client.stable.bh;
import com.google.d.b.aa;
import com.google.d.b.aj;
import com.google.d.b.an;
import com.google.d.m.a.bo;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements aj {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f5992a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f5993b;

    public /* synthetic */ e(Object obj, int i2) {
        this.f5993b = i2;
        this.f5992a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v22, types: [com.google.d.b.aj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.google.d.b.aj, java.lang.Object] */
    @Override // com.google.d.b.aj
    public final Object get() {
        switch (this.f5993b) {
            case 0:
                int i2 = h.f6000a;
                return new com.bumptech.glide.load.c.e.e(com.google.android.gms.l.l.a((Context) this.f5992a));
            case 1:
                int i3 = h.f6000a;
                f fVar = new f();
                fVar.d((Context) this.f5992a);
                return fVar.a();
            case 2:
                int i4 = h.f6000a;
                return new com.google.android.libraries.e.a.f(this.f5992a);
            case 3:
                int i5 = h.f6000a;
                return (ar) ((aa) this.f5992a.get()).e();
            case 4:
                return aa.i(new ak(((f) this.f5992a).f5995b));
            case 5:
                return f.c((f) this.f5992a);
            case 6:
                return bh.b((bh) this.f5992a);
            default:
                bo boVar = (bo) this.f5992a.get();
                an.B(boVar);
                return boVar.schedule(new bg(0), 10000L, TimeUnit.MILLISECONDS);
        }
    }
}
