package com.waze.settings;

import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class gj implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gk f37313a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gr f37314b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ds f37315c;

    gj(gk gkVar, gr grVar, ds dsVar) {
        this.f37313a = gkVar;
        this.f37314b = grVar;
        this.f37315c = dsVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        bs bsVar = (bs) obj;
        hg hgVarE = bsVar.e();
        if (!(hgVarE instanceof hf)) {
            if (!(hgVarE instanceof he)) {
                throw new h.i();
            }
            int iA = ((he) bsVar.e()).a();
            if (iA == 0) {
                this.f37313a.c(null);
            } else if (iA == 1) {
                this.f37313a.c(this.f37314b.f37336i.c(R.string.YOUR_USER_NAME_IS_TOO_SHORT, new Object[0]));
            } else if (iA == 2) {
                this.f37313a.c(this.f37314b.f37336i.c(R.string.USERNAME_IS_TOO_LONG, new Object[0]));
            } else if (iA == 3) {
                this.f37313a.c(this.f37314b.f37336i.c(R.string.INVALID_CHARACTER_USE_ONLY_LETTERS_AND_NUMBERS, new Object[0]));
            } else if (iA != 4) {
                gk gkVar = this.f37313a;
                if (iA != 5) {
                    gkVar.c(null);
                } else {
                    gkVar.c(this.f37314b.f37336i.c(R.string.YOU_CANT_USE_THIS_USERNAME, new Object[0]));
                }
            } else {
                String strJ = ((he) bsVar.e()).j();
                h.g.b.x.c(strJ);
                this.f37313a.d(this.f37314b.f37336i.c(R.string.THATS_TAKEN_TRY, new Object[0]) + " " + strJ, strJ, new com.waze.a.y(this.f37315c, strJ, 18, null));
            }
        }
        return h.ab.f48028a;
    }
}
