package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.android.gms.car.CarUiInfo;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rdx {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public rdx(sgk sgkVar, aezk aezkVar) {
        this.e = sgkVar;
        this.f = aezkVar;
        int i = 4;
        this.a = new lah(new rco(this, i), new rdv(this, 3));
        int i2 = 5;
        this.b = new lah(new rco(this, i2), new rdv(this, i));
        int i3 = 6;
        this.c = new lah(new rco(this, i3), new rdv(this, i2));
        this.d = new lah(new rco(this, 7), new rdv(this, i3));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aezk, java.lang.Object] */
    public final CarUiInfo a() throws qrz {
        return (CarUiInfo) ((rox) this.f.a()).b(new rct(this, 8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aezk, java.lang.Object] */
    public final void b(rck rckVar) throws qrz {
        ((rox) this.f.a()).g(new rdu(this, rckVar, 3));
    }

    public final void c(rck rckVar) {
        ((lah) this.a).F(new rcs(rckVar, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, zfk] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.util.Map] */
    public final wgx d(wgh wghVar) {
        ?? r0 = this.b;
        Uri uri = wghVar.a;
        Pair pairCreate = (Pair) r0.get(uri);
        if (pairCreate == null) {
            woy.S(uri.isHierarchical(), "Uri must be hierarchical: %s", uri);
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null) {
                lastPathSegment = "";
            }
            int iLastIndexOf = lastPathSegment.lastIndexOf(46);
            woy.S((iLastIndexOf == -1 ? "" : lastPathSegment.substring(iLastIndexOf + 1)).equals("pb"), "Uri extension must be .pb: %s", uri);
            woy.O(wghVar.b != null, "Proto schema cannot be null");
            woy.O(wghVar.c != null, "Handler cannot be null");
            wgu wguVar = wghVar.e;
            ?? r7 = this.f;
            String strA = wguVar.a();
            wgz wgzVar = (wgz) r7.get(strA);
            woy.S(wgzVar != 0, "No XDataStoreVariantFactory registered for ID %s", strA);
            String lastPathSegment2 = uri.getLastPathSegment();
            String strSubstring = lastPathSegment2 != null ? lastPathSegment2 : "";
            int iLastIndexOf2 = strSubstring.lastIndexOf(46);
            if (iLastIndexOf2 != -1) {
                strSubstring = strSubstring.substring(0, iLastIndexOf2);
            }
            zgp zglVar = uri == null ? zgl.a : new zgl(uri);
            ?? r6 = this.c;
            zfq zfqVar = zfq.a;
            int i = zfb.c;
            zez zezVar = new zez(zglVar, r6);
            zglVar.c(zezVar, yrm.aK(zfqVar, zezVar));
            ?? r2 = this.e;
            wgy wgyVarB = wgzVar.b(wghVar, strSubstring, r2, (nfh) this.d);
            wgzVar.a();
            wgx wgxVar = new wgx(wgyVarB, zezVar);
            yfq yfqVar = wghVar.d;
            if (!yfqVar.isEmpty()) {
                wgxVar.b(new wgf(yfqVar, r2));
            }
            pairCreate = Pair.create(wgxVar, wghVar);
            Pair pair = (Pair) r0.putIfAbsent(uri, pairCreate);
            if (pair != null) {
                pairCreate = pair;
            }
        }
        wgx wgxVar2 = (wgx) pairCreate.first;
        wgh wghVar2 = (wgh) pairCreate.second;
        if (wghVar.equals(wghVar2)) {
            return wgxVar2;
        }
        abow abowVar = wghVar.b;
        String strM = wub.M("ProtoDataStoreConfig<%s> doesn't match previous call [uri=%s] [%s]", abowVar.getClass().getSimpleName(), uri);
        woy.S(uri.equals(wghVar2.a), strM, "uri");
        woy.S(abowVar.equals(wghVar2.b), strM, "schema");
        woy.S(wghVar.c.equals(wghVar2.c), strM, "handler");
        woy.S(yrm.W(wghVar.d, wghVar2.d), strM, "migrations");
        woy.S(wghVar.e.equals(wghVar2.e), strM, "variantConfig");
        woy.S(wghVar.f == wghVar2.f, strM, "useGeneratedExtensionRegistry");
        throw new IllegalArgumentException(wub.M(strM, "unknown"));
    }

    public rdx(vsq vsqVar, zgt zgtVar, Random random, aezk aezkVar, aezk aezkVar2, aezk aezkVar3) {
        this.e = vsqVar;
        this.b = zgtVar;
        this.a = random;
        this.c = aezkVar;
        this.d = aezkVar2;
        this.f = aezkVar3;
    }

    public rdx(weu weuVar) {
        this.b = weuVar.a;
        this.d = weuVar.b;
        this.e = weuVar.c;
        this.c = weuVar.d;
        this.f = weuVar.e;
        this.a = weuVar.f;
    }

    public rdx(Executor executor, nfh nfhVar, wha whaVar, Map map) {
        this.b = new ConcurrentHashMap();
        executor.getClass();
        this.e = executor;
        nfhVar.getClass();
        this.d = nfhVar;
        this.a = whaVar;
        this.f = map;
        if (!map.isEmpty()) {
            this.c = new wgi(0);
            return;
        }
        throw new IllegalArgumentException();
    }

    public rdx(aezk aezkVar, aezk aezkVar2, aezk aezkVar3, aezk aezkVar4, aezk aezkVar5, aezk aezkVar6) {
        this.a = aezkVar;
        this.d = aezkVar2;
        this.e = aezkVar3;
        this.b = aezkVar4;
        this.f = aezkVar5;
        this.c = aezkVar6;
    }
}
