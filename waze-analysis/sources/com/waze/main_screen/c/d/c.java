package com.waze.main_screen.c.d;

import androidx.compose.runtime.State;
import com.waze.ui.e.v;
import h.ab;
import h.c.b.a.g;
import h.g.a.p;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class c extends g implements p {

    /* renamed from: a, reason: collision with root package name */
    Object f26176a;

    /* renamed from: b, reason: collision with root package name */
    int f26177b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ boolean f26178c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ v f26179d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ State f26180e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(boolean z, v vVar, State state, h.c.e eVar) {
        super(2, eVar);
        this.f26178c = z;
        this.f26179d = vVar;
        this.f26180e = state;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new c(this.f26178c, this.f26179d, this.f26180e, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((c) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r8.f26179d.d(r8) == r0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        if (r8.f26179d.d(r8) == r0) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078 A[Catch: all -> 0x002a, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0020, B:12:0x0025, B:39:0x009b, B:17:0x0031, B:36:0x0087, B:25:0x0050, B:27:0x005e, B:34:0x0078, B:29:0x0068, B:31:0x006c), top: B:51:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b A[Catch: all -> 0x002a, TRY_LEAVE, TryCatch #0 {all -> 0x002a, blocks: (B:11:0x0020, B:12:0x0025, B:39:0x009b, B:17:0x0031, B:36:0x0087, B:25:0x0050, B:27:0x005e, B:34:0x0078, B:29:0x0068, B:31:0x006c), top: B:51:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    @Override // h.c.b.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.main_screen.c.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
