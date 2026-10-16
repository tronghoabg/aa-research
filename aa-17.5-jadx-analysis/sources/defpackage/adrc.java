package defpackage;

/* loaded from: classes3.dex */
final class adrc implements Runnable {
    final adrb a;
    final /* synthetic */ String b;
    final /* synthetic */ admc c;
    final /* synthetic */ admf d;
    final /* synthetic */ adzv e;
    final /* synthetic */ adiw f;
    final /* synthetic */ adrd g;

    public adrc(adrd adrdVar, String str, admc admcVar, admf admfVar, adzv adzvVar, adiw adiwVar) {
        this.b = str;
        this.c = admcVar;
        this.d = admfVar;
        this.e = adzvVar;
        this.f = adiwVar;
        this.g = adrdVar;
        this.a = new adrb(str, adrdVar.a, adrdVar.e, admcVar, adrdVar, this, adrdVar.c, admfVar, adzvVar, adiwVar, adrdVar.f);
    }

    @Override // java.lang.Runnable
    public final void run() {
        adrd adrdVar = this.g;
        synchronized (adrdVar.c) {
            if (adrdVar.h) {
                this.a.p.l(adrdVar.i, true, new admc());
            } else {
                if (!adrdVar.j) {
                    throw new AssertionError("Transport is not started");
                }
                adrb adrbVar = this.a;
                adrdVar.d.add(adrbVar);
                adrbVar.p.h.r = adrdVar.k;
            }
        }
    }
}
