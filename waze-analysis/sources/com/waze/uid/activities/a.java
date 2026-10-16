package com.waze.uid.activities;

import android.app.Dialog;
import android.content.Context;
import android.os.Parcel;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.waze.R;
import com.waze.google_assistant.aj;
import com.waze.reports.cw;
import e.a.bc;
import e.a.cm;
import e.a.ee;
import e.a.ef;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class a {
    public static final Dialog a(Context context, com.waze.shared_infra.o.a aVar, b bVar, h.g.a.l lVar, h.g.a.a aVar2) {
        x.f(context, "context");
        x.f(aVar, "stringProvider");
        x.f(bVar, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        x.f(lVar, "onSelect");
        x.f(aVar2, "onBack");
        com.waze.uid.d.q.f44463a.a().c().b(i(bVar), h(bVar));
        com.waze.sharedui.g.k kVar = new com.waze.sharedui.g.k(context);
        kVar.f(aVar.c(bVar.b(), new Object[0]));
        Integer numE = bVar.e();
        kVar.d(numE != null ? aVar.c(numE.intValue(), new Object[0]) : null);
        if (bVar.d() != null) {
            bVar.d().intValue();
            kVar.g();
        }
        kVar.b(new com.waze.sharedui.g.l(aVar.c(bVar.a(), new Object[0]), new cw(bVar, lVar, 2), R.color.primary_variant, R.color.surface_default, R.drawable.google, 2));
        int i2 = 3;
        if (bVar.c() != null) {
            kVar.b(new com.waze.sharedui.g.l(aVar.c(bVar.c().intValue(), new Object[0]), new cw(bVar, lVar, i2), R.color.primary_variant, R.color.surface_default, R.drawable.envelope, 2));
        }
        if (bVar.f() != null) {
            kVar.b(new com.waze.sharedui.g.m(aVar.c(R.string.SIGNUP_MENU_OR, new Object[0]), null, R.color.content_p2, R.color.primary_variant, true));
            bVar.f().intValue();
            kVar.b(new com.waze.sharedui.g.l(aVar.c(R.string.SIGNUP_MENU_SKIP, new Object[0]), new cw(bVar, aVar2, 4), R.color.primary_variant, R.color.surface_default, -1, 2));
        }
        kVar.e(new aj(bVar, aVar2, i2));
        kVar.c();
        com.waze.sharedui.g.n nVarA = kVar.a();
        nVarA.show();
        x.e(nVarA, "apply(...)");
        return nVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x043d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(com.waze.uid.VehicleType r35, h.g.a.l r36, h.g.a.a r37, h.g.a.a r38, androidx.compose.runtime.Composer r39, int r40) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.uid.activities.a.f(com.waze.uid.VehicleType, h.g.a.l, h.g.a.a, h.g.a.a, androidx.compose.runtime.Composer, int):void");
    }

    public static cm g(Parcel parcel, e.a.c cVar) throws ef {
        int i2 = parcel.readInt();
        if (i2 == 0) {
            return new cm();
        }
        Object[] objArr = new Object[i2 + i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = parcel.readInt();
            int i6 = i3 + 4;
            byte[] bArrJ = j(parcel, i5, i6);
            int i7 = i6 + i5;
            int i8 = i4 + i4;
            objArr[i8] = bArrJ;
            int i9 = parcel.readInt();
            if (i9 == -1) {
                throw new ef(ee.f47405e.g("Parcelable metadata values not allowed"));
            }
            if (i9 < 0) {
                throw new ef(ee.f47410j.g("Unrecognized metadata sentinel"));
            }
            int i10 = i7 + 4;
            byte[] bArrJ2 = j(parcel, i9, i10);
            i3 = i10 + i9;
            objArr[i8 + 1] = bArrJ2;
        }
        return bc.d(i2, objArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.waze.uid.stats.o h(b bVar) {
        b bVar2 = b.f44071a;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0) {
            return com.waze.uid.stats.o.f44777d;
        }
        if (iOrdinal == 1) {
            return com.waze.uid.stats.o.f44776c;
        }
        if (iOrdinal == 2) {
            return com.waze.uid.stats.o.f44775b;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return com.waze.uid.stats.o.f44774a;
        }
        throw new h.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.waze.uid.stats.p i(b bVar) {
        b bVar2 = b.f44071a;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return com.waze.uid.stats.p.f44781c;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return com.waze.uid.stats.p.f44779a;
        }
        throw new h.i();
    }

    private static byte[] j(Parcel parcel, int i2, int i3) throws ef {
        if (i3 + i2 > 8192) {
            throw new ef(ee.f47407g.g("Metadata too large"));
        }
        byte[] bArr = new byte[i2];
        if (i2 > 0) {
            parcel.readByteArray(bArr);
        }
        return bArr;
    }
}
