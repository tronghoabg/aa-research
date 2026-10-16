package i0;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2824b {

    /* renamed from: a, reason: collision with root package name */
    public final String f36589a;

    /* renamed from: b, reason: collision with root package name */
    public final float f36590b;

    /* renamed from: c, reason: collision with root package name */
    public final float f36591c;

    /* renamed from: d, reason: collision with root package name */
    public final float f36592d;

    /* renamed from: e, reason: collision with root package name */
    public final float f36593e;

    /* renamed from: f, reason: collision with root package name */
    public final float f36594f;

    /* renamed from: g, reason: collision with root package name */
    public final float f36595g;

    /* renamed from: h, reason: collision with root package name */
    public final float f36596h;

    /* renamed from: i, reason: collision with root package name */
    public final List f36597i;

    /* renamed from: j, reason: collision with root package name */
    public final List f36598j;

    public C2824b(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List clipPathData, int i5) {
        str = (i5 & 1) != 0 ? "" : str;
        f10 = (i5 & 2) != 0 ? 0.0f : f10;
        f11 = (i5 & 4) != 0 ? 0.0f : f11;
        f12 = (i5 & 8) != 0 ? 0.0f : f12;
        f13 = (i5 & 16) != 0 ? 1.0f : f13;
        f14 = (i5 & 32) != 0 ? 1.0f : f14;
        f15 = (i5 & 64) != 0 ? 0.0f : f15;
        f16 = (i5 & 128) != 0 ? 0.0f : f16;
        if ((i5 & 256) != 0) {
            int i10 = I.f36530a;
            clipPathData = ff.v.f35432a;
        }
        ArrayList arrayList = new ArrayList();
        AbstractC3340k.e(clipPathData, "clipPathData");
        this.f36589a = str;
        this.f36590b = f10;
        this.f36591c = f11;
        this.f36592d = f12;
        this.f36593e = f13;
        this.f36594f = f14;
        this.f36595g = f15;
        this.f36596h = f16;
        this.f36597i = clipPathData;
        this.f36598j = arrayList;
    }
}
