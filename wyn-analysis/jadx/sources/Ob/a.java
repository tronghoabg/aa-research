package Ob;

import A7.C0237b0;
import android.content.Context;
import qc.C3884a;
import qc.InterfaceC3885b;
import uc.C4281r;
import uc.InterfaceC4279p;

/* loaded from: classes5.dex */
public class a implements InterfaceC3885b, InterfaceC4279p {

    /* renamed from: b, reason: collision with root package name */
    public static C0237b0 f8944b;

    /* renamed from: a, reason: collision with root package name */
    public Context f8945a;

    @Override // qc.InterfaceC3885b
    public final void onAttachedToEngine(C3884a c3884a) {
        this.f8945a = c3884a.f44186a;
        new C4281r(c3884a.f44188c, "safe_device").b(this);
    }

    @Override // qc.InterfaceC3885b
    public final void onDetachedFromEngine(C3884a c3884a) {
        this.f8945a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0294 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // uc.InterfaceC4279p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMethodCall(uc.C4278o r12, uc.InterfaceC4280q r13) {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ob.a.onMethodCall(uc.o, uc.q):void");
    }
}
