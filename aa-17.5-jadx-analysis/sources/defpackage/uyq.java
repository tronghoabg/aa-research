package defpackage;

/* loaded from: classes3.dex */
public final class uyq implements acku {
    private final acku a;
    private final /* synthetic */ int b;

    public uyq(acku ackuVar, int i, int[] iArr) {
        this.b = i;
        ackuVar.getClass();
        this.a = ackuVar;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        int i = this.b;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? b() : b() : b() : b() : b();
    }

    public final xxh b() {
        int i = this.b;
        if (i == 0) {
            return xxh.h(this.a.a());
        }
        if (i == 1) {
            return xxh.h(this.a.a());
        }
        if (i == 2) {
            return xxh.h(this.a.a());
        }
        acku ackuVar = this.a;
        return i != 3 ? xxh.h(ackuVar) : xxh.h(ackq.b(ackuVar));
    }

    public uyq(acku ackuVar, int i) {
        this.b = i;
        this.a = ackuVar;
    }
}
