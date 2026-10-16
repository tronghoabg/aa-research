package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ars implements defpackage.aor {
    public final defpackage.arw a;
    public final defpackage.aej b;
    public final defpackage.kwv c;
    private final defpackage.cgh d = defpackage.amh.b;

    public ars(defpackage.arw arwVar, defpackage.kwv kwvVar, defpackage.aej aejVar) {
        this.a = arwVar;
        this.c = kwvVar;
        this.b = aejVar;
    }

    @Override // defpackage.aor
    public final /* synthetic */ java.lang.Object a(defpackage.apw apwVar, float f, defpackage.afdk afdkVar) {
        return c(apwVar, f, defpackage.ard.a, afdkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [affc] */
    /* JADX WARN: Type inference failed for: r13v4 */
    public final java.lang.Object b(defpackage.apw apwVar, float f, defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.aro aroVar;
        ?? r13;
        if (afdkVar instanceof defpackage.aro) {
            aroVar = (defpackage.aro) afdkVar;
            int i = aroVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aroVar.d = i - Integer.MIN_VALUE;
            } else {
                aroVar = new defpackage.aro(this, afdkVar);
            }
        } else {
            aroVar = new defpackage.aro(this, afdkVar);
        }
        java.lang.Object objA = aroVar.b;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = aroVar.d;
        if (i2 == 0) {
            defpackage.afga.cz(objA);
            defpackage.cgh cghVar = this.d;
            defpackage.arp arpVar = new defpackage.arp(this, f, affcVar, apwVar, null);
            aroVar.a = affcVar;
            aroVar.d = 1;
            objA = ahoc.a(cghVar, arpVar, aroVar);
            if (objA == afdrVar) {
                return afdrVar;
            }
            r13 = affcVar;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.Object obj = aroVar.a;
            defpackage.afga.cz(objA);
            r13 = obj;
        }
        defpackage.bil bilVar = (defpackage.bil) objA;
        r13.invoke(new java.lang.Float(0.0f));
        return bilVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(defpackage.apw apwVar, float f, defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.arq arqVar;
        if (afdkVar instanceof defpackage.arq) {
            arqVar = (defpackage.arq) afdkVar;
            int i = arqVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                arqVar.c = i - Integer.MIN_VALUE;
            } else {
                arqVar = new defpackage.arq(this, afdkVar);
            }
        } else {
            arqVar = new defpackage.arq(this, afdkVar);
        }
        java.lang.Object objB = arqVar.a;
        java.lang.Object obj = defpackage.afdr.a;
        int i2 = arqVar.c;
        if (i2 == 0) {
            defpackage.afga.cz(objB);
            arqVar.c = 1;
            objB = b(apwVar, f, affcVar, arqVar);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(objB);
        }
        defpackage.bil bilVar = (defpackage.bil) objB;
        return new java.lang.Float(((java.lang.Number) bilVar.a).floatValue() != 0.0f ? ((java.lang.Number) ((defpackage.aek) bilVar.b).b()).floatValue() : 0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(defpackage.apw apwVar, float f, float f2, defpackage.affc affcVar, defpackage.afdk afdkVar) throws java.lang.Throwable {
        defpackage.arr arrVar;
        if (afdkVar instanceof defpackage.arr) {
            arrVar = (defpackage.arr) afdkVar;
            int i = arrVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                arrVar.c = i - Integer.MIN_VALUE;
            } else {
                arrVar = new defpackage.arr(this, afdkVar);
            }
        } else {
            arrVar = new defpackage.arr(this, afdkVar);
        }
        defpackage.arr arrVar2 = arrVar;
        java.lang.Object objA = arrVar2.a;
        defpackage.afdr afdrVar = defpackage.afdr.a;
        int i2 = arrVar2.c;
        if (i2 == 0) {
            defpackage.afga.cz(objA);
            if (java.lang.Math.abs(f) == 0.0f || java.lang.Math.abs(f2) == 0.0f) {
                return defpackage.ca.B(f, f2);
            }
            arrVar2.c = 1;
            defpackage.kwv kwvVar = this.c;
            objA = (java.lang.Math.abs(defpackage.ca.aj(kwvVar, f2)) >= java.lang.Math.abs(f) ? new defpackage.arz(kwvVar, 1) : new defpackage.arz(this.b, 0)).a(apwVar, new java.lang.Float(f), new java.lang.Float(f2), affcVar, arrVar2);
            if (objA == afdrVar) {
                return afdrVar;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            defpackage.afga.cz(objA);
        }
        return ((defpackage.bil) objA).b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ars)) {
            return false;
        }
        defpackage.ars arsVar = (defpackage.ars) obj;
        return defpackage.afga.f(arsVar.b, this.b) && defpackage.afga.f(arsVar.c, this.c) && defpackage.afga.f(arsVar.a, this.a);
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.a.hashCode();
    }
}
