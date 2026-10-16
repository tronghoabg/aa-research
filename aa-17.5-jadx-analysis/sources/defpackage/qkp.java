package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes.dex */
public abstract class qkp extends mox {
    private static final yph c = yph.c("GH.PassengerMode");
    public boolean a;
    public boolean b;

    @Override // defpackage.mox
    @ResultIgnorabilityUnspecified
    public final eqj a() {
        return ((xfj) f()).e;
    }

    @Override // defpackage.lhg
    public void c() {
        throw null;
    }

    @Override // defpackage.lhg
    public final void d() {
        if (this.b) {
            this.b = false;
            xfj xfjVar = (xfj) f();
            kio.b().w(xfjVar.f);
            if (xfjVar.c) {
                xfjVar.a();
            }
            sab sabVar = xfjVar.d;
            if (sabVar != null) {
                sabVar.h(xfjVar.b);
            }
            xfjVar.e.m(mow.c);
            this.a = false;
        }
    }

    @Override // defpackage.mox
    public final void e() {
        wer.c();
        if (this.a || !this.b) {
            return;
        }
        ((ype) ((ype) c.f()).ai((char) 7497)).u("enablePassengerMode()");
        this.a = true;
    }

    protected abstract qkq f();
}
