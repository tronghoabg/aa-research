package com.waze.uid.c;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.ch;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.waze.R;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bf extends be {

    /* renamed from: a, reason: collision with root package name */
    private final String f44268a;

    /* renamed from: b, reason: collision with root package name */
    private Runnable f44269b;

    public bf() {
        super(R.layout.uid_fragment_back, null, com.waze.uid.activities.e.f44087a, false, bd.f44257a, 10);
        this.f44268a = "UidFrameFragment";
    }

    public final void a(Runnable runnable) {
        this.f44269b = runnable;
    }

    public final void b(android.support.v4.app.ar arVar, String str, boolean z) {
        ScrollView scrollView;
        h.g.b.x.f(arVar, "it");
        h.g.b.x.f(str, "tag");
        if (getChildFragmentManager().h(str) != null) {
            com.waze.shared_infra.i.h.b(this.f44268a, "new fragment has same viewId as the new one. id=".concat(String.valueOf(str)));
            return;
        }
        View view = getView();
        if (view != null && (scrollView = (ScrollView) view.findViewById(R.id.scrollViewContainer)) != null) {
            scrollView.smoothScrollTo(0, 0);
        }
        ch chVarU = getChildFragmentManager().u();
        if (z) {
            chVarU.y(R.anim.uid_slide_in_left, R.anim.uid_slide_out_right);
        } else {
            chVarU.y(R.anim.uid_slide_in_right, R.anim.uid_slide_out_left);
        }
        chVarU.x(R.id.fragmentView, arVar, str);
        chVarU.a();
    }

    @Override // com.waze.uid.c.be
    public final boolean d() {
        List<android.support.v4.app.ar> listX = getChildFragmentManager().x();
        h.g.b.x.e(listX, "getFragments(...)");
        for (android.support.v4.app.ar arVar : listX) {
            if (arVar.isVisible() && (arVar instanceof be) && ((be) arVar).d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.waze.uid.c.be, android.support.v4.app.ar
    public final void onAttach(Context context) {
        h.g.b.x.f(context, "context");
        super.onAttach(context);
        Runnable runnable = this.f44269b;
        if (runnable != null) {
            runnable.run();
        }
        this.f44269b = null;
    }

    @Override // android.support.v4.app.ar
    public final void onViewCreated(View view, Bundle bundle) {
        h.g.b.x.f(view, "view");
        ImageView imageView = (ImageView) view.findViewById(R.id.backButton);
        imageView.setOnClickListener(new ab(this, 11));
        h.g.b.x.c(imageView);
        com.waze.shared_infra.g.e.e(imageView, (14 & 2) != 0, (14 & 4) != 0, (14 & 8) != 0, (14 & 16) != 0);
        View viewFindViewById = view.findViewById(R.id.fragmentView);
        h.g.b.x.e(viewFindViewById, "findViewById(...)");
        com.waze.shared_infra.g.e.e(viewFindViewById, (14 & 2) != 0, (14 & 4) != 0, (14 & 8) != 0, (14 & 16) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.waze.uid.c.be, com.waze.uid.b.b
    public final void p(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, "activityEvent");
        List<android.support.v4.app.ar> listX = getChildFragmentManager().x();
        h.g.b.x.e(listX, "getFragments(...)");
        boolean z = false;
        for (android.support.v4.app.ar arVar : listX) {
            if (arVar.isVisible() && (arVar instanceof com.waze.uid.b.b)) {
                ((com.waze.uid.b.b) arVar).p(sVar);
                z = true;
            }
        }
        if (z) {
            return;
        }
        super.p(sVar);
    }
}
