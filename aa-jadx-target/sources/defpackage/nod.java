package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nod {
    public static final defpackage.nod a = new defpackage.nod(null, null, null, false, false, false, 0, false, false, false, 0, 0, null, null, null, null, null, null, null, 0, 1048575);
    public final defpackage.noc b;
    public final defpackage.noc c;
    public final com.google.android.apps.auto.components.graphics.icon.GhIcon d;
    public boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final java.lang.CharSequence l;
    public final java.lang.CharSequence m;
    public final defpackage.afer n;
    public final defpackage.noc o;
    public final defpackage.noc p;
    public final defpackage.noc q;
    public final android.content.ComponentName r;
    public final int s;
    public final int t;
    public final int u;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nod(defpackage.noc nocVar, defpackage.noc nocVar2, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, int i2, int i3, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, defpackage.afer aferVar, defpackage.noc nocVar3, defpackage.noc nocVar4, defpackage.noc nocVar5, android.content.ComponentName componentName, int i4, int i5) {
        defpackage.noc nocVar6 = (i5 & 1) != 0 ? new defpackage.noc((com.google.android.apps.auto.components.graphics.icon.GhIcon) null, (defpackage.afer) (0 == true ? 1 : 0), 7) : nocVar;
        this(nocVar6, (i5 & 2) != 0 ? null : nocVar2, (i5 & 4) != 0 ? null : ghIcon, ((i5 & 8) == 0) & z, ((i5 & 16) == 0) & z2, ((i5 & 32) == 0) & z3, (i5 & 64) != 0 ? 0 : i, ((i5 & 128) == 0) & z4, ((i5 & 256) == 0) & z5, ((i5 & 512) == 0) & z6, (i5 & 1024) != 0 ? 1 : i2, (i5 & 2048) == 0 ? i3 : 1, (i5 & 4096) != 0 ? "" : charSequence, (i5 & 8192) != 0 ? "" : charSequence2, (i5 & 16384) != 0 ? new defpackage.nhn(7) : aferVar, (i5 & 32768) != 0 ? null : nocVar3, (i5 & 65536) != 0 ? null : nocVar4, (i5 & 131072) != 0 ? null : nocVar5, (i5 & 262144) != 0 ? new android.content.ComponentName("com.google.android.projection.gearhead", "") : componentName, (i5 & 524288) != 0 ? 4 : i4);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.nod)) {
            return false;
        }
        defpackage.nod nodVar = (defpackage.nod) obj;
        return defpackage.afga.f(this.b, nodVar.b) && defpackage.afga.f(this.c, nodVar.c) && defpackage.afga.f(this.d, nodVar.d) && this.e == nodVar.e && this.f == nodVar.f && this.g == nodVar.g && this.h == nodVar.h && this.i == nodVar.i && this.j == nodVar.j && this.k == nodVar.k && this.s == nodVar.s && this.t == nodVar.t && defpackage.afga.f(this.l, nodVar.l) && defpackage.afga.f(this.m, nodVar.m) && defpackage.afga.f(this.n, nodVar.n) && defpackage.afga.f(this.o, nodVar.o) && defpackage.afga.f(this.p, nodVar.p) && defpackage.afga.f(this.q, nodVar.q) && defpackage.afga.f(this.r, nodVar.r) && this.u == nodVar.u;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        defpackage.noc nocVar = this.c;
        int iHashCode2 = (iHashCode + (nocVar == null ? 0 : nocVar.hashCode())) * 31;
        com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon = this.d;
        int iHashCode3 = (((((((((((((((((((iHashCode2 + (ghIcon == null ? 0 : ghIcon.hashCode())) * 31) + (true != this.e ? 1237 : 1231)) * 31) + (true != this.f ? 1237 : 1231)) * 31) + (true != this.g ? 1237 : 1231)) * 31) + this.h) * 31) + (true != this.i ? 1237 : 1231)) * 31) + (true != this.j ? 1237 : 1231)) * 31) + (true == this.k ? 1231 : 1237)) * 31) + this.s) * 31) + this.t) * 31;
        java.lang.CharSequence charSequence = this.l;
        int iHashCode4 = (iHashCode3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        java.lang.CharSequence charSequence2 = this.m;
        int iHashCode5 = (((iHashCode4 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31) + this.n.hashCode()) * 31;
        defpackage.noc nocVar2 = this.o;
        int iHashCode6 = (iHashCode5 + (nocVar2 == null ? 0 : nocVar2.hashCode())) * 31;
        defpackage.noc nocVar3 = this.p;
        int iHashCode7 = (iHashCode6 + (nocVar3 == null ? 0 : nocVar3.hashCode())) * 31;
        defpackage.noc nocVar4 = this.q;
        return ((((iHashCode7 + (nocVar4 != null ? nocVar4.hashCode() : 0)) * 31) + this.r.hashCode()) * 31) + this.u;
    }

    public final java.lang.String toString() {
        java.lang.String str;
        boolean z = this.e;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RailWidgetUiState(appAction=");
        sb.append(this.b);
        sb.append(", largeIcon=");
        sb.append(this.c);
        sb.append(", badgeIcon=");
        sb.append(this.d);
        sb.append(", animateAppAction=");
        sb.append(z);
        sb.append(", circularCorners=");
        sb.append(this.f);
        sb.append(", tintIcon=");
        sb.append(this.g);
        sb.append(", color=");
        sb.append(this.h);
        sb.append(", showText=");
        sb.append(this.i);
        sb.append(", showActions=");
        sb.append(this.j);
        sb.append(", maxWidth=");
        sb.append(this.k);
        sb.append(", textContainerSizingBehavior=");
        sb.append((java.lang.Object) (this.s != 1 ? "FULL_SIZE" : "DYNAMIC"));
        sb.append(", focusBehavior=");
        sb.append((java.lang.Object) defpackage.nsu.d(this.t));
        sb.append(", firstLineText=");
        sb.append((java.lang.Object) this.l);
        sb.append(", secondLineText=");
        sb.append((java.lang.Object) this.m);
        sb.append(", contentAction=");
        sb.append(this.n);
        sb.append(", leftAction=");
        sb.append(this.o);
        sb.append(", centerAction=");
        sb.append(this.p);
        sb.append(", rightAction=");
        sb.append(this.q);
        sb.append(", appComponent=");
        sb.append(this.r);
        sb.append(", category=");
        int i = this.u;
        if (i == 1) {
            str = "COMMS";
        } else if (i != 2) {
            str = i != 3 ? "OTHER" : "MEDIA";
        } else {
            str = "NAVIGATION";
        }
        sb.append((java.lang.Object) str);
        sb.append(")");
        return sb.toString();
    }

    public nod(defpackage.noc nocVar, defpackage.noc nocVar2, com.google.android.apps.auto.components.graphics.icon.GhIcon ghIcon, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, int i2, int i3, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, defpackage.afer aferVar, defpackage.noc nocVar3, defpackage.noc nocVar4, defpackage.noc nocVar5, android.content.ComponentName componentName, int i4) {
        nocVar.getClass();
        if (i2 != 0 && i3 != 0) {
            aferVar.getClass();
            componentName.getClass();
            if (i4 != 0) {
                this.b = nocVar;
                this.c = nocVar2;
                this.d = ghIcon;
                this.e = z;
                this.f = z2;
                this.g = z3;
                this.h = i;
                this.i = z4;
                this.j = z5;
                this.k = z6;
                this.s = i2;
                this.t = i3;
                this.l = charSequence;
                this.m = charSequence2;
                this.n = aferVar;
                this.o = nocVar3;
                this.p = nocVar4;
                this.q = nocVar5;
                this.r = componentName;
                this.u = i4;
                return;
            }
        }
        throw null;
    }

    public nod() {
        this(null, null, null, false, false, false, 0, false, false, false, 0, 0, null, null, null, null, null, null, null, 0, 1048575);
    }
}
