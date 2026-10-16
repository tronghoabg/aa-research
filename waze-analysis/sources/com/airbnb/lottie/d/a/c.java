package com.airbnb.lottie.d.a;

import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c extends n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List list) {
        super(list);
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.airbnb.lottie.h.a aVarK = (com.airbnb.lottie.h.a) list.get(i2);
            com.airbnb.lottie.d.b.d dVar = (com.airbnb.lottie.d.b.d) aVarK.f2433a;
            com.airbnb.lottie.d.b.d dVar2 = (com.airbnb.lottie.d.b.d) aVarK.f2434b;
            if (dVar != null && dVar2 != null && dVar.d().length != dVar2.d().length) {
                float[] fArrD = dVar.d();
                float[] fArrD2 = dVar2.d();
                int length = fArrD.length;
                int length2 = fArrD2.length;
                int i3 = length + length2;
                float[] fArr = new float[i3];
                System.arraycopy(fArrD, 0, fArr, 0, length);
                System.arraycopy(fArrD2, 0, fArr, length, length2);
                Arrays.sort(fArr);
                float f2 = Float.NaN;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    float f3 = fArr[i5];
                    if (f3 != f2) {
                        fArr[i4] = f3;
                        i4++;
                        f2 = fArr[i5];
                    }
                }
                float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, i4);
                aVarK = com.airbnb.lottie.h.a.k(dVar.b(fArrCopyOfRange), dVar2.b(fArrCopyOfRange));
            }
            list.set(i2, aVarK);
        }
    }

    @Override // com.airbnb.lottie.d.a.m
    public final com.airbnb.lottie.a.b.f a() {
        return new com.airbnb.lottie.a.b.k(this.f2116a);
    }
}
