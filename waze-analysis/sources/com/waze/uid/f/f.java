package com.waze.uid.f;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.MutableLiveData;
import com.waze.R;
import com.waze.sharedui.h;
import com.waze.sharedui.profile.UserProfile;
import com.waze.uid.UidModel;
import com.waze.uid.b.ab;
import com.waze.uid.b.ad;
import com.waze.uid.b.m;
import com.waze.uid.d.i;
import com.waze.uid.d.q;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f extends ad {

    /* renamed from: a, reason: collision with root package name */
    private final List f44512a;

    /* renamed from: b, reason: collision with root package name */
    private int f44513b;

    /* renamed from: c, reason: collision with root package name */
    private final MutableLiveData f44514c;

    /* renamed from: d, reason: collision with root package name */
    private final MutableLiveData f44515d;

    /* JADX WARN: Illegal instructions before constructor call */
    public f() throws Resources.NotFoundException {
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        x.f(aVarA, "stringProvider");
        super(aVarA);
        ArrayList<c> arrayList = new ArrayList();
        this.f44512a = arrayList;
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f44514c = mutableLiveData;
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        this.f44515d = mutableLiveData2;
        u(ab.f44136a.a());
        mutableLiveData2.setValue(null);
        int i2 = 0;
        mutableLiveData.setValue(false);
        UserProfile userProfileC = com.waze.sharedui.profile.b.c();
        x.e(userProfileC, "getProfile(...)");
        arrayList.add(com.waze.ui.w.a.b.a(userProfileC));
        m mVarP = p();
        x.d(mVarP, "null cannot be cast to non-null type com.waze.uid.controller.EventsController<com.waze.uid.UidModel>");
        UserProfile existingProfile = ((UidModel) mVarP.b()).getEmailParameters().getExistingProfile();
        x.c(existingProfile);
        arrayList.add(com.waze.ui.w.a.b.a(existingProfile));
        for (final c cVar : arrayList) {
            if (cVar.h().length() > 0) {
                h hVarK = h.k();
                x.e(hVarK, "get(...)");
                int dimensionPixelSize = hVarK.a().getResources().getDimensionPixelSize(R.dimen.chooseAccountImageSize);
                hVarK.e(cVar.h(), dimensionPixelSize, dimensionPixelSize, new e(this, cVar, i2));
            } else if (cVar.a() > 0) {
                i iVar = q.f44463a.a().f44467e;
                Context contextA = h.k().a();
                x.e(contextA, "getApplicationContext(...)");
                iVar.m(contextA, cVar.a(), new l() { // from class: com.waze.uid.f.d
                    @Override // h.g.a.l
                    public final Object invoke(Object obj) {
                        return f.d(this.f44507a, cVar, (Drawable) obj);
                    }
                });
            } else {
                this.f44514c.setValue(true);
            }
        }
    }

    static final h.ab d(f fVar, c cVar, Drawable drawable) {
        fVar.h(cVar, drawable);
        return h.ab.f48028a;
    }

    static final void f(f fVar, c cVar, Bitmap bitmap) {
        fVar.h(cVar, bitmap == null ? null : new com.waze.sharedui.views.i(bitmap, 0));
    }

    private final void h(c cVar, Drawable drawable) {
        cVar.k(drawable);
        int i2 = this.f44513b + 1;
        this.f44513b = i2;
        if (i2 == this.f44512a.size()) {
            this.f44514c.setValue(true);
        }
    }

    public final MutableLiveData a() {
        return this.f44514c;
    }

    public final MutableLiveData b() {
        return this.f44515d;
    }

    public final List c() {
        return this.f44512a;
    }

    public final void e(long j2) {
        super.o(new com.waze.uid.state_impl.add_id.ab(j2));
        this.f44515d.setValue(Long.valueOf(j2));
    }

    public final boolean g() {
        return this.f44515d.getValue() != 0;
    }
}
