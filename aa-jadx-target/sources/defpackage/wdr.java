package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class wdr {
    private final java.util.concurrent.atomic.AtomicReferenceArray a;
    private final defpackage.rkq b;

    public wdr(defpackage.rkq rkqVar, int i) {
        this.b = rkqVar;
        this.a = new java.util.concurrent.atomic.AtomicReferenceArray(i);
    }

    public final defpackage.wdf a(int i, java.lang.String str, double d) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.a;
        defpackage.wdf wdfVar = (defpackage.wdf) atomicReferenceArray.get(i);
        if (wdfVar != null) {
            return wdfVar;
        }
        defpackage.wdf wdfVarR = this.b.r(str, d);
        if (defpackage.sqs.bJ(atomicReferenceArray, i, wdfVarR)) {
            return wdfVarR;
        }
        defpackage.wdf wdfVar2 = (defpackage.wdf) atomicReferenceArray.get(i);
        wdfVar2.getClass();
        return wdfVar2;
    }

    public final defpackage.wdf b(int i, java.lang.String str, long j) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.a;
        defpackage.wdf wdfVar = (defpackage.wdf) atomicReferenceArray.get(i);
        if (wdfVar != null) {
            return wdfVar;
        }
        defpackage.wdf wdfVarS = this.b.s(str, j);
        if (defpackage.sqs.bJ(atomicReferenceArray, i, wdfVarS)) {
            return wdfVarS;
        }
        defpackage.wdf wdfVar2 = (defpackage.wdf) atomicReferenceArray.get(i);
        wdfVar2.getClass();
        return wdfVar2;
    }

    public final defpackage.wdf c(int i, java.lang.String str, java.lang.String str2) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.a;
        defpackage.wdf wdfVar = (defpackage.wdf) atomicReferenceArray.get(i);
        if (wdfVar != null) {
            return wdfVar;
        }
        defpackage.wdf wdfVarT = this.b.t(str, str2);
        if (defpackage.sqs.bJ(atomicReferenceArray, i, wdfVarT)) {
            return wdfVarT;
        }
        defpackage.wdf wdfVar2 = (defpackage.wdf) atomicReferenceArray.get(i);
        wdfVar2.getClass();
        return wdfVar2;
    }

    public final defpackage.wdf d(int i, java.lang.String str, boolean z) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.a;
        defpackage.wdf wdfVar = (defpackage.wdf) atomicReferenceArray.get(i);
        if (wdfVar != null) {
            return wdfVar;
        }
        defpackage.wdf wdfVarU = this.b.u(str, z);
        if (defpackage.sqs.bJ(atomicReferenceArray, i, wdfVarU)) {
            return wdfVarU;
        }
        defpackage.wdf wdfVar2 = (defpackage.wdf) atomicReferenceArray.get(i);
        wdfVar2.getClass();
        return wdfVar2;
    }

    public final defpackage.wdf e(int i, java.lang.String str, defpackage.wco wcoVar, java.lang.String str2) {
        java.util.concurrent.atomic.AtomicReferenceArray atomicReferenceArray = this.a;
        defpackage.wdf wdfVar = (defpackage.wdf) atomicReferenceArray.get(i);
        if (wdfVar != null) {
            return wdfVar;
        }
        defpackage.wdf wdfVarV = this.b.v(str, wcoVar, str2);
        if (defpackage.sqs.bJ(atomicReferenceArray, i, wdfVarV)) {
            return wdfVarV;
        }
        defpackage.wdf wdfVar2 = (defpackage.wdf) atomicReferenceArray.get(i);
        wdfVar2.getClass();
        return wdfVar2;
    }
}
