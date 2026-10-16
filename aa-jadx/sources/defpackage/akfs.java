package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class akfs extends defpackage.akfw {
    public akfs(defpackage.akdh akdhVar, int i) {
        super(akdhVar, i, false, i);
    }

    @Override // defpackage.akfv, defpackage.akgl
    public final int c(defpackage.akgh akghVar, java.lang.CharSequence charSequence, int i) {
        int i2;
        char cCharAt;
        int iC = super.c(akghVar, charSequence, i);
        if (iC >= 0 && iC != (i2 = this.b + i)) {
            if (this.c && ((cCharAt = charSequence.charAt(i)) == '-' || cCharAt == '+')) {
                i2++;
            }
            if (iC > i2) {
                return ~(i2 + 1);
            }
            if (iC < i2) {
                return ~iC;
            }
        }
        return iC;
    }
}
