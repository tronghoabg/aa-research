package defpackage;

/* loaded from: classes3.dex */
public enum yzq implements abnz {
    UNKNOWN_EXTRA(0),
    CALENDAR_ITEM_SOURCE_GSA_ACCOUNT_CAL_SYNC(1),
    CALENDAR_ITEM_SOURCE_NON_GSA_ACCOUNT_CAL_SYNC(2),
    CALENDAR_ITEM_SOURCE_CLOUD(3);

    public final int e;

    yzq(int i) {
        this.e = i;
    }

    @Override // defpackage.abnz
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
