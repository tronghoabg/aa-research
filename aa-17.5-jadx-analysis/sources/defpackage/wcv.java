package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class wcv {
    private final AtomicReferenceArray a;
    private final rju b;

    public wcv(rju rjuVar, int i) {
        this.b = rjuVar;
        this.a = new AtomicReferenceArray(i);
    }

    public final wcj a(int i, String str, double d) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        wcj wcjVar = (wcj) atomicReferenceArray.get(i);
        if (wcjVar != null) {
            return wcjVar;
        }
        wcj wcjVarR = this.b.r(str, d);
        if (woy.aE(atomicReferenceArray, i, wcjVarR)) {
            return wcjVarR;
        }
        wcj wcjVar2 = (wcj) atomicReferenceArray.get(i);
        wcjVar2.getClass();
        return wcjVar2;
    }

    public final wcj b(int i, String str, long j) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        wcj wcjVar = (wcj) atomicReferenceArray.get(i);
        if (wcjVar != null) {
            return wcjVar;
        }
        wcj wcjVarS = this.b.s(str, j);
        if (woy.aE(atomicReferenceArray, i, wcjVarS)) {
            return wcjVarS;
        }
        wcj wcjVar2 = (wcj) atomicReferenceArray.get(i);
        wcjVar2.getClass();
        return wcjVar2;
    }

    public final wcj c(int i, String str, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        wcj wcjVar = (wcj) atomicReferenceArray.get(i);
        if (wcjVar != null) {
            return wcjVar;
        }
        wcj wcjVarT = this.b.t(str, str2);
        if (woy.aE(atomicReferenceArray, i, wcjVarT)) {
            return wcjVarT;
        }
        wcj wcjVar2 = (wcj) atomicReferenceArray.get(i);
        wcjVar2.getClass();
        return wcjVar2;
    }

    public final wcj d(int i, String str, boolean z) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        wcj wcjVar = (wcj) atomicReferenceArray.get(i);
        if (wcjVar != null) {
            return wcjVar;
        }
        wcj wcjVarU = this.b.u(str, z);
        if (woy.aE(atomicReferenceArray, i, wcjVarU)) {
            return wcjVarU;
        }
        wcj wcjVar2 = (wcj) atomicReferenceArray.get(i);
        wcjVar2.getClass();
        return wcjVar2;
    }

    public final wcj e(int i, String str, wbs wbsVar, String str2) {
        AtomicReferenceArray atomicReferenceArray = this.a;
        wcj wcjVar = (wcj) atomicReferenceArray.get(i);
        if (wcjVar != null) {
            return wcjVar;
        }
        wcj wcjVarV = this.b.v(str, wbsVar, str2);
        if (woy.aE(atomicReferenceArray, i, wcjVarV)) {
            return wcjVarV;
        }
        wcj wcjVar2 = (wcj) atomicReferenceArray.get(i);
        wcjVar2.getClass();
        return wcjVar2;
    }
}
