package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class exp implements android.content.DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ defpackage.exq a;

    public exp(defpackage.exq exqVar) {
        this.a = exqVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i, boolean z) {
        defpackage.exq exqVar = this.a;
        boolean z2 = exqVar.h;
        if (z) {
            exqVar.h = z2 | exqVar.g.add(exqVar.j[i].toString());
        } else {
            exqVar.h = z2 | exqVar.g.remove(exqVar.j[i].toString());
        }
    }
}
