package com.waze.nightmode;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.google.v.fi;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.jni.protos.places.Address;
import com.waze.settings.tree.views.WazeSettingsView;
import i.b.l.ca;
import i.b.l.cb;
import i.b.l.cc;
import i.b.l.cd;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e {
    public static final /* synthetic */ long a(long j2) {
        Calendar calendar = Calendar.getInstance(NightModeDaylightTime.utcTimeZone);
        calendar.setTimeInMillis(j2);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        h.g.b.x.e(calendar, "apply(...)");
        return j2 - calendar.getTimeInMillis();
    }

    public static final /* synthetic */ long b(long j2, long j3) {
        return j3 > j2 ? (NightModeDaylightTime.msInDay - j3) + j2 : j2 - j3;
    }

    public static final NightModeDaylightTime c(long j2, double d2, double d3) {
        if (Double.isNaN(d2) || Double.isNaN(d3)) {
            return null;
        }
        return new NightModeDaylightTime(TimeUnit.SECONDS.toMillis(j2), u(d2), u(d3));
    }

    public static final String d(fi fiVar) {
        h.g.b.x.f(fiVar, "<this>");
        byte[] bArr = new byte[fiVar.getSerializedSize()];
        fiVar.writeTo(com.google.v.ae.ab(bArr));
        String strA = com.waze.utils.a.a(bArr);
        h.g.b.x.e(strA, "encodeBytes(...)");
        return strA;
    }

    public static final String e(cb cbVar) {
        h.g.b.x.f(cbVar, "<this>");
        return "ProtoBase64,".concat(String.valueOf(d(cbVar)));
    }

    public static final cb f(h.g.a.l lVar) {
        h.g.b.x.f(lVar, "builder");
        cc ccVarNewBuilder = cd.newBuilder();
        h.g.b.x.c(ccVarNewBuilder);
        lVar.invoke(ccVarNewBuilder);
        cd cdVarBuild = ccVarNewBuilder.build();
        h.g.b.x.e(cdVarBuild, "build(...)");
        ca caVarNewBuilder = cb.newBuilder();
        caVarNewBuilder.b(cdVarBuild);
        cb cbVarBuild = caVarNewBuilder.build();
        h.g.b.x.e(cbVarBuild, "build(...)");
        return cbVarBuild;
    }

    public static final String g(String str, String str2, String str3) {
        return v(null, str, str2, str3);
    }

    public static final String h(String str, String str2, String str3, String str4, String str5) {
        return v(i(str, str2), str3, str4, str5);
    }

    public static final String i(String str, String str2) {
        String str3;
        String str4 = str2;
        if (str4 == null || str4.length() == 0 || (str3 = str) == null || str3.length() == 0) {
            return str2;
        }
        if (ConfigValues.CONFIG_VALUE_VENUES_RTL_ADDRESSES.b().booleanValue()) {
            return str2 + " " + str;
        }
        return str + " " + str2;
    }

    public static /* synthetic */ String j(boolean z, boolean z2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, com.waze.shared_infra.o.a aVar, int i2) {
        h.g.b.x.f(aVar, "stringProvider");
        if (((z ? 1 : 0) & ((i2 & 1) ^ 1)) != 0) {
            return aVar.c(R.string.HOME, new Object[0]);
        }
        if (((i2 & 2) == 0) && z2) {
            return aVar.c(R.string.WORK, new Object[0]);
        }
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        String str9 = str3;
        if (str9 != null && !h.n.o.G(str9)) {
            return str3;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        String str10 = str;
        if (str10 != null && !h.n.o.G(str10)) {
            return str;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        String str11 = str2;
        if (str11 != null && !h.n.o.G(str11)) {
            return aVar.b(str2);
        }
        return h(str4, str5, str6, str7, str8);
    }

    public static final String k(Address address) {
        h.g.b.x.f(address, "<this>");
        return h(address.getHouseNumber(), address.getStreet(), address.getCity(), address.getState(), address.getZip());
    }

    public static final String l(com.waze.av.a.p pVar, com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(pVar, "<this>");
        h.g.b.x.f(aVar, "stringProvider");
        return j(false, false, null, pVar.c().e(), null, pVar.b().c(), pVar.b().f(), pVar.b().a(), pVar.b().e(), pVar.b().g(), aVar, 55);
    }

    public static final com.waze.settings.tree.f n(com.waze.settings.tree.f fVar) {
        h.g.b.x.f(fVar, "<this>");
        boolean z = fVar.n() instanceof com.waze.settings.tree.d.m;
        com.waze.settings.tree.f fVarN = fVar.n();
        if (!z) {
            return fVarN;
        }
        if (fVarN == null) {
            return null;
        }
        return fVarN.n();
    }

    public static final void o(com.waze.settings.tree.f fVar, int i2) {
        h.g.b.x.f(fVar, "<this>");
        fVar.w(Integer.valueOf(i2));
    }

    public static final Drawable p(com.waze.settings.tree.d dVar, Context context) {
        h.g.b.x.f(dVar, "<this>");
        h.g.b.x.f(context, "context");
        if (dVar instanceof com.waze.settings.tree.a) {
            return ContextCompat.getDrawable(context, ((com.waze.settings.tree.a) dVar).a());
        }
        if (dVar instanceof com.waze.settings.tree.b) {
            return ((com.waze.settings.tree.b) dVar).a();
        }
        if (h.g.b.x.n(dVar, com.waze.settings.tree.c.f37530a)) {
            return null;
        }
        throw new h.i();
    }

    public static final void q(WazeSettingsView wazeSettingsView, com.waze.settings.tree.d dVar) {
        h.g.b.x.f(wazeSettingsView, "<this>");
        h.g.b.x.f(dVar, "iconSource");
        if (dVar instanceof com.waze.settings.tree.a) {
            wazeSettingsView.K(((com.waze.settings.tree.a) dVar).a());
        } else if (dVar instanceof com.waze.settings.tree.b) {
            wazeSettingsView.p(((com.waze.settings.tree.b) dVar).a());
        } else {
            if (!h.g.b.x.n(dVar, com.waze.settings.tree.c.f37530a)) {
                throw new h.i();
            }
            wazeSettingsView.K(0);
        }
    }

    public static final com.waze.settings.tree.d r(Drawable drawable) {
        return drawable == null ? com.waze.settings.tree.c.f37530a : new com.waze.settings.tree.b(drawable);
    }

    public static final com.waze.settings.tree.d s(Integer num) {
        return num.intValue() == 0 ? com.waze.settings.tree.c.f37530a : new com.waze.settings.tree.a(num.intValue());
    }

    public static final /* synthetic */ List t(String str) {
        String str2 = str;
        return str2.length() > 0 ? h.n.o.af(str2, new String[]{"|"}, 0, 6) : h.a.i.h();
    }

    private static final long u(double d2) {
        TimeUnit timeUnit = TimeUnit.HOURS;
        return h.h.a.c(d2 * 3600000.0d);
    }

    private static final String v(String str, String str2, String str3, String str4) {
        List listI = h.a.i.i(str, str2, str4, str3);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            String str5 = (String) obj;
            if (str5 != null && str5.length() != 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (true == arrayList2.isEmpty()) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            return h.a.i.aM(arrayList2, ", ", null, null, 0, null, 62);
        }
        return null;
    }
}
