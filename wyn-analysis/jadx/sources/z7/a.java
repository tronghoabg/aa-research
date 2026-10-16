package Z7;

import android.graphics.Typeface;
import y3.C4552j;

/* loaded from: classes4.dex */
public final class a extends Fe.b {

    /* renamed from: b, reason: collision with root package name */
    public final Typeface f17010b;

    /* renamed from: c, reason: collision with root package name */
    public final C4552j f17011c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17012d;

    public a(C4552j c4552j, Typeface typeface) {
        this.f17010b = typeface;
        this.f17011c = c4552j;
    }

    @Override // Fe.b
    public final void K(int i5) {
        if (this.f17012d) {
            return;
        }
        W7.b bVar = (W7.b) this.f17011c.f48001b;
        if (bVar.j(this.f17010b)) {
            bVar.h(false);
        }
    }

    @Override // Fe.b
    public final void L(Typeface typeface, boolean z2) {
        if (this.f17012d) {
            return;
        }
        W7.b bVar = (W7.b) this.f17011c.f48001b;
        if (bVar.j(typeface)) {
            bVar.h(false);
        }
    }
}
