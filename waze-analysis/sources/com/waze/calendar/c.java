package com.waze.calendar;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    int f18752a;

    /* renamed from: b, reason: collision with root package name */
    Object f18753b;

    /* renamed from: c, reason: collision with root package name */
    Object f18754c;

    /* renamed from: d, reason: collision with root package name */
    Object f18755d;

    /* renamed from: e, reason: collision with root package name */
    int f18756e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f18757f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f18758g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f18759h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ String f18760i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ p f18761j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(e eVar, int i2, int i3, String str, p pVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f18757f = eVar;
        this.f18758g = i2;
        this.f18759h = i3;
        this.f18760i = str;
        this.f18761j = pVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f18757f, this.f18758g, this.f18759h, this.f18760i, this.f18761j, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0132  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0128 -> B:26:0x012a). Please report as a decompilation issue!!! */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.calendar.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
