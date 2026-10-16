package defpackage;

/* loaded from: classes3.dex */
final class adwz {
    public final adlf a;
    public adjh b;
    public boolean c = false;
    public adji d = adji.a(adjh.d);

    public adwz(adlf adlfVar, adjh adjhVar) {
        this.a = adlfVar;
        this.b = adjhVar;
    }

    public final adjh a() {
        return this.d.a;
    }

    public final void b(adjh adjhVar) {
        boolean z;
        this.b = adjhVar;
        if (adjhVar == adjh.b || adjhVar == adjh.c) {
            z = true;
        } else if (adjhVar != adjh.d) {
            return;
        } else {
            z = false;
        }
        this.c = z;
    }
}
