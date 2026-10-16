package com.google.android.libraries.e.a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.d.b.ag;
import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import com.google.e.a.e.ar;
import com.google.e.a.s;
import com.google.v.v;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5844a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f5845b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f5846c;

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.List] */
    public f(List list) {
        List<com.google.android.libraries.e.a.d.f> list2 = Collections.EMPTY_LIST;
        List list3 = Collections.EMPTY_LIST;
        this.f5844a = new HashMap();
        this.f5845b = new HashMap();
        this.f5846c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.libraries.e.a.d.a aVar = (com.google.android.libraries.e.a.d.a) it.next();
            if (TextUtils.isEmpty(aVar.f())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                com.google.android.libraries.e.a.d.a aVar2 = (com.google.android.libraries.e.a.d.a) this.f5844a.put(aVar.f(), aVar);
                if (aVar2 != null) {
                    throw new IllegalArgumentException("Cannot override Backend " + aVar2.getClass().getCanonicalName() + " with " + aVar.getClass().getCanonicalName());
                }
            }
        }
        for (com.google.android.libraries.e.a.d.f fVar : list2) {
            if (TextUtils.isEmpty(fVar.a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                com.google.android.libraries.e.a.d.f fVar2 = (com.google.android.libraries.e.a.d.f) this.f5845b.put(fVar.a(), fVar);
                if (fVar2 != null) {
                    throw new IllegalArgumentException("Cannot to override Transform " + fVar2.getClass().getCanonicalName() + " with " + fVar.getClass().getCanonicalName());
                }
            }
        }
        this.f5846c.addAll(list3);
    }

    public static f h(String str, s sVar, v vVar) {
        int i2 = ar.f8433a;
        byte[] bArr = new byte[str.length()];
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '!' || cCharAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + cCharAt);
            }
            bArr[i3] = (byte) cCharAt;
        }
        com.google.e.a.k.a.b(bArr);
        return new f(vVar, str, sVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, java.util.List] */
    private final d i(Uri uri) throws com.google.android.libraries.e.a.b.e {
        bn bnVarP;
        int i2 = bn.f7456d;
        bi biVar = new bi();
        int i3 = com.google.android.libraries.e.a.b.a.e.f5830a;
        bi biVar2 = new bi();
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            bnVarP = bn.p();
        } else {
            String strSubstring = encodedFragment.substring(10);
            an.m(true, "The separator may not be the empty string.");
            bnVarP = bn.m(ag.b("+".charAt(0)).a().c(strSubstring));
        }
        int size = bnVarP.size();
        for (int i4 = 0; i4 < size; i4++) {
            biVar2.g(com.google.android.libraries.e.a.b.a.e.b((String) bnVarP.get(i4)));
        }
        bn bnVarF = biVar2.f();
        int size2 = bnVarF.size();
        for (int i5 = 0; i5 < size2; i5++) {
            String str = (String) bnVarF.get(i5);
            com.google.android.libraries.e.a.d.f fVar = (com.google.android.libraries.e.a.d.f) this.f5845b.get(str);
            if (fVar == null) {
                throw new com.google.android.libraries.e.a.b.e("Requested transform isn't registered: " + str + ": " + String.valueOf(uri));
            }
            biVar.g(fVar);
        }
        bn bnVarA = biVar.f().a();
        c cVar = new c();
        String scheme = uri.getScheme();
        com.google.android.libraries.e.a.d.a aVar = (com.google.android.libraries.e.a.d.a) this.f5844a.get(scheme);
        if (aVar == null) {
            throw new com.google.android.libraries.e.a.b.e(String.format("Requested backend isn't registered: %s", scheme));
        }
        cVar.e(aVar);
        cVar.g(this.f5846c);
        cVar.i(bnVarA);
        cVar.h(uri);
        if (!bnVarA.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith(DomExceptionUtils.SEPARATOR)) {
                String strB = (String) arrayList.get(arrayList.size() - 1);
                ListIterator<E> listIterator = bnVarA.listIterator(bnVarA.size());
                while (listIterator.hasPrevious()) {
                    strB = ((com.google.android.libraries.e.a.d.f) listIterator.previous()).b();
                }
                arrayList.set(arrayList.size() - 1, strB);
                uri = uri.buildUpon().path(TextUtils.join(DomExceptionUtils.SEPARATOR, arrayList)).encodedFragment(null).build();
            }
        }
        cVar.f(uri);
        return new d(cVar);
    }

    public final Object a(Uri uri, e eVar) {
        return eVar.a(i(uri));
    }

    public final void b(Uri uri) {
        d dVarI = i(uri);
        dVarI.b().k(dVarI.a());
    }

    public final void c(Uri uri, Uri uri2) {
        d dVarI = i(uri);
        d dVarI2 = i(uri2);
        if (dVarI.b() != dVarI2.b()) {
            throw new com.google.android.libraries.e.a.b.e("Cannot rename file across backends");
        }
        dVarI.b().l(dVarI.a(), dVarI2.a());
    }

    public final boolean d(Uri uri) throws com.google.android.libraries.e.a.b.e {
        d dVarI = i(uri);
        return dVarI.b().g(dVarI.a());
    }

    public final s e() {
        return (s) this.f5846c;
    }

    public final v f() {
        return (v) this.f5844a;
    }

    public final String g() {
        return (String) this.f5845b;
    }

    private f(v vVar, String str, s sVar) {
        this.f5844a = vVar;
        this.f5845b = str;
        this.f5846c = sVar;
    }
}
