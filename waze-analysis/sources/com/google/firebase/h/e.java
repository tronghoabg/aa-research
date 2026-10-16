package com.google.firebase.h;

import android.content.Context;
import android.os.Trace;
import com.google.firebase.components.ae;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements com.google.firebase.components.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f9907a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9908b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f9909c;

    public /* synthetic */ e(ae aeVar, ae aeVar2, int i2) {
        this.f9909c = i2;
        this.f9908b = aeVar;
        this.f9907a = aeVar2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.firebase.h.f, java.lang.Object] */
    @Override // com.google.firebase.components.g
    public final Object a(com.google.firebase.components.d dVar) {
        int i2 = this.f9909c;
        if (i2 == 0) {
            return new d((String) this.f9907a, this.f9908b.a((Context) dVar.f(Context.class)));
        }
        if (i2 == 1) {
            return new com.google.firebase.appcheck.playintegrity.a.e((com.google.firebase.e) dVar.f(com.google.firebase.e.class), (Executor) dVar.e((ae) this.f9908b), (Executor) dVar.e((ae) this.f9907a));
        }
        Object obj = this.f9908b;
        try {
            Trace.beginSection((String) this.f9907a);
            return ((com.google.firebase.components.c) obj).i().a(dVar);
        } finally {
            Trace.endSection();
        }
    }

    public /* synthetic */ e(String str, Object obj, int i2) {
        this.f9909c = i2;
        this.f9907a = str;
        this.f9908b = obj;
    }
}
