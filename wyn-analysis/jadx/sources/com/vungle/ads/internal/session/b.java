package com.vungle.ads.internal.session;

import C8.g;
import Fe.e;
import Xf.c;
import android.content.Context;
import com.iab.omid.library.vungle.internal.l;
import com.moloco.sdk.internal.publisher.H;
import com.vungle.ads.internal.executor.d;
import com.vungle.ads.internal.model.r3;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.m;
import com.vungle.ads.internal.util.n;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import ef.C2529m;
import ef.C2530n;
import ff.v;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3340k;
import kotlin.reflect.KTypeProjection;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public static final c f33632f = e.a(a.f33631a);

    /* renamed from: a, reason: collision with root package name */
    public final String f33633a;

    /* renamed from: b, reason: collision with root package name */
    public final com.vungle.ads.internal.executor.a f33634b;

    /* renamed from: c, reason: collision with root package name */
    public File f33635c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f33636d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33637e;

    public b(Context context, String sessionId, com.vungle.ads.internal.executor.a executors, PathProvider pathProvider) {
        Object objZ;
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(sessionId, "sessionId");
        AbstractC3340k.e(executors, "executors");
        AbstractC3340k.e(pathProvider, "pathProvider");
        this.f33633a = sessionId;
        this.f33634b = executors;
        this.f33635c = pathProvider.b();
        this.f33636d = new CopyOnWriteArrayList();
        boolean z2 = true;
        if (!this.f33635c.exists()) {
            try {
                objZ = Boolean.valueOf(this.f33635c.createNewFile());
            } catch (Throwable th) {
                objZ = e.z(th);
            }
            Throwable thA = C2530n.a(objZ);
            if (thA != null) {
                boolean z10 = u.f33874a;
                StringBuilder sbA = l.a("Fail to create unclosed ad file: ");
                sbA.append(thA.getMessage());
                t.b("UnclosedAdDetector", sbA.toString());
            }
            z2 = true ^ (objZ instanceof C2529m);
        }
        this.f33637e = z2;
    }

    public final void a(r3 ad2) {
        AbstractC3340k.e(ad2, "ad");
        if (this.f33637e) {
            ad2.a(this.f33633a);
            this.f33636d.add(ad2);
            a(this.f33636d);
        }
    }

    public final void b(r3 ad2) {
        AbstractC3340k.e(ad2, "ad");
        if (this.f33637e && this.f33636d.contains(ad2)) {
            this.f33636d.remove(ad2);
            a(this.f33636d);
        }
    }

    public final List a() {
        if (!this.f33637e) {
            return v.f35432a;
        }
        return (List) new com.vungle.ads.internal.executor.b(((d) this.f33634b).c().submit(new G8.c(this, 1))).get(1000L, TimeUnit.MILLISECONDS);
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        if (!this.f33637e) {
            return arrayList;
        }
        List listA = a();
        if (listA != null) {
            arrayList.addAll(listA);
        }
        ((d) this.f33634b).f32980a.execute(new g(this, 5));
        return arrayList;
    }

    public static final void b(b this$0) {
        AbstractC3340k.e(this$0, "this$0");
        try {
            n.b(this$0.f33635c);
        } catch (Exception e7) {
            boolean z2 = u.f33874a;
            StringBuilder sbA = l.a("Fail to delete file ");
            sbA.append(e7.getMessage());
            t.b("UnclosedAdDetector", sbA.toString());
        }
    }

    public static final List a(b this$0) {
        AbstractC3340k.e(this$0, "this$0");
        try {
            m mVar = n.f33857a;
            String strD = n.d(this$0.f33635c);
            if (strD != null && strD.length() != 0) {
                c cVar = f33632f;
                return (List) cVar.a(strD, H.n0(cVar.f16253b, kotlin.jvm.internal.H.c(List.class, KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.H.b(r3.class)))));
            }
            return new ArrayList();
        } catch (Exception e7) {
            boolean z2 = u.f33874a;
            StringBuilder sbA = l.a("Fail to read unclosed ad file ");
            sbA.append(e7.getMessage());
            t.b("UnclosedAdDetector", sbA.toString());
            return new ArrayList();
        }
    }

    public final void a(CopyOnWriteArrayList copyOnWriteArrayList) {
        if (this.f33637e) {
            try {
                c cVar = f33632f;
                ((d) this.f33634b).c().execute(new C8.d(13, this, cVar.b(H.n0(cVar.f16253b, kotlin.jvm.internal.H.c(List.class, KTypeProjection.INSTANCE.invariant(kotlin.jvm.internal.H.b(r3.class)))), copyOnWriteArrayList)));
            } catch (Throwable th) {
                boolean z2 = u.f33874a;
                StringBuilder sbA = l.a("Fail to write unclosed ad file ");
                sbA.append(th.getMessage());
                t.b("UnclosedAdDetector", sbA.toString());
            }
        }
    }

    public static final void a(b this$0, String jsonContent) {
        AbstractC3340k.e(this$0, "this$0");
        AbstractC3340k.e(jsonContent, "$jsonContent");
        m mVar = n.f33857a;
        n.a(this$0.f33635c, jsonContent);
    }
}
