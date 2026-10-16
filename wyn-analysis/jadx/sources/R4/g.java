package R4;

import Y4.m;
import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class g extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public final a f10239a;

    /* renamed from: b, reason: collision with root package name */
    public final xa.d f10240b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f10241c;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.h f10242d;

    /* renamed from: e, reason: collision with root package name */
    public g f10243e;

    public g() {
        a aVar = new a();
        this.f10240b = new xa.d(this, 22);
        this.f10241c = new HashSet();
        this.f10239a = aVar;
    }

    public final void a(Activity activity) {
        g gVar = this.f10243e;
        if (gVar != null) {
            gVar.f10241c.remove(this);
            this.f10243e = null;
        }
        h hVar = com.bumptech.glide.b.b(activity).f24215f;
        hVar.getClass();
        g gVarC = hVar.c(activity.getFragmentManager(), h.e(activity));
        this.f10243e = gVarC;
        if (equals(gVarC)) {
            return;
        }
        this.f10243e.f10241c.add(this);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e7) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e7);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a aVar = this.f10239a;
        aVar.f10232b = true;
        Iterator it = m.d((Set) aVar.f10233c).iterator();
        while (it.hasNext()) {
            ((e) it.next()).onDestroy();
        }
        g gVar = this.f10243e;
        if (gVar != null) {
            gVar.f10241c.remove(this);
            this.f10243e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        g gVar = this.f10243e;
        if (gVar != null) {
            gVar.f10241c.remove(this);
            this.f10243e = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f10239a.a();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a aVar = this.f10239a;
        aVar.f10231a = false;
        Iterator it = m.d((Set) aVar.f10233c).iterator();
        while (it.hasNext()) {
            ((e) it.next()).a();
        }
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = null;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
