package ud;

import com.google.protobuf.MessageLite;
import md.AbstractC3537e;
import md.b0;
import md.k0;
import md.m0;
import p8.m;

/* loaded from: classes5.dex */
public final class d extends AbstractC3537e {

    /* renamed from: d, reason: collision with root package name */
    public final a f46779d;

    /* renamed from: e, reason: collision with root package name */
    public MessageLite f46780e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46781f = false;

    public d(a aVar) {
        this.f46779d = aVar;
    }

    @Override // md.AbstractC3537e
    public final void i(k0 k0Var, b0 b0Var) {
        boolean zF = k0Var.f();
        a aVar = this.f46779d;
        if (!zF) {
            aVar.j(new m0(k0Var, b0Var));
            return;
        }
        if (!this.f46781f) {
            aVar.j(new m0(k0.f40681m.h("No value received for unary call"), b0Var));
        }
        Object obj = this.f46780e;
        if (obj == null) {
            obj = m.f43294g;
        }
        if (m.f43293f.i(aVar, null, obj)) {
            m.c(aVar, false);
        }
    }

    @Override // md.AbstractC3537e
    public final void l(MessageLite messageLite) {
        if (this.f46781f) {
            throw k0.f40681m.h("More than one value received for unary call").a();
        }
        this.f46780e = messageLite;
        this.f46781f = true;
    }

    @Override // md.AbstractC3537e
    public final void k(b0 b0Var) {
    }
}
