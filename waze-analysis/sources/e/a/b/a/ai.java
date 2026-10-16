package e.a.b.a;

import android.os.Parcel;
import e.a.bc;
import e.a.ch;
import e.a.cm;
import e.a.cp;
import e.a.cq;
import e.a.d.dh;
import e.a.d.jt;
import e.a.ee;
import e.a.ef;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ai extends aj {

    /* renamed from: a, reason: collision with root package name */
    private final cq f46317a;

    /* renamed from: b, reason: collision with root package name */
    private final cm f46318b;

    /* renamed from: c, reason: collision with root package name */
    private final jt f46319c;

    ai(k kVar, int i2, cq cqVar, cm cmVar, jt jtVar) {
        super(kVar, i2, jtVar);
        this.f46317a = cqVar;
        this.f46318b = cmVar;
        this.f46319c = jtVar;
    }

    @Override // e.a.b.a.aj
    protected final int a(Parcel parcel) {
        int length;
        int i2;
        cq cqVar = this.f46317a;
        parcel.writeString(cqVar.f());
        cm cmVar = this.f46318b;
        int iA = cmVar != null ? bc.a(cmVar) : 0;
        if (iA == 0) {
            parcel.writeInt(0);
        } else {
            Object[] objArrE = bc.e(cmVar);
            parcel.writeInt(iA);
            for (int i3 = 0; i3 < iA; i3++) {
                int i4 = i3 + i3;
                byte[] bArr = (byte[]) objArrE[i4];
                parcel.writeInt(bArr.length);
                parcel.writeByteArray(bArr);
                Object obj = objArrE[i4 + 1];
                if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    parcel.writeInt(bArr2.length);
                    parcel.writeByteArray(bArr2);
                } else if (obj instanceof al) {
                    parcel.writeInt(-1);
                    ((al) obj).a(parcel);
                } else {
                    byte[] bArrB = m.b();
                    try {
                        InputStream inputStream = (InputStream) obj;
                        int i5 = 0;
                        while (true) {
                            length = bArrB.length;
                            if (i5 >= length || (i2 = inputStream.read(bArrB, i5, length - i5)) == -1) {
                                break;
                            }
                            i5 += i2;
                        }
                        if (i5 == length) {
                            throw new ef(ee.f47407g.g("Metadata value too large"));
                        }
                        parcel.writeInt(i5);
                        if (i5 > 0) {
                            parcel.writeByteArray(bArrB, 0, i5);
                        }
                    } finally {
                        m.a(bArrB);
                    }
                }
            }
        }
        this.f46319c.a();
        cp cpVarB = cqVar.b();
        return (cpVarB == cp.f46544a || cpVarB == cp.f46545b) ? 16 : 0;
    }

    final void b(e.a.ad adVar) {
        cm cmVar = this.f46318b;
        ch chVar = dh.f46791a;
        cmVar.g(chVar);
        cmVar.i(chVar, Long.valueOf(adVar.b(TimeUnit.NANOSECONDS)));
    }
}
