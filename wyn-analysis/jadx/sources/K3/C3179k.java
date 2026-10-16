package k3;

import a9.C1342b;
import android.app.ActivityManager;
import android.content.Context;
import com.applovin.impl.T0;
import ff.w;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import l3.AbstractC3384a;
import o3.InterfaceC3646c;
import r.C3894a;

/* renamed from: k3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3179k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39207a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f39208b;

    /* renamed from: c, reason: collision with root package name */
    public final String f39209c;

    /* renamed from: g, reason: collision with root package name */
    public Executor f39213g;

    /* renamed from: h, reason: collision with root package name */
    public Executor f39214h;

    /* renamed from: i, reason: collision with root package name */
    public K3.l f39215i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f39216j;

    /* renamed from: m, reason: collision with root package name */
    public boolean f39218m;

    /* renamed from: q, reason: collision with root package name */
    public HashSet f39222q;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f39210d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f39211e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f39212f = new ArrayList();
    public final int k = 1;

    /* renamed from: l, reason: collision with root package name */
    public boolean f39217l = true;

    /* renamed from: n, reason: collision with root package name */
    public final long f39219n = -1;

    /* renamed from: o, reason: collision with root package name */
    public final h4.m f39220o = new h4.m();

    /* renamed from: p, reason: collision with root package name */
    public final LinkedHashSet f39221p = new LinkedHashSet();

    public C3179k(Context context, Class cls, String str) {
        this.f39207a = context;
        this.f39208b = cls;
        this.f39209c = str;
    }

    public final void a(AbstractC3384a... abstractC3384aArr) {
        if (this.f39222q == null) {
            this.f39222q = new HashSet();
        }
        for (AbstractC3384a abstractC3384a : abstractC3384aArr) {
            HashSet hashSet = this.f39222q;
            AbstractC3340k.b(hashSet);
            hashSet.add(Integer.valueOf(abstractC3384a.f39942a));
            HashSet hashSet2 = this.f39222q;
            AbstractC3340k.b(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC3384a.f39943b));
        }
        this.f39220o.a((AbstractC3384a[]) Arrays.copyOf(abstractC3384aArr, abstractC3384aArr.length));
    }

    public final AbstractC3181m b() throws ClassNotFoundException {
        boolean zContainsKey;
        Executor executor = this.f39213g;
        if (executor == null && this.f39214h == null) {
            T0 t02 = C3894a.f44284c;
            this.f39214h = t02;
            this.f39213g = t02;
        } else if (executor != null && this.f39214h == null) {
            this.f39214h = executor;
        } else if (executor == null) {
            this.f39213g = this.f39214h;
        }
        HashSet hashSet = this.f39222q;
        LinkedHashSet linkedHashSet = this.f39221p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(AbstractC3256n.g(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        InterfaceC3646c c1342b = this.f39215i;
        if (c1342b == null) {
            c1342b = new C1342b();
        }
        InterfaceC3646c interfaceC3646c = c1342b;
        if (this.f39219n > 0) {
            if (this.f39209c != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        ArrayList arrayList = this.f39210d;
        boolean z2 = this.f39216j;
        int i5 = this.k;
        if (i5 == 0) {
            throw null;
        }
        Context context = this.f39207a;
        if (i5 == 1) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            i5 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        }
        Executor executor2 = this.f39213g;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = this.f39214h;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C3171c c3171c = new C3171c(context, this.f39209c, interfaceC3646c, this.f39220o, arrayList, z2, i5, executor2, executor3, this.f39217l, this.f39218m, linkedHashSet, this.f39211e, this.f39212f);
        Class cls = this.f39208b;
        Package r72 = cls.getPackage();
        AbstractC3340k.b(r72);
        String fullPackage = r72.getName();
        String canonicalName = cls.getCanonicalName();
        AbstractC3340k.b(canonicalName);
        AbstractC3340k.d(fullPackage, "fullPackage");
        if (fullPackage.length() != 0) {
            canonicalName = canonicalName.substring(fullPackage.length() + 1);
            AbstractC3340k.d(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String strConcat = Bf.r.i0(canonicalName, '.', '_').concat("_Impl");
        try {
            Class<?> cls2 = Class.forName(fullPackage.length() == 0 ? strConcat : fullPackage + '.' + strConcat, true, cls.getClassLoader());
            AbstractC3340k.c(cls2, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            AbstractC3181m abstractC3181m = (AbstractC3181m) cls2.newInstance();
            abstractC3181m.getClass();
            abstractC3181m.f39226d = abstractC3181m.e(c3171c);
            Set setH = abstractC3181m.h();
            BitSet bitSet = new BitSet();
            Iterator it2 = setH.iterator();
            while (true) {
                boolean zHasNext = it2.hasNext();
                LinkedHashMap linkedHashMap = abstractC3181m.f39230h;
                ArrayList arrayList2 = c3171c.f39191n;
                if (zHasNext) {
                    Class cls3 = (Class) it2.next();
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i10 = size - 1;
                            if (cls3.isAssignableFrom(arrayList2.get(size).getClass())) {
                                bitSet.set(size);
                                break;
                            }
                            if (i10 < 0) {
                                break;
                            }
                            size = i10;
                        }
                        size = -1;
                    } else {
                        size = -1;
                    }
                    if (size < 0) {
                        throw new IllegalArgumentException(("A required auto migration spec (" + cls3.getCanonicalName() + ") is missing in the database configuration.").toString());
                    }
                    linkedHashMap.put(cls3, arrayList2.get(size));
                } else {
                    int size2 = arrayList2.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i11 = size2 - 1;
                            if (!bitSet.get(size2)) {
                                throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                            }
                            if (i11 < 0) {
                                break;
                            }
                            size2 = i11;
                        }
                    }
                    for (AbstractC3384a abstractC3384a : abstractC3181m.f(linkedHashMap)) {
                        int i12 = abstractC3384a.f39942a;
                        h4.m mVar = c3171c.f39182d;
                        LinkedHashMap linkedHashMap2 = mVar.f36130a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i12))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i12));
                            if (map == null) {
                                map = w.f35433a;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(abstractC3384a.f39943b));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            mVar.a(abstractC3384a);
                        }
                    }
                    abstractC3181m.g().setWriteAheadLoggingEnabled(c3171c.f39185g == 3);
                    abstractC3181m.f39229g = c3171c.f39183e;
                    abstractC3181m.f39224b = c3171c.f39186h;
                    abstractC3181m.f39225c = new T3.m(c3171c.f39187i);
                    abstractC3181m.f39228f = c3171c.f39184f;
                    Map mapI = abstractC3181m.i();
                    BitSet bitSet2 = new BitSet();
                    Iterator it3 = mapI.entrySet().iterator();
                    while (true) {
                        boolean zHasNext2 = it3.hasNext();
                        ArrayList arrayList3 = c3171c.f39190m;
                        if (!zHasNext2) {
                            int size3 = arrayList3.size() - 1;
                            if (size3 >= 0) {
                                while (true) {
                                    int i13 = size3 - 1;
                                    if (!bitSet2.get(size3)) {
                                        throw new IllegalArgumentException("Unexpected type converter " + arrayList3.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                    }
                                    if (i13 < 0) {
                                        break;
                                    }
                                    size3 = i13;
                                }
                            }
                            return abstractC3181m;
                        }
                        Map.Entry entry = (Map.Entry) it3.next();
                        Class cls4 = (Class) entry.getKey();
                        for (Class cls5 : (List) entry.getValue()) {
                            int size4 = arrayList3.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i14 = size4 - 1;
                                    if (cls5.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    }
                                    if (i14 < 0) {
                                        break;
                                    }
                                    size4 = i14;
                                }
                            } else {
                                size4 = -1;
                            }
                            if (!(size4 >= 0)) {
                                throw new IllegalArgumentException(("A required type converter (" + cls5 + ") for " + cls4.getCanonicalName() + " is missing in the database configuration.").toString());
                            }
                            abstractC3181m.f39233l.put(cls5, arrayList3.get(size4));
                        }
                    }
                }
            }
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + cls + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls + ".canonicalName");
        }
    }
}
