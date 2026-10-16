package com.waze.bw.c.d;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.MutableState;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class o extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f18148a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f18149b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f18150c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ int f18151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(l lVar, ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18151d = i2;
        this.f18149b = lVar;
        this.f18150c = modalBottomSheetState;
    }

    /* JADX WARN: Type inference failed for: r7v12, types: [androidx.compose.runtime.MutableState, java.lang.Object] */
    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f18151d;
        if (i2 == 0) {
            return new o((l) this.f18149b, (com.waze.z.a.b.ab) this.f18150c, eVar, 0);
        }
        if (i2 == 1) {
            return new o((l) this.f18149b, (com.waze.z.a.b.ab) this.f18150c, eVar, 1, (byte[]) null);
        }
        if (i2 == 2) {
            return new o((l) this.f18149b, (com.waze.z.a.b.ab) this.f18150c, eVar, 2, (char[]) null);
        }
        if (i2 == 3) {
            return new o((com.waze.z.a.b.ab) this.f18149b, (ModalBottomSheetState) this.f18150c, eVar, 3);
        }
        if (i2 == 4) {
            return new o((com.waze.z.a.b.ab) this.f18149b, (LazyListState) this.f18150c, eVar, 4);
        }
        Object obj2 = this.f18149b;
        if (i2 != 5) {
            return new o((com.waze.z.a.b.ab) obj2, (MutableState) this.f18150c, eVar, 6);
        }
        return new o((l) obj2, (ModalBottomSheetState) this.f18150c, eVar, 5);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i2 = this.f18151d;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? ((o) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((o) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((o) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((o) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((o) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((o) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a) : ((o) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
    
        if (r3.show(r5) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0090, code lost:
    
        if (r6.hide(r5) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017d, code lost:
    
        if (((com.waze.z.a.b.ab) r6).k(r5) != r0) goto L83;
     */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.bw.c.d.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(l lVar, com.waze.z.a.b.ab abVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18151d = i2;
        this.f18149b = lVar;
        this.f18150c = abVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(l lVar, com.waze.z.a.b.ab abVar, h.c.e eVar, int i2, byte[] bArr) {
        super(2, eVar);
        this.f18151d = i2;
        this.f18149b = lVar;
        this.f18150c = abVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(l lVar, com.waze.z.a.b.ab abVar, h.c.e eVar, int i2, char[] cArr) {
        super(2, eVar);
        this.f18151d = i2;
        this.f18149b = lVar;
        this.f18150c = abVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(com.waze.z.a.b.ab abVar, LazyListState lazyListState, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18151d = i2;
        this.f18149b = abVar;
        this.f18150c = lazyListState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(com.waze.z.a.b.ab abVar, ModalBottomSheetState modalBottomSheetState, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18151d = i2;
        this.f18149b = abVar;
        this.f18150c = modalBottomSheetState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(com.waze.z.a.b.ab abVar, MutableState mutableState, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f18151d = i2;
        this.f18149b = abVar;
        this.f18150c = mutableState;
    }
}
