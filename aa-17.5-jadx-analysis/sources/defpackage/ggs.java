package defpackage;

/* loaded from: classes2.dex */
final class ggs extends afde implements afei {
    /* synthetic */ boolean a;
    /* synthetic */ boolean b;
    /* synthetic */ boolean c;
    final /* synthetic */ ggt d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ggs(ggt ggtVar, afck afckVar) {
        super(4, afckVar);
        this.d = ggtVar;
    }

    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        woy.dF(obj);
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = false;
        if (z3 && z2 && !z) {
            z4 = true;
        }
        ynz ynzVar = (ynz) ggt.a.e().o(ypi.a, "CarApp.H.Dis").ai(41);
        ggt ggtVar = this.d;
        Boolean boolValueOf = Boolean.valueOf(z4);
        ynzVar.T("Content Moderation enabled=%b. shouldCurrentTemplateBeModerated=%b, canInterrupt=%b, isParked=%b, ContentModerationManager hashCode=%d", boolValueOf, Boolean.valueOf(z3), Boolean.valueOf(z2), Boolean.valueOf(z), new Integer(ggtVar.hashCode()));
        return boolValueOf;
    }

    @Override // defpackage.afei
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        ggs ggsVar = new ggs(this.d, (afck) obj4);
        ggsVar.a = zBooleanValue;
        ggsVar.b = zBooleanValue2;
        ggsVar.c = zBooleanValue3;
        return ggsVar.hT(afak.a);
    }
}
