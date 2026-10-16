package defpackage;

import android.content.DialogInterface;

/* loaded from: classes2.dex */
final class exj implements DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ exk a;

    public exj(exk exkVar) {
        this.a = exkVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        exk exkVar = this.a;
        boolean z2 = exkVar.h;
        if (z) {
            exkVar.h = z2 | exkVar.g.add(exkVar.j[i].toString());
        } else {
            exkVar.h = z2 | exkVar.g.remove(exkVar.j[i].toString());
        }
    }
}
