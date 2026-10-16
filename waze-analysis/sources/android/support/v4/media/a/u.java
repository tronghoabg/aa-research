package android.support.v4.media.a;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes2.dex */
public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new t(0);

    /* renamed from: a, reason: collision with root package name */
    private final Object f413a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final Object f414b;

    /* renamed from: c, reason: collision with root package name */
    private e f415c;

    u(Object obj, e eVar) {
        this.f414b = obj;
        this.f415c = eVar;
    }

    public static u b(Object obj) {
        return c(obj, null);
    }

    public static u c(Object obj, e eVar) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof MediaSession.Token) {
            return new u(obj, eVar);
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }

    public final e a() {
        e eVar;
        synchronized (this.f413a) {
            eVar = this.f415c;
        }
        return eVar;
    }

    public final Object d() {
        return this.f414b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(e eVar) {
        synchronized (this.f413a) {
            this.f415c = eVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        Object obj2 = this.f414b;
        if (obj2 == null) {
            return uVar.f414b == null;
        }
        Object obj3 = uVar.f414b;
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public final void f() {
        synchronized (this.f413a) {
        }
    }

    public final int hashCode() {
        Object obj = this.f414b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable((Parcelable) this.f414b, i2);
    }
}
