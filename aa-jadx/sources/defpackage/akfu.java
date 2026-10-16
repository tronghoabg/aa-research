package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akfu implements defpackage.akgl {
    private final defpackage.akgl[] a;
    private final int b;

    public akfu(defpackage.akgl[] akglVarArr) {
        int iA;
        this.a = akglVarArr;
        int length = akglVarArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                this.b = i;
                return;
            }
            defpackage.akgl akglVar = akglVarArr[length];
            if (akglVar != null && (iA = akglVar.a()) > i) {
                i = iA;
            }
        }
    }

    @Override // defpackage.akgl
    public final int a() {
        return this.b;
    }

    @Override // defpackage.akgl
    public final int c(defpackage.akgh akghVar, java.lang.CharSequence charSequence, int i) {
        int i2;
        int i3;
        java.lang.Object objB = akghVar.b();
        boolean z = false;
        java.lang.Object objB2 = null;
        int i4 = i;
        int i5 = i4;
        int i6 = 0;
        while (true) {
            defpackage.akgl[] akglVarArr = this.a;
            int length = akglVarArr.length;
            if (i6 >= length) {
                break;
            }
            defpackage.akgl akglVar = akglVarArr[i6];
            if (akglVar == null) {
                if (i4 <= i) {
                    return i;
                }
                z = true;
                break;
            }
            int iC = akglVar.c(akghVar, charSequence, i);
            if (iC >= i) {
                if (iC <= i4) {
                    continue;
                } else {
                    if (iC >= charSequence.length() || (i3 = i6 + 1) >= length || akglVarArr[i3] == null) {
                        return iC;
                    }
                    objB2 = akghVar.b();
                    i4 = iC;
                }
            } else if (iC < 0 && (i2 = ~iC) > i5) {
                i5 = i2;
            }
            akghVar.h(objB);
            i6++;
        }
        if (i4 <= i && (i4 != i || !z)) {
            return ~i5;
        }
        if (objB2 != null) {
            akghVar.h(objB2);
        }
        return i4;
    }
}
