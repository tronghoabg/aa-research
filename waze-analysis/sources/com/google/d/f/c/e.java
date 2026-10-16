package com.google.d.f.c;

import java.util.Comparator;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f7799a;

    e(int i2) {
        this.f7799a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (this.f7799a == 0) {
            return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
        }
        i iVarA = i.a(obj);
        i iVarA2 = i.a(obj2);
        if (iVarA != iVarA2) {
            return iVarA.compareTo(iVarA2);
        }
        int iOrdinal = iVarA.ordinal();
        if (iOrdinal == 0) {
            return ((Boolean) obj).compareTo((Boolean) obj2);
        }
        if (iOrdinal == 1) {
            return ((String) obj).compareTo((String) obj2);
        }
        if (iOrdinal == 2) {
            return ((Long) obj).compareTo((Long) obj2);
        }
        if (iOrdinal == 3) {
            return ((Double) obj).compareTo((Double) obj2);
        }
        throw null;
    }
}
