package defpackage;

import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;
import java.util.BitSet;

/* loaded from: classes3.dex */
final class uwh {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/renderer/TextureAtlasAllocatorManager");
    public final usp b;
    public final int c;
    public final int d;
    public int e = 2048;
    private final int f;

    public uwh(int i, int i2, int i3, int i4) {
        this.b = new usp((int) Math.floor(i / i3), (int) Math.floor(i2 / i4));
        this.c = i3;
        this.d = i4;
        this.f = i;
    }

    @ResultIgnorabilityUnspecified
    public final int a(int i, int i2) {
        vaq.d();
        if (i <= 0 || i > this.f) {
            ((ynz) ((ynz) a.g()).ai(9694)).u("allocateBlock - Invalid blockWidth.");
            return -1;
        }
        if (i2 <= 0) {
            ((ynz) ((ynz) a.g()).ai(9698)).u("allocateBlock - Invalid blockHeight.");
            return -1;
        }
        int iCeil = (int) Math.ceil(i / this.c);
        double d = this.d;
        int iCeil2 = (int) Math.ceil(i2 / d);
        usp uspVar = this.b;
        int iA = uspVar.a(iCeil, iCeil2);
        if (iA != -1) {
            return iA;
        }
        int iF = f() + 256;
        if (iF > this.e) {
            ((ynz) ((ynz) a.g()).ai(9697)).u("allocateBlock - Texture can't be extended any further");
            return -1;
        }
        int iFloor = ((int) Math.floor(iF / d)) - uspVar.b;
        woy.Z(iFloor > 0);
        int i3 = uspVar.b;
        int i4 = iFloor + i3;
        BitSet bitSet = new BitSet(i4);
        bitSet.or(uspVar.c);
        uspVar.c = bitSet;
        BitSet bitSet2 = new BitSet(uspVar.a * i4);
        bitSet2.or(uspVar.d);
        uspVar.d = bitSet2;
        uspVar.j = Arrays.copyOf(uspVar.j, i4);
        Arrays.fill(uspVar.j, i3, i4, -1);
        uspVar.b = i4;
        int iA2 = uspVar.a(iCeil, iCeil2);
        if (iA2 != -1) {
            return iA2;
        }
        ((ynz) ((ynz) a.g()).ai(9695)).u("allocateBlock - Allocation still failed after resize.");
        return -1;
    }

    public final int b() {
        return this.b.m;
    }

    public final int c() {
        return this.b.b * this.d;
    }

    public final int d(int i) {
        woy.Z(i >= 0);
        return this.b.e(i) * this.c;
    }

    public final int e(int i) {
        woy.Z(i >= 0);
        return this.b.f(i) * this.d;
    }

    public final int f() {
        return ((int) Math.ceil(c() / 256.0d)) * 256;
    }
}
