package i.b;

import com.google.v.eg;
import com.google.v.eh;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public enum g implements eg {
    UNDEFINED(0),
    PERSONAL_AND_CALENDAR(1),
    FAVORITES(2),
    DRIVE_AND_USAGE(3),
    CARPOOL(4),
    OTHER(5),
    CONTRIBUTION(6),
    CARPOOL_COUPON(7),
    CARPOOL_CREDIT(8),
    CARPOOL_BONUS(9),
    CARPOOL_REFERRAL(10),
    CARPOOL_INVOICE(11),
    CARPOOL_PAYMENT(12),
    CARPOOL_PAYMENT_ACCOUNT(13),
    CARPOOL_REVIEW(14),
    CARPOOL_REPORT(15),
    CARPOOL_ITINERARY(16),
    CARPOOL_OFFER(17),
    CARPOOL_CARPOOL(18),
    CARPOOL_MESSAGES(19),
    CARPOOL_PREFERENCES(21),
    PLACES_PHOTOS(20),
    SOCIAL(22),
    CONTRIBUTION_FEEDBACK(23);

    private static final eh y = new f(0);
    private final int A;

    g(int i2) {
        this.A = i2;
    }

    public static eh a() {
        return y;
    }

    @Override // com.google.v.eg
    public final int getNumber() {
        return this.A;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.A);
    }
}
