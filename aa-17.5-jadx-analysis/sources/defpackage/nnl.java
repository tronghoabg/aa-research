package defpackage;

import android.content.ComponentName;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;

/* loaded from: classes.dex */
public final class nnl {
    public static final nnl a = new nnl(null, null, null, false, false, false, 0, false, false, false, 0, 0, null, null, null, null, null, null, null, 0, 1048575);
    public final nnk b;
    public final nnk c;
    public final GhIcon d;
    public boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final CharSequence l;
    public final CharSequence m;
    public final afdr n;
    public final nnk o;
    public final nnk p;
    public final nnk q;
    public final ComponentName r;
    public final int s;
    public final int t;
    public final int u;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ nnl(nnk nnkVar, nnk nnkVar2, GhIcon ghIcon, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, afdr afdrVar, nnk nnkVar3, nnk nnkVar4, nnk nnkVar5, ComponentName componentName, int i4, int i5) {
        afdr afdrVar2;
        ComponentName componentName2;
        nnk nnkVar6 = (i5 & 1) != 0 ? new nnk((GhIcon) null, (afdr) (0 == true ? 1 : 0), 7) : nnkVar;
        nnk nnkVar7 = (i5 & 2) != 0 ? null : nnkVar2;
        GhIcon ghIcon2 = (i5 & 4) != 0 ? null : ghIcon;
        boolean z7 = ((i5 & 8) == 0) & z;
        boolean z8 = ((i5 & 16) == 0) & z2;
        boolean z9 = ((i5 & 32) == 0) & z3;
        int i6 = (i5 & 64) != 0 ? 0 : i;
        boolean z10 = ((i5 & 128) == 0) & z4;
        boolean z11 = ((i5 & 256) == 0) & z5;
        boolean z12 = ((i5 & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0) & z6;
        int i7 = (i5 & 1024) != 0 ? 1 : i2;
        int i8 = (i5 & 2048) != 0 ? 1 : i3;
        CharSequence charSequence3 = (i5 & 4096) != 0 ? "" : charSequence;
        CharSequence charSequence4 = (i5 & 8192) != 0 ? "" : charSequence2;
        nnk nnkVar8 = nnkVar6;
        afdr nnjVar = (i5 & 16384) != 0 ? new nnj(1) : afdrVar;
        nnk nnkVar9 = (i5 & 32768) != 0 ? null : nnkVar3;
        nnk nnkVar10 = (i5 & 65536) != 0 ? null : nnkVar4;
        nnk nnkVar11 = (i5 & 131072) != 0 ? null : nnkVar5;
        nnk nnkVar12 = nnkVar9;
        if ((i5 & 262144) != 0) {
            afdrVar2 = nnjVar;
            componentName2 = new ComponentName("com.google.android.projection.gearhead", "");
        } else {
            afdrVar2 = nnjVar;
            componentName2 = componentName;
        }
        this(nnkVar8, nnkVar7, ghIcon2, z7, z8, z9, i6, z10, z11, z12, i7, i8, charSequence3, charSequence4, afdrVar2, nnkVar12, nnkVar10, nnkVar11, componentName2, (i5 & 524288) != 0 ? 4 : i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnl)) {
            return false;
        }
        nnl nnlVar = (nnl) obj;
        return affa.f(this.b, nnlVar.b) && affa.f(this.c, nnlVar.c) && affa.f(this.d, nnlVar.d) && this.e == nnlVar.e && this.f == nnlVar.f && this.g == nnlVar.g && this.h == nnlVar.h && this.i == nnlVar.i && this.j == nnlVar.j && this.k == nnlVar.k && this.s == nnlVar.s && this.t == nnlVar.t && affa.f(this.l, nnlVar.l) && affa.f(this.m, nnlVar.m) && affa.f(this.n, nnlVar.n) && affa.f(this.o, nnlVar.o) && affa.f(this.p, nnlVar.p) && affa.f(this.q, nnlVar.q) && affa.f(this.r, nnlVar.r) && this.u == nnlVar.u;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        nnk nnkVar = this.c;
        int iHashCode2 = (iHashCode + (nnkVar == null ? 0 : nnkVar.hashCode())) * 31;
        GhIcon ghIcon = this.d;
        int iHashCode3 = (((((((((((((((((((iHashCode2 + (ghIcon == null ? 0 : ghIcon.hashCode())) * 31) + (true != this.e ? 1237 : 1231)) * 31) + (true != this.f ? 1237 : 1231)) * 31) + (true != this.g ? 1237 : 1231)) * 31) + this.h) * 31) + (true != this.i ? 1237 : 1231)) * 31) + (true != this.j ? 1237 : 1231)) * 31) + (true == this.k ? 1231 : 1237)) * 31) + this.s) * 31) + this.t) * 31;
        CharSequence charSequence = this.l;
        int iHashCode4 = (iHashCode3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.m;
        int iHashCode5 = (((iHashCode4 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31) + this.n.hashCode()) * 31;
        nnk nnkVar2 = this.o;
        int iHashCode6 = (iHashCode5 + (nnkVar2 == null ? 0 : nnkVar2.hashCode())) * 31;
        nnk nnkVar3 = this.p;
        int iHashCode7 = (iHashCode6 + (nnkVar3 == null ? 0 : nnkVar3.hashCode())) * 31;
        nnk nnkVar4 = this.q;
        return ((((iHashCode7 + (nnkVar4 != null ? nnkVar4.hashCode() : 0)) * 31) + this.r.hashCode()) * 31) + this.u;
    }

    public final String toString() {
        boolean z = this.e;
        StringBuilder sb = new StringBuilder("RailWidgetUiState(appAction=");
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
        sb.append((Object) (this.s != 1 ? "FULL_SIZE" : "DYNAMIC"));
        sb.append(", focusBehavior=");
        sb.append((Object) nsh.d(this.t));
        sb.append(", firstLineText=");
        sb.append((Object) this.l);
        sb.append(", secondLineText=");
        sb.append((Object) this.m);
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
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? "OTHER" : "MEDIA" : "NAVIGATION" : "COMMS"));
        sb.append(")");
        return sb.toString();
    }

    public nnl(nnk nnkVar, nnk nnkVar2, GhIcon ghIcon, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, afdr afdrVar, nnk nnkVar3, nnk nnkVar4, nnk nnkVar5, ComponentName componentName, int i4) {
        nnkVar.getClass();
        if (i2 != 0 && i3 != 0) {
            afdrVar.getClass();
            componentName.getClass();
            if (i4 != 0) {
                this.b = nnkVar;
                this.c = nnkVar2;
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
                this.n = afdrVar;
                this.o = nnkVar3;
                this.p = nnkVar4;
                this.q = nnkVar5;
                this.r = componentName;
                this.u = i4;
                return;
            }
        }
        throw null;
    }

    public nnl() {
        this(null, null, null, false, false, false, 0, false, false, false, 0, 0, null, null, null, null, null, null, null, 0, 1048575);
    }
}
