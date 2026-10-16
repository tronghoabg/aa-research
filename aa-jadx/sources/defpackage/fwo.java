package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fwo {
    public final defpackage.fwn a;
    public final defpackage.fwn b;
    public final defpackage.fwn c;
    public final defpackage.fwn d;
    public final defpackage.fwn e;
    public final defpackage.fwn f;
    public final defpackage.fwn g;
    public final defpackage.fwn h;

    public fwo(defpackage.fwn fwnVar, defpackage.fwn fwnVar2, defpackage.fwn fwnVar3, defpackage.fwn fwnVar4, defpackage.fwn fwnVar5, defpackage.fwn fwnVar6, defpackage.fwn fwnVar7, defpackage.fwn fwnVar8) {
        this.a = fwnVar;
        this.b = fwnVar2;
        this.c = fwnVar3;
        this.d = fwnVar4;
        this.e = fwnVar5;
        this.f = fwnVar6;
        this.g = fwnVar7;
        this.h = fwnVar8;
    }

    public static final defpackage.fwo a(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5, java.lang.Integer num6, java.lang.Integer num7, java.lang.Integer num8) {
        return new defpackage.fwo(defpackage.fvv.e(num), defpackage.fvv.e(num2), defpackage.fvv.e(num3), defpackage.fvv.e(num4), defpackage.fvv.e(num5), defpackage.fvv.e(num6), defpackage.fvv.e(num7), defpackage.fvv.e(num8));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.fwo)) {
            return false;
        }
        defpackage.fwo fwoVar = (defpackage.fwo) obj;
        return defpackage.afga.f(this.a, fwoVar.a) && defpackage.afga.f(this.b, fwoVar.b) && defpackage.afga.f(this.c, fwoVar.c) && defpackage.afga.f(this.d, fwoVar.d) && defpackage.afga.f(this.e, fwoVar.e) && defpackage.afga.f(this.f, fwoVar.f) && defpackage.afga.f(this.g, fwoVar.g) && defpackage.afga.f(this.h, fwoVar.h);
    }

    public final int hashCode() {
        defpackage.fwn fwnVar = this.a;
        int iHashCode = fwnVar == null ? 0 : fwnVar.hashCode();
        defpackage.fwn fwnVar2 = this.b;
        int iHashCode2 = fwnVar2 == null ? 0 : fwnVar2.hashCode();
        int i = iHashCode * 31;
        defpackage.fwn fwnVar3 = this.c;
        int iHashCode3 = (((i + iHashCode2) * 31) + (fwnVar3 == null ? 0 : fwnVar3.hashCode())) * 31;
        defpackage.fwn fwnVar4 = this.d;
        int iHashCode4 = (iHashCode3 + (fwnVar4 == null ? 0 : fwnVar4.hashCode())) * 31;
        defpackage.fwn fwnVar5 = this.e;
        int iHashCode5 = (iHashCode4 + (fwnVar5 == null ? 0 : fwnVar5.hashCode())) * 31;
        defpackage.fwn fwnVar6 = this.f;
        int iHashCode6 = (iHashCode5 + (fwnVar6 == null ? 0 : fwnVar6.hashCode())) * 31;
        defpackage.fwn fwnVar7 = this.g;
        int iHashCode7 = (iHashCode6 + (fwnVar7 == null ? 0 : fwnVar7.hashCode())) * 31;
        defpackage.fwn fwnVar8 = this.h;
        return iHashCode7 + (fwnVar8 != null ? fwnVar8.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ActionButtonColors(containerColor=" + this.a + ", contentColor=" + this.b + ", iconOnlyContentColor=" + this.c + ", focusRingColor=" + this.d + ", focusRingInnerColor=" + this.e + ", pressedContentColor=" + this.f + ", disabledContainerColor=" + this.g + ", disabledContentColor=" + this.h + ")";
    }

    public fwo() {
        this(null, null, null, null, null, null, null, null);
    }
}
