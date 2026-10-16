package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes2.dex */
public final class hay implements gmw {
    public final boolean a;
    public final fzg b;
    public final List c;
    public final List d;
    public final fzy e;
    public final boolean f;
    public final float g;
    public final int h;
    public final int i;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ hay(boolean z, fzg fzgVar, List list, List list2, int i, int i2, fzy fzyVar, boolean z2, float f, int i3) {
        List list3 = (i3 & 4) != 0 ? afbe.a : list;
        List list4 = (i3 & 8) != 0 ? afbe.a : list2;
        int i4 = (i3 & 16) != 0 ? 2 : i;
        int i5 = (i3 & 32) != 0 ? 2 : i2;
        int i6 = i3 & 1;
        fzg fzgVar2 = (i3 & 2) != 0 ? null : fzgVar;
        int i7 = (z ? 1 : 0) & (i6 ^ 1);
        this(1 == i7, fzgVar2, list3, list4, i4, i5, (i3 & 64) != 0 ? null : fzyVar, ((i3 & 128) == 0) & z2, (i3 & 256) != 0 ? 1.0f : f);
    }

    public static /* synthetic */ hay b(hay hayVar, List list) {
        boolean z = hayVar.a;
        fzg fzgVar = hayVar.b;
        List list2 = hayVar.d;
        int i = hayVar.h;
        int i2 = hayVar.i;
        fzy fzyVar = hayVar.e;
        boolean z2 = hayVar.f;
        float f = hayVar.g;
        list.getClass();
        return new hay(z, fzgVar, list, list2, i, i2, fzyVar, z2, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0090 -> B:29:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a0 -> B:32:0x00a2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.geu r8, defpackage.afck r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.hax
            if (r0 == 0) goto L13
            r0 = r9
            hax r0 = (defpackage.hax) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            hax r0 = new hax
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.e
            afcr r1 = defpackage.afcr.a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.d
            hay r8 = r0.h
            java.lang.Object r2 = r0.c
            java.lang.Object r4 = r0.b
            java.lang.Object r5 = r0.a
            defpackage.woy.dF(r9)
            goto L96
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            defpackage.woy.dF(r9)
            java.util.List r9 = r7.c
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto Lab
            java.util.Iterator r2 = r9.iterator()
        L48:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto Lab
            java.lang.Object r4 = r2.next()
            haw r4 = (defpackage.haw) r4
            boolean r4 = r4.i()
            if (r4 != 0) goto L48
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = defpackage.woy.bp(r9, r4)
            r2.<init>(r4)
            java.util.Iterator r9 = r9.iterator()
        L69:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto La7
            java.lang.Object r4 = r9.next()
            haw r4 = (defpackage.haw) r4
            boolean r5 = r4.i()
            if (r5 != 0) goto La0
            r0.a = r8
            r0.b = r2
            r0.c = r9
            r0.h = r7
            r0.d = r2
            r0.g = r3
            r5 = r8
            geu r5 = (defpackage.geu) r5
            java.lang.Object r4 = r4.g(r5, r0)
            if (r4 == r1) goto L9f
            r5 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r4
            r4 = r7
        L96:
            haw r9 = (defpackage.haw) r9
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r5
            r5 = r9
            r9 = r6
            goto La2
        L9f:
            return r1
        La0:
            r5 = r4
            r4 = r2
        La2:
            r2.add(r5)
            r2 = r4
            goto L69
        La7:
            hay r7 = b(r7, r2)
        Lab:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hay.a(geu, afck):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hay)) {
            return false;
        }
        hay hayVar = (hay) obj;
        return this.a == hayVar.a && affa.f(this.b, hayVar.b) && affa.f(this.c, hayVar.c) && affa.f(this.d, hayVar.d) && this.h == hayVar.h && this.i == hayVar.i && affa.f(this.e, hayVar.e) && this.f == hayVar.f && Float.compare(this.g, hayVar.g) == 0;
    }

    public final int hashCode() {
        fzg fzgVar = this.b;
        int iF = (((((a.f(this.a) * 31) + (fzgVar == null ? 0 : fzgVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        int i = this.h;
        int i2 = this.i;
        fzy fzyVar = this.e;
        return (((((((((iF * 31) + i) * 31) + i2) * 31) + (fzyVar != null ? fzyVar.hashCode() : 0)) * 31) + a.f(this.f)) * 31) + Float.floatToIntBits(this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionedItemTemplateInternal(isLoading=");
        sb.append(this.a);
        sb.append(", header=");
        sb.append(this.b);
        sb.append(", sections=");
        sb.append(this.c);
        sb.append(", actions=");
        sb.append(this.d);
        sb.append(", alphabeticalIndexingStrategy=");
        int i = this.h;
        sb.append((Object) (i != 1 ? i != 2 ? "TITLE_IGNORE_ARTICLES_AND_SYMBOLS" : "TITLE_AS_IS" : "DISABLED"));
        sb.append(", scrollStatePersistenceStrategy=");
        sb.append((Object) (this.i != 1 ? "PRESERVE_INDEX" : "DISABLED"));
        sb.append(", backgroundImage=");
        sb.append(this.e);
        sb.append(", forceHighContrastGridItemText=");
        sb.append(this.f);
        sb.append(", backgroundImageAlpha=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public hay(boolean z, fzg fzgVar, List list, List list2, int i, int i2, fzy fzyVar, boolean z2, float f) {
        list.getClass();
        list2.getClass();
        if (i == 0 || i2 == 0) {
            throw null;
        }
        this.a = z;
        this.b = fzgVar;
        this.c = list;
        this.d = list2;
        this.h = i;
        this.i = i2;
        this.e = fzyVar;
        this.f = z2;
        this.g = f;
    }

    public hay() {
        this(false, null, null, null, 0, 0, null, false, BitmapDescriptorFactory.HUE_RED, 511);
    }
}
