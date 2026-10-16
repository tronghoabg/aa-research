package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class cgl {
    public final android.view.View a;
    public android.view.autofill.AutofillId b;
    public final defpackage.khb c;

    public cgl(android.view.View view, defpackage.khb khbVar) {
        this.a = view;
        this.c = khbVar;
        a$.ExternalSyntheticApiModelOutline1.m(view, 1);
        java.lang.Object obj = new defpackage.kwv(a$.ExternalSyntheticApiModelOutline1.m(view)).a;
        if (obj != null) {
            this.b = a$.ExternalSyntheticApiModelOutline1.m(obj);
        } else {
            defpackage.csc.a("Required value was null.");
            throw new defpackage.afap();
        }
    }
}
