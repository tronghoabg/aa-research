package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class u implements h.g.a.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18694a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f18695b;

    public /* synthetic */ u(int i2, int i3) {
        this.f18695b = i3;
        this.f18694a = i2;
    }

    @Override // h.g.a.l
    public final Object invoke(Object obj) {
        switch (this.f18695b) {
            case 0:
                ((Integer) obj).intValue();
                return Integer.valueOf(this.f18694a);
            case 1:
                ((Integer) obj).intValue();
                return Integer.valueOf(this.f18694a);
            case 2:
                ((Integer) obj).intValue();
                return Integer.valueOf(this.f18694a);
            case 3:
                ((Integer) obj).intValue();
                return Integer.valueOf(this.f18694a);
            case 4:
                return Integer.valueOf((this.f18694a / 2) - ((Integer) obj).intValue());
            case 5:
                ((Integer) obj).intValue();
                return Integer.valueOf(-this.f18694a);
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                int i2 = com.waze.main_screen.t.al.f27484a;
                return Integer.valueOf((this.f18694a / 2) - iIntValue);
            case 7:
                ((Integer) obj).intValue();
                int i3 = com.waze.main_screen.t.al.f27484a;
                return Integer.valueOf(-this.f18694a);
            case 8:
                ((Integer) obj).intValue();
                return Integer.valueOf(this.f18694a);
            case 9:
                ((Integer) obj).intValue();
                return Integer.valueOf(this.f18694a);
            case 10:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Collection doesn't contain element at index " + this.f18694a + ".");
            default:
                ((Integer) obj).intValue();
                throw new IndexOutOfBoundsException("Sequence doesn't contain element at index " + this.f18694a + ".");
        }
    }
}
