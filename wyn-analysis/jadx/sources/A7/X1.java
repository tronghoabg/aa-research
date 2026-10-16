package A7;

import com.google.android.gms.internal.measurement.zzfy;
import com.google.android.gms.internal.measurement.zzoe;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import x.C4409b;
import x.C4412e;

/* loaded from: classes4.dex */
public final class X1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f748a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f749b;

    /* renamed from: c, reason: collision with root package name */
    public final zzfy.zzm f750c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f751d;

    /* renamed from: e, reason: collision with root package name */
    public final BitSet f752e;

    /* renamed from: f, reason: collision with root package name */
    public final C4412e f753f;

    /* renamed from: g, reason: collision with root package name */
    public final C4412e f754g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ W1 f755h;

    public X1(W1 w12, String str) {
        this.f755h = w12;
        this.f748a = str;
        this.f749b = true;
        this.f751d = new BitSet();
        this.f752e = new BitSet();
        this.f753f = new C4412e(0);
        this.f754g = new C4412e(0);
    }

    public final void a(AbstractC0239c abstractC0239c) {
        int iA = abstractC0239c.a();
        Boolean bool = abstractC0239c.f822a;
        if (bool != null) {
            this.f752e.set(iA, bool.booleanValue());
        }
        Boolean bool2 = abstractC0239c.f823b;
        if (bool2 != null) {
            this.f751d.set(iA, bool2.booleanValue());
        }
        if (abstractC0239c.f824c != null) {
            Integer numValueOf = Integer.valueOf(iA);
            C4412e c4412e = this.f753f;
            Long l10 = (Long) c4412e.get(numValueOf);
            long jLongValue = abstractC0239c.f824c.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                c4412e.put(Integer.valueOf(iA), Long.valueOf(jLongValue));
            }
        }
        if (abstractC0239c.f825d != null) {
            C4412e c4412e2 = this.f754g;
            List arrayList = (List) c4412e2.get(Integer.valueOf(iA));
            if (arrayList == null) {
                arrayList = new ArrayList();
                c4412e2.put(Integer.valueOf(iA), arrayList);
            }
            if (abstractC0239c.g()) {
                arrayList.clear();
            }
            boolean zZza = zzoe.zza();
            String str = this.f748a;
            W1 w12 = this.f755h;
            if (zZza && ((C0273n0) w12.f421a).f979g.o0(str, AbstractC0304y.f1207p0) && abstractC0239c.f()) {
                arrayList.clear();
            }
            if (!zzoe.zza() || !((C0273n0) w12.f421a).f979g.o0(str, AbstractC0304y.f1207p0)) {
                arrayList.add(Long.valueOf(abstractC0239c.f825d.longValue() / 1000));
                return;
            }
            long jLongValue2 = abstractC0239c.f825d.longValue() / 1000;
            if (arrayList.contains(Long.valueOf(jLongValue2))) {
                return;
            }
            arrayList.add(Long.valueOf(jLongValue2));
        }
    }

    public X1(W1 w12, String str, zzfy.zzm zzmVar, BitSet bitSet, BitSet bitSet2, C4412e c4412e, C4412e c4412e2) {
        this.f755h = w12;
        this.f748a = str;
        this.f751d = bitSet;
        this.f752e = bitSet2;
        this.f753f = c4412e;
        this.f754g = new C4412e(0);
        Iterator it = ((C4409b) c4412e2.keySet()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c4412e2.get(num));
            this.f754g.put(num, arrayList);
        }
        this.f749b = false;
        this.f750c = zzmVar;
    }
}
