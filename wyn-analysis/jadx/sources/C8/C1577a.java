package c8;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: c8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1577a implements InterfaceC1579c {

    /* renamed from: a, reason: collision with root package name */
    public final float f19709a;

    public C1577a(float f10) {
        this.f19709a = f10;
    }

    @Override // c8.InterfaceC1579c
    public final float a(RectF rectF) {
        return this.f19709a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1577a) && this.f19709a == ((C1577a) obj).f19709a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19709a)});
    }
}
