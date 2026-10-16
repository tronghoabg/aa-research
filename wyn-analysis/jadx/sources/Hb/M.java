package hb;

import ka.AbstractC3256n;

/* loaded from: classes4.dex */
public final class M extends r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36281a;

    public /* synthetic */ M(int i5) {
        this.f36281a = i5;
    }

    @Override // hb.r
    public final Object fromJson(w wVar) {
        switch (this.f36281a) {
            case 0:
                return wVar.J();
            case 1:
                return Boolean.valueOf(wVar.w());
            case 2:
                return Byte.valueOf((byte) P.g(wVar, "a byte", -128, 255));
            case 3:
                String strJ = wVar.J();
                if (strJ.length() <= 1) {
                    return Character.valueOf(strJ.charAt(0));
                }
                throw new E5.Q(N0.a.h("Expected a char but was ", AbstractC3256n.f('\"', "\"", strJ), " at path ", wVar.i()), 11);
            case 4:
                return Double.valueOf(wVar.y());
            case 5:
                float fY = (float) wVar.y();
                if (wVar.f36362e || !Float.isInfinite(fY)) {
                    return Float.valueOf(fY);
                }
                throw new E5.Q("JSON forbids NaN and infinities: " + fY + " at path " + wVar.i(), 11);
            case 6:
                return Integer.valueOf(wVar.z());
            case 7:
                return Long.valueOf(wVar.B());
            default:
                return Short.valueOf((short) P.g(wVar, "a short", -32768, 32767));
        }
    }

    @Override // hb.r
    public final void toJson(AbstractC2797C abstractC2797C, Object obj) {
        switch (this.f36281a) {
            case 0:
                abstractC2797C.V((String) obj);
                break;
            case 1:
                abstractC2797C.W(((Boolean) obj).booleanValue());
                break;
            case 2:
                abstractC2797C.P(((Byte) obj).intValue() & 255);
                break;
            case 3:
                abstractC2797C.V(((Character) obj).toString());
                break;
            case 4:
                abstractC2797C.J(((Double) obj).doubleValue());
                break;
            case 5:
                Float f10 = (Float) obj;
                f10.getClass();
                abstractC2797C.Q(f10);
                break;
            case 6:
                abstractC2797C.P(((Integer) obj).intValue());
                break;
            case 7:
                abstractC2797C.P(((Long) obj).longValue());
                break;
            default:
                abstractC2797C.P(((Short) obj).intValue());
                break;
        }
    }

    public final String toString() {
        switch (this.f36281a) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }
}
