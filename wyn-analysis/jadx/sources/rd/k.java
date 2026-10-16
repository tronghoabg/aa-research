package Rd;

import ef.C2529m;
import ef.C2530n;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import lf.InterfaceC3465d;

/* loaded from: classes5.dex */
public final class k implements InterfaceC3103c, InterfaceC3465d {

    /* renamed from: a, reason: collision with root package name */
    public int f10606a = Integer.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f10607b;

    public k(l lVar) {
        this.f10607b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [jf.c[]] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // lf.InterfaceC3465d
    public final InterfaceC3465d getCallerFrame() {
        j jVar = j.f10605a;
        int i5 = this.f10606a;
        l lVar = this.f10607b;
        if (i5 == Integer.MIN_VALUE) {
            this.f10606a = lVar.f10612f;
        }
        int i10 = this.f10606a;
        if (i10 < 0) {
            this.f10606a = Integer.MIN_VALUE;
            jVar = null;
        } else {
            try {
                ?? r22 = lVar.f10611e[i10];
                if (r22 != 0) {
                    this.f10606a = i10 - 1;
                    jVar = r22;
                }
            } catch (Throwable unused) {
            }
        }
        if (jVar instanceof InterfaceC3465d) {
            return jVar;
        }
        return null;
    }

    @Override // jf.InterfaceC3103c
    public final InterfaceC3108h getContext() {
        l lVar = this.f10607b;
        InterfaceC3103c[] interfaceC3103cArr = lVar.f10611e;
        int i5 = lVar.f10612f;
        InterfaceC3103c interfaceC3103c = interfaceC3103cArr[i5];
        if (interfaceC3103c != this && interfaceC3103c != null) {
            return interfaceC3103c.getContext();
        }
        int i10 = i5 - 1;
        while (i10 >= 0) {
            int i11 = i10 - 1;
            InterfaceC3103c interfaceC3103c2 = lVar.f10611e[i10];
            if (interfaceC3103c2 != this && interfaceC3103c2 != null) {
                return interfaceC3103c2.getContext();
            }
            i10 = i11;
        }
        throw new IllegalStateException("Not started");
    }

    @Override // jf.InterfaceC3103c
    public final void resumeWith(Object obj) {
        boolean z2 = obj instanceof C2529m;
        l lVar = this.f10607b;
        if (!z2) {
            lVar.f(false);
            return;
        }
        Throwable thA = C2530n.a(obj);
        AbstractC3340k.b(thA);
        lVar.g(Fe.e.z(thA));
    }
}
