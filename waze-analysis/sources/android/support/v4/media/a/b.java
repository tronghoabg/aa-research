package android.support.v4.media.a;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.cy;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class b {
    static /* bridge */ /* synthetic */ Object a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final cy b(int i2) {
        if (i2 == 0) {
            return cy.f304b;
        }
        if (i2 == 4) {
            return cy.f306d;
        }
        if (i2 == 8) {
            return cy.f305c;
        }
        throw new IllegalArgumentException("Unknown visibility " + i2);
    }

    public static final cy c(View view) {
        h.g.b.x.f(view, "<this>");
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? cy.f306d : b(view.getVisibility());
    }
}
