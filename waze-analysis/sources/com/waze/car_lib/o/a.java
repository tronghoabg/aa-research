package com.waze.car_lib.o;

import com.waze.config.ConfigValues;
import com.waze.config.cu;
import com.waze.mg;
import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class a implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f20451a;

    public /* synthetic */ a(int i2) {
        this.f20451a = i2;
    }

    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f20451a) {
            case 0:
                break;
            case 1:
                com.waze.beacons.g gVar = new com.waze.beacons.g(mg.f29780a.a());
                List list = cu.f22590a;
                h.g.b.x.e(list, "ALL_CONFIGS");
                break;
            case 2:
                Boolean boolB = ConfigValues.CONFIG_VALUE_CONVERSATION_INFRA_LOGFILE_ENABLED.b();
                Objects.toString(boolB);
                com.waze.shared_infra.i.h.a("Config - isEnabled: ".concat(boolB.toString()));
                break;
            case 3:
                Long lB = ConfigValues.CONFIG_VALUE_CONVERSATION_INFRA_LOGFILE_FOLDER_MAX_SIZE_MB.b();
                long jLongValue = lB.longValue() * 1048576;
                com.waze.shared_infra.i.h.a("Config - max total size: " + jLongValue + " bytes (" + lB + "MB)");
                break;
            case 4:
                h.o.c cVar = h.o.a.f48264a;
                Long lB2 = ConfigValues.CONFIG_VALUE_CONVERSATION_INFRA_LOGFILE_TIME_TO_LIVE_HOURS.b();
                h.g.b.x.e(lB2, "getValue(...)");
                h.o.a aVarZ = h.o.a.z(h.o.c.j(lB2.longValue(), h.o.d.f48275f));
                com.waze.shared_infra.i.h.a("Config - files keep-alive duration: ".concat(h.o.a.y(aVarZ.w())));
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                int i2 = com.waze.z.a.k.f46140a;
                break;
            case 12:
                int i3 = com.waze.z.a.k.f46140a;
                break;
            case 13:
                int i4 = com.waze.z.a.k.f46140a;
                break;
            case 14:
                int i5 = com.waze.z.a.k.f46140a;
                break;
            case 15:
                int i6 = com.waze.z.a.k.f46140a;
                break;
            case 16:
                int i7 = com.waze.z.a.k.f46140a;
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            default:
                int i8 = com.waze.z.a.b.b.f45738a;
                break;
        }
        return h.ab.f48028a;
    }
}
