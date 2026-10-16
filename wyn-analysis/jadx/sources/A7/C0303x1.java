package A7;

import android.os.Looper;
import com.google.android.gms.internal.measurement.zzdh;

/* renamed from: A7.x1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0303x1 extends Y {

    /* renamed from: c, reason: collision with root package name */
    public zzdh f1112c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1113d;

    /* renamed from: e, reason: collision with root package name */
    public final Y9.c f1114e;

    /* renamed from: f, reason: collision with root package name */
    public final B1 f1115f;

    /* renamed from: g, reason: collision with root package name */
    public final S3.s f1116g;

    public C0303x1(C0273n0 c0273n0) {
        super(c0273n0);
        this.f1113d = true;
        this.f1114e = new Y9.c(this, 4);
        this.f1115f = new B1(this);
        this.f1116g = new S3.s(this, 2);
    }

    @Override // A7.Y
    public final boolean j0() {
        return false;
    }

    public final void k0() {
        c0();
        if (this.f1112c == null) {
            this.f1112c = new zzdh(Looper.getMainLooper());
        }
    }
}
