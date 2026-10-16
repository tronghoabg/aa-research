package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum zav implements defpackage.abpb {
    UNKNOWN_EXTRA(0),
    CALENDAR_ITEM_SOURCE_GSA_ACCOUNT_CAL_SYNC(1),
    CALENDAR_ITEM_SOURCE_NON_GSA_ACCOUNT_CAL_SYNC(2),
    CALENDAR_ITEM_SOURCE_CLOUD(3);

    public final int e;

    zav(int i) {
        this.e = i;
    }

    @Override // defpackage.abpb
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return java.lang.Integer.toString(this.e);
    }
}
