package N;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class Y extends X.z implements Parcelable, V {

    @NotNull
    public static final Parcelable.Creator<Y> CREATOR = new X();

    /* renamed from: b, reason: collision with root package name */
    public final A0 f7734b;

    /* renamed from: c, reason: collision with root package name */
    public z0 f7735c;

    public Y(Object obj, A0 a02) {
        this.f7734b = a02;
        z0 z0Var = new z0(obj);
        if (X.m.f15717a.E() != null) {
            z0 z0Var2 = new z0(obj);
            z0Var2.f15664a = 1;
            z0Var.f15665b = z0Var2;
        }
        this.f7735c = z0Var;
    }

    @Override // X.y
    public final void c(X.A a5) {
        AbstractC3340k.c(a5, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f7735c = (z0) a5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.y
    public final X.A e() {
        return this.f7735c;
    }

    @Override // X.z, X.y
    public final X.A f(X.A a5, X.A a10, X.A a11) {
        if (this.f7734b.a(((z0) a10).f7990c, ((z0) a11).f7990c)) {
            return a10;
        }
        return null;
    }

    @Override // N.K0
    public final Object getValue() {
        return ((z0) X.m.u(this.f7735c, this)).f7990c;
    }

    @Override // N.V
    public final void setValue(Object obj) {
        X.g gVarK;
        z0 z0Var = (z0) X.m.i(this.f7735c);
        if (this.f7734b.a(z0Var.f7990c, obj)) {
            return;
        }
        z0 z0Var2 = this.f7735c;
        synchronized (X.m.f15718b) {
            gVarK = X.m.k();
            ((z0) X.m.p(z0Var2, this, gVarK, z0Var)).f7990c = obj;
        }
        X.m.o(gVarK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((z0) X.m.i(this.f7735c)).f7990c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int i10;
        parcel.writeValue(getValue());
        P p10 = P.f7727c;
        A0 a02 = this.f7734b;
        if (AbstractC3340k.a(a02, p10)) {
            i10 = 0;
        } else if (AbstractC3340k.a(a02, P.f7730f)) {
            i10 = 1;
        } else {
            if (!AbstractC3340k.a(a02, P.f7728d)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i10 = 2;
        }
        parcel.writeInt(i10);
    }
}
