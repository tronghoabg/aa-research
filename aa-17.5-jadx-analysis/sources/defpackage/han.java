package defpackage;

import androidx.car.app.model.CarText;
import androidx.car.app.model.Metadata;
import java.util.List;

/* loaded from: classes2.dex */
public final class han extends ham {
    public final boolean a;
    public final CarText b;
    public final List c;
    public final boolean d;
    public final fzy e;
    public final afdr f;
    public final Metadata g;
    public final String h;
    public final gbw i;
    public final boolean j;
    public final List k;
    public final fzy l;
    public final gby m;
    public final int n;
    public final int o;
    private final boolean p;

    public /* synthetic */ han(boolean z, CarText carText, List list, boolean z2, fzy fzyVar, int i, afdr afdrVar, Metadata metadata, boolean z3, String str, gbw gbwVar, boolean z4, List list2, fzy fzyVar2, int i2, gby gbyVar, int i3) {
        this(1 == ((i3 & 1) | (z ? 1 : 0)), carText, (i3 & 4) != 0 ? afbe.a : list, ((i3 & 8) == 0) & z2, (i3 & 16) != 0 ? null : fzyVar, (i3 & 32) != 0 ? 2 : i, (i3 & 64) != 0 ? null : afdrVar, (i3 & 128) != 0 ? null : metadata, (!((i3 & 256) == 0)) | z3, (i3 & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? null : str, (i3 & 1024) != 0 ? null : gbwVar, ((i3 & 2048) == 0) & z4, (i3 & 4096) != 0 ? afbe.a : list2, (i3 & 8192) != 0 ? null : fzyVar2, (i3 & 16384) != 0 ? 2 : i2, (i3 & 32768) != 0 ? null : gbyVar);
    }

    public static /* synthetic */ han c(han hanVar, boolean z, fzy fzyVar, afdr afdrVar, Metadata metadata, List list, int i) {
        boolean z2 = (i & 1) != 0 ? hanVar.a : false;
        CarText carText = (i & 2) != 0 ? hanVar.b : null;
        List list2 = (i & 4) != 0 ? hanVar.c : null;
        boolean z3 = (i & 8) != 0 ? hanVar.d : z;
        fzy fzyVar2 = (i & 16) != 0 ? hanVar.e : fzyVar;
        int i2 = (i & 32) != 0 ? hanVar.n : 0;
        afdr afdrVar2 = (i & 64) != 0 ? hanVar.f : afdrVar;
        Metadata metadata2 = (i & 128) != 0 ? hanVar.g : metadata;
        boolean z4 = (i & 256) != 0 ? hanVar.p : false;
        String str = (i & sk.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? hanVar.h : null;
        gbw gbwVar = (i & 1024) != 0 ? hanVar.i : null;
        boolean z5 = (i & 2048) != 0 ? hanVar.j : false;
        List list3 = (i & 4096) != 0 ? hanVar.k : list;
        fzy fzyVar3 = hanVar.l;
        int i3 = hanVar.o;
        gby gbyVar = hanVar.m;
        carText.getClass();
        list2.getClass();
        if (i2 == 0) {
            throw null;
        }
        list3.getClass();
        return new han(z2, carText, list2, z3, fzyVar2, i2, afdrVar2, metadata2, z4, str, gbwVar, z5, list3, fzyVar3, i3, gbyVar);
    }

    @Override // defpackage.ham
    public final CarText a() {
        return this.b;
    }

    @Override // defpackage.ham
    public final boolean b() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof han)) {
            return false;
        }
        han hanVar = (han) obj;
        return this.a == hanVar.a && affa.f(this.b, hanVar.b) && affa.f(this.c, hanVar.c) && this.d == hanVar.d && affa.f(this.e, hanVar.e) && this.n == hanVar.n && affa.f(this.f, hanVar.f) && affa.f(this.g, hanVar.g) && this.p == hanVar.p && affa.f(this.h, hanVar.h) && affa.f(this.i, hanVar.i) && this.j == hanVar.j && affa.f(this.k, hanVar.k) && affa.f(this.l, hanVar.l) && this.o == hanVar.o && affa.f(this.m, hanVar.m);
    }

    public final int hashCode() {
        int iF = (((a.f(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        fzy fzyVar = this.e;
        int iF2 = ((((((iF * 31) + a.f(this.d)) * 31) + (fzyVar == null ? 0 : fzyVar.hashCode())) * 31) + this.n) * 31;
        afdr afdrVar = this.f;
        int iHashCode = (iF2 + (afdrVar == null ? 0 : afdrVar.hashCode())) * 31;
        Metadata metadata = this.g;
        int iHashCode2 = (((iHashCode + (metadata == null ? 0 : metadata.hashCode())) * 31) + a.f(this.p)) * 31;
        String str = this.h;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        gbw gbwVar = this.i;
        int iHashCode4 = (((((iHashCode3 + (gbwVar == null ? 0 : gbwVar.hashCode())) * 31) + a.f(this.j)) * 31) + this.k.hashCode()) * 31;
        fzy fzyVar2 = this.l;
        int iHashCode5 = (((iHashCode4 + (fzyVar2 == null ? 0 : fzyVar2.hashCode())) * 31) + this.o) * 31;
        gby gbyVar = this.m;
        return iHashCode5 + (gbyVar != null ? gbyVar.hashCode() : 0);
    }

    public final String toString() {
        return "RowInternal(isEnabled=" + this.a + ", title=" + this.b + ", texts=" + this.c + ", emphasizeRow=" + this.d + ", leadingImage=" + this.e + ", leadingImageSize=" + ((Object) gqk.j(this.n)) + ", onClick=" + this.f + ", metadata=" + this.g + ", isIndexable=" + this.p + ", decoration=" + this.h + ", toggle=" + this.i + ", isBrowsable=" + this.j + ", actionPlaceholders=" + this.k + ", trailingImage=" + this.l + ", trailingImageSize=" + ((Object) gqk.j(this.o)) + ", progressBar=" + this.m + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public han(boolean z, CarText carText, List list, boolean z2, fzy fzyVar, int i, afdr afdrVar, Metadata metadata, boolean z3, String str, gbw gbwVar, boolean z4, List list2, fzy fzyVar2, int i2, gby gbyVar) {
        super(z3);
        list.getClass();
        list2.getClass();
        if (i2 != 0) {
            this.a = z;
            this.b = carText;
            this.c = list;
            this.d = z2;
            this.e = fzyVar;
            this.n = i;
            this.f = afdrVar;
            this.g = metadata;
            this.p = z3;
            this.h = str;
            this.i = gbwVar;
            this.j = z4;
            this.k = list2;
            this.l = fzyVar2;
            this.o = i2;
            this.m = gbyVar;
            int i3 = gbwVar != null ? 1 : 0;
            i3 = z4 ? i3 + 1 : i3;
            if (((list2.size() != 1 && fzyVar2 == null && str == null) ? i3 : i3 + 1) > 1) {
                throw new IllegalArgumentException("RowInternal does not support more than 1 trailing widget");
            }
            return;
        }
        throw null;
    }
}
