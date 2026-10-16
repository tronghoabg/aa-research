package com.google.android.libraries.phenotype.client.stable;

import com.google.d.m.a.bm;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class ag implements com.google.d.m.a.ag {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6036b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f6037c;

    public /* synthetic */ ag(Object obj, Object obj2, int i2) {
        this.f6037c = i2;
        this.f6035a = obj;
        this.f6036b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.d.m.a.bm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.libraries.phenotype.client.stable.ar, java.lang.Object] */
    @Override // com.google.d.m.a.ag
    public final bm apply(Object obj) {
        int i2 = this.f6037c;
        if (i2 == 0) {
            ?? r3 = this.f6036b;
            ai aiVar = (ai) this.f6035a;
            return ((com.bumptech.glide.load.c.e.e) aiVar.f6043d.get()).h(new ah(aiVar, r3));
        }
        if (i2 != 1) {
            return com.google.android.libraries.e.b.r.e((com.google.android.libraries.e.b.r) this.f6035a, this.f6036b, obj);
        }
        return ae.d((com.google.android.libraries.phenotype.client.h) this.f6035a, (String) this.f6036b);
    }
}
