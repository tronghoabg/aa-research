package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nok {
    public final Object a;

    public nok(erb erbVar) {
        this.a = new swe();
        ((swe) erbVar.a).n(new svl(new ykd(this, null)));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection] */
    public final /* synthetic */ void a(eqj eqjVar, Object obj) {
        eqjVar.getClass();
        afco afcoVar = tby.a;
        this.a.add(new aezu(eqjVar, new eqm(obj)));
    }

    public final void b(Exception exc) {
        ((swe) this.a).o(exc);
    }

    public final void c(Object obj) {
        ((swe) this.a).p(obj);
    }

    @ResultIgnorabilityUnspecified
    public final void d(Exception exc) {
        if (exc == null) {
            throw new NullPointerException("Exception must not be null");
        }
        Object obj = this.a;
        swe sweVar = (swe) obj;
        synchronized (sweVar.a) {
            if (((swe) obj).b) {
                return;
            }
            ((swe) obj).b = true;
            ((swe) obj).d = exc;
            sweVar.e.h((svz) obj);
        }
    }

    @ResultIgnorabilityUnspecified
    public final void e(Object obj) {
        ((swe) this.a).q(obj);
    }

    public nok(byte[] bArr) {
        this.a = new byw(new odc[16]);
    }

    public nok(byte[] bArr, byte[] bArr2) {
        this.a = new swe();
    }

    public nok() {
        this.a = new lsg(5);
    }

    public nok(char[] cArr) {
        this.a = new ArrayList();
    }
}
