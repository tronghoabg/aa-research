package defpackage;

/* loaded from: classes3.dex */
public final /* synthetic */ class udi implements uez {
    public final /* synthetic */ boolean a;

    public /* synthetic */ udi(boolean z) {
        this.a = z;
    }

    @Override // defpackage.uez
    public final uey a(Object obj, Object obj2) {
        yob yobVar = udq.a;
        if (this.a) {
            return uey.IGNORE;
        }
        rjs rjsVar = (rjs) obj;
        rjs rjsVar2 = (rjs) obj2;
        return rjsVar.b.equals(rjsVar2.b) ? uey.IGNORE : udq.j(rjsVar, rjsVar2);
    }
}
