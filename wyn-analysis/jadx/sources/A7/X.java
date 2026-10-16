package A7;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.AbstractC1732v;

/* loaded from: classes4.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public String f741a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f742b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f743c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f744d;

    /* renamed from: e, reason: collision with root package name */
    public Object f745e;

    public X(Z z2, String str, boolean z10) {
        this.f745e = z2;
        AbstractC1732v.f(str);
        this.f741a = str;
        this.f742b = z10;
    }

    public m9.H a() {
        if (this.f742b || !this.f741a.equals("firestore.googleapis.com")) {
            return new m9.H(this);
        }
        throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
    }

    public void b(m9.P p10) {
        if (this.f744d) {
            throw new IllegalStateException("Deprecated setPersistenceEnabled() or setCacheSizeBytes() is already used, remove those first.");
        }
        if (!(p10 instanceof m9.Q) && !(p10 instanceof m9.T)) {
            throw new IllegalArgumentException("Only MemoryCacheSettings and PersistentCacheSettings are accepted");
        }
        this.f745e = p10;
    }

    public void c(boolean z2) {
        SharedPreferences.Editor editorEdit = ((Z) this.f745e).l0().edit();
        editorEdit.putBoolean(this.f741a, z2);
        editorEdit.apply();
        this.f744d = z2;
    }

    public boolean d() {
        if (!this.f743c) {
            this.f743c = true;
            this.f744d = ((Z) this.f745e).l0().getBoolean(this.f741a, this.f742b);
        }
        return this.f744d;
    }

    public X() {
        this.f744d = false;
        this.f741a = "firestore.googleapis.com";
        this.f742b = true;
        this.f743c = true;
    }
}
