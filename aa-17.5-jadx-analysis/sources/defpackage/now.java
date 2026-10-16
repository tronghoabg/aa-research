package defpackage;

/* loaded from: classes2.dex */
public final class now {
    public final npw a;
    public final npw b;
    private final Integer[] c;
    private Float d;
    private Float e;

    public now(Integer[] numArr) {
        this.c = numArr;
        yph yphVar = npc.c;
        yphVar.l().y("Creating temperature config with values %s", numArr);
        if (numArr.length == 8) {
            int iIntValue = numArr[6].intValue();
            this.d = iIntValue > 0 ? Float.valueOf(iIntValue) : null;
            int iIntValue2 = numArr[7].intValue();
            this.e = iIntValue2 > 0 ? Float.valueOf(iIntValue2) : null;
        } else {
            ((ype) yphVar.h()).u("Missing lo/hi values in temperature config, assuming lo and hi are not supported");
        }
        this.a = new npw(numArr[0].intValue() / 10.0f, numArr[1].intValue() / 10.0f, numArr[2].intValue() / 10.0f, this.d, this.e);
        this.b = new npw(numArr[3].intValue() / 10.0f, numArr[4].intValue() / 10.0f, numArr[5].intValue() / 10.0f, this.d, this.e);
    }
}
