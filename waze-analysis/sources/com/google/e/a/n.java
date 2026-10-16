package com.google.e.a;

import com.google.e.a.e.ao;
import com.google.e.a.e.aq;
import com.google.e.a.h.ay;
import com.google.e.a.h.az;
import com.google.e.a.h.bh;
import com.google.e.a.h.bj;
import com.google.e.a.h.bk;
import com.google.e.a.h.bq;
import com.google.e.a.h.br;
import com.google.e.a.h.bs;
import com.google.e.a.h.bu;
import com.google.e.a.h.ci;
import com.google.v.de;
import com.google.v.eu;
import com.waze.car_lib.r.ai;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final List f8772a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8773b;

    /* renamed from: c, reason: collision with root package name */
    private final n f8774c;

    private n(List list, Map map) {
        this.f8772a = list;
        this.f8773b = map;
        this.f8774c = null;
    }

    static /* bridge */ /* synthetic */ n e(n nVar) {
        if (((com.google.e.a.e.k) nVar.b(com.google.e.a.e.k.class)) == null) {
            return nVar;
        }
        k kVar = new k(1);
        List<m> list = nVar.f8772a;
        ArrayList arrayList = new ArrayList(list.size());
        for (m mVar : list) {
            arrayList.add(new m(mVar.f8771h, mVar.f8765b, mVar.f8767d, mVar.f8768e, mVar.f8769f, kVar));
        }
        return new n(arrayList, nVar.f8773b, nVar);
    }

    static final n f(bu buVar, c cVar) throws GeneralSecurityException {
        n(buVar);
        List<m> listM = m(buVar, cVar);
        if (p(cVar)) {
            HashSet hashSet = new HashSet();
            boolean zH = false;
            for (m mVar : listM) {
                if (hashSet.contains(Integer.valueOf(mVar.b()))) {
                    throw new GeneralSecurityException("KeyID " + mVar.b() + " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
                }
                hashSet.add(Integer.valueOf(mVar.b()));
                zH |= mVar.h();
            }
            if (!zH) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        return new n(listM, new HashMap());
    }

    public static final n g(g gVar) {
        com.google.d.m.a.a.b bVarE = gVar.e();
        j jVar = new j();
        h hVar = new h(bVarE);
        hVar.i();
        hVar.h();
        jVar.c(hVar);
        return jVar.a();
    }

    @Deprecated
    public static final n j(com.google.android.libraries.phenotype.client.a aVar, a aVar2, byte[] bArr) throws GeneralSecurityException {
        c cVarA = x.a();
        az azVarB = aVar.b();
        if (azVarB == null || azVarB.getEncryptedKeyset().c() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            bu from = bu.parseFrom(aVar2.a(azVarB.getEncryptedKeyset().x(), bArr), de.a());
            n(from);
            return f(from, cVarA);
        } catch (eu unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private final n l() {
        n nVar = this.f8774c;
        return nVar == null ? this : nVar;
    }

    private static List m(bu buVar, c cVar) throws GeneralSecurityException {
        com.google.d.m.a.a.b iVar;
        boolean z;
        ai aiVarQ;
        t tVar;
        ArrayList arrayList = new ArrayList(buVar.getKeyCount());
        for (bs bsVar : buVar.getKeyList()) {
            int keyId = bsVar.getKeyId();
            try {
                aiVarQ = q(bsVar);
                tVar = (t) cVar.a(t.class);
            } catch (GeneralSecurityException e2) {
                if (p(cVar)) {
                    throw e2;
                }
                iVar = new com.google.e.a.e.i(q(bsVar));
                z = true;
            }
            if (tVar == null) {
                throw new GeneralSecurityException("Passed in configuration cannot be used to serialize into proto keyset format.");
            }
            iVar = tVar.a(aiVarQ, y.a());
            z = false;
            if (p(cVar) && !o(bsVar.getStatus())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            arrayList.add(new m(iVar, bsVar.getStatus(), keyId, keyId == buVar.getPrimaryKeyId(), z, m.f8764a));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private static void n(bu buVar) throws GeneralSecurityException {
        if (buVar == null || buVar.getKeyCount() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static boolean o(bk bkVar) {
        int iOrdinal = bkVar.ordinal();
        return iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3;
    }

    private static boolean p(c cVar) {
        return cVar.a(ao.class) == null;
    }

    private static ai q(bs bsVar) {
        return ai.i(bsVar.getKeyData().getTypeUrl(), bsVar.getKeyData().getValue(), com.google.e.a.b.a.a.b(bsVar.getKeyData().getKeyMaterialType()), com.google.e.a.b.a.a.c(bsVar.getOutputPrefixType()), bsVar.getOutputPrefixType() == ci.RAW ? null : Integer.valueOf(bsVar.getKeyId()));
    }

    public final int a() {
        return this.f8772a.size();
    }

    public final b b(Class cls) {
        return (b) this.f8773b.get(cls);
    }

    public final m c(int i2) {
        if (i2 < 0 || i2 >= a()) {
            throw new IndexOutOfBoundsException("Invalid index " + i2 + " for keyset of size " + a());
        }
        List list = this.f8772a;
        m mVar = (m) list.get(i2);
        if (!o(mVar.f8765b)) {
            throw new IllegalStateException("Keyset-Entry at position " + i2 + " has wrong status");
        }
        if (!mVar.f8769f) {
            return (m) list.get(i2);
        }
        throw new IllegalStateException("Keyset-Entry at position " + i2 + " didn't parse correctly");
    }

    public final m d() {
        for (m mVar : this.f8772a) {
            if (mVar != null && mVar.h()) {
                if (mVar.c() == f.f8466a) {
                    return mVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    final bu h() throws GeneralSecurityException {
        try {
            c cVarA = x.a();
            bq bqVarNewBuilder = bu.newBuilder();
            for (m mVar : this.f8772a) {
                com.google.d.m.a.a.b bVarJ = mVar.j();
                bk bkVar = mVar.f8765b;
                int iB = mVar.b();
                t tVar = (t) cVarA.a(t.class);
                if (tVar == null) {
                    throw new GeneralSecurityException("Passed in configuration cannot be used to parse and serialize proto keysets.");
                }
                ai aiVarB = tVar.b(bVarJ, y.a());
                Integer numB = bVarJ.b();
                if (numB != null && numB.intValue() != iB) {
                    throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
                }
                br brVarNewBuilder = bs.newBuilder();
                bh bhVarNewBuilder = bj.newBuilder();
                bhVarNewBuilder.b(aiVarB.h());
                bhVarNewBuilder.c(aiVarB.f());
                bhVarNewBuilder.a(com.google.e.a.b.a.a.d(aiVarB.d()));
                brVarNewBuilder.a(bhVarNewBuilder);
                brVarNewBuilder.d(bkVar);
                brVarNewBuilder.b(iB);
                brVarNewBuilder.c(com.google.e.a.b.a.a.e(aiVarB.e()));
                bqVarNewBuilder.a(brVarNewBuilder.build());
                if (mVar.h()) {
                    bqVarNewBuilder.b(mVar.b());
                }
            }
            return bqVarNewBuilder.build();
        } catch (GeneralSecurityException e2) {
            throw new aq(e2);
        }
    }

    @Deprecated
    public final Object i(Class cls) throws GeneralSecurityException {
        bu buVarH = l().h();
        int i2 = aa.f8354a;
        int primaryKeyId = buVarH.getPrimaryKeyId();
        int i3 = 0;
        boolean z = false;
        for (bs bsVar : buVarH.getKeyList()) {
            if (bsVar.getStatus() == bk.ENABLED) {
                if (!bsVar.hasKeyData()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(bsVar.getKeyId())));
                }
                if (bsVar.getOutputPrefixType() == ci.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(bsVar.getKeyId())));
                }
                if (bsVar.getStatus() == bk.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(bsVar.getKeyId())));
                }
                if (bsVar.getKeyId() == primaryKeyId) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                i3++;
            }
        }
        if (i3 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        for (int i4 = 0; i4 < a(); i4++) {
            List list = this.f8772a;
            if (((m) list.get(i4)).f8769f || !o(((m) list.get(i4)).f8765b)) {
                com.google.d.m.a.a.b bVar = ((m) list.get(i4)).f8771h;
                throw new GeneralSecurityException("Key parsing of key with index " + i4 + " and type_url " + (bVar instanceof com.google.e.a.e.i ? ((com.google.e.a.e.i) bVar).g().h() : "(unknown)") + " failed, unable to get primitive");
            }
        }
        return com.google.e.a.e.t.a().d(l(), cls);
    }

    @Deprecated
    public final void k(com.google.d.b.v vVar, a aVar, byte[] bArr) throws GeneralSecurityException, IOException {
        bu buVarH = h();
        byte[] bArrB = aVar.b(buVarH.toByteArray(), bArr);
        ay ayVarNewBuilder = az.newBuilder();
        ayVarNewBuilder.a(com.google.v.v.q(bArrB));
        ayVarNewBuilder.b(aa.a(buVarH));
        vVar.b(ayVarNewBuilder.build());
    }

    public final String toString() {
        return aa.a(h()).toString();
    }

    private n(List list, Map map, n nVar) {
        this.f8772a = list;
        this.f8773b = map;
        this.f8774c = nVar;
    }

    /* synthetic */ n(List list, Map map, byte[] bArr) {
        this(list, map);
    }
}
