package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class zzigo {
    public static final /* synthetic */ zzidl zza(zzidl zzidlVar, zzidl zzidlVar2, ArrayDeque arrayDeque) {
        zzb(zzidlVar, arrayDeque);
        zzb(zzidlVar2, arrayDeque);
        zzidl zzigqVar = (zzidl) arrayDeque.pop();
        while (!arrayDeque.isEmpty()) {
            zzigqVar = new zzigq((zzidl) arrayDeque.pop(), zzigqVar, null);
        }
        return zzigqVar;
    }

    private static final void zzb(zzidl zzidlVar, ArrayDeque arrayDeque) {
        byte[] bArr;
        if (!zzidlVar.zzq()) {
            if (!(zzidlVar instanceof zzigq)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzidlVar.getClass())));
            }
            zzigq zzigqVar = (zzigq) zzidlVar;
            zzb(zzigqVar.zzo(), arrayDeque);
            zzb(zzigqVar.zzF(), arrayDeque);
            return;
        }
        int iZzc = zzc(zzidlVar.zzb(), arrayDeque);
        int iZzn = zzigq.zzn(iZzc + 1);
        if (arrayDeque.isEmpty() || ((zzidl) arrayDeque.peek()).zzb() >= iZzn) {
            arrayDeque.push(zzidlVar);
            return;
        }
        int iZzn2 = zzigq.zzn(iZzc);
        zzidl zzigqVar2 = (zzidl) arrayDeque.pop();
        while (true) {
            bArr = null;
            if (arrayDeque.isEmpty() || ((zzidl) arrayDeque.peek()).zzb() >= iZzn2) {
                break;
            } else {
                zzigqVar2 = new zzigq((zzidl) arrayDeque.pop(), zzigqVar2, bArr);
            }
        }
        zzigq zzigqVar3 = new zzigq(zzigqVar2, zzidlVar, bArr);
        while (!arrayDeque.isEmpty()) {
            if (((zzidl) arrayDeque.peek()).zzb() >= zzigq.zzn(zzc(zzigqVar3.zzb(), arrayDeque) + 1)) {
                break;
            } else {
                zzigqVar3 = new zzigq((zzidl) arrayDeque.pop(), zzigqVar3, bArr);
            }
        }
        arrayDeque.push(zzigqVar3);
    }

    private static final int zzc(int i5, ArrayDeque arrayDeque) {
        int iBinarySearch = Arrays.binarySearch(zzigq.zzb, i5);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }
}
