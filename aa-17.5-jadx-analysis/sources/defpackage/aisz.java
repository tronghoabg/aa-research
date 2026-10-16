package defpackage;

/* loaded from: classes2.dex */
public class aisz extends aivo implements aivh, afck, aitx {
    public final afco a;

    public aisz(afco afcoVar, boolean z) {
        super(z);
        I((aivh) afcoVar.get(aivh.d));
        this.a = afcoVar.plus(this);
    }

    @Override // defpackage.aitx
    public final afco c() {
        return this.a;
    }

    protected void f(Object obj) {
        l(obj);
    }

    @Override // defpackage.aivo
    public final void g(Throwable th) {
        aiiu.b(this.a, th);
    }

    @Override // defpackage.aivo
    protected final String hF() {
        return String.valueOf(getClass().getSimpleName()).concat(" was cancelled");
    }

    @Override // defpackage.aivo
    public String hG() {
        String str = null;
        if (aitz.a) {
            afco afcoVar = this.a;
            aitv aitvVar = (aitv) afcoVar.get(aitv.b);
            if (aitvVar != null) {
                aitw aitwVar = (aitw) afcoVar.get(aitw.b);
                str = (aitwVar != null ? aitwVar.a : "coroutine") + "#" + aitvVar.a;
            }
        }
        if (str == null) {
            return aiua.a(this);
        }
        return "\"" + str + "\":" + aiua.a(this);
    }

    @Override // defpackage.afck
    public final afco hH() {
        return this.a;
    }

    @Override // defpackage.aivo
    protected final void hK(Object obj) {
        if (!(obj instanceof aito)) {
            hJ(obj);
        } else {
            aito aitoVar = (aito) obj;
            hI(aitoVar.b, aitoVar.c.a());
        }
    }

    @Override // defpackage.afck
    public final void w(Object obj) throws Throwable {
        Object objD = D(ahng.b(obj));
        if (objD == aivp.c) {
            return;
        }
        f(objD);
    }

    protected void hJ(Object obj) {
    }

    protected void hI(Throwable th, boolean z) {
    }
}
