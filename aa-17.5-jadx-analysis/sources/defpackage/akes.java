package defpackage;

/* loaded from: classes2.dex */
final class akes extends akew {
    public akes(akch akchVar, int i) {
        super(akchVar, i, false, i);
    }

    @Override // defpackage.akev, defpackage.akfl
    public final int c(akfh akfhVar, CharSequence charSequence, int i) {
        int i2;
        char cCharAt;
        int iC = super.c(akfhVar, charSequence, i);
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
