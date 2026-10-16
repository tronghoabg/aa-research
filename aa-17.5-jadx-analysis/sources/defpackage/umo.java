package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class umo extends uma {
    private static final uwt a = new uwt(0, 0, 0, 0);
    private final umr b;
    private final uww c;
    private final uwt e;

    public umo(utf utfVar, ukp ukpVar, umr umrVar, uwt uwtVar, boolean z) {
        super(utfVar, ute.a, ukpVar.a);
        this.c = new uww();
        this.b = umrVar;
        this.e = uwtVar == null ? a : uwtVar;
        if (uwtVar == null && (utfVar instanceof uuj)) {
            throw new IllegalArgumentException("GmmTileEntity in BaseTileDrawOrder does not specify sort values.");
        }
        if (z) {
            x(uwb.a(ukpVar.b, ukpVar.c, ukpVar.a), 248);
        }
    }

    public static uwt g(ukd ukdVar, ujf ujfVar) {
        return new uwt(ujfVar.F, ukdVar.b(), 0, ukdVar.c());
    }

    @Override // defpackage.utj
    protected final float[] D(usy usyVar) {
        uww uwwVar;
        uww uwwVar2 = this.c;
        uww uwwVar3 = uwwVar2.b ? this.b.d : this.p;
        if (this.o || usyVar.p() != this.q) {
            if (uwwVar2.b) {
                uww uwwVar4 = this.n;
                umr umrVar = this.b;
                uwwVar4.d(umrVar.a(usyVar));
                if (usyVar.p() != umrVar.b) {
                    umrVar.a(usyVar);
                    uww uwwVar5 = umrVar.d;
                    uxf.b(uwwVar5.a, usyVar.y(), umrVar.c.a);
                    uwwVar5.a();
                    umrVar.b = usyVar.p();
                }
                uwwVar = umrVar.d;
            } else {
                uww uwwVarA = this.b.a(usyVar);
                uww uwwVar6 = this.n;
                if (uwwVarA.b) {
                    uwwVar6.d(uwwVar2);
                } else if (uwwVar2.b) {
                    uwwVar6.d(uwwVarA);
                } else {
                    uxf.b(uwwVar6.a, uwwVarA.a, uwwVar2.a);
                    uwwVar6.b = false;
                }
                uwwVar = this.p;
                uxf.b(uwwVar.a, usyVar.y(), uwwVar6.a);
                uwwVar.a();
            }
            uwwVar3 = uwwVar;
            this.o = false;
            this.q = usyVar.p();
        }
        return uwwVar3.a;
    }

    @Override // defpackage.utj, defpackage.uth
    public final uwt G() {
        return this.e;
    }

    public final void k() {
        uww uwwVar = new uww();
        uwwVar.e();
        uwwVar.g(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        if (this.r) {
            uvr uvrVar = uvr.a;
        }
        this.c.d(uwwVar);
        this.o = true;
    }

    public umo(utf utfVar, ukp ukpVar, umr umrVar, ute uteVar, boolean z) {
        super(utfVar, uteVar, ukpVar.a);
        this.c = new uww();
        this.b = umrVar;
        this.e = a;
        if (z) {
            x(uwb.a(ukpVar.b, ukpVar.c, ukpVar.a), 248);
        }
    }
}
