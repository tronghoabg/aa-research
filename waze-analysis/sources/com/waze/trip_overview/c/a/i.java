package com.waze.trip_overview.c.a;

import android.view.View;
import com.waze.trip_overview.aq;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class i extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f41218a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f41219b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f41220c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f41221d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(ab abVar, View view, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f41221d = i2;
        this.f41219b = abVar;
        this.f41220c = view;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f41221d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? new i(this.f41219b, (View) this.f41220c, eVar, 4, (short[]) null) : new i(this.f41219b, (aq) this.f41220c, eVar, 3) : new i(this.f41219b, (View) this.f41220c, eVar, 2, (char[]) null) : new i(this.f41219b, (View) this.f41220c, eVar, 1, (byte[]) null) : new i(this.f41219b, (View) this.f41220c, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f41221d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((i) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        if (r7 == r0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r7 == r0) goto L31;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.trip_overview.c.a.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(ab abVar, View view, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f41221d = i2;
        this.f41219b = abVar;
        this.f41220c = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(ab abVar, View view, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f41221d = i2;
        this.f41219b = abVar;
        this.f41220c = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(ab abVar, View view, h.c.e eVar, int i2, short[] sArr) {
        super(2, eVar);
        this.f41221d = i2;
        this.f41219b = abVar;
        this.f41220c = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(ab abVar, aq aqVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f41221d = i2;
        this.f41219b = abVar;
        this.f41220c = aqVar;
    }
}
