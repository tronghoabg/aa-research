package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class sns {
    public final int a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public sns(defpackage.afia afiaVar, defpackage.azc azcVar) {
        defpackage.bwk bwkVarC = azcVar.c();
        int i = afiaVar.a;
        if (i < 0) {
            defpackage.asq.d("negative nearestRange.first");
        }
        int iMin = java.lang.Math.min(afiaVar.b, bwkVarC.a - 1);
        if (iMin < i) {
            defpackage.aal aalVar = defpackage.aam.a;
            aalVar.getClass();
            this.c = aalVar;
            this.b = new java.lang.Object[0];
            this.a = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.b = new java.lang.Object[i2];
        this.a = i;
        defpackage.aal aalVar2 = new defpackage.aal(i2);
        defpackage.bai baiVar = new defpackage.bai(i, iMin, aalVar2, this, 0);
        if (i < 0 || i >= bwkVarC.a) {
            defpackage.asq.e("Index " + i + ", size " + bwkVarC.a);
        }
        if (iMin < 0 || iMin >= bwkVarC.a) {
            defpackage.asq.e("Index " + iMin + ", size " + bwkVarC.a);
        }
        if (iMin < i) {
            defpackage.asq.c(defpackage.a.bz(i, iMin, "toIndex (", ") should be not smaller than fromIndex (", ")"));
        }
        defpackage.bzc bzcVar = (defpackage.bzc) bwkVarC.c;
        int iQ = defpackage.axd.q(bzcVar, i);
        int i3 = ((defpackage.ov) bzcVar.a[iQ]).a;
        while (i3 <= iMin) {
            defpackage.ov ovVar = (defpackage.ov) bzcVar.a[iQ];
            baiVar.invoke(ovVar);
            i3 += ovVar.b;
            iQ++;
        }
        this.c = aalVar2;
    }

    public final int a(long j) {
        int i = this.a - 1;
        if (i == -1) {
            return -1;
        }
        int i2 = 0;
        if (i == 0) {
            long j2 = ((long[]) this.c)[0];
            if (j2 == j) {
                return 0;
            }
            return j2 <= j ? -1 : -2;
        }
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            long j3 = ((long[]) this.c)[i3] - j;
            if (j3 < 0) {
                i2 = i3 + 1;
            } else {
                if (j3 <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public final int b(java.lang.Object obj) {
        defpackage.aal aalVar = (defpackage.aal) this.c;
        int iA = aalVar.a(obj);
        if (iA >= 0) {
            return aalVar.c[iA];
        }
        return -1;
    }

    public final java.lang.Object c(int i) {
        int i2 = i - this.a;
        if (i2 < 0) {
            return null;
        }
        java.lang.Object[] objArr = (java.lang.Object[]) this.b;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }

    public sns(defpackage.smn smnVar, int i, defpackage.slw slwVar) {
        this.b = smnVar;
        this.a = i;
        this.c = slwVar;
    }

    public sns(int i, long[] jArr, java.lang.Object[] objArr) {
        this.a = i;
        this.c = jArr;
        this.b = objArr;
    }

    public sns(defpackage.qxc qxcVar, android.os.IBinder.DeathRecipient deathRecipient) {
        this.b = qxcVar;
        this.c = deathRecipient;
        this.a = android.os.Binder.getCallingPid();
    }
}
