package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class zzgxh {
    public static boolean zza(Iterable iterable, zzgts zzgtsVar) {
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            zzgtsVar.getClass();
            return zzc((List) iterable, zzgtsVar);
        }
        Iterator it = iterable.iterator();
        zzgtsVar.getClass();
        boolean z2 = false;
        while (it.hasNext()) {
            if (zzgtsVar.zza(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static Object zzb(Iterable iterable, Object obj) {
        zzgzh it = ((zzgyy) iterable).iterator();
        return it.hasNext() ? it.next() : obj;
    }

    private static boolean zzc(List list, zzgts zzgtsVar) {
        int i5 = 0;
        int i10 = 0;
        while (i5 < list.size()) {
            Object obj = list.get(i5);
            if (!zzgtsVar.zza(obj)) {
                if (i5 > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        zzd(list, zzgtsVar, i10, i5);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        zzd(list, zzgtsVar, i10, i5);
                        return true;
                    }
                }
                i10++;
            }
            i5++;
        }
        list.subList(i10, list.size()).clear();
        return i5 != i10;
    }

    private static void zzd(List list, zzgts zzgtsVar, int i5, int i10) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i10) {
                break;
            } else if (zzgtsVar.zza(list.get(size))) {
                list.remove(size);
            }
        }
        while (true) {
            i10--;
            if (i10 < i5) {
                return;
            } else {
                list.remove(i10);
            }
        }
    }
}
