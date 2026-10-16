package com.google.e.a;

import com.google.e.a.e.al;
import com.google.e.a.e.ar;
import com.google.e.a.h.bk;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final List f8652a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final Map f8653b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private boolean f8654c = false;

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        Iterator it = this.f8652a.iterator();
        while (it.hasNext()) {
            ((h) it.next()).f8546a = false;
        }
    }

    public final n a() throws GeneralSecurityException {
        int i2;
        bk bkVar;
        if (this.f8654c) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        char c2 = 1;
        this.f8654c = true;
        List<h> list = this.f8652a;
        ArrayList arrayList = new ArrayList(list.size());
        int i3 = 0;
        while (i3 < list.size() - 1) {
            int i4 = i3 + 1;
            if (((h) list.get(i3)).f8548c == i.f8585a && ((h) list.get(i4)).f8548c != i.f8585a) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i3 = i4;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (h hVar : list) {
            f unused = hVar.f8547b;
            if (hVar.f8548c == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (hVar.f8548c == i.f8585a) {
                int i5 = 0;
                while (true) {
                    if (i5 != 0 && !hashSet.contains(Integer.valueOf(i5))) {
                        break;
                    }
                    int i6 = ar.f8433a;
                    i5 = 0;
                    while (i5 == 0) {
                        byte[] bArrB = al.b(4);
                        i5 = (bArrB[3] & 255) | ((bArrB[0] & 255) << 24) | ((bArrB[c2] & 255) << 16) | ((bArrB[2] & 255) << 8);
                    }
                }
                i2 = i5;
            } else {
                i unused2 = hVar.f8548c;
                i2 = 0;
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException("Id " + i2 + " is used twice in the keyset");
            }
            hashSet.add(numValueOf);
            hVar.f8550e;
            com.google.d.m.a.a.b bVarC = com.google.e.a.e.n.a().c(hVar.f8551f, c2 != hVar.f8551f.c() ? null : numValueOf);
            f fVar = hVar.f8547b;
            f fVar2 = f.f8466a;
            if (fVar2.equals(fVar)) {
                bkVar = bk.ENABLED;
            } else if (f.f8467b.equals(fVar)) {
                bkVar = bk.DISABLED;
            } else {
                if (!f.f8468c.equals(fVar)) {
                    throw new IllegalStateException("Unknown key status");
                }
                bkVar = bk.DESTROYED;
            }
            m mVar = new m(bVarC, bkVar, i2, hVar.f8546a, false, m.f8764a);
            if (hVar.f8546a) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (hVar.f8547b != fVar2) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(mVar);
            c2 = 1;
        }
        if (num != null) {
            return n.e(new n(arrayList, this.f8653b, bArr));
        }
        throw new GeneralSecurityException("No primary was set");
    }

    public final void c(h hVar) {
        if (hVar.f8549d != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (hVar.f8546a) {
            d();
        }
        hVar.f8549d = this;
        this.f8652a.add(hVar);
    }
}
