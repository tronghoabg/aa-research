package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class fn implements com.google.v.el {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f11817a;

    fn(int i2) {
        this.f11817a = i2;
    }

    @Override // com.google.v.el
    public final /* synthetic */ Object convert(int i2) {
        switch (this.f11817a) {
            case 0:
                fq fqVarA = fq.a(i2);
                return fqVarA == null ? fq.UNKNOWN_STRIPE_MATERIAL : fqVarA;
            case 1:
                ey eyVarA = ey.a(i2);
                return eyVarA == null ? ey.UNKNOWN_LOGICAL_MATERIAL : eyVarA;
            case 2:
                gv gvVarA = gv.a(i2);
                return gvVarA == null ? gv.SERVICE_ALL : gvVarA;
            case 3:
                gv gvVarA2 = gv.a(i2);
                return gvVarA2 == null ? gv.SERVICE_ALL : gvVarA2;
            case 4:
                gu guVarA = gu.a(i2);
                return guVarA == null ? gu.ANY : guVarA;
            case 5:
                hx hxVarA = hx.a(i2);
                return hxVarA == null ? hx.ALLERGEN_DAIRY : hxVarA;
            case 6:
                hx hxVarA2 = hx.a(i2);
                return hxVarA2 == null ? hx.ALLERGEN_DAIRY : hxVarA2;
            case 7:
                hw hwVarA = hw.a(i2);
                return hwVarA == null ? hw.DIET_HALAL : hwVarA;
            case 8:
                hk hkVarA = hk.a(i2);
                return hkVarA == null ? hk.METHOD_UNDEFINED : hkVarA;
            case 9:
                hb hbVarA = hb.a(i2);
                return hbVarA == null ? hb.CUISINE_UNDEFINED : hbVarA;
            case 10:
                gz gzVarA = gz.a(i2);
                return gzVarA == null ? gz.TYPE_ANY : gzVarA;
            case 11:
                jm jmVarA = jm.a(i2);
                return jmVarA == null ? jm.EMISSIONS_STICKER_UNKNOWN : jmVarA;
            case 12:
                og ogVarA = og.a(i2);
                return ogVarA == null ? og.UNKNOWN : ogVarA;
            case 13:
                nk nkVarA = nk.a(i2);
                return nkVarA == null ? nk.TRAVEL_MODE_UNSPECIFIED : nkVarA;
            case 14:
                og ogVarA2 = og.a(i2);
                return ogVarA2 == null ? og.UNKNOWN : ogVarA2;
            case 15:
                ob obVarA = ob.a(i2);
                return obVarA == null ? ob.HAZARDOUS_GOODS_TYPE_UNSPECIFIED : obVarA;
            case 16:
                od odVarA = od.a(i2);
                return odVarA == null ? od.VEHICLE_EMISSIONS_CATEGORY_UNSPECIFIED : odVarA;
            default:
                mm mmVarA = mm.a(i2);
                return mmVarA == null ? mm.TOLL_PASS_TYPE_UNSPECIFIED : mmVarA;
        }
    }
}
