package N1;

import android.util.SparseBooleanArray;
import u6.AbstractC4256a;
import u6.C4260e;

/* renamed from: N1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0762k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8168a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseBooleanArray f8169b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8170c;

    public C0762k(int i5) {
        this.f8168a = i5;
        switch (i5) {
            case 1:
                this.f8169b = new SparseBooleanArray();
                break;
            default:
                this.f8169b = new SparseBooleanArray();
                break;
        }
    }

    public final void a(int i5) {
        switch (this.f8168a) {
            case 0:
                Q1.k.g(!this.f8170c);
                this.f8169b.append(i5, true);
                break;
            default:
                AbstractC4256a.i(!this.f8170c);
                this.f8169b.append(i5, true);
                break;
        }
    }

    public C0763l b() {
        Q1.k.g(!this.f8170c);
        this.f8170c = true;
        return new C0763l(this.f8169b);
    }

    public C4260e c() {
        AbstractC4256a.i(!this.f8170c);
        this.f8170c = true;
        return new C4260e(this.f8169b);
    }
}
