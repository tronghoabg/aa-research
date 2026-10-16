package defpackage;

/* loaded from: classes2.dex */
public final class ajbc extends afda implements aiyl, afdb {
    public final aiyl a;
    public final afco b;
    public final int c;
    private afco d;
    private afck e;

    public ajbc(aiyl aiylVar, afco afcoVar) {
        super(ajaz.a, afcp.a);
        this.a = aiylVar;
        this.b = afcoVar;
        this.c = ((Number) afcoVar.fold(0, new ooh(15))).intValue();
    }

    @Override // defpackage.aiyl
    public final Object a(Object obj, afck afckVar) {
        try {
            afco afcoVarHH = afckVar.hH();
            affx.f(afcoVarHH);
            afco afcoVar = this.d;
            if (afcoVar != afcoVarHH) {
                if (afcoVar instanceof ajaw) {
                    throw new IllegalStateException(afyh.a("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((ajaw) afcoVar).a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "));
                }
                if (((Number) afcoVarHH.fold(0, new tbk(this, 7))).intValue() != this.c) {
                    throw new IllegalStateException("Flow invariant is violated:\n\t\tFlow was collected in " + this.b + ",\n\t\tbut emission happened in " + afcoVarHH + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                }
                this.d = afcoVarHH;
            }
            this.e = afckVar;
            afeh afehVar = ajbe.a;
            aiyl aiylVar = this.a;
            aiylVar.getClass();
            Object objInvoke = afehVar.invoke(aiylVar, obj, this);
            if (!affa.f(objInvoke, afcr.a)) {
                this.e = null;
            }
            afcr afcrVar = afcr.a;
            if (objInvoke == afcrVar) {
                afckVar.getClass();
            }
            return objInvoke == afcrVar ? objInvoke : afak.a;
        } catch (Throwable th) {
            this.d = new ajaw(th, afckVar.hH());
            throw th;
        }
    }

    @Override // defpackage.afda, defpackage.afcy
    public final void e() {
        super.e();
    }

    @Override // defpackage.afcy, defpackage.afdb
    public final StackTraceElement ea() {
        return null;
    }

    @Override // defpackage.afcy, defpackage.afdb
    public final afdb eb() {
        afck afckVar = this.e;
        if (afckVar instanceof afdb) {
            return (afdb) afckVar;
        }
        return null;
    }

    @Override // defpackage.afda, defpackage.afck
    public final afco hH() {
        afco afcoVar = this.d;
        return afcoVar == null ? afcp.a : afcoVar;
    }

    @Override // defpackage.afcy
    protected final Object hT(Object obj) {
        Throwable thA = aezw.a(obj);
        if (thA != null) {
            this.d = new ajaw(thA, hH());
        }
        afck afckVar = this.e;
        if (afckVar != null) {
            afckVar.w(obj);
        }
        return afcr.a;
    }
}
