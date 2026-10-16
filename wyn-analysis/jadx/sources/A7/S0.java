package A7;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Iterator;
import java.util.TreeSet;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.json.JSONException;
import y3.C4552j;

/* loaded from: classes4.dex */
public final /* synthetic */ class S0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f694a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Bundle f695b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ P0 f696c;

    public /* synthetic */ S0() {
        this.f694a = 0;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        Bundle bundleO;
        switch (this.f694a) {
            case 0:
                P0 p02 = this.f696c;
                p02.getClass();
                Bundle bundle = this.f695b;
                boolean zIsEmpty = bundle.isEmpty();
                C0273n0 c0273n0 = (C0273n0) p02.f421a;
                if (zIsEmpty) {
                    bundleO = bundle;
                } else {
                    bundleO = p02.a0().f785z.o();
                    if (c0273n0.f979g.o0(null, AbstractC0304y.f1188h1)) {
                        bundleO = new Bundle(bundleO);
                    }
                    Iterator<String> it = bundle.keySet().iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        C4552j c4552j = p02.f668v;
                        C0245e c0245e = c0273n0.f979g;
                        if (zHasNext) {
                            String next = it.next();
                            Object obj = bundle.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                p02.b0();
                                if (U1.M0(obj)) {
                                    p02.b0();
                                    U1.H0(c4552j, null, 27, null, null, 0);
                                }
                                p02.zzj().k.b(next, "Invalid default event parameter type. Name, value", obj);
                            } else if (U1.j1(next)) {
                                p02.zzj().k.d("Invalid default event parameter name. Name", next);
                            } else if (obj == null) {
                                bundleO.remove(next);
                            } else {
                                U1 u1B0 = p02.b0();
                                c0245e.getClass();
                                if (u1B0.O0("param", 500, next, obj)) {
                                    p02.b0().F0(next, obj, bundleO);
                                }
                            }
                        } else {
                            p02.b0();
                            int i5 = c0245e.b0().U0(201500000) ? 100 : 25;
                            if (bundleO.size() > i5) {
                                Iterator it2 = new TreeSet(bundleO.keySet()).iterator();
                                int i10 = 0;
                                while (it2.hasNext()) {
                                    String str = (String) it2.next();
                                    i10++;
                                    if (i10 > i5) {
                                        bundleO.remove(str);
                                    }
                                }
                                p02.b0();
                                U1.H0(c4552j, null, 26, null, null, 0);
                                p02.zzj().k.c("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                        }
                    }
                }
                p02.a0().f785z.p(bundleO);
                if (!bundle.isEmpty() || c0273n0.f979g.o0(null, AbstractC0304y.f1)) {
                    C0271m1 c0271m1H = AbstractC0279p0.h(c0273n0);
                    c0271m1H.m0(new RunnableC0299w0(c0271m1H, c0271m1H.w0(false), (Object) bundleO, 7));
                    break;
                }
                break;
            case 1:
                P0 p03 = this.f696c;
                p03.c0();
                p03.h0();
                Bundle bundle2 = this.f695b;
                String string = bundle2.getString(MediationMetaData.KEY_NAME);
                AbstractC1732v.f(string);
                C0273n0 c0273n02 = (C0273n0) p03.f421a;
                if (!c0273n02.e()) {
                    p03.zzj().f612n.c("Conditional property not cleared since app measurement is disabled");
                    break;
                } else {
                    R1 r12 = new R1(0L, null, string, "");
                    try {
                        U1 u1B02 = p03.b0();
                        bundle2.getString("app_id");
                        c0273n02.m().k0(new C0242d(bundle2.getString("app_id"), "", r12, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), u1B02.m0(bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), "", bundle2.getLong("creation_timestamp"), true)));
                        break;
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            default:
                P0 p04 = this.f696c;
                p04.c0();
                p04.h0();
                Bundle bundle3 = this.f695b;
                String string2 = bundle3.getString(MediationMetaData.KEY_NAME);
                String string3 = bundle3.getString("origin");
                AbstractC1732v.f(string2);
                AbstractC1732v.f(string3);
                AbstractC1732v.i(bundle3.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR));
                C0273n0 c0273n03 = (C0273n0) p04.f421a;
                if (!c0273n03.e()) {
                    p04.zzj().f612n.c("Conditional property not set since app measurement is disabled");
                    break;
                } else {
                    R1 r13 = new R1(bundle3.getLong("triggered_timestamp"), bundle3.get(MimeTypesReaderMetKeys.MATCH_VALUE_ATTR), string2, string3);
                    try {
                        U1 u1B03 = p04.b0();
                        bundle3.getString("app_id");
                        C0301x c0301xM0 = u1B03.m0(bundle3.getString("triggered_event_name"), bundle3.getBundle("triggered_event_params"), string3, 0L, true);
                        U1 u1B04 = p04.b0();
                        bundle3.getString("app_id");
                        C0301x c0301xM02 = u1B04.m0(bundle3.getString("timed_out_event_name"), bundle3.getBundle("timed_out_event_params"), string3, 0L, true);
                        U1 u1B05 = p04.b0();
                        bundle3.getString("app_id");
                        c0273n03.m().k0(new C0242d(bundle3.getString("app_id"), string3, r13, bundle3.getLong("creation_timestamp"), false, bundle3.getString("trigger_event_name"), c0301xM02, bundle3.getLong("trigger_timeout"), c0301xM0, bundle3.getLong("time_to_live"), u1B05.m0(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), string3, 0L, true)));
                        break;
                    } catch (IllegalArgumentException unused2) {
                        return;
                    }
                }
        }
    }

    public /* synthetic */ S0(P0 p02, Bundle bundle, int i5) {
        this.f694a = i5;
        this.f695b = bundle;
        this.f696c = p02;
    }
}
