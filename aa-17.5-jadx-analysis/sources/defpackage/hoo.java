package defpackage;

import android.os.Bundle;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class hoo extends hng {
    public static final hno e = new hno(5);
    public final hon b;
    public final boolean c;
    public final boolean d;
    private final boolean f;

    public /* synthetic */ hoo(hon honVar, boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? hon.a : honVar, z | (!((i & 2) == 0)), z2 & ((i & 4) == 0), false);
    }

    @Override // defpackage.hng
    public final void a(Bundle bundle) throws IOException {
        hon honVar = this.b;
        bundle.putInt("DialerMetadataHint__vertical", honVar.ordinal());
        boolean z = this.c;
        bundle.putBoolean("DialerMetadataHint__display_general_cards", z);
        boolean z2 = this.d;
        bundle.putBoolean("DialerMetadataHint__display_all_cards", z2);
        bundle.putBoolean("DialerMetadataHint__is_inferred_business", this.f);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        abnc abncVar = new abnc(byteArrayOutputStream, 4096);
        abncVar.m(1, honVar.ordinal());
        abncVar.f(2, z);
        abncVar.f(3, z2);
        abncVar.c();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        bundle.putByteArray("pixel_dialer_metadata", byteArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoo)) {
            return false;
        }
        hoo hooVar = (hoo) obj;
        return this.b == hooVar.b && this.c == hooVar.c && this.d == hooVar.d && this.f == hooVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        boolean z = this.f;
        return ((((iHashCode + a.f(this.c)) * 31) + a.f(this.d)) * 31) + a.f(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoo(hon honVar, boolean z, boolean z2, boolean z3) {
        super(hnh.p);
        honVar.getClass();
        this.b = honVar;
        this.c = z;
        this.d = z2;
        this.f = z3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public hoo() {
        boolean z = false;
        this((hon) null, z, z, 15);
    }
}
