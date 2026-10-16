package h4;

import A.AbstractC0213f;
import android.graphics.drawable.Drawable;
import f4.C2556c;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class o extends i {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f36133a;

    /* renamed from: b, reason: collision with root package name */
    public final h f36134b;

    /* renamed from: c, reason: collision with root package name */
    public final int f36135c;

    /* renamed from: d, reason: collision with root package name */
    public final C2556c f36136d;

    /* renamed from: e, reason: collision with root package name */
    public final String f36137e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f36138f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f36139g;

    public o(Drawable drawable, h hVar, int i5, C2556c c2556c, String str, boolean z2, boolean z10) {
        this.f36133a = drawable;
        this.f36134b = hVar;
        this.f36135c = i5;
        this.f36136d = c2556c;
        this.f36137e = str;
        this.f36138f = z2;
        this.f36139g = z10;
    }

    @Override // h4.i
    public final h a() {
        return this.f36134b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return AbstractC3340k.a(this.f36133a, oVar.f36133a) && AbstractC3340k.a(this.f36134b, oVar.f36134b) && this.f36135c == oVar.f36135c && AbstractC3340k.a(this.f36136d, oVar.f36136d) && AbstractC3340k.a(this.f36137e, oVar.f36137e) && this.f36138f == oVar.f36138f && this.f36139g == oVar.f36139g;
    }

    public final int hashCode() {
        int iD = AbstractC0213f.d(this.f36135c, (this.f36134b.hashCode() + (this.f36133a.hashCode() * 31)) * 31, 31);
        C2556c c2556c = this.f36136d;
        int iHashCode = (iD + (c2556c != null ? c2556c.hashCode() : 0)) * 31;
        String str = this.f36137e;
        return ((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.f36138f ? 1231 : 1237)) * 31) + (this.f36139g ? 1231 : 1237);
    }
}
