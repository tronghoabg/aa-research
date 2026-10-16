package com.moloco.sdk.acm.http;

import h6.InterfaceC2787f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes4.dex */
public final class d implements InterfaceC2787f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f28430a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f28431b;

    public /* synthetic */ d(ArrayList arrayList, ArrayList arrayList2) {
        this.f28430a = arrayList;
        this.f28431b = arrayList2;
    }

    @Override // h6.InterfaceC2787f
    public int a(long j8) {
        int i5;
        Long lValueOf = Long.valueOf(j8);
        int i10 = v.f46721a;
        ArrayList arrayList = this.f28431b;
        int iBinarySearch = Collections.binarySearch(arrayList, lValueOf);
        if (iBinarySearch < 0) {
            i5 = ~iBinarySearch;
        } else {
            int size = arrayList.size();
            do {
                iBinarySearch++;
                if (iBinarySearch >= size) {
                    break;
                }
            } while (((Comparable) arrayList.get(iBinarySearch)).compareTo(lValueOf) == 0);
            i5 = iBinarySearch;
        }
        if (i5 < arrayList.size()) {
            return i5;
        }
        return -1;
    }

    @Override // h6.InterfaceC2787f
    public List g(long j8) {
        int iC = v.c(this.f28431b, Long.valueOf(j8), false);
        return iC == -1 ? Collections.EMPTY_LIST : (List) this.f28430a.get(iC);
    }

    @Override // h6.InterfaceC2787f
    public long k(int i5) {
        AbstractC4256a.e(i5 >= 0);
        ArrayList arrayList = this.f28431b;
        AbstractC4256a.e(i5 < arrayList.size());
        return ((Long) arrayList.get(i5)).longValue();
    }

    @Override // h6.InterfaceC2787f
    public int p() {
        return this.f28431b.size();
    }
}
