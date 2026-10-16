package com.google.android.libraries.phenotype.client.b;

import com.google.d.b.an;
import com.google.d.d.bq;
import com.google.d.d.bs;
import com.google.v.de;
import com.google.v.eu;
import com.google.v.v;
import com.google.v.z;
import java.util.Collection;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final j f5984a = new j(h.b(), c.getDefaultInstance());

    /* renamed from: b, reason: collision with root package name */
    private final h f5985b;

    /* renamed from: c, reason: collision with root package name */
    private final c f5986c;

    private j(h hVar, c cVar) {
        an.B(hVar);
        this.f5985b = hVar;
        this.f5986c = cVar;
    }

    public static j c() {
        return f5984a;
    }

    public static j d(z zVar, boolean z) throws eu {
        h hVar;
        int iO = zVar.o();
        if (iO > 1) {
            throw new eu("Unsupported version: " + iO + ". Current version is: 1");
        }
        zVar.o();
        int iF = zVar.f(zVar.r());
        c from = c.parseFrom(zVar, de.a());
        zVar.F(iF);
        f fVarA = f.a();
        try {
            if (z) {
                int iF2 = zVar.f(zVar.r());
                hVar = (h) fVarA.c(zVar);
                int iD = zVar.d();
                if (iD > 0) {
                    zVar.I(iD);
                }
                zVar.F(iF2);
            } else {
                hVar = (h) fVarA.d(zVar.M());
            }
            fVarA.close();
            return new j(hVar, from);
        } catch (Throwable th) {
            try {
                fVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final long a() {
        return this.f5986c.getConfigurationVersion();
    }

    public final h b() {
        bs bsVarA;
        h hVar = this.f5985b;
        c cVar = this.f5986c;
        if (cVar.getForcedFlagsCount() <= 0) {
            return hVar;
        }
        Collection<com.google.android.libraries.phenotype.client.a.k> collectionValues = cVar.getForcedFlagsMap().values();
        if (collectionValues == null) {
            bsVarA = bs.f();
        } else {
            bq bqVar = new bq();
            for (com.google.android.libraries.phenotype.client.a.k kVar : collectionValues) {
                int iOrdinal = kVar.getValueCase().ordinal();
                if (iOrdinal == 0) {
                    bqVar.d(kVar.getName(), Long.valueOf(kVar.getLongValue()));
                } else if (iOrdinal == 1) {
                    bqVar.d(kVar.getName(), Boolean.valueOf(kVar.getBoolValue()));
                } else if (iOrdinal == 2) {
                    bqVar.d(kVar.getName(), Double.valueOf(kVar.getDoubleValue()));
                } else if (iOrdinal == 3) {
                    bqVar.d(kVar.getName(), kVar.getStringValue());
                } else {
                    if (iOrdinal != 4) {
                        throw new IllegalStateException("Could not serialize Flag for override: ".concat(String.valueOf(kVar.getName())));
                    }
                    bqVar.d(kVar.getName(), kVar.getBytesValue().x());
                }
            }
            bsVarA = bqVar.a();
        }
        return h.c(hVar, bsVarA);
    }

    public final v e() {
        return this.f5986c.getExperimentToken();
    }

    public final String f() {
        return this.f5986c.getServerToken();
    }

    public final String g() {
        return this.f5986c.getSnapshotToken();
    }

    public final Map h() {
        c cVar = this.f5986c;
        if (cVar.getForcedFlagsCount() == 0) {
            return null;
        }
        return cVar.getForcedFlagsMap();
    }

    public final void i() {
        if (this.f5985b.e().isEmpty()) {
            c.getDefaultInstance().equals(this.f5986c);
        }
    }
}
