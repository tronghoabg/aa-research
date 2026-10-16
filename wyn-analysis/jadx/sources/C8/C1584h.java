package c8;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: c8.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1584h implements InterfaceC1579c {

    /* renamed from: a, reason: collision with root package name */
    public final float f19750a;

    public C1584h(float f10) {
        this.f19750a = f10;
    }

    @Override // c8.InterfaceC1579c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f19750a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1584h) && this.f19750a == ((C1584h) obj).f19750a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f19750a)});
    }
}
