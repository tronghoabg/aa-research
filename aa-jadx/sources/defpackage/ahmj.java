package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahmj {
    private ahmj() {
    }

    public final defpackage.ahmk decode(java.lang.Integer num, java.lang.Integer num2) {
        if (num2 != null) {
            return new defpackage.ahmk(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
        }
        if (num == null) {
            return defpackage.ahmk.INFINITY;
        }
        return new defpackage.ahmk(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127);
    }

    public /* synthetic */ ahmj(defpackage.affu affuVar) {
        this();
    }
}
