package android.support.v7.widget;

import android.graphics.Typeface;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bg {

    /* renamed from: a, reason: collision with root package name */
    private final Typeface f1129a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1130b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1131c;

    bg(Typeface typeface, String str, int i2) {
        this.f1129a = typeface;
        this.f1130b = str;
        this.f1131c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return this.f1131c == bgVar.f1131c && Objects.equals(this.f1129a, bgVar.f1129a) && Objects.equals(this.f1130b, bgVar.f1130b);
    }

    public final int hashCode() {
        return Objects.hash(this.f1129a, this.f1130b, Integer.valueOf(this.f1131c));
    }
}
