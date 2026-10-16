package defpackage;

/* loaded from: classes2.dex */
public final class mlu {
    public final ryx a;
    public final ryv b;
    public final boolean c;
    private final boolean d;

    public mlu(ryx ryxVar, ryv ryvVar, boolean z, boolean z2) {
        this.a = ryxVar;
        this.b = ryvVar;
        this.d = z;
        this.c = z2;
    }

    static rel a() {
        rel relVar = new rel();
        relVar.f(false);
        relVar.d(false);
        ryu ryuVar = new ryu();
        ryuVar.b(false);
        ryuVar.c(0);
        ryuVar.e(0);
        ryuVar.f(0);
        ryuVar.d(0);
        relVar.e(ryuVar.a());
        relVar.e = ryx.b().a();
        return relVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mlu) {
            mlu mluVar = (mlu) obj;
            if (this.a.equals(mluVar.a) && this.b.equals(mluVar.b) && this.d == mluVar.d && this.c == mluVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.a() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        ryv ryvVar = this.b;
        return "ConnectionState{usbState=" + String.valueOf(this.a) + ", portStatus=" + String.valueOf(ryvVar) + ", androidAutoStarted=" + this.d + ", projectionStarted=" + this.c + "}";
    }

    public mlu() {
        throw null;
    }
}
