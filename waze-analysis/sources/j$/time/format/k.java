package j$.time.format;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class k implements e {

    /* renamed from: a, reason: collision with root package name */
    public final e f49959a;

    /* renamed from: b, reason: collision with root package name */
    public final int f49960b;

    /* renamed from: c, reason: collision with root package name */
    public final char f49961c;

    public k(e eVar, int i2, char c2) {
        this.f49959a = eVar;
        this.f49960b = i2;
        this.f49961c = c2;
    }

    @Override // j$.time.format.e
    public final boolean f(w wVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.f49959a.f(wVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i2 = this.f49960b;
        if (length2 <= i2) {
            for (int i3 = 0; i3 < i2 - length2; i3++) {
                sb.insert(length, this.f49961c);
            }
            return true;
        }
        throw new j$.time.c("Cannot print as output of " + length2 + " characters exceeds pad width of " + i2);
    }

    @Override // j$.time.format.e
    public final int h(u uVar, CharSequence charSequence, int i2) {
        boolean z = uVar.f49992c;
        if (i2 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == charSequence.length()) {
            return ~i2;
        }
        int length = this.f49960b + i2;
        if (length > charSequence.length()) {
            if (z) {
                return ~i2;
            }
            length = charSequence.length();
        }
        int i3 = i2;
        while (i3 < length && uVar.a(charSequence.charAt(i3), this.f49961c)) {
            i3++;
        }
        int iH = this.f49959a.h(uVar, charSequence.subSequence(0, length), i3);
        return (iH == length || !z) ? iH : ~(i2 + i3);
    }

    public final String toString() {
        String str;
        String strValueOf = String.valueOf(this.f49959a);
        char c2 = this.f49961c;
        if (c2 == ' ') {
            str = ")";
        } else {
            str = ",'" + c2 + "')";
        }
        return "Pad(" + strValueOf + "," + this.f49960b + str;
    }
}
