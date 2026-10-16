package com.google.android.libraries.e.b;

import android.net.Uri;
import android.util.Pair;
import androidx.core.os.EnvironmentCompat;
import com.google.d.b.an;
import com.google.d.d.bn;
import com.google.d.m.a.ag;
import com.google.d.m.a.bd;
import com.google.d.m.a.bm;
import com.google.d.m.a.cf;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f5876a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5877b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.libraries.e.a.f f5878c;

    /* renamed from: d, reason: collision with root package name */
    private final ag f5879d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f5880e;

    /* renamed from: f, reason: collision with root package name */
    private final com.google.android.libraries.e.b.a.a f5881f;

    k(Executor executor, com.google.android.libraries.e.a.f fVar, com.google.android.libraries.e.b.a.a aVar, Map map) {
        an.B(executor);
        this.f5877b = executor;
        an.B(fVar);
        this.f5878c = fVar;
        this.f5881f = aVar;
        this.f5880e = map;
        an.l(!map.isEmpty());
        this.f5879d = new j(0);
    }

    public final x a(i iVar) {
        ConcurrentMap concurrentMap = this.f5876a;
        Uri uriB = iVar.b();
        Pair pairCreate = (Pair) concurrentMap.get(uriB);
        if (pairCreate == null) {
            Uri uriB2 = iVar.b();
            an.q(uriB2.isHierarchical(), "Uri must be hierarchical: %s", uriB2);
            String strE = an.e(uriB2.getLastPathSegment());
            int iLastIndexOf = strE.lastIndexOf(46);
            an.q((iLastIndexOf == -1 ? "" : strE.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uriB2);
            an.m(iVar.e() != null, "Proto schema cannot be null");
            an.m(iVar.c() != null, "Handler cannot be null");
            y yVar = (y) this.f5880e.get("singleproc");
            an.q(yVar != null, "No XDataStoreVariantFactory registered for ID %s", "singleproc");
            String strE2 = an.e(iVar.b().getLastPathSegment());
            int iLastIndexOf2 = strE2.lastIndexOf(46);
            if (iLastIndexOf2 != -1) {
                strE2 = strE2.substring(0, iLastIndexOf2);
            }
            bm bmVarN = bd.n(bd.h(iVar.b()), this.f5879d, cf.y());
            Executor executor = this.f5877b;
            com.google.android.libraries.e.a.f fVar = this.f5878c;
            c cVar = c.f5850a;
            r rVarC = yVar.c(iVar, strE2, executor, fVar, cVar);
            yVar.b(cVar);
            x xVar = new x(rVarC, bmVarN);
            bn bnVarD = iVar.d();
            if (!bnVarD.isEmpty()) {
                xVar.h(g.a(bnVarD, executor));
            }
            pairCreate = Pair.create(xVar, iVar);
            Pair pair = (Pair) concurrentMap.putIfAbsent(uriB, pairCreate);
            if (pair != null) {
                pairCreate = pair;
            }
        }
        x xVar2 = (x) pairCreate.first;
        i iVar2 = (i) pairCreate.second;
        if (iVar.equals(iVar2)) {
            return xVar2;
        }
        String strD = an.d("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", iVar.e().getClass().getSimpleName(), iVar.b());
        an.q(iVar.b().equals(iVar2.b()), strD, "uri");
        an.q(iVar.e().equals(iVar2.e()), strD, "schema");
        an.q(iVar.c().equals(iVar2.c()), strD, "handler");
        an.q(iVar.d().equals(iVar2.d()), strD, "migrations");
        an.q(iVar.g().equals(iVar2.g()), strD, "variantConfig");
        an.q(iVar.f() == iVar2.f(), strD, "useGeneratedExtensionRegistry");
        an.q(true, strD, "enableTracing");
        throw new IllegalArgumentException(an.d(strD, EnvironmentCompat.MEDIA_UNKNOWN));
    }
}
