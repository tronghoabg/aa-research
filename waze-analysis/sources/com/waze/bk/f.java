package com.waze.bk;

import android.content.Context;
import android.support.v4.app.ar;
import androidx.activity.contextaware.ContextAware;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.waze.br.c.u;
import com.waze.br.c.v;
import com.waze.br.c.x;
import com.waze.config.ConfigValues;
import com.waze.settings.SettingsMainActivity;
import com.waze.settings.az;
import com.waze.settings.ce;
import com.waze.settings.cg;
import com.waze.settings.gr;
import com.waze.settings.gy;
import com.waze.settings.z;
import com.waze.sharedrive.d.aq;
import com.waze.sharedrive.e.at;
import com.waze.sharedrive.g.ag;
import h.ab;
import java.util.concurrent.Executor;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final /* synthetic */ class f implements h.g.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f16859a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f16860b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f16860b = i2;
        this.f16859a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v101, types: [h.g.a.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v32, types: [androidx.navigation.NavController] */
    /* JADX WARN: Type inference failed for: r5v37, types: [androidx.navigation.NavController] */
    /* JADX WARN: Type inference failed for: r5v88, types: [com.waze.sharedrive.d.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v91, types: [h.g.a.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v99, types: [h.g.a.l, java.lang.Object] */
    @Override // h.g.a.a
    public final Object invoke() {
        switch (this.f16860b) {
            case 0:
                return g.b((g) this.f16859a);
            case 1:
                Object obj = this.f16859a;
                if (obj instanceof com.waze.br.c.f) {
                    return x.f17419d;
                }
                if (obj instanceof com.waze.br.c.g) {
                    return x.f17419d;
                }
                if (h.g.b.x.n(obj, com.waze.br.c.h.f17395a)) {
                    return x.f17416a;
                }
                if (h.g.b.x.n(obj, com.waze.br.c.j.f17397a)) {
                    return x.f17417b;
                }
                if (obj instanceof com.waze.br.c.k) {
                    return x.f17418c;
                }
                if (obj instanceof com.waze.br.c.l) {
                    return x.f17420e;
                }
                if (h.g.b.x.n(obj, com.waze.br.c.m.f17400a)) {
                    return x.f17419d;
                }
                throw new h.i();
            case 2:
                Object obj2 = this.f16859a;
                if ((obj2 instanceof com.waze.br.c.f) || (obj2 instanceof com.waze.br.c.g) || h.g.b.x.n(obj2, com.waze.br.c.h.f17395a) || h.g.b.x.n(obj2, com.waze.br.c.j.f17397a) || h.g.b.x.n(obj2, com.waze.br.c.m.f17400a)) {
                    return new v(null);
                }
                if (obj2 instanceof com.waze.br.c.k) {
                    Float fA = ((com.waze.br.c.k) obj2).a();
                    return fA != null ? new u(fA.floatValue()) : new v(null);
                }
                if (!(obj2 instanceof com.waze.br.c.l)) {
                    throw new h.i();
                }
                Float fA2 = ((com.waze.br.c.l) obj2).a();
                return fA2 != null ? new u(fA2.floatValue()) : new v(null);
            case 3:
                ?? r5 = ((SettingsMainActivity) this.f16859a).f36692f;
                if (r5 == 0) {
                    h.g.b.x.j("navController");
                } else {
                    ceVar = r5;
                }
                return com.waze.ch.a.a.f.g(ceVar);
            case 4:
                ?? r52 = ((cg) this.f16859a).f36964a;
                if (r52 == 0) {
                    h.g.b.x.j("navController");
                } else {
                    ceVar = r52;
                }
                return com.waze.ch.a.a.f.g(ceVar);
            case 5:
                ar arVarRequireParentFragment = ((ar) this.f16859a).requireParentFragment();
                h.g.b.x.e(arVarRequireParentFragment, "requireParentFragment(...)");
                return (gy) h.g.b(h.h.f48132c, new az(arVarRequireParentFragment, new z(arVarRequireParentFragment, 5), 3)).getValue();
            case 6:
                ContextAware parentFragment = ((ar) this.f16859a).getParentFragment();
                ceVar = parentFragment instanceof ce ? (ce) parentFragment : null;
                h.g.b.x.c(ceVar);
                return ceVar.a();
            case 7:
                return Integer.valueOf((int) ((gr) this.f16859a).d().f().getConfigValueLong(ConfigValues.CONFIG_VALUE_SOUND_PROMPTS_VOLUME_ANDROID));
            case 8:
                ((gy) this.f16859a).f37362c.s();
                return ab.f48028a;
            case 9:
                ContextAware parentFragment2 = ((ar) this.f16859a).getParentFragment();
                ce ceVar = parentFragment2 instanceof ce ? (ce) parentFragment2 : null;
                if (ceVar != null) {
                    return ceVar.a();
                }
                return null;
            case 10:
                ContextAware parentFragment3 = ((ar) this.f16859a).getParentFragment();
                ce ceVar2 = parentFragment3 instanceof ce ? (ce) parentFragment3 : null;
                if (ceVar2 != null) {
                    return ceVar2.a();
                }
                return null;
            case 11:
                ContextAware parentFragment4 = ((ar) this.f16859a).getParentFragment();
                ce ceVar3 = parentFragment4 instanceof ce ? (ce) parentFragment4 : null;
                if (ceVar3 != null) {
                    return ceVar3.a();
                }
                return null;
            case 12:
                return bo.f((Executor) this.f16859a);
            case 13:
                int i2 = com.waze.shared_infra.r.n.f37979a;
                return LocalBroadcastManager.getInstance(((Context) this.f16859a).getApplicationContext());
            case 14:
                aq aqVarA = this.f16859a.a();
                if (aqVarA != null) {
                    return aqVarA;
                }
                throw new IllegalArgumentException("LiveShareDriveViewModel created while factory is unavailable (FF off?)");
            case 15:
                return a.a.k(this.f16859a);
            case 16:
                ((at) this.f16859a).q();
                return ab.f48028a;
            case 17:
                ((at) this.f16859a).m();
                return ab.f48028a;
            case 18:
                this.f16859a.invoke(null);
                return ab.f48028a;
            case 19:
                this.f16859a.invoke(null);
                return ab.f48028a;
            default:
                int i3 = ag.f38615a;
                return Boolean.valueOf(((LazyListState) this.f16859a).getCanScrollBackward());
        }
    }
}
