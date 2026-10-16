package com.applovin.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacerSettings;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/* loaded from: classes.dex */
public class w2 {

    /* renamed from: a, reason: collision with root package name */
    private final m4 f23462a = new m4();

    /* renamed from: b, reason: collision with root package name */
    private final TreeSet f23463b = new TreeSet();

    /* renamed from: c, reason: collision with root package name */
    private final Map f23464c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private int f23465d;

    /* renamed from: e, reason: collision with root package name */
    private int f23466e;

    public w2(MaxAdPlacerSettings maxAdPlacerSettings) {
        a(maxAdPlacerSettings);
    }

    private void a(MaxAdPlacerSettings maxAdPlacerSettings) {
        if (!maxAdPlacerSettings.hasValidPositioning()) {
            com.applovin.impl.sdk.o.h("MaxAdPlacerData", "No positioning info was provided with ad placer settings. You must set at least (1) one or more fixed positions or (2) a repeating interval greater than or equal to 2 for the ad placer to determine where to position ads.");
            return;
        }
        this.f23462a.addAll(maxAdPlacerSettings.getFixedPositions());
        if (!maxAdPlacerSettings.isRepeatingEnabled()) {
            return;
        }
        int repeatingInterval = maxAdPlacerSettings.getRepeatingInterval();
        if (this.f23462a.isEmpty()) {
            this.f23462a.add(Integer.valueOf(repeatingInterval - 1));
        }
        int iIntValue = ((Integer) this.f23462a.a()).intValue();
        while (true) {
            iIntValue += repeatingInterval;
            if (this.f23462a.size() >= maxAdPlacerSettings.getMaxAdCount()) {
                return;
            } else {
                this.f23462a.add(Integer.valueOf(iIntValue));
            }
        }
    }

    public Collection b() {
        return new TreeSet((SortedSet) this.f23463b);
    }

    public int c() {
        int i5 = this.f23465d;
        if (i5 != -1 && this.f23466e != -1) {
            while (i5 <= this.f23466e) {
                if (g(i5) && !h(i5)) {
                    return i5;
                }
                i5++;
            }
        }
        return -1;
    }

    public int d(int i5) {
        if (g(i5)) {
            return -1;
        }
        return i5 - a(i5, true);
    }

    public Collection e(int i5) {
        return new TreeSet((SortedSet) this.f23463b.tailSet(Integer.valueOf(i5), false));
    }

    public void f(int i5) {
        int iB = this.f23462a.b(Integer.valueOf(i5));
        for (int size = this.f23462a.size() - 1; size >= iB; size--) {
            Integer num = (Integer) this.f23462a.a(size);
            int iIntValue = num.intValue() + 1;
            a(num.intValue(), iIntValue);
            this.f23462a.a(size, Integer.valueOf(iIntValue));
        }
    }

    public boolean g(int i5) {
        return this.f23462a.contains(Integer.valueOf(i5));
    }

    public boolean h(int i5) {
        return this.f23463b.contains(Integer.valueOf(i5));
    }

    public void i(int i5) {
        int iB = this.f23462a.b(Integer.valueOf(i5));
        if (g(i5)) {
            this.f23464c.remove(Integer.valueOf(i5));
            this.f23463b.remove(Integer.valueOf(i5));
            this.f23462a.b(iB);
        }
        while (iB < this.f23462a.size()) {
            Integer num = (Integer) this.f23462a.a(iB);
            int iIntValue = num.intValue() - 1;
            a(num.intValue(), iIntValue);
            this.f23462a.a(iB, Integer.valueOf(iIntValue));
            iB++;
        }
    }

    public int b(int i5) {
        if (i5 == 0) {
            return 0;
        }
        return i5 + a(i5 - 1, false);
    }

    public void b(int i5, int i10) {
        i(i5);
        f(i10);
    }

    public void c(int i5, int i10) {
        this.f23465d = i5;
        this.f23466e = i10;
    }

    public int c(int i5) {
        return i5 + a(i5, false);
    }

    public MaxAd a(int i5) {
        return (MaxAd) this.f23464c.get(Integer.valueOf(i5));
    }

    public void a(MaxAd maxAd, int i5) {
        this.f23464c.put(Integer.valueOf(i5), maxAd);
        this.f23463b.add(Integer.valueOf(i5));
    }

    public void a() {
        this.f23464c.clear();
        this.f23463b.clear();
    }

    public void a(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            this.f23464c.remove(num);
            this.f23463b.remove(num);
        }
    }

    private void a(int i5, int i10) {
        if (this.f23464c.containsKey(Integer.valueOf(i5))) {
            this.f23464c.put(Integer.valueOf(i10), (MaxAd) this.f23464c.get(Integer.valueOf(i5)));
            this.f23463b.add(Integer.valueOf(i10));
            this.f23464c.remove(Integer.valueOf(i5));
            this.f23463b.remove(Integer.valueOf(i5));
        }
    }

    private int a(int i5, boolean z2) {
        int iC = this.f23462a.c(Integer.valueOf(i5));
        if (!z2) {
            int i10 = i5 + iC;
            while (iC < this.f23462a.size() && i10 >= ((Integer) this.f23462a.a(iC)).intValue()) {
                i10++;
                iC++;
            }
        }
        return iC;
    }
}
