package com.google.android.libraries.phenotype.client.stable;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class i implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f6128a = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "c");

    /* renamed from: b, reason: collision with root package name */
    private final String f6129b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f6130c;

    /* synthetic */ i(String str, byte[] bArr) {
        this.f6129b = str;
        this.f6130c = bArr;
    }

    static /* bridge */ /* synthetic */ void b(i iVar, byte[] bArr) {
        Object obj;
        byte[][] bArr2;
        int i2 = 0;
        do {
            obj = iVar.f6130c;
            if (!(obj instanceof byte[])) {
                byte[][] bArr3 = (byte[][]) obj;
                while (true) {
                    int length = bArr3.length;
                    if (i2 >= length) {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr3, length + 1);
                        bArr2[length] = bArr;
                        break;
                    } else if (Arrays.equals(bArr, bArr3[i2])) {
                        return;
                    } else {
                        i2++;
                    }
                }
            } else {
                byte[] bArr4 = (byte[]) obj;
                if (Arrays.equals(bArr, bArr4)) {
                    return;
                }
                i2 = 1;
                bArr2 = new byte[][]{bArr4, bArr};
            }
        } while (!a.a.d(f6128a, iVar, obj, bArr2));
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f6129b.compareTo((String) obj);
    }
}
