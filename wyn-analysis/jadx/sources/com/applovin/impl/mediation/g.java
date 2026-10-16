package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.k3;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f22212b;

    /* renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f22213c;

    /* renamed from: a, reason: collision with root package name */
    private final Map f22211a = DesugarCollections.synchronizedMap(new HashMap(16));

    /* renamed from: d, reason: collision with root package name */
    private final Object f22214d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final Map f22215e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final Set f22216f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Object f22217g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private final Set f22218h = new HashSet();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f22219a;

        /* renamed from: b, reason: collision with root package name */
        private final String f22220b;

        /* renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f22221c;

        /* renamed from: d, reason: collision with root package name */
        private final JSONObject f22222d;

        public a(String str, String str2, y2 y2Var, com.applovin.impl.sdk.k kVar) {
            this.f22219a = str;
            this.f22220b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f22222d = jSONObject;
            JsonUtils.putString(jSONObject, "class", str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (y2Var == null) {
                this.f22221c = null;
            } else {
                this.f22221c = y2Var.getFormat();
                JsonUtils.putString(jSONObject, "format", y2Var.getFormat().getLabel());
            }
        }

        public JSONObject a() {
            return this.f22222d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f22219a.equals(aVar.f22219a) || !this.f22220b.equals(aVar.f22220b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f22221c;
            MaxAdFormat maxAdFormat2 = aVar.f22221c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public int hashCode() {
            int iC = N0.a.c(this.f22219a.hashCode() * 31, 31, this.f22220b);
            MaxAdFormat maxAdFormat = this.f22221c;
            return iC + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f22219a + "', operationTag='" + this.f22220b + "', format=" + this.f22221c + '}';
        }
    }

    public g(com.applovin.impl.sdk.k kVar) {
        if (kVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f22212b = kVar;
        this.f22213c = kVar.O();
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.f22217g) {
            try {
                arrayList = new ArrayList(this.f22218h.size());
                Iterator it = this.f22218h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((a) it.next()).a());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return arrayList;
    }

    public Collection b() {
        Set setUnmodifiableSet;
        synchronized (this.f22214d) {
            setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.f22216f);
        }
        return setUnmodifiableSet;
    }

    public Collection c() {
        Set setUnmodifiableSet;
        synchronized (this.f22214d) {
            try {
                HashSet hashSet = new HashSet(this.f22215e.size());
                Iterator it = this.f22215e.values().iterator();
                while (it.hasNext()) {
                    hashSet.add(((Class) it.next()).getName());
                }
                setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
        return setUnmodifiableSet;
    }

    public h a(k3 k3Var) {
        return a(k3Var, false);
    }

    public h a(k3 k3Var, boolean z2) {
        Class clsA;
        h hVar;
        if (k3Var != null) {
            String strC = k3Var.c();
            String strB = k3Var.b();
            if (TextUtils.isEmpty(strC)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f22213c.b("MediationAdapterManager", "No adapter name provided for " + strB + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(strB)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f22213c.b("MediationAdapterManager", "Unable to find default className for '" + strC + "'");
                }
                return null;
            }
            if (z2 && (hVar = (h) this.f22211a.get(strB)) != null) {
                return hVar;
            }
            synchronized (this.f22214d) {
                try {
                    if (!this.f22216f.contains(strB)) {
                        if (this.f22215e.containsKey(strB)) {
                            clsA = (Class) this.f22215e.get(strB);
                        } else {
                            clsA = a(strB);
                            if (clsA == null) {
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f22213c.k("MediationAdapterManager", "Adapter " + strC + " could not be loaded, class " + strB + " not found");
                                }
                                this.f22216f.add(strB);
                                return null;
                            }
                        }
                        h hVarA = a(k3Var, clsA, z2);
                        if (hVarA != null) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f22213c.a("MediationAdapterManager", "Loaded " + strC);
                            }
                            this.f22215e.put(strB, clsA);
                            if (z2) {
                                this.f22211a.put(k3Var.b(), hVarA);
                            }
                            return hVarA;
                        }
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f22213c.b("MediationAdapterManager", "Failed to load " + strC);
                        }
                        this.f22216f.add(strB);
                        return null;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f22213c.a("MediationAdapterManager", "Not attempting to load " + strC + " due to prior errors");
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public void a(String str, String str2, y2 y2Var) {
        synchronized (this.f22217g) {
            try {
                this.f22212b.O();
                if (com.applovin.impl.sdk.o.a()) {
                    this.f22212b.O().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
                }
                this.f22218h.add(new a(str, str2, y2Var, this.f22212b));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private h a(k3 k3Var, Class cls, boolean z2) {
        try {
            return new h(k3Var, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f22212b.z0()), z2, this.f22212b);
        } catch (Throwable th) {
            com.applovin.impl.sdk.o.c("MediationAdapterManager", "Failed to load adapter: " + k3Var, th);
            return null;
        }
    }

    private Class a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            com.applovin.impl.sdk.o.h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
