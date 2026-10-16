package com.waze.uid.b;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import com.waze.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ad extends ViewModel implements h {

    /* renamed from: a, reason: collision with root package name */
    private final String f44141a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44142b;

    /* renamed from: c, reason: collision with root package name */
    private final List f44143c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f44144d;

    /* renamed from: e, reason: collision with root package name */
    private final MutableLiveData f44145e;

    /* renamed from: f, reason: collision with root package name */
    private final LiveData f44146f;

    /* renamed from: g, reason: collision with root package name */
    private final MutableLiveData f44147g;

    /* renamed from: h, reason: collision with root package name */
    private final ac f44148h;

    public ad(com.waze.shared_infra.o.a aVar) {
        h.g.b.x.f(aVar, "stringProvider");
        this.f44141a = "ControllerViewModel";
        this.f44142b = aVar.c(R.string.VERIFY_EMAIL_LOADER, new Object[0]);
        this.f44143c = new ArrayList();
        this.f44144d = ck.b(null);
        MutableLiveData mutableLiveData = new MutableLiveData(e.c.d.a.p());
        this.f44145e = mutableLiveData;
        LiveData map = Transformations.map(mutableLiveData, new com.waze.ui.x.a(10));
        com.waze.shared_infra.s.h.d(map);
        this.f44146f = map;
        this.f44147g = new MutableLiveData();
        this.f44148h = new ac(this);
    }

    public void i(i iVar) {
        h.g.b.x.f(iVar, "state");
    }

    public final LiveData l() {
        return this.f44146f;
    }

    public final MutableLiveData m() {
        return this.f44147g;
    }

    protected final MutableLiveData n() {
        return this.f44145e;
    }

    @Override // com.waze.uid.b.h
    public final void o(com.waze.tide.s sVar) {
        h.g.b.x.f(sVar, NotificationCompat.CATEGORY_EVENT);
        m mVarP = p();
        if (mVarP != null) {
            mVarP.o(sVar);
        }
    }

    @Override // androidx.lifecycle.ViewModel
    protected final void onCleared() {
        List list = this.f44143c;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((m) it.next()).s(this.f44148h);
        }
        list.clear();
    }

    protected final m p() {
        Object obj;
        Iterator it = this.f44143c.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iA = ((m) next).a().a();
                while (true) {
                    Object next2 = it.next();
                    int iA2 = ((m) next2).a().a();
                    int i2 = iA < iA2 ? iA2 : iA;
                    if (iA < iA2) {
                        next = next2;
                    }
                    if (!it.hasNext()) {
                        break;
                    }
                    iA = i2;
                }
            }
            obj = next;
        } else {
            obj = null;
        }
        return (m) obj;
    }

    protected final String q() {
        return this.f44142b;
    }

    protected final String r() {
        return this.f44141a;
    }

    protected final bn s() {
        return this.f44144d;
    }

    public final ch t() {
        return ai.U(this.f44144d);
    }

    public final void u(m mVar) {
        h.g.b.x.f(mVar, "uiAdapter");
        mVar.r(this.f44148h);
        this.f44143c.add(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void v() {
        m mVarP = p();
        if (mVarP != null) {
            i(mVarP.a());
            if (mVarP.n()) {
                MutableLiveData mutableLiveData = this.f44147g;
                Integer num = (Integer) mutableLiveData.getValue();
                mutableLiveData.setValue(Integer.valueOf(num != null ? num.intValue() + 1 : 0));
            }
        }
    }

    public final com.waze.tide.s w() {
        m mVarP = p();
        if (mVarP != null) {
            return mVarP.v();
        }
        return null;
    }
}
