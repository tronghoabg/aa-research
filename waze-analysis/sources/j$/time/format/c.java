package j$.time.format;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final char f49933a;

    public c(char c2) {
        this.f49933a = c2;
    }

    @Override // j$.time.format.e
    public final boolean f(w wVar, StringBuilder sb) {
        sb.append(this.f49933a);
        return true;
    }

    @Override // j$.time.format.e
    public final int h(u uVar, CharSequence charSequence, int i2) {
        if (i2 == charSequence.length()) {
            return ~i2;
        }
        char cCharAt = charSequence.charAt(i2);
        char c2 = this.f49933a;
        return (cCharAt == c2 || (!uVar.f49991b && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c2)))) ? i2 + 1 : ~i2;
    }

    public final String toString() {
        char c2 = this.f49933a;
        if (c2 == '\'') {
            return "''";
        }
        return "'" + c2 + "'";
    }
}
