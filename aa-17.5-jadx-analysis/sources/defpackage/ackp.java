package defpackage;

/* loaded from: classes.dex */
public final class ackp implements ackr {
    private acku a;

    public static void b(ackp ackpVar, acku ackuVar) {
        if (ackpVar.a != null) {
            throw new IllegalStateException();
        }
        ackpVar.a = ackuVar;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final Object a() {
        acku ackuVar = this.a;
        if (ackuVar != null) {
            return ackuVar.a();
        }
        throw new IllegalStateException();
    }
}
