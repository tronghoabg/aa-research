package com.applovin.mediation;

import com.applovin.impl.sdk.o;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MaxSegment {

    /* renamed from: a, reason: collision with root package name */
    private final int f24052a;

    /* renamed from: b, reason: collision with root package name */
    private final List f24053b;

    public MaxSegment(int i5, List<Integer> list) {
        this.f24052a = i5;
        this.f24053b = list;
        a(i5);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            a(it.next().intValue());
        }
    }

    private void a(int i5) {
        if (i5 >= 0) {
            return;
        }
        o.h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i5);
    }

    public int getKey() {
        return this.f24052a;
    }

    public List<Integer> getValues() {
        return this.f24053b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.f24052a + ", values=" + this.f24053b + '}';
    }
}
