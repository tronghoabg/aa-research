package defpackage;

/* loaded from: classes3.dex */
public final class agpl {
    private final int bitWidth;
    private final int offset;
    private final int value;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agpl(ahkz<?> ahkzVar, int i) {
        this(ahkzVar.offset, ahkzVar.bitWidth, i);
        ahkzVar.getClass();
    }

    public final int getBitWidth$org_jetbrains_kotlin_kotlin_metadata() {
        return this.bitWidth;
    }

    public final int getOffset$org_jetbrains_kotlin_kotlin_metadata() {
        return this.offset;
    }

    public final int getValue$org_jetbrains_kotlin_kotlin_metadata() {
        return this.value;
    }

    public final boolean invoke(int i) {
        return ((i >>> this.offset) & ((1 << this.bitWidth) + (-1))) == this.value;
    }

    public final int plus$org_jetbrains_kotlin_kotlin_metadata(int i) {
        int i2 = 1 << this.bitWidth;
        int i3 = this.value;
        int i4 = this.offset;
        return (i & (~((i2 - 1) << i4))) + (i3 << i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agpl(ahkx ahkxVar) {
        this(ahkxVar, 1);
        ahkxVar.getClass();
    }

    public agpl(int i, int i2, int i3) {
        this.offset = i;
        this.bitWidth = i2;
        this.value = i3;
    }
}
