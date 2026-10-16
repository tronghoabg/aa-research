package defpackage;

/* loaded from: classes2.dex */
public final class gbv implements hju {
    public final String a;
    public final gcq b;
    public final boolean c;
    public final gbg d;
    public final afec e;
    public final afec f;
    public final afdr g;
    public final boolean h;
    public final boolean i;
    private final boolean k = false;
    private final boolean l = false;
    public final int j = 1;

    public gbv(String str, gcq gcqVar, boolean z, gbg gbgVar, afec afecVar, afec afecVar2, afdr afdrVar, boolean z2, boolean z3) {
        this.a = str;
        this.b = gcqVar;
        this.c = z;
        this.d = gbgVar;
        this.e = afecVar;
        this.f = afecVar2;
        this.g = afdrVar;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbv)) {
            return false;
        }
        gbv gbvVar = (gbv) obj;
        if (!affa.f(this.a, gbvVar.a) || !affa.f(this.b, gbvVar.b) || this.c != gbvVar.c || !affa.f(this.d, gbvVar.d) || !affa.f(this.e, gbvVar.e) || !affa.f(this.f, gbvVar.f) || !affa.f(this.g, gbvVar.g) || this.h != gbvVar.h) {
            return false;
        }
        boolean z = gbvVar.k;
        if (this.i != gbvVar.i) {
            return false;
        }
        boolean z2 = gbvVar.l;
        int i = gbvVar.j;
        return a.Y(1, 1);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((((((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + a.f(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        afdr afdrVar = this.g;
        return (((((((((((iHashCode * 31) + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31) + a.f(this.h)) * 31) + a.f(false)) * 31) + a.f(this.i)) * 31) + a.f(false)) * 31) + 1;
    }

    public final String toString() {
        return "CarTextFieldUiModel(initialText=" + this.a + ", hint=" + this.b + ", showKeyboardByDefault=" + this.c + ", leadingIcon=" + this.d + ", onTextChanged=" + this.e + ", onSubmit=" + this.f + ", onTriggerTranscription=" + this.g + ", enabled=" + this.h + ", isError=false, voiceOnlyEnabled=" + this.i + ", showActiveIndicator=false, keyboardType=" + djf.a(1) + ")";
    }
}
