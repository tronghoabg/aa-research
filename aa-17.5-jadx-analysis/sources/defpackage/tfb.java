package defpackage;

/* loaded from: classes3.dex */
public final class tfb implements acku {
    private final acku a;
    private final /* synthetic */ int b;

    public tfb(acku ackuVar, int i) {
        this.b = i;
        this.a = ackuVar;
    }

    public static acku b(acku ackuVar) {
        return new tfb(ackuVar, 3);
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        int i = this.b;
        if (i == 0) {
            return xxh.h(this.a);
        }
        if (i == 1) {
            return xxh.h(this.a.a());
        }
        acku ackuVar = this.a;
        return i != 2 ? ackq.b(ackuVar) : xxh.h(ackuVar);
    }
}
