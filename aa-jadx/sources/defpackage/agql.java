package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agql {
    private final int bitWidth;
    private final int offset;
    private final int value;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public agql(defpackage.ahlz<?> ahlzVar, int i) {
        this(ahlzVar.offset, ahlzVar.bitWidth, i);
        ahlzVar.getClass();
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
    public agql(defpackage.ahlx ahlxVar) {
        this(ahlxVar, 1);
        ahlxVar.getClass();
    }

    public agql(int i, int i2, int i3) {
        this.offset = i;
        this.bitWidth = i2;
        this.value = i3;
    }
}
