package com.waze.settings.f.a;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.NativeManager;
import com.waze.beacons.p;
import com.waze.config.ConfigValues;
import com.waze.native_managers.h;
import com.waze.native_managers.i;
import com.waze.settings.v;
import h.g.b.x;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final NativeManager f37215a;

    /* renamed from: b, reason: collision with root package name */
    private List f37216b;

    /* renamed from: c, reason: collision with root package name */
    private final k f37217c;

    /* renamed from: d, reason: collision with root package name */
    private final k f37218d;

    public e(NativeManager nativeManager, i iVar, v vVar) {
        x.f(nativeManager, "nativeManager");
        x.f(iVar, "nativeTaskScheduler");
        x.f(vVar, "config");
        this.f37215a = nativeManager;
        this.f37216b = h.a.i.h();
        ch chVarL = ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS.l();
        x.e(chVarL, "getStateFlow(...)");
        this.f37217c = new d(chVarL, 1);
        ch chVarL2 = ConfigValues.CONFIG_VALUE_ROUTING_AVAILABLE_HOV_SUBSCRIPTIONS.l();
        x.e(chVarL2, "getStateFlow(...)");
        this.f37218d = new d(chVarL2, 0);
        iVar.post(h.f30693c, new p(this, 9));
    }

    public static final List f() {
        String strB = ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS.b();
        x.e(strB, "getValue(...)");
        return com.waze.nightmode.e.t(strB);
    }

    public static final void g(List list) {
        x.f(list, "activeIds");
        x.f(list, "availableIds");
        ConfigValues.CONFIG_VALUE_ROUTING_ACTIVE_HOV_SUBSCRIPTIONS.d(h.a.i.aM(list, "|", null, null, 0, null, 62));
    }

    public final String a(String str) {
        Object next;
        String str2;
        x.f(str, TtmlNode.ATTR_ID);
        Iterator it = this.f37216b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (x.n(((NativeManager.HOVPermitDescriptor) next).id, str)) {
                break;
            }
        }
        NativeManager.HOVPermitDescriptor hOVPermitDescriptor = (NativeManager.HOVPermitDescriptor) next;
        return (hOVPermitDescriptor == null || (str2 = hOVPermitDescriptor.name) == null) ? "" : str2;
    }

    public final List b() {
        return this.f37216b;
    }

    public final k c() {
        return this.f37217c;
    }

    public final k d() {
        return this.f37218d;
    }

    public final void e() {
        NativeManager.HOVPermitDescriptor[] hOVPermitDescriptorArrConfigGetHOVPermitDescriptors = this.f37215a.configGetHOVPermitDescriptors();
        this.f37216b = hOVPermitDescriptorArrConfigGetHOVPermitDescriptors != null ? h.a.c.R(hOVPermitDescriptorArrConfigGetHOVPermitDescriptors) : h.a.i.h();
    }
}
