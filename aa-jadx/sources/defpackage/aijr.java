package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aijr {
    private aijr() {
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0034  */
    public static final int a(java.lang.String str, int i, int i2, boolean z) {
        boolean z2;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= ' ') {
                if (cCharAt < 127 || ((cCharAt >= '0' && cCharAt < ':') || ((cCharAt >= 'a' && cCharAt < '{') || ((cCharAt >= 'A' && cCharAt < '[') || cCharAt == ':')))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else if (cCharAt == '\t') {
                cCharAt = '\t';
                if (cCharAt < 127) {
                    z2 = true;
                } else {
                    z2 = true;
                }
            } else {
                z2 = true;
            }
            if (z2 == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public /* synthetic */ aijr(defpackage.affu affuVar) {
        this();
    }
}
