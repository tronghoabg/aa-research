package R4;

import Y4.m;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.F;
import androidx.fragment.app.e0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import y3.C4552j;

/* loaded from: classes.dex */
public class j extends F {

    /* renamed from: a, reason: collision with root package name */
    public final a f10250a;

    /* renamed from: b, reason: collision with root package name */
    public final C4552j f10251b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f10252c;

    /* renamed from: d, reason: collision with root package name */
    public j f10253d;

    /* renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.h f10254e;

    public j() {
        a aVar = new a();
        this.f10251b = new C4552j(this, 22);
        this.f10252c = new HashSet();
        this.f10250a = aVar;
    }

    @Override // androidx.fragment.app.F
    public final void onAttach(Context context) {
        super.onAttach(context);
        F parentFragment = this;
        while (parentFragment.getParentFragment() != null) {
            parentFragment = parentFragment.getParentFragment();
        }
        e0 fragmentManager = parentFragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            Context context2 = getContext();
            j jVar = this.f10253d;
            if (jVar != null) {
                jVar.f10252c.remove(this);
                this.f10253d = null;
            }
            h hVar = com.bumptech.glide.b.b(context2).f24215f;
            hVar.getClass();
            j jVarD = hVar.d(fragmentManager, h.e(context2));
            this.f10253d = jVarD;
            if (equals(jVarD)) {
                return;
            }
            this.f10253d.f10252c.add(this);
        } catch (IllegalStateException e7) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e7);
            }
        }
    }

    @Override // androidx.fragment.app.F
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f10250a;
        aVar.f10232b = true;
        Iterator it = m.d((Set) aVar.f10233c).iterator();
        while (it.hasNext()) {
            ((e) it.next()).onDestroy();
        }
        j jVar = this.f10253d;
        if (jVar != null) {
            jVar.f10252c.remove(this);
            this.f10253d = null;
        }
    }

    @Override // androidx.fragment.app.F
    public final void onDetach() {
        super.onDetach();
        j jVar = this.f10253d;
        if (jVar != null) {
            jVar.f10252c.remove(this);
            this.f10253d = null;
        }
    }

    @Override // androidx.fragment.app.F
    public final void onStart() {
        super.onStart();
        this.f10250a.a();
    }

    @Override // androidx.fragment.app.F
    public final void onStop() {
        super.onStop();
        a aVar = this.f10250a;
        aVar.f10231a = false;
        Iterator it = m.d((Set) aVar.f10233c).iterator();
        while (it.hasNext()) {
            ((e) it.next()).a();
        }
    }

    @Override // androidx.fragment.app.F
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        F parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
