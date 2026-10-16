package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bpz {
    public final defpackage.bcr a;
    public final defpackage.bcr b;
    public final defpackage.bcr c;
    public final defpackage.bcr d;
    public final defpackage.bcr e;
    public final defpackage.bcr f;
    public final defpackage.bcr g;
    public final defpackage.bcr h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bpz() {
        this(defpackage.bpy.a, defpackage.bpy.b, defpackage.bpy.c, defpackage.bpy.d, defpackage.bpy.f, defpackage.bpy.e, defpackage.bpy.g, defpackage.bpy.h);
        defpackage.bcr bcrVar = defpackage.bpy.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bpz)) {
            return false;
        }
        defpackage.bpz bpzVar = (defpackage.bpz) obj;
        return defpackage.afga.f(this.a, bpzVar.a) && defpackage.afga.f(this.b, bpzVar.b) && defpackage.afga.f(this.c, bpzVar.c) && defpackage.afga.f(this.d, bpzVar.d) && defpackage.afga.f(this.e, bpzVar.e) && defpackage.afga.f(this.f, bpzVar.f) && defpackage.afga.f(this.g, bpzVar.g) && defpackage.afga.f(this.h, bpzVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final java.lang.String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ")";
    }

    public bpz(defpackage.bcr bcrVar, defpackage.bcr bcrVar2, defpackage.bcr bcrVar3, defpackage.bcr bcrVar4, defpackage.bcr bcrVar5, defpackage.bcr bcrVar6, defpackage.bcr bcrVar7, defpackage.bcr bcrVar8) {
        this.a = bcrVar;
        this.b = bcrVar2;
        this.c = bcrVar3;
        this.d = bcrVar4;
        this.e = bcrVar5;
        this.f = bcrVar6;
        this.g = bcrVar7;
        this.h = bcrVar8;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bpz(defpackage.bcr bcrVar, defpackage.bcr bcrVar2, defpackage.bcr bcrVar3, defpackage.bcr bcrVar4, defpackage.bcr bcrVar5) {
        this(bcrVar, bcrVar2, bcrVar3, bcrVar4, bcrVar5, defpackage.bpy.e, defpackage.bpy.g, defpackage.bpy.h);
        defpackage.bcr bcrVar6 = defpackage.bpy.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bpz(byte[] bArr) {
        this(defpackage.bpy.a, defpackage.bpy.b, defpackage.bpy.c, defpackage.bpy.d, defpackage.bpy.f);
        defpackage.bcr bcrVar = defpackage.bpy.a;
    }
}
