package defpackage;

/* loaded from: classes3.dex */
public final class ahlj {
    private ahlj() {
    }

    public final ahlk decode(Integer num, Integer num2) {
        if (num2 != null) {
            return new ahlk(num2.intValue() & 255, (num2.intValue() >> 8) & 255, (num2.intValue() >> 16) & 255);
        }
        if (num == null) {
            return ahlk.INFINITY;
        }
        return new ahlk(num.intValue() & 7, (num.intValue() >> 3) & 15, (num.intValue() >> 7) & 127);
    }

    public /* synthetic */ ahlj(afeu afeuVar) {
        this();
    }
}
