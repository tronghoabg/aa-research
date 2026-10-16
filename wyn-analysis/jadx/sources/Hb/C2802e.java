package hb;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: hb.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2802e implements InterfaceC2814q {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f36320a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f36321b;

    public C2802e(ArrayList arrayList, ArrayList arrayList2) {
        this.f36320a = arrayList;
        this.f36321b = arrayList2;
    }

    public static AbstractC2801d b(ArrayList arrayList, Type type, Set set) {
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractC2801d abstractC2801d = (AbstractC2801d) arrayList.get(i5);
            if (P.b(abstractC2801d.f36313a, type) && abstractC2801d.f36314b.equals(set)) {
                return abstractC2801d;
            }
        }
        return null;
    }

    @Override // hb.InterfaceC2814q
    public final r a(Type type, Set set, K k) {
        AbstractC2801d abstractC2801dB = b(this.f36320a, type, set);
        AbstractC2801d abstractC2801dB2 = b(this.f36321b, type, set);
        r rVarD = null;
        if (abstractC2801dB == null && abstractC2801dB2 == null) {
            return null;
        }
        if (abstractC2801dB == null || abstractC2801dB2 == null) {
            try {
                rVarD = k.d(this, type, set);
            } catch (IllegalArgumentException e7) {
                StringBuilder sbW = com.google.android.gms.internal.consent_sdk.a.w("No ", abstractC2801dB == null ? "@ToJson" : "@FromJson", " adapter for ");
                sbW.append(ib.f.j(type, set));
                throw new IllegalArgumentException(sbW.toString(), e7);
            }
        }
        r rVar = rVarD;
        if (abstractC2801dB != null) {
            abstractC2801dB.a(k, this);
        }
        if (abstractC2801dB2 != null) {
            abstractC2801dB2.a(k, this);
        }
        return new C2798a(abstractC2801dB, rVar, k, abstractC2801dB2, set, type);
    }
}
