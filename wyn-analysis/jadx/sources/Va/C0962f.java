package Va;

import android.view.View;

/* renamed from: Va.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0962f implements InterfaceC0987gb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14144a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14145b;

    public /* synthetic */ C0962f(int i5) {
        this.f14144a = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5 A[Catch: all -> 0x009d, TryCatch #1 {all -> 0x009d, blocks: (B:22:0x0087, B:24:0x0092, B:34:0x00a5, B:35:0x00b9, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:29:0x009c, B:32:0x009f, B:25:0x0096), top: B:53:0x0087, inners: #0 }] */
    @Override // Va.InterfaceC0987gb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r6) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Va.C0962f.a(android.view.View):void");
    }

    @Override // Va.InterfaceC0987gb
    public final void c(View view) {
        switch (this.f14144a) {
            case 0:
                C1001i c1001i = (C1001i) this.f14145b;
                view.removeOnLayoutChangeListener(C1001i.C(c1001i));
                int i5 = C1001i.f14273r + 59;
                C1001i.f14272q = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
                c1001i.f14278l.remove(view);
                return;
            default:
                return;
        }
    }

    private final void b(View view) {
    }
}
