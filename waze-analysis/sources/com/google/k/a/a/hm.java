package com.google.k.a.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public enum hm implements com.google.v.eg {
    CTA_TYPE_UNSPECIFIED(0),
    CTA_TYPE_BOOK(1),
    CTA_TYPE_BUY(2),
    CTA_TYPE_ORDER_ONLINE(3),
    CTA_TYPE_LEARN_MORE(4),
    CTA_TYPE_SIGN_UP(5),
    CTA_TYPE_GET_OFFER(6);


    /* renamed from: i, reason: collision with root package name */
    private final int f11938i;

    hm(int i2) {
        this.f11938i = i2;
    }

    public static hm a(int i2) {
        switch (i2) {
            case 0:
                return CTA_TYPE_UNSPECIFIED;
            case 1:
                return CTA_TYPE_BOOK;
            case 2:
                return CTA_TYPE_BUY;
            case 3:
                return CTA_TYPE_ORDER_ONLINE;
            case 4:
                return CTA_TYPE_LEARN_MORE;
            case 5:
                return CTA_TYPE_SIGN_UP;
            case 6:
                return CTA_TYPE_GET_OFFER;
            default:
                return null;
        }
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.f11938i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f11938i);
    }
}
