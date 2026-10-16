package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bfc implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ aiuw a;
    final /* synthetic */ defpackage.bwx b;
    final /* synthetic */ defpackage.bys c;

    public bfc(aiuw aiuwVar, defpackage.bwx bwxVar, defpackage.bys bysVar) {
        this.a = aiuwVar;
        this.b = bwxVar;
        this.c = bysVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(defpackage.cri criVar, defpackage.afdk<? super defpackage.afbk> afdkVar) {
        defpackage.bfb bfbVar = new defpackage.bfb(this.a, this.b, null);
        defpackage.bbs bbsVar = new defpackage.bbs(this.c, 18);
        defpackage.affh affhVar = defpackage.arc.a;
        java.lang.Object objA = ahoi.a(new defpackage.aqu(criVar, bfbVar, bbsVar, new defpackage.apq(criVar), null), afdkVar);
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (objA != afdrVar) {
            objA = defpackage.afbk.a;
        }
        return objA == afdrVar ? objA : defpackage.afbk.a;
    }
}
