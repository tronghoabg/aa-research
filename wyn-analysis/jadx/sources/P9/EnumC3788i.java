package p9;

import com.unity3d.services.ads.gmascar.utils.ScarConstants;

/* renamed from: p9.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3788i {
    LESS_THAN("<"),
    LESS_THAN_OR_EQUAL("<="),
    EQUAL("=="),
    NOT_EQUAL("!="),
    GREATER_THAN(">"),
    GREATER_THAN_OR_EQUAL(">="),
    ARRAY_CONTAINS("array_contains"),
    ARRAY_CONTAINS_ANY("array_contains_any"),
    IN(ScarConstants.IN_SIGNAL_KEY),
    NOT_IN("not_in");


    /* renamed from: a, reason: collision with root package name */
    public final String f43370a;

    EnumC3788i(String str) {
        this.f43370a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f43370a;
    }
}
