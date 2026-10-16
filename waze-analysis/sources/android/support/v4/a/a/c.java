package android.support.v4.a.a;

import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.backported.fixes.SystemPropertyResolverKt;
import com.waze.NativeManager;
import com.waze.ch.a.a.f;
import com.waze.config.ConfigValues;
import com.waze.el;
import com.waze.iu;
import com.waze.main_screen.r;
import com.waze.mg;
import com.waze.network.d.h;
import com.waze.ni;
import com.waze.nl;
import com.waze.shared_infra.r.y;
import com.waze.stats.ax;
import h.a.i;
import h.ab;
import h.g.b.ar;
import h.g.b.m;
import h.g.b.x;
import h.n.o;
import java.lang.reflect.InvocationTargetException;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.av;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f80a;

    public /* synthetic */ c(int i2) {
        this.f80a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h.g.a.a
    public final Object invoke() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        org.a.d.k.b bVarC;
        m mVar;
        Object objA;
        org.a.d.k.b bVarC2;
        m mVar2;
        org.a.d.k.b bVarC3;
        m mVar3;
        String str = "";
        Object[] objArr = null;
        switch (this.f80a) {
            case 0:
                b bVar = d.f81a;
                return Boolean.valueOf(Build.BRAND.equals("robolectric"));
            case 1:
                return true;
            case 2:
                b bVar2 = d.f81a;
                return Boolean.valueOf(Build.BRAND.equals("google"));
            case 3:
                b bVar3 = d.f81a;
                Build.BRAND.equals("google");
                return Boolean.valueOf(e.c.d.a.r("frankel", "blazer", "mustang", "rango").contains(Build.PRODUCT));
            case 4:
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    Object objInvoke = cls.getMethod("get", String.class, String.class).invoke(cls, SystemPropertyResolverKt.ALIAS_BITSET_PROP_NAME, "");
                    x.d(objInvoke, "null cannot be cast to non-null type kotlin.String");
                    str = (String) objInvoke;
                } catch (Exception unused) {
                }
                List listB = i.b();
                Iterator it = o.ae(str, new char[]{','}).iterator();
                while (it.hasNext()) {
                    try {
                        listB.add(Long.valueOf(Long.parseLong((String) it.next())));
                    } catch (NumberFormatException unused2) {
                    }
                }
                BitSet bitSetValueOf = BitSet.valueOf(i.aB(i.a(listB)));
                int size = bitSetValueOf.size();
                if (size == 0) {
                    return e.c.d.a.p();
                }
                Set setN = e.c.d.a.n(size);
                for (int iNextSetBit = 0; iNextSetBit >= 0; iNextSetBit = bitSetValueOf.nextSetBit(iNextSetBit + 1)) {
                    if (bitSetValueOf.get(iNextSetBit)) {
                        setN.add(Integer.valueOf(iNextSetBit));
                    }
                    if (iNextSetBit == Integer.MAX_VALUE) {
                        return e.c.d.a.l(setN);
                    }
                }
                return e.c.d.a.l(setN);
            case 5:
                com.waze.c cVar = com.waze.c.f18214a;
                return bo.j();
            case 6:
                int i2 = el.f23656h;
                return ab.f48028a;
            case 7:
                return ab.f48028a;
            case 8:
                return Boolean.valueOf(ConfigValues.CONFIG_VALUE_SIGNUP_U16_IS_FEATURE_ENABLED.b().booleanValue() || ConfigValues.CONFIG_VALUE_U16_IS_FEATURE_ENABLED.b().booleanValue());
            case 9:
                NativeManager nativeManager = NativeManager.getInstance();
                x.e(nativeManager, "getInstance(...)");
                iu.SilentLogOut$default(nativeManager, null, 1, null);
                return ab.f48028a;
            case 10:
                return f.g(com.waze.bo.b.b.f17180a);
            case 11:
                ni niVar = nl.f32526a;
                boolean z = niVar instanceof org.a.d.a.b;
                if (z) {
                    bVarC = ((org.a.d.a.b) niVar).l();
                    int i3 = ar.f48106a;
                    mVar = new m(ax.class);
                } else {
                    bVarC = niVar.getKoin().a().c();
                    int i4 = ar.f48106a;
                    mVar = new m(ax.class);
                }
                ax axVar = (ax) bVarC.a(mVar, null, null);
                if (z) {
                    objA = ((org.a.d.a.b) niVar).l().a(new m(h.class), null, null);
                    objArr = 1;
                } else {
                    objA = niVar.getKoin().a().c().a(new m(h.class), null, null);
                }
                h hVar = (h) objA;
                if (objArr != null) {
                    bVarC2 = ((org.a.d.a.b) niVar).l();
                    mVar2 = new m(y.class);
                } else {
                    bVarC2 = niVar.getKoin().a().c();
                    mVar2 = new m(y.class);
                }
                y yVar = (y) bVarC2.a(mVar2, null, null);
                SharedPreferences sharedPreferencesA = com.waze.be.b.f16231a.a(mg.f29780a.a());
                kotlinx.coroutines.ab abVarA = av.a();
                if (objArr != null) {
                    bVarC3 = ((org.a.d.a.b) niVar).l();
                    mVar3 = new m(com.waze.copilot.data.b.a.class);
                } else {
                    bVarC3 = niVar.getKoin().a().c();
                    mVar3 = new m(com.waze.copilot.data.b.a.class);
                }
                com.waze.copilot.data.b.a aVar = (com.waze.copilot.data.b.a) bVarC3.a(mVar3, null, null);
                com.waze.shared_infra.i.e eVarD = com.waze.shared_infra.i.a.d("WazeUserCleanupManager");
                x.e(eVarD, "create(...)");
                com.waze.sharedui.profile.b bVarA = com.waze.sharedui.profile.b.a();
                x.e(bVarA, "getInstance(...)");
                return new nl(axVar, hVar, yVar, sharedPreferencesA, bVarA, com.waze.uid.b.ab.f44136a.a(), aVar, abVarA, eVarD);
            case 12:
                com.waze.a.h hVar2 = com.waze.a.h.f13638a;
                return ab.f48028a;
            case 13:
                return ConfigValues.CONFIG_VALUE_ALERTS_NEARING_TRIGGER_DISTANCE.b();
            case 14:
                return Integer.valueOf((int) ConfigValues.CONFIG_VALUE_ALERTS_AERIAL_DISTANCE_CAPPING.b().longValue());
            case 15:
                return ConfigValues.CONFIG_VALUE_WAZE_MAP_USE_BG_THREAD_LABEL_POSITION_CALCULATION.b();
            case 16:
                return ab.f48028a;
            case 17:
                return ab.f48028a;
            case 18:
                return ab.f48028a;
            case 19:
                return ab.f48028a;
            default:
                return r.f27406a;
        }
    }
}
