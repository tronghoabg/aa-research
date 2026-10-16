package Hf;

import Ef.C0502n;
import If.AbstractC0621b;
import If.AbstractC0623d;
import jf.InterfaceC3103c;

/* loaded from: classes5.dex */
public final class l0 extends AbstractC0623d {

    /* renamed from: a, reason: collision with root package name */
    public long f5157a;

    /* renamed from: b, reason: collision with root package name */
    public C0502n f5158b;

    @Override // If.AbstractC0623d
    public final boolean a(AbstractC0621b abstractC0621b) {
        j0 j0Var = (j0) abstractC0621b;
        if (this.f5157a >= 0) {
            return false;
        }
        long j8 = j0Var.f5150i;
        if (j8 < j0Var.f5151j) {
            j0Var.f5151j = j8;
        }
        this.f5157a = j8;
        return true;
    }

    @Override // If.AbstractC0623d
    public final InterfaceC3103c[] b(AbstractC0621b abstractC0621b) {
        long j8 = this.f5157a;
        this.f5157a = -1L;
        this.f5158b = null;
        return ((j0) abstractC0621b).u(j8);
    }
}
