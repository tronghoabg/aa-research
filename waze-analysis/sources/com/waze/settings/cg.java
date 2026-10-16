package com.waze.settings;

import android.os.Bundle;
import android.view.View;
import androidx.activity.contextaware.ContextAware;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import androidx.navigation.fragment.NavHostFragment;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cg extends com.waze.app_nav.a.b implements org.a.a.b.a, ce {

    /* renamed from: a, reason: collision with root package name */
    public NavController f36964a;

    /* renamed from: b, reason: collision with root package name */
    private final h.f f36965b;

    /* renamed from: c, reason: collision with root package name */
    private final h.f f36966c;

    /* JADX WARN: Multi-variable type inference failed */
    public cg() {
        super(R.layout.settings_main, null, 2, 0 == true ? 1 : 0);
        this.f36965b = org.a.b.b.d.a(this);
        this.f36966c = h.g.b(h.h.f48130a, new cf(this, new com.waze.bk.f(this, 4), 0));
    }

    static final h.ab d(cg cgVar, Integer num) {
        if (num != null) {
            int iIntValue = num.intValue();
            ContextAware parentFragment = cgVar.getParentFragment();
            ce ceVar = parentFragment instanceof ce ? (ce) parentFragment : null;
            if (ceVar != null) {
                ceVar.a().b(iIntValue);
            } else if (iIntValue == 3) {
                com.waze.app_nav.a.v vVar = (com.waze.app_nav.a.v) cgVar.bE();
                if (vVar != null) {
                    vVar.H(com.waze.app_nav.a.aa.f15098a);
                }
            } else {
                com.waze.app_nav.a.v vVar2 = (com.waze.app_nav.a.v) cgVar.bE();
                if (vVar2 != null) {
                    vVar2.H(com.waze.app_nav.a.z.f15165a);
                }
            }
        }
        return h.ab.f48028a;
    }

    @Override // com.waze.settings.ce
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cu a() {
        return (cu) this.f36966c.getValue();
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f36965b.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // com.waze.app_nav.a.b, android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        super.onViewCreated(view, bundle);
        NavHostFragment navHostFragment = (NavHostFragment) getChildFragmentManager().g(R.id.nav_host);
        h.g.b.x.c(navHostFragment);
        NavController navControllerFindNavController = FragmentKt.findNavController(navHostFragment);
        h.g.b.x.f(navControllerFindNavController, "<set-?>");
        this.f36964a = navControllerFindNavController;
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("model") : null;
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString(TtmlNode.ATTR_TTS_ORIGIN) : null;
        if (string == null) {
            string = "";
        }
        cu cuVarA = a();
        if (string2 == null) {
            string2 = "";
        }
        cuVarA.d(string, string2);
        FlowLiveDataConversions.asLiveData$default(a().a(), (h.c.j) null, 0L, 3, (Object) null).observe(getViewLifecycleOwner(), new aw(new am(this, 3), 2, (char[]) null));
    }
}
