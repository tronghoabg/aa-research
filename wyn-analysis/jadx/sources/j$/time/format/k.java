package j$.time.format;

/* loaded from: classes2.dex */
final class k extends l {
    @Override // j$.time.format.l
    protected final l d(String str, String str2, l lVar) {
        return new k(str, str2, lVar, 0);
    }

    @Override // j$.time.format.l
    protected final boolean b(char c10, char c11) {
        return q.b(c10, c11);
    }

    @Override // j$.time.format.l
    protected final boolean f(CharSequence charSequence, int i5, int i10) {
        int length = this.f37588a.length();
        if (length > i10 - i5) {
            return false;
        }
        int i11 = 0;
        while (true) {
            int i12 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i13 = i11 + 1;
            int i14 = i5 + 1;
            if (!q.b(this.f37588a.charAt(i11), charSequence.charAt(i5))) {
                return false;
            }
            i5 = i14;
            length = i12;
            i11 = i13;
        }
    }
}
