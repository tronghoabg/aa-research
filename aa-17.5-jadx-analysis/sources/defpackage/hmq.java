package defpackage;

/* loaded from: classes2.dex */
public final class hmq extends hjt {
    public final fwi a;
    public final afec b;
    public final fzp c;
    public final gcq d;
    public final int e;
    private final hga f;
    private final boolean g;

    public hmq(fwi fwiVar, afec afecVar, fzp fzpVar, gcq gcqVar, int i, hga hgaVar, boolean z) {
        super(z, false);
        this.a = fwiVar;
        this.b = afecVar;
        this.c = fzpVar;
        this.d = gcqVar;
        this.e = i;
        this.f = hgaVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmq)) {
            return false;
        }
        hmq hmqVar = (hmq) obj;
        return affa.f(this.a, hmqVar.a) && affa.f(this.b, hmqVar.b) && affa.f(this.c, hmqVar.c) && affa.f(this.d, hmqVar.d) && this.e == hmqVar.e && affa.f(this.f, hmqVar.f) && this.g == hmqVar.g;
    }

    public final int hashCode() {
        fwi fwiVar = this.a;
        int iHashCode = ((fwiVar == null ? 0 : fwiVar.hashCode()) * 31) + this.b.hashCode();
        fzp fzpVar = this.c;
        int iHashCode2 = ((iHashCode * 31) + (fzpVar == null ? 0 : fzpVar.hashCode())) * 31;
        gcq gcqVar = this.d;
        return ((((((iHashCode2 + (gcqVar != null ? gcqVar.hashCode() : 0)) * 31) + this.e) * 31) + this.f.hashCode()) * 31) + a.f(this.g);
    }

    public final String toString() {
        return "VoicePlateWidgetUiModel(action=" + this.a + ", stopVoiceSession=" + this.b + ", icon=" + this.c + ", text=" + this.d + ", transcriptionState=" + ((Object) hdb.c(this.e)) + ", surfaceCallbacks=" + this.f + ", surfaceCallbackRegistered=" + this.g + ")";
    }
}
