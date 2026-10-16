package com.waze.inbox;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.material.textfield.ao;
import com.waze.jni.protos.InboxMessage;
import com.waze.jni.protos.inbox.InboxMessageList;
import h.g.b.ar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class InboxRecycler extends RecyclerView {
    private Map P;
    private List Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private i W;

    public InboxRecycler(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.P = new HashMap();
        this.Q = new ArrayList();
        getContext();
        al(new LinearLayoutManager());
        ak(new y(this));
    }

    public static /* synthetic */ void aI(InboxRecycler inboxRecycler) {
        Iterator it = inboxRecycler.Q.iterator();
        while (it.hasNext()) {
            inboxRecycler.P.put(((n) it.next()).c(), false);
        }
        inboxRecycler.R = false;
    }

    public static /* synthetic */ void aK(InboxRecycler inboxRecycler) {
        Iterator it = inboxRecycler.Q.iterator();
        while (it.hasNext()) {
            inboxRecycler.P.put(((n) it.next()).c(), true);
        }
        inboxRecycler.R = false;
    }

    static /* bridge */ /* synthetic */ void aL(InboxRecycler inboxRecycler) {
        if (inboxRecycler.V) {
            return;
        }
        inboxRecycler.V = true;
        inboxRecycler.U = true;
        InboxNativeManager.getInstance().loadMoreMessages();
    }

    private final List aX() {
        ArrayList arrayList = new ArrayList();
        for (n nVar : this.Q) {
            if (aV(nVar)) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void aY(j jVar, boolean z) {
        n nVarA = jVar.a();
        if (aV(nVarA)) {
            if (z) {
                z = true;
                if (aV(nVarA)) {
                    return;
                } else {
                    return;
                }
            }
        } else if (aV(nVarA) || !z) {
            return;
        }
        jVar.c();
    }

    private final String[] aZ() {
        List listAX = aX();
        String[] strArr = new String[listAX.size()];
        for (int i2 = 0; i2 < listAX.size(); i2++) {
            strArr[i2] = ((n) listAX.get(i2)).c();
        }
        return strArr;
    }

    public final void aM() {
        String[] strArrAZ = aZ();
        int i2 = k.f24666b;
        InboxNativeManager.getInstance().deleteMessages(strArrAZ);
        postDelayed(new ao(this, 12), 1500L);
    }

    public final void aN() {
        List listAX = aX();
        String[] strArrAZ = aZ();
        Iterator it = listAX.iterator();
        while (it.hasNext()) {
            ((n) it.next()).h();
        }
        k.a().e(strArrAZ);
        j().notifyDataSetChanged();
    }

    public final void aO(n nVar, boolean z) {
        i iVar;
        i iVar2;
        this.P.put(nVar.c(), Boolean.valueOf(z));
        postDelayed(new r(this, 2), 200L);
        if (z && (iVar2 = this.W) != null) {
            iVar2.g();
            return;
        }
        boolean zAV = false;
        for (int i2 = 0; i2 < this.Q.size(); i2++) {
            if (zAV) {
                return;
            }
            zAV = aV((n) this.Q.get(i2));
        }
        if (zAV || (iVar = this.W) == null) {
            return;
        }
        iVar.h();
    }

    public final void aP(InboxMessageList inboxMessageList) {
        if (this.U || this.Q.size() != inboxMessageList.getMessagesCount()) {
            this.U = false;
            this.V = false;
            this.Q.clear();
            if (this.T) {
                this.T = false;
            }
            Iterator<InboxMessage> it = inboxMessageList.getMessagesList().iterator();
            while (it.hasNext()) {
                this.Q.add(new n(it.next()));
            }
            this.S = inboxMessageList.getHasMore();
            if (this.W != null) {
                InboxNativeManager.getInstance().resetInboxBadge();
            }
            j().notifyDataSetChanged();
        }
    }

    public final void aQ() {
        if (this.T) {
            return;
        }
        this.T = true;
        this.U = true;
        k kVarA = k.a();
        InboxNativeManager.getInstance().refresh();
        InboxNativeManager.getInstance().getMessages(new com.waze.app_nav.hub.c.h(kVarA, 18));
        com.waze.bi.k kVar = com.waze.bi.k.f16817a;
        int i2 = com.waze.bi.e.f16810a;
        h.g.b.x.f(kVar, "source");
        org.a.d.a aVarK = com.waze.web.r.k();
        org.a.d.i.a aVarE = com.waze.ch.a.a.f.e(kVar);
        org.a.d.k.b bVarC = aVarK.a().c();
        int i3 = ar.f48106a;
        ((com.waze.bi.j) bVarC.a(new h.g.b.m(com.waze.bi.j.class), aVarE, null)).f();
    }

    public final void aR() {
        if (this.R) {
            return;
        }
        this.R = true;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j2 = i3;
            if (i2 >= getChildCount()) {
                postDelayed(new ao(this, 13), j2);
                return;
            }
            if (getChildAt(i2) instanceof j) {
                postDelayed(new com.google.android.libraries.phenotype.client.stable.x(this, (j) getChildAt(i2), 16, null), j2);
            }
            i3 = (int) (j2 + 50);
            i2++;
        }
    }

    public final void aS() {
        if (this.R) {
            return;
        }
        this.R = true;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            long j2 = i3;
            if (i2 >= getChildCount()) {
                postDelayed(new ao(this, 11), j2);
                return;
            }
            if (getChildAt(i2) instanceof j) {
                postDelayed(new com.google.android.libraries.phenotype.client.stable.x(this, (j) getChildAt(i2), 15, null), j2);
            }
            i3 = (int) (j2 + 50);
            i2++;
        }
    }

    public final boolean aU() {
        int i2 = 0;
        boolean z = false;
        while (true) {
            if (i2 < this.Q.size()) {
                if (z) {
                    break;
                }
                z = !aV((n) this.Q.get(i2));
                i2++;
            } else if (!z) {
                return true;
            }
        }
        return false;
    }

    public final boolean aV(n nVar) {
        return this.P.containsKey(nVar.c()) && ((Boolean) this.P.get(nVar.c())).booleanValue();
    }

    public final void aW(i iVar) {
        this.W = iVar;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.a().c(this);
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k.a().d(this);
    }

    public InboxRecycler(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InboxRecycler(Context context) {
        this(context, null);
    }
}
