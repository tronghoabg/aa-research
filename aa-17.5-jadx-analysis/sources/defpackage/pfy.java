package defpackage;

/* loaded from: classes2.dex */
final class pfy implements pbs {
    final /* synthetic */ pgr a;

    public pfy(pgr pgrVar) {
        this.a = pgrVar;
    }

    @Override // defpackage.pbs
    public final void a(xhv xhvVar) {
        if (!acrb.y()) {
            ((ype) ((ype) pgr.a.g()).ai((char) 6468)).u("onByeByeMessageSent invoked, but flag is disabled.");
            return;
        }
        pgr pgrVar = this.a;
        pgrVar.z.d(new pfq(this, xhvVar, 2, null));
    }

    @Override // defpackage.pbs
    public final void b(xhv xhvVar) {
        if (!acrb.y()) {
            ((ype) ((ype) pgr.a.g()).ai((char) 6469)).u("onPctsByeByeMessageSent invoked, but flag is disabled.");
            return;
        }
        pgr pgrVar = this.a;
        pgrVar.z.d(new pfq(this, xhvVar, 3, null));
    }

    public final void c(boolean z, xhv xhvVar) {
        pgr pgrVar = this.a;
        pgrVar.w(yxi.WIRELESS_GAL_BYE_BYE_MESSAGE_SENT_BY_MD);
        if (pgr.ab()) {
            pgl pglVarJ = pgrVar.j(new ozw(yze.PROTOCOL_BYEBYE_REQUESTED_BY_USER), z);
            ype ypeVar = (ype) pgr.a.l().ai(6465);
            String strName = xhvVar.name();
            pdo pdoVar = pglVarJ.b;
            pag pagVar = pglVarJ.a;
            String strName2 = pdoVar.name();
            String strName3 = pagVar.name();
            Boolean boolValueOf = Boolean.valueOf(z);
            ypeVar.S("Bye Bye message sent with reason %s, wifi intention event: %s, setup event: %s, invoked by PCTS: %s", strName, strName2, strName3, boolValueOf);
            ((uk) pgrVar.at.v()).d(pdoVar);
            pgrVar.ax.w(boolValueOf);
            if (aczv.aY()) {
                pgrVar.O(pagVar);
            }
        } else {
            pgrVar.am.w(false);
        }
        pgrVar.p();
    }
}
