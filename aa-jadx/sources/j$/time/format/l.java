package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends j$.time.format.m {
    @Override // j$.time.format.m
    public final boolean b(char c, char c2) {
        return j$.time.format.v.b(c, c2);
    }

    @Override // j$.time.format.m
    public final j$.time.format.m d(java.lang.String str, java.lang.String str2, j$.time.format.m mVar) {
        return new j$.time.format.l(str, str2, mVar);
    }

    @Override // j$.time.format.m
    public final boolean e(java.lang.CharSequence charSequence, int i, int i2) {
        int length = this.a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!j$.time.format.v.b(this.a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
