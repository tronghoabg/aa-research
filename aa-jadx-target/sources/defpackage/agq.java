package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class agq implements defpackage.bvu {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public agq(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [bwx, java.lang.Object] */
    @Override // defpackage.bvu
    public final void a() {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ((defpackage.agn) this.a).i();
                break;
            case 1:
                ((defpackage.agn) this.a).i();
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                ((defpackage.azk) this.a).d = null;
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.azy azyVar = (defpackage.azy) this.a;
                defpackage.skd skdVar = azyVar.f;
                if (skdVar != null) {
                    skdVar.b = false;
                }
                azyVar.f = null;
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.azu azuVar = (defpackage.azu) this.a;
                azuVar.d = true;
                azuVar.c = 0;
                azuVar.b();
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((defpackage.blw) this.a).l();
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ?? r3 = this.a;
                if (((defpackage.asn) r3.a()) != null) {
                    r3.b(null);
                }
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.bgk bgkVar = (defpackage.bgk) this.a;
                defpackage.cez cezVar = bgkVar.c;
                cezVar.d();
                cezVar.a();
                android.view.ActionMode actionMode = bgkVar.f;
                if (actionMode != null) {
                    actionMode.finish();
                }
                bgkVar.f = null;
                break;
            default:
                defpackage.bho bhoVarA = ((defpackage.bhp) this.a).a();
                if (bhoVarA != null) {
                    bhoVarA.a();
                }
                break;
        }
    }
}
