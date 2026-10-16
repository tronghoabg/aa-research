package com.google.android.libraries.phenotype.client.stable;

import android.net.Uri;
import com.google.d.m.a.bm;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final /* synthetic */ class am implements com.google.d.m.a.ag {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f6056a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f6057b;

    public /* synthetic */ am(Object obj, int i2) {
        this.f6057b = i2;
        this.f6056a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [com.google.android.libraries.e.b.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v24, types: [com.google.d.b.t, java.lang.Object] */
    @Override // com.google.d.m.a.ag
    public final bm apply(Object obj) throws Throwable {
        switch (this.f6057b) {
            case 0:
                return ((ay) this.f6056a).c((ba) obj);
            case 1:
                return ((ay) this.f6056a).c((ba) obj);
            case 2:
                return com.google.d.m.a.bd.j((bm) ((bh) this.f6056a).f6121f.get());
            case 3:
                return this.f6056a.c();
            case 4:
                return com.google.android.libraries.e.b.r.f((com.google.android.libraries.e.b.r) this.f6056a, obj);
            case 5:
                com.google.android.libraries.e.b.r rVar = (com.google.android.libraries.e.b.r) this.f6056a;
                return com.google.d.m.a.bd.h(rVar.o((Uri) com.google.d.m.a.bd.o(rVar.f5892b)));
            case 6:
                return com.google.android.libraries.e.b.r.c((com.google.android.libraries.e.b.r) this.f6056a, (Uri) obj);
            case 7:
                return com.google.android.libraries.e.b.r.k((com.google.android.libraries.e.b.r) this.f6056a);
            case 8:
                return com.google.d.m.a.bd.h(this.f6056a.apply(obj));
            case 9:
                return ((com.google.android.libraries.e.b.x) this.f6056a).f5915d.c();
            case 10:
                return ((com.google.android.libraries.e.b.x) this.f6056a).f5919h.l();
            default:
                Object obj2 = this.f6056a;
                ((IOException) obj2).addSuppressed((IOException) obj);
                throw ((Throwable) obj2);
        }
    }
}
