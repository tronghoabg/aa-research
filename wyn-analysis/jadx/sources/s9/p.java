package s9;

import A.AbstractC0213f;
import com.google.protobuf.ByteString;
import com.google.protobuf.NullValue;
import com.google.protobuf.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import ka.AbstractC3256n;
import ka.B1;
import ka.C1;
import ka.C3235g;
import ka.C3257n0;
import ka.C3263p0;
import ka.InterfaceC3238h;
import m9.B;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import w9.AbstractC4397p;

/* loaded from: classes4.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final C1 f45391a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1 f45392b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1 f45393c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1 f45394d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1 f45395e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1 f45396f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1 f45397g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1 f45398h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1 f45399i;

    /* renamed from: j, reason: collision with root package name */
    public static final C1 f45400j;
    public static final C1 k;

    /* renamed from: l, reason: collision with root package name */
    public static final C1 f45401l;

    /* renamed from: m, reason: collision with root package name */
    public static final C1 f45402m;

    /* renamed from: n, reason: collision with root package name */
    public static final C1 f45403n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1 f45404o;

    /* renamed from: p, reason: collision with root package name */
    public static final C1 f45405p;

    static {
        B1 b1W = C1.w();
        b1W.f(Double.NaN);
        f45391a = (C1) b1W.build();
        B1 b1W2 = C1.w();
        b1W2.l(NullValue.NULL_VALUE);
        C1 c12 = (C1) b1W2.build();
        f45392b = c12;
        f45393c = c12;
        B1 b1W3 = C1.w();
        b1W3.n("__max__");
        C1 c13 = (C1) b1W3.build();
        f45394d = c13;
        B1 b1W4 = C1.w();
        C3257n0 c3257n0F = C3263p0.f();
        c3257n0F.b("__type__", c13);
        b1W4.j(c3257n0F);
        f45395e = (C1) b1W4.build();
        B1 b1W5 = C1.w();
        b1W5.n("__vector__");
        C1 c14 = (C1) b1W5.build();
        f45396f = c14;
        B1 b1W6 = C1.w();
        C3257n0 c3257n0F2 = C3263p0.f();
        c3257n0F2.b("__type__", c14);
        B1 b1W7 = C1.w();
        b1W7.b(C3235g.g());
        c3257n0F2.b(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR, (C1) b1W7.build());
        b1W6.j(c3257n0F2);
        f45397g = (C1) b1W6.build();
        B1 b1W8 = C1.w();
        b1W8.d(false);
        f45398h = (C1) b1W8.build();
        B1 b1W9 = C1.w();
        b1W9.f(Double.NaN);
        f45399i = (C1) b1W9.build();
        B1 b1W10 = C1.w();
        b1W10.o(Timestamp.newBuilder().setSeconds(Long.MIN_VALUE));
        f45400j = (C1) b1W10.build();
        B1 b1W11 = C1.w();
        b1W11.n("");
        k = (C1) b1W11.build();
        B1 b1W12 = C1.w();
        b1W12.e(ByteString.EMPTY);
        f45401l = (C1) b1W12.build();
        h hVarB = h.b();
        B1 b1W13 = C1.w();
        b1W13.m("projects//databases//documents/" + hVarB.f45375a.c());
        f45402m = (C1) b1W13.build();
        B1 b1W14 = C1.w();
        Ia.b bVarG = Ia.c.g();
        bVarG.a(-90.0d);
        bVarG.b(-180.0d);
        b1W14.g(bVarG);
        f45403n = (C1) b1W14.build();
        B1 b1W15 = C1.w();
        b1W15.c(C3235g.e());
        f45404o = (C1) b1W15.build();
        B1 b1W16 = C1.w();
        b1W16.k(C3263p0.c());
        f45405p = (C1) b1W16.build();
    }

    public static void a(StringBuilder sb2, C1 c12) {
        boolean z2 = true;
        switch (AbstractC0213f.f(c12.v())) {
            case 0:
                sb2.append("null");
                return;
            case 1:
                sb2.append(c12.n());
                return;
            case 2:
                sb2.append(c12.r());
                return;
            case 3:
                sb2.append(c12.getDoubleValue());
                return;
            case 4:
                Timestamp timestampU = c12.u();
                sb2.append("time(" + timestampU.getSeconds() + "," + timestampU.getNanos() + ")");
                return;
            case 5:
                sb2.append(c12.getStringValue());
                return;
            case 6:
                sb2.append(AbstractC4397p.i(c12.o()));
                return;
            case 7:
                A6.c.z(i(c12), "Value should be a ReferenceValue", new Object[0]);
                sb2.append(h.c(c12.t()));
                return;
            case 8:
                Ia.c cVarQ = c12.q();
                sb2.append("geo(" + cVarQ.e() + "," + cVarQ.f() + ")");
                return;
            case 9:
                C3235g c3235gM = c12.m();
                sb2.append("[");
                for (int i5 = 0; i5 < c3235gM.getValuesCount(); i5++) {
                    a(sb2, c3235gM.f(i5));
                    if (i5 != c3235gM.getValuesCount() - 1) {
                        sb2.append(",");
                    }
                }
                sb2.append("]");
                return;
            case 10:
                C3263p0 c3263p0S = c12.s();
                ArrayList arrayList = new ArrayList(c3263p0S.getFieldsMap().keySet());
                Collections.sort(arrayList);
                sb2.append("{");
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (z2) {
                        z2 = false;
                    } else {
                        sb2.append(",");
                    }
                    sb2.append(str);
                    sb2.append(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
                    a(sb2, c3263p0S.e(str));
                }
                sb2.append("}");
                return;
            default:
                A6.c.s("Invalid value type: ".concat(AbstractC3256n.t(c12.v())), new Object[0]);
                throw null;
        }
    }

    public static int b(C1 c12, C1 c13) {
        int iL = l(c12);
        int iL2 = l(c13);
        if (iL != iL2) {
            return AbstractC4397p.d(iL, iL2);
        }
        if (iL != Integer.MAX_VALUE) {
            switch (iL) {
                case 0:
                    break;
                case 1:
                    boolean zN = c12.n();
                    boolean zN2 = c13.n();
                    B b5 = AbstractC4397p.f47455a;
                    if (zN == zN2) {
                        return 0;
                    }
                    return zN ? 1 : -1;
                case 2:
                    if (c12.v() == 4) {
                        double doubleValue = c12.getDoubleValue();
                        if (c13.v() == 4) {
                            double doubleValue2 = c13.getDoubleValue();
                            B b10 = AbstractC4397p.f47455a;
                            return Fe.b.w(doubleValue, doubleValue2);
                        }
                        if (c13.v() == 3) {
                            return AbstractC4397p.e(doubleValue, c13.r());
                        }
                    } else if (c12.v() == 3) {
                        long jR = c12.r();
                        if (c13.v() == 3) {
                            long jR2 = c13.r();
                            B b11 = AbstractC4397p.f47455a;
                            return Long.compare(jR, jR2);
                        }
                        if (c13.v() == 4) {
                            return AbstractC4397p.e(c13.getDoubleValue(), jR) * (-1);
                        }
                    }
                    A6.c.s("Unexpected values: %s vs %s", c12, c13);
                    throw null;
                case 3:
                    Timestamp timestampU = c12.u();
                    Timestamp timestampU2 = c13.u();
                    long seconds = timestampU.getSeconds();
                    long seconds2 = timestampU2.getSeconds();
                    B b12 = AbstractC4397p.f47455a;
                    int iCompare = Long.compare(seconds, seconds2);
                    return iCompare != 0 ? iCompare : AbstractC4397p.d(timestampU.getNanos(), timestampU2.getNanos());
                case 4:
                    Timestamp timestampA = n.a(c12);
                    Timestamp timestampA2 = n.a(c13);
                    long seconds3 = timestampA.getSeconds();
                    long seconds4 = timestampA2.getSeconds();
                    B b13 = AbstractC4397p.f47455a;
                    int iCompare2 = Long.compare(seconds3, seconds4);
                    return iCompare2 != 0 ? iCompare2 : AbstractC4397p.d(timestampA.getNanos(), timestampA2.getNanos());
                case 5:
                    return c12.getStringValue().compareTo(c13.getStringValue());
                case 6:
                    return AbstractC4397p.c(c12.o(), c13.o());
                case 7:
                    String strT = c12.t();
                    String strT2 = c13.t();
                    String[] strArrSplit = strT.split("/", -1);
                    String[] strArrSplit2 = strT2.split("/", -1);
                    int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
                    for (int i5 = 0; i5 < iMin; i5++) {
                        int iCompareTo = strArrSplit[i5].compareTo(strArrSplit2[i5]);
                        if (iCompareTo != 0) {
                            return iCompareTo;
                        }
                    }
                    return AbstractC4397p.d(strArrSplit.length, strArrSplit2.length);
                case 8:
                    Ia.c cVarQ = c12.q();
                    Ia.c cVarQ2 = c13.q();
                    double dE = cVarQ.e();
                    double dE2 = cVarQ2.e();
                    B b14 = AbstractC4397p.f47455a;
                    int iW = Fe.b.w(dE, dE2);
                    return iW == 0 ? Fe.b.w(cVarQ.f(), cVarQ2.f()) : iW;
                case 9:
                    return c(c12.m(), c13.m());
                case 10:
                    C3263p0 c3263p0S = c12.s();
                    C3263p0 c3263p0S2 = c13.s();
                    Map fieldsMap = c3263p0S.getFieldsMap();
                    Map fieldsMap2 = c3263p0S2.getFieldsMap();
                    C3235g c3235gM = ((C1) fieldsMap.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR)).m();
                    C3235g c3235gM2 = ((C1) fieldsMap2.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR)).m();
                    int iD = AbstractC4397p.d(c3235gM.getValuesCount(), c3235gM2.getValuesCount());
                    return iD != 0 ? iD : c(c3235gM, c3235gM2);
                case 11:
                    C3263p0 c3263p0S3 = c12.s();
                    C3263p0 c3263p0S4 = c13.s();
                    Iterator it = new TreeMap(c3263p0S3.getFieldsMap()).entrySet().iterator();
                    Iterator it2 = new TreeMap(c3263p0S4.getFieldsMap()).entrySet().iterator();
                    while (it.hasNext() && it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        int iCompareTo2 = ((String) entry.getKey()).compareTo((String) entry2.getKey());
                        if (iCompareTo2 != 0) {
                            return iCompareTo2;
                        }
                        int iB = b((C1) entry.getValue(), (C1) entry2.getValue());
                        if (iB != 0) {
                            return iB;
                        }
                    }
                    boolean zHasNext = it.hasNext();
                    boolean zHasNext2 = it2.hasNext();
                    B b15 = AbstractC4397p.f47455a;
                    if (zHasNext == zHasNext2) {
                        return 0;
                    }
                    return zHasNext ? 1 : -1;
                default:
                    A6.c.s(AbstractC3256n.g(iL, "Invalid value type: "), new Object[0]);
                    throw null;
            }
        }
        return 0;
    }

    public static int c(C3235g c3235g, C3235g c3235g2) {
        int iMin = Math.min(c3235g.getValuesCount(), c3235g2.getValuesCount());
        for (int i5 = 0; i5 < iMin; i5++) {
            int iB = b(c3235g.f(i5), c3235g2.f(i5));
            if (iB != 0) {
                return iB;
            }
        }
        return AbstractC4397p.d(c3235g.getValuesCount(), c3235g2.getValuesCount());
    }

    public static boolean d(InterfaceC3238h interfaceC3238h, C1 c12) {
        Iterator it = interfaceC3238h.getValuesList().iterator();
        while (it.hasNext()) {
            if (e((C1) it.next(), c12)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(C1 c12, C1 c13) {
        int iL;
        if (c12 == c13) {
            return true;
        }
        if (c12 != null && c13 != null && (iL = l(c12)) == l(c13)) {
            if (iL != 2) {
                if (iL == 4) {
                    return n.a(c12).equals(n.a(c13));
                }
                if (iL == Integer.MAX_VALUE) {
                    return true;
                }
                switch (iL) {
                    case 9:
                        C3235g c3235gM = c12.m();
                        C3235g c3235gM2 = c13.m();
                        if (c3235gM.getValuesCount() == c3235gM2.getValuesCount()) {
                            for (int i5 = 0; i5 < c3235gM.getValuesCount(); i5++) {
                                if (!e(c3235gM.f(i5), c3235gM2.f(i5))) {
                                    break;
                                }
                            }
                            return true;
                        }
                        break;
                    case 10:
                    case 11:
                        C3263p0 c3263p0S = c12.s();
                        C3263p0 c3263p0S2 = c13.s();
                        if (c3263p0S.getFieldsCount() == c3263p0S2.getFieldsCount()) {
                            for (Map.Entry entry : c3263p0S.getFieldsMap().entrySet()) {
                                if (!e((C1) entry.getValue(), (C1) c3263p0S2.getFieldsMap().get(entry.getKey()))) {
                                    break;
                                }
                            }
                            return true;
                        }
                        break;
                    default:
                        return c12.equals(c13);
                }
            } else if (c12.v() != 3 || c13.v() != 3) {
                if (c12.v() == 4 && c13.v() == 4 && Double.doubleToLongBits(c12.getDoubleValue()) == Double.doubleToLongBits(c13.getDoubleValue())) {
                    return true;
                }
            } else if (c12.r() == c13.r()) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(C1 c12) {
        return c12 != null && c12.v() == 10;
    }

    public static boolean g(C1 c12) {
        return c12 != null && c12.v() == 4;
    }

    public static boolean h(C1 c12) {
        return c12 != null && c12.v() == 3;
    }

    public static boolean i(C1 c12) {
        return c12 != null && c12.v() == 8;
    }

    public static boolean j(C1 c12) {
        return f45396f.equals(c12.s().getFieldsMap().get("__type__"));
    }

    public static C1 k(f fVar, h hVar) {
        B1 b1W = C1.w();
        b1W.m("projects/" + fVar.f45370a + "/databases/" + fVar.f45371b + "/documents/" + hVar.f45375a.c());
        return (C1) b1W.build();
    }

    public static int l(C1 c12) {
        switch (AbstractC0213f.f(c12.v())) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                if (n.c(c12)) {
                    return 4;
                }
                return f45394d.equals(c12.s().getFieldsMap().get("__type__")) ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : j(c12) ? 10 : 11;
            default:
                A6.c.s("Invalid value type: ".concat(AbstractC3256n.t(c12.v())), new Object[0]);
                throw null;
        }
    }
}
